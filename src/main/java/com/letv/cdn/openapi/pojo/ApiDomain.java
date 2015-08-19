package com.letv.cdn.openapi.pojo;

import java.util.Date;

import com.letv.cdn.openapi.utils.Env;

public class ApiDomain {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.id
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.userid
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.domaintag
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    private String domaintag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.domain
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    private String domain;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.source
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    private String source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.service_type
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    private Short serviceType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.enabled
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    private Short enabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.create_time
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.update_time
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domain.remark
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    private String remark;
    
    /**
     * 回源域名
     */
    private String setHost;
    
    public ApiDomain() {}
    
    public ApiDomain(Integer userid, String domaintag, String domain,
			String source, Short serviceType, Short enabled, String remark) {
		super();
		this.userid = userid;
		this.domaintag = domaintag;
		this.domain = domain;
		this.source = source;
		this.serviceType = serviceType;
		this.enabled = enabled;
		this.remark = remark;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.id
     *
     * @return the value of domain.id
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.id
     *
     * @param id the value for domain.id
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.userid
     *
     * @return the value of domain.userid
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.userid
     *
     * @param userid the value for domain.userid
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.domaintag
     *
     * @return the value of domain.domaintag
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    public String getDomaintag() {
        return domaintag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.domaintag
     *
     * @param domaintag the value for domain.domaintag
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    public void setDomaintag(String domaintag) {
        this.domaintag = domaintag == null ? null : domaintag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.domain
     *
     * @return the value of domain.domain
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    public String getDomain() {
        return domain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.domain
     *
     * @param domain the value for domain.domain
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.source
     *
     * @return the value of domain.source
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.source
     *
     * @param source the value for domain.source
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.service_type
     *
     * @return the value of domain.service_type
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    public Short getServiceType() {
        return serviceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.service_type
     *
     * @param serviceType the value for domain.service_type
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    public void setServiceType(Short serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.enabled
     *
     * @return the value of domain.enabled
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    public Short getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.enabled
     *
     * @param enabled the value for domain.enabled
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    public void setEnabled(Short enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.create_time
     *
     * @return the value of domain.create_time
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.create_time
     *
     * @param createTime the value for domain.create_time
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.update_time
     *
     * @return the value of domain.update_time
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.update_time
     *
     * @param updateTime the value for domain.update_time
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domain.remark
     *
     * @return the value of domain.remark
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domain.remark
     *
     * @param remark the value for domain.remark
     *
     * @mbggenerated Thu Dec 11 13:53:28 CST 2014
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
    
    public String getCname() {
        return Env.get("cname_domain");
    }
    
    public Short getFlag() {
        return this.enabled;
    }
    
    public Short getType() {
    	return this.serviceType;
    }

	public String getSetHost() {
		return setHost;
	}

	public void setSetHost(String setHost) {
		this.setHost = setHost;
	}
}