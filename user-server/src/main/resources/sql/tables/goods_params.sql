# 创建参数表
use duomall;
create table if not exists goods_params
(
    `id`           varchar(36)  not null comment '主键id',
    `goods_id`     varchar(36)  not null comment '对应商品id',
    `title`        varchar(255) not null comment '参数名称',
    `content`      varchar(255) not null comment '参数内容',
    `status`       tinyint    default 1 comment '0-关闭，1-正常，2-禁用',
    `gmt_create`   timestamp  default current_timestamp comment '创建时间',
    `gmt_modified` timestamp  default current_timestamp on update current_timestamp comment '修改时间',
    `version`      bigint(20) default 0 comment '版本号',
    primary key (`id`),
    key `idx_goodsId` (`goods_id`),
    key `idx_id_ctime` (`id`, `gmt_create`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 0
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='商品参数表';