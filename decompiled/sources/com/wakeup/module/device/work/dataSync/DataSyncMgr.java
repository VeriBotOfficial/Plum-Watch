package com.wakeup.module.device.work.dataSync;

import android.os.Handler;
import android.os.Looper;
import com.wakeup.common.HealthChangeManager;
import com.wakeup.common.device.HealthSyncUiQuiet;
import com.wakeup.common.dfx.HealthFeedbackLogHelper;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.storage.CacheManager;
import com.wakeup.common.storage.DeviceDao;
import com.wakeup.common.storage.model.DeviceModel;
import com.wakeup.common.utils.DateUtil;
import com.wakeup.common.utils.JobQueue;
import com.wakeup.commponent.ServiceManager;
import com.wakeup.commponent.module.ble.BleOrderManager;
import com.wakeup.commponent.module.ble.WatchBleOrder;
import com.wakeup.commponent.module.device.EventType;
import com.wakeup.commponent.module.device.OnEventListener;
import com.wakeup.module.device.work.DeviceEventMgr;
import io.nats.client.support.ApiConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DataSyncMgr.kt */
@Metadata(d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0015*\u0001\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0007J&\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007J&\u0010\"\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007J\u001e\u0010#\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007J\u001e\u0010$\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007J\u001e\u0010%\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007J\u001e\u0010&\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007J\u001e\u0010'\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007J\u001e\u0010(\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007J\u001e\u0010)\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007J&\u0010*\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007J\u001e\u0010+\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007J\u001e\u0010,\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007J\u001e\u0010-\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007J\u001e\u0010.\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007J\u001e\u0010/\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007J\u001e\u00100\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007J\u001e\u00101\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007J\u001e\u00102\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007J\u001e\u00103\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007J\u001e\u00104\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007J\u001e\u00105\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u00066"}, d2 = {"Lcom/wakeup/module/device/work/dataSync/DataSyncMgr;", "", "<init>", "()V", "TAG", "", "SYNC_TIME_KEY", "mHandler", "Landroid/os/Handler;", "currSyncTime", "", "queue", "Lcom/wakeup/common/utils/JobQueue;", "dataProxy", "Lcom/wakeup/module/device/work/dataSync/DataSyncProxy;", "oldProxy", "Lcom/wakeup/module/device/work/dataSync/OldDataSyncProxy;", "listener", "com/wakeup/module/device/work/dataSync/DataSyncMgr$listener$1", "Lcom/wakeup/module/device/work/dataSync/DataSyncMgr$listener$1;", "startSyncData", "", "handlerWrite", "order", "isSuccess", "", "postOverDelay", "saveSport", "mac", ApiConstants.BYTES, "", "datas", "", "", "saveCurrentStep", "hourlyMeasure1", "hourlyMeasure2", "saveMeasureHR", "saveMeasureBO", "saveMeasureBP", "saveMeasureTemperature", "saveMeasureIMM", "saveSleep", "saveSleepApnea", "savePressure", "saveOnceKey", "saveSingleHR", "saveSingleBO", "saveSingleBP", "saveSingleTemperature", "saveSingleIMM", "saveCurrentHR", "saveCurrentBO", "saveCurrentBP", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DataSyncMgr {
    private static final String SYNC_TIME_KEY = "device_last_sync_time_";
    private static final String TAG = "DataSyncMgr";
    private static long currSyncTime;
    private static final DataSyncMgr$listener$1 listener;
    public static final DataSyncMgr INSTANCE = new DataSyncMgr();
    private static final Handler mHandler = new Handler(Looper.getMainLooper());
    private static final JobQueue queue = new JobQueue();
    private static final DataSyncProxy dataProxy = new DataSyncProxy();
    private static final OldDataSyncProxy oldProxy = new OldDataSyncProxy();

    private DataSyncMgr() {
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.wakeup.module.device.work.dataSync.DataSyncMgr$listener$1] */
    static {
        ?? r0 = new OnEventListener() { // from class: com.wakeup.module.device.work.dataSync.DataSyncMgr$listener$1
            @Override // com.wakeup.commponent.module.device.OnEventListener
            public void onEvent(EventType type, int code, Object data) {
                long j;
                Intrinsics.checkNotNullParameter(type, "type");
                if (type == EventType.TYPE_DEVICE_WRITE) {
                    DataSyncMgr dataSyncMgr = DataSyncMgr.INSTANCE;
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    dataSyncMgr.handlerWrite((String) data, code == 0);
                } else if (type == EventType.TYPE_SYNC_OVER) {
                    HealthSyncUiQuiet.end();
                    Iterator<Integer> it = HealthSyncUiQuiet.drainPending().iterator();
                    while (it.hasNext()) {
                        HealthChangeManager.getInstance().sendDataChange(it.next().intValue());
                    }
                    if (code != -1) {
                        String lastDeviceMac = DeviceDao.getLastDeviceMac();
                        j = DataSyncMgr.currSyncTime;
                        CacheManager.INSTANCE.saveLong("device_last_sync_time_" + lastDeviceMac, j);
                    }
                }
            }
        };
        listener = r0;
        ServiceManager.getDeviceService().registerListener((OnEventListener) r0, EventType.TYPE_DEVICE_WRITE, EventType.TYPE_SYNC_OVER);
    }

    @JvmStatic
    public static final void startSyncData() {
        String lastDeviceMac = DeviceDao.getLastDeviceMac();
        long j = CacheManager.INSTANCE.getLong(SYNC_TIME_KEY + lastDeviceMac);
        currSyncTime = System.currentTimeMillis();
        DeviceModel device = DeviceDao.getDevice(lastDeviceMac);
        if (device == null || 11 == device.getProductId() || device.isSleepSound()) {
            return;
        }
        LogUtils.i(TAG, "startSyncData lastTime: " + j);
        HealthSyncUiQuiet.begin();
        ServiceManager.getDeviceService().sendData(BleOrderManager.getWatchService().setSyncDataHr(j));
        ServiceManager.getDeviceService().sendData(BleOrderManager.getWatchService().syncSleepApnea(j));
        ServiceManager.getDeviceService().sendData(BleOrderManager.getWatchService().syncGpsData(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlerWrite(String order, boolean isSuccess) {
        if (Intrinsics.areEqual(order, WatchBleOrder.SYNC_DATA_ORDER2)) {
            if (!isSuccess) {
                HealthFeedbackLogHelper.onBleSyncWriteFail("SYNC_DATA_ORDER2 write fail");
                DeviceEventMgr.send(EventType.TYPE_SYNC_OVER, -1);
                return;
            } else {
                ServiceManager.getDeviceService().sendData(BleOrderManager.getWatchService().syncSleepData(DateUtil.addDay(System.currentTimeMillis(), -1)));
                postOverDelay();
                return;
            }
        }
        if (Intrinsics.areEqual(order, WatchBleOrder.SYNC_SLEEP_DATA_ORDER)) {
            if (!isSuccess) {
                HealthFeedbackLogHelper.onBleSyncWriteFail("SYNC_SLEEP_DATA_ORDER write fail");
                mHandler.removeCallbacksAndMessages(null);
                DeviceEventMgr.send(EventType.TYPE_SYNC_OVER, -1);
                return;
            }
            postOverDelay();
        }
    }

    @JvmStatic
    public static final synchronized void postOverDelay() {
        synchronized (DataSyncMgr.class) {
            Handler handler = mHandler;
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new Runnable() { // from class: com.wakeup.module.device.work.dataSync.DataSyncMgr$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DataSyncMgr.postOverDelay$lambda$0();
                }
            }, 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postOverDelay$lambda$0() {
        DeviceEventMgr.send(EventType.TYPE_SYNC_OVER);
    }

    @JvmStatic
    public static final void saveSport(String mac, byte[] bytes, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$saveSport$1(mac, bytes, datas, null));
    }

    @JvmStatic
    public static final void saveCurrentStep(String mac, byte[] bytes, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$saveCurrentStep$1(mac, bytes, datas, null));
        postOverDelay();
    }

    @JvmStatic
    public static final void hourlyMeasure1(String mac, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$hourlyMeasure1$1(mac, datas, null));
        postOverDelay();
    }

    @JvmStatic
    public static final void hourlyMeasure2(String mac, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$hourlyMeasure2$1(mac, datas, null));
        postOverDelay();
    }

    @JvmStatic
    public static final void saveMeasureHR(String mac, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$saveMeasureHR$1(mac, datas, null));
        postOverDelay();
    }

    @JvmStatic
    public static final void saveMeasureBO(String mac, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$saveMeasureBO$1(mac, datas, null));
        postOverDelay();
    }

    @JvmStatic
    public static final void saveMeasureBP(String mac, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$saveMeasureBP$1(mac, datas, null));
        postOverDelay();
    }

    @JvmStatic
    public static final void saveMeasureTemperature(String mac, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$saveMeasureTemperature$1(mac, datas, null));
        postOverDelay();
    }

    @JvmStatic
    public static final void saveMeasureIMM(String mac, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$saveMeasureIMM$1(mac, datas, null));
        postOverDelay();
    }

    @JvmStatic
    public static final void saveSleep(String mac, byte[] bytes, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$saveSleep$1(mac, bytes, datas, null));
        postOverDelay();
    }

    @JvmStatic
    public static final void saveSleepApnea(String mac, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$saveSleepApnea$1(mac, datas, null));
        postOverDelay();
    }

    @JvmStatic
    public static final void savePressure(String mac, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$savePressure$1(mac, datas, null));
        postOverDelay();
    }

    @JvmStatic
    public static final void saveOnceKey(String mac, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$saveOnceKey$1(mac, datas, null));
    }

    @JvmStatic
    public static final void saveSingleHR(String mac, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$saveSingleHR$1(mac, datas, null));
    }

    @JvmStatic
    public static final void saveSingleBO(String mac, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$saveSingleBO$1(mac, datas, null));
    }

    @JvmStatic
    public static final void saveSingleBP(String mac, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$saveSingleBP$1(mac, datas, null));
    }

    @JvmStatic
    public static final void saveSingleTemperature(String mac, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$saveSingleTemperature$1(mac, datas, null));
    }

    @JvmStatic
    public static final void saveSingleIMM(String mac, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$saveSingleIMM$1(mac, datas, null));
    }

    @JvmStatic
    public static final void saveCurrentHR(String mac, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$saveCurrentHR$1(mac, datas, null));
    }

    @JvmStatic
    public static final void saveCurrentBO(String mac, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$saveCurrentBO$1(mac, datas, null));
    }

    @JvmStatic
    public static final void saveCurrentBP(String mac, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(datas, "datas");
        queue.submit(new DataSyncMgr$saveCurrentBP$1(mac, datas, null));
    }
}
