package com.xiaomi.push;

import android.content.Context;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
class am implements aj {

    /* renamed from: a, reason: collision with root package name */
    private Context f14431a;

    /* renamed from: a, reason: collision with other field name */
    private Class<?> f198a;

    /* renamed from: a, reason: collision with other field name */
    private Object f199a;

    /* renamed from: a, reason: collision with other field name */
    private Method f200a = null;
    private Method b = null;
    private Method c = null;
    private Method d = null;

    public am(Context context) {
        this.f14431a = context;
        a(context);
    }

    private void a(Context context) {
        try {
            Class<?> a2 = s.a(context, "com.android.id.impl.IdProviderImpl");
            this.f198a = a2;
            this.f199a = a2.newInstance();
            this.b = this.f198a.getMethod("getOAID", Context.class);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a("miui load class error", e);
        }
    }

    @Override // com.xiaomi.push.aj
    /* renamed from: a */
    public boolean mo11870a() {
        return (this.f198a == null || this.f199a == null) ? false : true;
    }

    @Override // com.xiaomi.push.aj
    /* renamed from: a */
    public String mo11869a() {
        return a(this.f14431a, this.b);
    }

    private String a(Context context, Method method) {
        Object obj = this.f199a;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(obj, context);
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a("miui invoke error", e);
            return null;
        }
    }
}
