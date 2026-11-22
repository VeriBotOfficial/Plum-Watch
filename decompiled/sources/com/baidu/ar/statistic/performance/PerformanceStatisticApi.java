package com.baidu.ar.statistic.performance;

import android.os.SystemClock;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.q6;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.performance.a;
import com.baidu.ar.u2;
import java.util.Random;

/* loaded from: classes12.dex */
public class PerformanceStatisticApi implements q6 {
    public a.C0333a d;

    /* renamed from: a, reason: collision with root package name */
    public int f7201a = 0;
    public boolean b = false;
    public a c = new a();
    public u2 e = new u2();

    public final void a() {
        if (this.d == null) {
            a.C0333a c0333a = new a.C0333a();
            this.d = c0333a;
            int i = this.f7201a + 1;
            this.f7201a = i;
            c0333a.f7203a = i;
            this.c.f.add(c0333a);
        }
    }

    @Override // com.baidu.ar.q6
    public void onFrameIn() {
        try {
            if (this.b) {
                a();
                this.d.b = SystemClock.elapsedRealtime();
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Override // com.baidu.ar.q6
    public void onFrameOut() {
        try {
            if (this.b) {
                a();
                this.d.c = SystemClock.elapsedRealtime();
                if (this.f7201a >= 3) {
                    a aVar = this.c;
                    u2 u2Var = this.e;
                    aVar.c = u2Var.b;
                    aVar.b = u2Var.f7238a;
                    aVar.d = u2Var.c;
                    aVar.e = u2Var.d;
                    aVar.f7202a = ARConfig.getARKey();
                    StatisticApi.onPerformance("performance_summary", this.c.a());
                    this.c.b();
                    this.f7201a = 0;
                    this.b = false;
                }
                this.d = null;
            }
            if (!this.b && StatisticApi.isAllowPerformanceEvent("performance_summary") && new Random().nextInt(20) == 1) {
                this.b = true;
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public void recordAlgoTimeCost(String str, String str2, long j, int i) {
        try {
            if (this.b) {
                a();
                a.C0333a.C0334a c0334a = new a.C0333a.C0334a();
                c0334a.f7204a = str;
                c0334a.b = str2;
                c0334a.c = j;
                c0334a.d = i;
                this.d.d.add(c0334a);
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public void switchCase(String str) {
        try {
            this.c.f7202a = str;
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
