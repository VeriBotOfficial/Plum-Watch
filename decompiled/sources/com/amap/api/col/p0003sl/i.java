package com.amap.api.col.p0003sl;

import android.location.GnssStatus;
import com.autonavi.aps.amapapi.utils.DebugUtils;

/* compiled from: GpsLocation.java */
/* loaded from: classes11.dex */
class i extends GnssStatus.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f1684a;

    i(k kVar) {
        this.f1684a = kVar;
    }

    @Override // android.location.GnssStatus.Callback
    public void onFirstFix(int i) {
        this.f1684a.getClass();
        DebugUtils.writeCat("GpsLocation | first fix ");
    }

    @Override // android.location.GnssStatus.Callback
    public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        k.a(this.f1684a, gnssStatus);
    }

    @Override // android.location.GnssStatus.Callback
    public void onStarted() {
        this.f1684a.getClass();
        DebugUtils.writeCat("GpsLocation | status stopped ");
    }

    @Override // android.location.GnssStatus.Callback
    public void onStopped() {
        k.a(this.f1684a);
    }
}
