package sg.bigo.ads.api.a;

import io.nats.client.support.ApiConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public interface e {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f19521a = "";
        public String b = "";
        public String c = "";
        public String d = "";
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f19522a = "";
        public String b = "";
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public String f19523a;
        public int b;
        public String[] c;
        public String d;

        public c(JSONObject jSONObject) {
            this.f19523a = "";
            this.b = 0;
            this.c = null;
            this.d = "";
            this.f19523a = jSONObject.optString("title", "");
            this.b = jSONObject.optInt("type", 0);
            JSONArray optJSONArray = jSONObject.optJSONArray(ApiConstants.OPTIONS);
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.c = new String[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.c[i] = optJSONArray.optString(i);
                }
            }
            this.d = jSONObject.optString("id", "");
        }
    }

    String a();

    String b();

    long c();

    int d();

    String e();

    int f();

    String g();

    String h();

    f[] i();

    f j();

    f k();

    b l();

    c[] m();

    a n();
}
