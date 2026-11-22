package com.wakeup.common.utils;

import kotlin.Metadata;

/* compiled from: AudioFocusCallback.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/wakeup/common/utils/AudioFocusCallback;", "", "audioFocusLoss", "", "getGainFocus", "audioFocusLossCanDuck", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AudioFocusCallback {
    void audioFocusLoss();

    void audioFocusLossCanDuck();

    void getGainFocus();
}
