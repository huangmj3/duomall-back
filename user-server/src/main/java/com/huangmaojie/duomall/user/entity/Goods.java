package com.huangmaojie.duomall.user.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Goods implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.id
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.title
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.intro
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private String intro;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.stock
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private Long stock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.shop_name
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private String shopName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.type
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.is_featured
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private Boolean isFeatured;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.is_hot
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private Boolean isHot;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.tags
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private String tags;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.discount
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private String discount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.original_price
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private BigDecimal originalPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.discount_price
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private BigDecimal discountPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.sale
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private Long sale;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.promotion
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private String promotion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.params
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private String params;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.remark_tag_color
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private String remarkTagColor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.remarks_count
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private Long remarksCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.good_analyse
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private BigDecimal goodAnalyse;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.status
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.gmt_create
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.gmt_modified
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.version
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.id
     *
     * @return the value of goods.id
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.id
     *
     * @param id the value for goods.id
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.title
     *
     * @return the value of goods.title
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.title
     *
     * @param title the value for goods.title
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.intro
     *
     * @return the value of goods.intro
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public String getIntro() {
        return intro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.intro
     *
     * @param intro the value for goods.intro
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.stock
     *
     * @return the value of goods.stock
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public Long getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.stock
     *
     * @param stock the value for goods.stock
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setStock(Long stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.shop_name
     *
     * @return the value of goods.shop_name
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.shop_name
     *
     * @param shopName the value for goods.shop_name
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.type
     *
     * @return the value of goods.type
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.type
     *
     * @param type the value for goods.type
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.is_featured
     *
     * @return the value of goods.is_featured
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public Boolean getIsFeatured() {
        return isFeatured;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.is_featured
     *
     * @param isFeatured the value for goods.is_featured
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setIsFeatured(Boolean isFeatured) {
        this.isFeatured = isFeatured;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.is_hot
     *
     * @return the value of goods.is_hot
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public Boolean getIsHot() {
        return isHot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.is_hot
     *
     * @param isHot the value for goods.is_hot
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.tags
     *
     * @return the value of goods.tags
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public String getTags() {
        return tags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.tags
     *
     * @param tags the value for goods.tags
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.discount
     *
     * @return the value of goods.discount
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.discount
     *
     * @param discount the value for goods.discount
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setDiscount(String discount) {
        this.discount = discount == null ? null : discount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.original_price
     *
     * @return the value of goods.original_price
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.original_price
     *
     * @param originalPrice the value for goods.original_price
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.discount_price
     *
     * @return the value of goods.discount_price
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.discount_price
     *
     * @param discountPrice the value for goods.discount_price
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.sale
     *
     * @return the value of goods.sale
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public Long getSale() {
        return sale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.sale
     *
     * @param sale the value for goods.sale
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setSale(Long sale) {
        this.sale = sale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.promotion
     *
     * @return the value of goods.promotion
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public String getPromotion() {
        return promotion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.promotion
     *
     * @param promotion the value for goods.promotion
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setPromotion(String promotion) {
        this.promotion = promotion == null ? null : promotion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.params
     *
     * @return the value of goods.params
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public String getParams() {
        return params;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.params
     *
     * @param params the value for goods.params
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.remark_tag_color
     *
     * @return the value of goods.remark_tag_color
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public String getRemarkTagColor() {
        return remarkTagColor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.remark_tag_color
     *
     * @param remarkTagColor the value for goods.remark_tag_color
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setRemarkTagColor(String remarkTagColor) {
        this.remarkTagColor = remarkTagColor == null ? null : remarkTagColor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.remarks_count
     *
     * @return the value of goods.remarks_count
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public Long getRemarksCount() {
        return remarksCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.remarks_count
     *
     * @param remarksCount the value for goods.remarks_count
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setRemarksCount(Long remarksCount) {
        this.remarksCount = remarksCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.good_analyse
     *
     * @return the value of goods.good_analyse
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public BigDecimal getGoodAnalyse() {
        return goodAnalyse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.good_analyse
     *
     * @param goodAnalyse the value for goods.good_analyse
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setGoodAnalyse(BigDecimal goodAnalyse) {
        this.goodAnalyse = goodAnalyse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.status
     *
     * @return the value of goods.status
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.status
     *
     * @param status the value for goods.status
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.gmt_create
     *
     * @return the value of goods.gmt_create
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.gmt_create
     *
     * @param gmtCreate the value for goods.gmt_create
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.gmt_modified
     *
     * @return the value of goods.gmt_modified
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.gmt_modified
     *
     * @param gmtModified the value for goods.gmt_modified
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.version
     *
     * @return the value of goods.version
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.version
     *
     * @param version the value for goods.version
     *
     * @mbg.generated Sun May 03 11:29:36 CST 2020
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}