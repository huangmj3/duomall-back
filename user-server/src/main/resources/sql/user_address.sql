use duomall;
create table if not exists user_address
(
    `id`           varchar(36) not null comment '主键id',
    `uid`          varchar(36) not null comment '用户id，关联user表',
    `zip`          int comment '邮编',
    `province`     int comment '地区表中的省份id',
    `city`         int comment '地区表中的城市id',
    `district`     int comment '地区表中的区id',
    `address`      varchar(255) comment '具体的门派号',
    `is_default`   boolean comment '是否默认',
    `status`       tinyint comment '0-关闭，1-正常，2-禁用',
    `gmt_create`   timestamp default current_timestamp comment '创建时间',
    `gmt_modified` timestamp default current_timestamp on update current_timestamp comment '修改时间',
    `version`      bigint(20) comment '版本号',
    primary key (`id`),
    key `idx_id_ctime` (`id`, `gmt_create`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 0
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='用户地址表';
