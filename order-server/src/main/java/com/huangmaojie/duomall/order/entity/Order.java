package com.huangmaojie.duomall.order.entity;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.id
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.uid
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.pay_price
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    private Double payPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.is_pay
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    private Boolean isPay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.pay_time
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    private Date payTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.is_ship
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    private Boolean isShip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.ship_time
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    private Date shipTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.ship_num
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    private String shipNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.is_receipt
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    private Boolean isReceipt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.receipt_time
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    private Date receiptTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.status
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.gmt_create
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.gmt_modified
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.version
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.id
     *
     * @return the value of order.id
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.id
     *
     * @param id the value for order.id
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.uid
     *
     * @return the value of order.uid
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.uid
     *
     * @param uid the value for order.uid
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.pay_price
     *
     * @return the value of order.pay_price
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public Double getPayPrice() {
        return payPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.pay_price
     *
     * @param payPrice the value for order.pay_price
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public void setPayPrice(Double payPrice) {
        this.payPrice = payPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.is_pay
     *
     * @return the value of order.is_pay
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public Boolean getIsPay() {
        return isPay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.is_pay
     *
     * @param isPay the value for order.is_pay
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public void setIsPay(Boolean isPay) {
        this.isPay = isPay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.pay_time
     *
     * @return the value of order.pay_time
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.pay_time
     *
     * @param payTime the value for order.pay_time
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.is_ship
     *
     * @return the value of order.is_ship
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public Boolean getIsShip() {
        return isShip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.is_ship
     *
     * @param isShip the value for order.is_ship
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public void setIsShip(Boolean isShip) {
        this.isShip = isShip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.ship_time
     *
     * @return the value of order.ship_time
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public Date getShipTime() {
        return shipTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.ship_time
     *
     * @param shipTime the value for order.ship_time
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public void setShipTime(Date shipTime) {
        this.shipTime = shipTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.ship_num
     *
     * @return the value of order.ship_num
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public String getShipNum() {
        return shipNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.ship_num
     *
     * @param shipNum the value for order.ship_num
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public void setShipNum(String shipNum) {
        this.shipNum = shipNum == null ? null : shipNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.is_receipt
     *
     * @return the value of order.is_receipt
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public Boolean getIsReceipt() {
        return isReceipt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.is_receipt
     *
     * @param isReceipt the value for order.is_receipt
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public void setIsReceipt(Boolean isReceipt) {
        this.isReceipt = isReceipt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.receipt_time
     *
     * @return the value of order.receipt_time
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public Date getReceiptTime() {
        return receiptTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.receipt_time
     *
     * @param receiptTime the value for order.receipt_time
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public void setReceiptTime(Date receiptTime) {
        this.receiptTime = receiptTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.status
     *
     * @return the value of order.status
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.status
     *
     * @param status the value for order.status
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.gmt_create
     *
     * @return the value of order.gmt_create
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.gmt_create
     *
     * @param gmtCreate the value for order.gmt_create
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.gmt_modified
     *
     * @return the value of order.gmt_modified
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.gmt_modified
     *
     * @param gmtModified the value for order.gmt_modified
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.version
     *
     * @return the value of order.version
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.version
     *
     * @param version the value for order.version
     *
     * @mbg.generated Sat Mar 28 01:39:38 CST 2020
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}