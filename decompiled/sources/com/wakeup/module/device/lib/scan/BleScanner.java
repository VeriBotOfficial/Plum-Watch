package com.wakeup.module.device.lib.scan;

import android.os.Handler;
import android.os.Looper;
import com.wakeup.commponent.module.device.BleDevice;
import com.wakeup.module.device.lib.BleManager;
import com.wakeup.module.device.lib.callback.BleScanAndConnectCallback;
import com.wakeup.module.device.lib.callback.BleScanCallback;
import com.wakeup.module.device.lib.callback.BleScanPresenterImp;
import com.wakeup.module.device.lib.data.BleScanState;
import com.wakeup.module.device.lib.utils.BleLog;
import java.util.List;
import java.util.UUID;

/* loaded from: classes4.dex */
public class BleScanner {
    private BleScanState mBleScanState = BleScanState.STATE_IDLE;
    private final BleScanPresenter mBleScanPresenter = new BleScanPresenter() { // from class: com.wakeup.module.device.lib.scan.BleScanner.1
        @Override // com.wakeup.module.device.lib.scan.BleScanPresenter
        public void onScanStarted(boolean z) {
            BleScanPresenterImp bleScanPresenterImp = BleScanner.this.mBleScanPresenter.getBleScanPresenterImp();
            if (bleScanPresenterImp != null) {
                bleScanPresenterImp.onScanStarted(z);
            }
        }

        @Override // com.wakeup.module.device.lib.scan.BleScanPresenter
        /* renamed from: onLeScan */
        public void lambda$handleResult$0(BleDevice bleDevice) {
            BleScanAndConnectCallback bleScanAndConnectCallback;
            if (BleScanner.this.mBleScanPresenter.ismNeedConnect()) {
                BleScanPresenterImp bleScanPresenterImp = BleScanner.this.mBleScanPresenter.getBleScanPresenterImp();
                if (!(bleScanPresenterImp instanceof BleScanAndConnectCallback) || (bleScanAndConnectCallback = (BleScanAndConnectCallback) bleScanPresenterImp) == null) {
                    return;
                }
                bleScanAndConnectCallback.onLeScan(bleDevice);
                return;
            }
            BleScanCallback bleScanCallback = (BleScanCallback) BleScanner.this.mBleScanPresenter.getBleScanPresenterImp();
            if (bleScanCallback != null) {
                bleScanCallback.onLeScan(bleDevice);
            }
        }

        @Override // com.wakeup.module.device.lib.scan.BleScanPresenter
        public void onScanning(BleDevice bleDevice) {
            BleScanPresenterImp bleScanPresenterImp = BleScanner.this.mBleScanPresenter.getBleScanPresenterImp();
            if (bleScanPresenterImp != null) {
                bleScanPresenterImp.onScanning(bleDevice);
            }
        }

        @Override // com.wakeup.module.device.lib.scan.BleScanPresenter
        public void onScanFinished(List<BleDevice> list) {
            if (BleScanner.this.mBleScanPresenter.ismNeedConnect()) {
                final BleScanAndConnectCallback bleScanAndConnectCallback = (BleScanAndConnectCallback) BleScanner.this.mBleScanPresenter.getBleScanPresenterImp();
                if (list == null || list.isEmpty()) {
                    if (bleScanAndConnectCallback != null) {
                        bleScanAndConnectCallback.onScanFinished(null);
                        return;
                    }
                    return;
                } else {
                    final BleDevice bleDevice = list.get(0);
                    if (bleScanAndConnectCallback != null) {
                        bleScanAndConnectCallback.onScanFinished(bleDevice);
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.wakeup.module.device.lib.scan.BleScanner.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (bleDevice == null || bleScanAndConnectCallback == null) {
                                return;
                            }
                            BleManager.getInstance().connect(bleDevice, bleScanAndConnectCallback);
                        }
                    }, 100L);
                    list.clear();
                    return;
                }
            }
            BleScanCallback bleScanCallback = (BleScanCallback) BleScanner.this.mBleScanPresenter.getBleScanPresenterImp();
            if (bleScanCallback != null) {
                bleScanCallback.onScanFinished(list);
            }
        }
    };

    public static BleScanner getInstance() {
        return BleScannerHolder.sBleScanner;
    }

    private static class BleScannerHolder {
        private static final BleScanner sBleScanner = new BleScanner();

        private BleScannerHolder() {
        }
    }

    public void scan(UUID[] uuidArr, String[] strArr, String str, boolean z, long j, BleScanCallback bleScanCallback) {
        startLeScan(uuidArr, strArr, str, z, false, j, bleScanCallback);
    }

    public void scanAndConnect(UUID[] uuidArr, String[] strArr, String str, boolean z, long j, BleScanAndConnectCallback bleScanAndConnectCallback) {
        startLeScan(uuidArr, strArr, str, z, true, j, bleScanAndConnectCallback);
    }

    private synchronized void startLeScan(UUID[] uuidArr, String[] strArr, String str, boolean z, boolean z2, long j, BleScanPresenterImp bleScanPresenterImp) {
        if (this.mBleScanState != BleScanState.STATE_IDLE) {
            BleLog.w("scan action already exists, complete the previous scan action first");
            if (bleScanPresenterImp != null) {
                bleScanPresenterImp.onScanStarted(false);
            }
        } else {
            this.mBleScanPresenter.prepare(strArr, str, z, z2, j, bleScanPresenterImp);
            boolean startLeScan = BleManager.getInstance().getBluetoothAdapter().startLeScan(uuidArr, this.mBleScanPresenter);
            this.mBleScanState = startLeScan ? BleScanState.STATE_SCANNING : BleScanState.STATE_IDLE;
            this.mBleScanPresenter.notifyScanStarted(startLeScan);
        }
    }

    public synchronized void stopLeScan() {
        try {
            BleManager.getInstance().getBluetoothAdapter().stopLeScan(this.mBleScanPresenter);
        } catch (Exception unused) {
        }
        this.mBleScanState = BleScanState.STATE_IDLE;
        this.mBleScanPresenter.notifyScanStopped();
    }

    public BleScanState getScanState() {
        return this.mBleScanState;
    }
}
