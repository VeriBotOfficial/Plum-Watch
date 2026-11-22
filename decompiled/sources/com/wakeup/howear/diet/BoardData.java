package com.wakeup.howear.diet;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DietRetrofit.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/wakeup/howear/diet/BoardData;", "", "status_text", "", "target_calories", "", "consumed_calories", "remaining_calories", "<init>", "(Ljava/lang/String;DDD)V", "getStatus_text", "()Ljava/lang/String;", "getTarget_calories", "()D", "getConsumed_calories", "getRemaining_calories", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BoardData {
    private final double consumed_calories;
    private final double remaining_calories;
    private final String status_text;
    private final double target_calories;

    public BoardData() {
        this(null, 0.0d, 0.0d, 0.0d, 15, null);
    }

    public static /* synthetic */ BoardData copy$default(BoardData boardData, String str, double d, double d2, double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = boardData.status_text;
        }
        if ((i & 2) != 0) {
            d = boardData.target_calories;
        }
        if ((i & 4) != 0) {
            d2 = boardData.consumed_calories;
        }
        if ((i & 8) != 0) {
            d3 = boardData.remaining_calories;
        }
        double d4 = d3;
        return boardData.copy(str, d, d2, d4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStatus_text() {
        return this.status_text;
    }

    /* renamed from: component2, reason: from getter */
    public final double getTarget_calories() {
        return this.target_calories;
    }

    /* renamed from: component3, reason: from getter */
    public final double getConsumed_calories() {
        return this.consumed_calories;
    }

    /* renamed from: component4, reason: from getter */
    public final double getRemaining_calories() {
        return this.remaining_calories;
    }

    public final BoardData copy(String status_text, double target_calories, double consumed_calories, double remaining_calories) {
        return new BoardData(status_text, target_calories, consumed_calories, remaining_calories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoardData)) {
            return false;
        }
        BoardData boardData = (BoardData) other;
        return Intrinsics.areEqual(this.status_text, boardData.status_text) && Double.compare(this.target_calories, boardData.target_calories) == 0 && Double.compare(this.consumed_calories, boardData.consumed_calories) == 0 && Double.compare(this.remaining_calories, boardData.remaining_calories) == 0;
    }

    public int hashCode() {
        String str = this.status_text;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + Double.hashCode(this.target_calories)) * 31) + Double.hashCode(this.consumed_calories)) * 31) + Double.hashCode(this.remaining_calories);
    }

    public String toString() {
        return "BoardData(status_text=" + this.status_text + ", target_calories=" + this.target_calories + ", consumed_calories=" + this.consumed_calories + ", remaining_calories=" + this.remaining_calories + Separators.RPAREN;
    }

    public BoardData(String str, double d, double d2, double d3) {
        this.status_text = str;
        this.target_calories = d;
        this.consumed_calories = d2;
        this.remaining_calories = d3;
    }

    public /* synthetic */ BoardData(String str, double d, double d2, double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0d : d2, (i & 8) != 0 ? 0.0d : d3);
    }

    public final String getStatus_text() {
        return this.status_text;
    }

    public final double getTarget_calories() {
        return this.target_calories;
    }

    public final double getConsumed_calories() {
        return this.consumed_calories;
    }

    public final double getRemaining_calories() {
        return this.remaining_calories;
    }
}
