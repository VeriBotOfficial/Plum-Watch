package com.wakeup.module.device.work.analyzer;

import com.wakeup.common.log.LogUtils;
import com.wakeup.commponent.module.device.BleOrderAnalyzer;
import com.wakeup.commponent.module.device.EventType;
import com.wakeup.module.device.work.DeviceEventMgr;
import io.nats.client.support.ApiConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetFtpOtaAnalyzer.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J&\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J&\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J&\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J&\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/wakeup/module/device/work/analyzer/NetFtpOtaAnalyzer;", "Lcom/wakeup/commponent/module/device/BleOrderAnalyzer;", "<init>", "()V", "TAG", "", "analyzeOrder", "", "mac", ApiConstants.BYTES, "", "datas", "", "", "handlerStart", "handlerProgress", "handlerEnd", "handlerConfirm", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NetFtpOtaAnalyzer implements BleOrderAnalyzer {
    private final String TAG = "NetFtpOtaAnalyzer";

    @Override // com.wakeup.commponent.module.device.BleOrderAnalyzer
    public void analyzeOrder(String mac, byte[] bytes, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(datas, "datas");
        if (datas.size() >= 6 && datas.get(0).intValue() == 234 && datas.get(3).intValue() == 255 && datas.get(4).intValue() == 37) {
            int intValue = datas.get(5).intValue();
            if (intValue == 1) {
                handlerStart(mac, bytes, datas);
                return;
            }
            if (intValue == 2) {
                handlerProgress(mac, bytes, datas);
            } else if (intValue == 3) {
                handlerEnd(mac, bytes, datas);
            } else {
                if (intValue != 4) {
                    return;
                }
                handlerConfirm(mac, bytes, datas);
            }
        }
    }

    private final void handlerStart(String mac, byte[] bytes, List<Integer> datas) {
        int intValue = datas.get(6).intValue();
        LogUtils.i(this.TAG, "网络FTP OTA开始 设备回复: " + intValue);
        DeviceEventMgr.send(EventType.TYPE_NET_FTP_OTA_RESULT, intValue);
    }

    private final void handlerProgress(String mac, byte[] bytes, List<Integer> datas) {
        int intValue = datas.get(6).intValue();
        LogUtils.i(this.TAG, "FTP 设备回复进度: " + intValue);
        DeviceEventMgr.send(EventType.TYPE_NET_FTP_OTA_PROGRESS, intValue);
    }

    private final void handlerEnd(String mac, byte[] bytes, List<Integer> datas) {
        int intValue = datas.get(6).intValue();
        LogUtils.i(this.TAG, "网络FTP OTA结束 设备回复: " + intValue);
        DeviceEventMgr.send(EventType.TYPE_NET_FTP_OTA_END_RESULT, intValue);
    }

    private final void handlerConfirm(String mac, byte[] bytes, List<Integer> datas) {
        LogUtils.i(this.TAG, "网络FTP OTA 设备回复 确认传输");
        DeviceEventMgr.send(EventType.TYPE_NET_FTP_OTA_CONFIRM, datas.get(6).intValue());
    }
}
