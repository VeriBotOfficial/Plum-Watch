package com.wakeup.howear;

import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.qumeng.overseas.advlib.core.IMultiAdObject;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdExtendInfo.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B?\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0002\u0010\fJ\b\u0010#\u001a\u00020\u0007H\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011¨\u0006$"}, d2 = {"Lcom/wakeup/howear/AdsEyeInfo;", "", "<init>", "()V", "adInfo", "Lcom/qumeng/overseas/advlib/core/IMultiAdObject;", WiseOpenHianalyticsData.UNION_COSTTIME, "", "eCPM", "", "platform", "network", "(Lcom/qumeng/overseas/advlib/core/IMultiAdObject;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V", "adm", "getAdm", "()Ljava/lang/String;", "setAdm", "(Ljava/lang/String;)V", "getECPM", "()D", "setECPM", "(D)V", "extraInfoMap", "", "Ljava/lang/Object;", "getExtraInfoMap", "()Ljava/util/Map;", "setExtraInfoMap", "(Ljava/util/Map;)V", "getCostTime", "setCostTime", "getPlatform", "setPlatform", "getNetwork", "setNetwork", "toString", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdsEyeInfo {
    private String adm;
    private String costTime;
    private double eCPM;
    private Map<String, ? extends Object> extraInfoMap;
    private String network;
    private String platform;

    public AdsEyeInfo() {
        this.adm = "";
        this.costTime = "";
        this.platform = "";
        this.network = "";
    }

    public final String getAdm() {
        return this.adm;
    }

    public final void setAdm(String str) {
        this.adm = str;
    }

    public final double getECPM() {
        return this.eCPM;
    }

    public final void setECPM(double d) {
        this.eCPM = d;
    }

    public final Map<String, Object> getExtraInfoMap() {
        return this.extraInfoMap;
    }

    public final void setExtraInfoMap(Map<String, ? extends Object> map) {
        this.extraInfoMap = map;
    }

    public final String getCostTime() {
        return this.costTime;
    }

    public final void setCostTime(String str) {
        this.costTime = str;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final void setPlatform(String str) {
        this.platform = str;
    }

    public final String getNetwork() {
        return this.network;
    }

    public final void setNetwork(String str) {
        this.network = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsEyeInfo(IMultiAdObject adInfo, String str, double d, String str2, String str3) {
        this();
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.eCPM = adInfo.getECPM();
        String adm = adInfo.getAdm();
        this.adm = adm == null ? "" : adm;
        this.eCPM = d;
        this.extraInfoMap = adInfo.getExtraInfo();
        this.costTime = str == null ? "" : str;
        this.platform = str2 == null ? "" : str2;
        this.network = str3 == null ? "" : str3;
    }

    public /* synthetic */ AdsEyeInfo(IMultiAdObject iMultiAdObject, String str, double d, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iMultiAdObject, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3);
    }

    public String toString() {
        return "{adm=" + this.adm + ",  eCPM=" + this.eCPM + ", extraInfoMap=" + this.extraInfoMap + ",costTime=" + this.costTime + ", platform=" + this.platform + ", network=" + this.network + "}";
    }
}
