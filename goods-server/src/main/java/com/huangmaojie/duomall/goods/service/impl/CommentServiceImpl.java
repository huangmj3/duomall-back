//package com.huangmaojie.duomall.goods.service.impl;
//
//import com.github.pagehelper.PageInfo;
//import com.huangmaojie.duomall.goods.entity.Comment;
//import com.huangmaojie.duomall.goods.entity.CommentExample;
//import com.huangmaojie.duomall.goods.mapper.CommentMapper;
//import com.huangmaojie.duomall.goods.mapper.extension.CommentExtMapper;
//import com.huangmaojie.duomall.goods.service.CommentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
///**
// * 评论服务实现类
// *
// * @author huangmaojie
// * @date 2020/3/28
// */
//@Service
//public class CommentServiceImpl implements CommentService {
//
//    @Autowired
//    private CommentMapper commentMapper;
//
//    @Autowired
//    private CommentExtMapper commentExtMapper;
//
//    /**
//     * 新增评论
//     * @param comment 评论信息
//     */
//    @Override
//    public void addComment(Comment comment){
//        commentMapper.insert(comment);
//    }
//
//    /**
//     * 修改评论信息
//     * @param comment 新的评论信息
//     */
//    @Override
//    public void updateComment(Comment comment){
//        CommentExample commentExample = new CommentExample();
//        commentExample.createCriteria()
//            .andIdEqualTo(comment.getId());
//        comment.setId(null);
//        commentMapper.updateByExampleSelective(comment,commentExample);
//    }
//
//    /**
//     * 删除评论
//     * @param commentId 评论id
//     */
//    @Override
//    public void deleteComment(String commentId){
//        commentMapper.deleteByPrimaryKey(commentId);
//    }
//
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
//}
