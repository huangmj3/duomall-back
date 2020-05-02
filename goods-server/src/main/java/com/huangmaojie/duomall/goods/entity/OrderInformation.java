package com.huangmaojie.duomall.goods.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderInformation implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_information.id
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_information.user_id
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_information.goods_id
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private String goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_information.pay_price
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private Double payPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_information.is_pay
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private Boolean isPay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_information.pay_time
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private Date payTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_information.is_ship
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private Boolean isShip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_information.ship_time
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private Date shipTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_information.ship_num
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private String shipNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_information.is_receipt
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private Boolean isReceipt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_information.receipt_time
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private Date receiptTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_information.status
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_information.gmt_create
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_information.gmt_modified
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_information.version
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_information
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_information.id
     *
     * @return the value of order_information.id
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_information.id
     *
     * @param id the value for order_information.id
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_information.user_id
     *
     * @return the value of order_information.user_id
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_information.user_id
     *
     * @param userId the value for order_information.user_id
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_information.goods_id
     *
     * @return the value of order_information.goods_id
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_information.goods_id
     *
     * @param goodsId the value for order_information.goods_id
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_information.pay_price
     *
     * @return the value of order_information.pay_price
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public Double getPayPrice() {
        return payPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_information.pay_price
     *
     * @param payPrice the value for order_information.pay_price
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setPayPrice(Double payPrice) {
        this.payPrice = payPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_information.is_pay
     *
     * @return the value of order_information.is_pay
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public Boolean getIsPay() {
        return isPay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_information.is_pay
     *
     * @param isPay the value for order_information.is_pay
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setIsPay(Boolean isPay) {
        this.isPay = isPay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_information.pay_time
     *
     * @return the value of order_information.pay_time
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_information.pay_time
     *
     * @param payTime the value for order_information.pay_time
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_information.is_ship
     *
     * @return the value of order_information.is_ship
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public Boolean getIsShip() {
        return isShip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_information.is_ship
     *
     * @param isShip the value for order_information.is_ship
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setIsShip(Boolean isShip) {
        this.isShip = isShip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_information.ship_time
     *
     * @return the value of order_information.ship_time
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public Date getShipTime() {
        return shipTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_information.ship_time
     *
     * @param shipTime the value for order_information.ship_time
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setShipTime(Date shipTime) {
        this.shipTime = shipTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_information.ship_num
     *
     * @return the value of order_information.ship_num
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public String getShipNum() {
        return shipNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_information.ship_num
     *
     * @param shipNum the value for order_information.ship_num
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setShipNum(String shipNum) {
        this.shipNum = shipNum == null ? null : shipNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_information.is_receipt
     *
     * @return the value of order_information.is_receipt
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public Boolean getIsReceipt() {
        return isReceipt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_information.is_receipt
     *
     * @param isReceipt the value for order_information.is_receipt
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setIsReceipt(Boolean isReceipt) {
        this.isReceipt = isReceipt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_information.receipt_time
     *
     * @return the value of order_information.receipt_time
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public Date getReceiptTime() {
        return receiptTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_information.receipt_time
     *
     * @param receiptTime the value for order_information.receipt_time
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setReceiptTime(Date receiptTime) {
        this.receiptTime = receiptTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_information.status
     *
     * @return the value of order_information.status
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_information.status
     *
     * @param status the value for order_information.status
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_information.gmt_create
     *
     * @return the value of order_information.gmt_create
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_information.gmt_create
     *
     * @param gmtCreate the value for order_information.gmt_create
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_information.gmt_modified
     *
     * @return the value of order_information.gmt_modified
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_information.gmt_modified
     *
     * @param gmtModified the value for order_information.gmt_modified
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_information.version
     *
     * @return the value of order_information.version
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_information.version
     *
     * @param version the value for order_information.version
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}