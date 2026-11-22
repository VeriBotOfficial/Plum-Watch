package com.wakeup.common.network.wsh;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WeiLifeHomeBean.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/wakeup/common/network/wsh/OverseasLifeList;", "", "id", "", "typeName", "", "jumpType", "", "jumpTarget", "list", "", "Lcom/wakeup/common/network/wsh/OverseasLifeBean;", "<init>", "(JLjava/lang/String;ILjava/lang/String;Ljava/util/List;)V", "getId", "()J", "getTypeName", "()Ljava/lang/String;", "getJumpType", "()I", "getJumpTarget", "getList", "()Ljava/util/List;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OverseasLifeList {
    private final long id;
    private final String jumpTarget;
    private final int jumpType;
    private final List<OverseasLifeBean> list;
    private final String typeName;

    public OverseasLifeList(long j, String typeName, int i, String jumpTarget, List<OverseasLifeBean> list) {
        Intrinsics.checkNotNullParameter(typeName, "typeName");
        Intrinsics.checkNotNullParameter(jumpTarget, "jumpTarget");
        Intrinsics.checkNotNullParameter(list, "list");
        this.id = j;
        this.typeName = typeName;
        this.jumpType = i;
        this.jumpTarget = jumpTarget;
        this.list = list;
    }

    public final long getId() {
        return this.id;
    }

    public final String getTypeName() {
        return this.typeName;
    }

    public final int getJumpType() {
        return this.jumpType;
    }

    public final String getJumpTarget() {
        return this.jumpTarget;
    }

    public final List<OverseasLifeBean> getList() {
        return this.list;
    }
}
