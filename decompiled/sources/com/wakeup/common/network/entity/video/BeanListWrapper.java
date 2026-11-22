package com.wakeup.common.network.entity.video;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VideoReportEntity.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/wakeup/common/network/entity/video/BeanListWrapper;", "Ljava/io/Serializable;", "reportList", "", "Lcom/wakeup/common/network/entity/video/VideoReportEntity;", "<init>", "(Ljava/util/List;)V", "getReportList", "()Ljava/util/List;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BeanListWrapper implements Serializable {
    private final List<VideoReportEntity> reportList;

    public BeanListWrapper(List<VideoReportEntity> reportList) {
        Intrinsics.checkNotNullParameter(reportList, "reportList");
        this.reportList = reportList;
    }

    public final List<VideoReportEntity> getReportList() {
        return this.reportList;
    }
}
