package com.wakeup.common.network.wsh;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WeiLifeHomeBean.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/network/wsh/WeiLifeExchangeList;", "", "partitionName", "", "jumpType", "", "jumpTarget", "list", "", "Lcom/wakeup/common/network/wsh/WeiLifeExchangeBean;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)V", "getPartitionName", "()Ljava/lang/String;", "getJumpType", "()I", "getJumpTarget", "getList", "()Ljava/util/List;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WeiLifeExchangeList {
    private final String jumpTarget;
    private final int jumpType;
    private final List<WeiLifeExchangeBean> list;
    private final String partitionName;

    public WeiLifeExchangeList(String partitionName, int i, String jumpTarget, List<WeiLifeExchangeBean> list) {
        Intrinsics.checkNotNullParameter(partitionName, "partitionName");
        Intrinsics.checkNotNullParameter(jumpTarget, "jumpTarget");
        Intrinsics.checkNotNullParameter(list, "list");
        this.partitionName = partitionName;
        this.jumpType = i;
        this.jumpTarget = jumpTarget;
        this.list = list;
    }

    public final String getPartitionName() {
        return this.partitionName;
    }

    public final int getJumpType() {
        return this.jumpType;
    }

    public final String getJumpTarget() {
        return this.jumpTarget;
    }

    public final List<WeiLifeExchangeBean> getList() {
        return this.list;
    }
}
