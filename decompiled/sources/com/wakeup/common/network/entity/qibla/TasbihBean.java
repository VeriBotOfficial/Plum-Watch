package com.wakeup.common.network.entity.qibla;

import kotlin.Metadata;

/* compiled from: QiblaBean.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/wakeup/common/network/entity/qibla/TasbihBean;", "", "iqibla", "", "appTime", "<init>", "(II)V", "getIqibla", "()I", "setIqibla", "(I)V", "getAppTime", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TasbihBean {
    private final int appTime;
    private int iqibla;

    public TasbihBean(int i, int i2) {
        this.iqibla = i;
        this.appTime = i2;
    }

    public final int getIqibla() {
        return this.iqibla;
    }

    public final void setIqibla(int i) {
        this.iqibla = i;
    }

    public final int getAppTime() {
        return this.appTime;
    }
}
