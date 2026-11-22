package com.beken.iot.smartsdk.core.connect;

import kotlin.Metadata;

/* compiled from: ChannelListener.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/beken/iot/smartsdk/core/connect/ChannelListener;", "", "onCameraReady", "", "onConnected", "onDisconnected", "onDisplayReady", "onTimeout", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ChannelListener {
    void onCameraReady();

    void onConnected();

    void onDisconnected();

    void onDisplayReady();

    void onTimeout();
}
