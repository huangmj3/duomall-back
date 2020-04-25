# 创建评论表
use duomall;
create table if not exists remark
(
    `id`           varchar(36)          not null comment '主键id',
    `user_id`      varchar(36)          not null comment '用户id',
    `target_id`    varchar(36)          not null comment '目标id',
    `type`         int        default 0 not null comment '评价类型,0-商品评论,1-多级评论',
    `tag`          varchar(36) comment '评价标签',
    `content`      text                 not null comment '评价内容',
    `remark_count` bigint     default 0 not null comment '评价数',
    `like_count`   bigint     default 0 not null comment '点赞数',
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
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='评论表';
