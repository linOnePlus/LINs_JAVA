drop table if exists user;

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   int not null auto_increment,
   username             varchar(255),
   password             varchar(255),
   type                 int comment '类型为1为普通管理，类型为0为超级管理员',
   primary key (id)
);


drop table if exists book;

/*==============================================================*/
/* Table: book                                                  */
/*==============================================================*/
create table book
(
   id                   int not null auto_increment,
   code                 varchar(255),
   name                 varchar(255),
   type                 varchar(255),
   author               varchar(255),
   press                varchar(255),
   page                 varchar(255),
   price                varchar(255),
   primary key (id)
);


drop table if exists borrow;

/*==============================================================*/
/* Table: borrow                                                */
/*==============================================================*/
create table borrow
(
   id                   int not null auto_increment,
   book_id              int,
   reader_id            int,
   time                 TIMESTAMP default CURRENT_TIMESTAMP,
   primary key (id)
);



drop table if exists reader;

/*==============================================================*/
/* Table: reader                                                */
/*==============================================================*/
create table reader
(
   id                   int not null auto_increment,
   username             varchar(255),
   password             varchar(255),
   name                 varchar(255),
   num                  int,
   primary key (id)
);




 
INSERT INTO USER VALUES('1','admin','admin','0');  

INSERT INTO `user` VALUES (2, '1', '1', 1);
INSERT INTO `user` VALUES (3, '1', '1', 1);
INSERT INTO `user` VALUES (4, '11', '1', 1);
INSERT INTO `user` VALUES (5, '111', '1', 1);


INSERT INTO `book` VALUES ('7', '123', '红楼梦', '文学类', '曹雪芹', '中国出版社', '50', '300');
INSERT INTO `book` VALUES ('9', '565655', '我的世界', '游戏', '我', '55555', '15', '0');
INSERT INTO `book` VALUES ('10', '1545688997', '朝花夕拾', '文学类', '鲁迅', '东方出版社', '100', '25');


 


