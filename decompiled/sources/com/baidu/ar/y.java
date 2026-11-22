package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.callback.ICallbackWith;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class y {
    public static final String g = "y";

    /* renamed from: a, reason: collision with root package name */
    public Context f7335a;
    public JSONObject b;
    public JSONObject c;
    public b0 d;
    public String e;
    public ICallbackWith<String> f;

    public class a implements ICallbackWith<String> {
        public a() {
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(String str) {
            if (y.this.f != null) {
                y.this.f.run(str);
            }
        }
    }

    public class b implements ICallbackWith<x> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ICallbackWith f7337a;

        public b(ICallbackWith iCallbackWith) {
            this.f7337a = iCallbackWith;
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(x xVar) {
            y.this.d = null;
            y.this.a(xVar);
            ICallbackWith iCallbackWith = this.f7337a;
            if (iCallbackWith == null || xVar == null) {
                return;
            }
            iCallbackWith.run(xVar.b);
        }
    }

    public y(Context context) {
        this.e = "default";
        if (context != null) {
            this.f7335a = context.getApplicationContext();
            x a2 = a0.a(context);
            if (a2 != null) {
                this.b = a2.b;
                this.e = a2.f7311a;
            }
        }
    }

    public final int a() {
        int b2 = z.b();
        if (b2 != 1) {
            return b2 != 2 ? 4999 : 8001;
        }
        return 5001;
    }

    public void a(ICallbackWith<String> iCallbackWith) {
        this.f = iCallbackWith;
    }

    public final void a(x xVar) {
        Context context;
        if (xVar == null || (context = this.f7335a) == null) {
            return;
        }
        this.e = xVar.f7311a;
        this.b = xVar.b;
        a0.a(context, xVar);
    }

    public void a(JSONObject jSONObject) {
        this.c = jSONObject;
    }

    public int b() {
        return z.b();
    }

    public void b(ICallbackWith<JSONObject> iCallbackWith) {
        b0 b0Var = new b0();
        this.d = b0Var;
        b0Var.a(new a());
        this.d.a(this.f7335a, this.e, new b(iCallbackWith));
    }

    public Map<String, Object> c() {
        JSONObject d;
        HashMap hashMap = new HashMap();
        if (d() == null || (d = d()) == null || !d.has("common")) {
            hashMap.put("cpu_score", Integer.valueOf(a()));
            return hashMap;
        }
        try {
            JSONObject jSONObject = d.getJSONObject("common");
            hashMap.put("cpu_score", jSONObject.has("cpu_score") ? Integer.valueOf(jSONObject.getInt("cpu_score")) : Integer.valueOf(a()));
            return hashMap;
        } catch (JSONException e) {
            e.printStackTrace();
            hashMap.put("cpu_score", Integer.valueOf(a()));
            return hashMap;
        }
    }

    public JSONObject d() {
        if (this.c == null) {
            h.a(g, "use inner config: " + this.b);
            return this.b;
        }
        h.a(g, "use outter config: " + this.c);
        return this.c;
    }

    public void e() {
        this.f = null;
        b0 b0Var = this.d;
        if (b0Var != null) {
            b0Var.b();
            this.d = null;
        }
        this.f7335a = null;
    }
}
