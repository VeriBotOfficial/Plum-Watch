package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.arplay.core.message.ARPMessage;
import com.baidu.ar.rb;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes12.dex */
public class tb implements s3 {

    /* renamed from: a, reason: collision with root package name */
    public Context f7225a;
    public rb.a b;

    public class a implements rb.a {
        public a(tb tbVar) {
        }

        @Override // com.baidu.ar.rb.a
        public void a(float f, float f2, float f3, float f4) {
            h.b("acc  x " + f + " , y : " + f2 + " , z " + f3);
            StatisticApi.onEvent(StatisticConstants.MODEL_PHONE_SHAKE);
            tb.a(f, f2, f3, f4);
        }

        @Override // com.baidu.ar.rb.a
        public void destroy() {
        }
    }

    public tb(Context context) {
        this.f7225a = context.getApplicationContext();
    }

    public static void a(float f, float f2, float f3, float f4) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", 10000);
        hashMap.put("max_acc", Float.valueOf(f4));
        ARPMessage.getInstance().sendMessage(1902, hashMap);
    }

    @Override // com.baidu.ar.s3
    public List<Integer> a() {
        return Arrays.asList(1901);
    }

    @Override // com.baidu.ar.s3
    public void a(int i, int i2, HashMap<String, Object> hashMap) {
        if (i != 1901 || hashMap == null) {
            return;
        }
        int a2 = a9.a(hashMap.get("id"), -1);
        if (a2 == 10001) {
            sb.a(this.f7225a).a(this.b);
        } else if (a2 == 10002) {
            sb.a(this.f7225a).b();
        } else {
            if (a2 != 10004) {
                return;
            }
            sb.a(this.f7225a).a(true);
        }
    }

    public void a(r3 r3Var) {
        this.b = new a(this);
        r3Var.a(this);
    }

    public void b() {
        sb.a(this.f7225a).a();
        this.b = null;
        this.f7225a = null;
    }

    public void c() {
        Context context = this.f7225a;
        if (context != null) {
            try {
                sb.a(context).b();
            } catch (Throwable unused) {
            }
        }
    }
}
