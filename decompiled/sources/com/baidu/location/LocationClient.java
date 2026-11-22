package com.baidu.location;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.baidu.lbsapi.auth.LBSAuthManager;
import com.baidu.location.LocationClientOption;
import com.baidu.location.LocationConst;
import com.baidu.location.b.g;
import com.baidu.location.b.o;
import com.baidu.location.h.d;
import com.baidu.location.h.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmind.core.style.IStyle;

/* loaded from: classes13.dex */
public final class LocationClient implements g.a {
    private static String B = null;
    public static final int CONNECT_HOT_SPOT_FALSE = 0;
    public static final int CONNECT_HOT_SPOT_TRUE = 1;
    public static final int CONNECT_HOT_SPOT_UNKNOWN = -1;
    public static final int LOC_DIAGNOSTIC_TYPE_BETTER_OPEN_FINE_PERMISSION = 10;
    public static final int LOC_DIAGNOSTIC_TYPE_BETTER_OPEN_GPS = 1;
    public static final int LOC_DIAGNOSTIC_TYPE_BETTER_OPEN_WIFI = 2;
    public static final int LOC_DIAGNOSTIC_TYPE_COARSE_FAIL = 11;
    public static final int LOC_DIAGNOSTIC_TYPE_FAIL_UNKNOWN = 9;
    public static final int LOC_DIAGNOSTIC_TYPE_NEED_CHECK_LOC_PERMISSION = 4;
    public static final int LOC_DIAGNOSTIC_TYPE_NEED_CHECK_NET = 3;
    public static final int LOC_DIAGNOSTIC_TYPE_NEED_CLOSE_FLYMODE = 7;
    public static final int LOC_DIAGNOSTIC_TYPE_NEED_INSERT_SIMCARD_OR_OPEN_WIFI = 6;
    public static final int LOC_DIAGNOSTIC_TYPE_NEED_OPEN_PHONE_LOC_SWITCH = 5;
    public static final int LOC_DIAGNOSTIC_TYPE_SERVER_FAIL = 8;
    private static boolean M = false;
    private String A;
    private boolean C;
    private boolean D;
    private Boolean E;
    private Boolean F;
    private Boolean G;
    private boolean H;
    private g I;
    private boolean J;
    private boolean K;
    private boolean L;
    private String N;
    private ServiceConnection O;
    private final Runnable P;

    /* renamed from: a, reason: collision with root package name */
    private long f7507a;
    private String b;
    private LocationClientOption c;
    private LocationClientOption d;
    private boolean e;
    private Context f;
    private Messenger g;
    private a h;
    private final Messenger i;
    private ArrayList<BDLocationListener> j;
    private ArrayList<BDAbstractLocationListener> k;
    private BDLocation l;
    private BDLocation m;
    private boolean n;
    private boolean o;
    private boolean p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f7508q;
    private b r;
    private boolean s;
    private final Object t;
    private long u;
    private long v;
    private long w;
    private com.baidu.location.d.a x;
    private BDLocationListener y;
    private String z;

    private static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<LocationClient> f7512a;

        a(Looper looper, LocationClient locationClient) {
            super(looper);
            this.f7512a = new WeakReference<>(locationClient);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            LocationClient locationClient = this.f7512a.get();
            if (locationClient == null) {
                return;
            }
            int i = message.what;
            if (i == 21) {
                Bundle data = message.getData();
                data.setClassLoader(BDLocation.class.getClassLoader());
                BDLocation bDLocation = (BDLocation) data.getParcelable("locStr");
                if (!locationClient.K && locationClient.J && bDLocation.getLocType() == 66) {
                    return;
                }
                if (!locationClient.K && locationClient.J) {
                    locationClient.K = true;
                    return;
                }
                if (!locationClient.K) {
                    locationClient.K = true;
                }
                locationClient.a(message, 21);
                return;
            }
            try {
                if (i == 303) {
                    Bundle data2 = message.getData();
                    int i2 = data2.getInt("loctype");
                    int i3 = data2.getInt("diagtype");
                    byte[] byteArray = data2.getByteArray("diagmessage");
                    if (i2 <= 0 || i3 <= 0 || byteArray == null || locationClient.k == null) {
                        return;
                    }
                    Iterator it = locationClient.k.iterator();
                    while (it.hasNext()) {
                        ((BDAbstractLocationListener) it.next()).onLocDiagnosticMessage(i2, i3, new String(byteArray, "UTF-8"));
                    }
                    return;
                }
                if (i == 406) {
                    Bundle data3 = message.getData();
                    byte[] byteArray2 = data3.getByteArray("mac");
                    String str = byteArray2 != null ? new String(byteArray2, "UTF-8") : null;
                    int i4 = data3.getInt("hotspot", -1);
                    if (locationClient.k != null) {
                        Iterator it2 = locationClient.k.iterator();
                        while (it2.hasNext()) {
                            ((BDAbstractLocationListener) it2.next()).onConnectHotSpotMessage(str, i4);
                        }
                        return;
                    }
                    return;
                }
                if (i == 701) {
                    locationClient.b((BDLocation) message.obj);
                    return;
                }
                if (i == 708) {
                    locationClient.a((String) message.obj);
                    return;
                }
                if (i == 804) {
                    Bundle data4 = message.getData();
                    data4.setClassLoader(BDLocation.class.getClassLoader());
                    BDLocation bDLocation2 = (BDLocation) data4.getParcelable(LocationConst.NaviVdrConst.KEY_VDR_LOCATION);
                    if (locationClient.k != null) {
                        Iterator it3 = locationClient.k.iterator();
                        while (it3.hasNext()) {
                            ((BDAbstractLocationListener) it3.next()).onReceiveVdrLocation(bDLocation2);
                        }
                        return;
                    }
                    return;
                }
                if (i == 1300) {
                    locationClient.f(message);
                    return;
                }
                if (i == 1400) {
                    locationClient.g(message);
                    return;
                }
                if (i == 26) {
                    locationClient.a(message, 26);
                    return;
                }
                if (i == 27) {
                    locationClient.i(message);
                    return;
                }
                if (i == 54) {
                    if (locationClient.c.location_change_notify) {
                        locationClient.s = true;
                        return;
                    }
                    return;
                }
                if (i == 55) {
                    if (locationClient.c.location_change_notify) {
                        locationClient.s = false;
                        return;
                    }
                    return;
                }
                if (i == 703) {
                    Bundle data5 = message.getData();
                    int i5 = data5.getInt("id", 0);
                    if (i5 > 0) {
                        locationClient.a(i5, (Notification) data5.getParcelable("notification"));
                        return;
                    }
                    return;
                }
                if (i == 704) {
                    locationClient.a(message.getData().getBoolean("removenotify"));
                    return;
                }
                switch (i) {
                    case 1:
                        locationClient.c();
                        break;
                    case 2:
                        locationClient.d();
                        break;
                    case 3:
                        locationClient.c(message);
                        break;
                    case 4:
                        locationClient.h();
                        break;
                    case 5:
                        locationClient.e(message);
                        break;
                    case 6:
                        locationClient.h(message);
                        break;
                    case 7:
                        break;
                    case 8:
                        locationClient.d(message);
                        break;
                    case 9:
                        locationClient.a(message);
                        break;
                    case 10:
                        locationClient.b(message);
                        break;
                    case 11:
                        locationClient.g();
                        break;
                    case 12:
                        locationClient.a();
                        break;
                    default:
                        super.handleMessage(message);
                        break;
                }
            } catch (Exception unused) {
            }
        }
    }

    private class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (LocationClient.this.t) {
                LocationClient.this.f7508q = false;
                if (LocationClient.this.g != null && LocationClient.this.i != null && ((LocationClient.this.j != null && LocationClient.this.j.size() >= 1) || (LocationClient.this.k != null && LocationClient.this.k.size() >= 1))) {
                    if (LocationClient.this.o) {
                        if (LocationClient.this.r == null) {
                            LocationClient locationClient = LocationClient.this;
                            locationClient.r = locationClient.new b();
                        }
                        LocationClient.this.h.postDelayed(LocationClient.this.r, LocationClient.this.c.scanSpan);
                    } else {
                        LocationClient.this.h.obtainMessage(4).sendToTarget();
                    }
                }
            }
        }
    }

    private class c extends Thread {
        private c() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (LocationClient.this.d.isOnceLocation()) {
                    com.baidu.location.f.c.a().b(LocationClient.this.f);
                }
                if (LocationClient.this.G.booleanValue()) {
                    if (LocationClient.this.I == null) {
                        com.baidu.location.f.f.a().b();
                        LocationClient.this.I = new g(LocationClient.this.f, LocationClient.this.d, LocationClient.this, null, false);
                    }
                    LocationClient locationClient = LocationClient.this;
                    locationClient.N = locationClient.I.g();
                    if (LocationClient.this.d.firstLocType == LocationClientOption.FirstLocType.ACCURACY_IN_FIRST_LOC) {
                        LocationClient.this.I.d();
                        LocationClient.this.I.e();
                    }
                }
                LocationClient.this.h.obtainMessage(1).sendToTarget();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public LocationClient(Context context) throws Exception {
        this.f7507a = 0L;
        this.b = null;
        this.c = new LocationClientOption();
        this.d = new LocationClientOption();
        this.e = false;
        this.f = null;
        this.g = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.p = false;
        this.f7508q = false;
        this.r = null;
        this.s = false;
        this.t = new Object();
        this.u = 0L;
        this.v = 0L;
        this.w = -1L;
        this.x = null;
        this.y = null;
        this.z = null;
        this.C = false;
        this.D = true;
        this.E = false;
        this.F = false;
        this.G = true;
        this.I = null;
        this.J = false;
        this.K = false;
        this.L = false;
        this.N = null;
        this.O = new ServiceConnection() { // from class: com.baidu.location.LocationClient.1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                LocationClient.this.g = new Messenger(iBinder);
                if (LocationClient.this.g == null) {
                    return;
                }
                LocationClient.this.e = true;
                if (LocationClient.this.D) {
                    LocationClient.this.h.obtainMessage(2).sendToTarget();
                    return;
                }
                try {
                    Message obtain = Message.obtain((Handler) null, 11);
                    obtain.replyTo = LocationClient.this.i;
                    obtain.setData(LocationClient.this.f());
                    LocationClient.this.g.send(obtain);
                    LocationClient.this.e = true;
                    if (LocationClient.this.c != null) {
                        LocationClient.this.G.booleanValue();
                        LocationClient.this.h.obtainMessage(4).sendToTarget();
                    }
                } catch (Exception unused) {
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                LocationClient.this.g = null;
                LocationClient.this.e = false;
            }
        };
        this.P = new Runnable() { // from class: com.baidu.location.LocationClient.2
            @Override // java.lang.Runnable
            public void run() {
                if (LocationClient.this.j != null) {
                    Iterator it = LocationClient.this.j.iterator();
                    while (it.hasNext()) {
                        ((BDLocationListener) it.next()).onReceiveLocation(LocationClient.this.l);
                    }
                }
                if (LocationClient.this.k != null) {
                    Iterator it2 = LocationClient.this.k.iterator();
                    while (it2.hasNext()) {
                        ((BDAbstractLocationListener) it2.next()).onReceiveLocation(LocationClient.this.l);
                    }
                }
                LocationClient.this.w = System.currentTimeMillis();
                if (LocationClient.this.p) {
                    LocationClient.this.p = false;
                }
            }
        };
        e();
        this.f = context;
        this.c = new LocationClientOption();
        this.h = new a(Looper.getMainLooper(), this);
        this.i = new Messenger(this.h);
    }

    public LocationClient(Context context, LocationClientOption locationClientOption) throws Exception {
        this.f7507a = 0L;
        this.b = null;
        this.c = new LocationClientOption();
        this.d = new LocationClientOption();
        this.e = false;
        this.f = null;
        this.g = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.p = false;
        this.f7508q = false;
        this.r = null;
        this.s = false;
        this.t = new Object();
        this.u = 0L;
        this.v = 0L;
        this.w = -1L;
        this.x = null;
        this.y = null;
        this.z = null;
        this.C = false;
        this.D = true;
        this.E = false;
        this.F = false;
        this.G = true;
        this.I = null;
        this.J = false;
        this.K = false;
        this.L = false;
        this.N = null;
        this.O = new ServiceConnection() { // from class: com.baidu.location.LocationClient.1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                LocationClient.this.g = new Messenger(iBinder);
                if (LocationClient.this.g == null) {
                    return;
                }
                LocationClient.this.e = true;
                if (LocationClient.this.D) {
                    LocationClient.this.h.obtainMessage(2).sendToTarget();
                    return;
                }
                try {
                    Message obtain = Message.obtain((Handler) null, 11);
                    obtain.replyTo = LocationClient.this.i;
                    obtain.setData(LocationClient.this.f());
                    LocationClient.this.g.send(obtain);
                    LocationClient.this.e = true;
                    if (LocationClient.this.c != null) {
                        LocationClient.this.G.booleanValue();
                        LocationClient.this.h.obtainMessage(4).sendToTarget();
                    }
                } catch (Exception unused) {
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                LocationClient.this.g = null;
                LocationClient.this.e = false;
            }
        };
        this.P = new Runnable() { // from class: com.baidu.location.LocationClient.2
            @Override // java.lang.Runnable
            public void run() {
                if (LocationClient.this.j != null) {
                    Iterator it = LocationClient.this.j.iterator();
                    while (it.hasNext()) {
                        ((BDLocationListener) it.next()).onReceiveLocation(LocationClient.this.l);
                    }
                }
                if (LocationClient.this.k != null) {
                    Iterator it2 = LocationClient.this.k.iterator();
                    while (it2.hasNext()) {
                        ((BDAbstractLocationListener) it2.next()).onReceiveLocation(LocationClient.this.l);
                    }
                }
                LocationClient.this.w = System.currentTimeMillis();
                if (LocationClient.this.p) {
                    LocationClient.this.p = false;
                }
            }
        };
        e();
        this.f = context;
        this.c = locationClientOption;
        this.d = new LocationClientOption(locationClientOption);
        this.h = new a(Looper.getMainLooper(), this);
        this.i = new Messenger(this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Message obtain = Message.obtain((Handler) null, 28);
        try {
            obtain.replyTo = this.i;
            this.g.send(obtain);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Notification notification) {
        try {
            Intent intent = new Intent(this.f, (Class<?>) f.class);
            intent.putExtra("notification", notification);
            intent.putExtra("id", i);
            intent.putExtra(com.heytap.mcssdk.constant.b.y, 1);
            this.f.startForegroundService(intent);
            this.L = true;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        if (message == null || message.obj == null) {
            return;
        }
        BDNotifyListener bDNotifyListener = (BDNotifyListener) message.obj;
        if (this.x == null) {
            this.x = new com.baidu.location.d.a(this.f, this);
        }
        this.x.a(bDNotifyListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message, int i) {
        if (this.e) {
            try {
                Bundle data = message.getData();
                data.setClassLoader(BDLocation.class.getClassLoader());
                BDLocation bDLocation = (BDLocation) data.getParcelable("locStr");
                this.l = bDLocation;
                if (bDLocation.getLocType() == 61) {
                    this.u = System.currentTimeMillis();
                }
                if (this.l.getLocType() == 61 || this.l.getLocType() == 161) {
                    com.baidu.location.b.a.a().a(this.l.getLatitude(), this.l.getLongitude(), this.l.getCoorType());
                }
                b(i);
            } catch (Exception unused) {
            }
        }
    }

    private void a(BDLocation bDLocation) {
        ArrayList<BDLocationListener> arrayList = this.j;
        if (arrayList != null) {
            Iterator<BDLocationListener> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onReceiveLocation(bDLocation);
            }
        }
        ArrayList<BDAbstractLocationListener> arrayList2 = this.k;
        if (arrayList2 != null) {
            Iterator<BDAbstractLocationListener> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().onReceiveLocation(bDLocation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        ArrayList<BDAbstractLocationListener> arrayList = this.k;
        if (arrayList != null) {
            Iterator<BDAbstractLocationListener> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onReceiveLocString(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        try {
            Intent intent = new Intent(this.f, (Class<?>) f.class);
            intent.putExtra("removenotify", z);
            intent.putExtra(com.heytap.mcssdk.constant.b.y, 2);
            this.f.startService(intent);
            this.L = true;
        } catch (Exception unused) {
        }
    }

    private boolean a(int i) {
        if (this.g != null && this.e) {
            try {
                this.g.send(Message.obtain((Handler) null, i));
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private void b() {
        LBSAuthManager.getInstance(this.f.getApplicationContext()).setPrivacyMode(M);
        com.baidu.location.a.a.a().a(this.f, B);
    }

    private void b(int i) {
        if (this.l.getCoorType() == null) {
            this.l.setCoorType(this.c.coorType);
        }
        if (this.n || ((this.c.location_change_notify && this.l.getLocType() == 61) || this.l.getLocType() == 66 || this.l.getLocType() == 67 || this.C || this.l.getLocType() == 161)) {
            long currentTimeMillis = ((System.currentTimeMillis() - this.w) - getLocOption().getScanSpan()) + 300;
            if (this.p || this.w == -1 || currentTimeMillis >= 0) {
                ArrayList<BDLocationListener> arrayList = this.j;
                if (arrayList != null) {
                    Iterator<BDLocationListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().onReceiveLocation(this.l);
                    }
                }
                ArrayList<BDAbstractLocationListener> arrayList2 = this.k;
                if (arrayList2 != null) {
                    Iterator<BDAbstractLocationListener> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().onReceiveLocation(this.l);
                    }
                }
                this.w = System.currentTimeMillis();
                if (this.p) {
                    this.p = false;
                }
            } else {
                this.h.removeCallbacks(this.P);
                this.h.postDelayed(this.P, Math.abs(currentTimeMillis));
            }
            if (this.l.getLocType() == 66 || this.l.getLocType() == 67) {
                return;
            }
            this.n = false;
            this.v = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        if (message == null || message.obj == null) {
            return;
        }
        BDNotifyListener bDNotifyListener = (BDNotifyListener) message.obj;
        com.baidu.location.d.a aVar = this.x;
        if (aVar != null) {
            aVar.c(bDNotifyListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(BDLocation bDLocation) {
        if (this.D) {
            return;
        }
        this.l = bDLocation;
        if (!this.K && bDLocation.getLocType() == 161) {
            this.J = true;
            com.baidu.location.b.a.a().a(bDLocation.getLatitude(), bDLocation.getLongitude(), bDLocation.getCoorType());
        }
        ArrayList<BDLocationListener> arrayList = this.j;
        if (arrayList != null) {
            Iterator<BDLocationListener> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onReceiveLocation(bDLocation);
            }
        }
        ArrayList<BDAbstractLocationListener> arrayList2 = this.k;
        if (arrayList2 != null) {
            Iterator<BDAbstractLocationListener> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().onReceiveLocation(bDLocation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.baidu.location.LocationClient$3] */
    public void c() {
        if (this.e) {
            return;
        }
        if (this.G.booleanValue()) {
            boolean d = i.d(this.f);
            if (this.d.isOnceLocation()) {
                d = true;
            }
            if (d) {
                try {
                    new Thread() { // from class: com.baidu.location.LocationClient.3
                        @Override // java.lang.Thread, java.lang.Runnable
                        public void run() {
                            try {
                                if (LocationClient.this.I != null) {
                                    if (i.h(LocationClient.this.f) > 0) {
                                        LocationClient.this.I.a();
                                    }
                                    LocationClient.this.I.c();
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }.start();
                } catch (Throwable unused) {
                }
            }
        }
        if (this.d.isOnceLocation()) {
            return;
        }
        this.G = false;
        this.b = this.f.getPackageName();
        this.z = this.b + "_bdls_v2.9";
        Intent intent = new Intent(this.f, (Class<?>) f.class);
        try {
            intent.putExtra("debug_dev", this.H);
        } catch (Exception unused2) {
        }
        if (this.c == null) {
            this.c = new LocationClientOption();
        }
        intent.putExtra("cache_exception", this.c.isIgnoreCacheException);
        intent.putExtra("kill_process", this.c.isIgnoreKillProcess);
        intent.putExtra("auth_key", B);
        intent.putExtra("cuid", LBSAuthManager.getInstance(this.f).getCUID());
        try {
            this.f.bindService(intent, this.O, 1);
        } catch (Exception e) {
            e.printStackTrace();
            this.e = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        this.o = false;
        if (message == null || message.obj == null) {
            return;
        }
        LocationClientOption locationClientOption = (LocationClientOption) message.obj;
        if (this.c.optionEquals(locationClientOption)) {
            return;
        }
        if (this.c.scanSpan != locationClientOption.scanSpan) {
            try {
                synchronized (this.t) {
                    if (this.f7508q) {
                        this.h.removeCallbacks(this.r);
                        this.f7508q = false;
                    }
                    if (locationClientOption.scanSpan >= 1000 && !this.f7508q) {
                        if (this.r == null) {
                            this.r = new b();
                        }
                        this.h.postDelayed(this.r, locationClientOption.scanSpan);
                        this.f7508q = true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        this.c = new LocationClientOption(locationClientOption);
        if (this.g != null && i.h(this.f) >= 1) {
            try {
                Message obtain = Message.obtain((Handler) null, 15);
                obtain.replyTo = this.i;
                obtain.setData(f());
                this.g.send(obtain);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (!this.e || this.g == null) {
            return;
        }
        Message obtain = Message.obtain((Handler) null, 12);
        obtain.replyTo = this.i;
        try {
            this.g.send(obtain);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            this.f.unbindService(this.O);
            if (this.L) {
                try {
                    this.f.stopService(new Intent(this.f, (Class<?>) f.class));
                } catch (Exception unused) {
                }
                this.L = false;
            }
        } catch (Exception unused2) {
        }
        synchronized (this.t) {
            try {
                if (this.f7508q) {
                    this.h.removeCallbacks(this.r);
                    this.f7508q = false;
                }
            } catch (Exception unused3) {
            }
        }
        com.baidu.location.d.a aVar = this.x;
        if (aVar != null) {
            aVar.a();
        }
        this.g = null;
        this.o = false;
        this.C = false;
        this.e = false;
        this.J = false;
        this.K = false;
        this.w = -1L;
        this.p = false;
        this.G = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        if (message == null || message.obj == null) {
            return;
        }
        this.y = (BDLocationListener) message.obj;
    }

    private void e() throws Exception {
        if (M) {
            return;
        }
        Log.e("baidu_location_Client", "The location function has been stopped because you do not agree with the privacy compliance policy. Please recheck the setAgreePrivacy interface");
        throw new Exception("The location function has been stopped because you do not agree with the privacy compliance policy. Please recheck the setAgreePrivacy interface");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        if (message == null || message.obj == null) {
            return;
        }
        BDLocationListener bDLocationListener = (BDLocationListener) message.obj;
        if (this.j == null) {
            this.j = new ArrayList<>();
        }
        if (this.j.contains(bDLocationListener)) {
            return;
        }
        this.j.add(bDLocationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle f() {
        if (this.c == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("packName", this.b);
        bundle.putString("prodName", this.c.prodName);
        bundle.putString("coorType", this.c.coorType);
        bundle.putString("addrType", this.c.addrType);
        bundle.putBoolean("openGPS", this.c.openGps);
        bundle.putBoolean("location_change_notify", this.c.location_change_notify);
        bundle.putInt("scanSpan", this.c.scanSpan);
        bundle.putBoolean("enableSimulateGps", this.c.enableSimulateGps);
        bundle.putInt("timeOut", this.c.timeOut);
        bundle.putInt("priority", this.c.priority);
        bundle.putBoolean(IStyle.MAP, this.E.booleanValue());
        bundle.putBoolean("import", this.F.booleanValue());
        bundle.putBoolean("needDirect", this.c.mIsNeedDeviceDirect);
        bundle.putBoolean("isneedaptag", this.c.isNeedAptag);
        bundle.putBoolean("isneedpoiregion", this.c.isNeedPoiRegion);
        bundle.putBoolean("isneedregular", this.c.isNeedRegular);
        bundle.putBoolean("isneedaptagd", this.c.isNeedAptagd);
        bundle.putBoolean("isneedaltitude", this.c.isNeedAltitude);
        bundle.putBoolean("isneednewrgc", this.c.isNeedNewVersionRgc);
        bundle.putInt("autoNotifyMaxInterval", this.c.a());
        bundle.putInt("autoNotifyMinTimeInterval", this.c.getAutoNotifyMinTimeInterval());
        bundle.putInt("autoNotifyMinDistance", this.c.getAutoNotifyMinDistance());
        bundle.putFloat("autoNotifyLocSensitivity", this.c.b());
        bundle.putInt("wifitimeout", this.c.wifiCacheTimeOut);
        bundle.putBoolean("forceGlobalUrl", this.c.forceGlobalUrl);
        bundle.putInt("wfnum", com.baidu.location.b.a.a().b);
        bundle.putBoolean("ischeckper", com.baidu.location.b.a.a().f7518a);
        bundle.putFloat("wfsm", (float) com.baidu.location.b.a.a().c);
        bundle.putDouble("gnmcrm", com.baidu.location.b.a.a().f);
        bundle.putInt("gnmcon", com.baidu.location.b.a.a().g);
        bundle.putInt("iupl", com.baidu.location.b.a.a().h);
        bundle.putInt("lpcs", com.baidu.location.b.a.a().e);
        bundle.putInt("hpdts", com.baidu.location.b.a.a().o);
        bundle.putInt("oldts", com.baidu.location.b.a.a().p);
        bundle.putBoolean("isEnableBeidouMode", this.c.isEnableBeidouMode);
        bundle.putInt("onic", com.baidu.location.b.a.a().f7519q);
        bundle.putInt("nlcs", com.baidu.location.b.a.a().r);
        bundle.putFloat("ncsr", com.baidu.location.b.a.a().s);
        bundle.putFloat("cscr", com.baidu.location.b.a.a().t);
        bundle.putString("connectBssid", this.N);
        bundle.putInt("cls", com.baidu.location.b.a.a().u);
        bundle.putIntArray("ocs", com.baidu.location.b.a.a().v);
        bundle.putIntArray("occs", com.baidu.location.b.a.a().w);
        bundle.putInt("topCellNumber", com.baidu.location.b.a.a().x);
        bundle.putInt("locStrLength", com.baidu.location.b.a.a().y);
        bundle.putBoolean("enableCache", LocationClientOption.ENABLE_CACHE);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Message message) {
        if (message == null || message.obj == null) {
            return;
        }
        BDAbstractLocationListener bDAbstractLocationListener = (BDAbstractLocationListener) message.obj;
        if (this.k == null) {
            this.k = new ArrayList<>();
        }
        if (this.k.contains(bDAbstractLocationListener)) {
            return;
        }
        this.k.add(bDAbstractLocationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.g == null) {
            return;
        }
        Message obtain = Message.obtain((Handler) null, 22);
        try {
            obtain.replyTo = this.i;
            this.g.send(obtain);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Message message) {
        if (message == null || message.obj == null) {
            return;
        }
        BDAbstractLocationListener bDAbstractLocationListener = (BDAbstractLocationListener) message.obj;
        ArrayList<BDAbstractLocationListener> arrayList = this.k;
        if (arrayList == null || !arrayList.contains(bDAbstractLocationListener)) {
            return;
        }
        this.k.remove(bDAbstractLocationListener);
    }

    public static BDLocation getBDLocationInCoorType(BDLocation bDLocation, String str) {
        BDLocation bDLocation2 = new BDLocation(bDLocation);
        double[] coorEncrypt = Jni.coorEncrypt(bDLocation.getLongitude(), bDLocation.getLatitude(), str);
        bDLocation2.setLatitude(coorEncrypt[1]);
        bDLocation2.setLongitude(coorEncrypt[0]);
        return bDLocation2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        int i;
        LocationClientOption locationClientOption;
        if (this.g == null) {
            return;
        }
        int h = i.h(this.f);
        if ((System.currentTimeMillis() - this.u > 3000 || (!((locationClientOption = this.c) == null || locationClientOption.location_change_notify) || this.o)) && h == 1) {
            if (!this.C || System.currentTimeMillis() - this.v > 20000 || this.o) {
                Message obtain = Message.obtain((Handler) null, 22);
                if (this.o) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("isWaitingLocTag", this.o);
                    this.o = false;
                    obtain.setData(bundle);
                }
                try {
                    obtain.replyTo = this.i;
                    this.g.send(obtain);
                    this.f7507a = System.currentTimeMillis();
                    this.n = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else if (h < 1) {
            BDLocation bDLocation = new BDLocation();
            if (h == -1) {
                i = 69;
            } else if (h == -2) {
                i = 70;
            } else {
                if (h == 0) {
                    i = 71;
                }
                a(bDLocation);
            }
            bDLocation.setLocType(i);
            a(bDLocation);
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(Message message) {
        if (message == null || message.obj == null) {
            return;
        }
        BDLocationListener bDLocationListener = (BDLocationListener) message.obj;
        ArrayList<BDLocationListener> arrayList = this.j;
        if (arrayList == null || !arrayList.contains(bDLocationListener)) {
            return;
        }
        this.j.remove(bDLocationListener);
    }

    private void i() {
        synchronized (this.t) {
            LocationClientOption locationClientOption = this.c;
            if (locationClientOption != null && locationClientOption.scanSpan >= 1000 && !this.f7508q) {
                if (this.r == null) {
                    this.r = new b();
                }
                this.h.postDelayed(this.r, this.c.scanSpan);
                this.f7508q = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Message message) {
        try {
            Bundle data = message.getData();
            data.setClassLoader(BDLocation.class.getClassLoader());
            BDLocation bDLocation = (BDLocation) data.getParcelable("locStr");
            if (this.y != null) {
                LocationClientOption locationClientOption = this.c;
                if (locationClientOption != null && locationClientOption.isDisableCache() && bDLocation.getLocType() == 65) {
                    return;
                }
                this.y.onReceiveLocation(bDLocation);
            }
        } catch (Exception unused) {
        }
    }

    public static boolean judgePtIsInChina(double d, double d2, String str) {
        return Jni.a(d, d2, str);
    }

    public static void setAgreePrivacy(boolean z) {
        M = z;
    }

    public static void setKey(String str) {
        B = str;
    }

    public void disableAssistantLocation() {
        o.a().b();
    }

    public void disableLocInForeground(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("removenotify", z);
        Message obtainMessage = this.h.obtainMessage(704);
        obtainMessage.setData(bundle);
        obtainMessage.sendToTarget();
    }

    public void enableAssistantLocation(WebView webView) {
        o.a().a(this.f, webView, this);
    }

    public void enableLocInForeground(int i, Notification notification) {
        if (i <= 0 || notification == null) {
            Log.e("baidu_location_Client", "can not startLocInForeground if the param is unlegal");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("id", i);
        bundle.putParcelable("notification", notification);
        Message obtainMessage = this.h.obtainMessage(703);
        obtainMessage.setData(bundle);
        obtainMessage.sendToTarget();
    }

    public String getAccessKey() {
        try {
            String b2 = com.baidu.location.a.a.b(this.f);
            this.A = b2;
            if (TextUtils.isEmpty(b2)) {
                throw new IllegalStateException("please setting key from Manifest.xml");
            }
            return String.format("KEY=%s", this.A);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getCUID() {
        Context context = this.f;
        if (context == null) {
            return null;
        }
        return LBSAuthManager.getInstance(context).getCUID();
    }

    public BDLocation getLastKnownLocation() {
        return this.l;
    }

    public LocationClientOption getLocOption() {
        return this.c;
    }

    public String getVersion() {
        return "9.6.7.1";
    }

    public boolean isStarted() {
        return this.e;
    }

    public void onReceiveLightLocString(String str) {
        Message obtainMessage = this.h.obtainMessage(708);
        obtainMessage.obj = str;
        obtainMessage.sendToTarget();
    }

    @Override // com.baidu.location.b.g.a
    public void onReceiveLocation(BDLocation bDLocation) {
        if ((!this.K || this.J) && bDLocation != null) {
            Message obtainMessage = this.h.obtainMessage(701);
            obtainMessage.obj = bDLocation;
            obtainMessage.sendToTarget();
        }
    }

    public void registerLocationListener(BDAbstractLocationListener bDAbstractLocationListener) {
        if (bDAbstractLocationListener == null) {
            throw new IllegalStateException("please set a non-null listener");
        }
        Message obtainMessage = this.h.obtainMessage(1300);
        obtainMessage.obj = bDAbstractLocationListener;
        obtainMessage.sendToTarget();
    }

    @Deprecated
    public void registerLocationListener(BDLocationListener bDLocationListener) {
        if (bDLocationListener == null) {
            throw new IllegalStateException("please set a non-null listener");
        }
        Message obtainMessage = this.h.obtainMessage(5);
        obtainMessage.obj = bDLocationListener;
        obtainMessage.sendToTarget();
    }

    public void registerNotify(BDNotifyListener bDNotifyListener) {
        Message obtainMessage = this.h.obtainMessage(9);
        obtainMessage.obj = bDNotifyListener;
        obtainMessage.sendToTarget();
    }

    public void registerNotifyLocationListener(BDLocationListener bDLocationListener) {
        Message obtainMessage = this.h.obtainMessage(8);
        obtainMessage.obj = bDLocationListener;
        obtainMessage.sendToTarget();
    }

    public void removeNotifyEvent(BDNotifyListener bDNotifyListener) {
        Message obtainMessage = this.h.obtainMessage(10);
        obtainMessage.obj = bDNotifyListener;
        obtainMessage.sendToTarget();
    }

    public boolean requestHotSpotState() {
        if (this.g != null && this.e) {
            try {
                this.g.send(Message.obtain((Handler) null, 406));
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public int requestLocation() {
        ArrayList<BDAbstractLocationListener> arrayList;
        if (this.g == null || this.i == null) {
            return 1;
        }
        ArrayList<BDLocationListener> arrayList2 = this.j;
        if ((arrayList2 == null || arrayList2.size() < 1) && ((arrayList = this.k) == null || arrayList.size() < 1)) {
            return 2;
        }
        if (System.currentTimeMillis() - this.f7507a < 1000) {
            return 6;
        }
        this.o = true;
        this.p = true;
        Message obtainMessage = this.h.obtainMessage(4);
        obtainMessage.arg1 = 0;
        obtainMessage.sendToTarget();
        return 0;
    }

    public void requestNotifyLocation() {
        this.h.obtainMessage(11).sendToTarget();
    }

    public int requestOfflineLocation() {
        ArrayList<BDAbstractLocationListener> arrayList;
        if (this.g == null || this.i == null) {
            return 1;
        }
        ArrayList<BDLocationListener> arrayList2 = this.j;
        if ((arrayList2 == null || arrayList2.size() < 1) && ((arrayList = this.k) == null || arrayList.size() < 1)) {
            return 2;
        }
        this.h.obtainMessage(12).sendToTarget();
        return 0;
    }

    public void restart() {
        stop();
        this.D = false;
        this.h.sendEmptyMessageDelayed(1, 1000L);
    }

    public void setLocOption(LocationClientOption locationClientOption) {
        if (locationClientOption == null) {
            locationClientOption = new LocationClientOption();
        }
        if (locationClientOption.a() > 0) {
            locationClientOption.setScanSpan(0);
            locationClientOption.setLocationNotify(true);
        }
        this.d = new LocationClientOption(locationClientOption);
        d.f7712a = locationClientOption.forceGlobalUrl;
        if (this.c.forceGlobalUrl) {
            d.b();
        }
        Message obtainMessage = this.h.obtainMessage(3);
        obtainMessage.obj = locationClientOption;
        obtainMessage.sendToTarget();
    }

    public void start() {
        this.D = false;
        if (i.b()) {
            return;
        }
        b();
        com.baidu.location.b.a.a().a(this.f, this.d, (String) null);
        new c().start();
    }

    public boolean startIndoorMode() {
        boolean a2 = a(110);
        if (a2) {
            this.C = true;
        }
        return a2;
    }

    public boolean startVdr(ArrayList<String> arrayList) {
        if (this.g == null || !this.e || arrayList == null) {
            return false;
        }
        if (arrayList != null) {
            try {
                if (arrayList.size() == 1) {
                    String str = arrayList.get(0);
                    Message obtain = Message.obtain((Handler) null, 802);
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("naviLinkList_gz", i.a(str.getBytes("UTF-8")));
                    obtain.setData(bundle);
                    this.g.send(obtain);
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    public void stop() {
        this.D = true;
        this.h.obtainMessage(2).sendToTarget();
        g gVar = this.I;
        if (gVar != null) {
            gVar.f();
            this.I = null;
        }
    }

    public boolean stopIndoorMode() {
        boolean a2 = a(111);
        if (a2) {
            this.C = false;
        }
        return a2;
    }

    public void unRegisterLocationListener(BDAbstractLocationListener bDAbstractLocationListener) {
        if (bDAbstractLocationListener == null) {
            throw new IllegalStateException("please set a non-null listener");
        }
        Message obtainMessage = this.h.obtainMessage(1400);
        obtainMessage.obj = bDAbstractLocationListener;
        obtainMessage.sendToTarget();
    }

    @Deprecated
    public void unRegisterLocationListener(BDLocationListener bDLocationListener) {
        if (bDLocationListener == null) {
            throw new IllegalStateException("please set a non-null listener");
        }
        Message obtainMessage = this.h.obtainMessage(6);
        obtainMessage.obj = bDLocationListener;
        obtainMessage.sendToTarget();
    }

    public boolean updateLocation(Location location) {
        if (this.g == null || this.i == null || location == null) {
            return false;
        }
        try {
            Message obtain = Message.obtain((Handler) null, 57);
            obtain.obj = location;
            this.g.send(obtain);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }
}
