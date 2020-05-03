package com.huangmaojie.duomall.goods.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GoodsSetMeal implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_set_meal.id
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_set_meal.goods_id
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    private String goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_set_meal.image
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    private String image;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_set_meal.intro
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    private String intro;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_set_meal.price
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_set_meal.status
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_set_meal.gmt_create
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_set_meal.gmt_modified
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_set_meal.version
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods_set_meal
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_set_meal.id
     *
     * @return the value of goods_set_meal.id
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_set_meal.id
     *
     * @param id the value for goods_set_meal.id
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_set_meal.goods_id
     *
     * @return the value of goods_set_meal.goods_id
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_set_meal.goods_id
     *
     * @param goodsId the value for goods_set_meal.goods_id
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_set_meal.image
     *
     * @return the value of goods_set_meal.image
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_set_meal.image
     *
     * @param image the value for goods_set_meal.image
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_set_meal.intro
     *
     * @return the value of goods_set_meal.intro
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public String getIntro() {
        return intro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_set_meal.intro
     *
     * @param intro the value for goods_set_meal.intro
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_set_meal.price
     *
     * @return the value of goods_set_meal.price
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_set_meal.price
     *
     * @param price the value for goods_set_meal.price
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_set_meal.status
     *
     * @return the value of goods_set_meal.status
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_set_meal.status
     *
     * @param status the value for goods_set_meal.status
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_set_meal.gmt_create
     *
     * @return the value of goods_set_meal.gmt_create
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_set_meal.gmt_create
     *
     * @param gmtCreate the value for goods_set_meal.gmt_create
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_set_meal.gmt_modified
     *
     * @return the value of goods_set_meal.gmt_modified
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_set_meal.gmt_modified
     *
     * @param gmtModified the value for goods_set_meal.gmt_modified
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_set_meal.version
     *
     * @return the value of goods_set_meal.version
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_set_meal.version
     *
     * @param version the value for goods_set_meal.version
     *
     * @mbg.generated Sun May 03 11:29:17 CST 2020
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}