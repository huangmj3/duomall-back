package com.huangmaojie.duomall.user.entity;

import java.io.Serializable;
import java.util.Date;

public class GoodsImage implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_image.id
     *
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_image.goods_id
     *
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    private String goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_image.image
     *
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    private String image;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_image.type
     *
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_image.status
     *
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_image.gmt_create
     *
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_image.gmt_modified
     *
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    private Date gmtModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_image.version
     *
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods_image
     *
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_image.id
     *
     * @return the value of goods_image.id
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_image.id
     *
     * @param id the value for goods_image.id
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_image.goods_id
     *
     * @return the value of goods_image.goods_id
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_image.goods_id
     *
     * @param goodsId the value for goods_image.goods_id
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_image.image
     *
     * @return the value of goods_image.image
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_image.image
     *
     * @param image the value for goods_image.image
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_image.type
     *
     * @return the value of goods_image.type
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_image.type
     *
     * @param type the value for goods_image.type
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_image.status
     *
     * @return the value of goods_image.status
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_image.status
     *
     * @param status the value for goods_image.status
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_image.gmt_create
     *
     * @return the value of goods_image.gmt_create
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_image.gmt_create
     *
     * @param gmtCreate the value for goods_image.gmt_create
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_image.gmt_modified
     *
     * @return the value of goods_image.gmt_modified
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_image.gmt_modified
     *
     * @param gmtModified the value for goods_image.gmt_modified
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_image.version
     *
     * @return the value of goods_image.version
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_image.version
     *
     * @param version the value for goods_image.version
     * @mbg.generated Sun Apr 26 18:30:43 CST 2020
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}