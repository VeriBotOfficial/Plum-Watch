package com.wakeup.common.network.wsh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WeiLifeHomeBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/wsh/WelfareBean;", "", "id", "", "name", "", "description", "icon", "jumpType", "", "jumpTarget", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getDescription", "getIcon", "getJumpType", "()I", "getJumpTarget", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WelfareBean {
    private final String description;
    private final String icon;
    private final long id;
    private final String jumpTarget;
    private final int jumpType;
    private final String name;

    public WelfareBean(long j, String name, String description, String icon, int i, String jumpTarget) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(jumpTarget, "jumpTarget");
        this.id = j;
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.jumpType = i;
        this.jumpTarget = jumpTarget;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final int getJumpType() {
        return this.jumpType;
    }

    public final String getJumpTarget() {
        return this.jumpTarget;
    }
}
