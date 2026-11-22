package com.qumeng.overseas.advlib.trdparty.unionset.common;

import android.os.SystemClock;
import android.text.TextUtils;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import com.qumeng.overseas.advlib.core.AdRequestParam;
import com.qumeng.overseas.advlib.core.QMConfig;
import com.qumeng.overseas.advlib.trdparty.unionset.network.l;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes17.dex */
public abstract class f {
    public static final int b = -1;
    public static final int c = 0;
    public static final int d = 1;
    private static final String e = "AdPlatformManager";

    /* renamed from: a, reason: collision with root package name */
    private long f13372a = 0;

    public interface a {
        void onSdkInitCompleted();

        void onSdkInitFailed();
    }

    protected void a(int i) {
    }

    protected abstract c b(com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar, AdRequestParam adRequestParam);

    protected abstract d b(l lVar, long j);

    public abstract String b();

    public final void b(QMConfig qMConfig, a aVar) {
        this.f13372a = SystemClock.elapsedRealtime();
        com.qumeng.overseas.advlib.__remote__.core.e.a(this, "START");
        c(qMConfig, aVar);
        n.a(e, "init ---->>> " + b() + " ; cost time = " + (SystemClock.elapsedRealtime() - this.f13372a), new Object[0]);
    }

    public String c() {
        return "unknown";
    }

    protected abstract void c(QMConfig qMConfig, a aVar);

    public long d() {
        return this.f13372a;
    }

    public boolean e() {
        return false;
    }

    public abstract boolean f();

    public final d a(l lVar, long j) {
        n.a(e, "createAdRequest ---->>> " + b(), new Object[0]);
        return b(lVar, j);
    }

    public final c a(com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar, AdRequestParam adRequestParam) {
        c b2 = b(aVar, adRequestParam);
        if (b2 != null) {
            n.a(e, "createConvertor ---->>> " + b(), new Object[0]);
        }
        return b2;
    }

    public final void b(int i) {
        a(i);
    }

    protected static int b(String str) {
        return a(str) != null ? 0 : 1;
    }

    public String a() {
        return "";
    }

    protected String a(QMConfig qMConfig, String str, String str2) {
        Object obj;
        if (qMConfig == null) {
            return null;
        }
        Map map = qMConfig.getMap();
        if (map != null && (obj = map.get(str)) != null) {
            String valueOf = String.valueOf(obj);
            if (!TextUtils.isEmpty(valueOf) && !AbstractJsonLexerKt.NULL.equalsIgnoreCase(valueOf)) {
                return valueOf;
            }
        }
        return str2;
    }

    protected boolean a(QMConfig qMConfig, a aVar) {
        if (qMConfig != null && qMConfig.getContext() != null) {
            return false;
        }
        if (aVar != null) {
            aVar.onSdkInitFailed();
        }
        System.err.println(b() + " init failed, qmConfig or context is null");
        return true;
    }

    protected static Class<?> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
