package com.bytedance.adsdk.kg;

import android.content.Context;
import android.os.Trace;
import java.io.File;

/* loaded from: classes13.dex */
public class rb {
    private static long[] bh = null;
    private static volatile com.bytedance.adsdk.kg.hm.tw dgx = null;
    public static boolean fxn = false;
    private static boolean gff = true;
    private static com.bytedance.adsdk.kg.hm.rb hie = null;
    private static boolean hm = true;
    private static com.bytedance.adsdk.kg.hm.bh jq = null;
    private static boolean kg = false;
    private static volatile com.bytedance.adsdk.kg.hm.sg mvp;
    private static String[] rb;

    /* renamed from: sg, reason: collision with root package name */
    private static int f9265sg;
    private static int tw;

    public static void fxn(String str) {
        if (kg) {
            int i = f9265sg;
            if (i == 20) {
                tw++;
                return;
            }
            rb[i] = str;
            bh[i] = System.nanoTime();
            Trace.beginSection(str);
            f9265sg++;
        }
    }

    public static float kg(String str) {
        int i = tw;
        if (i > 0) {
            tw = i - 1;
            return 0.0f;
        }
        if (!kg) {
            return 0.0f;
        }
        int i2 = f9265sg - 1;
        f9265sg = i2;
        if (i2 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (!str.equals(rb[i2])) {
            throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + rb[f9265sg] + ".");
        }
        Trace.endSection();
        return (System.nanoTime() - bh[f9265sg]) / 1000000.0f;
    }

    public static com.bytedance.adsdk.kg.hm.tw fxn(Context context) {
        com.bytedance.adsdk.kg.hm.tw twVar;
        com.bytedance.adsdk.kg.hm.tw twVar2 = dgx;
        if (twVar2 != null) {
            return twVar2;
        }
        synchronized (com.bytedance.adsdk.kg.hm.tw.class) {
            twVar = dgx;
            if (twVar == null) {
                com.bytedance.adsdk.kg.hm.sg kg2 = kg(context);
                com.bytedance.adsdk.kg.hm.bh bhVar = jq;
                if (bhVar == null) {
                    bhVar = new com.bytedance.adsdk.kg.hm.kg();
                }
                twVar = new com.bytedance.adsdk.kg.hm.tw(kg2, bhVar);
                dgx = twVar;
            }
        }
        return twVar;
    }

    public static com.bytedance.adsdk.kg.hm.sg kg(Context context) {
        com.bytedance.adsdk.kg.hm.sg sgVar;
        if (!gff) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.kg.hm.sg sgVar2 = mvp;
        if (sgVar2 != null) {
            return sgVar2;
        }
        synchronized (com.bytedance.adsdk.kg.hm.sg.class) {
            sgVar = mvp;
            if (sgVar == null) {
                com.bytedance.adsdk.kg.hm.rb rbVar = hie;
                if (rbVar == null) {
                    rbVar = new com.bytedance.adsdk.kg.hm.rb() { // from class: com.bytedance.adsdk.kg.rb.1
                        @Override // com.bytedance.adsdk.kg.hm.rb
                        public File fxn() {
                            return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                        }
                    };
                }
                sgVar = new com.bytedance.adsdk.kg.hm.sg(rbVar);
                mvp = sgVar;
            }
        }
        return sgVar;
    }

    public static boolean fxn() {
        return hm;
    }
}
