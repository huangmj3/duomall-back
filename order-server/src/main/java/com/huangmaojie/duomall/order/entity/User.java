package com.huangmaojie.duomall.order.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.cellphone
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    private String cellphone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.login_password
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    private String loginPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.payment_password
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    private String paymentPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.avatar
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.birthday
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.is_product_manager
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    private Boolean isProductManager;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.is_logistic_manager
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    private Boolean isLogisticManager;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.status
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gmt_create
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gmt_modified
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.version
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.cellphone
     *
     * @return the value of user.cellphone
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.cellphone
     *
     * @param cellphone the value for user.cellphone
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone == null ? null : cellphone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.login_password
     *
     * @return the value of user.login_password
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.login_password
     *
     * @param loginPassword the value for user.login_password
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.payment_password
     *
     * @return the value of user.payment_password
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public String getPaymentPassword() {
        return paymentPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.payment_password
     *
     * @param paymentPassword the value for user.payment_password
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public void setPaymentPassword(String paymentPassword) {
        this.paymentPassword = paymentPassword == null ? null : paymentPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.avatar
     *
     * @return the value of user.avatar
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.avatar
     *
     * @param avatar the value for user.avatar
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sex
     *
     * @param sex the value for user.sex
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.birthday
     *
     * @return the value of user.birthday
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.birthday
     *
     * @param birthday the value for user.birthday
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.is_product_manager
     *
     * @return the value of user.is_product_manager
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public Boolean getIsProductManager() {
        return isProductManager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.is_product_manager
     *
     * @param isProductManager the value for user.is_product_manager
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public void setIsProductManager(Boolean isProductManager) {
        this.isProductManager = isProductManager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.is_logistic_manager
     *
     * @return the value of user.is_logistic_manager
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public Boolean getIsLogisticManager() {
        return isLogisticManager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.is_logistic_manager
     *
     * @param isLogisticManager the value for user.is_logistic_manager
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public void setIsLogisticManager(Boolean isLogisticManager) {
        this.isLogisticManager = isLogisticManager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.status
     *
     * @return the value of user.status
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.status
     *
     * @param status the value for user.status
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gmt_create
     *
     * @return the value of user.gmt_create
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gmt_create
     *
     * @param gmtCreate the value for user.gmt_create
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gmt_modified
     *
     * @return the value of user.gmt_modified
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.gmt_modified
     *
     * @param gmtModified the value for user.gmt_modified
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.version
     *
     * @return the value of user.version
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.version
     *
     * @param version the value for user.version
     *
     * @mbg.generated Sat May 02 13:41:36 CST 2020
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}