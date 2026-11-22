package com.alipay.android.phone.mrpc.core.a;

import android.util.Log;
import com.alipay.android.phone.mrpc.core.RpcException;
import com.alipay.sdk.m.y.o;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class d extends a {
    public d(Type type, byte[] bArr) {
        super(type, bArr);
    }

    @Override // com.alipay.android.phone.mrpc.core.a.c
    public Object a() {
        try {
            String str = new String(this.b);
            Log.v("HttpCaller", "threadid = " + Thread.currentThread().getId() + "; rpc response:  " + str);
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt(o.f1496a);
            if (i == 1000) {
                return this.f1268a == String.class ? jSONObject.optString("result") : com.alipay.sdk.m.f.a.a(jSONObject.optString("result"), this.f1268a);
            }
            throw new RpcException(Integer.valueOf(i), jSONObject.optString("tips"));
        } catch (Exception e) {
            throw new RpcException((Integer) 10, new StringBuilder("response  =").append(new String(this.b)).append(":").append(e).toString() == null ? "" : e.getMessage());
        }
    }
}
