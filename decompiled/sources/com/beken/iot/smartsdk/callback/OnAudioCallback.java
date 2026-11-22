package com.beken.iot.smartsdk.callback;

import kotlin.Metadata;

/* compiled from: OnAudioCallback.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lcom/beken/iot/smartsdk/callback/OnAudioCallback;", "", "onChannelState", "", "operating", "", "onError", "code", "", "onState", "playerOn", "recorderOn", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface OnAudioCallback {
    void onChannelState(boolean operating);

    void onError(int code);

    void onState(boolean playerOn, boolean recorderOn);
}
