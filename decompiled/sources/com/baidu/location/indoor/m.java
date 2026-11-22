package com.baidu.location.indoor;

import android.location.Location;
import android.os.Handler;
import com.baidu.location.BDLocation;

/* loaded from: classes13.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private a f7783a;
    private BDLocation c;
    private long b = 450;
    private b d = null;
    private b e = null;
    private b f = new b();
    private b g = new b();
    private b h = new b();
    private b i = new b();
    private BDLocation j = null;
    private long k = -1;
    private boolean l = false;
    private Handler m = new Handler();
    private Runnable n = new Runnable() { // from class: com.baidu.location.indoor.m.1
        @Override // java.lang.Runnable
        public void run() {
            m mVar = m.this;
            b a2 = mVar.a(mVar.e);
            if (a2 != null && m.this.f7783a != null) {
                m mVar2 = m.this;
                mVar2.e = mVar2.e.b(a2);
                long currentTimeMillis = System.currentTimeMillis();
                if (!a2.b(2.0E-6d) && currentTimeMillis - m.this.k > m.this.b) {
                    BDLocation bDLocation = new BDLocation(m.this.c);
                    bDLocation.setLatitude(m.this.e.f7786a);
                    bDLocation.setLongitude(m.this.e.b);
                    m.this.f7783a.a(bDLocation);
                    m.this.k = currentTimeMillis;
                }
            }
            m.this.m.postDelayed(m.this.o, 450L);
        }
    };
    private Runnable o = new Runnable() { // from class: com.baidu.location.indoor.m.2
        @Override // java.lang.Runnable
        public void run() {
            if (m.this.j != null && m.this.f7783a != null) {
                BDLocation bDLocation = new BDLocation(m.this.c);
                bDLocation.setLatitude(m.this.j.getLatitude());
                bDLocation.setLongitude(m.this.j.getLongitude());
                m.this.f7783a.a(bDLocation);
            }
            m.this.m.postDelayed(m.this.o, m.this.b);
        }
    };

    public interface a {
        void a(BDLocation bDLocation);
    }

    private class b {

        /* renamed from: a, reason: collision with root package name */
        public double f7786a;
        public double b;

        public b() {
            this.f7786a = 0.0d;
            this.b = 0.0d;
        }

        public b(double d, double d2) {
            this.f7786a = d;
            this.b = d2;
        }

        public b(b bVar) {
            this.f7786a = bVar.f7786a;
            this.b = bVar.b;
        }

        public b a(double d) {
            return m.this.new b(this.f7786a * d, this.b * d);
        }

        public b a(b bVar) {
            return m.this.new b(this.f7786a - bVar.f7786a, this.b - bVar.b);
        }

        public b b(b bVar) {
            return m.this.new b(this.f7786a + bVar.f7786a, this.b + bVar.b);
        }

        public boolean b(double d) {
            double abs = Math.abs(this.f7786a);
            double abs2 = Math.abs(this.b);
            return abs > 0.0d && abs < d && abs2 > 0.0d && abs2 < d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b a(b bVar) {
        b bVar2 = this.d;
        if (bVar2 == null || bVar == null) {
            return null;
        }
        b a2 = bVar2.a(bVar);
        this.i = this.i.b(a2);
        b a3 = this.h.a(this.f);
        this.f = new b(this.h);
        this.h = new b(a2);
        b a4 = a2.a(0.2d);
        b a5 = this.i.a(0.01d);
        return a4.b(a5).b(a3.a(-0.02d));
    }

    public void a() {
        if (this.l) {
            this.l = false;
            this.m.removeCallbacks(this.o);
            b();
        }
    }

    public void a(long j) {
        this.b = j;
    }

    public synchronized void a(BDLocation bDLocation) {
        try {
            try {
                double latitude = bDLocation.getLatitude();
                double longitude = bDLocation.getLongitude();
                this.c = bDLocation;
                this.d = new b(latitude, longitude);
                if (this.e == null) {
                    this.e = new b(latitude, longitude);
                }
                BDLocation bDLocation2 = this.j;
                if (bDLocation2 == null) {
                    this.j = new BDLocation(bDLocation);
                } else {
                    double latitude2 = bDLocation2.getLatitude();
                    double longitude2 = this.j.getLongitude();
                    double latitude3 = bDLocation.getLatitude();
                    double longitude3 = bDLocation.getLongitude();
                    float[] fArr = new float[2];
                    Location.distanceBetween(latitude2, longitude2, latitude3, longitude3, fArr);
                    if (fArr[0] > 10.0f) {
                        this.j.setLatitude(latitude3);
                        this.j.setLongitude(longitude3);
                    } else {
                        this.j.setLatitude((latitude2 + latitude3) / 2.0d);
                        this.j.setLongitude((longitude2 + longitude3) / 2.0d);
                    }
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void b() {
        this.k = -1L;
        this.e = null;
        this.d = null;
        this.f = new b();
        this.g = new b();
        this.h = new b();
        this.i = new b();
    }

    public boolean c() {
        return this.l;
    }
}
