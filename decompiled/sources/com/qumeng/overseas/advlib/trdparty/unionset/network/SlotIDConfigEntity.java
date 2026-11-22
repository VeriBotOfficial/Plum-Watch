package com.qumeng.overseas.advlib.trdparty.unionset.network;

import com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes17.dex */
public class SlotIDConfigEntity implements Serializable {

    @JSONBeanFrm.a(fieldname = "auto_click_interval_time")
    public int autoClickIntervalTime;

    @JSONBeanFrm.a(fieldname = "auto_click_rate")
    public double autoClickRate;

    @JSONBeanFrm.a(fieldname = "auto_refresh_time")
    public int autoRefreshTime;

    @JSONBeanFrm.a(fieldname = "cache_enable")
    public int cacheEnable;

    @JSONBeanFrm.a(fieldname = "click_channel_limit")
    public Map<String, Integer> clickChannelLimit;

    @JSONBeanFrm.a(fieldname = "click_pkg_name_limit")
    public Map<String, Integer> clickPkgNameLimit;

    @JSONBeanFrm.a(fieldname = "closebtn_probability")
    public d cptConfig;

    @JSONBeanFrm.a(fieldname = "closebtn_probability_v2")
    public e cptConfigV2;

    @JSONBeanFrm.a(fieldname = "delayed_time_millis")
    public int delayedTimeMillis;

    @JSONBeanFrm.a(fieldname = "dsp_data")
    public List<SlotIDItemConfigEntity> dspData;

    @JSONBeanFrm.a(fieldname = "flags")
    public List<String> dspFlags;

    @JSONBeanFrm.a(fieldname = "dsp_switch")
    public List<String> dspSwitch;

    @JSONBeanFrm.a(fieldname = "max_exposure_per_day")
    public int maxExposurePerTay;

    @JSONBeanFrm.a(fieldname = "min_time_interval")
    public int minTimeInterval;

    @JSONBeanFrm.a(fieldname = "native_next_revenue")
    public k nativeNextRevenue;

    @JSONBeanFrm.a(fieldname = "residual_cache_time")
    public int residualCacheTime;

    @JSONBeanFrm.a(fieldname = "total_cache_time")
    public int totalCacheTime;

    @JSONBeanFrm.a(fieldname = "dsp_timeout")
    public int dspTimeout = 2000;

    @JSONBeanFrm.a(fieldname = "auto_click_duration")
    public int autoClickDuration = 2000;

    @JSONBeanFrm.a(fieldname = "auto_click_start_time")
    public int autoClickStartTime = 2000;

    public int getAutoClickDuration() {
        return this.autoClickDuration;
    }

    public int getAutoClickIntervalTime() {
        return this.autoClickIntervalTime;
    }

    public double getAutoClickRate() {
        return this.autoClickRate;
    }

    public int getAutoClickStartTime() {
        return this.autoClickStartTime;
    }

    public int getAutoRefreshTime() {
        return this.autoRefreshTime;
    }

    public int getCacheEnable() {
        return this.cacheEnable;
    }

    public Map<String, Integer> getClickChannelLimit() {
        return this.clickChannelLimit;
    }

    public Map<String, Integer> getClickPkgNameLimit() {
        return this.clickPkgNameLimit;
    }

    public int getDelayedTimeMillis() {
        return this.delayedTimeMillis;
    }

    public List<SlotIDItemConfigEntity> getDspData() {
        return this.dspData;
    }

    public List<String> getDspSwitch() {
        return this.dspSwitch;
    }

    public int getDspTimeout() {
        return this.dspTimeout;
    }

    public List<String> getFeatures() {
        return this.dspFlags;
    }

    public int getMaxExposurePerTay() {
        return this.maxExposurePerTay;
    }

    public int getMinTimeInterval() {
        return this.minTimeInterval;
    }

    public k getNativeNextRevenue() {
        return this.nativeNextRevenue;
    }

    public int getResidualCacheTime() {
        return this.residualCacheTime;
    }

    public int getTotalCacheTime() {
        return this.totalCacheTime;
    }

    public void setAutoClickDuration(int i) {
        this.autoClickDuration = i;
    }

    public void setAutoClickIntervalTime(int i) {
        this.autoClickIntervalTime = i;
    }

    public void setAutoClickRate(double d) {
        this.autoClickRate = d;
    }

    public void setAutoClickStartTime(int i) {
        this.autoClickStartTime = i;
    }

    public void setCacheEnable(int i) {
        this.cacheEnable = i;
    }

    public void setClickChannelLimit(Map<String, Integer> map) {
        this.clickChannelLimit = map;
    }

    public void setClickPkgNameLimit(Map<String, Integer> map) {
        this.clickPkgNameLimit = map;
    }

    public void setDelayedTimeMillis(int i) {
        this.delayedTimeMillis = i;
    }

    public void setDspData(List<SlotIDItemConfigEntity> list) {
        this.dspData = list;
    }

    public void setDspSwitch(List<String> list) {
        this.dspSwitch = list;
    }

    public void setDspTimeout(int i) {
        this.dspTimeout = i;
    }

    public void setMaxExposurePerTay(int i) {
        this.maxExposurePerTay = i;
    }

    public void setMinTimeInterval(int i) {
        this.minTimeInterval = i;
    }
}
