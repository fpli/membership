package com.sap.membership.trade.model;

import java.util.Date;

/**
 * 会员扩展信息
 */
public class UsersExtensionDO {
    private Integer userId;

    private Integer sex;

    private String birthday;

    private String identityCardNo;

    private Integer education;

    private Integer occupation;

    private Integer salary;

    private Integer access;

    private Integer onoursite;

    private String usedProduct;

    private String proposal;

    private String serviceRequest;

    private Date applyTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getIdentityCardNo() {
        return identityCardNo;
    }

    public void setIdentityCardNo(String identityCardNo) {
        this.identityCardNo = identityCardNo == null ? null : identityCardNo.trim();
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getOccupation() {
        return occupation;
    }

    public void setOccupation(Integer occupation) {
        this.occupation = occupation;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAccess() {
        return access;
    }

    public void setAccess(Integer access) {
        this.access = access;
    }

    public Integer getOnoursite() {
        return onoursite;
    }

    public void setOnoursite(Integer onoursite) {
        this.onoursite = onoursite;
    }

    public String getUsedProduct() {
        return usedProduct;
    }

    public void setUsedProduct(String usedProduct) {
        this.usedProduct = usedProduct == null ? null : usedProduct.trim();
    }

    public String getProposal() {
        return proposal;
    }

    public void setProposal(String proposal) {
        this.proposal = proposal == null ? null : proposal.trim();
    }

    public String getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(String serviceRequest) {
        this.serviceRequest = serviceRequest == null ? null : serviceRequest.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }
}