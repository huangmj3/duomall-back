package com.huangmaojie.duomall.goods.entity;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * 关键词搜索分页类
 *
 * @author huangmaojie
 * @date 2020/3/27
 */
@Data
public class SearchPageInformation {

    /**
     * 关键词
     */
    String key;
    /**
     * 页数
     */
    int pageNum;
    /**
     * 每页大小
     */
    int pageSize;
}
