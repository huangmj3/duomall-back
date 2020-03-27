use duomall;
create table if not exists cart
(
    `id`           varchar(36) not null comment '主键id',
    `uid`          varchar(36) not null comment '用户id，关联user表',
    `goods_id`     varchar(36) not null comment '商品id,关联goods表',
    `goods_num`    int         not null comment '商品数据',
    `status`       tinyint(4)  not null comment '0-关闭，1-正常，2-禁用',
    `gmt_create`   timestamp default current_timestamp comment '创建时间',
    `gmt_modified` timestamp default current_timestamp on update current_timestamp comment '修改时间',
    `version`      bigint(20) comment '版本号',
    primary key (`id`),
    key `idx_id_ctime` (`id`, `gmt_create`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 0
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='购物车信息表';
