package com.qumeng.overseas.advlib.__remote__.framework.config;

import android.content.Context;
import android.text.TextUtils;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.e;
import com.qumeng.overseas.advlib.__remote__.framework.config.bean.BlockFeature;
import com.qumeng.overseas.advlib.__remote__.framework.config.bean.CachePoolConfig;
import com.qumeng.overseas.advlib.__remote__.ui.incite.HttpLite;
import com.qumeng.overseas.advlib.__remote__.utils.j;
import com.qumeng.overseas.advlib.__remote__.utils.l;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import com.qumeng.overseas.advlib.trdparty.unionset.network.InciteLandingEntity;
import com.qumeng.overseas.advlib.trdparty.unionset.network.InteractionConfigEntity;
import com.qumeng.overseas.advlib.trdparty.unionset.network.ScanAdBlockerDetection;
import com.qumeng.overseas.advlib.trdparty.unionset.network.SdkDelayConfigEntity;
import com.qumeng.overseas.advlib.trdparty.unionset.network.SwipeEntity;
import com.qumeng.overseas.advlib.trdparty.unionset.network.TwistEntity;
import com.qumeng.overseas.advlib.trdparty.unionset.network.XmlViewControlEntity;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class a {
    public static final String c = "https://mtlcfg.adseye.com/v1/getConfig";
    public static final String d = "http://mtlcfg.adseye.com/v1/getFlags";
    public static final String e;
    private static volatile a f = null;
    private static int g = 0;
    private static final String h = "MtlConfigManager";

    /* renamed from: a, reason: collision with root package name */
    private MtlConfigEntity f12926a;
    private volatile List<Integer> b = new ArrayList();

    /* renamed from: com.qumeng.overseas.advlib.__remote__.framework.config.a$a, reason: collision with other inner class name */
    class C0797a extends HttpLite.HttpCallback<String> {

        /* renamed from: com.qumeng.overseas.advlib.__remote__.framework.config.a$a$a, reason: collision with other inner class name */
        class RunnableC0798a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f12928a;

            RunnableC0798a(String str) {
                this.f12928a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                JSONObject optJSONObject;
                JSONObject optJSONObject2;
                JSONObject optJSONObject3;
                if (TextUtils.isEmpty(this.f12928a)) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(this.f12928a);
                    if (jSONObject.optInt("code") == 0) {
                        if (a.e.equals(a.c)) {
                            String optString = jSONObject.optString("data");
                            optJSONObject = !TextUtils.isEmpty(optString) ? new JSONObject(com.qumeng.overseas.advlib.__remote__.core.proto.utils.a.a(com.qumeng.overseas.advlib.__remote__.core.proto.utils.a.b(com.qumeng.overseas.advlib.__remote__.core.proto.utils.a.d), URLDecoder.decode(optString))) : null;
                        } else {
                            optJSONObject = jSONObject.optJSONObject("data");
                        }
                        if (optJSONObject != null) {
                            JSONObject optJSONObject4 = optJSONObject.optJSONObject("location");
                            if (optJSONObject4 != null && (optJSONObject3 = optJSONObject4.optJSONObject("country")) != null) {
                                a.b(optJSONObject3.optInt("id"));
                            }
                            JSONObject optJSONObject5 = optJSONObject.optJSONObject("features");
                            if (optJSONObject5 == null || (optJSONObject2 = optJSONObject5.optJSONObject("qumeng_overseas_config")) == null) {
                                return;
                            }
                            JSONObject optJSONObject6 = optJSONObject2.optJSONObject("config");
                            if (optJSONObject6 != null) {
                                JSONObject optJSONObject7 = optJSONObject6.optJSONObject("common");
                                if (optJSONObject2.has("config_md5")) {
                                    String optString2 = optJSONObject2.optString("config_md5");
                                    if (!TextUtils.isEmpty(optString2) && optJSONObject7 != null) {
                                        optJSONObject7.put("config_md5", optString2);
                                    }
                                }
                                JSONObject a2 = a.a(optJSONObject7, optJSONObject6.optJSONObject(e.a().getPackageName()));
                                a.this.a(a2);
                                if (a2 != null) {
                                    a.this.f12926a = (MtlConfigEntity) l.a(a2, MtlConfigEntity.class);
                                    oqme.a.c(oqme.a.p, a2.toString());
                                }
                            }
                            JSONArray optJSONArray = optJSONObject2.optJSONArray("use_exp_ids");
                            if (optJSONArray == null || optJSONArray.length() <= 0) {
                                return;
                            }
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                try {
                                    a.this.b.add(Integer.valueOf(optJSONArray.optInt(i)));
                                } catch (Throwable unused) {
                                }
                            }
                            oqme.a.a(oqme.a.f18748q, a.this.b);
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        C0797a() {
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.incite.HttpLite.HttpCallback
        public void onFail(Exception exc) {
            super.onFail(exc);
            a.this.B();
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.incite.HttpLite.HttpCallback
        public void onSuccess(String str) {
            j.b().post(new RunnableC0798a(str));
        }
    }

    static {
        e = com.qumeng.overseas.advlib.__remote__.core.coreutils.a.f12826a ? d : c;
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        try {
            if (this.f12926a != null) {
                return;
            }
            String b = oqme.a.b(oqme.a.p, "");
            if (TextUtils.isEmpty(b)) {
                return;
            }
            this.f12926a = (MtlConfigEntity) l.a(new JSONObject(b), MtlConfigEntity.class);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static int e() {
        if (g == 0) {
            g = oqme.a.b(oqme.a.P);
            n.a(h, "getCountryId:" + g, new Object[0]);
        }
        return g;
    }

    private MtlConfigEntity g() {
        if (this.f12926a == null) {
            B();
        }
        return this.f12926a;
    }

    public static a k() {
        if (f == null) {
            synchronized (a.class) {
                if (f == null) {
                    f = new a();
                }
            }
        }
        return f;
    }

    public boolean A() {
        MtlConfigEntity g2 = g();
        return g2 != null && g2.getAntiFraudReportSwitch() == 1;
    }

    public boolean C() {
        int antiFraudReportRate;
        MtlConfigEntity g2 = g();
        if (g2 != null && (antiFraudReportRate = g2.getAntiFraudReportRate()) > 0) {
            return antiFraudReportRate >= 100 || new Random().nextInt(100) < antiFraudReportRate;
        }
        return false;
    }

    public CachePoolConfig c() {
        MtlConfigEntity g2 = g();
        if (g2 == null || g2.getCachePool() == null || g2.getCachePool().enable == 0) {
            return null;
        }
        return g2.getCachePool();
    }

    public String d() {
        MtlConfigEntity g2 = g();
        if (g2 == null) {
            return null;
        }
        return g2.getConfigMd5();
    }

    public List<Integer> f() {
        return this.f12926a == null ? (List) oqme.a.d(oqme.a.f18748q) : this.b;
    }

    public boolean h() {
        int switchErrorNotice;
        MtlConfigEntity g2 = g();
        return g2 != null && (switchErrorNotice = g2.getSwitchErrorNotice()) > 0 && new Random().nextInt(1000 / switchErrorNotice) == 0;
    }

    public InciteLandingEntity i() {
        MtlConfigEntity g2 = g();
        if (g2 == null) {
            return null;
        }
        return g2.getInciteLandingEntity();
    }

    public String j() {
        MtlConfigEntity g2 = g();
        if (g2 == null) {
            return null;
        }
        return g2.getInciteVideoChangeSlotid();
    }

    public InteractionConfigEntity l() {
        MtlConfigEntity g2 = g();
        if (g2 == null) {
            return null;
        }
        return g2.getInteractionConfigEntity();
    }

    public int m() {
        MtlConfigEntity g2 = g();
        if (g2 == null || g2.prePlayAdSkipBtnShowtime <= 0) {
            return 5;
        }
        return g2.getPrePlayAdSkipBtnShowtime();
    }

    public int n() {
        MtlConfigEntity g2 = g();
        if (g2 == null || g2.residualCacheTime <= 0) {
            return 10;
        }
        return g2.getResidualCacheTime();
    }

    public ScanAdBlockerDetection o() {
        MtlConfigEntity g2 = g();
        if (g2 == null) {
            return null;
        }
        return g2.getScanAdBlockerDetection();
    }

    public SdkDelayConfigEntity p() {
        MtlConfigEntity g2 = g();
        if (g2 == null) {
            return null;
        }
        return g2.getSdkDelayInitConfig();
    }

    public int q() {
        MtlConfigEntity g2 = g();
        if (g2 == null || g2.sdkDelayInitTime <= 0) {
            return 0;
        }
        return g2.getSdkDelayInitTime();
    }

    public int r() {
        MtlConfigEntity g2 = g();
        if (g2 == null || g2.sdkInitFailedForbidRequest <= 0) {
            return 0;
        }
        return g2.getSdkInitFailedForbidRequest();
    }

    public int s() {
        MtlConfigEntity g2 = g();
        if (g2 == null || g2.splashCountdownTime <= 0) {
            return 5;
        }
        return g2.getSplashCountdownTime();
    }

    public SwipeEntity t() {
        MtlConfigEntity g2 = g();
        if (g2 == null) {
            return null;
        }
        return g2.getSwipe();
    }

    public int u() {
        MtlConfigEntity g2 = g();
        if (g2 == null) {
            return 0;
        }
        return g2.getSwitchCrashDefaultMonitor();
    }

    public boolean v() {
        MtlConfigEntity g2 = g();
        return g2 == null || g2.getSwitchReqReport() != 1;
    }

    public int w() {
        MtlConfigEntity g2 = g();
        if (g2 == null || g2.totalCacheTime <= 0) {
            return 50;
        }
        return g2.getTotalCacheTime();
    }

    public TwistEntity x() {
        MtlConfigEntity g2 = g();
        if (g2 == null) {
            return null;
        }
        return g2.getTwist();
    }

    public boolean y() {
        int switchWinLossNotice;
        MtlConfigEntity g2 = g();
        return g2 != null && (switchWinLossNotice = g2.getSwitchWinLossNotice()) > 0 && new Random().nextInt(1000 / switchWinLossNotice) == 0;
    }

    public XmlViewControlEntity z() {
        MtlConfigEntity g2 = g();
        if (g2 == null) {
            return null;
        }
        return g2.getXmlViewControlEntity();
    }

    public BlockFeature b() {
        MtlConfigEntity g2 = g();
        BlockFeature blockFeature = g2 != null ? g2.getBlockFeature() : null;
        if (blockFeature == null) {
            blockFeature = new BlockFeature();
        }
        if (blockFeature.enable == 1) {
            return blockFeature;
        }
        return null;
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject2.opt(next);
                try {
                    if ((opt instanceof JSONObject) && jSONObject.has(next)) {
                        jSONObject.putOpt(next, a(jSONObject.optJSONObject(next), (JSONObject) opt));
                    } else {
                        jSONObject.putOpt(next, opt);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        } else if (jSONObject2 != null) {
            return jSONObject2;
        }
        return jSONObject;
    }

    public void b(Context context) {
        a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i) {
        g = i;
        oqme.a.a(oqme.a.P, i);
        n.a(h, "updateCountryId:" + g, new Object[0]);
    }

    public int a() {
        MtlConfigEntity g2 = g();
        if (g2 == null) {
            return 0;
        }
        return g2.getBannerRefreshTime();
    }

    public void a(Context context) {
        HttpLite.a().a(e, b.a(context, "qumeng_overseas_config"), new C0797a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        try {
            a(jSONObject, "cache_pool", "adslots");
        } catch (Throwable unused) {
        }
    }

    private void a(JSONObject jSONObject, String str, String str2) {
        try {
            if (jSONObject.has(str)) {
                JSONObject optJSONObject = jSONObject.optJSONObject(str);
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(str2);
                Iterator<String> keys = optJSONObject2.keys();
                while (keys.hasNext()) {
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject(keys.next());
                    Iterator<String> keys2 = optJSONObject.keys();
                    while (keys2.hasNext()) {
                        String next = keys2.next();
                        if (!optJSONObject3.has(next) && !next.equals(str2)) {
                            optJSONObject3.put(next, optJSONObject.opt(next));
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
