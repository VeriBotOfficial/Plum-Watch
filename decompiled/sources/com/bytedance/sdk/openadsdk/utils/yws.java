package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.anythink.expressad.foundation.g.g.a.b;
import com.bytedance.sdk.component.tw.gff.bh;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class yws {
    private static volatile com.bytedance.sdk.component.tw.gff.bh bh;
    private static volatile com.bytedance.sdk.component.tw.gff.bh dgx;
    private static volatile ThreadPoolExecutor fxn;
    private static volatile com.bytedance.sdk.component.tw.gff.bh gff;
    private static volatile com.bytedance.sdk.component.tw.gff.bh hie;
    private static volatile com.bytedance.sdk.component.tw.gff.bh hm;
    private static volatile com.bytedance.sdk.component.tw.gff.bh jq;
    private static volatile boolean kg;
    private static volatile com.bytedance.sdk.component.tw.gff.bh rb;

    /* renamed from: sg, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.tw.gff.bh f9577sg;
    private static volatile com.bytedance.sdk.component.tw.gff.bh tw;

    static {
        com.bytedance.sdk.component.tw.gff.gff.fxn(new com.bytedance.sdk.component.tw.gff.fxn() { // from class: com.bytedance.sdk.openadsdk.utils.yws.1
            @Override // com.bytedance.sdk.component.tw.gff.fxn
            public void fxn(com.bytedance.sdk.component.tw.gff.bh bhVar, com.bytedance.sdk.component.tw.gff.kg kgVar) {
                kgVar.kg();
                new RuntimeException();
            }
        });
        fxn = null;
        kg = false;
    }

    public static ScheduledExecutorService fxn() {
        return com.bytedance.sdk.component.tw.bh.bh();
    }

    public static ExecutorService kg() {
        if (mvp()) {
            return rmu();
        }
        return com.bytedance.sdk.component.tw.bh.hie();
    }

    public static ExecutorService gff() {
        if (mvp()) {
            return ud();
        }
        return com.bytedance.sdk.component.tw.bh.gff();
    }

    public static ExecutorService hm() {
        if (mvp()) {
            return ckl();
        }
        return com.bytedance.sdk.component.tw.bh.hm();
    }

    public static ExecutorService rb() {
        if (mvp()) {
            return jq();
        }
        return com.bytedance.sdk.component.tw.bh.kg();
    }

    public static boolean bh() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static boolean sg() {
        String str;
        if (mvp()) {
            str = "pag_log";
        } else {
            str = "csj_log";
        }
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith(str);
    }

    public static void fxn(Runnable runnable) {
        if (runnable == null || rz.fxn) {
            return;
        }
        if (bh()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.zu.gff().post(runnable);
        }
    }

    public static void kg(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.zu.gff().removeCallbacks(runnable);
    }

    public static void fxn(final com.bytedance.sdk.component.tw.tw twVar) {
        if (rz.fxn) {
            return;
        }
        if (mvp()) {
            jq().execute(new com.bytedance.sdk.component.tw.gff.kg(twVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.yws.2
                @Override // java.lang.Runnable
                public void run() {
                    twVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.tw.bh.fxn(twVar);
        }
    }

    public static ExecutorService tw() {
        if (mvp()) {
            return je();
        }
        return com.bytedance.sdk.component.tw.bh.gff();
    }

    public static void kg(final com.bytedance.sdk.component.tw.tw twVar) {
        if (rz.fxn) {
            return;
        }
        if (mvp()) {
            je().execute(new com.bytedance.sdk.component.tw.gff.kg(twVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.yws.3
                @Override // java.lang.Runnable
                public void run() {
                    twVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.tw.bh.kg(twVar);
        }
    }

    public static void fxn(final com.bytedance.sdk.component.tw.tw twVar, int i) {
        if (twVar == null || rz.fxn) {
            return;
        }
        if (mvp()) {
            com.bytedance.sdk.component.tw.gff.kg kgVar = new com.bytedance.sdk.component.tw.gff.kg(twVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.yws.4
                @Override // java.lang.Runnable
                public void run() {
                    twVar.run();
                }
            };
            kgVar.fxn(i);
            je().execute(kgVar);
            return;
        }
        com.bytedance.sdk.component.tw.bh.fxn(twVar, 5, i);
    }

    public static void gff(final com.bytedance.sdk.component.tw.tw twVar) {
        if (twVar == null || rz.fxn) {
            return;
        }
        if (mvp()) {
            ckl().execute(new com.bytedance.sdk.component.tw.gff.kg(twVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.yws.5
                @Override // java.lang.Runnable
                public void run() {
                    twVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.tw.bh.gff(twVar);
        }
    }

    public static void kg(final com.bytedance.sdk.component.tw.tw twVar, int i) {
        if (twVar == null || rz.fxn) {
            return;
        }
        if (mvp()) {
            com.bytedance.sdk.component.tw.gff.kg kgVar = new com.bytedance.sdk.component.tw.gff.kg(twVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.yws.6
                @Override // java.lang.Runnable
                public void run() {
                    twVar.run();
                }
            };
            kgVar.fxn(i);
            ckl().execute(kgVar);
            return;
        }
        com.bytedance.sdk.component.tw.bh.kg(twVar, i);
    }

    public static void hm(final com.bytedance.sdk.component.tw.tw twVar) {
        if (twVar == null || rz.fxn) {
            return;
        }
        if (mvp()) {
            zu().execute(new com.bytedance.sdk.component.tw.gff.kg(twVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.yws.7
                @Override // java.lang.Runnable
                public void run() {
                    twVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.tw.bh.rb(twVar);
        }
    }

    public static void gff(final com.bytedance.sdk.component.tw.tw twVar, int i) {
        if (twVar == null || rz.fxn) {
            return;
        }
        if (mvp()) {
            xdg().execute(new com.bytedance.sdk.component.tw.gff.kg(twVar.getName()) { // from class: com.bytedance.sdk.openadsdk.utils.yws.8
                @Override // java.lang.Runnable
                public void run() {
                    twVar.run();
                }
            });
        } else {
            com.bytedance.sdk.component.tw.bh.gff(twVar, i);
        }
    }

    public static void rb(final com.bytedance.sdk.component.tw.tw twVar) {
        if (rz.fxn) {
            return;
        }
        if (mvp()) {
            zu().execute(new com.bytedance.sdk.component.tw.gff.kg(twVar.getName(), twVar) { // from class: com.bytedance.sdk.openadsdk.utils.yws.9
                @Override // java.lang.Runnable
                public void run() {
                    twVar.run();
                }
            });
            return;
        }
        ThreadPoolExecutor rlu = rlu();
        rlu.execute(twVar);
        if (kg || !com.bytedance.sdk.openadsdk.core.settings.rlu.qx()) {
            return;
        }
        kg = true;
        rlu.setCorePoolSize(com.bytedance.sdk.openadsdk.core.settings.rlu.jt().vts());
    }

    public static void fxn(com.bytedance.sdk.component.tw.gff.kg kgVar) {
        dgx().execute(kgVar);
    }

    private static ThreadPoolExecutor rlu() {
        int i;
        if (fxn == null) {
            synchronized (yws.class) {
                if (fxn == null) {
                    if (com.bytedance.sdk.openadsdk.core.settings.rlu.qx()) {
                        i = com.bytedance.sdk.openadsdk.core.settings.rlu.jt().vts();
                        kg = true;
                    } else {
                        i = 4;
                    }
                    int i2 = i;
                    fxn = new ThreadPoolExecutor(i2, Integer.MAX_VALUE, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    new Object[]{"token_thread_count=", Integer.valueOf(i2)};
                }
            }
        }
        return fxn;
    }

    private static ThreadPoolExecutor zu() {
        com.bytedance.sdk.component.tw.gff.bh bhVar;
        com.bytedance.sdk.component.tw.gff.bh bhVar2 = gff;
        if (!fxn(bhVar2)) {
            return bhVar2;
        }
        synchronized (yws.class) {
            if (fxn(gff)) {
                try {
                    gff = fxn("ad", gff);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            bhVar = gff;
        }
        return bhVar;
    }

    public static com.bytedance.sdk.component.tw.gff.bh jq() {
        com.bytedance.sdk.component.tw.gff.bh bhVar;
        com.bytedance.sdk.component.tw.gff.bh bhVar2 = bh;
        if (!fxn(bhVar2)) {
            return bhVar2;
        }
        synchronized (yws.class) {
            if (fxn(bh)) {
                try {
                    bh = fxn(b.O, bh);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            bhVar = bh;
        }
        return bhVar;
    }

    private static com.bytedance.sdk.component.tw.gff.bh ckl() {
        com.bytedance.sdk.component.tw.gff.bh bhVar;
        com.bytedance.sdk.component.tw.gff.bh bhVar2 = hm;
        if (!fxn(bhVar2)) {
            return bhVar2;
        }
        synchronized (yws.class) {
            if (fxn(hm)) {
                try {
                    hm = fxn("log", hm);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            bhVar = hm;
        }
        return bhVar;
    }

    private static com.bytedance.sdk.component.tw.gff.bh xdg() {
        com.bytedance.sdk.component.tw.gff.bh bhVar;
        com.bytedance.sdk.component.tw.gff.bh bhVar2 = rb;
        if (!fxn(bhVar2)) {
            return bhVar2;
        }
        synchronized (yws.class) {
            if (fxn(rb)) {
                try {
                    rb = fxn("aidl", rb);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            bhVar = rb;
        }
        return bhVar;
    }

    private static com.bytedance.sdk.component.tw.gff.bh rmu() {
        com.bytedance.sdk.component.tw.gff.bh bhVar;
        com.bytedance.sdk.component.tw.gff.bh bhVar2 = tw;
        if (!fxn(bhVar2)) {
            return bhVar2;
        }
        synchronized (yws.class) {
            if (fxn(tw)) {
                try {
                    tw = fxn("image", tw);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            bhVar = tw;
        }
        return bhVar;
    }

    public static com.bytedance.sdk.component.tw.gff.bh hie() {
        com.bytedance.sdk.component.tw.gff.bh bhVar;
        com.bytedance.sdk.component.tw.gff.bh bhVar2 = jq;
        if (!fxn(bhVar2)) {
            return bhVar2;
        }
        synchronized (yws.class) {
            if (fxn(jq)) {
                try {
                    jq = fxn("express", jq);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            bhVar = jq;
        }
        return bhVar;
    }

    private static com.bytedance.sdk.component.tw.gff.bh je() {
        com.bytedance.sdk.component.tw.gff.bh bhVar;
        com.bytedance.sdk.component.tw.gff.bh bhVar2 = f9577sg;
        if (!fxn(bhVar2)) {
            return bhVar2;
        }
        synchronized (yws.class) {
            if (fxn(f9577sg)) {
                try {
                    f9577sg = fxn("io", f9577sg);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            bhVar = f9577sg;
        }
        return bhVar;
    }

    private static com.bytedance.sdk.component.tw.gff.bh ud() {
        com.bytedance.sdk.component.tw.gff.bh bhVar;
        com.bytedance.sdk.component.tw.gff.bh bhVar2 = dgx;
        if (!fxn(bhVar2)) {
            return bhVar2;
        }
        synchronized (yws.class) {
            if (fxn(dgx)) {
                try {
                    dgx = fxn("imgdisk", dgx);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            bhVar = dgx;
        }
        return bhVar;
    }

    public static com.bytedance.sdk.component.tw.gff.bh dgx() {
        com.bytedance.sdk.component.tw.gff.bh bhVar;
        com.bytedance.sdk.component.tw.gff.bh bhVar2 = hie;
        if (!fxn(bhVar2)) {
            return bhVar2;
        }
        synchronized (yws.class) {
            if (fxn(hie)) {
                try {
                    hie = fxn("net", hie);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            bhVar = hie;
        }
        return bhVar;
    }

    private static boolean fxn(com.bytedance.sdk.component.tw.gff.bh bhVar) {
        if (bhVar != null) {
            return !bhVar.fxn() && com.bytedance.sdk.openadsdk.core.settings.rlu.qx();
        }
        return true;
    }

    public static boolean mvp() {
        if (com.bytedance.sdk.openadsdk.core.settings.rlu.qx()) {
            return com.bytedance.sdk.openadsdk.core.settings.rlu.jt().ncz();
        }
        return true;
    }

    private static com.bytedance.sdk.component.tw.gff.bh fxn(String str, com.bytedance.sdk.component.tw.gff.bh bhVar) {
        bh.fxn fxn2 = fxn(str);
        if (bhVar == null) {
            return fxn2.fxn();
        }
        bhVar.fxn(fxn2);
        return bhVar;
    }

    private static bh.fxn fxn(String str) {
        bh.fxn kg2 = kg(str);
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.rlu.qx()) {
                kg2.kg(true);
                JSONObject gs = com.bytedance.sdk.openadsdk.core.settings.rlu.jt().gs();
                JSONObject optJSONObject = gs != null ? gs.optJSONObject(str) : null;
                if (optJSONObject != null) {
                    kg2.kg(true);
                    if (optJSONObject.has("coreSize")) {
                        kg2.fxn(optJSONObject.optInt("coreSize"));
                    }
                    if (optJSONObject.has("maxSize")) {
                        kg2.kg(optJSONObject.optInt("maxSize"));
                    }
                    if (optJSONObject.has("createSize")) {
                        kg2.gff(optJSONObject.optInt("createSize"));
                    }
                    if (optJSONObject.has("keepAlive")) {
                        kg2.fxn(optJSONObject.optInt("keepAlive"));
                    }
                    if (optJSONObject.has("allowCoreTimeOut")) {
                        kg2.fxn(optJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (optJSONObject.has("reportLogThreshold")) {
                        optJSONObject.optInt("reportLogThreshold");
                    }
                    if (optJSONObject.has("logTaskCount")) {
                        optJSONObject.optInt("logTaskCount");
                        return kg2;
                    }
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return kg2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static bh.fxn kg(String str) {
        char c;
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        bh.fxn fxnVar = new bh.fxn();
        str.hashCode();
        switch (str.hashCode()) {
            case -1308979344:
                if (str.equals("express")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3107:
                if (str.equals("ad")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3366:
                if (str.equals("io")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 107332:
                if (str.equals("log")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 108957:
                if (str.equals("net")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2993840:
                if (str.equals("aidl")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 94416770:
                if (str.equals(b.O)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 100313435:
                if (str.equals("image")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1236319578:
                if (str.equals("monitor")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1917389792:
                if (str.equals("imgdisk")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return fxnVar.fxn(str).fxn(2).kg(4).gff(0).fxn(10000L).fxn(true).rb(-1).hm(10).kg(false);
            case 1:
                return fxnVar.fxn(str).fxn(4).kg(4).gff(0).fxn(20000L).fxn(true).rb(-1).hm(10).kg(false);
            case 2:
                return fxnVar.fxn(str).fxn(4).kg(10).gff(0).fxn(20000L).fxn(true).rb(-1).hm(10).kg(false);
            case 3:
                return fxnVar.fxn(str).fxn(4).kg(6).gff(2).fxn(20000L).fxn(true).rb(-1).hm(10).kg(false);
            case 4:
                return fxnVar.fxn(str).fxn(10).kg(10).gff(0).fxn(10000L).fxn(true).rb(-1).hm(10).kg(false);
            case 5:
                return fxnVar.fxn(str).fxn(2).kg(4).gff(0).fxn(10000L).fxn(true).rb(-1).hm(10).kg(false);
            case 6:
                return fxnVar.fxn(str).fxn(0).kg(0).gff(0).fxn(5000L).fxn(true).rb(-1).hm(20).kg(false);
            case 7:
                return fxnVar.fxn(str).fxn(3).kg(3).gff(0).fxn(20000L).fxn(true).rb(-1).hm(10).kg(false);
            case '\b':
                return fxnVar.fxn(str).fxn(2).kg(2).gff(0).fxn(10000L).fxn(true).rb(-1).hm(10).kg(false);
            case '\t':
                return fxnVar.fxn(str).fxn(1).kg(2).gff(3).fxn(10000L).fxn(true).rb(-1).hm(10).kg(false);
            default:
                return fxnVar.fxn(str).fxn(8).kg(16).gff(2).fxn(20000L).fxn(true).rb(-1).hm(10).kg(false);
        }
    }
}
