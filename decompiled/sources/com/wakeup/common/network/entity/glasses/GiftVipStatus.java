package com.wakeup.common.network.entity.glasses;

import android.gov.nist.core.Separators;
import com.anythink.core.common.e.a;
import kotlin.Metadata;

/* compiled from: GlassesResult.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J1\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/wakeup/common/network/entity/glasses/GiftVipStatus;", "", "open", "", "isGiftVip", a.C0193a.k, "isPopUp", "<init>", "(IIII)V", "getOpen", "()I", "getDay", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GiftVipStatus {
    private final int day;
    private final int isGiftVip;
    private final int isPopUp;
    private final int open;

    public static /* synthetic */ GiftVipStatus copy$default(GiftVipStatus giftVipStatus, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = giftVipStatus.open;
        }
        if ((i5 & 2) != 0) {
            i2 = giftVipStatus.isGiftVip;
        }
        if ((i5 & 4) != 0) {
            i3 = giftVipStatus.day;
        }
        if ((i5 & 8) != 0) {
            i4 = giftVipStatus.isPopUp;
        }
        return giftVipStatus.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getOpen() {
        return this.open;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIsGiftVip() {
        return this.isGiftVip;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDay() {
        return this.day;
    }

    /* renamed from: component4, reason: from getter */
    public final int getIsPopUp() {
        return this.isPopUp;
    }

    public final GiftVipStatus copy(int open, int isGiftVip, int day, int isPopUp) {
        return new GiftVipStatus(open, isGiftVip, day, isPopUp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftVipStatus)) {
            return false;
        }
        GiftVipStatus giftVipStatus = (GiftVipStatus) other;
        return this.open == giftVipStatus.open && this.isGiftVip == giftVipStatus.isGiftVip && this.day == giftVipStatus.day && this.isPopUp == giftVipStatus.isPopUp;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.open) * 31) + Integer.hashCode(this.isGiftVip)) * 31) + Integer.hashCode(this.day)) * 31) + Integer.hashCode(this.isPopUp);
    }

    public String toString() {
        return "GiftVipStatus(open=" + this.open + ", isGiftVip=" + this.isGiftVip + ", day=" + this.day + ", isPopUp=" + this.isPopUp + Separators.RPAREN;
    }

    public GiftVipStatus(int i, int i2, int i3, int i4) {
        this.open = i;
        this.isGiftVip = i2;
        this.day = i3;
        this.isPopUp = i4;
    }

    public final int getDay() {
        return this.day;
    }

    public final int getOpen() {
        return this.open;
    }

    public final int isGiftVip() {
        return this.isGiftVip;
    }

    public final int isPopUp() {
        return this.isPopUp;
    }
}
