package com.baidu.ar;

import io.nats.client.support.NatsConstants;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ye {

    /* renamed from: a, reason: collision with root package name */
    public g7 f7352a = new se();
    public i7 b;
    public boolean c;

    public class a implements h7 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7353a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f7353a = str;
            this.b = str2;
        }

        @Override // com.baidu.ar.h7
        public void a(int i, String str, boolean z) {
        }

        @Override // com.baidu.ar.h7
        public void a(String str) {
            ye.this.a(str);
        }

        @Override // com.baidu.ar.h7
        public void onError(int i, String str) {
            h.a(str);
            if (ye.this.b != null) {
                ye.this.b.a(i, str);
            }
        }

        @Override // com.baidu.ar.h7
        public void onOpen() {
            ye.this.a(this.f7353a, this.b);
            if (ye.this.b != null) {
                ye.this.b.a(true);
            }
        }
    }

    public ye(i7 i7Var) {
        this.b = i7Var;
    }

    public void a() {
        g7 g7Var = this.f7352a;
        if (g7Var != null) {
            g7Var.b();
        }
    }

    public final void a(String str) {
        char c;
        String str2;
        try {
            wb a2 = wb.a(str);
            if (a2 == null) {
                return;
            }
            String a3 = a2.a();
            switch (a3.hashCode()) {
                case -1072073501:
                    if (a3.equals("AUDIO_QUERY_INTERRUPT")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -619950265:
                    if (a3.equals("THREEJS")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 291286536:
                    if (a3.equals("DOWN_CLIENT")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1669334218:
                    if (a3.equals(NatsConstants.OP_CONNECT)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 2079549205:
                    if (a3.equals("DOWN_SUBTITLE")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c == 1) {
                    if (this.c) {
                        return;
                    }
                    yb a4 = a2.d() ? yb.a(new JSONObject(a2.b())) : null;
                    i7 i7Var = this.b;
                    if (i7Var != null) {
                        i7Var.a(a4);
                        return;
                    }
                    return;
                }
                if (c == 2) {
                    if (a2.d()) {
                        i7 i7Var2 = this.b;
                        if (i7Var2 != null) {
                            i7Var2.a(a2);
                            return;
                        }
                        return;
                    }
                    i7 i7Var3 = this.b;
                    if (i7Var3 != null) {
                        i7Var3.a((wb) null);
                        return;
                    }
                    return;
                }
                if (c == 3) {
                    xb a5 = a2.d() ? xb.a(new JSONObject(a2.b())) : null;
                    i7 i7Var4 = this.b;
                    if (i7Var4 != null) {
                        i7Var4.a(a5);
                        return;
                    }
                    return;
                }
                if (c != 4) {
                    return;
                } else {
                    str2 = "record stop";
                }
            } else {
                str2 = "socket is connected";
            }
            h.a("DIGITAL_STATE", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void a(String str, String str2) {
        ub ubVar = new ub();
        ubVar.a(str);
        ubVar.b(str2);
        vb vbVar = new vb();
        vbVar.a(NatsConstants.OP_CONNECT);
        vbVar.c("arkit");
        vbVar.d("conn" + System.currentTimeMillis());
        vbVar.b(ubVar.c().toString());
        g7 g7Var = this.f7352a;
        if (g7Var != null) {
            g7Var.a(vbVar.e().toString());
        }
    }

    public void a(String str, String str2, String str3) {
        this.f7352a.b(str);
        this.f7352a.a(new a(str2, str3));
        this.f7352a.c();
    }

    public void a(byte[] bArr) {
        g7 g7Var = this.f7352a;
        if (g7Var != null) {
            if (bArr != null) {
                this.c = true;
                g7Var.a(bArr);
            } else {
                d();
                this.c = false;
            }
        }
    }

    public void b() {
        g7 g7Var = this.f7352a;
        if (g7Var != null) {
            g7Var.release();
        }
    }

    public void b(String str, String str2) {
        this.c = false;
        String b = qc.a().b(str);
        vb vbVar = new vb();
        vbVar.d("msg" + System.currentTimeMillis());
        vbVar.a(str2);
        vbVar.c("arkit");
        vbVar.b(b);
        String jSONObject = vbVar.e().toString();
        this.f7352a.a(jSONObject);
        i7 i7Var = this.b;
        if (i7Var != null) {
            i7Var.a(jSONObject);
        }
    }

    public void c() {
        g7 g7Var = this.f7352a;
        if (g7Var != null) {
            g7Var.a();
        }
    }

    public void d() {
        String str = "msg" + System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put(com.qumeng.overseas.advlib.trdparty.unionset.common.h.A, str);
        hashMap.put("action", "AUDIO_QUERY_INTERRUPT");
        String jSONObject = new JSONObject(hashMap).toString();
        g7 g7Var = this.f7352a;
        if (g7Var != null) {
            g7Var.a(jSONObject);
        }
    }
}
