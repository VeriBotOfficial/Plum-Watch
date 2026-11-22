package com.wakeup.module.device.work.channel.siche;

import android.os.Handler;
import com.wakeup.common.log.LogUtils;
import com.wakeup.module.device.lib.callback.BleWriteCallback;
import com.wakeup.module.device.lib.exception.BleException;
import kotlin.Metadata;

/* compiled from: SichePayCodeHandler.kt */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/wakeup/module/device/work/channel/siche/SichePayCodeHandler$writeCallback$1", "Lcom/wakeup/module/device/lib/callback/BleWriteCallback;", "onWriteSuccess", "", "current", "", "total", "justWrite", "", "onWriteFailure", "exception", "Lcom/wakeup/module/device/lib/exception/BleException;", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SichePayCodeHandler$writeCallback$1 extends BleWriteCallback {
    final /* synthetic */ SichePayCodeHandler this$0;

    SichePayCodeHandler$writeCallback$1(SichePayCodeHandler sichePayCodeHandler) {
        this.this$0 = sichePayCodeHandler;
    }

    @Override // com.wakeup.module.device.lib.callback.BleWriteCallback
    public void onWriteSuccess(int current, int total, byte[] justWrite) {
        String str;
        Handler handler;
        str = this.this$0.TAG;
        LogUtils.i(str, "onWriteSuccess");
        this.this$0.isWriting = false;
        handler = this.this$0.mHandler;
        final SichePayCodeHandler sichePayCodeHandler = this.this$0;
        handler.postDelayed(new Runnable() { // from class: com.wakeup.module.device.work.channel.siche.SichePayCodeHandler$writeCallback$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                SichePayCodeHandler.access$execSend(SichePayCodeHandler.this);
            }
        }, 150L);
    }

    @Override // com.wakeup.module.device.lib.callback.BleWriteCallback
    public void onWriteFailure(BleException exception) {
        String str;
        Handler handler;
        str = this.this$0.TAG;
        LogUtils.i(str, "onWriteFailure: " + (exception != null ? exception.toString() : null));
        this.this$0.isWriting = false;
        handler = this.this$0.mHandler;
        final SichePayCodeHandler sichePayCodeHandler = this.this$0;
        handler.postDelayed(new Runnable() { // from class: com.wakeup.module.device.work.channel.siche.SichePayCodeHandler$writeCallback$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SichePayCodeHandler.access$execSend(SichePayCodeHandler.this);
            }
        }, 150L);
    }
}
