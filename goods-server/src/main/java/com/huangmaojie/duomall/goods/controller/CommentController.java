package com.huangmaojie.duomall.goods.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huangmaojie.duomall.goods.entity.Comment;
import com.huangmaojie.duomall.goods.entity.Result;
import com.huangmaojie.duomall.goods.entity.StatusCode;
import com.huangmaojie.duomall.goods.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 评论服务控制器
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
@CrossOrigin
@RestController
public class CommentController {


    @Autowired
    private CommentService commentService;

    /**
     * 新增评论
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Result addComment(@RequestBody Comment comment) {
        commentService.addComment(comment);
        return new Result(true, StatusCode.OK, "添加成功");
    }

    /**
     * 修改评论信息
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Result updateComment(@RequestBody Comment comment) {
        commentService.updateComment(comment);
        return new Result(true, StatusCode.OK, "修改成功");
    }

    /**
     * 根据商品id，获得全部评论
     */
    @RequestMapping(value = "/listByGoods",method = RequestMethod.GET)
    public PageInfo<Comment> getCommentListByGoodsId(@RequestParam String goods_id, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "1") int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        PageInfo<Comment> cartPageInfo = commentService.selectCommentByGoodsId(goods_id);
        return cartPageInfo;
    }

    /**
     * 根据评论id，获得全部评论
     */
    @RequestMapping(value = "/listByComment",method = RequestMethod.GET)
    public PageInfo<Comment> getCommentListByCommentId(@RequestParam String uid, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "1") int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        PageInfo<Comment> cartPageInfo = commentService.selectCommentByCommentId(uid);
        return cartPageInfo;
    }
}
