package com.baidu.location.d;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.BDNotifyListener;
import com.baidu.location.Jni;
import com.baidu.location.LocationClient;
import com.hjq.permissions.Permission;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes13.dex */
public class a {
    private LocationClient e;
    private Context f;
    private AlarmManager k;
    private C0344a l;
    private b m;
    private boolean n;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<BDNotifyListener> f7616a = null;
    private float b = Float.MAX_VALUE;
    private BDLocation c = null;
    private long d = 0;
    private int g = 0;
    private long h = 0;
    private boolean i = false;
    private PendingIntent j = null;

    /* renamed from: com.baidu.location.d.a$a, reason: collision with other inner class name */
    public class C0344a extends BroadcastReceiver {
        public C0344a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (a.this.f7616a == null || a.this.f7616a.isEmpty()) {
                return;
            }
            a.this.e.requestNotifyLocation();
        }
    }

    public class b implements BDLocationListener {
        public b() {
        }

        @Override // com.baidu.location.BDLocationListener
        public void onReceiveLocation(BDLocation bDLocation) {
            if (a.this.f7616a == null || a.this.f7616a.size() <= 0) {
                return;
            }
            a.this.a(bDLocation);
        }
    }

    public a(Context context, LocationClient locationClient) {
        this.e = null;
        this.f = null;
        this.k = null;
        this.l = null;
        b bVar = new b();
        this.m = bVar;
        this.n = false;
        this.f = context;
        this.e = locationClient;
        locationClient.registerNotifyLocationListener(bVar);
        this.k = (AlarmManager) this.f.getSystemService(NotificationCompat.CATEGORY_ALARM);
        this.l = new C0344a();
        this.n = false;
    }

    private void a(long j) {
        try {
            PendingIntent pendingIntent = this.j;
            if (pendingIntent != null) {
                this.k.cancel(pendingIntent);
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f, 0, new Intent("android.com.baidu.location.TIMER.NOTIFY"), 201326592);
            this.j = broadcast;
            if (broadcast == null) {
                return;
            }
            this.k.set(0, System.currentTimeMillis() + j, this.j);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BDLocation bDLocation) {
        float f;
        if (bDLocation.getLocType() != 61 && bDLocation.getLocType() != 161 && bDLocation.getLocType() != 65) {
            a(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
            return;
        }
        if (System.currentTimeMillis() - this.d < 5000 || this.f7616a == null) {
            return;
        }
        this.c = bDLocation;
        this.d = System.currentTimeMillis();
        float[] fArr = new float[1];
        Iterator<BDNotifyListener> it = this.f7616a.iterator();
        float f2 = Float.MAX_VALUE;
        loop0: while (true) {
            f = f2;
            while (it.hasNext()) {
                BDNotifyListener next = it.next();
                Location.distanceBetween(bDLocation.getLatitude(), bDLocation.getLongitude(), next.mLatitudeC, next.mLongitudeC, fArr);
                f2 = (fArr[0] - next.mRadius) - bDLocation.getRadius();
                if (f2 > 0.0f) {
                    if (f2 < f) {
                        break;
                    }
                } else if (next.mNotified < 3) {
                    next.mNotified++;
                    next.onNotify(bDLocation, fArr[0]);
                    if (next.mNotified < 3) {
                        this.i = true;
                    }
                }
            }
        }
        if (f < this.b) {
            this.b = f;
        }
        this.g = 0;
        c();
    }

    private boolean b() {
        ArrayList<BDNotifyListener> arrayList = this.f7616a;
        boolean z = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<BDNotifyListener> it = this.f7616a.iterator();
            while (it.hasNext()) {
                if (it.next().mNotified < 3) {
                    z = true;
                }
            }
        }
        return z;
    }

    private void c() {
        if (b()) {
            float f = this.b;
            int i = 10000;
            int i2 = f > 5000.0f ? 600000 : f > 1000.0f ? 120000 : f > 500.0f ? 60000 : 10000;
            if (this.i) {
                this.i = false;
            } else {
                i = i2;
            }
            int i3 = this.g;
            if (i3 != 0) {
                if (i > (this.h + i3) - System.currentTimeMillis()) {
                    return;
                }
            }
            this.g = i;
            this.h = System.currentTimeMillis();
            a(this.g);
        }
    }

    public int a(BDNotifyListener bDNotifyListener) {
        if (this.f7616a == null) {
            this.f7616a = new ArrayList<>();
        }
        this.f7616a.add(bDNotifyListener);
        bDNotifyListener.isAdded = true;
        bDNotifyListener.mNotifyCache = this;
        if (!this.n) {
            if (Build.VERSION.SDK_INT > 33) {
                this.f.registerReceiver(this.l, new IntentFilter("android.com.baidu.location.TIMER.NOTIFY"), Permission.ACCESS_FINE_LOCATION, null, 2);
            } else {
                this.f.registerReceiver(this.l, new IntentFilter("android.com.baidu.location.TIMER.NOTIFY"), Permission.ACCESS_FINE_LOCATION, null);
            }
            this.n = true;
        }
        if (bDNotifyListener.mCoorType == null) {
            return 1;
        }
        if (!bDNotifyListener.mCoorType.equals("gcj02")) {
            double[] coorEncrypt = Jni.coorEncrypt(bDNotifyListener.mLongitude, bDNotifyListener.mLatitude, bDNotifyListener.mCoorType + "2gcj");
            bDNotifyListener.mLongitudeC = coorEncrypt[0];
            bDNotifyListener.mLatitudeC = coorEncrypt[1];
        }
        if (this.c == null || System.currentTimeMillis() - this.d > 30000) {
            this.e.requestNotifyLocation();
        } else {
            float[] fArr = new float[1];
            Location.distanceBetween(this.c.getLatitude(), this.c.getLongitude(), bDNotifyListener.mLatitudeC, bDNotifyListener.mLongitudeC, fArr);
            float radius = (fArr[0] - bDNotifyListener.mRadius) - this.c.getRadius();
            if (radius > 0.0f) {
                if (radius < this.b) {
                    this.b = radius;
                }
            } else if (bDNotifyListener.mNotified < 3) {
                bDNotifyListener.mNotified++;
                bDNotifyListener.onNotify(this.c, fArr[0]);
                if (bDNotifyListener.mNotified < 3) {
                    this.i = true;
                }
            }
        }
        c();
        return 1;
    }

    public void a() {
        PendingIntent pendingIntent = this.j;
        if (pendingIntent != null) {
            this.k.cancel(pendingIntent);
        }
        this.c = null;
        this.d = 0L;
        if (this.n) {
            this.f.unregisterReceiver(this.l);
        }
        this.n = false;
    }

    public void b(BDNotifyListener bDNotifyListener) {
        if (bDNotifyListener.mCoorType == null) {
            return;
        }
        if (!bDNotifyListener.mCoorType.equals("gcj02")) {
            double[] coorEncrypt = Jni.coorEncrypt(bDNotifyListener.mLongitude, bDNotifyListener.mLatitude, bDNotifyListener.mCoorType + "2gcj");
            bDNotifyListener.mLongitudeC = coorEncrypt[0];
            bDNotifyListener.mLatitudeC = coorEncrypt[1];
        }
        if (this.c == null || System.currentTimeMillis() - this.d > 300000) {
            this.e.requestNotifyLocation();
        } else {
            float[] fArr = new float[1];
            Location.distanceBetween(this.c.getLatitude(), this.c.getLongitude(), bDNotifyListener.mLatitudeC, bDNotifyListener.mLongitudeC, fArr);
            float radius = (fArr[0] - bDNotifyListener.mRadius) - this.c.getRadius();
            if (radius > 0.0f) {
                if (radius < this.b) {
                    this.b = radius;
                }
            } else if (bDNotifyListener.mNotified < 3) {
                bDNotifyListener.mNotified++;
                bDNotifyListener.onNotify(this.c, fArr[0]);
                if (bDNotifyListener.mNotified < 3) {
                    this.i = true;
                }
            }
        }
        c();
    }

    public int c(BDNotifyListener bDNotifyListener) {
        PendingIntent pendingIntent;
        ArrayList<BDNotifyListener> arrayList = this.f7616a;
        if (arrayList == null) {
            return 0;
        }
        if (arrayList.contains(bDNotifyListener)) {
            this.f7616a.remove(bDNotifyListener);
        }
        if (this.f7616a.size() != 0 || (pendingIntent = this.j) == null) {
            return 1;
        }
        this.k.cancel(pendingIntent);
        return 1;
    }
}
