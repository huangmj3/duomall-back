package com.huangmaojie.duomall.goods.service.impl;

import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.goods.entity.Remark;
import com.huangmaojie.duomall.goods.entity.RemarkExample;
import com.huangmaojie.duomall.goods.mapper.RemarkMapper;
import com.huangmaojie.duomall.goods.service.RemarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 评论服务实现类
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
@Service
public class RemarkServiceImpl implements RemarkService {

    @Autowired
    private RemarkMapper remarkMapper;

//    @Autowired
//    private RemarkExtMapper commentExtMapper;

    /**
     * 新增评论
     * @param remark 评论信息
     */
    @Override
    public void addRemark(Remark remark){
        remarkMapper.insert(remark);
    }

    /**
     * 修改评论信息
     * @param remark 新的评论信息
     */
    @Override
    public void updateRemark(Remark remark){
        RemarkExample remarkExample = new RemarkExample();
        remarkExample.createCriteria()
            .andIdEqualTo(remark.getId());
        remark.setId(null);
        remarkMapper.updateByExampleSelective(remark,remarkExample);
    }

    /**
     * 删除评论
     * @param remarkId 评论id
     */
    @Override
    public void deleteRemark(String remarkId){
        remarkMapper.deleteByPrimaryKey(remarkId);
    }

//    /**
//     * 根据商品id，查找全部评论
//     * @param goodsId 商品id
//     * @return 带有分页的评论信息
//     */
//    @Override
//    public PageInfo<Comment> selectCommentByGoodsId(String goodsId){
//        CommentExample commentExample = new CommentExample();
//        commentExample.createCriteria()
//                .andTargetIdEqualTo(goodsId)
//                .andTypeEqualTo(0);
//        PageInfo<Comment> cartInfo = new PageInfo<>(commentExtMapper.selectByExample(commentExample));
//        return cartInfo;
//    }
//
//    /**
//     * 根据评论id，查找全部评论
//     * @param commentId 评论id
//     * @return 带有分页的评论信息
//     */
//    @Override
//    public PageInfo<Comment> selectCommentByCommentId(String commentId){
//        CommentExample commentExample = new CommentExample();
//        commentExample.createCriteria()
//                .andTargetIdEqualTo(commentId)
//                .andTypeEqualTo(1);;
//        PageInfo<Comment> cartInfo = new PageInfo<>(commentExtMapper.selectByExample(commentExample));
//        return cartInfo;
//    }
}
