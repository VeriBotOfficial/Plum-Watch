package com.wakeup.common.network.wsh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WeiLifeHomeBean.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/network/wsh/WeiLifeReturnBean;", "", "id", "", "title", "", "cashbackPrice", "", "price", "originPrice", "image", "virtualSale", "", "jumpType", "jumpTarget", "<init>", "(JLjava/lang/String;DDDLjava/lang/String;IILjava/lang/String;)V", "getId", "()J", "getTitle", "()Ljava/lang/String;", "getCashbackPrice", "()D", "getPrice", "getOriginPrice", "getImage", "getVirtualSale", "()I", "getJumpType", "getJumpTarget", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WeiLifeReturnBean {
    private final double cashbackPrice;
    private final long id;
    private final String image;
    private final String jumpTarget;
    private final int jumpType;
    private final double originPrice;
    private final double price;
    private final String title;
    private final int virtualSale;

    public WeiLifeReturnBean(long j, String title, double d, double d2, double d3, String image, int i, int i2, String jumpTarget) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(jumpTarget, "jumpTarget");
        this.id = j;
        this.title = title;
        this.cashbackPrice = d;
        this.price = d2;
        this.originPrice = d3;
        this.image = image;
        this.virtualSale = i;
        this.jumpType = i2;
        this.jumpTarget = jumpTarget;
    }

    public final long getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final double getCashbackPrice() {
        return this.cashbackPrice;
    }

    public final double getPrice() {
        return this.price;
    }

    public final double getOriginPrice() {
        return this.originPrice;
    }

    public final String getImage() {
        return this.image;
    }

    public final int getVirtualSale() {
        return this.virtualSale;
    }

    public final int getJumpType() {
        return this.jumpType;
    }

    public final String getJumpTarget() {
        return this.jumpTarget;
    }
}
