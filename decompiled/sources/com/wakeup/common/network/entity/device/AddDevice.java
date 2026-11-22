package com.wakeup.common.network.entity.device;

import android.gov.nist.core.Separators;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddDevice.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006*"}, d2 = {"Lcom/wakeup/common/network/entity/device/AddDevice;", "", "bluetoothName", "", "code", "locale", "mac", "sn", "version", "supports", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBluetoothName", "()Ljava/lang/String;", "setBluetoothName", "(Ljava/lang/String;)V", "getCode", "setCode", "getLocale", "setLocale", "getMac", "setMac", "getSn", "setSn", MobileAdsBridge.versionMethodName, "setVersion", "getSupports", "setSupports", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AddDevice {
    private String bluetoothName;
    private String code;
    private String locale;
    private String mac;
    private String sn;
    private String supports;
    private String version;

    public static /* synthetic */ AddDevice copy$default(AddDevice addDevice, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addDevice.bluetoothName;
        }
        if ((i & 2) != 0) {
            str2 = addDevice.code;
        }
        if ((i & 4) != 0) {
            str3 = addDevice.locale;
        }
        if ((i & 8) != 0) {
            str4 = addDevice.mac;
        }
        if ((i & 16) != 0) {
            str5 = addDevice.sn;
        }
        if ((i & 32) != 0) {
            str6 = addDevice.version;
        }
        if ((i & 64) != 0) {
            str7 = addDevice.supports;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return addDevice.copy(str, str2, str11, str4, str10, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBluetoothName() {
        return this.bluetoothName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    /* renamed from: component6, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSupports() {
        return this.supports;
    }

    public final AddDevice copy(String bluetoothName, String code, String locale, String mac, String sn, String version, String supports) {
        Intrinsics.checkNotNullParameter(bluetoothName, "bluetoothName");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(supports, "supports");
        return new AddDevice(bluetoothName, code, locale, mac, sn, version, supports);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddDevice)) {
            return false;
        }
        AddDevice addDevice = (AddDevice) other;
        return Intrinsics.areEqual(this.bluetoothName, addDevice.bluetoothName) && Intrinsics.areEqual(this.code, addDevice.code) && Intrinsics.areEqual(this.locale, addDevice.locale) && Intrinsics.areEqual(this.mac, addDevice.mac) && Intrinsics.areEqual(this.sn, addDevice.sn) && Intrinsics.areEqual(this.version, addDevice.version) && Intrinsics.areEqual(this.supports, addDevice.supports);
    }

    public int hashCode() {
        return (((((((((((this.bluetoothName.hashCode() * 31) + this.code.hashCode()) * 31) + this.locale.hashCode()) * 31) + this.mac.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.version.hashCode()) * 31) + this.supports.hashCode();
    }

    public String toString() {
        return "AddDevice(bluetoothName=" + this.bluetoothName + ", code=" + this.code + ", locale=" + this.locale + ", mac=" + this.mac + ", sn=" + this.sn + ", version=" + this.version + ", supports=" + this.supports + Separators.RPAREN;
    }

    public AddDevice(String bluetoothName, String code, String locale, String mac, String sn, String version, String supports) {
        Intrinsics.checkNotNullParameter(bluetoothName, "bluetoothName");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(supports, "supports");
        this.bluetoothName = bluetoothName;
        this.code = code;
        this.locale = locale;
        this.mac = mac;
        this.sn = sn;
        this.version = version;
        this.supports = supports;
    }

    public final String getBluetoothName() {
        return this.bluetoothName;
    }

    public final void setBluetoothName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bluetoothName = str;
    }

    public final String getCode() {
        return this.code;
    }

    public final void setCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.code = str;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final void setLocale(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.locale = str;
    }

    public final String getMac() {
        return this.mac;
    }

    public final void setMac(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mac = str;
    }

    public final String getSn() {
        return this.sn;
    }

    public final void setSn(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sn = str;
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.version = str;
    }

    public final String getSupports() {
        return this.supports;
    }

    public final void setSupports(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.supports = str;
    }
}
