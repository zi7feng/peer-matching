create database if not exists local;

use local;

drop table if exists user;

create table user
(
    username     varchar(256)                       null comment 'username',
    id           bigint auto_increment comment 'id'
        primary key,
    userAccount  varchar(256)                       null comment 'user account',
    avatarUrl    varchar(1024)                      null comment 'user avatar url',
    gender       varchar(512)                       null comment 'gender',
    profile      varchar(512)                       null comment 'profile',
    userPassword varchar(512)                       not null comment 'password',
    phone        varchar(128)                       null comment 'phone number',
    email        varchar(512)                       null comment 'email',
    userStatus   int      default 0                 not null comment 'user status 0 - normal',
    createTime   datetime default CURRENT_TIMESTAMP null comment 'create time',
    updateTime   datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    isDelete     tinyint  default 0                 not null comment 'is delete?',
    userRole     int      default 0                 not null comment '用户角色 0 - 普通用户 1 - 管理员',
    inviteCode   varchar(512)                       null comment 'inviteCode',
    tags         varchar(1024)                      null comment 'tags json list'
)
    comment 'user';

drop table if exists tag;

-- auto-generated definition
create table tag
(
    id         bigint auto_increment comment 'id'
        primary key,
    tagName    varchar(256)                       null comment 'tag name',
    userId     bigint                             null comment 'user id',
    parentId   bigint                             null comment 'parent id',
    isParent   tinyint                            null comment 'is parent tag? 0: no, 1: yes',
    createTime datetime default CURRENT_TIMESTAMP null comment 'createTime',
    updateTime datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment 'updateTime',
    isDelete   tinyint  default 0                 not null comment 'is delete?',
    constraint uniidx_tagName
        unique (tagName)
)
    comment 'tag';

create index idx_userId
    on tag (userId);

# INSERT INTO local.user (username, id, userAccount, avatarUrl, gender, profile, userPassword, phone, email, userStatus, createTime, updateTime, isDelete, userRole, inviteCode, tags) VALUES ('dogYupi', 1, '123', 'https://636f-codenav-8grj8px727565176-1256524210.tcb.qcloud.la/img/logo.png', null, 'Les get Rusty!', 'xxx', '123', '456', 0, '2023-11-15 13:12:49', '2023-11-15 18:40:48', 1, 0, '1234', '["Java", "Spring", "C++", "Python"]');
# INSERT INTO local.user (username, id, userAccount, avatarUrl, gender, profile, userPassword, phone, email, userStatus, createTime, updateTime, isDelete, userRole, inviteCode, tags) VALUES ('dfsf', 2, 'bvafdv', 'https://rustacean.net/assets/rustacean-flat-happy.svg', null, 'abc', '12345678', '1234325', '2213@gmail.com', 0, '2023-11-15 13:18:05', '2023-11-15 13:18:05', 0, 0, '625454', '["Spring", "C++", "Python"]');
# INSERT INTO local.user (username, id, userAccount, avatarUrl, gender, profile, userPassword, phone, email, userStatus, createTime, updateTime, isDelete, userRole, inviteCode, tags) VALUES ('vcx', 3, 'veae', 'https://rustacean.net/assets/rustacean-flat-happy.svg', null, 'def', '12345678', '12343246', '2133@gmail.com', 0, '2023-11-15 13:18:05', '2023-11-15 13:18:05', 0, 0, '6542', '["Java", "Rust", "C++", "Python"]');
# INSERT INTO local.user (username, id, userAccount, avatarUrl, gender, profile, userPassword, phone, email, userStatus, createTime, updateTime, isDelete, userRole, inviteCode, tags) VALUES ('rewq', 4, 'vraef', 'https://rustacean.net/assets/rustacean-flat-happy.svg', null, 'Hi!', '12345678', '12343247', '213g@gmail.com', 0, '2023-11-15 13:18:05', '2023-11-15 13:18:05', 0, 0, '245423', '["Java"]');
# INSERT INTO local.user (username, id, userAccount, avatarUrl, gender, profile, userPassword, phone, email, userStatus, createTime, updateTime, isDelete, userRole, inviteCode, tags) VALUES ('jkh', 5, 'cewf', 'https://rustacean.net/assets/rustacean-flat-happy.svg', null, 'HelloWorld!', '12345678', '12343248', '21d3@gmail.com', 0, '2023-11-15 13:18:05', '2023-11-15 13:18:05', 0, 0, '62454', '["Java", "Python"]');
# INSERT INTO local.user (username, id, userAccount, avatarUrl, gender, profile, userPassword, phone, email, userStatus, createTime, updateTime, isDelete, userRole, inviteCode, tags) VALUES ('vdf', 6, 'ewcaca', 'https://rustacean.net/assets/rustacean-flat-happy.svg', null, 'fdsavcds', '12345678', '12343249', '2c13@gmail.com', 0, '2023-11-15 13:18:05', '2023-11-15 13:18:05', 0, 0, '2452', '["Spring", "C++", "Python"]');
# INSERT INTO local.user (username, id, userAccount, avatarUrl, gender, profile, userPassword, phone, email, userStatus, createTime, updateTime, isDelete, userRole, inviteCode, tags) VALUES ('iuo', 7, 'cewac', 'https://rustacean.net/assets/rustacean-flat-happy.svg', null, 'cdascv', '12345678', '12343241', '21c3@gmail.com', 0, '2023-11-15 13:18:05', '2023-11-15 13:18:05', 0, 0, '76547', '["Java", "Spring", "C++", "Python"]');
# INSERT INTO local.user (username, id, userAccount, avatarUrl, gender, profile, userPassword, phone, email, userStatus, createTime, updateTime, isDelete, userRole, inviteCode, tags) VALUES ('cwe', 8, 'cwaecawe', 'https://rustacean.net/assets/rustacean-flat-happy.svg', null, 'dvacac', '12345678', '12343324', '21sa3@gmail.com', 0, '2023-11-15 13:18:05', '2023-11-15 13:18:05', 0, 0, '1451', '["Java", "Spring", "C++", "Python"]');
# INSERT INTO local.user (username, id, userAccount, avatarUrl, gender, profile, userPassword, phone, email, userStatus, createTime, updateTime, isDelete, userRole, inviteCode, tags) VALUES ('sghf', 9, 'cewa', 'https://rustacean.net/assets/rustacean-flat-happy.svg', null, 'vberav', '12345678', '12345324', '21e13@gmail.com', 0, '2023-11-15 13:18:05', '2023-11-15 13:18:05', 0, 0, '7563', '["Java", "Spring", "C++", "Python"]');
# INSERT INTO local.user (username, id, userAccount, avatarUrl, gender, profile, userPassword, phone, email, userStatus, createTime, updateTime, isDelete, userRole, inviteCode, tags) VALUES ('trh', 10, 'cewacd', 'https://rustacean.net/assets/rustacean-flat-happy.svg', null, 'Les erdccsd Rusty!', '12345678', '12334324', '221e13@gmail.com', 0, '2023-11-15 13:18:05', '2023-11-15 13:18:05', 0, 0, '6524', '["Java", "Spring", "C++", "Python"]');
# INSERT INTO local.user (username, id, userAccount, avatarUrl, gender, profile, userPassword, phone, email, userStatus, createTime, updateTime, isDelete, userRole, inviteCode, tags) VALUES ('dogYupi', 11, '123', 'https://636f-codenav-8grj8px727565176-1256524210.tcb.qcloud.la/img/logo.png', null, null, 'xxx', '123', '456', 0, '2023-11-15 18:40:48', '2023-11-15 18:40:48', 0, 0, null, null);
# INSERT INTO local.user (username, id, userAccount, avatarUrl, gender, profile, userPassword, phone, email, userStatus, createTime, updateTime, isDelete, userRole, inviteCode, tags) VALUES ('fzq', 12, 'fzqqq', 'https://rustacean.net/assets/rustacean-flat-happy.svg', null, 'Les get Rusty!', 'b0dd3697a192885d7c055db46155b26a', '45341524', 'd3@gmail.com', 0, '2023-11-15 19:19:46', '2023-11-16 00:11:07', 0, 0, '4364', '["Java", "Spring", "C++", "Python"]');


-- Team Table
create table team
(
    id          bigint auto_increment comment 'id' primary key,
    name        varchar(256)       not null comment 'Team name',
    description varchar(1024) null comment 'description',
    maxNum      int      default 1 not null comment 'maximum member number',
    expireTime  datetime null comment 'expire time',
    userId      bigint comment 'userId（Holder id）',
    status      int      default 0 not null comment '0 - public，1 - private，2 - encrypted',
    password    varchar(512) null comment 'Team password',
    createTime  datetime default CURRENT_TIMESTAMP null comment 'create time',
    updateTime  datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    isDelete    tinyint  default 0 not null comment 'is delete?'
) comment 'Team';

-- User-Team table
create table user_team
(
    id          bigint auto_increment comment 'id'
        primary key ,
    userId      bigint comment 'User id',
    teamId      bigint comment 'Team id',
    joinTime    datetime default null comment 'Join time',
    createTime  datetime default CURRENT_TIMESTAMP null comment 'create time',
    updateTime  datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    isDelete    tinyint  default 0 not null comment 'is delete?'
) comment 'Relationship of Teams and Users'

