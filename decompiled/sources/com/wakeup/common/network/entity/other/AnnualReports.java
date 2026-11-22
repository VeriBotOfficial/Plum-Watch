package com.wakeup.common.network.entity.other;

import android.gov.nist.core.Separators;
import com.wakeup.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnnualBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003Jm\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016¨\u00067"}, d2 = {"Lcom/wakeup/common/network/entity/other/AnnualReports;", "", "is_open", "", "ios_banner_zh", "", "ios_banner_en", "android_banner_zh", "android_banner_en", "url", "ios_tracking_number", Constants.SPKey.ANDROID_TRACKING_NUMBER, "url_zh", "url_en", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "()I", "set_open", "(I)V", "getIos_banner_zh", "()Ljava/lang/String;", "setIos_banner_zh", "(Ljava/lang/String;)V", "getIos_banner_en", "setIos_banner_en", "getAndroid_banner_zh", "setAndroid_banner_zh", "getAndroid_banner_en", "setAndroid_banner_en", "getUrl", "setUrl", "getIos_tracking_number", "setIos_tracking_number", "getAndroid_tracking_number", "setAndroid_tracking_number", "getUrl_zh", "setUrl_zh", "getUrl_en", "setUrl_en", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AnnualReports {
    private String android_banner_en;
    private String android_banner_zh;
    private int android_tracking_number;
    private String ios_banner_en;
    private String ios_banner_zh;
    private int ios_tracking_number;
    private int is_open;
    private String url;
    private String url_en;
    private String url_zh;

    public AnnualReports() {
        this(0, null, null, null, null, null, 0, 0, null, null, 1023, null);
    }

    public static /* synthetic */ AnnualReports copy$default(AnnualReports annualReports, int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, String str7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = annualReports.is_open;
        }
        if ((i4 & 2) != 0) {
            str = annualReports.ios_banner_zh;
        }
        if ((i4 & 4) != 0) {
            str2 = annualReports.ios_banner_en;
        }
        if ((i4 & 8) != 0) {
            str3 = annualReports.android_banner_zh;
        }
        if ((i4 & 16) != 0) {
            str4 = annualReports.android_banner_en;
        }
        if ((i4 & 32) != 0) {
            str5 = annualReports.url;
        }
        if ((i4 & 64) != 0) {
            i2 = annualReports.ios_tracking_number;
        }
        if ((i4 & 128) != 0) {
            i3 = annualReports.android_tracking_number;
        }
        if ((i4 & 256) != 0) {
            str6 = annualReports.url_zh;
        }
        if ((i4 & 512) != 0) {
            str7 = annualReports.url_en;
        }
        String str8 = str6;
        String str9 = str7;
        int i5 = i2;
        int i6 = i3;
        String str10 = str4;
        String str11 = str5;
        return annualReports.copy(i, str, str2, str3, str10, str11, i5, i6, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIs_open() {
        return this.is_open;
    }

    /* renamed from: component10, reason: from getter */
    public final String getUrl_en() {
        return this.url_en;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIos_banner_zh() {
        return this.ios_banner_zh;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIos_banner_en() {
        return this.ios_banner_en;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAndroid_banner_zh() {
        return this.android_banner_zh;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAndroid_banner_en() {
        return this.android_banner_en;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component7, reason: from getter */
    public final int getIos_tracking_number() {
        return this.ios_tracking_number;
    }

    /* renamed from: component8, reason: from getter */
    public final int getAndroid_tracking_number() {
        return this.android_tracking_number;
    }

    /* renamed from: component9, reason: from getter */
    public final String getUrl_zh() {
        return this.url_zh;
    }

    public final AnnualReports copy(int is_open, String ios_banner_zh, String ios_banner_en, String android_banner_zh, String android_banner_en, String url, int ios_tracking_number, int android_tracking_number, String url_zh, String url_en) {
        Intrinsics.checkNotNullParameter(ios_banner_zh, "ios_banner_zh");
        Intrinsics.checkNotNullParameter(ios_banner_en, "ios_banner_en");
        Intrinsics.checkNotNullParameter(android_banner_zh, "android_banner_zh");
        Intrinsics.checkNotNullParameter(android_banner_en, "android_banner_en");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(url_zh, "url_zh");
        Intrinsics.checkNotNullParameter(url_en, "url_en");
        return new AnnualReports(is_open, ios_banner_zh, ios_banner_en, android_banner_zh, android_banner_en, url, ios_tracking_number, android_tracking_number, url_zh, url_en);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnualReports)) {
            return false;
        }
        AnnualReports annualReports = (AnnualReports) other;
        return this.is_open == annualReports.is_open && Intrinsics.areEqual(this.ios_banner_zh, annualReports.ios_banner_zh) && Intrinsics.areEqual(this.ios_banner_en, annualReports.ios_banner_en) && Intrinsics.areEqual(this.android_banner_zh, annualReports.android_banner_zh) && Intrinsics.areEqual(this.android_banner_en, annualReports.android_banner_en) && Intrinsics.areEqual(this.url, annualReports.url) && this.ios_tracking_number == annualReports.ios_tracking_number && this.android_tracking_number == annualReports.android_tracking_number && Intrinsics.areEqual(this.url_zh, annualReports.url_zh) && Intrinsics.areEqual(this.url_en, annualReports.url_en);
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.is_open) * 31) + this.ios_banner_zh.hashCode()) * 31) + this.ios_banner_en.hashCode()) * 31) + this.android_banner_zh.hashCode()) * 31) + this.android_banner_en.hashCode()) * 31) + this.url.hashCode()) * 31) + Integer.hashCode(this.ios_tracking_number)) * 31) + Integer.hashCode(this.android_tracking_number)) * 31) + this.url_zh.hashCode()) * 31) + this.url_en.hashCode();
    }

    public String toString() {
        return "AnnualReports(is_open=" + this.is_open + ", ios_banner_zh=" + this.ios_banner_zh + ", ios_banner_en=" + this.ios_banner_en + ", android_banner_zh=" + this.android_banner_zh + ", android_banner_en=" + this.android_banner_en + ", url=" + this.url + ", ios_tracking_number=" + this.ios_tracking_number + ", android_tracking_number=" + this.android_tracking_number + ", url_zh=" + this.url_zh + ", url_en=" + this.url_en + Separators.RPAREN;
    }

    public AnnualReports(int i, String ios_banner_zh, String ios_banner_en, String android_banner_zh, String android_banner_en, String url, int i2, int i3, String url_zh, String url_en) {
        Intrinsics.checkNotNullParameter(ios_banner_zh, "ios_banner_zh");
        Intrinsics.checkNotNullParameter(ios_banner_en, "ios_banner_en");
        Intrinsics.checkNotNullParameter(android_banner_zh, "android_banner_zh");
        Intrinsics.checkNotNullParameter(android_banner_en, "android_banner_en");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(url_zh, "url_zh");
        Intrinsics.checkNotNullParameter(url_en, "url_en");
        this.is_open = i;
        this.ios_banner_zh = ios_banner_zh;
        this.ios_banner_en = ios_banner_en;
        this.android_banner_zh = android_banner_zh;
        this.android_banner_en = android_banner_en;
        this.url = url;
        this.ios_tracking_number = i2;
        this.android_tracking_number = i3;
        this.url_zh = url_zh;
        this.url_en = url_en;
    }

    public /* synthetic */ AnnualReports(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, String str7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? "" : str5, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) != 0 ? 0 : i3, (i4 & 256) != 0 ? "" : str6, (i4 & 512) != 0 ? "" : str7);
    }

    public final int is_open() {
        return this.is_open;
    }

    public final void set_open(int i) {
        this.is_open = i;
    }

    public final String getIos_banner_zh() {
        return this.ios_banner_zh;
    }

    public final void setIos_banner_zh(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ios_banner_zh = str;
    }

    public final String getIos_banner_en() {
        return this.ios_banner_en;
    }

    public final void setIos_banner_en(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ios_banner_en = str;
    }

    public final String getAndroid_banner_zh() {
        return this.android_banner_zh;
    }

    public final void setAndroid_banner_zh(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.android_banner_zh = str;
    }

    public final String getAndroid_banner_en() {
        return this.android_banner_en;
    }

    public final void setAndroid_banner_en(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.android_banner_en = str;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    public final int getIos_tracking_number() {
        return this.ios_tracking_number;
    }

    public final void setIos_tracking_number(int i) {
        this.ios_tracking_number = i;
    }

    public final int getAndroid_tracking_number() {
        return this.android_tracking_number;
    }

    public final void setAndroid_tracking_number(int i) {
        this.android_tracking_number = i;
    }

    public final String getUrl_zh() {
        return this.url_zh;
    }

    public final void setUrl_zh(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url_zh = str;
    }

    public final String getUrl_en() {
        return this.url_en;
    }

    public final void setUrl_en(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url_en = str;
    }
}
