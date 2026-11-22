package com.wakeup.common.network.entity.qibla;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QiblaBean.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/wakeup/common/network/entity/qibla/KoranBean;", "", "id", "", "content", "", "<init>", "(ILjava/lang/String;)V", "getId", "()I", "getContent", "()Ljava/lang/String;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KoranBean {
    private final String content;
    private final int id;

    public KoranBean(int i, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = i;
        this.content = content;
    }

    public final String getContent() {
        return this.content;
    }

    public final int getId() {
        return this.id;
    }
}
