package com.baidu.platform.comapi.wnplatform.c;

import android.content.Context;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.map.MessageCenter;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.wnplatform.WorkModeConfig;
import com.baidu.platform.comapi.wnplatform.model.datastruct.WLocData;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: WLocationManager.java */
/* loaded from: classes13.dex */
public class d extends com.baidu.platform.comapi.walknavi.a {

    /* renamed from: a, reason: collision with root package name */
    private static GeoPoint f8886a = new GeoPoint(0.0d, 0.0d);
    public static int b = 0;
    private List<com.baidu.platform.comapi.wnplatform.c.a> g;
    private com.baidu.platform.comapi.wnplatform.c.c j;
    private Handler k;
    private Context l;
    private long m;
    private WLocData c = null;
    private WLocData d = new WLocData();
    private LocationManager e = null;
    private ArrayList<com.baidu.platform.comapi.wnplatform.c.b> f = new ArrayList<>();
    private boolean h = false;
    private boolean i = false;
    private long n = 0;
    private int o = 2;
    private int p = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f8887q = 0;
    private long r = 0;
    private boolean s = false;
    private GpsStatus.Listener t = new a();
    private int u = 0;
    private boolean v = false;
    private Location w = null;
    private LocationListener x = new b();
    private LocationListener y = new c();

    /* compiled from: WLocationManager.java */
    class a implements GpsStatus.Listener {
        a() {
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int i) {
            d.this.o = i;
            if (d.this.o == 4) {
                d.this.n = SystemClock.elapsedRealtime();
            }
        }
    }

    /* compiled from: WLocationManager.java */
    class b implements LocationListener {
        b() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location == null || WorkModeConfig.b().f() || d.this.i) {
                return;
            }
            if (d.this.w != null) {
                d dVar = d.this;
                if (dVar.a(location, dVar.w)) {
                    d.this.w = location;
                }
                d dVar2 = d.this;
                dVar2.a(dVar2.w);
            } else {
                d.this.a(location);
            }
            d dVar3 = d.this;
            dVar3.a(dVar3.d, "gps");
            d.this.h = true;
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            if (d.this.g == null) {
                return;
            }
            for (int i = 0; i < d.this.g.size(); i++) {
                com.baidu.platform.comapi.wnplatform.c.a aVar = (com.baidu.platform.comapi.wnplatform.c.a) d.this.g.get(i);
                if (aVar != null) {
                    aVar.b(5);
                }
            }
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            if (d.this.g == null) {
                return;
            }
            for (int i = 0; i < d.this.g.size(); i++) {
                com.baidu.platform.comapi.wnplatform.c.a aVar = (com.baidu.platform.comapi.wnplatform.c.a) d.this.g.get(i);
                if (aVar != null) {
                    aVar.b(4);
                }
            }
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    /* compiled from: WLocationManager.java */
    class c implements LocationListener {
        c() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location != null) {
                if (d.this.w != null) {
                    d dVar = d.this;
                    if (dVar.a(location, dVar.w)) {
                        d.this.w = location;
                    }
                    d dVar2 = d.this;
                    dVar2.a(dVar2.w);
                } else {
                    d.this.a(location);
                }
                d dVar3 = d.this;
                dVar3.a(dVar3.d, "net");
                d.this.h = true;
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            if (d.this.g == null) {
                return;
            }
            for (int i = 0; i < d.this.g.size(); i++) {
                com.baidu.platform.comapi.wnplatform.c.a aVar = (com.baidu.platform.comapi.wnplatform.c.a) d.this.g.get(i);
                if (aVar != null) {
                    aVar.b(5);
                }
            }
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            if (d.this.g == null) {
                return;
            }
            for (int i = 0; i < d.this.g.size(); i++) {
                com.baidu.platform.comapi.wnplatform.c.a aVar = (com.baidu.platform.comapi.wnplatform.c.a) d.this.g.get(i);
                if (aVar != null) {
                    aVar.b(4);
                }
            }
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    /* compiled from: WLocationManager.java */
    /* renamed from: com.baidu.platform.comapi.wnplatform.c.d$d, reason: collision with other inner class name */
    private class HandlerC0425d extends Handler {
        private HandlerC0425d() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 4103) {
                if (d.this.g != null) {
                    for (com.baidu.platform.comapi.wnplatform.c.a aVar : d.this.g) {
                        if (aVar != null) {
                            aVar.d(message);
                        }
                    }
                }
                if (message.arg1 == 0) {
                    d.this.h = false;
                }
            }
        }

        /* synthetic */ HandlerC0425d(d dVar, a aVar) {
            this();
        }
    }

    private void f() {
        this.r = 0L;
        this.f8887q = 0;
        this.p = 0;
        this.n = 0L;
        this.o = 2;
    }

    public synchronized void g() {
        try {
            LocationManager locationManager = this.e;
            if (locationManager != null) {
                locationManager.removeUpdates(this.x);
            }
        } catch (Exception unused) {
        }
        try {
            LocationManager locationManager2 = this.e;
            if (locationManager2 != null) {
                locationManager2.removeGpsStatusListener(this.t);
            }
        } catch (Exception e) {
            com.baidu.platform.comapi.wnplatform.d.a.b(e.getMessage());
        }
        this.h = false;
        this.x = null;
        this.t = null;
        this.e = null;
    }

    public synchronized void h() {
        MessageCenter.unregistMessage(4103, this.k);
        g();
        ArrayList<com.baidu.platform.comapi.wnplatform.c.b> arrayList = this.f;
        if (arrayList != null) {
            arrayList.clear();
        }
        List<com.baidu.platform.comapi.wnplatform.c.a> list = this.g;
        if (list != null) {
            list.clear();
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        return true;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public void release() {
        h();
        if (this.k != null) {
            this.k = null;
        }
        this.l = null;
    }

    public GeoPoint c() {
        return new GeoPoint(f8886a.getLatitudeE6(), f8886a.getLongitudeE6());
    }

    public boolean d() {
        LocationManager locationManager = this.e;
        if (locationManager == null) {
            return false;
        }
        try {
            return locationManager.isProviderEnabled("gps");
        } catch (Exception e) {
            com.baidu.platform.comapi.wnplatform.d.a.b(e.getMessage());
            return false;
        }
    }

    public boolean e() {
        return this.s;
    }

    public void b(com.baidu.platform.comapi.wnplatform.c.a aVar) {
        List<com.baidu.platform.comapi.wnplatform.c.a> list = this.g;
        if (list == null || aVar == null) {
            return;
        }
        list.remove(aVar);
    }

    public synchronized void c(Context context) {
        b(context);
    }

    public void b(com.baidu.platform.comapi.wnplatform.c.b bVar) {
        this.f.remove(bVar);
    }

    public WLocData b() {
        GeoPoint ll2mc;
        WLocData wLocData;
        synchronized (this.d) {
            WLocData wLocData2 = this.d;
            new GeoPoint(wLocData2.latitude, wLocData2.longitude);
            WLocData wLocData3 = this.d;
            int i = wLocData3.coordType;
            if (i == 2) {
                ll2mc = CoordUtil.ll2mc(new LatLng(wLocData3.latitude, wLocData3.longitude));
            } else if (i == 3) {
                ll2mc = CoordUtil.ll2mc(CoordUtil.Coordinate_encryptEx((float) wLocData3.longitude, (float) wLocData3.latitude, "gcj02"));
            } else {
                ll2mc = i == 0 ? CoordUtil.ll2mc(CoordUtil.Coordinate_encryptEx((float) wLocData3.longitude, (float) wLocData3.latitude, "wgs84")) : null;
            }
            WLocData m7231clone = this.d.m7231clone();
            this.c = m7231clone;
            if (ll2mc != null) {
                m7231clone.longitude = ll2mc.getLongitudeE6();
                this.c.latitude = ll2mc.getLatitudeE6();
                this.c.coordType = this.d.coordType;
            }
            wLocData = this.c;
        }
        return wLocData;
    }

    public synchronized void a(Context context) {
        this.l = context;
        if (this.e == null) {
            this.e = (LocationManager) context.getSystemService("location");
        }
        HandlerC0425d handlerC0425d = new HandlerC0425d(this, null);
        this.k = handlerC0425d;
        MessageCenter.registMessage(4103, handlerC0425d);
        this.m = System.currentTimeMillis();
        this.s = true;
    }

    public void a(com.baidu.platform.comapi.wnplatform.c.b bVar) {
        this.f.add(bVar);
    }

    public void a(com.baidu.platform.comapi.wnplatform.c.a aVar) {
        if (this.g == null) {
            this.g = new LinkedList();
        }
        this.g.add(aVar);
    }

    public LatLng a(WLocData wLocData) {
        if (wLocData == null) {
            return null;
        }
        int i = wLocData.coordType;
        if (i == 2) {
            return new LatLng(wLocData.latitude, wLocData.longitude);
        }
        if (i == 3) {
            return CoordUtil.Coordinate_encryptEx((float) wLocData.longitude, (float) wLocData.latitude, "gcj02");
        }
        if (i == 0) {
            return CoordUtil.Coordinate_encryptEx((float) wLocData.longitude, (float) wLocData.latitude, "wgs84");
        }
        return null;
    }

    private void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            this.h = false;
            LocationManager locationManager = this.e;
            if (locationManager == null) {
                this.e = (LocationManager) context.getSystemService("location");
            } else {
                locationManager.removeUpdates(this.x);
            }
            this.e.requestLocationUpdates("gps", 0L, 0.0f, this.x);
            this.e.addGpsStatusListener(this.t);
            f();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Location location) {
        WLocData wLocData;
        if (location == null || (wLocData = this.d) == null) {
            return;
        }
        wLocData.latitude = location.getLatitude();
        this.d.longitude = location.getLongitude();
        this.d.speed = location.getSpeed();
        this.d.accuracy = Math.min(2000.0f, location.getAccuracy());
        this.d.direction = location.getBearing();
        this.d.altitude = location.getAltitude();
        this.d.coordType = 0;
    }

    public void b(WLocData wLocData) {
        com.baidu.platform.comapi.wnplatform.c.c cVar;
        this.i = true;
        WorkModeConfig.b().f();
        if (wLocData.accuracy < 80.0f) {
            try {
                WLocData m7231clone = wLocData.m7231clone();
                this.d = m7231clone;
                a(m7231clone, "sdk");
                if (wLocData.isIndoorMode) {
                    int i = b + 1;
                    b = i;
                    if (i <= 3 || (cVar = this.j) == null) {
                        return;
                    }
                    cVar.a();
                    return;
                }
                b = 0;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WLocData wLocData, String str) {
        GeoPoint geoPoint;
        ArrayList arrayList;
        if (wLocData == null) {
            return;
        }
        try {
            this.c = wLocData.m7231clone();
            int i = wLocData.coordType;
            if (i == 0) {
                geoPoint = com.baidu.platform.comapi.wnplatform.p.b.a(wLocData.longitude, wLocData.latitude);
            } else if (i == 3) {
                geoPoint = new GeoPoint((int) (wLocData.latitude * 100000.0d), (int) (wLocData.longitude * 100000.0d));
            } else {
                geoPoint = i == 2 ? new GeoPoint(wLocData.latitude, wLocData.longitude) : null;
            }
            if (geoPoint != null) {
                f8886a.setLongitudeE6(geoPoint.getLongitudeE6());
                f8886a.setLatitudeE6(geoPoint.getLatitudeE6());
            }
            synchronized (this.f) {
                arrayList = new ArrayList(this.f);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.baidu.platform.comapi.wnplatform.c.b bVar = (com.baidu.platform.comapi.wnplatform.c.b) it.next();
                if (bVar != null) {
                    bVar.a(this.c);
                }
            }
        } catch (Exception unused) {
        }
    }

    protected boolean a(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        boolean z2 = time < -120000;
        boolean z3 = time > 0;
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = accuracy > 200;
        boolean a2 = a(location.getProvider(), location2.getProvider());
        if (z5) {
            return true;
        }
        if (!z3 || z4) {
            return z3 && !z6 && a2;
        }
        return true;
    }

    private boolean a(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }
}
