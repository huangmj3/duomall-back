package com.huangmaojie.duomall.goods.controller;

import com.huangmaojie.duomall.goods.entity.Remark;
import com.huangmaojie.duomall.goods.entity.Result;
import com.huangmaojie.duomall.goods.entity.StatusCode;
import com.huangmaojie.duomall.goods.service.RemarkService;
import com.huangmaojie.duomall.goods.util.IdWorker;
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
@RequestMapping("/remark")
public class RemarkController {


    @Autowired
    private RemarkService remarkService;

    /**
     * 新增评论
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Result addRemark(@RequestBody Remark remark) {
        remark.setId(new IdWorker().nextId() + "");
        remark.setVersion(0L);
        remark.setRemarkCount(0L);
        remark.setLikeCount(0L);
        remarkService.addRemark(remark);
        return new Result(true, StatusCode.OK, "添加成功");
    }

    /**
     * 修改评论信息
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Result updateRemark(@RequestBody Remark remark) {
        remark.setId(null);
        remarkService.updateRemark(remark);
        return new Result(true, StatusCode.OK, "修改成功");
    }

    /**
     * 删除评论
     */
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public Result deleteRemark(String remarkId){
        remarkService.deleteRemark(remarkId);
        return new Result(true, StatusCode.OK, "删除成功");
    }

//    /**
//     * 根据商品id，获得全部评论
//     */
//    @RequestMapping(value = "/listByGoods",method = RequestMethod.GET)
//    public PageInfo<Remark> getCommentListByGoodsId(@RequestParam(value = "target_id") String goodsId, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "1") int pageSize){
//        PageHelper.startPage(pageNum,pageSize);
//        PageInfo<Comment> cartPageInfo = remarkService.selectCommentByGoodsId(goodsId);
//        return cartPageInfo;
//    }
//
//    /**
//     * 根据评论id，获得全部评论
//     */
//    @RequestMapping(value = "/listByComment",method = RequestMethod.GET)
//    public PageInfo<Comment> getCommentListByCommentId(@RequestParam(value = "target_id") String commentId, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "1") int pageSize){
//        PageHelper.startPage(pageNum,pageSize);
//        PageInfo<Comment> cartPageInfo = remarkService.selectCommentByCommentId(commentId);
//        return cartPageInfo;
//    }
}
