package com.wakeup.howear.diet;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DietRetrofit.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/wakeup/howear/diet/BoardReq;", "", "user_id", "", "date", "sports_calories", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getUser_id", "()Ljava/lang/String;", "getDate", "getSports_calories", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BoardReq {
    private final String date;
    private final int sports_calories;
    private final String user_id;

    public static /* synthetic */ BoardReq copy$default(BoardReq boardReq, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = boardReq.user_id;
        }
        if ((i2 & 2) != 0) {
            str2 = boardReq.date;
        }
        if ((i2 & 4) != 0) {
            i = boardReq.sports_calories;
        }
        return boardReq.copy(str, str2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUser_id() {
        return this.user_id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSports_calories() {
        return this.sports_calories;
    }

    public final BoardReq copy(String user_id, String date, int sports_calories) {
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(date, "date");
        return new BoardReq(user_id, date, sports_calories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoardReq)) {
            return false;
        }
        BoardReq boardReq = (BoardReq) other;
        return Intrinsics.areEqual(this.user_id, boardReq.user_id) && Intrinsics.areEqual(this.date, boardReq.date) && this.sports_calories == boardReq.sports_calories;
    }

    public int hashCode() {
        return (((this.user_id.hashCode() * 31) + this.date.hashCode()) * 31) + Integer.hashCode(this.sports_calories);
    }

    public String toString() {
        return "BoardReq(user_id=" + this.user_id + ", date=" + this.date + ", sports_calories=" + this.sports_calories + Separators.RPAREN;
    }

    public BoardReq(String user_id, String date, int i) {
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(date, "date");
        this.user_id = user_id;
        this.date = date;
        this.sports_calories = i;
    }

    public /* synthetic */ BoardReq(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? 0 : i);
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final String getDate() {
        return this.date;
    }

    public final int getSports_calories() {
        return this.sports_calories;
    }
}
