package com.qumeng.overseas.advlib.trdparty.unionset.network;

import com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes17.dex */
public class BiddingConfigEntity implements Serializable {

    @JSONBeanFrm.a(fieldname = "awaken_quietly_config")
    public AwakenQuietlyEntity awakenQuietlyEntity;

    @JSONBeanFrm.a(fieldname = "cache_allow_in_background")
    public int cacheAllowInBackground;

    @JSONBeanFrm.a(fieldname = "cache_switch")
    public int cacheSwitch;

    @JSONBeanFrm.a(fieldname = "ctr_vpn_on")
    public int cptVpnSwitch;

    @JSONBeanFrm.a(fieldname = "default_probability")
    public double defaultProbability;

    @JSONBeanFrm.a(fieldname = "dsp_switch")
    public List<String> dspSwitch;

    @JSONBeanFrm.a(fieldname = "dynamic_floor_price_switch")
    public int dynamicFloorPriceSwitch;

    @JSONBeanFrm.a(fieldname = "package_name")
    public String packageName;

    @JSONBeanFrm.a(fieldname = "preload_list")
    public List<n> preloadList;

    @JSONBeanFrm.a(fieldname = "slotid_map")
    public Map<String, SlotIDConfigEntity> slotidMap;

    @JSONBeanFrm.a(fieldname = "swipe")
    public SwipeEntity swipe;

    @JSONBeanFrm.a(fieldname = "twist")
    public TwistEntity twist;

    @JSONBeanFrm.a(fieldname = "cache_interval")
    public int cacheInterval = 60000;

    @JSONBeanFrm.a(fieldname = "media_id")
    public String mediaID = "";

    @JSONBeanFrm.a(fieldname = "config_md5")
    public String configMd5 = "";

    public AwakenQuietlyEntity getAwakenQuietlyEntity() {
        return this.awakenQuietlyEntity;
    }

    public int getCacheAllowInBackground() {
        return this.cacheAllowInBackground;
    }

    public int getCacheInterval() {
        return this.cacheInterval;
    }

    public int getCacheSwitch() {
        return this.cacheSwitch;
    }

    public String getConfigMd5() {
        return this.configMd5;
    }

    public int getCptVpnSwitch() {
        return this.cptVpnSwitch;
    }

    public double getDefaultProbability() {
        return this.defaultProbability;
    }

    public List<String> getDspSwitch() {
        return this.dspSwitch;
    }

    public int getDynamicFloorPriceSwitch() {
        return this.dynamicFloorPriceSwitch;
    }

    public String getMediaID() {
        return this.mediaID;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public List<n> getPreloadList() {
        return this.preloadList;
    }

    public Map<String, SlotIDConfigEntity> getSlotidMap() {
        return this.slotidMap;
    }

    public SwipeEntity getSwipeEntity() {
        return this.swipe;
    }

    public TwistEntity getTwistEntity() {
        return this.twist;
    }

    public void setAwakenQuietlyEntity(AwakenQuietlyEntity awakenQuietlyEntity) {
        this.awakenQuietlyEntity = awakenQuietlyEntity;
    }

    public void setCacheAllowInBackground(int i) {
        this.cacheAllowInBackground = i;
    }

    public void setCacheInterval(int i) {
        this.cacheInterval = i;
    }

    public void setCacheSwitch(int i) {
        this.cacheSwitch = i;
    }

    public void setConfigMd5(String str) {
        this.configMd5 = str;
    }

    public void setDspSwitch(List<String> list) {
        this.dspSwitch = list;
    }

    public void setDynamicFloorPriceSwitch(int i) {
        this.dynamicFloorPriceSwitch = i;
    }

    public void setMediaID(String str) {
        this.mediaID = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPreloadList(List<n> list) {
        this.preloadList = list;
    }

    public void setSlotidMap(Map<String, SlotIDConfigEntity> map) {
        this.slotidMap = map;
    }
}
