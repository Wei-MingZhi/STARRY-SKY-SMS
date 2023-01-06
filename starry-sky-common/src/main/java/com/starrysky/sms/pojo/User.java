package com.starrysky.sms.pojo;

import lombok.Data;

@Data
public class User {

  private long id;
  private String userName;
  private String userPassword;
  private String userMail;
  private String userPhone;
  private long userMemberId;
  private String userIdCard;
  private String remark;
  private long deleteFlag;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long version;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  public String getUserMail() {
    return userMail;
  }

  public void setUserMail(String userMail) {
    this.userMail = userMail;
  }


  public String getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(String userPhone) {
    this.userPhone = userPhone;
  }


  public long getUserMemberId() {
    return userMemberId;
  }

  public void setUserMemberId(long userMemberId) {
    this.userMemberId = userMemberId;
  }


  public String getUserIdCard() {
    return userIdCard;
  }

  public void setUserIdCard(String userIdCard) {
    this.userIdCard = userIdCard;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public long getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(long deleteFlag) {
    this.deleteFlag = deleteFlag;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public long getVersion() {
    return version;
  }

  public void setVersion(long version) {
    this.version = version;
  }

}
