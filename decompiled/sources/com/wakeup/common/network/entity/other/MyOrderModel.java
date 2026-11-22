package com.wakeup.common.network.entity.other;

import java.util.List;

/* loaded from: classes2.dex */
public class MyOrderModel {
    private Double androidOrderPrice;
    private String currencyCode;
    private String currencySymbol;
    private int dialId;
    private String majorVersion;
    private String methodCode;
    private long orderId;
    private String orderName;
    private String orderNo;
    private String orderPayType;
    private String orderStatus;
    private long orderTime;
    private int orderType;
    private double price;
    private List<Integer> productIdList;
    private int screenId;
    private String screenInfo;
    private double virtualPrice;

    public long getOrderTime() {
        return this.orderTime;
    }

    public void setOrderTime(long orderTime) {
        this.orderTime = orderTime;
    }

    public long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return this.orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Double getAndroidOrderPrice() {
        return this.androidOrderPrice;
    }

    public void setAndroidOrderPrice(Double androidOrderPrice) {
        this.androidOrderPrice = androidOrderPrice;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderPayType() {
        return this.orderPayType;
    }

    public void setOrderPayType(String orderPayType) {
        this.orderPayType = orderPayType;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getOrderType() {
        return this.orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public double getPrice() {
        return this.price;
    }

    public void setMethodCode(String methodCode) {
        this.methodCode = methodCode;
    }

    public double getVirtualPrice() {
        return this.virtualPrice;
    }

    public void setVirtualPrice(double virtualPrice) {
        this.virtualPrice = virtualPrice;
    }

    public String getMethodCode() {
        return this.methodCode;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDialId(int dialId) {
        this.dialId = dialId;
    }

    public int getDialId() {
        return this.dialId;
    }

    public void setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
    }

    public String getMajorVersion() {
        return this.majorVersion;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public int getScreenId() {
        return this.screenId;
    }

    public void setScreenInfo(String screenInfo) {
        this.screenInfo = screenInfo;
    }

    public String getScreenInfo() {
        return this.screenInfo;
    }

    public void setProductIdList(List<Integer> productIdList) {
        this.productIdList = productIdList;
    }

    public List<Integer> getProductIdList() {
        return this.productIdList;
    }
}
