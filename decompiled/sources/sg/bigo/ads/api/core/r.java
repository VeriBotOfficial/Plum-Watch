package sg.bigo.ads.api.core;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19546a = false;
    private String b = "";
    private int c = 0;
    private int d = 0;

    public r() {
        a();
    }

    private void a() {
        this.f19546a = false;
        this.b = "";
        this.c = 3;
        this.d = 20000;
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            a();
            return;
        }
        this.f19546a = true;
        this.b = jSONObject.optString("http_succ_code");
        this.c = jSONObject.optInt("retry_cnt", 3);
        int optInt = jSONObject.optInt("retry_interval") * 1000;
        this.d = optInt;
        if (optInt < 20000) {
            this.d = 20000;
        }
    }

    public final boolean a(int i) {
        if (i >= 100) {
            return this.b.contains(String.valueOf(i));
        }
        return false;
    }

    public final boolean a(long j, long j2) {
        return j + ((long) this.d) < j2;
    }

    public final boolean b(int i) {
        return i < this.c;
    }
}
