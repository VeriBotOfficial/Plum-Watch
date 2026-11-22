package com.wakeup.common.network.entity.gift;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GiftModels.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/network/entity/gift/DialDownloadInfo;", "", "file_url", "", "package_type", "", "<init>", "(Ljava/lang/String;I)V", "getFile_url", "()Ljava/lang/String;", "getPackage_type", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DialDownloadInfo {
    private final String file_url;
    private final int package_type;

    /* JADX WARN: Multi-variable type inference failed */
    public DialDownloadInfo() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DialDownloadInfo copy$default(DialDownloadInfo dialDownloadInfo, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dialDownloadInfo.file_url;
        }
        if ((i2 & 2) != 0) {
            i = dialDownloadInfo.package_type;
        }
        return dialDownloadInfo.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFile_url() {
        return this.file_url;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPackage_type() {
        return this.package_type;
    }

    public final DialDownloadInfo copy(String file_url, int package_type) {
        Intrinsics.checkNotNullParameter(file_url, "file_url");
        return new DialDownloadInfo(file_url, package_type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialDownloadInfo)) {
            return false;
        }
        DialDownloadInfo dialDownloadInfo = (DialDownloadInfo) other;
        return Intrinsics.areEqual(this.file_url, dialDownloadInfo.file_url) && this.package_type == dialDownloadInfo.package_type;
    }

    public int hashCode() {
        return (this.file_url.hashCode() * 31) + Integer.hashCode(this.package_type);
    }

    public String toString() {
        return "DialDownloadInfo(file_url=" + this.file_url + ", package_type=" + this.package_type + Separators.RPAREN;
    }

    public DialDownloadInfo(String file_url, int i) {
        Intrinsics.checkNotNullParameter(file_url, "file_url");
        this.file_url = file_url;
        this.package_type = i;
    }

    public /* synthetic */ DialDownloadInfo(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 1 : i);
    }

    public final String getFile_url() {
        return this.file_url;
    }

    public final int getPackage_type() {
        return this.package_type;
    }
}
