package com.xmly.businesssdk.trace.uploader.formatter;

import com.xmly.businesssdk.config.a;
import com.xmly.businesssdk.config.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventFormatter.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xmly/businesssdk/trace/uploader/formatter/ExtData;", "", "brand", "", "isMember", "userid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBrand", "()Ljava/lang/String;", "getUserid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
final /* data */ class ExtData {
    private final String brand;
    private final String isMember;
    private final String userid;

    public ExtData(String brand, String isMember, String userid) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(isMember, "isMember");
        Intrinsics.checkNotNullParameter(userid, "userid");
        this.brand = brand;
        this.isMember = isMember;
        this.userid = userid;
    }

    public static /* synthetic */ ExtData copy$default(ExtData extData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = extData.brand;
        }
        if ((i & 2) != 0) {
            str2 = extData.isMember;
        }
        if ((i & 4) != 0) {
            str3 = extData.userid;
        }
        return extData.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIsMember() {
        return this.isMember;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUserid() {
        return this.userid;
    }

    public final ExtData copy(String brand, String isMember, String userid) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(isMember, "isMember");
        Intrinsics.checkNotNullParameter(userid, "userid");
        return new ExtData(brand, isMember, userid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtData)) {
            return false;
        }
        ExtData extData = (ExtData) other;
        return Intrinsics.areEqual(this.brand, extData.brand) && Intrinsics.areEqual(this.isMember, extData.isMember) && Intrinsics.areEqual(this.userid, extData.userid);
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getUserid() {
        return this.userid;
    }

    public int hashCode() {
        return this.userid.hashCode() + a.a(this.isMember, this.brand.hashCode() * 31, 31);
    }

    public final String isMember() {
        return this.isMember;
    }

    public String toString() {
        return c.a(com.xmly.businesssdk.c.a("ExtData(brand=").append(this.brand).append(", isMember=").append(this.isMember).append(", userid="), this.userid, ')');
    }
}
