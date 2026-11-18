package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface LocationListenerCompat extends LocationListener {
    @Override // android.location.LocationListener
    default void onFlushComplete(int r1) {
    }

    @Override // android.location.LocationListener
    default void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    default void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    default void onStatusChanged(String str, int r2, Bundle bundle) {
    }

    @Override // android.location.LocationListener
    default void onLocationChanged(List<Location> list) {
        int size = list.size();
        for (int r1 = 0; r1 < size; r1++) {
            onLocationChanged(list.get(r1));
        }
    }
}
