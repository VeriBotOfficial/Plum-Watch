package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.a2;
import com.amap.api.col.p0003sl.c2;
import com.amap.api.col.p0003sl.z2;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import java.io.File;
import java.util.List;

/* compiled from: CityObject.java */
/* loaded from: classes11.dex */
public class z1 extends OfflineMapCity implements y2, i2 {
    public static final Parcelable.Creator<z1> CREATOR = new a();
    private long A;
    public final c3 k;
    public final c3 l;
    public final c3 m;
    public final c3 n;
    public final c3 o;
    public final c3 p;

    /* renamed from: q, reason: collision with root package name */
    public final c3 f1992q;
    public final c3 r;
    public final c3 s;
    public final c3 t;
    public final c3 u;
    c3 v;
    Context w;
    private String x;
    private String y;
    boolean z;

    /* compiled from: CityObject.java */
    static class a implements Parcelable.Creator<z1> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public z1 createFromParcel(Parcel parcel) {
            return new z1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public z1[] newArray(int i) {
            return new z1[i];
        }
    }

    public z1(Context context, OfflineMapCity offlineMapCity) {
        this(context, offlineMapCity.getState());
        setCity(offlineMapCity.getCity());
        setUrl(offlineMapCity.getUrl());
        setState(offlineMapCity.getState());
        setCompleteCode(offlineMapCity.getcompleteCode());
        setAdcode(offlineMapCity.getAdcode());
        setVersion(offlineMapCity.getVersion());
        setSize(offlineMapCity.getSize());
        setCode(offlineMapCity.getCode());
        setJianpin(offlineMapCity.getJianpin());
        setPinyin(offlineMapCity.getPinyin());
        o();
    }

    public void b(String str) {
        this.y = str;
    }

    @Override // com.amap.api.col.p0003sl.y2
    public void c() {
        p();
    }

    @Override // com.amap.api.col.p0003sl.y2
    public String d() {
        StringBuffer stringBuffer = new StringBuffer();
        String b = x2.b(getUrl());
        if (b != null) {
            stringBuffer.append(b);
        } else {
            stringBuffer.append(getPinyin());
        }
        stringBuffer.append(".zip");
        return stringBuffer.toString();
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapCity, com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.amap.api.col.p0003sl.y2
    public void e() {
        this.v.equals(this.o);
        this.v.a(this.r.e());
    }

    @Override // com.amap.api.col.p0003sl.y2
    public boolean f() {
        x2.a();
        getSize();
        getcompleteCode();
        getSize();
        return false;
    }

    @Override // com.amap.api.col.p0003sl.z2
    public void g() {
        this.A = 0L;
        this.v.equals(this.l);
        this.v.h();
    }

    @Override // com.amap.api.col.p0003sl.y2
    public String getId() {
        return getAdcode();
    }

    @Override // com.amap.api.col.p0003sl.s2
    public String h() {
        return l();
    }

    public void i() {
        c2 a2 = c2.a(this.w);
        if (a2 != null) {
            f2 f2Var = a2.j;
            if (f2Var != null) {
                f2Var.a(this);
            }
            c2.e eVar = a2.i;
            if (eVar != null) {
                Message obtainMessage = eVar.obtainMessage(10);
                obtainMessage.obj = this;
                a2.i.sendMessage(obtainMessage);
            }
        }
    }

    public void j() {
        String str = "CityOperation current State==>" + this.v.e();
        if (this.v.equals(this.n)) {
            this.v.b();
            return;
        }
        if (this.v.equals(this.m)) {
            this.v.g();
            return;
        }
        if (this.v.equals(this.f1992q) || this.v.equals(this.r)) {
            c2 a2 = c2.a(this.w);
            if (a2 != null) {
                a2.c(this);
            }
            this.z = true;
            return;
        }
        if (this.v.equals(this.t) || this.v.equals(this.s) || this.v.a(this.u)) {
            this.v.h();
        } else {
            this.v.d();
        }
    }

    public c3 k() {
        return this.v;
    }

    public String l() {
        if (TextUtils.isEmpty(this.x)) {
            return null;
        }
        String m = m();
        return m.substring(0, m.lastIndexOf(46));
    }

    public String m() {
        if (TextUtils.isEmpty(this.x)) {
            return null;
        }
        String str = this.x;
        return str.substring(0, str.lastIndexOf("."));
    }

    public String n() {
        return this.y;
    }

    protected void o() {
        String str = c2.m;
        String b = x2.b(getUrl());
        if (b != null) {
            this.x = str + b + ".zip.tmp";
        } else {
            this.x = str + getPinyin() + ".zip.tmp";
        }
    }

    @Override // com.amap.api.col.p0003sl.z2
    public void onCancel() {
        p();
    }

    @Override // com.amap.api.col.p0003sl.z2
    public void onFinish() {
        this.v.equals(this.m);
        this.v.a();
    }

    public void p() {
        c2 a2 = c2.a(this.w);
        if (a2 != null) {
            a2.a(this);
            i();
        }
    }

    public void q() {
        c2 a2 = c2.a(this.w);
        if (a2 != null) {
            a2.b(this);
        }
    }

    public void r() {
        c2 a2 = c2.a(this.w);
        if (a2 != null) {
            a2.d(this);
        }
    }

    public k2 s() {
        setState(this.v.e());
        k2 k2Var = new k2(this, this.w);
        k2Var.e(this.y);
        String str = "vMapFileNames: " + this.y;
        return k2Var;
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapCity, com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.y);
    }

    public void b(int i) {
        if (i == 6) {
            this.v = this.k;
        } else if (i == 7) {
            this.v = this.f1992q;
        } else if (i == -1) {
            this.v = this.r;
        } else if (i == 0) {
            this.v = this.m;
        } else if (i == 1) {
            this.v = this.o;
        } else if (i == 2) {
            this.v = this.l;
        } else if (i == 3) {
            this.v = this.n;
        } else if (i != 4) {
            switch (i) {
                case 101:
                    this.v = this.s;
                    break;
                case 102:
                    this.v = this.t;
                    break;
                case 103:
                    this.v = this.u;
                    break;
                default:
                    if (i < 0) {
                        this.v = this.r;
                        break;
                    }
                    break;
            }
        } else {
            this.v = this.p;
        }
        setState(i);
    }

    public void a(c3 c3Var) {
        this.v = c3Var;
        setState(c3Var.e());
    }

    @Override // com.amap.api.col.p0003sl.z2
    public void a(long j, long j2) {
        int i = (int) ((j2 * 100) / j);
        if (i != getcompleteCode()) {
            setCompleteCode(i);
            i();
        }
    }

    public z1(Context context, int i) {
        this.k = new e3(6, this);
        this.l = new k3(2, this);
        this.m = new g3(0, this);
        this.n = new i3(3, this);
        this.o = new j3(1, this);
        this.p = new d3(4, this);
        this.f1992q = new h3(7, this);
        this.r = new f3(-1, this);
        this.s = new f3(101, this);
        this.t = new f3(102, this);
        this.u = new f3(103, this);
        this.x = null;
        this.y = "";
        this.z = false;
        this.A = 0L;
        this.w = context;
        b(i);
    }

    @Override // com.amap.api.col.p0003sl.z2
    public void a(z2.a aVar) {
        int e;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            e = this.t.e();
        } else if (ordinal != 1) {
            e = ordinal != 2 ? 6 : this.u.e();
        } else {
            e = this.s.e();
        }
        if (this.v.equals(this.m) || this.v.equals(this.l)) {
            this.v.a(e);
        }
    }

    @Override // com.amap.api.col.p0003sl.y2
    public void a() {
        this.A = 0L;
        setCompleteCode(0);
        this.v.equals(this.o);
        this.v.h();
    }

    @Override // com.amap.api.col.p0003sl.s2
    public String b() {
        return m();
    }

    public boolean b(z1 z1Var) {
        List<String> list;
        if (z1Var != null && z1Var.getAdcode() != null && !z1Var.getAdcode().isEmpty()) {
            try {
                String adcode = z1Var.getAdcode();
                if ("100000".equals(adcode) || "000001".equals(adcode)) {
                    adcode = "000000";
                }
                try {
                    a2.a c = new a2(this.w, adcode).c();
                    if (c != null && c.f1510a && (list = c.d) != null && !list.isEmpty()) {
                        z1Var.setUrl(c.d.get(0));
                        z1Var.o();
                        String str = c.b;
                        if (str != null && !str.isEmpty()) {
                            z1Var.setVersion(c.b);
                        }
                        long j = c.c;
                        if (j <= 0) {
                            return true;
                        }
                        z1Var.setSize(j);
                        return true;
                    }
                    return false;
                } catch (q8 e) {
                    throw new AMapException(e.a());
                }
            } catch (AMapException unused) {
            } catch (Throwable th) {
                ja.a(th, "OfflineDownloadManager", "fetchDownloadUrlFromNetwork");
            }
        }
        return false;
    }

    @Override // com.amap.api.col.p0003sl.y2
    public void a(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.A > 500) {
            int i = (int) j;
            if (i > getcompleteCode()) {
                setCompleteCode(i);
                i();
            }
            this.A = currentTimeMillis;
        }
    }

    @Override // com.amap.api.col.p0003sl.y2
    public void a(String str) {
        this.v.equals(this.o);
        this.y = str;
        String m = m();
        String l = l();
        if (!TextUtils.isEmpty(m) && !TextUtils.isEmpty(l)) {
            File file = new File(l + "/");
            File file2 = new File(t4.c(this.w) + File.separator + "map/");
            File file3 = new File(t4.c(this.w));
            if (file3.exists() || file3.mkdir()) {
                if (file2.exists() || file2.mkdir()) {
                    new r2().a(file, file2, -1L, x2.b(file), new y1(this, m, file));
                    return;
                }
                return;
            }
            return;
        }
        e();
    }

    public c3 a(int i) {
        switch (i) {
            case 101:
                return this.s;
            case 102:
                return this.t;
            case 103:
                return this.u;
            default:
                return this.r;
        }
    }

    public z1(Parcel parcel) {
        super(parcel);
        this.k = new e3(6, this);
        this.l = new k3(2, this);
        this.m = new g3(0, this);
        this.n = new i3(3, this);
        this.o = new j3(1, this);
        this.p = new d3(4, this);
        this.f1992q = new h3(7, this);
        this.r = new f3(-1, this);
        this.s = new f3(101, this);
        this.t = new f3(102, this);
        this.u = new f3(103, this);
        this.x = null;
        this.y = "";
        this.z = false;
        this.A = 0L;
        this.y = parcel.readString();
    }
}
