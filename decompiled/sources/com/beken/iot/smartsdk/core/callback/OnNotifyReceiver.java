package com.beken.iot.smartsdk.core.callback;

import com.beken.iot.smartsdk.core.pack.EventTransferConst;

/* loaded from: classes13.dex */
public interface OnNotifyReceiver {
    void onComplete(EventTransferConst eventTransferConst);

    void onEvent(int i);
}
