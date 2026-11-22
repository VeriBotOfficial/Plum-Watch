package com.wakeup.common.network.wsh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WeiLifeHomeBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/wakeup/common/network/wsh/WeiLifeTopBean;", "", "id", "", "name", "", "subname", "image", "jumpType", "", "jumpTarget", "extendId", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getSubname", "getImage", "getJumpType", "()I", "getJumpTarget", "getExtendId", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WeiLifeTopBean {
    private final String extendId;
    private final long id;
    private final String image;
    private final String jumpTarget;
    private final int jumpType;
    private final String name;
    private final String subname;

    public WeiLifeTopBean(long j, String name, String subname, String image, int i, String jumpTarget, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(subname, "subname");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(jumpTarget, "jumpTarget");
        this.id = j;
        this.name = name;
        this.subname = subname;
        this.image = image;
        this.jumpType = i;
        this.jumpTarget = jumpTarget;
        this.extendId = str;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSubname() {
        return this.subname;
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

    public final String getExtendId() {
        return this.extendId;
    }
}
