package com.wakeup.module.device.work.analyzer;

import com.wakeup.commponent.module.device.BleOrderAnalyzer;
import com.wakeup.module.device.work.dataSync.DataSyncMgr;
import io.nats.client.support.ApiConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthDataAnalyzer2.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¨\u0006\r"}, d2 = {"Lcom/wakeup/module/device/work/analyzer/HealthDataAnalyzer2;", "Lcom/wakeup/commponent/module/device/BleOrderAnalyzer;", "<init>", "()V", "analyzeOrder", "", "mac", "", ApiConstants.BYTES, "", "datas", "", "", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HealthDataAnalyzer2 implements BleOrderAnalyzer {
    @Override // com.wakeup.commponent.module.device.BleOrderAnalyzer
    public void analyzeOrder(String mac, byte[] bytes, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(datas, "datas");
        if (datas.size() >= 6 && datas.get(0).intValue() == 234) {
            int intValue = datas.get(4).intValue();
            int intValue2 = datas.get(5).intValue();
            if (intValue == 42 && intValue2 == 1) {
                DataSyncMgr.saveSleepApnea(mac, datas);
            }
        }
    }
}
