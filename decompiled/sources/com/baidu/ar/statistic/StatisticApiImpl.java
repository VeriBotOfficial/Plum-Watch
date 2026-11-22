package com.baidu.ar.statistic;

import android.content.Context;
import android.os.AsyncTask;
import android.os.HandlerThread;
import com.baidu.ar.aa;
import com.baidu.ar.ba;
import com.baidu.ar.bc;
import com.baidu.ar.c8;
import com.baidu.ar.cc;
import com.baidu.ar.d8;
import com.baidu.ar.e8;
import com.baidu.ar.statistic.a;
import com.baidu.ar.t3;
import com.baidu.ar.u3;
import com.baidu.ar.v3;
import com.baidu.ar.x3;
import com.baidu.ar.x6;
import com.baidu.ar.z9;
import java.lang.Thread;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class StatisticApiImpl implements x6, a.InterfaceC0332a {

    /* renamed from: a, reason: collision with root package name */
    public HandlerThread f7199a;
    public v3 b;
    public Thread c;
    public c8 d;
    public x3 e;
    public volatile z9 f;

    public StatisticApiImpl(Context context, HandlerThread handlerThread) {
        this.e = new x3(context, "ar_stats_local.json", 100, 40);
        x3 x3Var = new x3(context, "ar_stats_pfm_local.json", 200, 0);
        this.f = new z9(x3Var, 20, 200);
        a(handlerThread, new u3(context, this.e, bc.f6827a, cc.a(), this.f));
        a(context, x3Var);
        this.b.a(1, (Object) null);
        a(context);
    }

    public final void a(Context context) {
        new a(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "");
    }

    public final void a(Context context, x3 x3Var) {
        x3 x3Var2 = this.e;
        this.d = new c8(context, x3Var2, new d8[]{new d8(x3Var2, 1, new e8(), true), new aa(x3Var, 20, new ba(), false)});
        Thread thread = new Thread(this.d, "StatsLogSendThd");
        this.c = thread;
        thread.start();
    }

    public final void a(HandlerThread handlerThread, u3 u3Var) {
        HandlerThread handlerThread2;
        if (handlerThread != null) {
            this.f7199a = handlerThread;
            if (handlerThread.getState() == Thread.State.NEW) {
                handlerThread2 = this.f7199a;
            }
            this.b = new v3(this.f7199a.getLooper(), u3Var);
        }
        handlerThread2 = new HandlerThread("StatsEventThd", 10);
        this.f7199a = handlerThread2;
        handlerThread2.start();
        this.b = new v3(this.f7199a.getLooper(), u3Var);
    }

    public void doRelease() {
        synchronized (this) {
            HandlerThread handlerThread = this.f7199a;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            c8 c8Var = this.d;
            if (c8Var != null) {
                c8Var.b();
            }
            if (this.c != null) {
                synchronized (this.e) {
                    if (this.e.isEmpty()) {
                        this.c.interrupt();
                    }
                }
            }
        }
        t3.g();
    }

    @Override // com.baidu.ar.x6
    public boolean isAllowPerformanceEvent(String str) {
        return this.f.b(str);
    }

    @Override // com.baidu.ar.x6
    public void onEvent(String str, String str2) {
        t3 f = t3.f(str);
        f.a("event_param", str2);
        this.b.a(2, f);
    }

    @Override // com.baidu.ar.x6
    public void onEvent(String str, Map<String, String> map) {
        t3 f = t3.f(str);
        f.a(map);
        this.b.a(2, f);
    }

    @Override // com.baidu.ar.x6
    public void onEventDebounce(String str, long j, String str2) {
        t3 f = t3.f(str);
        f.a("_db_period", Long.valueOf(j));
        f.a("event_param", str2);
        this.b.a(6, f);
    }

    @Override // com.baidu.ar.x6
    public void onEventDebounce(String str, long j, Map<String, String> map) {
        t3 f = t3.f(str);
        f.a(map);
        f.a("_db_period", Long.valueOf(j));
        this.b.a(6, f);
    }

    @Override // com.baidu.ar.x6
    public void onEventEnd(String str) {
        this.b.a(5, t3.f(str));
    }

    @Override // com.baidu.ar.x6
    public void onEventStart(String str) {
        this.b.a(4, t3.f(str));
    }

    @Override // com.baidu.ar.x6
    public void onEventStatus(String str, String str2, boolean z) {
        t3 f = t3.f(str);
        f.a("__stt", z ? "1" : "0");
        f.a("__falseev", str2);
        this.b.a(3, f);
    }

    @Override // com.baidu.ar.x6
    public void onPerformance(String str, Map<String, String> map) {
        synchronized (this.f) {
            if (this.f.b(str)) {
                t3 f = t3.f(str);
                f.a(map);
                this.b.a(20, f);
            }
        }
    }

    @Override // com.baidu.ar.x6
    public void onPerformance(String str, JSONObject jSONObject) {
        synchronized (this.f) {
            if (this.f.b(str)) {
                t3 f = t3.f(str);
                f.a("data", jSONObject);
                this.b.a(20, f);
            }
        }
    }

    @Override // com.baidu.ar.statistic.a.InterfaceC0332a
    public void onPerformanceRequestFinished(List<String> list) {
        this.b.a(21, list);
    }

    @Override // com.baidu.ar.x6
    public void pause() {
        this.b.a(97, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.baidu.ar.x6
    public void release() {
        this.b.a(99, this);
    }

    @Override // com.baidu.ar.x6
    public void resume() {
        this.b.a(98, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.baidu.ar.x6
    public void setPubParam(String str, String str2) {
        this.b.a(str, str2);
    }

    @Override // com.baidu.ar.x6
    public void setPubParams(Map<String, String> map) {
        this.b.a(map);
    }
}
