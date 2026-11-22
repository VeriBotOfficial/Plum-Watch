package com.wakeup.common.network.entity.video;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: VideoDialInfoEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/wakeup/common/network/entity/video/VideoDialInfoEntity;", "", "id", "", "imgUrl", "", "name", "downNum", "price", "", "localPrice", "dollar", "currencySymbol", "described", "majorVersion", "dialType", "type", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;JDDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()J", "getImgUrl", "()Ljava/lang/String;", "getName", "getDownNum", "getPrice", "()D", "getLocalPrice", "getDollar", "getCurrencySymbol", "getDescribed", "getMajorVersion", "getDialType", "getType", "()I", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoDialInfoEntity {
    private final String currencySymbol;
    private final String described;
    private final String dialType;
    private final double dollar;
    private final long downNum;
    private final long id;
    private final String imgUrl;
    private final double localPrice;
    private final String majorVersion;
    private final String name;
    private final double price;
    private final int type;

    public VideoDialInfoEntity(long j, String str, String str2, long j2, double d, double d2, double d3, String str3, String str4, String str5, String str6, int i) {
        this.id = j;
        this.imgUrl = str;
        this.name = str2;
        this.downNum = j2;
        this.price = d;
        this.localPrice = d2;
        this.dollar = d3;
        this.currencySymbol = str3;
        this.described = str4;
        this.majorVersion = str5;
        this.dialType = str6;
        this.type = i;
    }

    public /* synthetic */ VideoDialInfoEntity(long j, String str, String str2, long j2, double d, double d2, double d3, String str3, String str4, String str5, String str6, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, str, str2, (i2 & 8) != 0 ? 0L : j2, (i2 & 16) != 0 ? 0.0d : d, (i2 & 32) != 0 ? 0.0d : d2, (i2 & 64) != 0 ? 0.0d : d3, str3, str4, str5, str6, (i2 & 2048) != 0 ? 0 : i);
    }

    public final long getId() {
        return this.id;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final long getDownNum() {
        return this.downNum;
    }

    public final double getPrice() {
        return this.price;
    }

    public final double getLocalPrice() {
        return this.localPrice;
    }

    public final double getDollar() {
        return this.dollar;
    }

    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final String getDescribed() {
        return this.described;
    }

    public final String getMajorVersion() {
        return this.majorVersion;
    }

    public final String getDialType() {
        return this.dialType;
    }

    public final int getType() {
        return this.type;
    }
}
