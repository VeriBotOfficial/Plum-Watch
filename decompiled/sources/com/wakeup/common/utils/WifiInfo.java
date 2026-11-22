package com.wakeup.common.utils;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: WifiUtils.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/utils/WifiInfo;", "Ljava/io/Serializable;", "ssid", "", "capabilities", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSsid", "()Ljava/lang/String;", "setSsid", "(Ljava/lang/String;)V", "getCapabilities", "pwd", "getPwd", "setPwd", "isWifiSecure", "", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WifiInfo implements Serializable {
    private final String capabilities;
    private String pwd;
    private String ssid;

    public static /* synthetic */ WifiInfo copy$default(WifiInfo wifiInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wifiInfo.ssid;
        }
        if ((i & 2) != 0) {
            str2 = wifiInfo.capabilities;
        }
        return wifiInfo.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSsid() {
        return this.ssid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCapabilities() {
        return this.capabilities;
    }

    public final WifiInfo copy(String ssid, String capabilities) {
        Intrinsics.checkNotNullParameter(ssid, "ssid");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        return new WifiInfo(ssid, capabilities);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WifiInfo)) {
            return false;
        }
        WifiInfo wifiInfo = (WifiInfo) other;
        return Intrinsics.areEqual(this.ssid, wifiInfo.ssid) && Intrinsics.areEqual(this.capabilities, wifiInfo.capabilities);
    }

    public int hashCode() {
        return (this.ssid.hashCode() * 31) + this.capabilities.hashCode();
    }

    public String toString() {
        return "WifiInfo(ssid=" + this.ssid + ", capabilities=" + this.capabilities + Separators.RPAREN;
    }

    public WifiInfo(String ssid, String capabilities) {
        Intrinsics.checkNotNullParameter(ssid, "ssid");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        this.ssid = ssid;
        this.capabilities = capabilities;
    }

    public final String getSsid() {
        return this.ssid;
    }

    public final void setSsid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ssid = str;
    }

    public final String getCapabilities() {
        return this.capabilities;
    }

    public final String getPwd() {
        return this.pwd;
    }

    public final void setPwd(String str) {
        this.pwd = str;
    }

    public final boolean isWifiSecure() {
        return StringsKt.contains$default((CharSequence) this.capabilities, (CharSequence) "WEP", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) this.capabilities, (CharSequence) "WPA", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) this.capabilities, (CharSequence) "WPA2", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) this.capabilities, (CharSequence) "WPA3", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) this.capabilities, (CharSequence) "PSK", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) this.capabilities, (CharSequence) "EAP", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) this.capabilities, (CharSequence) "SAE", false, 2, (Object) null);
    }
}
