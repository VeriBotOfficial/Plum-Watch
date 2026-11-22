package com.baidu.xclient.gdid;

import android.content.Context;
import android.util.Base64;
import com.anythink.core.d.n;
import com.anythink.expressad.f.a.b;
import com.umeng.analytics.pro.ak;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile c f9052a;
    public Context b;

    public static c a() {
        if (f9052a == null) {
            synchronized (c.class) {
                if (f9052a == null) {
                    f9052a = new c();
                }
            }
        }
        return f9052a;
    }

    public void a(Context context) {
        this.b = context;
        b();
    }

    public void b() {
        long f = e.e().f();
        if (System.currentTimeMillis() - f < e.e().g()) {
            return;
        }
        c();
    }

    public final void c() {
        String b;
        try {
            if (com.baidu.xclient.gdid.j.d.a(this.b) && com.baidu.mshield.b.e.a.d(this.b) && (b = new com.baidu.xclient.gdid.g.a(this.b, null).b()) != null) {
                e.e().a(System.currentTimeMillis());
                if ("".equals(b)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(b);
                e.e().a(jSONObject.optInt("1", 1));
                JSONObject optJSONObject = jSONObject.optJSONObject("2");
                if (optJSONObject != null) {
                    long optLong = optJSONObject.optLong("j");
                    if (optLong >= 0) {
                        e.e().d(optLong * com.baidu.xclient.gdid.d.a.f9055a);
                    }
                    int optInt = optJSONObject.optInt("m", -1);
                    if (optInt != -1) {
                        if (optInt == 1) {
                            e.e().a(true);
                        } else {
                            e.e().a(false);
                        }
                    }
                    int optInt2 = optJSONObject.optInt("e", -1);
                    if (optInt2 != -1) {
                        if (optInt2 == 1) {
                            e.e().b(true);
                        } else {
                            e.e().b(false);
                        }
                    }
                    int optInt3 = optJSONObject.optInt("d", -1);
                    if (optInt3 == 1) {
                        e.e().c(true);
                    } else if (optInt3 == 0) {
                        e.e().c(false);
                    }
                    int optInt4 = optJSONObject.optInt("i", -1);
                    if (optInt4 != -1) {
                        if (optInt4 == 1) {
                            e.e().g(true);
                        } else {
                            e.e().g(false);
                        }
                    }
                    int optInt5 = optJSONObject.optInt("w", -1);
                    if (optInt5 != -1) {
                        if (optInt5 == 1) {
                            e.e().i(true);
                        } else {
                            e.e().i(false);
                        }
                    }
                    String optString = optJSONObject.optString("p", "-1");
                    if (!optString.equals("-1")) {
                        e.e().f(optString);
                    }
                    e.e().b(Base64.encodeToString(optJSONObject.toString().getBytes(), 1));
                    int optInt6 = optJSONObject.optInt("o", -1);
                    if (optInt6 == 1) {
                        e.e().h(true);
                    } else if (optInt6 == 0) {
                        e.e().h(false);
                    }
                    int optInt7 = optJSONObject.optInt("a", -1);
                    if (optInt7 == 1) {
                        e.e().j(true);
                    } else if (optInt7 == 0) {
                        e.e().j(false);
                    }
                    int optInt8 = optJSONObject.optInt(ak.aH, -1);
                    if (optInt8 == 1) {
                        e.e().k(true);
                    } else if (optInt8 == 0) {
                        e.e().k(false);
                    }
                    int optInt9 = optJSONObject.optInt(n.f4527a, -1);
                    if (optInt9 == 1) {
                        e.e().l(true);
                    } else if (optInt9 == 0) {
                        e.e().l(false);
                    }
                    int optInt10 = optJSONObject.optInt("h", -1);
                    if (optInt10 == 1) {
                        e.e().e(true);
                    } else if (optInt10 == 0) {
                        e.e().e(false);
                    }
                    int optInt11 = optJSONObject.optInt("f", -1);
                    if (optInt11 == 1) {
                        e.e().f(true);
                    } else if (optInt11 == 0) {
                        e.e().f(false);
                    }
                    int optInt12 = optJSONObject.optInt(b.w, -1);
                    if (optInt12 == 1) {
                        e.e().d(true);
                    } else if (optInt12 == 0) {
                        e.e().d(false);
                    }
                }
                if (jSONObject.optJSONObject("6") != null) {
                    e.e().b(r0.optInt("1", 0) * com.baidu.xclient.gdid.d.a.f9055a);
                    e.e().f(r0.optInt("2", 0) * com.baidu.xclient.gdid.d.a.f9055a);
                    e.e().h(r0.optInt("4", 0) * com.baidu.xclient.gdid.d.a.f9055a);
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("7");
                if (optJSONObject2 != null) {
                    e.e().e(optJSONObject2.optInt("s", -1));
                    e.e().b(optJSONObject2.optInt("d", -1));
                    e.e().c(optJSONObject2.optInt("j", -1));
                    e.e().d(optJSONObject2.optInt("c", -1));
                    e.e().f(optJSONObject2.optInt("o", -1));
                }
                String optString2 = jSONObject.optString("5");
                if (e.e().j().equals(optString2)) {
                    return;
                }
                e.e().a(optString2);
                String optString3 = jSONObject.optString("3", "");
                String optString4 = jSONObject.optString("4", "");
                String optString5 = jSONObject.optString("8", "");
                e.e().d(optString3);
                e.e().e(optString4);
                e.e().g(optString5);
            }
        } catch (Throwable th) {
            com.baidu.xclient.gdid.j.d.a(th);
        }
    }
}
