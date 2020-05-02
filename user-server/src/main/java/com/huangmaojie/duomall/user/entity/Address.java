package com.huangmaojie.duomall.user.entity;

import java.io.Serializable;
import java.util.Date;

public class Address implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.id
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.user_id
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.postcode
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    private Integer postcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.province
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.city
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.district
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    private String district;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.detail
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    private String detail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.is_default
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    private Boolean isDefault;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.status
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.gmt_create
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.gmt_modified
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address.version
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table address
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.id
     *
     * @return the value of address.id
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.id
     *
     * @param id the value for address.id
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.user_id
     *
     * @return the value of address.user_id
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.user_id
     *
     * @param userId the value for address.user_id
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.postcode
     *
     * @return the value of address.postcode
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public Integer getPostcode() {
        return postcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.postcode
     *
     * @param postcode the value for address.postcode
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.province
     *
     * @return the value of address.province
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.province
     *
     * @param province the value for address.province
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.city
     *
     * @return the value of address.city
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.city
     *
     * @param city the value for address.city
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.district
     *
     * @return the value of address.district
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public String getDistrict() {
        return district;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.district
     *
     * @param district the value for address.district
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.detail
     *
     * @return the value of address.detail
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.detail
     *
     * @param detail the value for address.detail
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.is_default
     *
     * @return the value of address.is_default
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.is_default
     *
     * @param isDefault the value for address.is_default
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.status
     *
     * @return the value of address.status
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.status
     *
     * @param status the value for address.status
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.gmt_create
     *
     * @return the value of address.gmt_create
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.gmt_create
     *
     * @param gmtCreate the value for address.gmt_create
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.gmt_modified
     *
     * @return the value of address.gmt_modified
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.gmt_modified
     *
     * @param gmtModified the value for address.gmt_modified
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address.version
     *
     * @return the value of address.version
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address.version
     *
     * @param version the value for address.version
     *
     * @mbg.generated Sat May 02 15:19:52 CST 2020
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}