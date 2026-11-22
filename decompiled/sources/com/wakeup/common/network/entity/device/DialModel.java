package com.wakeup.common.network.entity.device;

import com.wakeup.common.network.entity.device.dial.DialPromotionBannerModel;
import com.wakeup.common.utils.AppPath;
import com.wakeup.common.utils.NumberUtils;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class DialModel implements Serializable {
    private int bonusPrice;
    private String countryCode;
    private String createTime;
    private String currencyCode;
    private String currencySymbol;
    private String described;
    private float dollar;
    private int downNum;
    private int equipmentId;
    private int fileSize;
    private String fileUrl;

    /* renamed from: id, reason: collision with root package name */
    private int f14201id;
    private String imgUrl;
    private int isPurchased;
    private int isStep;
    private Integer ladderLevel;
    private Float ladderPrice;
    private double localPrice;
    private String mac;
    private String majorVersion;
    private String name;
    private Float originalPrice;
    private int packageType;
    private float price;
    private DialPromotionBannerModel promotion;
    private int sourceType;
    private int type;
    private String md5Result = "";
    private int progress = -1;

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDescribed() {
        return this.described;
    }

    public void setDescribed(String described) {
        this.described = described;
    }

    public int getDownNum() {
        return this.downNum;
    }

    public void setDownNum(int downNum) {
        this.downNum = downNum;
    }

    public int getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileUrl() {
        return this.fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public int getId() {
        return this.f14201id;
    }

    public void setId(int id2) {
        this.f14201id = id2;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getIsStep() {
        return this.isStep;
    }

    public void setIsStep(int isStep) {
        this.isStep = isStep;
    }

    public int getIsPurchased() {
        return this.isPurchased;
    }

    public void setIsPurchased(int isPurchased) {
        this.isPurchased = isPurchased;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getSourceType() {
        return this.sourceType;
    }

    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getProgress() {
        return this.progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getEquipmentId() {
        return this.equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public void setPackageType(int packageType) {
        this.packageType = packageType;
    }

    public int getMajorVersion() {
        try {
            return NumberUtils.parseInt(this.majorVersion.trim());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public void setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
    }

    public float getDollar() {
        return this.dollar;
    }

    public void setDollar(float dollar) {
        this.dollar = dollar;
    }

    public String getMac() {
        return this.mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public void setMd5Result(String md5Result) {
        this.md5Result = md5Result;
    }

    public String getMd5Result() {
        return this.md5Result;
    }

    public String getFilePath() {
        return AppPath.getAppOTACache() + getFileName();
    }

    public String getFileName() {
        int packageType = getPackageType();
        if (packageType != 1) {
            if (packageType != 2) {
                if (packageType == 3) {
                    return getId() + "_" + getPackageType() + "_dial.dial";
                }
                if (packageType != 4) {
                    if (packageType != 6) {
                        if (packageType != 7) {
                            return "";
                        }
                    }
                }
            }
            return getId() + "_dial.bin";
        }
        return getId() + "_" + getPackageType() + "_dial.zip";
    }

    public int getBonusPrice() {
        return this.bonusPrice;
    }

    public void setBonusPrice(int bonusPrice) {
        this.bonusPrice = bonusPrice;
    }

    public void setLocalPrice(double localPrice) {
        this.localPrice = localPrice;
    }

    public double getLocalPrice() {
        return this.localPrice;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public Float getLadderPrice() {
        return this.ladderPrice;
    }

    public void setLadderPrice(Float ladderPrice) {
        this.ladderPrice = ladderPrice;
    }

    public Float getOriginalPrice() {
        return this.originalPrice;
    }

    public void setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Integer getLadderLevel() {
        return this.ladderLevel;
    }

    public void setLadderLevel(Integer ladderLevel) {
        this.ladderLevel = ladderLevel;
    }

    public DialPromotionBannerModel getPromotion() {
        return this.promotion;
    }

    public void setPromotion(DialPromotionBannerModel promotion) {
        this.promotion = promotion;
    }

    public String toString() {
        return "DialModel{createTime='" + this.createTime + "', described='" + this.described + "', downNum=" + this.downNum + ", fileSize=" + this.fileSize + ", fileUrl='" + this.fileUrl + "', id=" + this.f14201id + ", imgUrl='" + this.imgUrl + "', isStep=" + this.isStep + ", name='" + this.name + "', price=" + this.price + ", bonusPrice=" + this.bonusPrice + ", dollar=" + this.dollar + ", sourceType=" + this.sourceType + ", type=" + this.type + ", equipmentId=" + this.equipmentId + ", packageType=" + this.packageType + ", majorVersion='" + this.majorVersion + "', progress=" + this.progress + ", mac='" + this.mac + "', localPrice='" + this.localPrice + "', currencyCode='" + this.currencyCode + "', currencySymbol='" + this.currencySymbol + "', countryCode='" + this.countryCode + "'}";
    }
}
