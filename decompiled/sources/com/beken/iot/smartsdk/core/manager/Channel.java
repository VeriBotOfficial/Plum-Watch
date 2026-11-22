package com.beken.iot.smartsdk.core.manager;

import com.beken.iot.smartsdk.core.connect.Protocol;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Channel.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/beken/iot/smartsdk/core/manager/Channel;", "", "()V", "channel", "Lcom/beken/iot/smartsdk/core/connect/Protocol;", "getChannel", "removeChannel", "", "setChannel", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Channel {
    public static final Channel INSTANCE = new Channel();
    private static Protocol channel;

    private Channel() {
    }

    public final void setChannel(Protocol channel2) {
        Intrinsics.checkNotNullParameter(channel2, "channel");
        channel = channel2;
    }

    public final Protocol getChannel() {
        return channel;
    }

    public final void removeChannel() {
        channel = null;
    }
}
