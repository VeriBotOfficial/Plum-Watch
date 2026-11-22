package com.alipay.sdk.m.a0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.sdk.m.a0.a;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public class b {

    public class a implements a.InterfaceC0077a<Object, Boolean> {
        @Override // com.alipay.sdk.m.a0.a.InterfaceC0077a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    /* renamed from: com.alipay.sdk.m.a0.b$b, reason: collision with other inner class name */
    public class CallableC0078b implements Callable<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f1328a;

        public CallableC0078b(Context context) {
            this.f1328a = context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            return com.alipay.sdk.m.c.c.a(this.f1328a);
        }
    }

    public class c implements a.InterfaceC0077a<Object, Boolean> {
        @Override // com.alipay.sdk.m.a0.a.InterfaceC0077a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof NetworkInfo) || obj == null);
        }
    }

    public class d implements Callable<NetworkInfo> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f1329a;

        public d(Context context) {
            this.f1329a = context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NetworkInfo call() {
            return ((ConnectivityManager) this.f1329a.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        }
    }

    public class e implements a.InterfaceC0077a<Object, Boolean> {
        @Override // com.alipay.sdk.m.a0.a.InterfaceC0077a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    public class f implements Callable<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f1330a;
        public final /* synthetic */ com.alipay.sdk.m.w.a b;

        public f(Context context, com.alipay.sdk.m.w.a aVar) {
            this.f1330a = context;
            this.b = aVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            try {
                return com.alipay.sdk.m.s0.a.c(this.f1330a);
            } catch (Throwable th) {
                com.alipay.sdk.m.m.a.b(this.b, com.alipay.sdk.m.m.b.o, com.alipay.sdk.m.m.b.u, th.getClass().getName());
                return "";
            }
        }
    }

    public class g implements a.InterfaceC0077a<Object, Boolean> {
        @Override // com.alipay.sdk.m.a0.a.InterfaceC0077a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    public class h implements Callable<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1331a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ com.alipay.sdk.m.w.a d;

        public class a implements APSecuritySdk.InitResultListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f1332a;
            public final /* synthetic */ ConditionVariable b;

            public a(String[] strArr, ConditionVariable conditionVariable) {
                this.f1332a = strArr;
                this.b = conditionVariable;
            }

            @Override // com.alipay.apmobilesecuritysdk.face.APSecuritySdk.InitResultListener
            public void onResult(APSecuritySdk.TokenResult tokenResult) {
                if (tokenResult != null) {
                    this.f1332a[0] = tokenResult.apdidToken;
                }
                this.b.open();
            }
        }

        public h(String str, String str2, Context context, com.alipay.sdk.m.w.a aVar) {
            this.f1331a = str;
            this.b = str2;
            this.c = context;
            this.d = aVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            HashMap hashMap = new HashMap();
            hashMap.put("tid", this.f1331a);
            hashMap.put(com.alipay.sdk.m.n.b.g, this.b);
            String[] strArr = {""};
            try {
                APSecuritySdk aPSecuritySdk = APSecuritySdk.getInstance(this.c);
                ConditionVariable conditionVariable = new ConditionVariable();
                aPSecuritySdk.initToken(0, hashMap, new a(strArr, conditionVariable));
                conditionVariable.block(3000L);
            } catch (Throwable th) {
                com.alipay.sdk.m.y.g.a(th);
                com.alipay.sdk.m.m.a.b(this.d, com.alipay.sdk.m.m.b.o, com.alipay.sdk.m.m.b.r, th.getClass().getName());
            }
            if (TextUtils.isEmpty(strArr[0])) {
                com.alipay.sdk.m.m.a.b(this.d, com.alipay.sdk.m.m.b.o, com.alipay.sdk.m.m.b.s, "missing token");
            }
            return strArr[0];
        }
    }

    public static NetworkInfo a(com.alipay.sdk.m.w.a aVar, Context context) {
        Context a2 = com.alipay.sdk.m.a0.a.a(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (NetworkInfo) com.alipay.sdk.m.a0.a.a(2, 10L, timeUnit, new c(), new d(a2), false, 10L, timeUnit, aVar, false);
    }

    public static String b(com.alipay.sdk.m.w.a aVar, Context context) {
        if (!com.alipay.sdk.m.o.b.i().B()) {
            return "";
        }
        return (String) com.alipay.sdk.m.a0.a.a(1, 1L, TimeUnit.DAYS, new a(), new CallableC0078b(com.alipay.sdk.m.a0.a.a(context)), true, 200L, TimeUnit.MILLISECONDS, aVar, true);
    }

    public static String c(com.alipay.sdk.m.w.a aVar, Context context) {
        return (String) com.alipay.sdk.m.a0.a.a(3, 1L, TimeUnit.DAYS, new e(), new f(com.alipay.sdk.m.a0.a.a(context), aVar), true, 3L, TimeUnit.SECONDS, aVar, false);
    }

    public static String a(com.alipay.sdk.m.w.a aVar, Context context, String str, String str2) {
        Context a2 = com.alipay.sdk.m.a0.a.a(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (String) com.alipay.sdk.m.a0.a.a(4, 10L, timeUnit, new g(), new h(str, str2, a2, aVar), true, 3L, timeUnit, aVar, true);
    }
}
