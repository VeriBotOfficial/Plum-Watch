package com.wakeup.common.network.entity.sport;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SportShareMusicBean.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/sport/SportShareMusicBean;", "", "records", "", "Lcom/wakeup/common/network/entity/sport/Music;", "total", "", "size", "current", "<init>", "(Ljava/util/List;III)V", "getRecords", "()Ljava/util/List;", "getTotal", "()I", "getSize", "getCurrent", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SportShareMusicBean {
    private final int current;
    private final List<Music> records;
    private final int size;
    private final int total;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SportShareMusicBean copy$default(SportShareMusicBean sportShareMusicBean, List list, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = sportShareMusicBean.records;
        }
        if ((i4 & 2) != 0) {
            i = sportShareMusicBean.total;
        }
        if ((i4 & 4) != 0) {
            i2 = sportShareMusicBean.size;
        }
        if ((i4 & 8) != 0) {
            i3 = sportShareMusicBean.current;
        }
        return sportShareMusicBean.copy(list, i, i2, i3);
    }

    public final List<Music> component1() {
        return this.records;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    public final SportShareMusicBean copy(List<Music> records, int total, int size, int current) {
        Intrinsics.checkNotNullParameter(records, "records");
        return new SportShareMusicBean(records, total, size, current);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportShareMusicBean)) {
            return false;
        }
        SportShareMusicBean sportShareMusicBean = (SportShareMusicBean) other;
        return Intrinsics.areEqual(this.records, sportShareMusicBean.records) && this.total == sportShareMusicBean.total && this.size == sportShareMusicBean.size && this.current == sportShareMusicBean.current;
    }

    public int hashCode() {
        return (((((this.records.hashCode() * 31) + Integer.hashCode(this.total)) * 31) + Integer.hashCode(this.size)) * 31) + Integer.hashCode(this.current);
    }

    public String toString() {
        return "SportShareMusicBean(records=" + this.records + ", total=" + this.total + ", size=" + this.size + ", current=" + this.current + Separators.RPAREN;
    }

    public SportShareMusicBean(List<Music> records, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(records, "records");
        this.records = records;
        this.total = i;
        this.size = i2;
        this.current = i3;
    }

    public final List<Music> getRecords() {
        return this.records;
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
}
