package com.huawei.hms.scankit;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.EnumC2970d;
import com.huawei.hms.scankit.p.C2995e;
import com.king.zxing.Preferences;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* compiled from: DecodeThread.java */
/* loaded from: classes14.dex */
final class m extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private Context f10545a;
    private final C2995e b;
    private final Map<EnumC2970d, Object> c;
    private Handler d;
    private HandlerC2966a e;
    private Rect g;
    private boolean h = true;
    private final CountDownLatch f = new CountDownLatch(1);

    m(Context context, C2995e c2995e, HandlerC2966a handlerC2966a, Collection<BarcodeFormat> collection, Map<EnumC2970d, ?> map, String str, com.huawei.hms.scankit.aiscan.common.A a2) {
        this.f10545a = context;
        this.b = c2995e;
        this.e = handlerC2966a;
        EnumMap enumMap = new EnumMap(EnumC2970d.class);
        this.c = enumMap;
        if (map != null) {
            enumMap.putAll(map);
        }
        if (collection == null || collection.isEmpty()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            collection = EnumSet.noneOf(BarcodeFormat.class);
            if (defaultSharedPreferences.getBoolean(Preferences.KEY_DECODE_1D_PRODUCT, true)) {
                collection.addAll(i.f10540a);
            }
            if (defaultSharedPreferences.getBoolean(Preferences.KEY_DECODE_1D_INDUSTRIAL, true)) {
                collection.addAll(i.b);
            }
            if (defaultSharedPreferences.getBoolean(Preferences.KEY_DECODE_QR, true)) {
                collection.addAll(i.d);
            }
            if (defaultSharedPreferences.getBoolean(Preferences.KEY_DECODE_DATA_MATRIX, true)) {
                collection.addAll(i.e);
            }
            if (defaultSharedPreferences.getBoolean(Preferences.KEY_DECODE_AZTEC, false)) {
                collection.addAll(i.f);
            }
            if (defaultSharedPreferences.getBoolean(Preferences.KEY_DECODE_PDF417, false)) {
                collection.addAll(i.g);
            }
        }
        enumMap.put((EnumMap) EnumC2970d.POSSIBLE_FORMATS, (EnumC2970d) collection);
        if (str != null) {
            enumMap.put((EnumMap) EnumC2970d.CHARACTER_SET, (EnumC2970d) str);
        }
        enumMap.put((EnumMap) EnumC2970d.NEED_RESULT_POINT_CALLBACK, (EnumC2970d) a2);
        com.huawei.hms.scankit.util.a.c("DecodeThread", "Hints: " + enumMap);
    }

    public void a(Rect rect) {
        this.g = rect;
    }

    public void b() {
        this.f10545a = null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.d = new j(this.f10545a, this.b, this.e, this.c, this.g, this.h);
        this.f.countDown();
        Looper.loop();
    }

    Handler a() {
        try {
            this.f.await();
        } catch (InterruptedException unused) {
            com.huawei.hms.scankit.util.a.b("exception", "InterruptedException");
        }
        return this.d;
    }

    public void a(boolean z) {
        this.h = z;
    }
}
