package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public interface HandlerWrapper {
    Looper getLooper();

    Message obtainMessage(int r1);

    Message obtainMessage(int r1, int r2, int r3);

    Message obtainMessage(int r1, int r2, int r3, Object obj);

    Message obtainMessage(int r1, Object obj);

    boolean post(Runnable runnable);

    boolean postDelayed(Runnable runnable, long j);

    void removeCallbacksAndMessages(Object obj);

    void removeMessages(int r1);

    boolean sendEmptyMessage(int r1);

    boolean sendEmptyMessageAtTime(int r1, long j);
}
