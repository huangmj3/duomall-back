package com.huangmaojie.duomall.goods.entity;

import java.io.Serializable;
import java.util.Date;

public class Remark implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remark.id
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remark.user_id
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remark.target_id
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private String targetId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remark.type
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remark.tag
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private String tag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remark.content
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remark.remark_count
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private Long remarkCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remark.like_count
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private Long likeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remark.status
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remark.gmt_create
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remark.gmt_modified
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remark.version
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table remark
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column remark.id
     *
     * @return the value of remark.id
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column remark.id
     *
     * @param id the value for remark.id
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column remark.user_id
     *
     * @return the value of remark.user_id
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column remark.user_id
     *
     * @param userId the value for remark.user_id
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column remark.target_id
     *
     * @return the value of remark.target_id
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column remark.target_id
     *
     * @param targetId the value for remark.target_id
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setTargetId(String targetId) {
        this.targetId = targetId == null ? null : targetId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column remark.type
     *
     * @return the value of remark.type
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column remark.type
     *
     * @param type the value for remark.type
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column remark.tag
     *
     * @return the value of remark.tag
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column remark.tag
     *
     * @param tag the value for remark.tag
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column remark.content
     *
     * @return the value of remark.content
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column remark.content
     *
     * @param content the value for remark.content
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column remark.remark_count
     *
     * @return the value of remark.remark_count
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public Long getRemarkCount() {
        return remarkCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column remark.remark_count
     *
     * @param remarkCount the value for remark.remark_count
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setRemarkCount(Long remarkCount) {
        this.remarkCount = remarkCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column remark.like_count
     *
     * @return the value of remark.like_count
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public Long getLikeCount() {
        return likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column remark.like_count
     *
     * @param likeCount the value for remark.like_count
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column remark.status
     *
     * @return the value of remark.status
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column remark.status
     *
     * @param status the value for remark.status
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column remark.gmt_create
     *
     * @return the value of remark.gmt_create
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column remark.gmt_create
     *
     * @param gmtCreate the value for remark.gmt_create
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column remark.gmt_modified
     *
     * @return the value of remark.gmt_modified
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column remark.gmt_modified
     *
     * @param gmtModified the value for remark.gmt_modified
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column remark.version
     *
     * @return the value of remark.version
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column remark.version
     *
     * @param version the value for remark.version
     *
     * @mbg.generated Sat May 02 15:19:34 CST 2020
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}