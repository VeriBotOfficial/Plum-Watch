package com.amap.api.col.p0003sl;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.feature.dynamic.b;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AbstractBasicHandler.java */
/* loaded from: classes11.dex */
public abstract class r8<T, V> extends z3 {
    protected T o;

    /* renamed from: q, reason: collision with root package name */
    protected Context f1857q;
    protected String r;
    protected int p = 1;
    protected boolean s = false;

    public r8(Context context, T t) {
        a(context, t);
    }

    private void a(Context context, T t) {
        this.f1857q = context;
        this.o = t;
        this.p = 1;
        setSoTimeout(30000);
        setConnectionTimeout(30000);
    }

    private V d() throws q8 {
        V v = null;
        int i = 0;
        while (i < this.p) {
            try {
                setProxy(i9.b(this.f1857q));
                v = this.s ? a(makeHttpRequestNeedHeader()) : a(makeHttpRequest());
                i = this.p;
            } catch (q8 e) {
                i++;
                if (i >= this.p) {
                    throw new q8(e.a());
                }
            } catch (y8 e2) {
                i++;
                if (i >= this.p) {
                    e();
                    if ("http连接失败 - ConnectionException".equals(e2.getMessage()) || "socket 连接异常 - SocketException".equals(e2.getMessage()) || "未知的错误".equals(e2.d()) || "服务器连接失败 - UnknownServiceException".equals(e2.getMessage())) {
                        throw new q8(q8.A);
                    }
                    throw new q8(e2.d());
                }
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    if ("http连接失败 - ConnectionException".equals(e2.getMessage()) || "socket 连接异常 - SocketException".equals(e2.getMessage()) || "服务器连接失败 - UnknownServiceException".equals(e2.getMessage())) {
                        throw new q8(q8.A);
                    }
                    throw new q8(e2.d());
                }
            }
        }
        return v;
    }

    protected V a(pb pbVar) throws q8 {
        return null;
    }

    protected abstract V b(String str) throws q8;

    public V c() throws q8 {
        if (this.o == null) {
            return null;
        }
        try {
            return d();
        } catch (q8 e) {
            t4.a(e);
            throw e;
        }
    }

    protected V e() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.ob
    public Map<String, String> getRequestHead() {
        l9 b = t4.b();
        String e = b != null ? b.e() : null;
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("User-Agent", v0.c);
        hashtable.put("Accept-Encoding", "gzip");
        hashtable.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", e, "3dmap"));
        hashtable.put("X-INFO", c9.a(this.f1857q));
        hashtable.put("key", z8.e(this.f1857q));
        hashtable.put("logversion", "2.1");
        return hashtable;
    }

    protected V a(byte[] bArr) throws q8 {
        String str;
        try {
            str = new String(bArr, "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
            str = null;
        }
        if (str == null || "".equals(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(b.g)) {
                t8.a(jSONObject.getInt(b.g), jSONObject.getString("errmsg"));
            } else if (jSONObject.has("status") && jSONObject.has("infocode")) {
                String string = jSONObject.getString("status");
                int i = jSONObject.getInt("infocode");
                if (!"1".equals(string)) {
                    String string2 = jSONObject.getString(ParameterNames.INFO);
                    if ("0".equals(string)) {
                        t8.a(i, string2);
                    }
                }
            }
            return b(str);
        } catch (JSONException unused) {
            throw new q8(q8.w);
        }
    }
}
