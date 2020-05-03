package com.huangmaojie.duomall.goods.entity;

import java.io.Serializable;
import java.util.Date;

public class GoodsParam implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_param.id
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_param.goods_id
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    private String goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_param.title
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_param.content
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_param.status
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_param.gmt_create
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_param.gmt_modified
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_param.version
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods_param
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_param.id
     *
     * @return the value of goods_param.id
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_param.id
     *
     * @param id the value for goods_param.id
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_param.goods_id
     *
     * @return the value of goods_param.goods_id
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_param.goods_id
     *
     * @param goodsId the value for goods_param.goods_id
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_param.title
     *
     * @return the value of goods_param.title
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_param.title
     *
     * @param title the value for goods_param.title
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_param.content
     *
     * @return the value of goods_param.content
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_param.content
     *
     * @param content the value for goods_param.content
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_param.status
     *
     * @return the value of goods_param.status
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_param.status
     *
     * @param status the value for goods_param.status
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_param.gmt_create
     *
     * @return the value of goods_param.gmt_create
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_param.gmt_create
     *
     * @param gmtCreate the value for goods_param.gmt_create
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_param.gmt_modified
     *
     * @return the value of goods_param.gmt_modified
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_param.gmt_modified
     *
     * @param gmtModified the value for goods_param.gmt_modified
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_param.version
     *
     * @return the value of goods_param.version
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_param.version
     *
     * @param version the value for goods_param.version
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}