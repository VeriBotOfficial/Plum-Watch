package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.secure.android.common.encrypt.hash.SHA;
import com.xiaomi.mipush.sdk.Constants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.UUID;

/* loaded from: classes14.dex */
public class j {
    private static j b;

    /* renamed from: a, reason: collision with root package name */
    private Context f10407a;

    private static class a extends e0 {

        /* renamed from: a, reason: collision with root package name */
        String f10408a;
        String b;

        public a(String str, String str2) {
            this.f10408a = str;
            this.b = str2;
        }

        @Override // com.huawei.hms.hatool.e0
        public String a() {
            return z.d(this.f10408a, this.b);
        }

        @Override // com.huawei.hms.hatool.e0
        public String a(String str) {
            return SHA.sha256Encrypt(str);
        }

        @Override // com.huawei.hms.hatool.e0
        public String b() {
            return z.g(this.f10408a, this.b);
        }

        @Override // com.huawei.hms.hatool.e0
        public String c() {
            return z.j(this.f10408a, this.b);
        }

        @Override // com.huawei.hms.hatool.e0
        public int d() {
            return (z.k(this.f10408a, this.b) ? 4 : 0) | (z.e(this.f10408a, this.b) ? 2 : 0) | (z.h(this.f10408a, this.b) ? 1 : 0);
        }
    }

    public static j a() {
        j jVar;
        synchronized (j.class) {
            if (b == null) {
                b = new j();
            }
            jVar = b;
        }
        return jVar;
    }

    public String a(String str, String str2) {
        return i0.a(this.f10407a, str, str2);
    }

    public String a(boolean z) {
        if (!z) {
            return "";
        }
        String e = q0.e();
        if (TextUtils.isEmpty(e)) {
            e = d.a(this.f10407a, "global_v2", CommonUrlParts.UUID, "");
            if (TextUtils.isEmpty(e)) {
                e = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
                d.b(this.f10407a, "global_v2", CommonUrlParts.UUID, e);
            }
            q0.h(e);
        }
        return e;
    }

    public void a(Context context) {
        if (this.f10407a == null) {
            this.f10407a = context;
        }
    }

    public String b(String str, String str2) {
        return i0.b(this.f10407a, str, str2);
    }

    public i c(String str, String str2) {
        return new a(str, str2).a(this.f10407a);
    }

    public String d(String str, String str2) {
        return f1.b(str, str2);
    }

    public Pair<String, String> e(String str, String str2) {
        if (!z.f(str, str2)) {
            return new Pair<>("", "");
        }
        String p = s.c().b().p();
        String q2 = s.c().b().q();
        if (!TextUtils.isEmpty(p) && !TextUtils.isEmpty(q2)) {
            return new Pair<>(p, q2);
        }
        Pair<String, String> e = x0.e(this.f10407a);
        s.c().b().k((String) e.first);
        s.c().b().l((String) e.second);
        return e;
    }

    public String f(String str, String str2) {
        return f1.a(str, str2);
    }
}
