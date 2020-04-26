# 创建物流信息表
use duomall;
create table if not exists logistics
(
    `id`             varchar(36) not null comment '主键id',
    `ship_num`       varchar(36) not null comment '对应物流号',
    `uid`            varchar(36) not null comment '物流对应用户id',
    `order_id`       varchar(36) not null comment '物流对应订单id',
    `ship_time`      timestamp comment '发货时间',
    `is_receipt`     boolean     not null comment '是否已收货',
    `receipt_time`   timestamp comment '收货时间',
    `consignee_name` varchar(36) not null comment '收货人姓名',
    `address`        varchar(36) not null comment '收货地址',
    `status`         tinyint comment '0-关闭，1-正常，2-禁用',
    `gmt_create`     timestamp default current_timestamp comment '创建时间',
    `gmt_modified`   timestamp default current_timestamp on update current_timestamp comment '修改时间',
    `version`        bigint(20) comment '版本号',
    primary key (`id`),
    key `idx_id_ctime` (`id`, `gmt_create`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 0
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='物流信息表';
