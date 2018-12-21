CREATE TABLE role_mst(
	  roleid bigint not null PRIMARY KEY,
    name varchar(100) null
);

CREATE TABLE use_mst(
	  userid bigint not null PRIMARY KEY AUTO_INCREMENT,
    name varchar(255) null,
    password varchar(255) null,
    fullname varchar(300) null,
    createdtime timestamp null,
    roleid bigint not null,
    FOREIGN KEY (roleid) REFERENCES role_mst(roleid)
);

create table listengui
(
  listenguidelineid bigint       not null primary key auto_increment,
  title             varchar(255) null,
  image             varchar(255) null,
  content           text         null,
  createdtime       timestamp    null,
  modtime           timestamp    null

);

create table comment
(
  commentid         bigint    not null primary key auto_increment,
  content           text      null,
  userid            bigint    null,
  listenguidelineid bigint    null,
  createdtime       timestamp null,
  FOREIGN KEY (userid) REFERENCES use_mst (userid),
  FOREIGN KEY (listenguidelineid) REFERENCES listengui (listenguidelineid)
);
