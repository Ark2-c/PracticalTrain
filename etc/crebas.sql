/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/7/15 18:18:40                           */
/*==============================================================*/


drop table if exists admin;

drop table if exists citizen;

drop table if exists citizen_city;

drop table if exists city;

drop table if exists sys_province_admin_map;

/*==============================================================*/
/* Table: admin                                                 */
/*==============================================================*/
create table admin
(
   id                   int not null,
   username             national varchar(255),
   passwd               national varchar(255),
   primary key (id)
);

alter table admin comment '用户';

/*==============================================================*/
/* Table: citizen                                               */
/*==============================================================*/
create table citizen
(
   idCard               national varchar(18) not null,
   name                 national varchar,
   phone                national varchar(11),
   sex                  int,
   primary key (idCard)
);

/*==============================================================*/
/* Table: citizen_city                                          */
/*==============================================================*/
create table citizen_city
(
   cityID               int not null,
   idCard               national varchar(18) not null,
   primary key (cityID, idCard)
);

/*==============================================================*/
/* Table: city                                                  */
/*==============================================================*/
create table city
(
   cityID               int not null,
   name                 national varchar(255),
   primary key (cityID)
);

/*==============================================================*/
/* Table: sys_province_admin_map                                */
/*==============================================================*/
create table sys_province_admin_map
(
   id                   int not null,
   cityID               int not null,
   primary key (id, cityID)
);

alter table citizen_city add constraint FK_citizen_city foreign key (cityID)
      references city (cityID) on delete restrict on update restrict;

alter table citizen_city add constraint FK_citizen_city2 foreign key (idCard)
      references citizen (idCard) on delete restrict on update restrict;

alter table sys_province_admin_map add constraint FK_sys_province_admin_map foreign key (id)
      references admin (id) on delete restrict on update restrict;

alter table sys_province_admin_map add constraint FK_sys_province_admin_map2 foreign key (cityID)
      references city (cityID) on delete restrict on update restrict;

