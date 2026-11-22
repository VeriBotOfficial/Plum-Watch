package sg.bigo.ads.common.h.a;

import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f19622a = 3;
    public int b = 20;
    public int c = 40;
    public long d = 432000000;

    public a() {
        c();
    }

    private void c() {
        this.f19622a = 3;
        this.b = 20;
        this.c = 40;
        this.d = 432000000L;
    }

    public final int a() {
        int i = this.b;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            c();
            return;
        }
        this.f19622a = jSONObject.optInt("download_parallel_num", 3);
        int optInt = jSONObject.optInt("num", 20);
        this.b = optInt;
        this.c = optInt * 2;
        long optInt2 = jSONObject.optInt("valid_period") * 1000;
        if (optInt2 == 0) {
            optInt2 = 432000000;
        }
        this.d = optInt2;
    }

    public final boolean b() {
        return this.f19622a <= 0;
    }
}
