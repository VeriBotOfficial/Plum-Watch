package com.wakeup.common.network.entity.other;

import android.gov.nist.core.Separators;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MConfig.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/wakeup/common/network/entity/other/MConfig;", "", "version", "", "isForeground", "funTestUrl", "", "benefitsUrl", "wechatNats", "", "<init>", "(IILjava/lang/String;Ljava/lang/String;Z)V", MobileAdsBridge.versionMethodName, "()I", "getFunTestUrl", "()Ljava/lang/String;", "getBenefitsUrl", "getWechatNats", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MConfig {
    private final String benefitsUrl;
    private final String funTestUrl;
    private final int isForeground;
    private final int version;
    private final boolean wechatNats;

    public static /* synthetic */ MConfig copy$default(MConfig mConfig, int i, int i2, String str, String str2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = mConfig.version;
        }
        if ((i3 & 2) != 0) {
            i2 = mConfig.isForeground;
        }
        if ((i3 & 4) != 0) {
            str = mConfig.funTestUrl;
        }
        if ((i3 & 8) != 0) {
            str2 = mConfig.benefitsUrl;
        }
        if ((i3 & 16) != 0) {
            z = mConfig.wechatNats;
        }
        boolean z2 = z;
        String str3 = str;
        return mConfig.copy(i, i2, str3, str2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIsForeground() {
        return this.isForeground;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFunTestUrl() {
        return this.funTestUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBenefitsUrl() {
        return this.benefitsUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getWechatNats() {
        return this.wechatNats;
    }

    public final MConfig copy(int version, int isForeground, String funTestUrl, String benefitsUrl, boolean wechatNats) {
        return new MConfig(version, isForeground, funTestUrl, benefitsUrl, wechatNats);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MConfig)) {
            return false;
        }
        MConfig mConfig = (MConfig) other;
        return this.version == mConfig.version && this.isForeground == mConfig.isForeground && Intrinsics.areEqual(this.funTestUrl, mConfig.funTestUrl) && Intrinsics.areEqual(this.benefitsUrl, mConfig.benefitsUrl) && this.wechatNats == mConfig.wechatNats;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.version) * 31) + Integer.hashCode(this.isForeground)) * 31;
        String str = this.funTestUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.benefitsUrl;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.wechatNats);
    }

    public String toString() {
        return "MConfig(version=" + this.version + ", isForeground=" + this.isForeground + ", funTestUrl=" + this.funTestUrl + ", benefitsUrl=" + this.benefitsUrl + ", wechatNats=" + this.wechatNats + Separators.RPAREN;
    }

    public MConfig(int i, int i2, String str, String str2, boolean z) {
        this.version = i;
        this.isForeground = i2;
        this.funTestUrl = str;
        this.benefitsUrl = str2;
        this.wechatNats = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MConfig(int r2, int r3, java.lang.String r4, java.lang.String r5, boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L6
            r4 = r0
        L6:
            r7 = r7 & 8
            if (r7 == 0) goto Ld
            r7 = r6
            r6 = r0
            goto Lf
        Ld:
            r7 = r6
            r6 = r5
        Lf:
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.network.entity.other.MConfig.<init>(int, int, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final int getVersion() {
        return this.version;
    }

    public final int isForeground() {
        return this.isForeground;
    }

    public final String getFunTestUrl() {
        return this.funTestUrl;
    }

    public final String getBenefitsUrl() {
        return this.benefitsUrl;
    }

    public final boolean getWechatNats() {
        return this.wechatNats;
    }
}
