package com.wakeup.common.network.entity.device;

import android.gov.nist.core.Separators;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppMarketEntity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eHÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\u0091\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u0005HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\bHÖ\u0001J\t\u0010;\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u001a\u0010&\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010(¨\u0006<"}, d2 = {"Lcom/wakeup/common/network/entity/device/AppMarketEntity;", "", "id", "", "name", "", "packageName", "typeId", "", "type", "icon", "fileUrl", "fileSize", "viewImageList", "", "summary", "description", "virtualNum", "version", "<init>", "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getPackageName", "getTypeId", "()I", "getType", "getIcon", "getFileUrl", "getFileSize", "getViewImageList", "()Ljava/util/List;", "getSummary", "getDescription", "getVirtualNum", MobileAdsBridge.versionMethodName, "isInstall", "setInstall", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AppMarketEntity {
    private final String description;
    private final long fileSize;
    private final String fileUrl;
    private final String icon;
    private final long id;
    private int isInstall;
    private final String name;
    private final String packageName;
    private final String summary;
    private final String type;
    private final int typeId;
    private final String version;
    private final List<String> viewImageList;
    private final int virtualNum;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: component11, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component12, reason: from getter */
    public final int getVirtualNum() {
        return this.virtualNum;
    }

    /* renamed from: component13, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component7, reason: from getter */
    public final String getFileUrl() {
        return this.fileUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    public final List<String> component9() {
        return this.viewImageList;
    }

    public final AppMarketEntity copy(long id2, String name, String packageName, int typeId, String type, String icon, String fileUrl, long fileSize, List<String> viewImageList, String summary, String description, int virtualNum, String version) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(viewImageList, "viewImageList");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(version, "version");
        return new AppMarketEntity(id2, name, packageName, typeId, type, icon, fileUrl, fileSize, viewImageList, summary, description, virtualNum, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppMarketEntity)) {
            return false;
        }
        AppMarketEntity appMarketEntity = (AppMarketEntity) other;
        return this.id == appMarketEntity.id && Intrinsics.areEqual(this.name, appMarketEntity.name) && Intrinsics.areEqual(this.packageName, appMarketEntity.packageName) && this.typeId == appMarketEntity.typeId && Intrinsics.areEqual(this.type, appMarketEntity.type) && Intrinsics.areEqual(this.icon, appMarketEntity.icon) && Intrinsics.areEqual(this.fileUrl, appMarketEntity.fileUrl) && this.fileSize == appMarketEntity.fileSize && Intrinsics.areEqual(this.viewImageList, appMarketEntity.viewImageList) && Intrinsics.areEqual(this.summary, appMarketEntity.summary) && Intrinsics.areEqual(this.description, appMarketEntity.description) && this.virtualNum == appMarketEntity.virtualNum && Intrinsics.areEqual(this.version, appMarketEntity.version);
    }

    public int hashCode() {
        return (((((((((((((((((((((((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.packageName.hashCode()) * 31) + Integer.hashCode(this.typeId)) * 31) + this.type.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.fileUrl.hashCode()) * 31) + Long.hashCode(this.fileSize)) * 31) + this.viewImageList.hashCode()) * 31) + this.summary.hashCode()) * 31) + this.description.hashCode()) * 31) + Integer.hashCode(this.virtualNum)) * 31) + this.version.hashCode();
    }

    public String toString() {
        return "AppMarketEntity(id=" + this.id + ", name=" + this.name + ", packageName=" + this.packageName + ", typeId=" + this.typeId + ", type=" + this.type + ", icon=" + this.icon + ", fileUrl=" + this.fileUrl + ", fileSize=" + this.fileSize + ", viewImageList=" + this.viewImageList + ", summary=" + this.summary + ", description=" + this.description + ", virtualNum=" + this.virtualNum + ", version=" + this.version + Separators.RPAREN;
    }

    public AppMarketEntity(long j, String name, String packageName, int i, String type, String icon, String fileUrl, long j2, List<String> viewImageList, String summary, String description, int i2, String version) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(viewImageList, "viewImageList");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(version, "version");
        this.id = j;
        this.name = name;
        this.packageName = packageName;
        this.typeId = i;
        this.type = type;
        this.icon = icon;
        this.fileUrl = fileUrl;
        this.fileSize = j2;
        this.viewImageList = viewImageList;
        this.summary = summary;
        this.description = description;
        this.virtualNum = i2;
        this.version = version;
        this.isInstall = -1;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public final String getType() {
        return this.type;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final List<String> getViewImageList() {
        return this.viewImageList;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getVirtualNum() {
        return this.virtualNum;
    }

    public final String getVersion() {
        return this.version;
    }

    /* renamed from: isInstall, reason: from getter */
    public final int getIsInstall() {
        return this.isInstall;
    }

    public final void setInstall(int i) {
        this.isInstall = i;
    }
}
