package com.huangmaojie.duomall.goods.service;

import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.goods.entity.Remark;
import org.springframework.validation.annotation.Validated;

/**
 * 评论服务接口
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
@Validated
public interface RemarkService {
    void addRemark(Remark remark);

    void updateRemark(Remark remark);

    void deleteRemark(String remarkId);

//    PageInfo<Remark> selectRemarkByUserId(String userId);
//
//    PageInfo<Remark> selectRemarkByTargetId(String targetId);
}
