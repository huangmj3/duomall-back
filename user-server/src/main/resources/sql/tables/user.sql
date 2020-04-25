# 创建用户表
use duomall;
create table if not exists user
(
    `id`                  varchar(36) not null comment '主键id',
    `cellphone`           varchar(11) not null comment '手机号',
    `email`               varchar(36) comment '邮箱',
    `Login_password`      varchar(16) not null comment '登录密码',
    `payment_password`    char(6)     null comment '支付密码',
    `name`                varchar(36) not null comment '昵称',
    `avatar`              varchar(255) default 'https://duomall-avatar.oss-cn-beijing.aliyuncs.com/%E9%BB%98%E8%AE%A4%E5%A4%B4%E5%83%8F.png' comment '头像',
    `sex`                 char comment '性别，1-男，2-女',
    `birthday`            date comment '生日',
    `is_product_manager`  boolean      default 0 comment '是否商品管理员，0-否，1-是',
    `is_logistic_manager` boolean      default 0 comment '是否物流管理员，0-否，1-是',
    `status`              tinyint      default 1 comment '0-关闭，1-正常，2-禁用',
    `gmt_create`          timestamp    default current_timestamp comment '创建时间',
    `gmt_modified`        timestamp    default current_timestamp on update current_timestamp comment '修改时间',
    `version`             bigint(20)   default 0 comment '版本号',
    primary key (`id`),
    key `idx_cellphone` (`cellphone`),
    key `idx_id_ctime` (`id`, `gmt_create`),
    key `idx_id_is_product_manager` (`id`, `is_product_manager`),
    key `idx_id_is_logistic_manager` (`id`, `is_logistic_manager`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 0
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='用户表';