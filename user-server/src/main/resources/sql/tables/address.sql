# 创建用户地址表
use duomall;
create table if not exists address
(
    `id`           varchar(36)              not null comment '主键id',
    `user_id`      varchar(36)              not null comment '用户id，关联user表',
    `zip`          int                      not null comment '邮编',
    `province`     varchar(255)             not null comment '省',
    `city`         varchar(255)             not null comment '市',
    `area`         varchar(255)             not null comment '区',
    `detail`       varchar(255)             not null comment '详细地址',
    `is_default`   boolean    default false not null comment '是否默认,0-不默认,1-默认',
    `status`       tinyint    default 1 comment '0-关闭，1-正常，2-禁用',
    `gmt_create`   timestamp  default current_timestamp comment '创建时间',
    `gmt_modified` timestamp  default current_timestamp on update current_timestamp comment '修改时间',
    `version`      bigint(20) default 0 comment '版本号',
    primary key (`id`),
    key `idx_userId` (`user_id`),
    key `idx_id_ctime` (`id`, `gmt_create`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 0
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='用户地址表';
