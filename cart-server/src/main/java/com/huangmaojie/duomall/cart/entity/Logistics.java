package com.huangmaojie.duomall.cart.entity;

import java.io.Serializable;
import java.util.Date;

public class Logistics implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.id
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.ship_num
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    private String shipNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.uid
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.order_id
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.ship_time
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    private Date shipTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.is_receipt
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    private Boolean isReceipt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.receipt_time
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    private Date receiptTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.consignee_name
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    private String consigneeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.address
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.status
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.gmt_create
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.gmt_modified
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logistics.version
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table logistics
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.id
     *
     * @return the value of logistics.id
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.id
     *
     * @param id the value for logistics.id
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.ship_num
     *
     * @return the value of logistics.ship_num
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public String getShipNum() {
        return shipNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.ship_num
     *
     * @param shipNum the value for logistics.ship_num
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public void setShipNum(String shipNum) {
        this.shipNum = shipNum == null ? null : shipNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.uid
     *
     * @return the value of logistics.uid
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.uid
     *
     * @param uid the value for logistics.uid
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.order_id
     *
     * @return the value of logistics.order_id
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.order_id
     *
     * @param orderId the value for logistics.order_id
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.ship_time
     *
     * @return the value of logistics.ship_time
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public Date getShipTime() {
        return shipTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.ship_time
     *
     * @param shipTime the value for logistics.ship_time
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public void setShipTime(Date shipTime) {
        this.shipTime = shipTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.is_receipt
     *
     * @return the value of logistics.is_receipt
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public Boolean getIsReceipt() {
        return isReceipt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.is_receipt
     *
     * @param isReceipt the value for logistics.is_receipt
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public void setIsReceipt(Boolean isReceipt) {
        this.isReceipt = isReceipt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.receipt_time
     *
     * @return the value of logistics.receipt_time
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public Date getReceiptTime() {
        return receiptTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.receipt_time
     *
     * @param receiptTime the value for logistics.receipt_time
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public void setReceiptTime(Date receiptTime) {
        this.receiptTime = receiptTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.consignee_name
     *
     * @return the value of logistics.consignee_name
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public String getConsigneeName() {
        return consigneeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.consignee_name
     *
     * @param consigneeName the value for logistics.consignee_name
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName == null ? null : consigneeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.address
     *
     * @return the value of logistics.address
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.address
     *
     * @param address the value for logistics.address
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.status
     *
     * @return the value of logistics.status
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.status
     *
     * @param status the value for logistics.status
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.gmt_create
     *
     * @return the value of logistics.gmt_create
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.gmt_create
     *
     * @param gmtCreate the value for logistics.gmt_create
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.gmt_modified
     *
     * @return the value of logistics.gmt_modified
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.gmt_modified
     *
     * @param gmtModified the value for logistics.gmt_modified
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logistics.version
     *
     * @return the value of logistics.version
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logistics.version
     *
     * @param version the value for logistics.version
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}