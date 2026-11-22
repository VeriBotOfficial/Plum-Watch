package com.wakeup.common.network.entity.gift;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GiftModels.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006%"}, d2 = {"Lcom/wakeup/common/network/entity/gift/ExchangeRecord;", "", "id", "", "user_id", "dial_id", "", "dial_name", "", "dial_img", "points_cost", "create_time", "<init>", "(JJILjava/lang/String;Ljava/lang/String;IJ)V", "getId", "()J", "getUser_id", "getDial_id", "()I", "getDial_name", "()Ljava/lang/String;", "getDial_img", "getPoints_cost", "getCreate_time", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ExchangeRecord {
    private final long create_time;
    private final int dial_id;
    private final String dial_img;
    private final String dial_name;
    private final long id;
    private final int points_cost;
    private final long user_id;

    public ExchangeRecord() {
        this(0L, 0L, 0, null, null, 0, 0L, 127, null);
    }

    public static /* synthetic */ ExchangeRecord copy$default(ExchangeRecord exchangeRecord, long j, long j2, int i, String str, String str2, int i2, long j3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = exchangeRecord.id;
        }
        long j4 = j;
        if ((i3 & 2) != 0) {
            j2 = exchangeRecord.user_id;
        }
        return exchangeRecord.copy(j4, j2, (i3 & 4) != 0 ? exchangeRecord.dial_id : i, (i3 & 8) != 0 ? exchangeRecord.dial_name : str, (i3 & 16) != 0 ? exchangeRecord.dial_img : str2, (i3 & 32) != 0 ? exchangeRecord.points_cost : i2, (i3 & 64) != 0 ? exchangeRecord.create_time : j3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getUser_id() {
        return this.user_id;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDial_id() {
        return this.dial_id;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDial_name() {
        return this.dial_name;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDial_img() {
        return this.dial_img;
    }

    /* renamed from: component6, reason: from getter */
    public final int getPoints_cost() {
        return this.points_cost;
    }

    /* renamed from: component7, reason: from getter */
    public final long getCreate_time() {
        return this.create_time;
    }

    public final ExchangeRecord copy(long id2, long user_id, int dial_id, String dial_name, String dial_img, int points_cost, long create_time) {
        Intrinsics.checkNotNullParameter(dial_name, "dial_name");
        Intrinsics.checkNotNullParameter(dial_img, "dial_img");
        return new ExchangeRecord(id2, user_id, dial_id, dial_name, dial_img, points_cost, create_time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExchangeRecord)) {
            return false;
        }
        ExchangeRecord exchangeRecord = (ExchangeRecord) other;
        return this.id == exchangeRecord.id && this.user_id == exchangeRecord.user_id && this.dial_id == exchangeRecord.dial_id && Intrinsics.areEqual(this.dial_name, exchangeRecord.dial_name) && Intrinsics.areEqual(this.dial_img, exchangeRecord.dial_img) && this.points_cost == exchangeRecord.points_cost && this.create_time == exchangeRecord.create_time;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.user_id)) * 31) + Integer.hashCode(this.dial_id)) * 31) + this.dial_name.hashCode()) * 31) + this.dial_img.hashCode()) * 31) + Integer.hashCode(this.points_cost)) * 31) + Long.hashCode(this.create_time);
    }

    public String toString() {
        return "ExchangeRecord(id=" + this.id + ", user_id=" + this.user_id + ", dial_id=" + this.dial_id + ", dial_name=" + this.dial_name + ", dial_img=" + this.dial_img + ", points_cost=" + this.points_cost + ", create_time=" + this.create_time + Separators.RPAREN;
    }

    public ExchangeRecord(long j, long j2, int i, String dial_name, String dial_img, int i2, long j3) {
        Intrinsics.checkNotNullParameter(dial_name, "dial_name");
        Intrinsics.checkNotNullParameter(dial_img, "dial_img");
        this.id = j;
        this.user_id = j2;
        this.dial_id = i;
        this.dial_name = dial_name;
        this.dial_img = dial_img;
        this.points_cost = i2;
        this.create_time = j3;
    }

    public /* synthetic */ ExchangeRecord(long j, long j2, int i, String str, String str2, int i2, long j3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0L : j2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? "" : str, (i3 & 16) == 0 ? str2 : "", (i3 & 32) == 0 ? i2 : 0, (i3 & 64) != 0 ? 0L : j3);
    }

    public final long getId() {
        return this.id;
    }

    public final long getUser_id() {
        return this.user_id;
    }

    public final int getDial_id() {
        return this.dial_id;
    }

    public final String getDial_name() {
        return this.dial_name;
    }

    public final String getDial_img() {
        return this.dial_img;
    }

    public final int getPoints_cost() {
        return this.points_cost;
    }

    public final long getCreate_time() {
        return this.create_time;
    }
}
