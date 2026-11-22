package com.wakeup.common.network.entity.travelAgent;

import android.javax.sip.header.SubscriptionStateHeader;
import kotlin.Metadata;

/* compiled from: TravelAgentExtraBean.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/wakeup/common/network/entity/travelAgent/TravelAgentExtraBean;", "", "<init>", "()V", "messageId", "", "getMessageId", "()I", "setMessageId", "(I)V", SubscriptionStateHeader.PENDING, "getPending", "setPending", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelAgentExtraBean {
    private int messageId;
    private int pending;

    public final int getMessageId() {
        return this.messageId;
    }

    public final void setMessageId(int i) {
        this.messageId = i;
    }

    public final int getPending() {
        return this.pending;
    }

    public final void setPending(int i) {
        this.pending = i;
    }
}
