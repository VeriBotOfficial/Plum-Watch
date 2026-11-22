package no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanFilter;
import android.os.ParcelUuid;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public interface DfuDeviceSelector {
    boolean matches(BluetoothDevice bluetoothDevice, int i, byte[] bArr, String str, String str2);

    default List<ScanFilter> getScanFilters(ParcelUuid parcelUuid) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ScanFilter.Builder().setServiceUuid(parcelUuid).build());
        arrayList.add(new ScanFilter.Builder().build());
        return arrayList;
    }
}
