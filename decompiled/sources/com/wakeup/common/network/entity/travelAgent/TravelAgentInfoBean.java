package com.wakeup.common.network.entity.travelAgent;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TravelAgentInfoBean.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/wakeup/common/network/entity/travelAgent/TravelAgentInfoBean;", "", "<init>", "()V", "appletUrl", "", "getAppletUrl", "()Ljava/lang/String;", "setAppletUrl", "(Ljava/lang/String;)V", "name", "getName", "setName", "icon", "getIcon", "setIcon", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelAgentInfoBean {
    private String appletUrl = "";
    private String name = "";
    private String icon = "";

    public final String getAppletUrl() {
        return this.appletUrl;
    }

    public final void setAppletUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appletUrl = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final void setIcon(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.icon = str;
    }
}
