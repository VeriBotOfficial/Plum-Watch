package com.wakeup.module.device.work.channel.siche;

import com.wakeup.common.log.LogUtils;
import com.wakeup.module.device.lib.callback.BleWriteCallback;
import com.wakeup.module.device.lib.exception.BleException;
import kotlin.Metadata;

/* compiled from: SicheLogWrite.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/wakeup/module/device/work/channel/siche/SicheLogWrite;", "Lcom/wakeup/module/device/lib/callback/BleWriteCallback;", "<init>", "()V", "TAG", "", "onWriteSuccess", "", "current", "", "total", "justWrite", "", "onWriteFailure", "exception", "Lcom/wakeup/module/device/lib/exception/BleException;", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SicheLogWrite extends BleWriteCallback {
    private final String TAG = "SicheLog";

    @Override // com.wakeup.module.device.lib.callback.BleWriteCallback
    public void onWriteSuccess(int current, int total, byte[] justWrite) {
        LogUtils.i(this.TAG, "onWriteSuccess");
    }

    @Override // com.wakeup.module.device.lib.callback.BleWriteCallback
    public void onWriteFailure(BleException exception) {
        LogUtils.i(this.TAG, "onWriteFailure");
    }
}
