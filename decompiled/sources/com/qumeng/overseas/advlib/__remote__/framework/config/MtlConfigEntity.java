package com.qumeng.overseas.advlib.__remote__.framework.config;

import com.qumeng.overseas.advlib.__remote__.framework.config.bean.BlockFeature;
import com.qumeng.overseas.advlib.__remote__.framework.config.bean.CachePoolConfig;
import com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm;
import com.qumeng.overseas.advlib.trdparty.unionset.network.InciteLandingEntity;
import com.qumeng.overseas.advlib.trdparty.unionset.network.InteractionConfigEntity;
import com.qumeng.overseas.advlib.trdparty.unionset.network.ScanAdBlockerDetection;
import com.qumeng.overseas.advlib.trdparty.unionset.network.SdkDelayConfigEntity;
import com.qumeng.overseas.advlib.trdparty.unionset.network.SwipeEntity;
import com.qumeng.overseas.advlib.trdparty.unionset.network.TwistEntity;
import com.qumeng.overseas.advlib.trdparty.unionset.network.XmlViewControlEntity;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class MtlConfigEntity implements Serializable {

    @JSONBeanFrm.a(fieldname = "banner_refresh_time")
    public int bannerRefreshTime;
    public BlockFeature blockFeature;

    @JSONBeanFrm.a(fieldname = "cache_pool")
    public CachePoolConfig cachePool;

    @JSONBeanFrm.a(fieldname = "incite_landing")
    public InciteLandingEntity inciteLandingEntity;

    @JSONBeanFrm.a(fieldname = "incite_video_change_slotid")
    public String inciteVideoChangeSlotid;

    @JSONBeanFrm.a(fieldname = "interaction_config")
    public InteractionConfigEntity interactionConfigEntity;

    @JSONBeanFrm.a(fieldname = "preplayAd_skipbtn_showtime")
    public int prePlayAdSkipBtnShowtime;

    @JSONBeanFrm.a(fieldname = "residual_cache_time")
    public int residualCacheTime;

    @JSONBeanFrm.a(fieldname = "scan_ad_blocker_detection")
    public ScanAdBlockerDetection scanAdBlockerDetection;

    @JSONBeanFrm.a(fieldname = "sdk_delay_init_config")
    public SdkDelayConfigEntity sdkDelayInitConfig;

    @JSONBeanFrm.a(fieldname = "sdk_delay_init_time")
    public int sdkDelayInitTime;

    @JSONBeanFrm.a(fieldname = "splash_countdown_time")
    public int splashCountdownTime;

    @JSONBeanFrm.a(fieldname = "swipe")
    public SwipeEntity swipe;

    @JSONBeanFrm.a(fieldname = "total_cache_time")
    public int totalCacheTime;

    @JSONBeanFrm.a(fieldname = "twist")
    public TwistEntity twist;

    @JSONBeanFrm.a(fieldname = "xml_view_visible")
    public XmlViewControlEntity xmlViewControlEntity;

    @JSONBeanFrm.a(fieldname = "switch_error_notice")
    public int switchErrorNotice = 1;

    @JSONBeanFrm.a(fieldname = "switch_req_report")
    public int switchReqReport = 0;

    @JSONBeanFrm.a(fieldname = "switch_crash_default_monitor")
    public int switchCrashDefaultMonitor = 0;

    @JSONBeanFrm.a(fieldname = "switch_win_loss_notice")
    public int switchWinLossNotice = 0;

    @JSONBeanFrm.a(fieldname = "sdk_init_failed_forbid_request")
    public int sdkInitFailedForbidRequest = 0;

    @JSONBeanFrm.a(fieldname = "anti_fraud_report_switch")
    public int antiFraudReportSwitch = 0;

    @JSONBeanFrm.a(fieldname = "anti_fraud_report_rate")
    public int antiFraudReportRate = 2;

    @JSONBeanFrm.a(fieldname = "config_md5")
    public String configMd5 = "";

    public int getAntiFraudReportRate() {
        return this.antiFraudReportRate;
    }

    public int getAntiFraudReportSwitch() {
        return this.antiFraudReportSwitch;
    }

    public int getBannerRefreshTime() {
        return this.bannerRefreshTime;
    }

    public BlockFeature getBlockFeature() {
        return this.blockFeature;
    }

    public CachePoolConfig getCachePool() {
        return this.cachePool;
    }

    public String getConfigMd5() {
        return this.configMd5;
    }

    public InciteLandingEntity getInciteLandingEntity() {
        return this.inciteLandingEntity;
    }

    public String getInciteVideoChangeSlotid() {
        return this.inciteVideoChangeSlotid;
    }

    public InteractionConfigEntity getInteractionConfigEntity() {
        return this.interactionConfigEntity;
    }

    public int getPrePlayAdSkipBtnShowtime() {
        return this.prePlayAdSkipBtnShowtime;
    }

    public int getResidualCacheTime() {
        return this.residualCacheTime;
    }

    public ScanAdBlockerDetection getScanAdBlockerDetection() {
        return this.scanAdBlockerDetection;
    }

    public SdkDelayConfigEntity getSdkDelayInitConfig() {
        return this.sdkDelayInitConfig;
    }

    public int getSdkDelayInitTime() {
        return this.sdkDelayInitTime;
    }

    public int getSdkInitFailedForbidRequest() {
        return this.sdkInitFailedForbidRequest;
    }

    public int getSplashCountdownTime() {
        return this.splashCountdownTime;
    }

    public SwipeEntity getSwipe() {
        return this.swipe;
    }

    public int getSwitchCrashDefaultMonitor() {
        return this.switchCrashDefaultMonitor;
    }

    public int getSwitchErrorNotice() {
        return this.switchErrorNotice;
    }

    public int getSwitchReqReport() {
        return this.switchReqReport;
    }

    public int getSwitchWinLossNotice() {
        return this.switchWinLossNotice;
    }

    public int getTotalCacheTime() {
        return this.totalCacheTime;
    }

    public TwistEntity getTwist() {
        return this.twist;
    }

    public XmlViewControlEntity getXmlViewControlEntity() {
        return this.xmlViewControlEntity;
    }

    public void setBannerRefreshTime(int i) {
        this.bannerRefreshTime = i;
    }

    public void setConfigMd5(String str) {
        this.configMd5 = str;
    }

    public void setResidualCacheTime(int i) {
        this.residualCacheTime = i;
    }

    public void setSdkDelayInitConfig(SdkDelayConfigEntity sdkDelayConfigEntity) {
        this.sdkDelayInitConfig = sdkDelayConfigEntity;
    }

    public void setSdkDelayInitTime(int i) {
        this.sdkDelayInitTime = i;
    }

    public void setSdkInitFailedForbidRequest(int i) {
        this.sdkInitFailedForbidRequest = i;
    }

    public void setSplashCountdownTime(int i) {
        this.splashCountdownTime = i;
    }

    public void setSwipe(SwipeEntity swipeEntity) {
        this.swipe = swipeEntity;
    }

    public void setTotalCacheTime(int i) {
        this.totalCacheTime = i;
    }

    public void setTwist(TwistEntity twistEntity) {
        this.twist = twistEntity;
    }
}
