package com.amap.api.col.p0003sl;

import android.location.GpsStatus;
import android.location.LocationManager;
import com.autonavi.aps.amapapi.utils.CoreUtil;
import com.autonavi.aps.amapapi.utils.DebugUtils;

/* compiled from: GpsLocation.java */
/* loaded from: classes11.dex */
class j implements GpsStatus.Listener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f1694a;

    j(k kVar) {
        this.f1694a = kVar;
    }

    @Override // android.location.GpsStatus.Listener
    public void onGpsStatusChanged(int i) {
        GpsStatus gpsStatus;
        try {
            k kVar = this.f1694a;
            LocationManager locationManager = kVar.d;
            if (locationManager == null) {
                return;
            }
            gpsStatus = kVar.s;
            kVar.s = locationManager.getGpsStatus(gpsStatus);
            if (i == 1) {
                this.f1694a.getClass();
                DebugUtils.writeCat("GpsLocation | status stopped ");
            } else {
                if (i == 2) {
                    k.a(this.f1694a);
                    return;
                }
                if (i == 3) {
                    this.f1694a.getClass();
                    DebugUtils.writeCat("GpsLocation | first fix ");
                } else {
                    if (i != 4) {
                        return;
                    }
                    k.c(this.f1694a);
                }
            }
        } catch (Throwable th) {
            DebugUtils.writeCat("GpsLocation | onGpsStatusChanged error: " + th.getMessage());
            CoreUtil.reportError(th, "GpsLocation", "onGpsStatusChanged");
        }
    }
}
