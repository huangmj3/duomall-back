package com.huangmaojie.duomall.cart.entity;

import lombok.Data;

/**
 * 分页信息
 *
 * @author huangmaojie
 * @date 2020/3/27
 */
@Data
public class PageInformation {
    /**
     * 页数
     */
    int pageNum;
    /**
     * 一页大小
     */
    int pageSize;
}
