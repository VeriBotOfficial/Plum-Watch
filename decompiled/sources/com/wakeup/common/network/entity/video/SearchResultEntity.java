package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchResultEntity.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/common/network/entity/video/SearchResultEntity;", "", "result", "", "Lcom/wakeup/common/network/entity/video/VideoEntity;", "isNeedPages", "", "<init>", "(Ljava/util/List;I)V", "getResult", "()Ljava/util/List;", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SearchResultEntity {
    private final int isNeedPages;
    private final List<VideoEntity> result;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchResultEntity copy$default(SearchResultEntity searchResultEntity, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = searchResultEntity.result;
        }
        if ((i2 & 2) != 0) {
            i = searchResultEntity.isNeedPages;
        }
        return searchResultEntity.copy(list, i);
    }

    public final List<VideoEntity> component1() {
        return this.result;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIsNeedPages() {
        return this.isNeedPages;
    }

    public final SearchResultEntity copy(List<VideoEntity> result, int isNeedPages) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new SearchResultEntity(result, isNeedPages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultEntity)) {
            return false;
        }
        SearchResultEntity searchResultEntity = (SearchResultEntity) other;
        return Intrinsics.areEqual(this.result, searchResultEntity.result) && this.isNeedPages == searchResultEntity.isNeedPages;
    }

    public int hashCode() {
        return (this.result.hashCode() * 31) + Integer.hashCode(this.isNeedPages);
    }

    public String toString() {
        return "SearchResultEntity(result=" + this.result + ", isNeedPages=" + this.isNeedPages + Separators.RPAREN;
    }

    public SearchResultEntity(List<VideoEntity> result, int i) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
        this.isNeedPages = i;
    }

    public final List<VideoEntity> getResult() {
        return this.result;
    }

    public final int isNeedPages() {
        return this.isNeedPages;
    }
}
