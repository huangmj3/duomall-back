use duomall;
create table if not exists order
(
    `id`           varchar(36)   not null comment '主键id',
    `uid`          varchar(36)   not null comment '用户id，管理user表',
    `pay_price`    double(20, 2) not null comment '实际支付价格',
    `is_pay`       boolean       not null comment '是否已支付',
    `pay_time`     timestamp comment '支付时间',
    `is_ship`      boolean       not null comment '是否已发货',
    `ship_time`    timestamp comment '发货时间',
    `ship_num`     varchar(36) comment '发货单号',
    `is_receipt`   boolean       not null comment '是否已收货',
    `receipt_time` timestamp comment '收货时间',
    `status`       tinyint comment '0-关闭，1-正常，2-禁用',
    `gmt_create`   timestamp default current_timestamp comment '创建时间',
    `gmt_modified` timestamp default current_timestamp on update current_timestamp comment '修改时间',
    `version`      bigint(20) comment '版本号',
    primary key (`id`),
    key `idx_id_ctime` (`id`, `gmt_create`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 0
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='订单信息表';
