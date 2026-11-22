package com.qumeng.overseas.advlib.trdparty.unionset.network;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.qumeng.overseas.advlib.__remote__.ui.incite.HttpLite;
import com.qumeng.overseas.advlib.__remote__.utils.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes17.dex */
public class c {
    public static final String A = "admost";
    public static final String B = "12952";
    public static final String C = "10001";
    private static final int D = 0;
    private static final int E = 2;
    private static final int F = 3;
    public static final int l = 2000;
    public static final int m = 60000;
    public static final int n = 60000;
    public static final String o = "adx";
    private static final String p = "BiddingConfig";

    /* renamed from: q, reason: collision with root package name */
    private static final String f13407q = "http://mtlcfg.adseye.com/v1/getFlags";
    private static final String r = "https://mtlcfg.adseye.com/v1/getConfig";
    public static final String s;
    private static volatile c t = null;
    public static final String u = "admob";
    public static final String v = "pangle";
    public static final String w = "applovin";
    public static final String x = "topon";
    public static final String y = "meta";
    public static final String z = "tradplus";

    /* renamed from: a, reason: collision with root package name */
    private BiddingConfigEntity f13408a;
    private BiddingConfigEntity b;
    private String c;
    private volatile String d;
    private long f;
    private volatile List<Integer> e = new ArrayList();
    private final Map<String, Long> g = new HashMap();
    private volatile int h = 0;
    private volatile int i = 0;
    private volatile boolean j = false;
    private final List<d> k = new ArrayList();

    class a extends HttpLite.HttpCallback<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13409a;

        /* renamed from: com.qumeng.overseas.advlib.trdparty.unionset.network.c$a$a, reason: collision with other inner class name */
        class RunnableC0876a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f13410a;

            RunnableC0876a(String str) {
                this.f13410a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                c.this.d(this.f13410a, aVar.f13409a);
            }
        }

        a(String str) {
            this.f13409a = str;
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.incite.HttpLite.HttpCallback
        public void onFail(Exception exc) {
            super.onFail(exc);
            c.this.b(3);
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.incite.HttpLite.HttpCallback
        public void onSuccess(String str) {
            com.qumeng.overseas.advlib.__remote__.utils.j.b().post(new RunnableC0876a(str));
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.qumeng.overseas.advlib.trdparty.unionset.network.biddingconfig.c.b().a(c.this.b);
        }
    }

    /* renamed from: com.qumeng.overseas.advlib.trdparty.unionset.network.c$c, reason: collision with other inner class name */
    class RunnableC0877c implements Runnable {
        RunnableC0877c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.l();
        }
    }

    public interface d {
        void onConfigLoaded();
    }

    static {
        s = com.qumeng.overseas.advlib.__remote__.core.coreutils.a.f12826a ? "http://mtlcfg.adseye.com/v1/getFlags" : "https://mtlcfg.adseye.com/v1/getConfig";
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0131 A[Catch: all -> 0x015a, LOOP:1: B:64:0x0129->B:67:0x0131, LOOP_END, TRY_ENTER, TryCatch #0 {all -> 0x015a, blocks: (B:56:0x0100, B:57:0x010c, B:59:0x0114, B:61:0x011d, B:63:0x0123, B:64:0x0129, B:67:0x0131, B:69:0x013f, B:71:0x0149, B:72:0x0152), top: B:55:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0149 A[Catch: all -> 0x015a, TryCatch #0 {all -> 0x015a, blocks: (B:56:0x0100, B:57:0x010c, B:59:0x0114, B:61:0x011d, B:63:0x0123, B:64:0x0129, B:67:0x0131, B:69:0x013f, B:71:0x0149, B:72:0x0152), top: B:55:0x0100 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qumeng.overseas.advlib.trdparty.unionset.network.c.d(java.lang.String, java.lang.String):void");
    }

    public static SlotIDConfigEntity e(String str) {
        return com.qumeng.overseas.advlib.trdparty.unionset.network.biddingconfig.e.b().a(str);
    }

    public static c f() {
        if (t == null) {
            synchronized (c.class) {
                if (t == null) {
                    t = new c();
                }
            }
        }
        return t;
    }

    private BiddingConfigEntity j(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (BiddingConfigEntity) com.qumeng.overseas.advlib.__remote__.utils.l.a(str, BiddingConfigEntity.class);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f13408a == null) {
            a(com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a());
            if (this.b == null) {
                if (this.c == null) {
                    this.c = oqme.a.b(oqme.a.l, "");
                }
                BiddingConfigEntity j = j(this.c);
                this.b = j;
                if (j != null) {
                    a(2);
                } else {
                    a(3);
                }
                com.qumeng.overseas.advlib.__remote__.utils.j.b().post(new b());
            }
        }
    }

    private void n() {
        ArrayList<d> arrayList;
        synchronized (this) {
            if (this.j) {
                return;
            }
            this.j = true;
            if (this.k.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(this.k);
                this.k.clear();
            }
            if (arrayList != null) {
                for (d dVar : arrayList) {
                    if (dVar != null) {
                        try {
                            dVar.onConfigLoaded();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    public boolean c(String str, String str2) {
        BiddingConfigEntity c = c();
        if (c == null) {
            return true;
        }
        SlotIDConfigEntity e = e(str);
        return c.getDspSwitch() != null && c.getDspSwitch().contains(str2) && e != null && e.getDspSwitch() != null && e.getDspSwitch().contains(str2) && a(str, e, str2);
    }

    public int g(String str) {
        SlotIDConfigEntity e = e(str);
        if (e != null) {
            return e.getTotalCacheTime();
        }
        return 0;
    }

    public boolean h(String str) {
        SlotIDConfigEntity e = e(str);
        if (e == null) {
            return false;
        }
        for (SlotIDItemConfigEntity slotIDItemConfigEntity : e.getDspData()) {
            if (slotIDItemConfigEntity.getDspName().equals(o) && slotIDItemConfigEntity.getIsOn() == 1) {
                return true;
            }
        }
        return false;
    }

    public SwipeEntity i() {
        BiddingConfigEntity c = c();
        if (c == null) {
            return null;
        }
        return c.getSwipeEntity();
    }

    public boolean k() {
        if (this.j || this.h == 2 || this.i == 2) {
            return true;
        }
        return this.h == 3 && this.i == 3;
    }

    public void m() {
        u.a().a(new RunnableC0877c());
    }

    public static void e(String str, String str2) {
        int intValue;
        Map map = (Map) oqme.a.d(oqme.a.W + str + str2);
        if (map == null) {
            map = new HashMap();
        }
        if (map.containsKey(str2)) {
            try {
                intValue = ((Integer) map.get(str2)).intValue();
            } catch (Throwable unused) {
            }
            com.qumeng.overseas.advlib.__remote__.utils.n.c(p, "click_channel_limit点击了当前点击数" + intValue, new Object[0]);
            map.put(str2, Integer.valueOf(intValue + 1));
            oqme.a.a(oqme.a.W + str + str2, map);
        }
        intValue = 0;
        com.qumeng.overseas.advlib.__remote__.utils.n.c(p, "click_channel_limit点击了当前点击数" + intValue, new Object[0]);
        map.put(str2, Integer.valueOf(intValue + 1));
        oqme.a.a(oqme.a.W + str + str2, map);
    }

    public boolean b(String str, String str2) {
        SlotIDConfigEntity e = e(str);
        if (e != null) {
            return a(e, str2);
        }
        return false;
    }

    public boolean i(String str) {
        if (TextUtils.isEmpty(str)) {
            com.qumeng.overseas.advlib.__remote__.utils.n.a(p, "inDspRequestCD: dspSlotID is empty", new Object[0]);
            return false;
        }
        Long l2 = this.g.get(str);
        if (l2 == null) {
            com.qumeng.overseas.advlib.__remote__.utils.n.a(p, "inDspRequestCD: no cd record for dspSlotID=" + str, new Object[0]);
            return false;
        }
        if (SystemClock.elapsedRealtime() < l2.longValue()) {
            com.qumeng.overseas.advlib.__remote__.utils.n.a(p, "inDspRequestCD: dspSlotID=" + str + " is in cd until " + l2, new Object[0]);
            return true;
        }
        com.qumeng.overseas.advlib.__remote__.utils.n.a(p, "inDspRequestCD: dspSlotID=" + str + " cd expired at " + l2, new Object[0]);
        this.g.remove(str);
        return false;
    }

    private void a(Context context) {
        if (SystemClock.elapsedRealtime() - this.f < 300000) {
            return;
        }
        this.f = SystemClock.elapsedRealtime();
        String str = context.getPackageName().replace(".", "_") + "_bidding";
        com.qumeng.overseas.advlib.__remote__.utils.n.c(p, "configName:" + str, new Object[0]);
        HttpLite.a().a(s, com.qumeng.overseas.advlib.__remote__.framework.config.b.a(context, str), new a(str));
    }

    public String g() {
        BiddingConfigEntity c = c();
        return c == null ? "" : c.getMediaID();
    }

    public String b() {
        BiddingConfigEntity c = c();
        if (c == null) {
            return null;
        }
        return c.getConfigMd5();
    }

    public BiddingConfigEntity h() {
        BiddingConfigEntity biddingConfigEntity = this.f13408a;
        if (biddingConfigEntity != null) {
            return biddingConfigEntity;
        }
        BiddingConfigEntity biddingConfigEntity2 = this.b;
        if (biddingConfigEntity2 != null) {
            return biddingConfigEntity2;
        }
        return null;
    }

    public TwistEntity j() {
        BiddingConfigEntity c = c();
        if (c == null) {
            return null;
        }
        return c.getTwistEntity();
    }

    public boolean b(String str) {
        SlotIDConfigEntity e = e(str);
        return e != null && e.getCacheEnable() == 1;
    }

    public int c(String str) {
        SlotIDConfigEntity e = e(str);
        if (e != null) {
            return Math.min(e.getDelayedTimeMillis(), 2000);
        }
        return 0;
    }

    public long f(String str) {
        if (e(str) != null) {
            return r3.getDspTimeout();
        }
        return 2000L;
    }

    public void b(d dVar) {
        if (dVar == null) {
            return;
        }
        synchronized (this) {
            this.k.remove(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        this.i = i;
        a();
    }

    public BiddingConfigEntity c() {
        return com.qumeng.overseas.advlib.trdparty.unionset.network.biddingconfig.e.b().a();
    }

    public String e() {
        if (this.d == null) {
            if (this.f13408a == null) {
                a(com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a());
            }
            return oqme.a.b(oqme.a.n, "");
        }
        return this.d;
    }

    public List<SlotIDItemConfigEntity> a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (c(str, str2) && com.qumeng.overseas.advlib.trdparty.unionset.utils.d.a(str2) && c() != null) {
            SlotIDConfigEntity e = e(str);
            List<SlotIDItemConfigEntity> dspData = e != null ? e.getDspData() : null;
            if (dspData != null) {
                for (SlotIDItemConfigEntity slotIDItemConfigEntity : dspData) {
                    if (TextUtils.equals(slotIDItemConfigEntity.getDspName(), str2) && slotIDItemConfigEntity.getIsOn() == 1) {
                        arrayList.add(slotIDItemConfigEntity);
                    }
                }
            }
        }
        return arrayList;
    }

    public int a(String str) {
        SlotIDConfigEntity e = e(str);
        if (e != null) {
            return e.getAutoRefreshTime();
        }
        return 0;
    }

    public boolean a(SlotIDConfigEntity slotIDConfigEntity, String str) {
        return (slotIDConfigEntity == null || slotIDConfigEntity.getFeatures() == null || !slotIDConfigEntity.getFeatures().contains(str)) ? false : true;
    }

    public static boolean a(String str, SlotIDConfigEntity slotIDConfigEntity, String str2) {
        if (str2.equals(o)) {
            return true;
        }
        if (slotIDConfigEntity == null) {
            return false;
        }
        Map<String, Integer> clickChannelLimit = slotIDConfigEntity.getClickChannelLimit();
        if (clickChannelLimit != null && clickChannelLimit.containsKey(str2)) {
            try {
                int intValue = clickChannelLimit.get(str2).intValue();
                if (com.qumeng.overseas.advlib.__remote__.core.proto.utils.f.a(oqme.a.W + str + str2)) {
                    oqme.a.a(oqme.a.W + str + str2, (Object) null);
                }
                Map map = (Map) oqme.a.d(oqme.a.W + str + str2);
                if (map != null && map.containsKey(str2)) {
                    int intValue2 = ((Integer) map.get(str2)).intValue();
                    com.qumeng.overseas.advlib.__remote__.utils.n.c(p, "click_channel_limit点击频控，" + str + "当前点击数" + intValue2 + " 配置点击数" + intValue, new Object[0]);
                    return intValue2 < intValue;
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    public static void a(String str, String str2, String str3) {
        int intValue;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        Map map = (Map) oqme.a.d(oqme.a.X + str + str2);
        if (map == null) {
            map = new HashMap();
        }
        if (map.containsKey(str3)) {
            try {
                intValue = ((Integer) map.get(str3)).intValue();
            } catch (Throwable unused) {
            }
            com.qumeng.overseas.advlib.__remote__.utils.n.c(p, "click_pkg_name_limit点击了当前点击数" + intValue, new Object[0]);
            map.put(str3, Integer.valueOf(intValue + 1));
            oqme.a.a(oqme.a.X + str + str2, map);
        }
        intValue = 0;
        com.qumeng.overseas.advlib.__remote__.utils.n.c(p, "click_pkg_name_limit点击了当前点击数" + intValue, new Object[0]);
        map.put(str3, Integer.valueOf(intValue + 1));
        oqme.a.a(oqme.a.X + str + str2, map);
    }

    public int d(String str) {
        SlotIDConfigEntity e = e(str);
        if (e != null) {
            return e.getResidualCacheTime();
        }
        return 0;
    }

    public List<Integer> d() {
        if (this.f13408a == null) {
            return (List) oqme.a.d(oqme.a.m);
        }
        return this.e;
    }

    public static boolean a(String str, String str2, SlotIDConfigEntity slotIDConfigEntity, String str3) {
        if (slotIDConfigEntity == null) {
            return false;
        }
        Map<String, Integer> clickPkgNameLimit = slotIDConfigEntity.getClickPkgNameLimit();
        if (!TextUtils.isEmpty(str3) && clickPkgNameLimit != null && clickPkgNameLimit.containsKey(str2)) {
            try {
                int intValue = clickPkgNameLimit.get(str2).intValue();
                if (com.qumeng.overseas.advlib.__remote__.core.proto.utils.f.a(oqme.a.X + str + str2)) {
                    oqme.a.a(oqme.a.X + str + str2, (Object) null);
                    return false;
                }
                Map map = (Map) oqme.a.d(oqme.a.X + str + str2);
                if (map != null && map.containsKey(str3)) {
                    int intValue2 = ((Integer) map.get(str3)).intValue();
                    com.qumeng.overseas.advlib.__remote__.utils.n.c(p, "click_pkg_name_limit点击频控，" + str + "当前点击数" + intValue2 + " 配置点击数" + intValue, new Object[0]);
                    if (intValue2 >= intValue) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public void a(String str, long j) {
        if (TextUtils.isEmpty(str) || j <= 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = (j * 60000) + elapsedRealtime;
        Long l2 = this.g.get(str);
        if (l2 == null || l2.longValue() <= elapsedRealtime) {
            this.g.put(str, Long.valueOf(j2));
        }
    }

    public void a(d dVar) {
        if (dVar == null) {
            return;
        }
        synchronized (this) {
            if (!k()) {
                if (!this.k.contains(dVar)) {
                    this.k.add(dVar);
                }
            } else {
                try {
                    dVar.onConfigLoaded();
                } catch (Throwable unused) {
                }
            }
        }
    }

    private void a(int i) {
        this.h = i;
        a();
    }

    private void a() {
        if (this.j) {
            return;
        }
        if (this.i != 2 && this.h != 2) {
            if (this.i == 3 && this.h == 3) {
                n();
                return;
            }
            return;
        }
        n();
    }
}
