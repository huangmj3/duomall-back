# 创建用户表
# spike_minutes和pike_seconds作为保留字需要手动添加
use duomall;
create table if not exists spike_goods
(
    `id`            varchar(36) not null comment '主键id',
    `goods_id`      varchar(36) not null comment '秒杀商品id',
    `spike_hours`   int         not null comment '秒杀小时',
#     'spike_minutes' int         not null comment '秒杀分钟',
#     'spike_seconds' int         not null comment '秒杀秒数',
    `status`        tinyint    default 1 comment '0-关闭，1-正常，2-禁用',
    `gmt_create`    timestamp  default current_timestamp comment '创建时间',
    `gmt_modified`  timestamp  default current_timestamp on update current_timestamp comment '修改时间',
    `version`       bigint(20) default 0 comment '版本号',
    primary key (`id`),
    key `idx_id_ctime` (`id`, `gmt_create`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 0
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='秒杀商品表';