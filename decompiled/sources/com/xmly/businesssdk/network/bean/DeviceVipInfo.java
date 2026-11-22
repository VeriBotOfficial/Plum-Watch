package com.xmly.businesssdk.network.bean;

import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.config.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceVipInfo.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/xmly/businesssdk/network/bean/DeviceVipInfo;", "", "subscribeActivity", "", "(Ljava/lang/String;)V", "getSubscribeActivity", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DeviceVipInfo {

    @SerializedName("subscribe_activity")
    private final String subscribeActivity;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceVipInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public DeviceVipInfo(String str) {
        this.subscribeActivity = str;
    }

    public static /* synthetic */ DeviceVipInfo copy$default(DeviceVipInfo deviceVipInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceVipInfo.subscribeActivity;
        }
        return deviceVipInfo.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSubscribeActivity() {
        return this.subscribeActivity;
    }

    public final DeviceVipInfo copy(String subscribeActivity) {
        return new DeviceVipInfo(subscribeActivity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeviceVipInfo) && Intrinsics.areEqual(this.subscribeActivity, ((DeviceVipInfo) other).subscribeActivity);
    }

    public final String getSubscribeActivity() {
        return this.subscribeActivity;
    }

    public int hashCode() {
        String str = this.subscribeActivity;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return c.a(com.xmly.businesssdk.c.a("DeviceVipInfo(subscribeActivity="), this.subscribeActivity, ')');
    }

    public /* synthetic */ DeviceVipInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
