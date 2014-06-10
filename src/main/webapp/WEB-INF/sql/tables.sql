create table VisitorApp_Customer (
	customerId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	picture VARCHAR(75) null,
	email VARCHAR(75) null
);

create table VisitorApp_CustomerStoreVisit (
	customerstorevisitId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	customerId LONG,
	storelocationId LONG
);

create table VisitorApp_StoreLocation (
	storelocationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	address VARCHAR(75) null
);