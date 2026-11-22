package com.wakeup.common.network.entity.gift;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GiftModels.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003Jc\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lcom/wakeup/common/network/entity/gift/DialInfo;", "", "id", "", "name", "", "img_url", "price", "", "bonus_price", "type", "described", "down_num", "exchanged", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;DIILjava/lang/String;IZ)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getImg_url", "getPrice", "()D", "getBonus_price", "getType", "getDescribed", "getDown_num", "getExchanged", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DialInfo {
    private final int bonus_price;
    private final String described;
    private final int down_num;
    private final boolean exchanged;
    private final int id;
    private final String img_url;
    private final String name;
    private final double price;
    private final int type;

    public DialInfo() {
        this(0, null, null, 0.0d, 0, 0, null, 0, false, 511, null);
    }

    public static /* synthetic */ DialInfo copy$default(DialInfo dialInfo, int i, String str, String str2, double d, int i2, int i3, String str3, int i4, boolean z, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = dialInfo.id;
        }
        if ((i5 & 2) != 0) {
            str = dialInfo.name;
        }
        if ((i5 & 4) != 0) {
            str2 = dialInfo.img_url;
        }
        if ((i5 & 8) != 0) {
            d = dialInfo.price;
        }
        if ((i5 & 16) != 0) {
            i2 = dialInfo.bonus_price;
        }
        if ((i5 & 32) != 0) {
            i3 = dialInfo.type;
        }
        if ((i5 & 64) != 0) {
            str3 = dialInfo.described;
        }
        if ((i5 & 128) != 0) {
            i4 = dialInfo.down_num;
        }
        if ((i5 & 256) != 0) {
            z = dialInfo.exchanged;
        }
        boolean z2 = z;
        String str4 = str3;
        int i6 = i2;
        double d2 = d;
        String str5 = str2;
        return dialInfo.copy(i, str, str5, d2, i6, i3, str4, i4, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImg_url() {
        return this.img_url;
    }

    /* renamed from: component4, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* renamed from: component5, reason: from getter */
    public final int getBonus_price() {
        return this.bonus_price;
    }

    /* renamed from: component6, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDescribed() {
        return this.described;
    }

    /* renamed from: component8, reason: from getter */
    public final int getDown_num() {
        return this.down_num;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getExchanged() {
        return this.exchanged;
    }

    public final DialInfo copy(int id2, String name, String img_url, double price, int bonus_price, int type, String described, int down_num, boolean exchanged) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(img_url, "img_url");
        Intrinsics.checkNotNullParameter(described, "described");
        return new DialInfo(id2, name, img_url, price, bonus_price, type, described, down_num, exchanged);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialInfo)) {
            return false;
        }
        DialInfo dialInfo = (DialInfo) other;
        return this.id == dialInfo.id && Intrinsics.areEqual(this.name, dialInfo.name) && Intrinsics.areEqual(this.img_url, dialInfo.img_url) && Double.compare(this.price, dialInfo.price) == 0 && this.bonus_price == dialInfo.bonus_price && this.type == dialInfo.type && Intrinsics.areEqual(this.described, dialInfo.described) && this.down_num == dialInfo.down_num && this.exchanged == dialInfo.exchanged;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.img_url.hashCode()) * 31) + Double.hashCode(this.price)) * 31) + Integer.hashCode(this.bonus_price)) * 31) + Integer.hashCode(this.type)) * 31) + this.described.hashCode()) * 31) + Integer.hashCode(this.down_num)) * 31) + Boolean.hashCode(this.exchanged);
    }

    public String toString() {
        return "DialInfo(id=" + this.id + ", name=" + this.name + ", img_url=" + this.img_url + ", price=" + this.price + ", bonus_price=" + this.bonus_price + ", type=" + this.type + ", described=" + this.described + ", down_num=" + this.down_num + ", exchanged=" + this.exchanged + Separators.RPAREN;
    }

    public DialInfo(int i, String name, String img_url, double d, int i2, int i3, String described, int i4, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(img_url, "img_url");
        Intrinsics.checkNotNullParameter(described, "described");
        this.id = i;
        this.name = name;
        this.img_url = img_url;
        this.price = d;
        this.bonus_price = i2;
        this.type = i3;
        this.described = described;
        this.down_num = i4;
        this.exchanged = z;
    }

    public /* synthetic */ DialInfo(int i, String str, String str2, double d, int i2, int i3, String str3, int i4, boolean z, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? "" : str, (i5 & 4) != 0 ? "" : str2, (i5 & 8) != 0 ? 0.0d : d, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? 1 : i3, (i5 & 64) != 0 ? "" : str3, (i5 & 128) != 0 ? 0 : i4, (i5 & 256) != 0 ? false : z);
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getImg_url() {
        return this.img_url;
    }

    public final double getPrice() {
        return this.price;
    }

    public final int getBonus_price() {
        return this.bonus_price;
    }

    public final int getType() {
        return this.type;
    }

    public final String getDescribed() {
        return this.described;
    }

    public final int getDown_num() {
        return this.down_num;
    }

    public final boolean getExchanged() {
        return this.exchanged;
    }
}
