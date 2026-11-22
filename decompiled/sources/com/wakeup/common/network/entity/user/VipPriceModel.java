package com.wakeup.common.network.entity.user;

/* loaded from: classes2.dex */
public class VipPriceModel {
    private float androidLocalPrice;
    private float androidPriceCn;
    private float androidPriceEn;
    private String countryCode;
    private String currencySymbol;
    private String giftDayStr;

    /* renamed from: id, reason: collision with root package name */
    private int f14254id;
    private int isExperimentFirst = 1;
    private String membersName;
    private int momberType;
    private float showAndroidLocalPrice;
    private float showAndroidPriceCn;
    private float showAndroidPriceEn;

    public String getGiftDayStr() {
        return this.giftDayStr;
    }

    public void setGiftDayStr(String giftDayStr) {
        this.giftDayStr = giftDayStr;
    }

    public int getId() {
        return this.f14254id;
    }

    public void setId(int id2) {
        this.f14254id = id2;
    }

    public String getMembersName() {
        return this.membersName;
    }

    public void setMembersName(String membersName) {
        this.membersName = membersName;
    }

    public int getMomberType() {
        return this.momberType;
    }

    public void setMomberType(int momberType) {
        this.momberType = momberType;
    }

    public float getAndroidPriceCn() {
        return this.androidPriceCn;
    }

    public void setAndroidPriceCn(float androidPriceCn) {
        this.androidPriceCn = androidPriceCn;
    }

    public float getAndroidPriceEn() {
        return this.androidPriceEn;
    }

    public void setAndroidPriceEn(float androidPriceEn) {
        this.androidPriceEn = androidPriceEn;
    }

    public float getShowAndroidPriceCn() {
        return this.showAndroidPriceCn;
    }

    public void setShowAndroidPriceCn(float showAndroidPriceCn) {
        this.showAndroidPriceCn = showAndroidPriceCn;
    }

    public float getShowAndroidPriceEn() {
        return this.showAndroidPriceEn;
    }

    public void setShowAndroidPriceEn(float showAndroidPriceEn) {
        this.showAndroidPriceEn = showAndroidPriceEn;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public float getShowAndroidLocalPrice() {
        return this.showAndroidLocalPrice;
    }

    public void setShowAndroidLocalPrice(float showAndroidLocalPrice) {
        this.showAndroidLocalPrice = showAndroidLocalPrice;
    }

    public float getAndroidLocalPrice() {
        return this.androidLocalPrice;
    }

    public void setAndroidLocalPrice(float androidLocalPrice) {
        this.androidLocalPrice = androidLocalPrice;
    }

    public int getIsExperimentFirst() {
        return this.isExperimentFirst;
    }

    public void setIsExperimentFirst(int isExperimentFirst) {
        this.isExperimentFirst = isExperimentFirst;
    }
}
