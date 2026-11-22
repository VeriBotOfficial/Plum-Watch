package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import com.umeng.analytics.pro.d;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PublisherListRemoteEntity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJP\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000f¨\u0006\""}, d2 = {"Lcom/wakeup/common/network/entity/video/PublisherListRemoteEntity;", "Ljava/io/Serializable;", "records", "", "Lcom/wakeup/common/network/entity/video/PublisherListItemRemoteEntity;", "total", "", "size", "current", d.t, "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getRecords", "()Ljava/util/List;", "getTotal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSize", "getCurrent", "getPages", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/wakeup/common/network/entity/video/PublisherListRemoteEntity;", "equals", "", "other", "", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PublisherListRemoteEntity implements Serializable {
    private final Integer current;
    private final Integer pages;
    private final List<PublisherListItemRemoteEntity> records;
    private final Integer size;
    private final Integer total;

    public static /* synthetic */ PublisherListRemoteEntity copy$default(PublisherListRemoteEntity publisherListRemoteEntity, List list, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = publisherListRemoteEntity.records;
        }
        if ((i & 2) != 0) {
            num = publisherListRemoteEntity.total;
        }
        if ((i & 4) != 0) {
            num2 = publisherListRemoteEntity.size;
        }
        if ((i & 8) != 0) {
            num3 = publisherListRemoteEntity.current;
        }
        if ((i & 16) != 0) {
            num4 = publisherListRemoteEntity.pages;
        }
        Integer num5 = num4;
        Integer num6 = num2;
        return publisherListRemoteEntity.copy(list, num, num6, num3, num5);
    }

    public final List<PublisherListItemRemoteEntity> component1() {
        return this.records;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getTotal() {
        return this.total;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getSize() {
        return this.size;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getCurrent() {
        return this.current;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getPages() {
        return this.pages;
    }

    public final PublisherListRemoteEntity copy(List<PublisherListItemRemoteEntity> records, Integer total, Integer size, Integer current, Integer pages) {
        return new PublisherListRemoteEntity(records, total, size, current, pages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublisherListRemoteEntity)) {
            return false;
        }
        PublisherListRemoteEntity publisherListRemoteEntity = (PublisherListRemoteEntity) other;
        return Intrinsics.areEqual(this.records, publisherListRemoteEntity.records) && Intrinsics.areEqual(this.total, publisherListRemoteEntity.total) && Intrinsics.areEqual(this.size, publisherListRemoteEntity.size) && Intrinsics.areEqual(this.current, publisherListRemoteEntity.current) && Intrinsics.areEqual(this.pages, publisherListRemoteEntity.pages);
    }

    public int hashCode() {
        List<PublisherListItemRemoteEntity> list = this.records;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.total;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.size;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.current;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.pages;
        return hashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        return "PublisherListRemoteEntity(records=" + this.records + ", total=" + this.total + ", size=" + this.size + ", current=" + this.current + ", pages=" + this.pages + Separators.RPAREN;
    }

    public PublisherListRemoteEntity(List<PublisherListItemRemoteEntity> list, Integer num, Integer num2, Integer num3, Integer num4) {
        this.records = list;
        this.total = num;
        this.size = num2;
        this.current = num3;
        this.pages = num4;
    }

    public final List<PublisherListItemRemoteEntity> getRecords() {
        return this.records;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public final Integer getSize() {
        return this.size;
    }

    public final Integer getCurrent() {
        return this.current;
    }

    public final Integer getPages() {
        return this.pages;
    }
}
