package com.wakeup.commponent.module.device;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.storage.CacheManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SNCheckTest.kt */
@Metadata(d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0007J\u0006\u0010\n\u001a\u00020\bR\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/wakeup/commponent/module/device/SNCheckTest;", "", "<init>", "()V", "mHandler", "com/wakeup/commponent/module/device/SNCheckTest$mHandler$1", "Lcom/wakeup/commponent/module/device/SNCheckTest$mHandler$1;", "showDialog", "", "markGetSN", "markComplete", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SNCheckTest {
    public static final SNCheckTest INSTANCE = new SNCheckTest();
    private static SNCheckTest$mHandler$1 mHandler;

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDialog() {
    }

    private SNCheckTest() {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.wakeup.commponent.module.device.SNCheckTest$mHandler$1] */
    static {
        final Looper mainLooper = Looper.getMainLooper();
        mHandler = new Handler(mainLooper) { // from class: com.wakeup.commponent.module.device.SNCheckTest$mHandler$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
                if (msg.what == 999) {
                    LogUtils.i("SNCheckTest", "SN获取失败");
                    SNCheckTest.INSTANCE.showDialog();
                }
            }
        };
    }

    @JvmStatic
    public static final void markGetSN() {
        CacheManager.saveBoolean("test_device_sn", true);
        if (mHandler.hasMessages(999)) {
            mHandler.removeMessages(999);
        }
        Message obtain = Message.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
        obtain.what = 999;
        mHandler.sendMessageDelayed(obtain, 8000L);
        LogUtils.i("SNCheckTest", "markGetSN");
    }

    public final void markComplete() {
        mHandler.removeMessages(999);
        CacheManager.saveBoolean("test_device_sn", false);
        LogUtils.i("SNCheckTest", "markComplete");
    }
}
