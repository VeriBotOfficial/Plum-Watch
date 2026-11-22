package com.baidu.location.b;

import android.content.Intent;
import android.location.Location;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.LruCache;
import com.baidu.location.Address;
import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.baidu.location.LocationClientOption;
import com.baidu.location.Poi;
import com.baidu.location.PoiRegion;
import com.yandex.div.core.timer.TimerController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class b {
    public static long c = 0;
    public static int d = -1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f7525a;
    boolean b;
    int e;
    private ArrayList<a> f;
    private boolean g;
    private boolean h;
    private BDLocation i;
    private BDLocation j;
    private Object k;
    private long l;
    private LruCache<String, JSONObject> m;
    private String n;
    private String o;
    private String p;

    /* renamed from: q, reason: collision with root package name */
    private final String[] f7526q;
    private BDLocation r;
    private boolean s;
    private boolean t;
    private c u;

    private class a {

        /* renamed from: a, reason: collision with root package name */
        public String f7527a;
        public Messenger b;
        public LocationClientOption c = new LocationClientOption();
        public int d = 0;
        public int e;

        public a(Message message) {
            this.f7527a = null;
            this.b = null;
            this.e = 1;
            this.b = message.replyTo;
            this.e = message.arg1;
            this.f7527a = message.getData().getString("packName");
            this.c.prodName = message.getData().getString("prodName");
            com.baidu.location.h.b.a().a(this.c.prodName, this.f7527a);
            this.c.coorType = message.getData().getString("coorType");
            this.c.addrType = message.getData().getString("addrType");
            this.c.enableSimulateGps = message.getData().getBoolean("enableSimulateGps", false);
            com.baidu.location.h.i.m = com.baidu.location.h.i.m || this.c.enableSimulateGps;
            if (!com.baidu.location.h.i.f.equals("all")) {
                com.baidu.location.h.i.f = this.c.addrType;
            }
            com.baidu.location.h.i.f7729a = message.getData().getBoolean("enableCache", false);
            this.c.openGps = message.getData().getBoolean("openGPS");
            this.c.scanSpan = message.getData().getInt("scanSpan");
            this.c.timeOut = message.getData().getInt("timeOut");
            this.c.priority = message.getData().getInt("priority");
            this.c.forceGlobalUrl = message.getData().getBoolean("forceGlobalUrl", this.c.forceGlobalUrl);
            this.c.location_change_notify = message.getData().getBoolean("location_change_notify");
            this.c.mIsNeedDeviceDirect = message.getData().getBoolean("needDirect", false);
            this.c.isNeedAltitude = message.getData().getBoolean("isneedaltitude", false);
            this.c.isNeedNewVersionRgc = message.getData().getBoolean("isneednewrgc", false);
            com.baidu.location.h.d.f7712a = this.c.forceGlobalUrl;
            if (this.c.forceGlobalUrl) {
                com.baidu.location.h.d.b();
            }
            com.baidu.location.h.i.i = com.baidu.location.h.i.i || this.c.isNeedNewVersionRgc;
            com.baidu.location.h.i.h = com.baidu.location.h.i.h || message.getData().getBoolean("isneedaptag", false);
            com.baidu.location.h.i.j = com.baidu.location.h.i.j || message.getData().getBoolean("isneedaptagd", false);
            com.baidu.location.h.i.S = message.getData().getFloat("autoNotifyLocSensitivity", 0.5f);
            int i = message.getData().getInt("wfnum", com.baidu.location.h.i.az);
            float f = message.getData().getFloat("wfsm", com.baidu.location.h.i.aB);
            int i2 = message.getData().getInt("gnmcon", com.baidu.location.h.i.aD);
            double d = message.getData().getDouble("gnmcrm", com.baidu.location.h.i.aC);
            int i3 = message.getData().getInt("iupl", 1);
            com.baidu.location.h.i.aU = message.getData().getInt("ct", 10);
            com.baidu.location.h.i.aV = message.getData().getInt("suci", 3);
            com.baidu.location.h.i.aX = message.getData().getDoubleArray("cgs");
            com.baidu.location.h.i.aY = message.getData().getInt("ums", 1);
            com.baidu.location.h.i.aW = message.getData().getInt("smn", 40);
            if (i3 <= 0) {
                com.baidu.location.h.i.aT = 0;
            } else if (com.baidu.location.h.i.aT == -1) {
                com.baidu.location.h.i.aT = 1;
            }
            if (message.getData().getInt("opetco", 1) == 0) {
                com.baidu.location.h.i.aZ = 0;
            }
            if (message.getData().getInt("lpcs", com.baidu.location.h.i.ba) == 0) {
                com.baidu.location.h.i.ba = 0;
            }
            if (i2 == 1) {
                com.baidu.location.h.i.aD = 1;
            }
            if (d > com.baidu.location.h.i.aC) {
                com.baidu.location.h.i.aC = d;
            }
            com.baidu.location.h.i.ay = com.baidu.location.h.i.ay || message.getData().getBoolean("ischeckper", false);
            boolean z = message.getData().getBoolean("isEnableBeidouMode", false);
            if (Build.VERSION.SDK_INT >= 28) {
                com.baidu.location.h.i.bb = com.baidu.location.h.i.bb || z;
            }
            if (i > com.baidu.location.h.i.az) {
                com.baidu.location.h.i.az = i;
            }
            if (f > com.baidu.location.h.i.aB) {
                com.baidu.location.h.i.aB = f;
            }
            int i4 = message.getData().getInt("wifitimeout", Integer.MAX_VALUE);
            if (i4 < com.baidu.location.h.i.ag) {
                com.baidu.location.h.i.ag = i4;
            }
            int i5 = message.getData().getInt("autoNotifyMaxInterval", 0);
            if (i5 >= com.baidu.location.h.i.X) {
                com.baidu.location.h.i.X = i5;
            }
            int i6 = message.getData().getInt("autoNotifyMinDistance", 0);
            if (i6 >= com.baidu.location.h.i.Z) {
                com.baidu.location.h.i.Z = i6;
            }
            int i7 = message.getData().getInt("autoNotifyMinTimeInterval", 0);
            if (i7 >= com.baidu.location.h.i.Y) {
                com.baidu.location.h.i.Y = i7;
            }
            if (this.c.mIsNeedDeviceDirect || this.c.isNeedAltitude) {
                u.a().a(this.c.mIsNeedDeviceDirect);
                u.a().b();
            }
            b.this.b = b.this.b || this.c.isNeedAltitude;
            if (message.getData().getInt("hpdts", com.baidu.location.h.i.aE) == 1) {
                com.baidu.location.h.i.aE = 1;
            } else {
                com.baidu.location.h.i.aE = 0;
            }
            if (message.getData().getInt("oldts", com.baidu.location.h.i.aF) == 1) {
                com.baidu.location.h.i.aF = 1;
            } else {
                com.baidu.location.h.i.aF = 0;
            }
            int i8 = message.getData().getInt("onic", com.baidu.location.h.i.aG);
            if (i8 == 0) {
                com.baidu.location.h.i.aG = i8;
            }
            int i9 = message.getData().getInt("nlcs", com.baidu.location.h.i.aH);
            if (i9 == 1) {
                com.baidu.location.h.i.aH = i9;
            }
            com.baidu.location.h.i.aI = message.getData().getFloat("ncsr", com.baidu.location.h.i.aI);
            com.baidu.location.h.i.aJ = message.getData().getFloat("cscr", com.baidu.location.h.i.aJ);
            com.baidu.location.h.i.aK = message.getData().getInt("cls", com.baidu.location.h.i.aK);
            com.baidu.location.h.i.aL = message.getData().getIntArray("ocs");
            com.baidu.location.h.i.aM = com.baidu.location.h.i.a(com.baidu.location.h.i.aL, 18);
            com.baidu.location.h.i.aN = message.getData().getIntArray("occs");
            com.baidu.location.h.i.aO = com.baidu.location.h.i.a(com.baidu.location.h.i.aN, 6);
            com.baidu.location.h.i.aP = message.getData().getInt("topCellNumber");
            com.baidu.location.h.i.aQ = message.getData().getInt("locStrLength");
            com.baidu.location.h.i.aR = message.getData().getInt("hils");
            com.baidu.location.f.f.a().a((WifiInfo) null, message.getData().getString("connectBssid", null));
        }

        private double a(boolean z, BDLocation bDLocation, BDLocation bDLocation2) {
            double d;
            double latitude;
            double longitude;
            double latitude2;
            double longitude2;
            double a2;
            double[] dArr;
            if (z) {
                if (TextUtils.equals(bDLocation2.getCoorType(), bDLocation.getCoorType())) {
                    if (TextUtils.equals("bd09", bDLocation2.getCoorType())) {
                        double[] coorEncrypt = Jni.coorEncrypt(bDLocation2.getLongitude(), bDLocation2.getLatitude(), BDLocation.BDLOCATION_BD09_TO_GCJ02);
                        double[] coorEncrypt2 = Jni.coorEncrypt(bDLocation.getLongitude(), bDLocation.getLatitude(), BDLocation.BDLOCATION_BD09_TO_GCJ02);
                        latitude = coorEncrypt[1];
                        longitude = coorEncrypt[0];
                        latitude2 = coorEncrypt2[1];
                        longitude2 = coorEncrypt2[0];
                        a2 = com.baidu.location.h.i.a(latitude, longitude, latitude2, longitude2);
                    }
                    a2 = com.baidu.location.h.i.a(bDLocation2.getLatitude(), bDLocation2.getLongitude(), bDLocation.getLatitude(), bDLocation.getLongitude());
                } else {
                    if (TextUtils.equals("wgs84", bDLocation.getCoorType())) {
                        dArr = new double[]{bDLocation.getLongitude(), bDLocation.getLatitude()};
                    } else {
                        double[] coorEncrypt3 = TextUtils.equals("bd09", bDLocation.getCoorType()) ? Jni.coorEncrypt(bDLocation.getLongitude(), bDLocation.getLatitude(), BDLocation.BDLOCATION_BD09_TO_GCJ02) : TextUtils.equals("bd09ll", bDLocation.getCoorType()) ? Jni.coorEncrypt(bDLocation.getLongitude(), bDLocation.getLatitude(), BDLocation.BDLOCATION_BD09LL_TO_GCJ02) : new double[]{bDLocation.getLongitude(), bDLocation.getLatitude()};
                        dArr = Jni.coorEncrypt(coorEncrypt3[0], coorEncrypt3[1], "gcj2wgs");
                    }
                    bDLocation.setLatitude(dArr[1]);
                    d = dArr[0];
                    bDLocation.setLongitude(d);
                    bDLocation.setTime(com.baidu.location.h.i.a());
                    bDLocation.setCoorType("wgs84");
                    a2 = com.baidu.location.h.i.a(bDLocation2.getLatitude(), bDLocation2.getLongitude(), bDLocation.getLatitude(), bDLocation.getLongitude());
                }
            } else if (TextUtils.equals(bDLocation2.getCoorType(), bDLocation.getCoorType())) {
                latitude = bDLocation2.getLatitude();
                longitude = bDLocation2.getLongitude();
                latitude2 = bDLocation.getLatitude();
                longitude2 = bDLocation.getLongitude();
                a2 = com.baidu.location.h.i.a(latitude, longitude, latitude2, longitude2);
            } else {
                double[] coorEncrypt4 = Jni.coorEncrypt(bDLocation.getLongitude(), bDLocation.getLatitude(), "gcj2wgs");
                bDLocation.setLatitude(coorEncrypt4[1]);
                d = coorEncrypt4[0];
                bDLocation.setLongitude(d);
                bDLocation.setTime(com.baidu.location.h.i.a());
                bDLocation.setCoorType("wgs84");
                a2 = com.baidu.location.h.i.a(bDLocation2.getLatitude(), bDLocation2.getLongitude(), bDLocation.getLatitude(), bDLocation.getLongitude());
            }
            bDLocation2.setDisToRealLocation(a2);
            if (bDLocation != null) {
                bDLocation2.setReallLocation(bDLocation);
            }
            return a2;
        }

        private int a(double d) {
            if (d >= 0.0d && d <= 10.0d) {
                return 0;
            }
            if (d <= 10.0d || d > 100.0d) {
                return (d <= 100.0d || d > 200.0d) ? 3 : 2;
            }
            return 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i) {
            Message obtain = Message.obtain((Handler) null, i);
            try {
                Messenger messenger = this.b;
                if (messenger != null) {
                    messenger.send(obtain);
                }
                this.d = 0;
            } catch (Exception e) {
                if (e instanceof DeadObjectException) {
                    this.d++;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, Bundle bundle) {
            Message obtain = Message.obtain((Handler) null, i);
            obtain.setData(bundle);
            try {
                Messenger messenger = this.b;
                if (messenger != null) {
                    messenger.send(obtain);
                }
                this.d = 0;
            } catch (Exception e) {
                if (e instanceof DeadObjectException) {
                    this.d++;
                }
                e.printStackTrace();
            }
        }

        private void a(int i, String str, BDLocation bDLocation) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(str, bDLocation);
            bundle.setClassLoader(BDLocation.class.getClassLoader());
            Message obtain = Message.obtain((Handler) null, i);
            obtain.setData(bundle);
            try {
                Messenger messenger = this.b;
                if (messenger != null) {
                    messenger.send(obtain);
                }
                this.d = 0;
            } catch (Exception e) {
                if (e instanceof DeadObjectException) {
                    this.d++;
                }
            }
        }

        private BDLocation c() {
            BDLocation i = com.baidu.location.f.d.a().i();
            if (i == null) {
                return null;
            }
            double[] coorEncrypt = Jni.coorEncrypt(i.getLongitude(), i.getLatitude(), BDLocation.BDLOCATION_WGS84_TO_GCJ02);
            double[] coorEncrypt2 = Jni.coorEncrypt(coorEncrypt[0], coorEncrypt[1], this.c.coorType);
            BDLocation bDLocation = new BDLocation();
            bDLocation.setLongitude(coorEncrypt2[0]);
            bDLocation.setLatitude(coorEncrypt2[1]);
            bDLocation.setTime(com.baidu.location.h.i.a());
            bDLocation.setLocType(61);
            bDLocation.setCoorType(this.c.coorType);
            return bDLocation;
        }

        private BDLocation d() {
            BDLocation i = com.baidu.location.f.d.a().i();
            if (i == null) {
                return null;
            }
            double[] coorEncrypt = Jni.coorEncrypt(i.getLongitude(), i.getLatitude(), BDLocation.BDLOCATION_WGS84_TO_GCJ02);
            BDLocation bDLocation = new BDLocation();
            bDLocation.setLongitude(coorEncrypt[0]);
            bDLocation.setLatitude(coorEncrypt[1]);
            bDLocation.setTime(com.baidu.location.h.i.a());
            bDLocation.setLocType(61);
            bDLocation.setCoorType("gcj02");
            return bDLocation;
        }

        public int a(int i, boolean z, BDLocation bDLocation) {
            double a2;
            if (i == 100) {
                if (z) {
                    BDLocation c = c();
                    if (c == null) {
                        return 3;
                    }
                    a(true, c, bDLocation);
                    return 3;
                }
                BDLocation d = d();
                if (d == null) {
                    return 3;
                }
                a(false, d, bDLocation);
                return 3;
            }
            if (i == 200 || i == 300) {
                return 1;
            }
            if (i != 400) {
                return i == 500 ? 1 : 0;
            }
            if (z) {
                BDLocation c2 = c();
                if (c2 == null) {
                    return -1;
                }
                a2 = a(true, c2, bDLocation);
            } else {
                BDLocation d2 = d();
                if (d2 == null) {
                    return -1;
                }
                a2 = a(false, d2, bDLocation);
            }
            return a(a2);
        }

        public void a() {
            a(111);
        }

        public void a(BDLocation bDLocation) {
            a(bDLocation, 21);
        }

        public void a(BDLocation bDLocation, int i) {
            int a2;
            String str;
            BDLocation bDLocation2 = new BDLocation(bDLocation);
            if (com.baidu.location.indoor.h.a().e()) {
                bDLocation2.setIndoorLocMode(true);
            }
            if (i == 21) {
                a(27, "locStr", bDLocation2);
            }
            if (this.c.coorType != null && !this.c.coorType.equals("gcj02")) {
                double longitude = bDLocation2.getLongitude();
                double latitude = bDLocation2.getLatitude();
                if (longitude != Double.MIN_VALUE && latitude != Double.MIN_VALUE) {
                    if ((bDLocation2.getCoorType() != null && bDLocation2.getCoorType().equals("gcj02")) || bDLocation2.getCoorType() == null) {
                        double[] coorEncrypt = Jni.coorEncrypt(longitude, latitude, this.c.coorType);
                        bDLocation2.setLongitude(coorEncrypt[0]);
                        bDLocation2.setLatitude(coorEncrypt[1]);
                        str = this.c.coorType;
                    } else if (bDLocation2.getCoorType() != null && bDLocation2.getCoorType().equals("wgs84") && !this.c.coorType.equals("bd09ll")) {
                        double[] coorEncrypt2 = Jni.coorEncrypt(longitude, latitude, "wgs842mc");
                        bDLocation2.setLongitude(coorEncrypt2[0]);
                        bDLocation2.setLatitude(coorEncrypt2[1]);
                        str = "wgs84mc";
                    }
                    bDLocation2.setCoorType(str);
                }
                if (!com.baidu.location.h.i.m && bDLocation2.getMockGpsStrategy() > 0) {
                    a2 = a(bDLocation2.getMockGpsStrategy(), true, bDLocation2);
                    bDLocation2.setMockGpsProbability(a2);
                }
            } else if (!com.baidu.location.h.i.m && bDLocation2.getMockGpsStrategy() > 0) {
                a2 = a(bDLocation2.getMockGpsStrategy(), false, bDLocation2);
                bDLocation2.setMockGpsProbability(a2);
            }
            a(i, "locStr", bDLocation2);
        }

        public void b() {
            if (this.c.location_change_notify) {
                a(com.baidu.location.h.i.c ? 54 : 55);
            }
        }
    }

    /* renamed from: com.baidu.location.b.b$b, reason: collision with other inner class name */
    private static class C0342b {

        /* renamed from: a, reason: collision with root package name */
        private static b f7528a = new b();
    }

    private class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f7529a;
        private int b;
        private boolean c;

        @Override // java.lang.Runnable
        public void run() {
            if (this.c) {
                return;
            }
            this.b++;
            this.f7529a.t = false;
        }
    }

    private b() {
        this.f = null;
        this.g = false;
        this.h = true;
        this.f7525a = false;
        this.b = false;
        this.i = null;
        this.j = null;
        this.k = new Object();
        this.l = -1L;
        this.n = null;
        this.o = null;
        this.p = null;
        this.f7526q = new String[]{"name", "mac", "onLng", "onLat", "onLocType", "onTime", "offLng", "offLat", "offLocType", "offTime"};
        this.e = 0;
        this.r = null;
        this.s = false;
        this.t = false;
        this.u = null;
        this.f = new ArrayList<>();
        this.m = new LruCache<>(3);
        this.o = s.a().a("sp_loc_map_end_str", "");
        this.n = s.a().a("sp_loc_navi_end_str", "");
        this.p = s.a().a("sp_loc_last_navi_end_str", "");
        String a2 = s.a().a("sp_bluetooth_info", "");
        if (a2 == null || "".equals(a2)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(a2);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                this.m.put(jSONObject.getString("mac"), jSONObject);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private a a(Messenger messenger) {
        if (this.f == null) {
            return null;
        }
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        synchronized (this.k) {
            Iterator<a> it = this.f.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.b.equals(messenger)) {
                    return next;
                }
            }
            return null;
        }
    }

    public static b a() {
        return C0342b.f7528a;
    }

    private void a(a aVar) {
        if (aVar == null) {
            return;
        }
        synchronized (this.k) {
            if (a(aVar.b) != null) {
                aVar.a(14);
            } else {
                this.f.add(aVar);
                aVar.a(13);
            }
        }
    }

    private void a(String str) {
        Intent intent = new Intent("com.baidu.location.flp.log");
        intent.setPackage("com.baidu.baidulocationdemo");
        intent.putExtra("data", str);
        intent.putExtra("pack", com.baidu.location.h.b.e);
        intent.putExtra("tag", "state");
        com.baidu.location.f.getServiceContext().sendBroadcast(intent);
    }

    private void f() {
        g();
        e();
        h();
    }

    private void g() {
        boolean z;
        boolean z2 = false;
        try {
            try {
                synchronized (this.k) {
                    try {
                        Iterator<a> it = this.f.iterator();
                        z = false;
                        while (it.hasNext()) {
                            a next = it.next();
                            if (next.c.openGps) {
                                z2 = true;
                            }
                            if (next.c.location_change_notify) {
                                z = true;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                throw th;
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                com.baidu.location.h.i.b = z;
                if (this.g != z2 || (!com.baidu.location.f.d.a().l() && this.g)) {
                    this.g = z2;
                    com.baidu.location.f.d.a().a(this.g);
                }
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
    }

    private void h() {
        try {
            Iterator<a> it = this.f.iterator();
            while (it.hasNext()) {
                com.baidu.location.h.i.g = Math.min(com.baidu.location.h.i.g, it.next().c.priority);
            }
            if (com.baidu.location.f.isServing) {
                return;
            }
            com.baidu.location.h.i.g = 4;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(Bundle bundle, int i) {
        synchronized (this.k) {
            Iterator<a> it = this.f.iterator();
            while (it.hasNext()) {
                try {
                    a next = it.next();
                    next.a(i, bundle);
                    if (next.d > 4) {
                        it.remove();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public void a(Message message) {
        if (message == null || message.replyTo == null) {
            return;
        }
        c = System.currentTimeMillis();
        this.f7525a = true;
        com.baidu.location.f.f.a().i();
        a(new a(message));
        f();
        if (this.s) {
            a("start");
            this.e = 0;
        }
    }

    public void a(BDLocation bDLocation) {
        b(bDLocation);
    }

    public void a(boolean z) {
        this.f7525a = z;
        d = z ? 1 : 0;
    }

    public void b() {
        synchronized (this.k) {
            try {
                ArrayList<a> arrayList = this.f;
                if (arrayList != null) {
                    arrayList.clear();
                }
            } catch (Throwable unused) {
            }
        }
        this.i = null;
        f();
    }

    public void b(Message message) {
        synchronized (this.k) {
            a a2 = a(message.replyTo);
            if (a2 != null) {
                this.f.remove(a2);
            }
        }
        u.a().c();
        f();
        if (this.s) {
            a(TimerController.STOP_COMMAND);
            this.e = 0;
        }
    }

    public void b(BDLocation bDLocation) {
        BDLocation bDLocation2;
        if (bDLocation == null || bDLocation.getLocType() != 161 || com.baidu.location.a.a.a().c()) {
            if (!bDLocation.hasAltitude() && this.b && (bDLocation.getLocType() == 161 || bDLocation.getLocType() == 66)) {
                double d2 = com.baidu.location.c.a.a().a(bDLocation.getLongitude(), bDLocation.getLatitude())[0];
                com.baidu.location.c.a.a();
                if (d2 < 9999.0d) {
                    bDLocation.setAltitude(d2);
                }
            }
            if (bDLocation.getLocType() == 61) {
                bDLocation.setGpsAccuracyStatus(com.baidu.location.c.a.a().a(bDLocation));
            }
            synchronized (this.k) {
                Iterator<a> it = this.f.iterator();
                while (it.hasNext()) {
                    try {
                        a next = it.next();
                        next.a(bDLocation);
                        if (next.d > 4) {
                            it.remove();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        } else {
            if (this.j == null) {
                BDLocation bDLocation3 = new BDLocation();
                this.j = bDLocation3;
                bDLocation3.setLocType(505);
            }
            synchronized (this.k) {
                Iterator<a> it2 = this.f.iterator();
                while (it2.hasNext()) {
                    try {
                        a next2 = it2.next();
                        next2.a(this.j);
                        if (next2.d > 4) {
                            it2.remove();
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        if (bDLocation != null && (bDLocation.getLocType() == 61 || bDLocation.getLocType() == 161 || bDLocation.getLocType() == 66)) {
            com.baidu.location.b.c.a().a(bDLocation.getLatitude(), bDLocation.getLongitude());
            com.baidu.location.b.c.a().a(bDLocation.getCityCode());
        }
        boolean z = p.j;
        if (z) {
            p.j = false;
        }
        if (com.baidu.location.h.i.X >= 10000) {
            if (bDLocation.getLocType() == 61 || bDLocation.getLocType() == 161 || bDLocation.getLocType() == 66) {
                BDLocation bDLocation4 = this.i;
                if (bDLocation4 != null) {
                    float[] fArr = new float[1];
                    Location.distanceBetween(bDLocation4.getLatitude(), this.i.getLongitude(), bDLocation.getLatitude(), bDLocation.getLongitude(), fArr);
                    if (fArr[0] <= com.baidu.location.h.i.Z && !z) {
                        return;
                    }
                    this.i = null;
                    bDLocation2 = new BDLocation(bDLocation);
                } else {
                    bDLocation2 = new BDLocation(bDLocation);
                }
                this.i = bDLocation2;
            }
        }
    }

    public void c() {
        synchronized (this.k) {
            Iterator<a> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void c(BDLocation bDLocation) {
        Address a2 = p.c().a(bDLocation);
        String f = p.c().f();
        List<Poi> g = p.c().g();
        PoiRegion h = p.c().h();
        if (a2 != null) {
            bDLocation.setAddr(a2);
        }
        if (f != null) {
            bDLocation.setLocationDescribe(f);
        }
        if (g != null) {
            bDLocation.setPoiList(g);
        }
        if (h != null) {
            bDLocation.setPoiRegion(h);
        }
        if (com.baidu.location.indoor.h.a().f() && com.baidu.location.indoor.h.a().g() != null) {
            bDLocation.setFloor(com.baidu.location.indoor.h.a().g());
            bDLocation.setIndoorLocMode(true);
            if (com.baidu.location.indoor.h.a().h() != null) {
                bDLocation.setBuildingID(com.baidu.location.indoor.h.a().h());
            }
        }
        a(bDLocation);
        p.c().c(bDLocation);
    }

    public boolean c(Message message) {
        a a2 = a(message.replyTo);
        if (a2 == null) {
            return false;
        }
        int i = a2.c.scanSpan;
        a2.c.scanSpan = message.getData().getInt("scanSpan", a2.c.scanSpan);
        boolean z = true;
        if (a2.c.scanSpan < 1000) {
            u.a().c();
            this.f7525a = false;
        } else {
            this.f7525a = true;
        }
        if (a2.c.scanSpan <= 999 || i >= 1000) {
            z = false;
        } else {
            if (a2.c.mIsNeedDeviceDirect || a2.c.isNeedAltitude) {
                u.a().a(a2.c.mIsNeedDeviceDirect);
                u.a().b();
            }
            this.b = this.b || a2.c.isNeedAltitude;
        }
        com.baidu.location.h.i.f7729a = message.getData().getBoolean("enableCache", false);
        a2.c.openGps = message.getData().getBoolean("openGPS", a2.c.openGps);
        a2.c.forceGlobalUrl = message.getData().getBoolean("forceGlobalUrl", a2.c.forceGlobalUrl);
        String string = message.getData().getString("coorType");
        LocationClientOption locationClientOption = a2.c;
        if (string == null || string.equals("")) {
            string = a2.c.coorType;
        }
        locationClientOption.coorType = string;
        String string2 = message.getData().getString("addrType");
        LocationClientOption locationClientOption2 = a2.c;
        if (string2 == null || string2.equals("")) {
            string2 = a2.c.addrType;
        }
        locationClientOption2.addrType = string2;
        if (!com.baidu.location.h.i.f.equals(a2.c.addrType)) {
            p.c().l();
        }
        a2.c.timeOut = message.getData().getInt("timeOut", a2.c.timeOut);
        a2.c.location_change_notify = message.getData().getBoolean("location_change_notify", a2.c.location_change_notify);
        a2.c.priority = message.getData().getInt("priority", a2.c.priority);
        com.baidu.location.h.i.g = a2.c.priority;
        int i2 = message.getData().getInt("wifitimeout", Integer.MAX_VALUE);
        if (i2 < com.baidu.location.h.i.ag) {
            com.baidu.location.h.i.ag = i2;
        }
        com.baidu.location.h.d.f7712a = a2.c.forceGlobalUrl;
        if (a2.c.forceGlobalUrl) {
            com.baidu.location.h.d.b();
        }
        f();
        return z;
    }

    public int d(Message message) {
        a a2;
        if (message == null || message.replyTo == null || (a2 = a(message.replyTo)) == null || a2.c == null) {
            return 1;
        }
        return com.baidu.location.h.i.g;
    }

    public String d() {
        StringBuilder append;
        StringBuffer stringBuffer = new StringBuffer(256);
        if (this.f.isEmpty()) {
            return "&prod=" + com.baidu.location.h.b.f + ":" + com.baidu.location.h.b.e;
        }
        String stringBuffer2 = stringBuffer.toString();
        try {
            a aVar = this.f.get(0);
            if (aVar.c.prodName != null) {
                stringBuffer.append(aVar.c.prodName);
            }
            if (aVar.f7527a != null) {
                stringBuffer.append(":");
                stringBuffer.append(aVar.f7527a);
                stringBuffer.append("|");
            }
            if (stringBuffer2 == null || stringBuffer2.equals("")) {
                append = new StringBuilder("&prod=").append(com.baidu.location.h.b.f).append(":");
                stringBuffer2 = com.baidu.location.h.b.e;
            } else {
                append = new StringBuilder("&prod=");
            }
            return append.append(stringBuffer2).toString();
        } catch (Exception unused) {
            return "&prod=" + com.baidu.location.h.b.f + ":" + com.baidu.location.h.b.e;
        }
    }

    public void d(BDLocation bDLocation) {
        c(bDLocation);
    }

    public int e(Message message) {
        a a2;
        if (message == null || message.replyTo == null || (a2 = a(message.replyTo)) == null || a2.c == null) {
            return 1000;
        }
        return a2.c.scanSpan;
    }

    public void e() {
        try {
            synchronized (this.k) {
                Iterator<a> it = this.f.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
