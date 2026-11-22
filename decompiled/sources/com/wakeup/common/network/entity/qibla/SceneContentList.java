package com.wakeup.common.network.entity.qibla;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QiblaBean.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/wakeup/common/network/entity/qibla/SceneContentList;", "", "total", "", "list", "", "Lcom/wakeup/common/network/entity/qibla/SceneContentBean;", "<init>", "(ILjava/util/List;)V", "getTotal", "()I", "getList", "()Ljava/util/List;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SceneContentList {
    private final List<SceneContentBean> list;
    private final int total;

    public SceneContentList(int i, List<SceneContentBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.total = i;
        this.list = list;
    }

    public final List<SceneContentBean> getList() {
        return this.list;
    }

    public final int getTotal() {
        return this.total;
    }
}
