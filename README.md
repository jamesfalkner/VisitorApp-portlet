# Liferay 6.2 ADT Example App

This demo app consists of two portlets based on [Liferay
Portal](http://www.liferay.com/community/liferay-projects/liferay-portal):
* VisitorAppAdmin - Contains administrative interfaces for add/edit/delete of StoreLocations and Customers
* VisitorApp - A default portlet to display individual vists to a store location

The project also contains:
* ServiceBuilder definitions for the Customer, StoreLocation, and CustomerStoreVisit entities, along with a few custom Finders
* Liferay metadata (portlet.xml, etc) for the above portlets, including
** Configuration and View JSPs for VisitorApp to expose ADT selection
** View JSPs for the VisitorAppAdmin portlet
** ADT Configuration for the VisitorApp portlet (including permissions, a TemplateDisplayHandler, and code for responding to ajax requests from the portlet to feed data to it)
** Several sample ADTs for the VisitorApp portlet and other Liferay portlets

## Building and deploying the Demo

First, you must have Liferay 6.2 deployed and a Maven profile that points to it.
You must also have Maven installed. To build and use:

1. Command line:

Fork this repository to your local machine
mvn -P(profile-name) liferay:build-service package liferay:deploy

2. Eclipse:
Import this as a new Maven project, and right-click on the project and select *Liferay->Maven->liferay:build-service* followed by *Liferay->Maven->package* and then *Liferay->Maven->liferay:deploy*.

Once deployed, you should see
a message at the end of the Liferay console `... [PortletHotDeployListener:495] 2 portlets for VisitorApp-portlet-0.0.1-SNAPSHOT are available for use`. 


## Usage

Once you build and deploy this project, you will have two new portlets -- add them all to a page, and click *Generate Visits* to generate some demo data within the app. Then, play with the portlets by assigning different ADTs to use to render them.


## License

This software, *Visitor App ADT Demo*, is free software ("Licensed
Software"); you can redistribute it and/or modify it under the terms of the [GNU
Lesser General Public License](http://www.gnu.org/licenses/lgpl-2.1.html) as
published by the Free Software Foundation; either version 2.1 of the License, or
(at your option) any later version.

This library is distributed in the hope that it will be useful, but WITHOUT ANY
WARRANTY; including but not limited to, the implied warranty of MERCHANTABILITY,
NONINFRINGEMENT, or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General
Public License for more details.

You should have received a copy of the [GNU Lesser General Public
License](http://www.gnu.org/licenses/lgpl-2.1.html) along with this library; if
not, write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth
Floor, Boston, MA 02110-1301 USA