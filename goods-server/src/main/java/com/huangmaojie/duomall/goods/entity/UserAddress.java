package com.huangmaojie.duomall.goods.entity;

import java.io.Serializable;
import java.util.Date;

public class UserAddress implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.id
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.uid
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.zip
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    private Integer zip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.province
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    private Integer province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.city
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    private Integer city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.district
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    private Integer district;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.address
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.is_default
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    private Boolean isDefault;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.status
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.gmt_create
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.gmt_modified
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.version
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_address
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.id
     *
     * @return the value of user_address.id
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.id
     *
     * @param id the value for user_address.id
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.uid
     *
     * @return the value of user_address.uid
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.uid
     *
     * @param uid the value for user_address.uid
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.zip
     *
     * @return the value of user_address.zip
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public Integer getZip() {
        return zip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.zip
     *
     * @param zip the value for user_address.zip
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public void setZip(Integer zip) {
        this.zip = zip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.province
     *
     * @return the value of user_address.province
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public Integer getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.province
     *
     * @param province the value for user_address.province
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public void setProvince(Integer province) {
        this.province = province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.city
     *
     * @return the value of user_address.city
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public Integer getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.city
     *
     * @param city the value for user_address.city
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public void setCity(Integer city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.district
     *
     * @return the value of user_address.district
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public Integer getDistrict() {
        return district;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.district
     *
     * @param district the value for user_address.district
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public void setDistrict(Integer district) {
        this.district = district;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.address
     *
     * @return the value of user_address.address
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.address
     *
     * @param address the value for user_address.address
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.is_default
     *
     * @return the value of user_address.is_default
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.is_default
     *
     * @param isDefault the value for user_address.is_default
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.status
     *
     * @return the value of user_address.status
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.status
     *
     * @param status the value for user_address.status
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.gmt_create
     *
     * @return the value of user_address.gmt_create
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.gmt_create
     *
     * @param gmtCreate the value for user_address.gmt_create
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.gmt_modified
     *
     * @return the value of user_address.gmt_modified
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.gmt_modified
     *
     * @param gmtModified the value for user_address.gmt_modified
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.version
     *
     * @return the value of user_address.version
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.version
     *
     * @param version the value for user_address.version
     *
     * @mbg.generated Fri Mar 27 18:20:11 CST 2020
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}