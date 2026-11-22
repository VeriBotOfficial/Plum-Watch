package sg.bigo.ads.core.d.a;

import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.q;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f19977a = 10;
    public int b = Constants.MAX_VALID_TIME_FOR_REGISTRATION_REQUEST;
    public final HashMap<String, C1102a> c;

    /* renamed from: sg.bigo.ads.core.d.a.a$a, reason: collision with other inner class name */
    public static class C1102a {

        /* renamed from: a, reason: collision with root package name */
        String f19978a;
        boolean b;
        public boolean c;
        public int d;

        public static C1102a a(String str) {
            C1102a c1102a = new C1102a();
            c1102a.f19978a = str;
            c1102a.b = true;
            c1102a.c = true;
            c1102a.d = 86400000;
            return c1102a;
        }

        public final void a(JSONObject jSONObject) {
            if (jSONObject == null) {
                sg.bigo.ads.common.t.a.a(0, "Stats", "eventConfig is null.");
                return;
            }
            this.f19978a = jSONObject.optString("event_id");
            this.b = jSONObject.optInt("status") == 1;
            this.c = jSONObject.optInt("delay") == 1;
            int optInt = jSONObject.optInt("expired") * 1000;
            this.d = optInt;
            if (optInt == 0) {
                this.d = 86400000;
            }
        }
    }

    public a() {
        HashMap<String, C1102a> hashMap = new HashMap<>();
        this.c = hashMap;
        b();
        hashMap.put("06002002", C1102a.a("06002002"));
        hashMap.put("06002007", C1102a.a("06002007"));
    }

    private void b() {
        this.f19977a = 10;
        this.b = Constants.MAX_VALID_TIME_FOR_REGISTRATION_REQUEST;
        this.c.clear();
    }

    public final int a() {
        return Math.round(this.f19977a * 0.8f);
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            b();
            return;
        }
        this.f19977a = jSONObject.optInt("delay_num", 10);
        int optInt = jSONObject.optInt("delay_interval") * 1000;
        this.b = optInt;
        if (optInt == 0) {
            this.b = Constants.MAX_VALID_TIME_FOR_REGISTRATION_REQUEST;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("event_config");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            C1102a c1102a = new C1102a();
            c1102a.a(optJSONArray.optJSONObject(i));
            if (q.b((CharSequence) c1102a.f19978a)) {
                this.c.put(c1102a.f19978a, c1102a);
            }
        }
    }

    public final boolean a(String str) {
        C1102a c1102a = this.c.get(str);
        if (c1102a == null) {
            return false;
        }
        return c1102a.b;
    }
}
