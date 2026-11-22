package com.wakeup.module.device.work.analyzer;

import com.wakeup.common.log.LogUtils;
import com.wakeup.commponent.module.device.BleOrderAnalyzer;
import com.wakeup.commponent.module.device.EventType;
import com.wakeup.module.device.work.DeviceEventMgr;
import io.nats.client.support.ApiConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WriteNoiseAnalyzer.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/wakeup/module/device/work/analyzer/WriteNoiseAnalyzer;", "Lcom/wakeup/commponent/module/device/BleOrderAnalyzer;", "<init>", "()V", "TAG", "", "analyzeOrder", "", "mac", ApiConstants.BYTES, "", "datas", "", "", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WriteNoiseAnalyzer implements BleOrderAnalyzer {
    private final String TAG = "WriteNoiseAnalyzer";

    @Override // com.wakeup.commponent.module.device.BleOrderAnalyzer
    public void analyzeOrder(String mac, byte[] bytes, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(datas, "datas");
        if (datas.size() >= 6 && datas.get(0).intValue() == 234 && datas.get(4).intValue() == 46) {
            int intValue = datas.get(5).intValue();
            if (intValue == 1) {
                LogUtils.i(this.TAG, "设备请求白噪音音频名");
                DeviceEventMgr.send(EventType.TYPE_WRITE_NOISE, 0, 0);
                return;
            }
            if (intValue == 3) {
                int intValue2 = datas.get(6).intValue();
                LogUtils.i(this.TAG, "设备发送当前播放状态: " + intValue2);
                DeviceEventMgr.send(EventType.TYPE_WRITE_NOISE, 1, Integer.valueOf(intValue2));
            } else if (intValue == 4) {
                int intValue3 = datas.get(6).intValue();
                LogUtils.i(this.TAG, "设备发送当前播放模式: " + intValue3);
                DeviceEventMgr.send(EventType.TYPE_WRITE_NOISE, 2, Integer.valueOf(intValue3));
            } else {
                if (intValue != 5) {
                    return;
                }
                int intValue4 = datas.get(6).intValue();
                LogUtils.i(this.TAG, "设备" + (intValue4 == 1 ? "进入" : "退出") + "白噪音");
                DeviceEventMgr.send(EventType.TYPE_WRITE_NOISE, 3, Integer.valueOf(intValue4));
            }
        }
    }
}
