package no.nordicsemi.android.dfu.internal.scanner;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.Build;
import android.os.ParcelUuid;
import java.util.List;
import java.util.UUID;
import no.nordicsemi.android.dfu.DfuDeviceSelector;

/* loaded from: classes8.dex */
class BootloaderScannerLollipop extends ScanCallback implements BootloaderScanner {
    private String mBootloaderAddress;
    private final String mDeviceAddress;
    private final String mDeviceAddressIncremented;
    private final ParcelUuid mDfuServiceUuid;
    private boolean mFound;
    private final Object mLock = new Object();
    private DfuDeviceSelector mSelector;

    BootloaderScannerLollipop(String str, String str2, UUID uuid) {
        this.mDeviceAddress = str;
        this.mDeviceAddressIncremented = str2;
        this.mDfuServiceUuid = new ParcelUuid(uuid);
    }

    @Override // no.nordicsemi.android.dfu.internal.scanner.BootloaderScanner
    public String searchUsing(DfuDeviceSelector dfuDeviceSelector, final long j) {
        BluetoothLeScanner bluetoothLeScanner;
        this.mSelector = dfuDeviceSelector;
        this.mBootloaderAddress = null;
        this.mFound = false;
        new Thread(new Runnable() { // from class: no.nordicsemi.android.dfu.internal.scanner.BootloaderScannerLollipop$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BootloaderScannerLollipop.this.m15965x4ce227c(j);
            }
        }, "Scanner timer").start();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || defaultAdapter.getState() != 12 || (bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner()) == null) {
            return null;
        }
        ScanSettings build = new ScanSettings.Builder().setScanMode(2).build();
        if (defaultAdapter.isOffloadedFilteringSupported() && Build.VERSION.SDK_INT >= 27) {
            bluetoothLeScanner.startScan(dfuDeviceSelector.getScanFilters(this.mDfuServiceUuid), build, this);
        } else {
            bluetoothLeScanner.startScan((List<ScanFilter>) null, build, this);
        }
        try {
            synchronized (this.mLock) {
                while (!this.mFound) {
                    this.mLock.wait();
                }
            }
        } catch (InterruptedException unused) {
        }
        bluetoothLeScanner.stopScan(this);
        return this.mBootloaderAddress;
    }

    /* renamed from: lambda$searchUsing$0$no-nordicsemi-android-dfu-internal-scanner-BootloaderScannerLollipop, reason: not valid java name */
    /* synthetic */ void m15965x4ce227c(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
        if (this.mFound) {
            return;
        }
        this.mBootloaderAddress = null;
        this.mFound = true;
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanResult(int i, ScanResult scanResult) {
        String address = scanResult.getDevice().getAddress();
        if (this.mFound || !this.mSelector.matches(scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord().getBytes(), this.mDeviceAddress, this.mDeviceAddressIncremented)) {
            return;
        }
        this.mBootloaderAddress = address;
        this.mFound = true;
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }
}
