# 创建商品概要表
use duomall;
create table if not exists goods
(
    `id`               varchar(36)  not null comment '主键id',
    `title`            varchar(36)  not null comment '商品名称',
    `shop_name`        varchar(36)  not null comment '商品所属店铺名称',
    `type`             varchar(36)  not null comment '商品类型',
    `tags`             varchar(255) default '''满69-20元'', ''关注产品★送钢化膜'', ''BIT配次日达''' comment '商品标签',
    `discount`         varchar(255) default '''满148减10'', ''满218减20'', ''满288减30''' comment '折扣',
    `price`            varchar(255) not null comment '商品价格',
    `sale`             bigint       default 0 comment '已售商品数量',
    `promotion`        varchar(255) default '''跨店满减'', ''多买优惠''' comment '促销标语',
    `params`           varchar(255) default '' comment '商品参数',
    `remark_tag_color` varchar(255) default '''blue'', ''green'', ''red'', ''yellow''' comment '评论标签颜色',
    `remarks_count`    bigint       default 0 comment '评论数',
    `good_analyse`     int          default 100 comment '好评率',
    `status`           tinyint      default 1 default 1 comment '0-关闭，1-正常，2-禁用',
    `gmt_create`       timestamp    default current_timestamp comment '创建时间',
    `gmt_modified`     timestamp    default current_timestamp on update current_timestamp comment '修改时间',
    `version`          bigint(20)   default 0 comment '版本号',
    primary key (`id`),
    key `idx_type` (`type`),
    key `idx_id_ctime` (`id`, `gmt_create`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 0
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='商品概要表';