package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import com.umeng.analytics.pro.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VideoPage.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/video/VideoPage;", "", "records", "", "Lcom/wakeup/common/network/entity/video/VideoEntity;", "current", "", d.t, "<init>", "(Ljava/util/List;II)V", "getRecords", "()Ljava/util/List;", "getCurrent", "()I", "getPages", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VideoPage {
    private final int current;
    private final int pages;
    private final List<VideoEntity> records;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoPage copy$default(VideoPage videoPage, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = videoPage.records;
        }
        if ((i3 & 2) != 0) {
            i = videoPage.current;
        }
        if ((i3 & 4) != 0) {
            i2 = videoPage.pages;
        }
        return videoPage.copy(list, i, i2);
    }

    public final List<VideoEntity> component1() {
        return this.records;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPages() {
        return this.pages;
    }

    public final VideoPage copy(List<VideoEntity> records, int current, int pages) {
        Intrinsics.checkNotNullParameter(records, "records");
        return new VideoPage(records, current, pages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoPage)) {
            return false;
        }
        VideoPage videoPage = (VideoPage) other;
        return Intrinsics.areEqual(this.records, videoPage.records) && this.current == videoPage.current && this.pages == videoPage.pages;
    }

    public int hashCode() {
        return (((this.records.hashCode() * 31) + Integer.hashCode(this.current)) * 31) + Integer.hashCode(this.pages);
    }

    public String toString() {
        return "VideoPage(records=" + this.records + ", current=" + this.current + ", pages=" + this.pages + Separators.RPAREN;
    }

    public VideoPage(List<VideoEntity> records, int i, int i2) {
        Intrinsics.checkNotNullParameter(records, "records");
        this.records = records;
        this.current = i;
        this.pages = i2;
    }

    public final List<VideoEntity> getRecords() {
        return this.records;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final int getPages() {
        return this.pages;
    }
}
