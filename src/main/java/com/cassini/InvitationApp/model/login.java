package com.cassini.InvitationApp.model;

import javax.persistence.*;


@Entity(name = "LOGIN")
public class login extends cassiniObject {

    @Id
    @PrimaryKeyJoinColumn(name = "LOGIN_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "LOGIN_ID")
    private Integer loginId;

    @Column(name = "LOGIN_NAME",nullable = false)
    private String loginName;

    @Column(name = "PERSON_ID",nullable = false)
    private Integer personId;

    @Column(name = "PASSWORD",nullable = false)
    private String password;

    @Column(name = "FINGERPRINTDATA",nullable = false)
    private boolean fingerprintData;

    @Column(name = "IS_ACTIVE",nullable = false)
    private boolean isActive;

    @Column(name = "IS_LOCKED",nullable = false)
    private boolean isLocked;

    @Column(name = "IS_SUPERUSER",nullable = false)
    private boolean isSuperUser;

    @Column(name = "EXTERNAL",nullable = false)
    private boolean external;



    public login() {
        super(InvitationObjectType.PERSON);
    }

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isFingerprintData() {
        return fingerprintData;
    }

    public void setFingerprintData(boolean fingerprintData) {
        this.fingerprintData = fingerprintData;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setIsLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }

    public boolean isSuperUser() {
        return isSuperUser;
    }

    public void setIsSuperUser(boolean isSuperUser) {
        this.isSuperUser = isSuperUser;
    }

    public boolean isExternal() {
        return external;
    }

    public void setExternal(boolean external) {
        this.external = external;
    }
}
