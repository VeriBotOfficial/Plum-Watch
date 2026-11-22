package com.phancy.mini.core.app.meta;

import com.phancy.mini.api.file.FileSystemManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BundleInfo.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/phancy/mini/core/app/meta/BundleInfo;", "", "url", "", FileSystemManager.DIGEST_MD5, "(Ljava/lang/String;Ljava/lang/String;)V", "id", "getId", "()Ljava/lang/String;", "getMd5", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BundleInfo {
    private final String id;
    private final String md5;
    private final String url;

    public static /* synthetic */ BundleInfo copy$default(BundleInfo bundleInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bundleInfo.url;
        }
        if ((i & 2) != 0) {
            str2 = bundleInfo.md5;
        }
        return bundleInfo.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    public final BundleInfo copy(String url, String md5) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(md5, "md5");
        return new BundleInfo(url, md5);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BundleInfo)) {
            return false;
        }
        BundleInfo bundleInfo = (BundleInfo) other;
        return Intrinsics.areEqual(this.url, bundleInfo.url) && Intrinsics.areEqual(this.md5, bundleInfo.md5);
    }

    public int hashCode() {
        return (this.url.hashCode() * 31) + this.md5.hashCode();
    }

    public String toString() {
        return "BundleInfo(url=" + this.url + ", md5=" + this.md5 + ')';
    }

    public BundleInfo(String url, String md5) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(md5, "md5");
        this.url = url;
        this.md5 = md5;
        this.id = md5;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getId() {
        return this.id;
    }
}
