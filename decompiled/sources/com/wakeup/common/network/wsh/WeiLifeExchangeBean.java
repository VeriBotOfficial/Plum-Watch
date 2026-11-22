package com.wakeup.common.network.wsh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WeiLifeHomeBean.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0014\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/network/wsh/WeiLifeExchangeBean;", "", "id", "", "title", "", "feeType", "", "point", "price", "", "originPrice", "image", "jumpType", "jumpTarget", "<init>", "(JLjava/lang/String;IIDDLjava/lang/String;ILjava/lang/String;)V", "getId", "()J", "getTitle", "()Ljava/lang/String;", "getFeeType", "()I", "getPoint", "getPrice", "()D", "getOriginPrice", "getImage", "getJumpType", "getJumpTarget", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WeiLifeExchangeBean {
    private final int feeType;
    private final long id;
    private final String image;
    private final String jumpTarget;
    private final int jumpType;
    private final double originPrice;
    private final int point;
    private final double price;
    private final String title;

    public WeiLifeExchangeBean(long j, String title, int i, int i2, double d, double d2, String image, int i3, String jumpTarget) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(jumpTarget, "jumpTarget");
        this.id = j;
        this.title = title;
        this.feeType = i;
        this.point = i2;
        this.price = d;
        this.originPrice = d2;
        this.image = image;
        this.jumpType = i3;
        this.jumpTarget = jumpTarget;
    }

    public final long getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getFeeType() {
        return this.feeType;
    }

    public final int getPoint() {
        return this.point;
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

    public final int getJumpType() {
        return this.jumpType;
    }

    public final String getJumpTarget() {
        return this.jumpTarget;
    }
}
