package com.wakeup.common.network.wsh;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WeiLifeHomeBean.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/wakeup/common/network/wsh/WeiLifeHomeBean;", "", "topLinkList", "", "Lcom/wakeup/common/network/wsh/WeiLifeTopBean;", "quickLinkList", "bottomLinkList", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getTopLinkList", "()Ljava/util/List;", "getQuickLinkList", "getBottomLinkList", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WeiLifeHomeBean {
    private final List<WeiLifeTopBean> bottomLinkList;
    private final List<WeiLifeTopBean> quickLinkList;
    private final List<WeiLifeTopBean> topLinkList;

    public WeiLifeHomeBean(List<WeiLifeTopBean> topLinkList, List<WeiLifeTopBean> quickLinkList, List<WeiLifeTopBean> bottomLinkList) {
        Intrinsics.checkNotNullParameter(topLinkList, "topLinkList");
        Intrinsics.checkNotNullParameter(quickLinkList, "quickLinkList");
        Intrinsics.checkNotNullParameter(bottomLinkList, "bottomLinkList");
        this.topLinkList = topLinkList;
        this.quickLinkList = quickLinkList;
        this.bottomLinkList = bottomLinkList;
    }

    public final List<WeiLifeTopBean> getTopLinkList() {
        return this.topLinkList;
    }

    public final List<WeiLifeTopBean> getQuickLinkList() {
        return this.quickLinkList;
    }

    public final List<WeiLifeTopBean> getBottomLinkList() {
        return this.bottomLinkList;
    }
}
