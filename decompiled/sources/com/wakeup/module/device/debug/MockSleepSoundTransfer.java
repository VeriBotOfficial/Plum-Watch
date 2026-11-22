package com.wakeup.module.device.debug;

import android.os.Handler;
import android.os.Looper;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.common.storage.MockSleepSoundDevice;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

/* compiled from: MockSleepSoundTransfer.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ.\u0010\r\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0002J\u0016\u0010\u0013\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0006\u0010\u0014\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/wakeup/module/device/debug/MockSleepSoundTransfer;", "", "<init>", "()V", "handler", "Landroid/os/Handler;", "fakePushNoiseMusic", "", "path", "", "callback", "Lcom/wakeup/common/base/BaseCallback;", "", "runProgress", "stepMs", "", "success", "", "fileName", "runStuck", "cancel", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MockSleepSoundTransfer {
    public static final MockSleepSoundTransfer INSTANCE = new MockSleepSoundTransfer();
    private static final Handler handler = new Handler(Looper.getMainLooper());

    /* compiled from: MockSleepSoundTransfer.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MockSleepSoundDevice.SendBehavior.values().length];
            try {
                iArr[MockSleepSoundDevice.SendBehavior.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MockSleepSoundDevice.SendBehavior.SLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MockSleepSoundDevice.SendBehavior.STUCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MockSleepSoundDevice.SendBehavior.FAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private MockSleepSoundTransfer() {
    }

    public final void fakePushNoiseMusic(String path, BaseCallback<Integer> callback) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callback, "callback");
        handler.removeCallbacksAndMessages(null);
        callback.callback(0, 0);
        String name = new File(path).getName();
        int i = WhenMappings.$EnumSwitchMapping$0[MockSleepSoundDevice.INSTANCE.getSendBehavior().ordinal()];
        if (i == 1) {
            long progressStepMs = MockSleepSoundDevice.INSTANCE.getProgressStepMs();
            Intrinsics.checkNotNull(name);
            runProgress(callback, progressStepMs, true, name);
        } else {
            if (i == 2) {
                long progressStepMs2 = 6 * MockSleepSoundDevice.INSTANCE.getProgressStepMs();
                Intrinsics.checkNotNull(name);
                runProgress(callback, progressStepMs2, true, name);
                return;
            }
            if (i == 3) {
                runStuck(callback);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                long progressStepMs3 = MockSleepSoundDevice.INSTANCE.getProgressStepMs();
                Intrinsics.checkNotNull(name);
                runProgress(callback, progressStepMs3, false, name);
            }
        }
    }

    private final void runProgress(final BaseCallback<Integer> callback, final long stepMs, final boolean success, final String fileName) {
        final Ref.IntRef intRef = new Ref.IntRef();
        final int i = success ? 100 : 40;
        handler.postDelayed(new Runnable() { // from class: com.wakeup.module.device.debug.MockSleepSoundTransfer$runProgress$tick$1
            @Override // java.lang.Runnable
            public void run() {
                Handler handler2;
                Ref.IntRef.this.element += 5;
                callback.callback(1, Integer.valueOf(RangesKt.coerceAtMost(Ref.IntRef.this.element, i)));
                if (Ref.IntRef.this.element < i) {
                    handler2 = MockSleepSoundTransfer.handler;
                    handler2.postDelayed(this, stepMs);
                    return;
                }
                if (success) {
                    callback.callback(2, 100);
                    if (!MockSleepSoundDevice.INSTANCE.getFileNames().contains(fileName)) {
                        MockSleepSoundDevice.INSTANCE.getFileNames().add(fileName);
                    }
                    MockSleepSoundDevice.INSTANCE.setCur(RangesKt.coerceAtMost(MockSleepSoundDevice.INSTANCE.getCur() + 1, MockSleepSoundDevice.INSTANCE.getTotal()));
                } else {
                    callback.callback(-1, Integer.valueOf(MockSleepSoundDevice.INSTANCE.getSendFailCode()));
                }
                callback.callback(3, 0);
            }
        }, stepMs);
    }

    private final void runStuck(final BaseCallback<Integer> callback) {
        final Ref.IntRef intRef = new Ref.IntRef();
        handler.postDelayed(new Runnable() { // from class: com.wakeup.module.device.debug.MockSleepSoundTransfer$runStuck$tick$1
            @Override // java.lang.Runnable
            public void run() {
                Handler handler2;
                Ref.IntRef.this.element += 5;
                callback.callback(1, Integer.valueOf(Ref.IntRef.this.element));
                if (Ref.IntRef.this.element < 30) {
                    handler2 = MockSleepSoundTransfer.handler;
                    handler2.postDelayed(this, MockSleepSoundDevice.INSTANCE.getProgressStepMs());
                }
            }
        }, MockSleepSoundDevice.INSTANCE.getProgressStepMs());
    }

    public final void cancel() {
        handler.removeCallbacksAndMessages(null);
    }
}
