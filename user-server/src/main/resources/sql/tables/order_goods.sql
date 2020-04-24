use duomall;
create table if not exists order_goods
(
    `id`           varchar(36) not null comment '主键id',
    `order_id`     varchar(36) not null comment '订单id',
    `goods_id`     varchar(36) not null comment '商品id',
    `status`       tinyint comment '0-关闭，1-正常，2-禁用',
    `gmt_create`   timestamp default current_timestamp comment ' 创建时间 ',
    `gmt_modified` timestamp default current_timestamp on update current_timestamp comment ' 修改时间 ',
    `version`      bigint(20) comment ' 版本号 ',
    primary key (`id`),
    key `idx_id_ctime` (`id`, `gmt_create`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 0
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT =' 订单商品映射表 ';
