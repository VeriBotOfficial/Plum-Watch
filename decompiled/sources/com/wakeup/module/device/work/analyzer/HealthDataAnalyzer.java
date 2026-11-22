package com.wakeup.module.device.work.analyzer;

import com.wakeup.commponent.module.device.BleOrderAnalyzer;
import com.wakeup.module.device.work.dataSync.DataSyncMgr;
import io.nats.client.support.ApiConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthDataAnalyzer.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¨\u0006\r"}, d2 = {"Lcom/wakeup/module/device/work/analyzer/HealthDataAnalyzer;", "Lcom/wakeup/commponent/module/device/BleOrderAnalyzer;", "<init>", "()V", "analyzeOrder", "", "mac", "", ApiConstants.BYTES, "", "datas", "", "", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HealthDataAnalyzer implements BleOrderAnalyzer {
    @Override // com.wakeup.commponent.module.device.BleOrderAnalyzer
    public void analyzeOrder(String mac, byte[] bytes, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(datas, "datas");
        if (datas.size() >= 5 && datas.get(0).intValue() == 171) {
            int intValue = datas.get(4).intValue();
            if (intValue == 49) {
                if (datas.size() < 6) {
                    return;
                }
                int intValue2 = datas.get(5).intValue();
                if (intValue2 == 9) {
                    DataSyncMgr.saveSingleHR(mac, datas);
                    return;
                }
                if (intValue2 == 10) {
                    DataSyncMgr.saveCurrentHR(mac, datas);
                    return;
                }
                if (intValue2 == 17) {
                    DataSyncMgr.saveSingleBO(mac, datas);
                    return;
                }
                if (intValue2 == 18) {
                    DataSyncMgr.saveCurrentBO(mac, datas);
                    return;
                }
                if (intValue2 == 33) {
                    DataSyncMgr.saveSingleBP(mac, datas);
                    return;
                }
                if (intValue2 == 34) {
                    DataSyncMgr.saveCurrentBP(mac, datas);
                    return;
                } else if (intValue2 == 65) {
                    DataSyncMgr.saveSingleIMM(mac, datas);
                    return;
                } else {
                    if (intValue2 != 129) {
                        return;
                    }
                    DataSyncMgr.saveSingleTemperature(mac, datas);
                    return;
                }
            }
            if (intValue == 50) {
                DataSyncMgr.saveOnceKey(mac, datas);
                return;
            }
            if (intValue != 81) {
                if (intValue == 82) {
                    DataSyncMgr.saveSleep(mac, bytes, datas);
                    return;
                } else {
                    if (intValue != 183) {
                        return;
                    }
                    DataSyncMgr.saveSport(mac, bytes, datas);
                    return;
                }
            }
            if (datas.size() < 6) {
                return;
            }
            int intValue3 = datas.get(5).intValue();
            if (intValue3 == 8) {
                DataSyncMgr.saveCurrentStep(mac, bytes, datas);
                return;
            }
            if (intValue3 == 11) {
                DataSyncMgr.savePressure(mac, datas);
                return;
            }
            if (intValue3 == 24) {
                DataSyncMgr.saveMeasureIMM(mac, datas);
                return;
            }
            if (intValue3 == 32) {
                DataSyncMgr.hourlyMeasure1(mac, datas);
                return;
            }
            if (intValue3 != 33) {
                switch (intValue3) {
                    case 17:
                        DataSyncMgr.saveMeasureHR(mac, datas);
                        break;
                    case 18:
                        DataSyncMgr.saveMeasureBO(mac, datas);
                        break;
                    case 19:
                        DataSyncMgr.saveMeasureTemperature(mac, datas);
                        break;
                    case 20:
                        DataSyncMgr.saveMeasureBP(mac, datas);
                        break;
                }
                return;
            }
            DataSyncMgr.hourlyMeasure2(mac, datas);
        }
    }
}
