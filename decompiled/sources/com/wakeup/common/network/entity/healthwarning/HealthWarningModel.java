package com.wakeup.common.network.entity.healthwarning;

/* loaded from: classes2.dex */
public class HealthWarningModel {
    private long appTime;
    private String contactNumber;
    private String contactType;
    private int days;
    private int leftBuyTimes;
    private int leftFreeTimes;
    private int state;
    private int usedBuyTimes;
    private int usedFreeTimes;
    private int userBuyTimes;
    private int userFreeTimes;
    private int userId;

    public long getAppTime() {
        return this.appTime;
    }

    public void setAppTime(long appTime) {
        this.appTime = appTime;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactType() {
        return this.contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public int getDays() {
        return this.days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getLeftBuyTimes() {
        return this.leftBuyTimes;
    }

    public void setLeftBuyTimes(int leftBuyTimes) {
        this.leftBuyTimes = leftBuyTimes;
    }

    public int getLeftFreeTimes() {
        return this.leftFreeTimes;
    }

    public void setLeftFreeTimes(int leftFreeTimes) {
        this.leftFreeTimes = leftFreeTimes;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getUsedBuyTimes() {
        return this.usedBuyTimes;
    }

    public void setUsedBuyTimes(int usedBuyTimes) {
        this.usedBuyTimes = usedBuyTimes;
    }

    public int getUsedFreeTimes() {
        return this.usedFreeTimes;
    }

    public void setUsedFreeTimes(int usedFreeTimes) {
        this.usedFreeTimes = usedFreeTimes;
    }

    public int getUserBuyTimes() {
        return this.userBuyTimes;
    }

    public void setUserBuyTimes(int userBuyTimes) {
        this.userBuyTimes = userBuyTimes;
    }

    public int getUserFreeTimes() {
        return this.userFreeTimes;
    }

    public void setUserFreeTimes(int userFreeTimes) {
        this.userFreeTimes = userFreeTimes;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
