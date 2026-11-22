package com.qumeng.overseas.advlib.trdparty.unionset.network;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class SlotIDItemConfigEntity implements Serializable {

    @JSONBeanFrm.a(fieldname = "auto_click_limited_count")
    public int autoClickLimitedCount;

    @JSONBeanFrm.a(fieldname = "dsp_adx_fetch")
    public int dspAdxFetch;

    @JSONBeanFrm.a(fieldname = "dsp_name")
    public String dspName;
    public int interaction;

    @JSONBeanFrm.a(fieldname = "is_on")
    public int isOn;

    @JSONBeanFrm.a(fieldname = "limit_price")
    public double limitPrice;

    @JSONBeanFrm.a(fieldname = "put_type")
    public int putType;

    @JSONBeanFrm.a(fieldname = "retry_number")
    public int retryNumber;

    @JSONBeanFrm.a(fieldname = "slotid")
    public String slotid;

    @JSONBeanFrm.a(fieldname = "styleid")
    public int styleid;

    @JSONBeanFrm.a(fieldname = FirebaseAnalytics.Param.DISCOUNT)
    public int discount = 100;

    @JSONBeanFrm.a(fieldname = "cache_req_timeout")
    public int cacheReqTimeout = 5000;

    @JSONBeanFrm.a(fieldname = "timeout")
    public int timeout = 2000;

    @JSONBeanFrm.a(fieldname = "ad_type")
    public int adType = -1;

    @JSONBeanFrm.a(fieldname = "ad_count")
    public int adCount = 1;

    @JSONBeanFrm.a(fieldname = "config_cpm")
    public double configCpm = -1.0d;

    @JSONBeanFrm.a(fieldname = "is_direct")
    public int isDirect = 0;

    @JSONBeanFrm.a(fieldname = "priority")
    public int priority = 1;

    @JSONBeanFrm.a(fieldname = "ad_convert_video_type")
    public int adConvertVideoType = 0;

    @JSONBeanFrm.a(fieldname = "ad_convert_video_time")
    public int adConvertVideoTime = 15;

    @JSONBeanFrm.a(fieldname = "ad_viewnow_btn_switch")
    public int adViewNowBtnSwitch = 0;

    public static SlotIDItemConfigEntity generateDefaultEntity(String str) {
        SlotIDItemConfigEntity slotIDItemConfigEntity = new SlotIDItemConfigEntity();
        slotIDItemConfigEntity.setSlotid(str);
        slotIDItemConfigEntity.setIsOn(1);
        slotIDItemConfigEntity.setRetryNumber(1);
        slotIDItemConfigEntity.setDiscount(100);
        return slotIDItemConfigEntity;
    }

    public int getAdConvertVideoTime() {
        return this.adConvertVideoTime;
    }

    public int getAdConvertVideoType() {
        return this.adConvertVideoType;
    }

    public int getAdCount() {
        return this.adCount;
    }

    public int getAdType() {
        return this.adType;
    }

    public int getAdViewNowBtnSwitch() {
        return this.adViewNowBtnSwitch;
    }

    public int getAutoClickLimitedCount() {
        return this.autoClickLimitedCount;
    }

    public int getDiscount() {
        return this.discount;
    }

    public int getDspAdxFetch() {
        return this.dspAdxFetch;
    }

    public String getDspName() {
        return this.dspName;
    }

    public int getInteraction() {
        return this.interaction;
    }

    public int getIsOn() {
        return this.isOn;
    }

    public double getLimitPrice() {
        return this.limitPrice;
    }

    public int getPriority() {
        return this.priority;
    }

    public int getPutType() {
        return this.putType;
    }

    public int getRetryNumber() {
        return this.retryNumber;
    }

    public String getSlotid() {
        return this.slotid;
    }

    public int getStyleid() {
        return this.styleid;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public void setAdConvertVideoTime(int i) {
        this.adConvertVideoTime = i;
    }

    public void setAdConvertVideoType(int i) {
        this.adConvertVideoType = i;
    }

    public void setAdCount(int i) {
        this.adCount = i;
    }

    public void setAdType(int i) {
        this.adType = i;
    }

    public void setAdViewNowBtnSwitch(int i) {
        this.adViewNowBtnSwitch = i;
    }

    public void setAutoClickLimitedCount(int i) {
        this.autoClickLimitedCount = i;
    }

    public void setDiscount(int i) {
        this.discount = i;
    }

    public void setDspAdxFetch(int i) {
        this.dspAdxFetch = i;
    }

    public void setDspName(String str) {
        this.dspName = str;
    }

    public void setInteraction(int i) {
        this.interaction = i;
    }

    public void setIsOn(int i) {
        this.isOn = i;
    }

    public void setLimitPrice(int i) {
        this.limitPrice = i;
    }

    public void setPutType(int i) {
        this.putType = i;
    }

    public void setRetryNumber(int i) {
        this.retryNumber = i;
    }

    public void setSlotid(String str) {
        this.slotid = str;
    }

    public void setStyleid(int i) {
        this.styleid = i;
    }
}
