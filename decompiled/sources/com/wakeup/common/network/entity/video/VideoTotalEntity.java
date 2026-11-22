package com.wakeup.common.network.entity.video;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VideoTotalEntity.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0019R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/network/entity/video/VideoTotalEntity;", "", "total", "", "size", "current", "records", "", "Lcom/wakeup/common/network/entity/video/VideoEntity;", "optimizeCountSql", "", "isSearchCount", "hitCount", "countId", "", "maxLimit", "<init>", "(IIILjava/util/List;ZZZLjava/lang/String;I)V", "getTotal", "()I", "getSize", "getCurrent", "getRecords", "()Ljava/util/List;", "getOptimizeCountSql", "()Z", "getHitCount", "getCountId", "()Ljava/lang/String;", "getMaxLimit", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoTotalEntity {
    private final String countId;
    private final int current;
    private final boolean hitCount;
    private final boolean isSearchCount;
    private final int maxLimit;
    private final boolean optimizeCountSql;
    private final List<VideoEntity> records;
    private final int size;
    private final int total;

    public VideoTotalEntity(int i, int i2, int i3, List<VideoEntity> records, boolean z, boolean z2, boolean z3, String countId, int i4) {
        Intrinsics.checkNotNullParameter(records, "records");
        Intrinsics.checkNotNullParameter(countId, "countId");
        this.total = i;
        this.size = i2;
        this.current = i3;
        this.records = records;
        this.optimizeCountSql = z;
        this.isSearchCount = z2;
        this.hitCount = z3;
        this.countId = countId;
        this.maxLimit = i4;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final List<VideoEntity> getRecords() {
        return this.records;
    }

    public final boolean getOptimizeCountSql() {
        return this.optimizeCountSql;
    }

    /* renamed from: isSearchCount, reason: from getter */
    public final boolean getIsSearchCount() {
        return this.isSearchCount;
    }

    public final boolean getHitCount() {
        return this.hitCount;
    }

    public final String getCountId() {
        return this.countId;
    }

    public final int getMaxLimit() {
        return this.maxLimit;
    }
}
