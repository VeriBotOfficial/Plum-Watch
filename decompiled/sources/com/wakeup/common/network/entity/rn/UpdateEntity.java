package com.wakeup.common.network.entity.rn;

import android.gov.nist.core.Separators;
import com.anythink.core.d.l;
import com.heytap.mcssdk.constant.b;
import com.umeng.analytics.pro.d;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateEntity.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fHÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003J\u009b\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\rHÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0003HÖ\u0001J\t\u0010;\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0011\u0010\u0013\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!¨\u0006<"}, d2 = {"Lcom/wakeup/common/network/entity/rn/UpdateEntity;", "", "id", "", "appId", "", "appName", b.z, "version", "runtimeVersion", "priority", "entryPageCode", "entryPageId", "", d.t, "", "packageUrl", "status", "createTime", l.a.ac, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;JLjava/util/List;Ljava/lang/String;IJJ)V", "getId", "()I", "getAppId", "()Ljava/lang/String;", "getAppName", "getAppKey", MobileAdsBridge.versionMethodName, "getRuntimeVersion", "getPriority", "getEntryPageCode", "getEntryPageId", "()J", "getPages", "()Ljava/util/List;", "getPackageUrl", "getStatus", "getCreateTime", "getUpdateTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UpdateEntity {
    private final String appId;
    private final String appKey;
    private final String appName;
    private final long createTime;
    private final String entryPageCode;
    private final long entryPageId;
    private final int id;
    private final String packageUrl;
    private final List<String> pages;
    private final int priority;
    private final int runtimeVersion;
    private final int status;
    private final long updateTime;
    private final int version;

    public static /* synthetic */ UpdateEntity copy$default(UpdateEntity updateEntity, int i, String str, String str2, String str3, int i2, int i3, int i4, String str4, long j, List list, String str5, int i5, long j2, long j3, int i6, Object obj) {
        long j4;
        long j5;
        String str6;
        String str7;
        String str8;
        int i7;
        int i8;
        int i9;
        String str9;
        long j6;
        List list2;
        String str10;
        int i10;
        int i11 = (i6 & 1) != 0 ? updateEntity.id : i;
        String str11 = (i6 & 2) != 0 ? updateEntity.appId : str;
        String str12 = (i6 & 4) != 0 ? updateEntity.appName : str2;
        String str13 = (i6 & 8) != 0 ? updateEntity.appKey : str3;
        int i12 = (i6 & 16) != 0 ? updateEntity.version : i2;
        int i13 = (i6 & 32) != 0 ? updateEntity.runtimeVersion : i3;
        int i14 = (i6 & 64) != 0 ? updateEntity.priority : i4;
        String str14 = (i6 & 128) != 0 ? updateEntity.entryPageCode : str4;
        long j7 = (i6 & 256) != 0 ? updateEntity.entryPageId : j;
        List list3 = (i6 & 512) != 0 ? updateEntity.pages : list;
        String str15 = (i6 & 1024) != 0 ? updateEntity.packageUrl : str5;
        int i15 = (i6 & 2048) != 0 ? updateEntity.status : i5;
        int i16 = i11;
        String str16 = str11;
        long j8 = (i6 & 4096) != 0 ? updateEntity.createTime : j2;
        if ((i6 & 8192) != 0) {
            j5 = j8;
            j4 = updateEntity.updateTime;
            str7 = str12;
            str8 = str13;
            i7 = i12;
            i8 = i13;
            i9 = i14;
            str9 = str14;
            j6 = j7;
            list2 = list3;
            str10 = str15;
            i10 = i15;
            str6 = str16;
        } else {
            j4 = j3;
            j5 = j8;
            str6 = str16;
            str7 = str12;
            str8 = str13;
            i7 = i12;
            i8 = i13;
            i9 = i14;
            str9 = str14;
            j6 = j7;
            list2 = list3;
            str10 = str15;
            i10 = i15;
        }
        return updateEntity.copy(i16, str6, str7, str8, i7, i8, i9, str9, j6, list2, str10, i10, j5, j4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final List<String> component10() {
        return this.pages;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPackageUrl() {
        return this.packageUrl;
    }

    /* renamed from: component12, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component13, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component14, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAppKey() {
        return this.appKey;
    }

    /* renamed from: component5, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: component6, reason: from getter */
    public final int getRuntimeVersion() {
        return this.runtimeVersion;
    }

    /* renamed from: component7, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* renamed from: component8, reason: from getter */
    public final String getEntryPageCode() {
        return this.entryPageCode;
    }

    /* renamed from: component9, reason: from getter */
    public final long getEntryPageId() {
        return this.entryPageId;
    }

    public final UpdateEntity copy(int id2, String appId, String appName, String appKey, int version, int runtimeVersion, int priority, String entryPageCode, long entryPageId, List<String> pages, String packageUrl, int status, long createTime, long updateTime) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(entryPageCode, "entryPageCode");
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(packageUrl, "packageUrl");
        return new UpdateEntity(id2, appId, appName, appKey, version, runtimeVersion, priority, entryPageCode, entryPageId, pages, packageUrl, status, createTime, updateTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateEntity)) {
            return false;
        }
        UpdateEntity updateEntity = (UpdateEntity) other;
        return this.id == updateEntity.id && Intrinsics.areEqual(this.appId, updateEntity.appId) && Intrinsics.areEqual(this.appName, updateEntity.appName) && Intrinsics.areEqual(this.appKey, updateEntity.appKey) && this.version == updateEntity.version && this.runtimeVersion == updateEntity.runtimeVersion && this.priority == updateEntity.priority && Intrinsics.areEqual(this.entryPageCode, updateEntity.entryPageCode) && this.entryPageId == updateEntity.entryPageId && Intrinsics.areEqual(this.pages, updateEntity.pages) && Intrinsics.areEqual(this.packageUrl, updateEntity.packageUrl) && this.status == updateEntity.status && this.createTime == updateEntity.createTime && this.updateTime == updateEntity.updateTime;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Integer.hashCode(this.id) * 31) + this.appId.hashCode()) * 31) + this.appName.hashCode()) * 31) + this.appKey.hashCode()) * 31) + Integer.hashCode(this.version)) * 31) + Integer.hashCode(this.runtimeVersion)) * 31) + Integer.hashCode(this.priority)) * 31) + this.entryPageCode.hashCode()) * 31) + Long.hashCode(this.entryPageId)) * 31) + this.pages.hashCode()) * 31) + this.packageUrl.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + Long.hashCode(this.createTime)) * 31) + Long.hashCode(this.updateTime);
    }

    public String toString() {
        return "UpdateEntity(id=" + this.id + ", appId=" + this.appId + ", appName=" + this.appName + ", appKey=" + this.appKey + ", version=" + this.version + ", runtimeVersion=" + this.runtimeVersion + ", priority=" + this.priority + ", entryPageCode=" + this.entryPageCode + ", entryPageId=" + this.entryPageId + ", pages=" + this.pages + ", packageUrl=" + this.packageUrl + ", status=" + this.status + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + Separators.RPAREN;
    }

    public UpdateEntity(int i, String appId, String appName, String appKey, int i2, int i3, int i4, String entryPageCode, long j, List<String> pages, String packageUrl, int i5, long j2, long j3) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(entryPageCode, "entryPageCode");
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(packageUrl, "packageUrl");
        this.id = i;
        this.appId = appId;
        this.appName = appName;
        this.appKey = appKey;
        this.version = i2;
        this.runtimeVersion = i3;
        this.priority = i4;
        this.entryPageCode = entryPageCode;
        this.entryPageId = j;
        this.pages = pages;
        this.packageUrl = packageUrl;
        this.status = i5;
        this.createTime = j2;
        this.updateTime = j3;
    }

    public final int getId() {
        return this.id;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppKey() {
        return this.appKey;
    }

    public final int getVersion() {
        return this.version;
    }

    public final int getRuntimeVersion() {
        return this.runtimeVersion;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getEntryPageCode() {
        return this.entryPageCode;
    }

    public final long getEntryPageId() {
        return this.entryPageId;
    }

    public final List<String> getPages() {
        return this.pages;
    }

    public final String getPackageUrl() {
        return this.packageUrl;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }
}
