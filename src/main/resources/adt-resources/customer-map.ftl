<#assign pns = themeDisplay.portletDisplay.namespace />
<#assign liferay_portlet = taglibLiferayHash["/WEB-INF/tld/liferay-portlet.tld"] />

<link href="//code.google.com/apis/maps/documentation/javascript/examples/standard.css" rel="stylesheet"
      type="text/css"/>

<script type="text/javascript" src="//maps.google.com/maps/api/js?sensor=false"></script>
<script src="https://code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>


<div id="${pns}map" style="width: 100%; height: 600px;"><!-- --></div>

<script type="text/javascript">

	var ${pns}googleMap = new google.maps.Map(
	    document.getElementById("${pns}map"),
	    {
		    center: new google.maps.LatLng(48.8567,2.3508),
        mapTypeControl: true,
		    mapTypeId: google.maps.MapTypeId.ROADMAP,
		    navigationControl: true,
		    scaleControl: true,
		    zoomControls: true,
		    streetViewControl: false,
		    zoom: 6
	    }
	);

  // visits: [ {name: "name", address: "address", visits: [ {customerName:"name", customerEmail: "email", customerPic: "url", visitCount:234, lastVisitDate: "date"}, ... ]}, ... ]
  // var ${pns}visitData = [];


	var ${pns}geocodeCache = [];

	function ${pns}checkCache(addr) {
		for (var i = 0; i < ${pns}geocodeCache.length; i++) {
			if (${pns}geocodeCache[i][0] == addr) {
				return ${pns}geocodeCache[i][1];
			}
		}
		return null;
	}

	function ${pns}addCache(addr, loc) {
          ${pns}geocodeCache.push([addr, loc]);

	}
	google.maps.event.addDomListener(window, "load", function() {

    ${pns}auiXmlHttpRequest('<@liferay_portlet.resourceURL />', null, function(data) {
      ${pns}drawAllStores(data);
    }, function(err) {
      alert(err);
    });
  });

	function ${pns}openInfoWindow(title, position, visits) {
		var infoWindow = new google.maps.InfoWindow({
			maxWidth: 400
		});

		var marker = new google.maps.Marker({
			position: position,
			animation: google.maps.Animation.DROP,
			map: ${pns}googleMap,
			title: title,
			draggable: true
		});

		marker.setIcon("//www.google.com/intl/en_us/mapfiles/ms/micons/blue-dot.png");

		google.maps.event.addListener(marker, 'click', function () {
      var container = document.createElement('div');
      ${pns}makeGraph(title, visits, container);
      infoWindow.setContent(container);
			infoWindow.open(${pns}googleMap, marker);
		});
	}

	function ${pns}drawStoreLoc(storeName, storeAddress, visits) {
		var geocoder = new google.maps.Geocoder();
		var loc = ${pns}checkCache(storeAddress);
		if (!loc) {
            console.log("geocoding " + storeAddress);
			geocoder.geocode(
			    {"address": storeAddress},
			    function (results, status) {
				    if (status == google.maps.GeocoderStatus.OK) {
                    console.log("geocode success: " + JSON.stringify(results[0].geometry.location));
					    ${pns}addCache(storeAddress, results[0].geometry.location);

					    setTimeout(function () {
                ${pns}openInfoWindow(
                  storeName,
                  results[0].geometry.location,
                  visits);
					    }, Math.random() * 1000);
				    } else {
                    console.log("geocode failed!");
				    }
			    }
			);
		} else {
			setTimeout(function () {
          ${pns}openInfoWindow(
	          storeName,
			      loc,
			      visits);
			}, Math.random() * 1000);

		}
	}

	function ${pns}drawAllStores(data) {

	  // [ {name: "name", address: "address", visits: [ {customerName:"name", customerEmail: "email", customerPic: "url", visitCount:234, lastVisitDate: "date"}, ... ]}, ... ]

    data.forEach(function(el, idx) {
      var storeName = el.name;
      var storeAddress = el.address;
      var allVisits = el.visits;
      ${pns}drawStoreLocs(storeName, storeAddress, allVisits, idx * 100);
    });
	}

	function ${pns}drawStoreLocs(storeName, storeAddress, visits, wait) {
		setTimeout(function () {
      ${pns}drawStoreLoc(storeName, storeAddress, visits);
		}, wait);
	}

  function ${pns}auiXmlHttpRequest(url, data, onSuccess, onError) {

	  AUI().use(
	      "aui-base", "aui-io-plugin", "aui-io-request",
	      function (A) {
		      A.io.request(
			  url,
			  {
				  data: data ? data : "",
				  dataType: "json",
				  on: {
					  success: function () {
						  var responseData = this.get("responseData");
              onSuccess(responseData);
					  },
					  failure: function () {
						  onError("Unable to retrieve results");
					  }
				  }
			  }
		      );
	      }
	  );
  }

  // [ {name: "name", address: "address", visits: [ {customerName:"name", customerEmail: "email", customerPic: "url", visitCount:234, lastVisitDate: "date"}, ... ]}, ... ]

  function ${pns}makeGraph(storeName, allVisits, containerDiv) {

    var sorted = allVisits.sort(function(e1, e2) {
      return (e2.visitCount - e1.visitCount);
    }).splice(0, 20);

	  var chart = new Highcharts.Chart({
		  chart: {
			  renderTo: containerDiv,
			  type: 'column',
			  margin: [ 50, 50, 100, 80]
		  },
		  title: {
			  text: storeName
		  },
		  xAxis: {
			  categories: sorted.map(function (el) {
				  return el.customerName
			  }),
			  labels: {
				  rotation: -45,
				  align: 'right',
				  style: {
					  fontSize: '8px',
					  fontFamily: 'Verdana, sans-serif'
				  }
			  }
		  },
		  yAxis: {
			  min: 0,
			  title: {
				  text: 'Visits'
			  }
		  },
		  legend: {
			  enabled: false
		  },
	    plotOptions: {
		    series: {
			    cursor: 'pointer',
			    point: {
				    events: {
					    click: function() {
						     location.href = this.url;
					    }
				    }
			    }
		    }
	    },

	    series: [
			  {
				  name: 'Visits this Year',
				  data: sorted.map(function (el) {
					        return {
                    name: el.customerName,
                          y: el.visitCount,
                          url: 'mailto:' + encodeURIComponent(el.customerEmail) + '?subject=Thanks%20for%20your%20support!&body=Just%20wanted%20to%20drop%20you%20a%20note%20and%20thank%20you%20for%20being%20a%20loyal%20customer%20of%20Acme%20SA!%20We%20will%20never%20forget%20you.'
                  }
				        }),
				  dataLabels: {
					  enabled: true,
					  rotation: -90,
					  color: '#FFFFFF',
					  align: 'right',
					  x: 4,
					  y: 10,
					  style: {
						  fontSize: '13px',
						  fontFamily: 'Verdana, sans-serif',
						  textShadow: '0 0 3px black'
					  }
				  }
			  }
		  ]
	  }, function () {
	  });
  }
</script>