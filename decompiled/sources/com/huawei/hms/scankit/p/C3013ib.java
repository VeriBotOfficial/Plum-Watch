package com.huawei.hms.scankit.p;

import android.os.Bundle;
import android.util.SparseArray;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.applovin.sdk.AppLovinMediationProvider;
import com.autonavi.aps.amapapi.config.Const;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.hmsscankit.DetailRect;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xmly.businesssdk.network.NetworkConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: HaLog60001.java */
/* renamed from: com.huawei.hms.scankit.p.ib, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3013ib extends AbstractC3037ob {
    private volatile String h;
    private volatile String i;
    private boolean j;
    private volatile long k;
    private b l;

    /* compiled from: HaLog60001.java */
    /* renamed from: com.huawei.hms.scankit.p.ib$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f10650a;
        private String b;
        private String c;
        private long d;
        private long e;
        private String f;
        private String g;
        private boolean h;
        private int i;
        private boolean j;

        /* synthetic */ a(long j, String str, String str2, boolean z, int i, int i2, C3005gb c3005gb) {
            this(j, str, str2, z, i, i2);
        }

        private a(long j, String str, String str2, boolean z, int i, int i2) {
            this.d = j;
            this.b = str;
            this.c = str2;
            this.h = z;
            this.i = i;
            this.f10650a = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a b(String str) {
            this.g = str;
            return this;
        }

        public a a(int i) {
            this.f10650a = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a a(long j) {
            this.e = j;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a a(boolean z) {
            this.j = z;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a a(String str) {
            this.f = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HaLog60001.java */
    /* renamed from: com.huawei.hms.scankit.p.ib$b */
    class b {

        /* renamed from: a, reason: collision with root package name */
        private String f10651a;
        private Timer b;
        private volatile boolean c;
        private List<a> d;
        private List<a> e;

        /* compiled from: HaLog60001.java */
        /* renamed from: com.huawei.hms.scankit.p.ib$b$a */
        private class a {

            /* renamed from: a, reason: collision with root package name */
            private StringBuilder f10652a;
            private AtomicInteger[] b;
            private String[] c;
            private long[] d;

            private a() {
                this.f10652a = new StringBuilder(100);
                this.b = new AtomicInteger[]{new AtomicInteger(), new AtomicInteger(), new AtomicInteger(), new AtomicInteger(), new AtomicInteger(), new AtomicInteger(), new AtomicInteger()};
                this.c = new String[]{"lt10K:", "lt100K:", "lt1M:", "lt3M:", "lt10M:", "lt40M:", "gt40M:"};
                this.d = new long[]{10240, OSSConstants.MIN_PART_SIZE_LIMIT, 1048576, 3145728, NetworkConfig.Cache.SIZE, 41943040, Long.MAX_VALUE};
            }

            /* JADX INFO: Access modifiers changed from: private */
            public String a() {
                StringBuilder sb = this.f10652a;
                sb.delete(0, sb.length());
                this.f10652a.append(Const.STR_MART_JSON_BEGIN);
                for (int i = 0; i < this.b.length; i++) {
                    this.f10652a.append(this.c[i]);
                    this.f10652a.append(this.b[i]);
                    this.f10652a.append(",");
                }
                this.f10652a.replace(r0.length() - 1, this.f10652a.length(), "}");
                return this.f10652a.toString();
            }

            /* synthetic */ a(b bVar, C3005gb c3005gb) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a(int i) {
                int i2 = 0;
                while (true) {
                    AtomicInteger[] atomicIntegerArr = this.b;
                    if (i2 >= atomicIntegerArr.length) {
                        return;
                    }
                    if (i <= this.d[i2]) {
                        atomicIntegerArr[i2].addAndGet(1);
                        return;
                    }
                    i2++;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: HaLog60001.java */
        /* renamed from: com.huawei.hms.scankit.p.ib$b$b, reason: collision with other inner class name */
        class C0613b {

            /* renamed from: a, reason: collision with root package name */
            private StringBuilder f10653a;
            private SparseArray<AtomicInteger> b;

            private C0613b() {
                this.f10653a = new StringBuilder(60);
                this.b = new C3021kb(this);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a(int i) {
                if (this.b.get(i) == null) {
                    this.b.put(i, new C3025lb(this));
                } else {
                    this.b.get(i).addAndGet(1);
                }
            }

            /* synthetic */ C0613b(b bVar, C3005gb c3005gb) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public String a() {
                StringBuilder sb = this.f10653a;
                sb.delete(0, sb.length());
                this.f10653a.append(Const.STR_MART_JSON_BEGIN);
                for (int i = 0; i < this.b.size(); i++) {
                    this.f10653a.append(this.b.keyAt(i));
                    this.f10653a.append(":");
                    this.f10653a.append(this.b.valueAt(i));
                    this.f10653a.append(",");
                }
                this.f10653a.replace(r0.length() - 1, this.f10653a.length(), "}");
                return this.f10653a.toString();
            }
        }

        private b() {
            this.f10651a = b.class.getSimpleName();
            this.b = new Timer();
            this.c = true;
            this.d = new ArrayList(10);
            this.e = new ArrayList(10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(a aVar) {
            if (this.d.size() > 100) {
                return;
            }
            synchronized (this) {
                this.d.add(aVar);
                if (this.c) {
                    this.c = false;
                    this.b.schedule(new C3017jb(this), 1000L);
                }
            }
        }

        /* synthetic */ b(C3013ib c3013ib, C3005gb c3005gb) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (this.d.size() > 0) {
                synchronized (this) {
                    List<a> list = this.d;
                    List<a> list2 = this.e;
                    this.d = list2;
                    this.e = list;
                    list2.clear();
                }
                a(this.e);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r24v2, types: [java.lang.Boolean] */
        private void a(List<a> list) {
            HashSet<String> hashSet = new HashSet();
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().c);
            }
            for (String str : hashSet) {
                C3005gb c3005gb = null;
                C0613b c0613b = new C0613b(this, c3005gb);
                a aVar = new a(this, c3005gb);
                String str2 = "";
                long j = Long.MIN_VALUE;
                long j2 = 0;
                long j3 = 0;
                long j4 = 0;
                long j5 = 0;
                long j6 = Long.MAX_VALUE;
                String str3 = "";
                String str4 = str3;
                for (a aVar2 : list) {
                    str2 = aVar2.b;
                    str3 = aVar2.f;
                    str4 = aVar2.g;
                    ?? valueOf = Boolean.valueOf(aVar2.h);
                    j3 += aVar2.e - aVar2.d;
                    c0613b.a(aVar2.f10650a);
                    aVar.a(aVar2.i);
                    j2++;
                    if (aVar2.j) {
                        j5++;
                    }
                    if (aVar2.f10650a != 0) {
                        j4++;
                    }
                    if (aVar2.e - aVar2.d < j6) {
                        j6 = aVar2.e - aVar2.d;
                    }
                    if (aVar2.e - aVar2.d > j) {
                        j = aVar2.e - aVar2.d;
                    }
                    c3005gb = valueOf;
                }
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                linkedHashMap.putAll(C3013ib.this.f);
                linkedHashMap.put("result", c0613b.a());
                linkedHashMap.put("imgSizeHistogram", aVar.a());
                linkedHashMap.put("callTime", str2);
                linkedHashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, str);
                if (j2 != 0) {
                    j3 /= j2;
                }
                linkedHashMap.put(WiseOpenHianalyticsData.UNION_COSTTIME, String.valueOf(j3));
                linkedHashMap.put("allCnt", String.valueOf(j2));
                linkedHashMap.put("failCnt", String.valueOf(j4));
                linkedHashMap.put("codeCnt", String.valueOf(j5));
                linkedHashMap.put("scanType", str3);
                linkedHashMap.put("sceneType", str4);
                linkedHashMap.put("min", String.valueOf(j6));
                linkedHashMap.put(AppLovinMediationProvider.MAX, String.valueOf(j));
                linkedHashMap.put("algPhotoMode", String.valueOf(c3005gb));
                C3048rb.a().a("60001", linkedHashMap);
            }
        }
    }

    public C3013ib(Bundle bundle, String str) {
        super(bundle, DynamicModuleInitializer.getContext());
        this.j = false;
        this.l = new b(this, null);
        this.f.put("apiName", str);
        if (DetailRect.PHOTO_MODE.equals(str)) {
            this.j = true;
        }
    }

    public void a(String str) {
        this.f.put("algapi", str);
    }

    public a a(boolean z, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                try {
                    if (this.j) {
                        new a(currentTimeMillis, new C3005gb(this, "yyyyMMddHHmmss.SSS").format(Long.valueOf(currentTimeMillis)), UUID.randomUUID().toString(), z, i, 0, null);
                        return new a(currentTimeMillis, this.h, this.i, z, i, 0, null);
                    }
                    if (currentTimeMillis - this.k > 1500) {
                        String format = new C3009hb(this, "yyyyMMddHHmmss.SSS").format(Long.valueOf(currentTimeMillis));
                        String uuid = UUID.randomUUID().toString();
                        if (currentTimeMillis - this.k > 1500) {
                            this.h = format;
                            this.i = uuid;
                            this.k = currentTimeMillis;
                        }
                    }
                    new a(currentTimeMillis, this.h, this.i, z, i, 0, null);
                    return new a(currentTimeMillis, this.h, this.i, z, i, 0, null);
                } catch (Exception unused) {
                    com.huawei.hms.scankit.util.a.b("HaLog6001", "exception happens");
                    return new a(currentTimeMillis, this.h, this.i, z, i, 0, null);
                }
            } catch (Throwable unused2) {
                return new a(currentTimeMillis, this.h, this.i, z, i, 0, null);
            }
        } catch (Exception unused3) {
        } catch (Throwable unused4) {
            return new a(currentTimeMillis, this.h, this.i, z, i, 0, null);
        }
    }

    public void a(HmsScan[] hmsScanArr, a aVar) {
        try {
            String str = AbstractC3037ob.f10675a;
            String str2 = AbstractC3037ob.b;
            if (a()) {
                boolean z = false;
                int i = 0;
                z = false;
                if (hmsScanArr != null && hmsScanArr.length > 0) {
                    int length = hmsScanArr.length;
                    while (i < length) {
                        HmsScan hmsScan = hmsScanArr[i];
                        String a2 = AbstractC3037ob.a(hmsScan.scanType);
                        i++;
                        str2 = AbstractC3037ob.b(hmsScan.scanTypeForm);
                        str = a2;
                    }
                    z = true;
                }
                this.l.a(aVar.a(System.currentTimeMillis()).a(z).a(str).b(str2));
                this.k = aVar.e;
            }
        } catch (NullPointerException unused) {
            com.huawei.hms.scankit.util.a.b("HaLog60001", "nullPoint");
        } catch (Exception unused2) {
            com.huawei.hms.scankit.util.a.b("HaLog60001", "logEnd Exception");
        }
    }
}
