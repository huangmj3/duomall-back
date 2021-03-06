package com.huangmaojie.duomall.goods.mapper.extension;

import com.github.pagehelper.Page;
import com.huangmaojie.duomall.goods.entity.Goods;
import com.huangmaojie.duomall.goods.entity.GoodsExample;
import org.apache.ibatis.annotations.Param;

/**
 * Goods扩展Mapper
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
public interface GoodsExtMapper {
    /**
     * 分页信息
     * @param example
     * @return 含有分页信息的列表
     */
    Page<Goods> selectByExample(GoodsExample example);

}