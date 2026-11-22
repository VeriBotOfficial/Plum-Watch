package com.anythink.core.common.j;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATGDPRAuthCallback;
import com.anythink.core.api.ATGDPRConsentDismissListener;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.NetTrafficeCallback;
import com.anythink.core.common.d.t;
import com.anythink.core.common.d.v;
import com.anythink.core.common.j.d;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class a {
    private static final String i = "anythink_ump";
    private static volatile a j;
    private Map<Integer, c> k;
    private Map<Integer, c> l;

    /* renamed from: q, reason: collision with root package name */
    private List<Integer> f3944q;

    /* renamed from: a, reason: collision with root package name */
    final int f3943a = -1;
    final int b = 100;
    final int c = 101;
    final int d = 102;
    final int e = 103;
    final int f = 104;
    final int g = 105;
    final int h = 106;
    private String n = "";
    private String o = "";
    private String p = "";
    private boolean m = false;

    public static a a() {
        if (j == null) {
            synchronized (a.class) {
                if (j == null) {
                    j = new a();
                }
            }
        }
        return j;
    }

    private a() {
        HashMap hashMap = new HashMap();
        this.k = hashMap;
        hashMap.put(2, new c(2, 755, 1));
        this.k.put(33, new c(33, 755, 1));
        this.k.put(6, new c(6, 867, 1));
        this.k.put(3, new c(3, 333, 1));
        this.k.put(37, new c(37, 262, 1));
        this.k.put(13, new c(13, 667, 1));
        this.k.put(36, new c(36, 31, 1));
        this.k.put(58, new c(58, 512, 1));
        this.k.put(75, new c(75, 793, 1));
        this.k.put(1, new c(1, 89, 2));
        this.k.put(12, new c(12, 3234, 2));
        this.k.put(5, new c(5, 1301, 2));
        this.k.put(9, new c(9, 2898, 2));
        this.k.put(11, new c(11, 2878, 2));
        this.k.put(23, new c(23, 1782, 2));
        this.k.put(59, new c(59, 16831, 2));
        this.k.put(45, new c(45, 3183, 2));
        this.k.put(14, new c(14, 2710, 2));
        this.k.put(10, new c(10, 1985, 2));
        this.k.put(25, new c(25, 2312, 2));
        this.l = new HashMap();
        this.f3944q = new ArrayList();
    }

    public final void a(final Activity activity, final ATGDPRConsentDismissListener aTGDPRConsentDismissListener) {
        boolean z;
        t.b();
        if (activity == null) {
            if (t.b().F()) {
                b("showGDPRConsentDialog fail:activity is null!");
            }
            a(aTGDPRConsentDismissListener, "activity is null!", -1);
            return;
        }
        final Context applicationContext = activity.getApplicationContext();
        try {
            d.a(applicationContext);
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        final boolean z2 = z;
        if (t.b().F()) {
            b("Has UMP SDK:".concat(String.valueOf(z2)));
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.j.a.1
            @Override // java.lang.Runnable
            public final void run() {
                if (!TextUtils.isEmpty(b.a(applicationContext).b())) {
                    if (z2) {
                        d.a(applicationContext).a(activity, new d.a() { // from class: com.anythink.core.common.j.a.1.1
                            @Override // com.anythink.core.common.j.d.a
                            public final void a(boolean z3) {
                                a.b("(UMP Update)UMP onConsentSuccess isRealTimeDialogDismiss:".concat(String.valueOf(z3)));
                            }

                            @Override // com.anythink.core.common.j.d.a
                            public final void a(String str) {
                                a.b("(UMP Update)UMP onConsentFail:".concat(String.valueOf(str)));
                            }
                        });
                    }
                    a.this.a(aTGDPRConsentDismissListener, "", 101);
                } else {
                    if (z2) {
                        d.a(applicationContext).a(activity, new d.a() { // from class: com.anythink.core.common.j.a.1.2
                            @Override // com.anythink.core.common.j.d.a
                            public final void a(boolean z3) {
                                if (t.b().F()) {
                                    a.b("UMP onConsentSuccess isRealTimeDialogDismiss:".concat(String.valueOf(z3)));
                                }
                                if (z3) {
                                    a.c(applicationContext);
                                }
                                a.this.a(aTGDPRConsentDismissListener, "", z3 ? 105 : 103);
                            }

                            @Override // com.anythink.core.common.j.d.a
                            public final void a(String str) {
                                if (t.b().F()) {
                                    a.b("UMP onConsentFail:".concat(String.valueOf(str)));
                                }
                                if (d.a(applicationContext).a()) {
                                    a.b("UMP canRequestAd:true after onConsentFail");
                                    a.this.a(aTGDPRConsentDismissListener, "", 106);
                                } else {
                                    a.this.a(applicationContext, aTGDPRConsentDismissListener);
                                }
                            }
                        });
                        if (d.a(applicationContext).a()) {
                            a.b("UMP canRequestAd:true");
                            a.this.a(aTGDPRConsentDismissListener, "", 104);
                            return;
                        }
                        return;
                    }
                    a.this.a(applicationContext, aTGDPRConsentDismissListener);
                }
            }
        }, 2);
    }

    protected final void a(final Context context, final ATGDPRConsentDismissListener aTGDPRConsentDismissListener) {
        if (v.a(context).a() != 2) {
            a(aTGDPRConsentDismissListener, "", 101);
        } else {
            ATSDK.checkIsEuTraffic(context, new NetTrafficeCallback() { // from class: com.anythink.core.common.j.a.2
                @Override // com.anythink.core.api.NetTrafficeCallback
                public final void onResultCallback(boolean z) {
                    if (!z) {
                        a.this.a(aTGDPRConsentDismissListener, "", 102);
                    } else {
                        v.a(context).a(context, new ATGDPRAuthCallback() { // from class: com.anythink.core.common.j.a.2.1
                            @Override // com.anythink.core.api.ATGDPRAuthCallback
                            public final void onAuthResult(int i2) {
                                a.this.a(aTGDPRConsentDismissListener, "", 100);
                            }

                            @Override // com.anythink.core.api.ATGDPRAuthCallback
                            public final void onPageLoadFail() {
                                a.this.a(aTGDPRConsentDismissListener, "showUploadDataNotifyDialog onPageLoadFail", -1);
                            }
                        });
                    }
                }

                @Override // com.anythink.core.api.NetTrafficeCallback
                public final void onErrorCallback(String str) {
                    a.this.a(aTGDPRConsentDismissListener, str, -1);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final ATGDPRConsentDismissListener aTGDPRConsentDismissListener, final String str, final int i2) {
        t.b().b(new Runnable() { // from class: com.anythink.core.common.j.a.3
            @Override // java.lang.Runnable
            public final void run() {
                if (aTGDPRConsentDismissListener == null || a.this.f3944q.contains(Integer.valueOf(aTGDPRConsentDismissListener.hashCode()))) {
                    return;
                }
                a.this.f3944q.add(Integer.valueOf(aTGDPRConsentDismissListener.hashCode()));
                aTGDPRConsentDismissListener.onDismiss(new ATGDPRConsentDismissListener.ConsentDismissInfo(str, i2));
            }
        });
    }

    public final synchronized void a(Context context) {
        boolean a2;
        if (TextUtils.isEmpty(this.n)) {
            this.n = b.a(context).b();
            this.p = b.a(context).d();
            this.o = b.a(context).c();
        }
        b("IABTCF_TCString:" + this.n);
        b("IABTCF_VendorConsents:" + this.p);
        b("IABTCF_AddtlConsent:" + this.o);
        if (TextUtils.isEmpty(this.n)) {
            this.m = true;
            return;
        }
        this.m = false;
        this.l.clear();
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(this.o)) {
            try {
                String[] split = this.o.split(Constants.WAVE_SEPARATOR);
                if (split.length >= 2) {
                    for (String str : split[1].split("\\.")) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        for (Map.Entry<Integer, c> entry : this.k.entrySet()) {
            Integer key = entry.getKey();
            c value = entry.getValue();
            int c = value.c();
            if (c == 1) {
                a2 = a(this.p, value.b());
            } else if (c != 2) {
                this.l.put(key, value);
                b("initNetworkConsentMap " + value.a() + ":" + value.d());
            } else {
                a2 = arrayList.size() == 0 ? false : arrayList.contains(Integer.valueOf(value.b()));
            }
            value.a(a2);
            this.l.put(key, value);
            b("initNetworkConsentMap " + value.a() + ":" + value.d());
        }
        c(context);
        b("initNetworkConsentMap others:" + (v.a(context).a() == 0));
        this.m = true;
    }

    public final synchronized boolean b() {
        return this.m;
    }

    public final synchronized boolean a(Context context, int i2) {
        c cVar;
        if (this.l.size() > 0 && (cVar = this.l.get(Integer.valueOf(i2))) != null) {
            return cVar.d();
        }
        return v.a(context).c();
    }

    private static boolean a(String str, int i2) {
        if (!TextUtils.isEmpty(str) && i2 > 0) {
            try {
                if (str.length() >= i2) {
                    if (str.charAt(i2 - 1) == '1') {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static boolean a(List<Integer> list, int i2) {
        if (list.size() == 0) {
            return false;
        }
        return list.contains(Integer.valueOf(i2));
    }

    public final String c() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context) {
        String a2 = b.a(context).a();
        if (!TextUtils.isEmpty(a2) && !a2.contains("1")) {
            v.a(context).a(1);
        } else {
            v.a(context).a(0);
        }
    }

    public final synchronized JSONObject a(JSONObject jSONObject) {
        if (!b() && TextUtils.isEmpty(this.n)) {
            this.n = b.a(t.b().g()).b();
            this.p = b.a(t.b().g()).d();
            this.o = b.a(t.b().g()).c();
        }
        try {
            if (!TextUtils.isEmpty(this.n)) {
                jSONObject.put("tc_string", this.n);
            }
            if (!TextUtils.isEmpty(this.o)) {
                jSONObject.put("addtl_consent", this.o);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str) {
        if (ATSDK.isNetworkLogDebug()) {
            Log.d(i, str);
        }
    }
}
