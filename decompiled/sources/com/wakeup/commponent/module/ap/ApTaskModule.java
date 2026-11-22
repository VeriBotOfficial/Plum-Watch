package com.wakeup.commponent.module.ap;

import android.gov.nist.core.Separators;
import com.wakeup.common.storage.UserDao;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApTaskModule.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001f\u001a\u00020\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÂ\u0003J\t\u0010$\u001a\u00020\u0003HÂ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003Jc\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\u0013\u0010*\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\r\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0016\"\u0004\b\u001d\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014¨\u0006/"}, d2 = {"Lcom/wakeup/commponent/module/ap/ApTaskModule;", "Ljava/io/Serializable;", "id", "", "title", "", "type", "points", "vipPoints", "isComplete", "", "completeTime", "", "isReceive", "tips", "<init>", "(ILjava/lang/String;IIIZJZLjava/lang/String;)V", "getId", "()I", "getTitle", "()Ljava/lang/String;", "getType", "()Z", "setComplete", "(Z)V", "getCompleteTime", "()J", "setCompleteTime", "(J)V", "setReceive", "getTips", "getPoints", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ApTaskModule implements Serializable {
    private long completeTime;
    private final int id;
    private boolean isComplete;
    private boolean isReceive;
    private final int points;
    private final String tips;
    private final String title;
    private final int type;
    private final int vipPoints;

    /* renamed from: component4, reason: from getter */
    private final int getPoints() {
        return this.points;
    }

    /* renamed from: component5, reason: from getter */
    private final int getVipPoints() {
        return this.vipPoints;
    }

    public static /* synthetic */ ApTaskModule copy$default(ApTaskModule apTaskModule, int i, String str, int i2, int i3, int i4, boolean z, long j, boolean z2, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = apTaskModule.id;
        }
        if ((i5 & 2) != 0) {
            str = apTaskModule.title;
        }
        if ((i5 & 4) != 0) {
            i2 = apTaskModule.type;
        }
        if ((i5 & 8) != 0) {
            i3 = apTaskModule.points;
        }
        if ((i5 & 16) != 0) {
            i4 = apTaskModule.vipPoints;
        }
        if ((i5 & 32) != 0) {
            z = apTaskModule.isComplete;
        }
        if ((i5 & 64) != 0) {
            j = apTaskModule.completeTime;
        }
        if ((i5 & 128) != 0) {
            z2 = apTaskModule.isReceive;
        }
        if ((i5 & 256) != 0) {
            str2 = apTaskModule.tips;
        }
        long j2 = j;
        int i6 = i4;
        boolean z3 = z;
        int i7 = i2;
        int i8 = i3;
        return apTaskModule.copy(i, str, i7, i8, i6, z3, j2, z2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    /* renamed from: component7, reason: from getter */
    public final long getCompleteTime() {
        return this.completeTime;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsReceive() {
        return this.isReceive;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    public final ApTaskModule copy(int id2, String title, int type, int points, int vipPoints, boolean isComplete, long completeTime, boolean isReceive, String tips) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tips, "tips");
        return new ApTaskModule(id2, title, type, points, vipPoints, isComplete, completeTime, isReceive, tips);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApTaskModule)) {
            return false;
        }
        ApTaskModule apTaskModule = (ApTaskModule) other;
        return this.id == apTaskModule.id && Intrinsics.areEqual(this.title, apTaskModule.title) && this.type == apTaskModule.type && this.points == apTaskModule.points && this.vipPoints == apTaskModule.vipPoints && this.isComplete == apTaskModule.isComplete && this.completeTime == apTaskModule.completeTime && this.isReceive == apTaskModule.isReceive && Intrinsics.areEqual(this.tips, apTaskModule.tips);
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.id) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.points)) * 31) + Integer.hashCode(this.vipPoints)) * 31) + Boolean.hashCode(this.isComplete)) * 31) + Long.hashCode(this.completeTime)) * 31) + Boolean.hashCode(this.isReceive)) * 31) + this.tips.hashCode();
    }

    public String toString() {
        return "ApTaskModule(id=" + this.id + ", title=" + this.title + ", type=" + this.type + ", points=" + this.points + ", vipPoints=" + this.vipPoints + ", isComplete=" + this.isComplete + ", completeTime=" + this.completeTime + ", isReceive=" + this.isReceive + ", tips=" + this.tips + Separators.RPAREN;
    }

    public ApTaskModule(int i, String title, int i2, int i3, int i4, boolean z, long j, boolean z2, String tips) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tips, "tips");
        this.id = i;
        this.title = title;
        this.type = i2;
        this.points = i3;
        this.vipPoints = i4;
        this.isComplete = z;
        this.completeTime = j;
        this.isReceive = z2;
        this.tips = tips;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isComplete() {
        return this.isComplete;
    }

    public final void setComplete(boolean z) {
        this.isComplete = z;
    }

    public final long getCompleteTime() {
        return this.completeTime;
    }

    public final void setCompleteTime(long j) {
        this.completeTime = j;
    }

    public final boolean isReceive() {
        return this.isReceive;
    }

    public final void setReceive(boolean z) {
        this.isReceive = z;
    }

    public final String getTips() {
        return this.tips;
    }

    public final int getPoints() {
        if (UserDao.isVip()) {
            return this.vipPoints;
        }
        return this.points;
    }
}
