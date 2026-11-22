package com.baidu.location.f;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.GnssMeasurementsEvent;
import android.location.GnssNavigationMessage;
import android.location.GnssStatus;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.amap.location.support.bean.location.AmapLocation;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.baidu.location.b.aa;
import com.baidu.location.b.p;
import com.baidu.location.b.v;
import com.baidu.location.b.z;
import com.hjq.permissions.Permission;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes13.dex */
public class d {
    private static int A = 0;
    private static int B = 0;
    private static int C = 0;
    private static long D = 0;
    private static String R = null;
    private static double T = 100.0d;
    private static float W = -1.0f;

    /* renamed from: a, reason: collision with root package name */
    public static int f7666a = 0;
    private static final Lock al = new ReentrantLock();
    public static String b = "";
    public static String c = "";
    private static d f = null;
    private static Location j = null;
    private static int k = -1;
    private static int u;
    private static int v;
    private static int w;
    private static int x;
    private static int y;
    private static int z;
    private BDLocation ar;
    private String av;
    private Context g;
    private Location i;
    private GpsStatus n;
    private c o;
    private boolean p;
    private boolean r;
    private LocationManager h = null;
    private f l = null;
    private h m = null;

    /* renamed from: q, reason: collision with root package name */
    private C0349d f7668q = null;
    private GpsStatus.NmeaListener s = null;
    private OnNmeaMessageListener t = null;
    private long E = 0;
    private boolean F = false;
    private boolean G = false;
    private String H = null;
    private boolean I = false;
    private long J = 0;
    private long K = 0;
    private double L = -1.0d;
    private double M = 0.0d;
    private double N = 0.0d;
    private long O = 0;
    private long P = 0;
    private long Q = 0;
    private e S = null;
    private long U = 0;
    private long V = 0;
    private a X = null;
    private b Y = null;
    public ArrayList<ArrayList<Float>> d = new ArrayList<>();
    private ArrayList<ArrayList<Float>> Z = new ArrayList<>();
    private ArrayList<ArrayList<Float>> aa = new ArrayList<>();
    private ArrayList<ArrayList<Float>> ab = new ArrayList<>();
    private ArrayList<ArrayList<Float>> ac = new ArrayList<>();
    private ArrayList<ArrayList<Float>> ad = new ArrayList<>();
    private ArrayList<ArrayList<Float>> ae = new ArrayList<>();
    private ArrayList<ArrayList<Float>> af = new ArrayList<>();
    private String ag = null;
    private long ah = 0;

    /* renamed from: ai, reason: collision with root package name */
    private ArrayList<Integer> f7667ai = new ArrayList<>();
    private final LinkedHashMap<String, Float> aj = new LinkedHashMap<>();
    private long ak = 0;
    private String am = null;
    private String an = null;
    private long ao = 0;
    private long ap = -1;
    private long aq = -1;
    private boolean as = false;
    private boolean at = false;
    private long au = 0;
    private long aw = 0;
    private boolean ax = false;
    private boolean ay = false;
    private boolean az = false;
    private StringBuilder aA = new StringBuilder();
    private String aB = "";
    private long aC = -1;
    private long aD = 0;
    private long aE = 0;
    private boolean aF = false;
    private long aG = 0;
    private long aH = 0;
    private long aI = 0;
    private long aJ = 0;
    public long e = 0;
    private final String aK = "GpsMan-DUMP";
    private final String aL = "latitude";
    private final String aM = "longitude";
    private final String aN = "time";
    private final String aO = Const.JSON_KEY_ACCURACY;
    private final String aP = "provider";
    private final String aQ = "lastReceivedLocationTime";
    private final long aR = 10000;

    private class a extends GnssMeasurementsEvent.Callback {

        /* renamed from: a, reason: collision with root package name */
        public int f7670a;

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onGnssMeasurementsReceived(GnssMeasurementsEvent gnssMeasurementsEvent) {
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onStatusChanged(int i) {
            this.f7670a = i;
        }
    }

    private class b extends GnssNavigationMessage.Callback {

        /* renamed from: a, reason: collision with root package name */
        public int f7671a;

        private b() {
            this.f7671a = 0;
        }

        @Override // android.location.GnssNavigationMessage.Callback
        public void onGnssNavigationMessageReceived(GnssNavigationMessage gnssNavigationMessage) {
            aa a2;
            long currentTimeMillis;
            if (d.this.Q != 0) {
                a2 = aa.a();
                currentTimeMillis = d.this.Q;
            } else {
                a2 = aa.a();
                currentTimeMillis = System.currentTimeMillis() / 1000;
            }
            a2.a(gnssNavigationMessage, currentTimeMillis);
        }

        @Override // android.location.GnssNavigationMessage.Callback
        public void onStatusChanged(int i) {
            this.f7671a = i;
        }
    }

    private class c extends GnssStatus.Callback {
        private c() {
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i) {
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            ArrayList arrayList;
            if (d.this.h == null || gnssStatus == null) {
                return;
            }
            d.this.V = System.currentTimeMillis();
            int satelliteCount = gnssStatus.getSatelliteCount();
            d.this.ac.clear();
            d.this.ad.clear();
            d.this.ae.clear();
            d.this.af.clear();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < satelliteCount; i4++) {
                i++;
                ArrayList arrayList2 = new ArrayList();
                int constellationType = gnssStatus.getConstellationType(i4);
                arrayList2.add(Float.valueOf(gnssStatus.getAzimuthDegrees(i4)));
                arrayList2.add(Float.valueOf(gnssStatus.getElevationDegrees(i4)));
                arrayList2.add(Float.valueOf(gnssStatus.getCn0DbHz(i4)));
                if (gnssStatus.usedInFix(i4)) {
                    i2++;
                    arrayList2.add(Float.valueOf(1.0f));
                    if (constellationType == 1) {
                        i3++;
                    }
                } else {
                    arrayList2.add(Float.valueOf(0.0f));
                }
                arrayList2.add(Float.valueOf(gnssStatus.getSvid(i4)));
                if (constellationType == 1) {
                    arrayList2.add(Float.valueOf(1.0f));
                    arrayList = d.this.ac;
                } else {
                    if (constellationType == 5) {
                        arrayList2.add(Float.valueOf(2.0f));
                        d.this.ad.add(arrayList2);
                        d.this.aD = System.currentTimeMillis();
                    } else if (constellationType == 3) {
                        arrayList2.add(Float.valueOf(3.0f));
                        arrayList = d.this.ae;
                    } else if (constellationType == 6) {
                        arrayList2.add(Float.valueOf(4.0f));
                        arrayList = d.this.af;
                    }
                }
                arrayList.add(arrayList2);
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(d.this.ac);
            arrayList3.addAll(d.this.ad);
            arrayList3.addAll(d.this.ae);
            arrayList3.addAll(d.this.af);
            d.this.b((ArrayList<ArrayList<Float>>) arrayList3);
            d dVar = d.this;
            dVar.Z = dVar.a(true, false, false, false, true, -1.0f);
            d dVar2 = d.this;
            d.b = dVar2.a((ArrayList<ArrayList<Float>>) dVar2.Z);
            d dVar3 = d.this;
            dVar3.aa = dVar3.a(true, true, true, true, true, -1.0f);
            d dVar4 = d.this;
            dVar4.ab = dVar4.a(true, true, true, true, false, -1.0f);
            d dVar5 = d.this;
            d.c = dVar5.a((ArrayList<ArrayList<Float>>) dVar5.ab);
            if (com.baidu.location.b.c.a().bZ == 1) {
                com.baidu.location.b.h.a().a(d.this.ab);
            }
            d.f7666a = i2;
            int unused = d.u = i3;
            int unused2 = d.C = i;
            long unused3 = d.D = System.currentTimeMillis();
            d dVar6 = d.this;
            int unused4 = d.v = dVar6.a((ArrayList<ArrayList<Float>>) dVar6.ae, true, -1.0f).size();
            d dVar7 = d.this;
            int unused5 = d.w = dVar7.a((ArrayList<ArrayList<Float>>) dVar7.af, true, -1.0f).size();
            d dVar8 = d.this;
            int unused6 = d.x = dVar8.a((ArrayList<ArrayList<Float>>) dVar8.ad, true, -1.0f).size();
            d dVar9 = d.this;
            int unused7 = d.y = dVar9.a((ArrayList<ArrayList<Float>>) dVar9.ac, false, -1.0f).size();
            d dVar10 = d.this;
            int unused8 = d.z = dVar10.a((ArrayList<ArrayList<Float>>) dVar10.ae, false, -1.0f).size();
            d dVar11 = d.this;
            int unused9 = d.A = dVar11.a((ArrayList<ArrayList<Float>>) dVar11.af, false, -1.0f).size();
            d dVar12 = d.this;
            int unused10 = d.B = dVar12.a((ArrayList<ArrayList<Float>>) dVar12.ad, false, -1.0f).size();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            d.this.e((Location) null);
            d.this.b(false);
            d.f7666a = 0;
            int unused = d.u = 0;
            int unused2 = d.v = 0;
            int unused3 = d.w = 0;
            int unused4 = d.x = 0;
            int unused5 = d.y = 0;
            int unused6 = d.z = 0;
            int unused7 = d.A = 0;
            int unused8 = d.B = 0;
            int unused9 = d.C = 0;
            int unused10 = d.k = -1;
            Location unused11 = d.j = null;
        }
    }

    /* renamed from: com.baidu.location.f.d$d, reason: collision with other inner class name */
    private class C0349d implements GpsStatus.Listener {
        private long b;

        private C0349d() {
            this.b = 0L;
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int i) {
            long currentTimeMillis;
            ArrayList arrayList;
            if (d.this.h == null) {
                return;
            }
            int i2 = 0;
            if (i == 2) {
                d.this.e((Location) null);
                d.this.b(false);
                d.f7666a = 0;
                int unused = d.u = 0;
                int unused2 = d.v = 0;
                int unused3 = d.w = 0;
                int unused4 = d.x = 0;
                return;
            }
            if (i == 4 && d.this.G) {
                try {
                    if (d.this.n == null) {
                        d dVar = d.this;
                        dVar.n = dVar.h.getGpsStatus(null);
                    } else {
                        d.this.h.getGpsStatus(d.this.n);
                    }
                    d.this.V = System.currentTimeMillis();
                    d.this.ac.clear();
                    d.this.ad.clear();
                    d.this.ae.clear();
                    d.this.af.clear();
                    int i3 = 0;
                    for (GpsSatellite gpsSatellite : d.this.n.getSatellites()) {
                        ArrayList arrayList2 = new ArrayList();
                        int prn = gpsSatellite.getPrn();
                        arrayList2.add(Float.valueOf(gpsSatellite.getAzimuth()));
                        arrayList2.add(Float.valueOf(gpsSatellite.getElevation()));
                        arrayList2.add(Float.valueOf(gpsSatellite.getSnr()));
                        if (gpsSatellite.usedInFix()) {
                            i2++;
                            arrayList2.add(Float.valueOf(1.0f));
                            if (prn >= 1 && prn <= 32) {
                                i3++;
                            }
                        } else {
                            arrayList2.add(Float.valueOf(0.0f));
                        }
                        arrayList2.add(Float.valueOf(prn));
                        if (prn >= 1 && prn <= 32) {
                            arrayList2.add(Float.valueOf(1.0f));
                            arrayList = d.this.ac;
                        } else if (prn >= 201 && prn <= 261) {
                            arrayList2.add(Float.valueOf(2.0f));
                            arrayList = d.this.ad;
                        } else if (prn >= 65 && prn <= 96) {
                            arrayList2.add(Float.valueOf(3.0f));
                            arrayList = d.this.ae;
                        } else if (prn >= 301 && prn <= 336) {
                            arrayList2.add(Float.valueOf(4.0f));
                            arrayList = d.this.af;
                        }
                        arrayList.add(arrayList2);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.addAll(d.this.ac);
                    arrayList3.addAll(d.this.ad);
                    arrayList3.addAll(d.this.ae);
                    arrayList3.addAll(d.this.af);
                    d.this.b((ArrayList<ArrayList<Float>>) arrayList3);
                    d dVar2 = d.this;
                    dVar2.Z = dVar2.a(true, false, false, false, true, -1.0f);
                    d dVar3 = d.this;
                    d.b = dVar3.a((ArrayList<ArrayList<Float>>) dVar3.Z);
                    d dVar4 = d.this;
                    dVar4.aa = dVar4.a(true, true, true, true, true, -1.0f);
                    d dVar5 = d.this;
                    dVar5.ab = dVar5.a(true, true, true, true, false, -1.0f);
                    d dVar6 = d.this;
                    d.c = dVar6.a((ArrayList<ArrayList<Float>>) dVar6.ab);
                    if (com.baidu.location.b.c.a().bZ == 1) {
                        com.baidu.location.b.h.a().a(d.this.ab);
                    }
                    if (i3 > 0) {
                        int unused5 = d.u = i3;
                    }
                    if (i2 <= 0) {
                        if (System.currentTimeMillis() - this.b > 100) {
                            currentTimeMillis = System.currentTimeMillis();
                        }
                        long unused6 = d.D = System.currentTimeMillis();
                    }
                    currentTimeMillis = System.currentTimeMillis();
                    this.b = currentTimeMillis;
                    d.f7666a = i2;
                    long unused62 = d.D = System.currentTimeMillis();
                } catch (Exception unused7) {
                }
            }
        }
    }

    private static class e extends Handler {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<d> f7674a;
        d b;

        e(d dVar) {
            this.f7674a = new WeakReference<>(dVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (com.baidu.location.f.isServing) {
                d dVar = this.f7674a.get();
                this.b = dVar;
                if (dVar == null) {
                    return;
                }
                int i = message.what;
                if (i == 1) {
                    Location location = (Location) message.obj;
                    this.b.a(location, com.baidu.location.b.c.a().bZ == 1 ? com.baidu.location.b.h.a().a(location) : -1);
                } else if (i == 3) {
                    this.b.a("&og=1", (Location) message.obj);
                } else if (i == 4) {
                    this.b.a("&og=2", (Location) message.obj);
                } else {
                    if (i != 5) {
                        return;
                    }
                    this.b.a((String) message.obj);
                }
            }
        }
    }

    private class f implements LocationListener {
        private f() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location == null && com.baidu.location.h.i.g == 4) {
                return;
            }
            if (com.baidu.location.h.i.i(com.baidu.location.f.getServiceContext())) {
                com.baidu.location.f.c.a().a(location);
                return;
            }
            if (!com.baidu.location.h.i.a(location) && Math.abs(location.getLatitude()) <= 360.0d && Math.abs(location.getLongitude()) <= 360.0d) {
                d.this.Q = location.getTime() / 1000;
                d.this.ap = System.currentTimeMillis();
                if (d.this.P != 0) {
                    d.this.O = System.currentTimeMillis() - d.this.P;
                }
                d.this.P = System.currentTimeMillis();
                int i = d.f7666a;
                if (i == 0) {
                    try {
                        i = location.getExtras().getInt("satellites");
                    } catch (Exception unused) {
                    }
                }
                if (i == 0 || p.c().k()) {
                    System.currentTimeMillis();
                    long unused2 = d.this.V;
                }
                d.this.b(true);
                d.this.e(location);
                d.this.F = false;
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            d.this.e((Location) null);
            d.this.b(false);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
            if (i == 0) {
                d.this.e((Location) null);
                d.this.b(false);
            } else if (i != 1) {
                if (i != 2) {
                    return;
                }
                d.this.F = false;
            } else {
                d.this.E = System.currentTimeMillis();
                d.this.F = true;
                d.this.b(false);
            }
        }
    }

    private class g implements GpsStatus.NmeaListener {
        private g() {
        }

        @Override // android.location.GpsStatus.NmeaListener
        public void onNmeaReceived(long j, String str) {
            if (d.this.S != null) {
                d.this.S.sendMessage(d.this.S.obtainMessage(5, str));
            }
        }
    }

    private class h implements LocationListener {
        private long b;

        private h() {
            this.b = 0L;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (!(d.this.G && com.baidu.location.h.i.g == 4) && location != null && TextUtils.equals(location.getProvider(), "gps") && System.currentTimeMillis() - this.b >= 10000 && Math.abs(location.getLatitude()) <= 360.0d && Math.abs(location.getLongitude()) <= 360.0d && z.a(location, false)) {
                this.b = System.currentTimeMillis();
                if (d.this.S != null) {
                    d.this.e = System.currentTimeMillis();
                    d.this.S.sendMessage(d.this.S.obtainMessage(4, location));
                }
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    private d() {
        this.p = false;
        this.r = false;
        this.av = null;
        try {
            Class.forName("android.location.GnssStatus");
            this.p = true;
        } catch (ClassNotFoundException unused) {
            this.p = false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                this.av = Build.MANUFACTURER;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.r = false;
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f == null) {
                f = new d();
            }
            dVar = f;
        }
        return dVar;
    }

    public static String a(Location location) {
        if (location == null) {
            return null;
        }
        float speed = (float) (location.getSpeed() * 3.6d);
        if (!location.hasSpeed()) {
            speed = -1.0f;
        }
        int accuracy = (int) (location.hasAccuracy() ? location.getAccuracy() : -1.0f);
        double altitude = location.hasAltitude() ? location.getAltitude() : 555.0d;
        float bearing = location.hasBearing() ? location.getBearing() : -1.0f;
        String format = W < -0.01f ? String.format(Locale.CHINA, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_r=%d&ll_n=%d&ll_h=%.2f&ll_t=%d&ll_sn=%d|%d|%d|%d|%d&ll_asn=%d|%d|%d|%d|%d&ll_snr=%.1f", Double.valueOf(location.getLongitude()), Double.valueOf(location.getLatitude()), Float.valueOf(speed), Float.valueOf(bearing), Integer.valueOf(accuracy), Integer.valueOf(f7666a), Double.valueOf(altitude), Long.valueOf(location.getTime() / 1000), Integer.valueOf(f7666a), Integer.valueOf(u), Integer.valueOf(v), Integer.valueOf(w), Integer.valueOf(x), Integer.valueOf(C), Integer.valueOf(y), Integer.valueOf(z), Integer.valueOf(A), Integer.valueOf(B), Double.valueOf(T)) : String.format(Locale.CHINA, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_r=%d&ll_n=%d&ll_h=%.2f&ll_t=%d&ll_sn=%d|%d|%d|%d|%d&ll_asn=%d|%d|%d|%d|%d&ll_snr=%.1f&ll_bp=%.2f", Double.valueOf(location.getLongitude()), Double.valueOf(location.getLatitude()), Float.valueOf(speed), Float.valueOf(bearing), Integer.valueOf(accuracy), Integer.valueOf(f7666a), Double.valueOf(altitude), Long.valueOf(location.getTime() / 1000), Integer.valueOf(f7666a), Integer.valueOf(u), Integer.valueOf(v), Integer.valueOf(w), Integer.valueOf(x), Integer.valueOf(C), Integer.valueOf(y), Integer.valueOf(z), Integer.valueOf(A), Integer.valueOf(B), Double.valueOf(T), Float.valueOf(W));
        try {
            return ((k != 2 || j == null) ? new StringBuilder().append(format).append("&ll_fake=").append(k) : new StringBuilder().append(format).append(String.format(Locale.CHINA, "&ll_fake=%d|%.5f|%.5f|%d", Integer.valueOf(k), Double.valueOf(j.getLongitude()), Double.valueOf(j.getLatitude()), Long.valueOf(j.getTime() / 1000)))).toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return format;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(ArrayList<ArrayList<Float>> arrayList) {
        StringBuilder sb = new StringBuilder();
        if (arrayList.size() == 0) {
            return sb.toString();
        }
        Iterator<ArrayList<Float>> it = arrayList.iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            ArrayList<Float> next = it.next();
            if (next.size() == 6) {
                if (z2) {
                    z2 = false;
                } else {
                    sb.append("|");
                }
                sb.append(String.format("%.1f;", next.get(0)));
                sb.append(String.format("%.1f;", next.get(1)));
                sb.append(String.format("%.1f;", next.get(2)));
                sb.append(String.format("%.0f;", next.get(3)));
                sb.append(String.format("%.0f;", next.get(4)));
                sb.append(String.format("%.0f", next.get(5)));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<ArrayList<Float>> a(ArrayList<ArrayList<Float>> arrayList, boolean z2, float f2) {
        ArrayList<ArrayList<Float>> arrayList2 = new ArrayList<>();
        if (arrayList.size() <= 40 && arrayList.size() != 0) {
            Iterator<ArrayList<Float>> it = arrayList.iterator();
            while (it.hasNext()) {
                ArrayList<Float> next = it.next();
                if (next.size() == 6) {
                    float floatValue = next.get(3).floatValue();
                    float floatValue2 = next.get(2).floatValue();
                    if (!z2 || floatValue >= 1.0f) {
                        if (f2 <= 0.0f || floatValue2 >= f2) {
                            arrayList2.add(next);
                        }
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<ArrayList<Float>> a(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, float f2) {
        ArrayList<ArrayList<Float>> arrayList = new ArrayList<>();
        if (z2) {
            arrayList.addAll(a(this.ac, z6, f2));
        }
        if (z3) {
            arrayList.addAll(a(this.ad, z6, f2));
        }
        if (z4) {
            arrayList.addAll(a(this.ae, z6, f2));
        }
        if (z5) {
            arrayList.addAll(a(this.af, z6, f2));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0150, code lost:
    
        r15.setGnssProvider(com.baidu.location.BDLocation.BDLOCATION_GNSS_PROVIDER_FROM_BAIDU_BEIDOU);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.location.Location r14, int r15) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.f.d.a(android.location.Location, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (TextUtils.isEmpty(str) || !b(str)) {
            return;
        }
        if (str.startsWith("$GPGGA,")) {
            a(str, 2, 4, 6);
        } else if (str.startsWith("$GPRMC,")) {
            a(str, 3, 5, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00eb, code lost:
    
        if (android.text.TextUtils.equals(r0[r14], androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fb, code lost:
    
        r10.as = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f8, code lost:
    
        if (android.text.TextUtils.equals(r0[r14], "0") != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.f.d.a(java.lang.String, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Location location) {
        if (location == null) {
            return;
        }
        String str2 = str + com.baidu.location.b.b.a().d();
        boolean j2 = com.baidu.location.f.f.a().j();
        com.baidu.location.f.a f2 = com.baidu.location.f.f.a().f();
        if (f2 != null) {
            v.a(new com.baidu.location.f.a(f2));
        }
        v.a(System.currentTimeMillis());
        v.a(new Location(location));
        v.a(str2);
        v.b(com.baidu.location.b.e.a().c());
        if (j2) {
            return;
        }
        z.a(v.c(), (k) null, v.d(), str2, v.e());
    }

    public static boolean a(Location location, Location location2, boolean z2) {
        if (location == location2) {
            return false;
        }
        if (location == null || location2 == null) {
            return true;
        }
        float speed = location2.getSpeed();
        if (z2 && ((com.baidu.location.h.i.v == 3 || !com.baidu.location.h.f.a().a(location2.getLongitude(), location2.getLatitude())) && speed < 5.0f)) {
            return true;
        }
        float distanceTo = location2.distanceTo(location);
        return speed > com.baidu.location.h.i.L ? distanceTo > com.baidu.location.h.i.N : speed > com.baidu.location.h.i.K ? distanceTo > com.baidu.location.h.i.M : distanceTo > 5.0f;
    }

    public static String b(Location location) {
        String a2 = a(location);
        return a2 != null ? a2 + "&g_tp=0" : a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ArrayList<ArrayList<Float>> arrayList) {
        String str;
        if (arrayList == null || arrayList.size() <= 0) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder(100);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.ac);
            sb.append(com.baidu.location.h.c.g(arrayList2)).append("|").append(com.baidu.location.h.c.f(arrayList2)).append("|").append(com.baidu.location.h.c.a(arrayList2)).append("|").append(com.baidu.location.h.c.h(arrayList2)).append("|").append(com.baidu.location.h.c.b(arrayList2)).append("|").append(com.baidu.location.h.c.c(arrayList2)).append("|").append(com.baidu.location.h.c.e(arrayList2)).append("|").append(com.baidu.location.h.c.d(arrayList2));
            str = sb.toString();
        }
        this.ag = str;
        this.ah = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z2) {
        this.I = z2;
        W = -1.0f;
    }

    private boolean b(String str) {
        String str2;
        int i;
        if (str.indexOf("*") != -1 && str.indexOf("$") != -1 && str.indexOf("$") <= str.indexOf("*") && str.length() >= str.indexOf("*")) {
            byte[] bytes = str.substring(0, str.indexOf("*")).getBytes();
            if (bytes.length >= 2) {
                int i2 = bytes[1];
                for (int i3 = 2; i3 < bytes.length; i3++) {
                    i2 ^= bytes[i3];
                }
                str2 = String.format("%02x", Integer.valueOf(i2));
            } else {
                str2 = "";
            }
            int indexOf = str.indexOf("*");
            if (indexOf != -1 && str.length() >= (i = indexOf + 3) && str2.equalsIgnoreCase(str.substring(indexOf + 1, i))) {
                return true;
            }
        }
        return false;
    }

    public static String c(Location location) {
        String a2 = a(location);
        return a2 != null ? a2 + R : a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Location location) {
        if (this.S == null || System.currentTimeMillis() - this.aw <= 3000) {
            return;
        }
        this.S.sendMessage(this.S.obtainMessage(1, location));
    }

    private int f(Location location) {
        if (location == null) {
            return 0;
        }
        if (location.isFromMockProvider()) {
            return 100;
        }
        if (Math.abs(this.ap - this.aq) >= 3000) {
            this.aq = -1L;
            this.at = false;
            this.as = false;
            this.ar = null;
        } else if (this.ar == null) {
            if (!this.as) {
                return 200;
            }
            if (this.at) {
                return 300;
            }
        } else if (!this.at && this.as) {
            return 400;
        }
        if (this.ap > 0) {
            if (this.aq == -1) {
                return 500;
            }
        }
        return 0;
    }

    public static String m() {
        long currentTimeMillis = System.currentTimeMillis() - D;
        if (currentTimeMillis < 0 || currentTimeMillis >= 3000) {
            return null;
        }
        return String.format(Locale.US, "&gsvn=%d&gsfn=%d", Integer.valueOf(C), Integer.valueOf(f7666a));
    }

    private void o() {
        if (com.baidu.location.h.i.f7729a && this.I) {
            long j2 = this.P;
            Location location = this.i;
            SharedPreferences.Editor edit = com.baidu.location.f.getServiceContext().getSharedPreferences("GpsMan-DUMP", 0).edit();
            if (location != null && System.currentTimeMillis() - j2 < 10000) {
                edit.putLong("time", location.getTime());
                edit.putLong("latitude", Double.doubleToRawLongBits(location.getLatitude()));
                edit.putLong("longitude", Double.doubleToRawLongBits(location.getLongitude()));
                edit.putFloat(Const.JSON_KEY_ACCURACY, location.getAccuracy());
                if (location.getProvider() != null) {
                    edit.putString("provider", location.getProvider());
                }
                edit.putLong("lastReceivedLocationTime", j2);
            }
            edit.apply();
        }
    }

    private void p() {
        if (com.baidu.location.h.i.f7729a) {
            SharedPreferences sharedPreferences = com.baidu.location.f.getServiceContext().getSharedPreferences("GpsMan-DUMP", 0);
            long j2 = sharedPreferences.getLong("time", 0L);
            String string = sharedPreferences.getString("provider", null);
            long j3 = sharedPreferences.getLong("lastReceivedLocationTime", 0L);
            if (j2 == 0 || j3 == 0 || string == null || System.currentTimeMillis() - j3 > 10000) {
                return;
            }
            double longBitsToDouble = Double.longBitsToDouble(sharedPreferences.getLong("latitude", 0L));
            double longBitsToDouble2 = Double.longBitsToDouble(sharedPreferences.getLong("longitude", 0L));
            float f2 = sharedPreferences.getFloat(Const.JSON_KEY_ACCURACY, 0.0f);
            Location location = new Location(string);
            location.setTime(j2);
            location.setLatitude(longBitsToDouble);
            location.setLongitude(longBitsToDouble2);
            location.setAccuracy(f2);
            this.i = location;
            this.P = j3;
            this.I = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x000f, code lost:
    
        if (r3 == 1) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L8
            r2.az = r0
        L5:
            r2.ay = r0
            goto L12
        L8:
            r1 = 2
            if (r3 != r1) goto Le
            r2.az = r0
            goto L12
        Le:
            r1 = 1
            if (r3 != r1) goto L12
            goto L5
        L12:
            boolean r3 = r2.ay
            if (r3 != 0) goto L34
            boolean r3 = r2.az
            if (r3 == 0) goto L1b
            goto L34
        L1b:
            boolean r3 = r2.p
            if (r3 == 0) goto L34
            com.baidu.location.f.d$a r3 = r2.X
            if (r3 == 0) goto L34
            android.location.LocationManager r1 = r2.h
            if (r1 == 0) goto L34
            r1.unregisterGnssMeasurementsCallback(r3)     // Catch: java.lang.Exception -> L2b
            goto L2f
        L2b:
            r3 = move-exception
            r3.printStackTrace()
        L2f:
            r3 = 0
            r2.X = r3
            r2.ax = r0
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.f.d.a(int):void");
    }

    public void a(BDLocation bDLocation) {
        if (com.baidu.location.h.i.m || f(this.i) <= 0) {
            com.baidu.location.b.b.a().d(bDLocation);
        } else {
            com.baidu.location.b.b.a().c(bDLocation);
        }
    }

    public void a(boolean z2) {
        if (z2) {
            c();
        } else {
            d();
        }
    }

    public synchronized void b() {
        if (com.baidu.location.f.isServing) {
            Context serviceContext = com.baidu.location.f.getServiceContext();
            this.g = serviceContext;
            try {
                this.h = (LocationManager) serviceContext.getSystemService("location");
            } catch (Exception unused) {
            }
            this.S = new e(this);
        }
    }

    public void c() {
        if (this.G) {
            return;
        }
        try {
            if (!this.p) {
                C0349d c0349d = new C0349d();
                this.f7668q = c0349d;
                this.h.addGpsStatusListener(c0349d);
            } else if (com.baidu.location.h.i.a(this.g, Permission.ACCESS_FINE_LOCATION) == 1) {
                c cVar = new c();
                this.o = cVar;
                this.h.registerGnssStatusCallback(cVar);
            }
            h hVar = new h();
            this.m = hVar;
            this.h.requestLocationUpdates(AmapLocation.PASSIVE_PROVIDER, 9000L, 0.0f, hVar);
        } catch (Exception unused) {
        }
        try {
            this.l = new f();
            try {
                if (com.baidu.location.h.i.a(this.g, "android.permission.ACCESS_LOCATION_EXTRA_COMMANDS") == 1) {
                    this.h.sendExtraCommand("gps", "force_xtra_injection", new Bundle());
                }
            } catch (Exception unused2) {
            }
            if (com.baidu.location.h.i.a(this.g, Permission.ACCESS_FINE_LOCATION) == 1) {
                this.h.requestLocationUpdates("gps", 1000L, 0.0f, this.l);
                this.aF = true;
            }
            if (this.p && this.Y == null && com.baidu.location.h.i.aD == 1 && new Random().nextDouble() < com.baidu.location.h.i.aC) {
                this.Y = new b();
            }
            b bVar = this.Y;
            if (bVar != null) {
                this.h.registerGnssNavigationMessageCallback(bVar);
            }
            this.U = System.currentTimeMillis();
            if (!com.baidu.location.h.i.m && com.baidu.location.h.i.ba == 1) {
                OnNmeaMessageListener onNmeaMessageListener = new OnNmeaMessageListener() { // from class: com.baidu.location.f.d.1
                    @Override // android.location.OnNmeaMessageListener
                    public void onNmeaMessage(String str, long j2) {
                        if (d.this.S != null) {
                            d.this.S.sendMessage(d.this.S.obtainMessage(5, str));
                        }
                    }
                };
                this.t = onNmeaMessageListener;
                this.h.addNmeaListener(onNmeaMessageListener);
            }
            this.G = true;
        } catch (Exception unused3) {
        }
        p();
    }

    public void d() {
        c cVar;
        if (this.G) {
            LocationManager locationManager = this.h;
            if (locationManager != null) {
                try {
                    C0349d c0349d = this.f7668q;
                    if (c0349d != null) {
                        locationManager.removeGpsStatusListener(c0349d);
                        this.f7668q = null;
                    }
                    if (this.p && (cVar = this.o) != null) {
                        this.h.unregisterGnssStatusCallback(cVar);
                        this.o = null;
                    }
                    h hVar = this.m;
                    if (hVar != null) {
                        this.h.removeUpdates(hVar);
                        this.m = null;
                    }
                } catch (Exception unused) {
                }
                try {
                    f fVar = this.l;
                    if (fVar != null) {
                        this.h.removeUpdates(fVar);
                        this.aF = false;
                    }
                    OnNmeaMessageListener onNmeaMessageListener = this.t;
                    if (onNmeaMessageListener != null) {
                        this.h.removeNmeaListener(onNmeaMessageListener);
                    }
                    if (this.s != null) {
                        Class.forName("android.location.LocationManager").getMethod("removeNmeaListener", GpsStatus.NmeaListener.class).invoke(this.h, this.s);
                    }
                    b bVar = this.Y;
                    if (bVar != null) {
                        this.h.unregisterGnssNavigationMessageCallback(bVar);
                    }
                    a(0);
                } catch (Exception unused2) {
                }
            }
            com.baidu.location.h.i.e = 0;
            com.baidu.location.h.i.v = 0;
            this.l = null;
            this.G = false;
            b(false);
        }
    }

    public synchronized void e() {
        d();
        if (this.h == null) {
            return;
        }
        try {
            e eVar = this.S;
            if (eVar != null) {
                eVar.removeCallbacksAndMessages(null);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.h = null;
        if (com.baidu.location.b.c.a().bZ == 1 && com.baidu.location.b.h.a().b()) {
            com.baidu.location.b.h.a().c();
        }
    }

    public String f() {
        Location location;
        if (!k() || (location = this.i) == null) {
            return null;
        }
        return String.format("%s&idgps_tp=%s", a(location).replaceAll("ll", "idll").replaceAll("&d=", "&idd=").replaceAll("&s", "&ids="), this.i.getProvider());
    }

    public String g() {
        boolean z2;
        StringBuilder append;
        String str;
        if (this.i == null) {
            return null;
        }
        String str2 = "{\"result\":{\"time\":\"" + com.baidu.location.h.i.a() + "\",\"error\":\"61\"},\"content\":{\"point\":{\"x\":\"%f\",\"y\":\"%f\"},\"radius\":\"%d\",\"d\":\"%f\",\"s\":\"%f\",\"n\":\"%d\"";
        int accuracy = (int) (this.i.hasAccuracy() ? this.i.getAccuracy() : 10.0f);
        float speed = (float) (this.i.getSpeed() * 3.6d);
        if (!this.i.hasSpeed()) {
            speed = -1.0f;
        }
        double[] dArr = new double[2];
        if (com.baidu.location.h.f.a().a(this.i.getLongitude(), this.i.getLatitude())) {
            dArr = Jni.coorEncrypt(this.i.getLongitude(), this.i.getLatitude(), BDLocation.BDLOCATION_WGS84_TO_GCJ02);
            if (dArr[0] <= 0.0d && dArr[1] <= 0.0d) {
                dArr[0] = this.i.getLongitude();
                dArr[1] = this.i.getLatitude();
            }
            z2 = true;
        } else {
            dArr[0] = this.i.getLongitude();
            double latitude = this.i.getLatitude();
            dArr[1] = latitude;
            if (dArr[0] <= 0.0d && latitude <= 0.0d) {
                dArr[0] = this.i.getLongitude();
                dArr[1] = this.i.getLatitude();
            }
            z2 = false;
        }
        String format = String.format(Locale.CHINA, str2, Double.valueOf(dArr[0]), Double.valueOf(dArr[1]), Integer.valueOf(accuracy), Float.valueOf(this.i.getBearing()), Float.valueOf(speed), Integer.valueOf(f7666a));
        if (!z2) {
            format = format + ",\"in_cn\":\"0\"";
        }
        if (!com.baidu.location.h.i.m) {
            format = format + String.format(Locale.CHINA, ",\"is_mock\":%d", Integer.valueOf(f(this.i)));
        }
        if (this.i.hasAltitude()) {
            append = new StringBuilder().append(format);
            str = String.format(Locale.CHINA, ",\"h\":%.2f}}", Double.valueOf(this.i.getAltitude()));
        } else {
            append = new StringBuilder().append(format);
            str = "}}";
        }
        return append.append(str).toString();
    }

    public Location h() {
        if (this.i != null && Math.abs(System.currentTimeMillis() - this.i.getTime()) <= 60000) {
            return this.i;
        }
        return null;
    }

    public BDLocation i() {
        if (this.ar != null && Math.abs(System.currentTimeMillis() - this.aq) <= 3000) {
            return this.ar;
        }
        return null;
    }

    public boolean j() {
        try {
            System.currentTimeMillis();
            if (f7666a == 0) {
                try {
                    this.i.getExtras().getInt("satellites");
                } catch (Exception unused) {
                }
            }
            Location location = this.i;
            if (location != null && location.getLatitude() != 0.0d) {
                if (this.i.getLongitude() != 0.0d) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused2) {
            Location location2 = this.i;
            return (location2 == null || location2.getLatitude() == 0.0d || this.i.getLongitude() == 0.0d) ? false : true;
        }
    }

    public boolean k() {
        if (!j() || com.baidu.location.h.i.i(com.baidu.location.f.getServiceContext()) || System.currentTimeMillis() - this.J > 10000) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.F || currentTimeMillis - this.E >= 3000) {
            return this.I;
        }
        return true;
    }

    public boolean l() {
        return this.aF;
    }

    public synchronized String n() {
        String str;
        str = "-2";
        try {
            if (Math.abs(System.currentTimeMillis() - this.ah) < 3000) {
                String str2 = this.ag;
                str = str2 == null ? "0" : str2;
            } else {
                str = "-1";
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return "&gnsf=" + str;
    }
}
