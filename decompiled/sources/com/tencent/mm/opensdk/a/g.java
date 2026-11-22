package com.tencent.mm.opensdk.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Build;
import android.os.SystemClock;
import com.phancy.mini.core.api.ApiError;
import com.tencent.mm.opensdk.a.i;
import com.tencent.mm.opensdk.constants.Build;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.utils.Log;
import com.xmly.businesssdk.network.constant.HttpConst;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g {
    private static volatile boolean ac = true;
    private static volatile com.tencent.mm.opensdk.a.a ad;
    private static volatile String af;
    private static volatile String ag;
    private static volatile int ah;

    /* renamed from: ai, reason: collision with root package name */
    private static volatile String f13607ai;
    private static final Object ae = new Object();
    private static final ThreadLocal<a> aj = new ThreadLocal<>();

    private static final class a {
        String J;
        String Q;
        String appId;
        long aq;
        long ar;
        boolean as;
        String partnerId;
        String prepayId;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    private static long a(a aVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - aVar.ar;
        if (elapsedRealtime >= 0) {
            return elapsedRealtime;
        }
        return 0L;
    }

    private static f a(String str, String str2, String str3, String str4) {
        f fVar = new f();
        fVar.H = "android";
        fVar.I = "opensdk";
        fVar.J = str4;
        fVar.appId = str;
        fVar.prepayId = str3;
        fVar.Q = str2;
        fVar.P = System.currentTimeMillis();
        fVar.K = e();
        fVar.L = f13607ai;
        fVar.M = f();
        fVar.N = g();
        return fVar;
    }

    public static void a(Context context) {
        try {
            a aVar = aj.get();
            if (aVar == null) {
                return;
            }
            if (aVar.prepayId != null && aVar.prepayId.length() > 0) {
                i.a(context, aVar.prepayId, aVar.J, aVar.aq, aVar.partnerId);
            }
            d();
        } catch (Throwable th) {
            Log.w("MicroMsg.SDK.PayReport", "onBeforePayLaunch ex: " + th.getMessage());
        }
    }

    public static void a(Context context, String str, BaseReq baseReq) {
        try {
            if (ac && baseReq != null) {
                int type = baseReq.getType();
                String str2 = type == 5 ? HttpConst.PAY_HEADER_KEY : type == 27 ? "jointpay" : null;
                if (str2 == null) {
                    aj.remove();
                    return;
                }
                b(context);
                a aVar = new a((byte) 0);
                aVar.J = UUID.randomUUID().toString();
                aVar.appId = str;
                aVar.Q = str2;
                aVar.aq = System.currentTimeMillis();
                aVar.ar = SystemClock.elapsedRealtime();
                if (baseReq instanceof PayReq) {
                    PayReq payReq = (PayReq) baseReq;
                    aVar.prepayId = payReq.prepayId;
                    aVar.partnerId = payReq.partnerId;
                }
                aj.set(aVar);
                f b = b(aVar);
                b.R = "pay_start";
                b.S = "start";
                b.T = "start";
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(b);
                b(arrayList, true);
            }
        } catch (Throwable th) {
            Log.w("MicroMsg.SDK.PayReport", "onSendReqEnter ex: " + th.getMessage());
        }
    }

    public static void a(Context context, String str, String str2, String str3, int i, String str4) {
        try {
            if (ac) {
                i.a(context, str3, new h(context, str, str2, str3, i, str4));
            }
        } catch (Throwable th) {
            Log.w("MicroMsg.SDK.PayReport", "onPayResp ex: " + th.getMessage());
        }
    }

    static /* synthetic */ void a(Context context, String str, String str2, String str3, int i, String str4, i.b bVar) {
        String str5;
        long j;
        try {
            b(context);
            String str6 = bVar != null ? bVar.J : null;
            if (bVar != null) {
                str5 = str6;
                j = bVar.aq;
            } else {
                str5 = str6;
                j = 0;
            }
            if (str5 == null || str5.length() <= 0) {
                str5 = UUID.randomUUID().toString();
            }
            f a2 = a(str, str2, str3, str5);
            a2.partnerId = bVar != null ? bVar.partnerId : null;
            a2.R = "pay_resp";
            a2.S = "start";
            a2.T = "start";
            f a3 = a(str, str2, str3, str5);
            a3.partnerId = bVar != null ? bVar.partnerId : null;
            a3.R = "pay_resp";
            a3.S = "resp_received";
            a3.Z = Integer.valueOf(i);
            if (i == 0) {
                a3.T = "success";
                a3.result = "success";
            } else if (i == -2) {
                a3.T = "cancel";
                a3.result = "cancel";
                a3.V = "user_cancel";
            } else {
                a3.T = ApiError.ERROR_MSG_FAIL;
                a3.result = ApiError.ERROR_MSG_FAIL;
                a3.V = "resp_fail";
                a3.U = "callback_rejected";
            }
            if (j > 0) {
                long j2 = a3.P - j;
                if (j2 >= 0) {
                    a3.W = Long.valueOf(j2);
                    a3.X = "e2e";
                }
            }
            if (str4 != null && str4.length() > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("err_str", str4.length() > 128 ? str4.substring(0, 128) : str4);
                a3.ab = jSONObject;
            }
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(a2);
            arrayList.add(a3);
            b(arrayList, false);
            d();
        } catch (Throwable th) {
            Log.w("MicroMsg.SDK.PayReport", "buildAndEmitPayResp ex: " + th.getMessage());
        }
    }

    public static void a(Context context, String str, String str2, String str3, String str4) {
        a(context, str, str2, str3, str4, true);
    }

    private static void a(Context context, String str, String str2, String str3, String str4, boolean z) {
        try {
            ThreadLocal<a> threadLocal = aj;
            a aVar = threadLocal.get();
            if (aVar == null) {
                threadLocal.remove();
                return;
            }
            f b = b(aVar);
            b.R = "pay_launch";
            b.S = str;
            b.T = ApiError.ERROR_MSG_FAIL;
            b.Y = str2;
            b.V = str3;
            b.U = str4;
            b.W = Long.valueOf(a(aVar));
            b.X = "launch";
            a(aVar, b);
            d();
            if (z && aVar.prepayId != null && aVar.prepayId.length() > 0) {
                i.a(context, aVar.prepayId, aVar.J);
            }
            threadLocal.remove();
        } catch (Throwable th) {
            try {
                Log.w("MicroMsg.SDK.PayReport", "onLaunchFail ex: " + th.getMessage());
            } finally {
                aj.remove();
            }
        }
    }

    private static void a(a aVar, f fVar) {
        ArrayList arrayList = new ArrayList(2);
        if (!aVar.as) {
            aVar.as = true;
            f b = b(aVar);
            b.R = "pay_launch";
            b.S = "start";
            b.T = "start";
            arrayList.add(b);
        }
        arrayList.add(fVar);
        b(arrayList, false);
    }

    public static void a(String str, String str2) {
        try {
            ThreadLocal<a> threadLocal = aj;
            a aVar = threadLocal.get();
            if (aVar == null) {
                threadLocal.remove();
                return;
            }
            f b = b(aVar);
            b.R = "pay_launch";
            b.S = str;
            b.T = "success";
            b.Y = str2;
            b.W = Long.valueOf(a(aVar));
            b.X = "launch";
            a(aVar, b);
            d();
            threadLocal.remove();
        } catch (Throwable th) {
            try {
                Log.w("MicroMsg.SDK.PayReport", "onLaunchSuccess ex: " + th.getMessage());
            } finally {
                aj.remove();
            }
        }
    }

    public static void a(String str, String str2, String str3) {
        a((Context) null, str, (String) null, str2, str3, false);
    }

    public static void a(String str, String str2, JSONObject jSONObject) {
        try {
            a aVar = aj.get();
            if (aVar == null) {
                return;
            }
            f b = b(aVar);
            b.R = "pay_launch";
            b.S = str;
            b.T = e(str2);
            if (jSONObject != null) {
                b.ab = jSONObject;
            }
            a(aVar, b);
        } catch (Throwable th) {
            Log.w("MicroMsg.SDK.PayReport", "onStep ex: " + th.getMessage());
        }
    }

    private static f b(a aVar) {
        f fVar = new f();
        fVar.H = "android";
        fVar.I = "opensdk";
        fVar.J = aVar.J;
        fVar.appId = aVar.appId;
        fVar.prepayId = aVar.prepayId;
        fVar.partnerId = aVar.partnerId;
        fVar.Q = aVar.Q;
        fVar.P = System.currentTimeMillis();
        fVar.K = e();
        fVar.L = f13607ai;
        fVar.M = f();
        fVar.N = g();
        return fVar;
    }

    private static void b(Context context) {
        PackageInfo packageInfo;
        if (f13607ai != null || context == null) {
            return;
        }
        String str = "";
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo("com.tencent.mm", 0)) != null && packageInfo.versionName != null) {
                str = packageInfo.versionName;
            }
        } catch (Throwable unused) {
        }
        f13607ai = str;
    }

    private static void b(List<f> list, boolean z) {
        com.tencent.mm.opensdk.a.a c = c();
        if (c == null || list.isEmpty()) {
            return;
        }
        try {
            c.a(list, z);
        } catch (Throwable th) {
            Log.w("MicroMsg.SDK.PayReport", "emit ex: " + th.getMessage());
        }
    }

    private static com.tencent.mm.opensdk.a.a c() {
        com.tencent.mm.opensdk.a.a aVar;
        if (!ac) {
            return null;
        }
        com.tencent.mm.opensdk.a.a aVar2 = ad;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (ae) {
            if (ad == null) {
                ad = new b();
            }
            aVar = ad;
        }
        return aVar;
    }

    public static void clear() {
        aj.remove();
    }

    private static void d() {
        com.tencent.mm.opensdk.a.a c = c();
        if (c == null) {
            return;
        }
        try {
            c.flush();
        } catch (Throwable th) {
            Log.w("MicroMsg.SDK.PayReport", "flush ex: " + th.getMessage());
        }
    }

    public static void d(String str) {
        a(str, "pass", (JSONObject) null);
    }

    private static String e() {
        String str = af;
        if (str != null) {
            return str;
        }
        af = Build.SDK_VERSION_NAME;
        return Build.SDK_VERSION_NAME;
    }

    private static String e(String str) {
        return ApiError.ERROR_MSG_FAIL.equals(str) ? ApiError.ERROR_MSG_FAIL : "degrade".equals(str) ? "degrade" : ParameterNames.INFO;
    }

    private static String f() {
        String str = ag;
        if (str == null) {
            try {
                str = Build.VERSION.RELEASE;
            } catch (Throwable unused) {
                str = "";
            }
            ag = str;
        }
        return str;
    }

    private static int g() {
        int i = ah;
        if (i == 0) {
            try {
                i = Build.VERSION.SDK_INT;
            } catch (Throwable unused) {
                i = -1;
            }
            ah = i;
        }
        return i;
    }
}
