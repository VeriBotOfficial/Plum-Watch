package sg.bigo.ads.core.b.a;

import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f19954a = 10;
    public int b = Constants.MAX_VALID_TIME_FOR_REGISTRATION_REQUEST;
    public int c = 259200000;

    public a() {
        b();
    }

    private void b() {
        this.f19954a = 10;
        this.b = Constants.MAX_VALID_TIME_FOR_REGISTRATION_REQUEST;
        this.c = 259200000;
    }

    public final int a() {
        return Math.round(this.f19954a * 0.8f);
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            b();
            return;
        }
        this.f19954a = jSONObject.optInt("num", 10);
        int optInt = jSONObject.optInt(ak.aT) * 1000;
        this.b = optInt;
        if (optInt == 0) {
            this.b = Constants.MAX_VALID_TIME_FOR_REGISTRATION_REQUEST;
        }
        this.c = jSONObject.optInt("expired") * 1000;
    }
}
