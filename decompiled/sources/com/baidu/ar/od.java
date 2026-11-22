package com.baidu.ar;

import com.baidu.ar.slam.TrackModel;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class od {

    /* renamed from: a, reason: collision with root package name */
    public c7 f7110a;
    public s6 b;
    public md c;
    public volatile boolean e;
    public volatile boolean d = false;
    public volatile boolean f = false;

    public od(c7 c7Var, nd ndVar, d7 d7Var, md mdVar) {
        this.e = true;
        this.f7110a = c7Var;
        this.c = mdVar;
        if (ndVar != null) {
            this.e = ndVar.f();
        }
        this.b = a(ndVar, d7Var);
    }

    public final s6 a(nd ndVar, d7 d7Var) {
        if (ndVar == null) {
            c7 c7Var = this.f7110a;
            md mdVar = this.c;
            return new y2(c7Var, mdVar.f7091a, mdVar.b);
        }
        if (ndVar.d() == 1) {
            c7 c7Var2 = this.f7110a;
            md mdVar2 = this.c;
            zb zbVar = new zb(c7Var2, ndVar, mdVar2.f7091a, mdVar2.b);
            zbVar.a(d7Var);
            return zbVar;
        }
        if (ndVar.d() != 0) {
            return null;
        }
        c7 c7Var3 = this.f7110a;
        md mdVar3 = this.c;
        return new nb(c7Var3, ndVar, mdVar3.f7091a, mdVar3.b);
    }

    public void a() {
        c7 c7Var = this.f7110a;
        if (c7Var != null) {
            c7Var.release();
            this.f7110a = null;
        }
        this.b = null;
    }

    public void a(float f, float f2, float f3) {
        v4 v4Var = new v4();
        v4Var.f7257a = f;
        v4Var.b = f2;
        v4Var.d = f3;
        v4Var.c = 2;
        a(v4Var);
    }

    public void a(qd qdVar, float[] fArr) {
        float[] a2;
        if (!this.e || this.f) {
            return;
        }
        rd d = qdVar.d();
        if (this.d) {
            if (d == null || (a2 = a(d)) == null || a2.length <= 0) {
                return;
            }
            this.f7110a.a(a2);
            return;
        }
        s6 s6Var = this.b;
        if (s6Var != null) {
            this.d = s6Var.a(fArr);
            if (this.d) {
                this.f7110a.a();
                StatisticApi.onEvent(StatisticConstants.SLAM_TRACK_ON);
            }
        }
    }

    public void a(v4 v4Var) {
        this.f7110a.a(v4Var);
    }

    public void a(boolean z) {
        this.f = z;
    }

    public final float[] a(rd rdVar) {
        ArrayList<TrackModel> b = rdVar.b();
        return (b == null || b.isEmpty()) ? new float[0] : b.get(0).getPose();
    }

    public void b() {
        this.e = true;
    }
}
