package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.GnssStatus;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.DPoint;
import com.autonavi.aps.amapapi.config.Const;
import com.autonavi.aps.amapapi.filters.LocFilter;
import com.autonavi.aps.amapapi.utils.AuthUtil;
import com.autonavi.aps.amapapi.utils.CoreUtil;
import com.autonavi.aps.amapapi.utils.DateUtil;
import com.autonavi.aps.amapapi.utils.DebugUtils;
import com.autonavi.aps.amapapi.utils.OffsetUtil;
import com.autonavi.aps.amapapi.utils.Reflect;
import com.autonavi.aps.amapapi.utils.ReportUtil;
import com.autonavi.aps.amapapi.utils.SPUtil;
import com.autonavi.aps.amapapi.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: GpsLocation.java */
/* loaded from: classes11.dex */
public class k implements r {
    static AMapLocation E = null;
    static long F = 0;
    static Object G = new Object();
    static long H = 0;
    static boolean I = false;
    static boolean J = false;
    public static volatile AMapLocation K;
    Handler b;
    private Context c;
    LocationManager d;
    AMapLocationClientOption e;
    LocFilter j;
    private GnssStatus.Callback u;
    private long f = 0;
    long g = 0;
    boolean h = false;
    private int i = 0;
    int k = 240;
    int l = 80;
    AMapLocation m = null;
    long n = 0;
    float o = 0.0f;
    Object p = new Object();

    /* renamed from: q, reason: collision with root package name */
    Object f1716q = new Object();
    private int r = 0;
    private GpsStatus s = null;
    private GpsStatus.Listener t = null;
    AMapLocationClientOption.GeoLanguage v = AMapLocationClientOption.GeoLanguage.DEFAULT;
    boolean w = true;
    long x = 0;
    int y = 0;
    LocationListener z = null;
    private String A = null;
    private boolean B = false;
    private int C = 0;
    private boolean D = false;

    /* compiled from: GpsLocation.java */
    static class a implements LocationListener {

        /* renamed from: a, reason: collision with root package name */
        private k f1717a;

        a(k kVar) {
            this.f1717a = kVar;
        }

        void a() {
            this.f1717a = null;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            try {
                DebugUtils.writeCat("GLS olc", "tid=" + Thread.currentThread().getId());
                k kVar = this.f1717a;
                if (kVar != null) {
                    k.a(kVar, location);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            try {
                k kVar = this.f1717a;
                if (kVar != null) {
                    k.a(kVar, str);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
            try {
                k kVar = this.f1717a;
                if (kVar != null) {
                    k.a(kVar, str, i, bundle);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public k(Context context, Handler handler) {
        this.j = null;
        this.c = context;
        this.b = handler;
        try {
            this.d = (LocationManager) context.getSystemService("location");
        } catch (Throwable th) {
            CoreUtil.reportError(th, "GpsLocation", "<init>");
        }
        this.j = new LocFilter();
    }

    static void a(k kVar) {
        kVar.getClass();
        DebugUtils.writeCat("GpsLocation | status stopped ");
        kVar.r = 0;
    }

    static void c(k kVar) {
        Iterable<GpsSatellite> satellites;
        kVar.getClass();
        int i = 0;
        try {
            GpsStatus gpsStatus = kVar.s;
            if (gpsStatus != null && (satellites = gpsStatus.getSatellites()) != null) {
                Iterator<GpsSatellite> it = satellites.iterator();
                int maxSatellites = kVar.s.getMaxSatellites();
                while (it.hasNext() && i < maxSatellites) {
                    if (it.next().usedInFix()) {
                        i++;
                    }
                }
            }
        } catch (Throwable th) {
            CoreUtil.reportError(th, "GpsLocation", "GPS_EVENT_SATELLITE_STATUS");
        }
        kVar.r = i;
    }

    private void d() {
        if (Utils.getTimeBoot() - F > 5000 || !Utils.locCorrect(E)) {
            return;
        }
        if (this.e.isMockEnable() || !E.isMock()) {
            synchronized (this.p) {
                a(E, K);
            }
            this.g = Utils.getTimeBoot();
            a(E);
        }
    }

    private boolean g() {
        try {
            return ((Boolean) Reflect.invokeStaticMethod(m9.b("KY29tLmFtYXAuYXBpLm5hdmkuQU1hcE5hdmk="), m9.b("UaXNOYXZpU3RhcnRlZA=="), (Object[]) null, (Class<?>[]) null)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public int e() {
        LocationManager locationManager = this.d;
        if (locationManager == null || !a(locationManager)) {
            return 1;
        }
        int i = Settings.Secure.getInt(this.c.getContentResolver(), "location_mode", 0);
        if (i == 0) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        return !this.w ? 4 : 0;
    }

    public int f() {
        return this.r;
    }

    public void b(AMapLocationClientOption aMapLocationClientOption) {
        Handler handler;
        if (aMapLocationClientOption == null) {
            aMapLocationClientOption = new AMapLocationClientOption();
        }
        this.e = aMapLocationClientOption;
        if (aMapLocationClientOption.getLocationMode() != AMapLocationClientOption.AMapLocationMode.Device_Sensors && (handler = this.b) != null) {
            handler.removeMessages(8);
        }
        if (this.v != this.e.getGeoLanguage()) {
            synchronized (this.p) {
                K = null;
            }
        }
        this.v = this.e.getGeoLanguage();
    }

    void b(AMapLocation aMapLocation) {
        if (Utils.locCorrect(aMapLocation) && this.b != null) {
            long timeBoot = Utils.getTimeBoot();
            if (this.e.getInterval() <= 8000 || timeBoot - this.x > this.e.getInterval() - 8000) {
                Bundle bundle = new Bundle();
                bundle.putDouble("lat", aMapLocation.getLatitude());
                bundle.putDouble("lon", aMapLocation.getLongitude());
                bundle.putBoolean(Const.JSON_KEY_ISOFFSET, aMapLocation.isOffset());
                bundle.putFloat("radius", aMapLocation.getAccuracy());
                bundle.putLong("time", aMapLocation.getTime());
                bundle.putInt("locationType", aMapLocation.getLocationType());
                Message obtain = Message.obtain();
                obtain.setData(bundle);
                obtain.what = 5;
                synchronized (this.p) {
                    if (K == null) {
                        this.b.sendMessage(obtain);
                    } else if (Utils.dist(aMapLocation, K) > this.l) {
                        this.b.sendMessage(obtain);
                    }
                }
            }
        }
    }

    static void a(k kVar, GnssStatus gnssStatus) {
        kVar.getClass();
        int i = 0;
        if (gnssStatus != null) {
            try {
                int satelliteCount = gnssStatus.getSatelliteCount();
                int i2 = 0;
                while (i < satelliteCount) {
                    try {
                        if (gnssStatus.usedInFix(i)) {
                            i2++;
                        }
                        i++;
                    } catch (Throwable th) {
                        th = th;
                        i = i2;
                        CoreUtil.reportError(th, "GpsLocation_Gnss", "GPS_EVENT_SATELLITE_STATUS");
                        kVar.r = i;
                    }
                }
                i = i2;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        kVar.r = i;
    }

    @Override // com.amap.api.col.p0003sl.t
    public void c() {
        LocationManager locationManager = this.d;
        if (locationManager == null) {
            return;
        }
        try {
            LocationListener locationListener = this.z;
            if (locationListener != null) {
                locationManager.removeUpdates(locationListener);
                ((a) this.z).a();
                this.z = null;
            }
        } catch (Throwable unused) {
        }
        try {
            GpsStatus.Listener listener = this.t;
            if (listener != null) {
                this.d.removeGpsStatusListener(listener);
            }
        } catch (Throwable unused2) {
        }
        try {
            GnssStatus.Callback callback = this.u;
            if (callback != null) {
                this.d.unregisterGnssStatusCallback(callback);
            }
        } catch (Throwable unused3) {
        }
        try {
            Handler handler = this.b;
            if (handler != null) {
                handler.removeMessages(8);
            }
        } catch (Throwable unused4) {
        }
        this.r = 0;
        this.f = 0L;
        this.x = 0L;
        this.g = 0L;
        this.i = 0;
        this.y = 0;
        this.j.reset();
        this.m = null;
        this.n = 0L;
        this.o = 0.0f;
        this.A = null;
        this.D = false;
    }

    private void c(AMapLocation aMapLocation) {
        try {
            if (CoreUtil.isChina(aMapLocation.getLatitude(), aMapLocation.getLongitude()) && this.e.isOffset()) {
                DPoint offset = OffsetUtil.offset(this.c, new DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
                aMapLocation.setLatitude(offset.getLatitude());
                aMapLocation.setLongitude(offset.getLongitude());
                aMapLocation.setOffset(this.e.isOffset());
                aMapLocation.setCoordType("GCJ02");
                return;
            }
            aMapLocation.setOffset(false);
            aMapLocation.setCoordType("WGS84");
        } catch (Throwable unused) {
            aMapLocation.setOffset(false);
            aMapLocation.setCoordType("WGS84");
        }
    }

    static void a(k kVar, String str) {
        kVar.getClass();
        try {
            if ("gps".equalsIgnoreCase(str)) {
                kVar.g = 0L;
                kVar.r = 0;
            }
        } catch (Throwable unused) {
        }
    }

    static void a(k kVar, String str, int i, Bundle bundle) {
        kVar.getClass();
        if (i == 0) {
            try {
                kVar.g = 0L;
                kVar.r = 0;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.amap.api.col.p0003sl.t
    public void a(AMapLocationClientOption aMapLocationClientOption) {
        k kVar;
        Throwable th;
        this.e = aMapLocationClientOption;
        if (aMapLocationClientOption == null) {
            this.e = new AMapLocationClientOption();
        }
        try {
            H = SPUtil.getPrefsLong(this.c, Const.STR_PREF, Const.SP_KEY_LAST_AGPS_TIME, H);
        } catch (Throwable unused) {
        }
        if (this.d == null) {
            return;
        }
        try {
            try {
                d();
                this.w = true;
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    try {
                        myLooper = this.c.getMainLooper();
                    } catch (Throwable th2) {
                        th = th2;
                        DebugUtils.writeCat("GpsLocation | requestLocationUpdates error: " + th.getMessage());
                        CoreUtil.reportError(th, "GpsLocation", "requestLocationUpdates part2");
                    }
                }
                Looper looper = myLooper;
                this.f = Utils.getTimeBoot();
                if (a(this.d)) {
                    try {
                        if (Utils.getTime() - H >= Const.MIN_TIME_AGPS_REQUEST) {
                            if (Utils.hasPerminssion(this.c, Const.ACCESS_LOCATION_EXTRA_COMMANDS_SELF_BASE64)) {
                                this.d.sendExtraCommand("gps", "force_xtra_injection", null);
                                H = Utils.getTime();
                                SharedPreferences.Editor startEdit = SPUtil.startEdit(this.c, Const.STR_PREF);
                                SPUtil.setPrefsLong(startEdit, Const.SP_KEY_LAST_AGPS_TIME, H);
                                SPUtil.endEdit(startEdit);
                                DebugUtils.writeCat("GpsLocation | sendExtraCommand");
                            } else {
                                CoreUtil.reportError(new Exception("n_alec"), "OPENSDK_GL", "rlu_n_alec");
                            }
                        }
                    } catch (Throwable th3) {
                        DebugUtils.writeCat("GpsLocation | sendExtraCommand error: " + th3.getMessage());
                    }
                    if (this.z == null) {
                        this.z = new a(this);
                    }
                    if (this.e.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Device_Sensors) && this.e.getDeviceModeDistanceFilter() > 0.0f) {
                        this.d.requestLocationUpdates("gps", this.e.getInterval(), this.e.getDeviceModeDistanceFilter(), this.z, looper);
                    } else {
                        this.d.requestLocationUpdates("gps", 900L, 0.0f, this.z, looper);
                    }
                    i iVar = new i(this);
                    this.u = iVar;
                    this.d.registerGnssStatusCallback(iVar);
                    a(8, 14, "no enough satellites#1401", this.e.getHttpTimeOut());
                    return;
                }
                DebugUtils.writeCat("GpsLocation | no GPS_provider");
                kVar = this;
                try {
                    kVar.a(8, 14, "no gps provider#1402", 0L);
                } catch (SecurityException e) {
                    e = e;
                    DebugUtils.writeCat("GpsLocation | no location permission");
                    kVar.w = false;
                    ReportUtil.reportLocError(null, 2121);
                    kVar.a(2, 12, e.getMessage() + "#1201", 0L);
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    DebugUtils.writeCat("GpsLocation | requestLocationUpdates error: " + th.getMessage());
                    CoreUtil.reportError(th, "GpsLocation", "requestLocationUpdates part2");
                }
            } catch (SecurityException e2) {
                e = e2;
                kVar = this;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    boolean a(LocationManager locationManager) {
        try {
            if (I) {
                return J;
            }
            List<String> allProviders = locationManager.getAllProviders();
            if (allProviders != null && allProviders.size() > 0) {
                J = allProviders.contains("gps");
            } else {
                J = false;
            }
            I = true;
            return J;
        } catch (Throwable th) {
            DebugUtils.writeCat("GpsLocation | hasProvider error: " + th.getMessage());
            return J;
        }
    }

    private void a(int i, int i2, String str, long j) {
        try {
            if (this.b == null || this.e.getLocationMode() != AMapLocationClientOption.AMapLocationMode.Device_Sensors) {
                return;
            }
            Message obtain = Message.obtain();
            AMapLocation aMapLocation = new AMapLocation("");
            aMapLocation.setProvider("gps");
            aMapLocation.setErrorCode(i2);
            aMapLocation.setLocationDetail(str);
            aMapLocation.setLocationType(1);
            obtain.obj = aMapLocation;
            obtain.what = i;
            this.b.sendMessageDelayed(obtain, j);
        } catch (Throwable unused) {
        }
    }

    static void a(k kVar, Location location) {
        Handler handler = kVar.b;
        if (handler != null) {
            handler.removeMessages(8);
        }
        if (location == null) {
            return;
        }
        try {
            AMapLocation aMapLocation = new AMapLocation(location);
            if (Utils.locCorrect(aMapLocation)) {
                aMapLocation.setProvider("gps");
                aMapLocation.setLocationType(1);
                if (!kVar.h && Utils.locCorrect(aMapLocation)) {
                    ReportUtil.reportGPSLocUseTime(kVar.c, Utils.getTimeBoot() - kVar.f, CoreUtil.isChina(aMapLocation.getLatitude(), aMapLocation.getLongitude()));
                    kVar.h = true;
                }
                if (Utils.isGpsMock(location, kVar.r)) {
                    aMapLocation.setMock(true);
                    aMapLocation.setTrustedLevel(4);
                    if (!kVar.e.isMockEnable()) {
                        int i = kVar.y;
                        if (i > 3) {
                            ReportUtil.reportLocError(null, ReportUtil.EXCEPTION_CODE_MOCKGPSLOC);
                            aMapLocation.setErrorCode(15);
                            aMapLocation.setLocationDetail("GpsLocation has been mocked!#1501");
                            aMapLocation.setLatitude(0.0d);
                            aMapLocation.setLongitude(0.0d);
                            aMapLocation.setAltitude(0.0d);
                            aMapLocation.setSpeed(0.0f);
                            aMapLocation.setAccuracy(0.0f);
                            aMapLocation.setBearing(0.0f);
                            aMapLocation.setExtras(null);
                            kVar.a(aMapLocation);
                            return;
                        }
                        kVar.y = i + 1;
                        return;
                    }
                } else {
                    kVar.y = 0;
                }
                aMapLocation.setSatellites(kVar.r);
                kVar.c(aMapLocation);
                try {
                    int i2 = kVar.r;
                    if (i2 >= 4) {
                        aMapLocation.setGpsAccuracyStatus(1);
                    } else if (i2 == 0) {
                        aMapLocation.setGpsAccuracyStatus(-1);
                    } else {
                        aMapLocation.setGpsAccuracyStatus(0);
                    }
                } catch (Throwable unused) {
                }
                if (Utils.locCorrect(aMapLocation) && AuthUtil.isNeedCheckGpsTime()) {
                    long time = aMapLocation.getTime();
                    long currentTimeMillis = System.currentTimeMillis();
                    long correctedGpsTime = DateUtil.getCorrectedGpsTime(time, currentTimeMillis, AuthUtil.getCheckGPSTimeOffsetYear());
                    if (correctedGpsTime != time) {
                        aMapLocation.setTime(correctedGpsTime);
                        ReportUtil.reportCheckGPSTime(time, currentTimeMillis);
                    }
                }
                if (Utils.locCorrect(aMapLocation) && kVar.i >= 3) {
                    if (aMapLocation.getAccuracy() < 0.0f || aMapLocation.getAccuracy() == Float.MAX_VALUE) {
                        aMapLocation.setAccuracy(0.0f);
                    }
                    if (aMapLocation.getSpeed() < 0.0f || aMapLocation.getSpeed() == Float.MAX_VALUE) {
                        aMapLocation.setSpeed(0.0f);
                    }
                    aMapLocation = kVar.j.filterGPSShake(aMapLocation);
                }
                if (Utils.locCorrect(aMapLocation)) {
                    kVar.g = Utils.getTimeBoot();
                    synchronized (G) {
                        F = Utils.getTimeBoot();
                        E = aMapLocation.m6869clone();
                    }
                    kVar.i++;
                }
                kVar.b(aMapLocation);
                synchronized (kVar.p) {
                    kVar.a(aMapLocation, K);
                }
                try {
                    if (Utils.locCorrect(aMapLocation)) {
                        if (kVar.m != null) {
                            kVar.n = location.getTime() - kVar.m.getTime();
                            kVar.o = Utils.dist(kVar.m, aMapLocation);
                        }
                        synchronized (kVar.f1716q) {
                            kVar.m = aMapLocation.m6869clone();
                        }
                        kVar.A = null;
                        kVar.B = false;
                        kVar.C = 0;
                    }
                } catch (Throwable th) {
                    CoreUtil.reportError(th, "GpsLocation", "onLocationChangedLast");
                }
                kVar.a(aMapLocation);
            }
        } catch (Throwable th2) {
            CoreUtil.reportError(th2, "GpsLocation", "onLocationChanged");
        }
    }

    private void a(AMapLocation aMapLocation) {
        if (aMapLocation.getErrorCode() != 15 || AMapLocationClientOption.AMapLocationMode.Device_Sensors.equals(this.e.getLocationMode())) {
            if (this.e.getLocationMode().equals(AMapLocationClientOption.AMapLocationMode.Device_Sensors) && this.e.getDeviceModeDistanceFilter() > 0.0f) {
                if (this.b != null) {
                    Message obtain = Message.obtain();
                    obtain.obj = aMapLocation;
                    obtain.what = 2;
                    this.b.sendMessage(obtain);
                    return;
                }
                return;
            }
            if (Utils.getTimeBoot() - this.x >= this.e.getInterval() - 200) {
                this.x = Utils.getTimeBoot();
                if (this.b != null) {
                    Message obtain2 = Message.obtain();
                    obtain2.obj = aMapLocation;
                    obtain2.what = 2;
                    this.b.sendMessage(obtain2);
                }
            }
        }
    }

    @Override // com.amap.api.col.p0003sl.t
    public void a(Bundle bundle) {
        if (bundle != null) {
            try {
                bundle.setClassLoader(AMapLocation.class.getClassLoader());
                this.k = bundle.getInt("I_MAX_GEO_DIS", this.k);
                this.l = bundle.getInt("I_MIN_GEO_DIS", this.l);
                AMapLocation aMapLocation = (AMapLocation) bundle.getParcelable("loc");
                if (TextUtils.isEmpty(aMapLocation.getAdCode())) {
                    return;
                }
                synchronized (this.p) {
                    K = aMapLocation;
                }
            } catch (Throwable th) {
                CoreUtil.reportError(th, "GpsLocation", "setLastGeoLocation");
            }
        }
    }

    private void a(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        if (aMapLocation2 == null || !this.e.isNeedAddress() || Utils.dist(aMapLocation, aMapLocation2) >= this.k) {
            return;
        }
        CoreUtil.transformAddress(aMapLocation, aMapLocation2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017f  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.amap.api.location.AMapLocation a(com.amap.api.location.AMapLocation r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.k.a(com.amap.api.location.AMapLocation, java.lang.String):com.amap.api.location.AMapLocation");
    }

    private boolean a(String str) {
        try {
            ArrayList<String> wifiListFromStrNb = Utils.getWifiListFromStrNb(str);
            ArrayList<String> wifiListFromStrNb2 = Utils.getWifiListFromStrNb(this.A);
            if (wifiListFromStrNb == null || wifiListFromStrNb.size() < 8 || wifiListFromStrNb2 == null || wifiListFromStrNb2.size() < 8) {
                return false;
            }
            return Utils.nbWifiSimiMem(this.A, str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
