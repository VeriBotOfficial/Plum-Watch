package com.baidu.bdhttpdns;

import android.content.Context;
import android.content.IntentFilter;
import com.baidu.bdhttpdns.BDHttpDnsResult;
import com.baidu.bdhttpdns.h;
import com.baidu.bdhttpdns.i;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes12.dex */
public final class BDHttpDns {

    /* renamed from: a, reason: collision with root package name */
    private static volatile BDHttpDns f7443a;
    private BDNetworkStateChangeReceiver f;
    private final Context g;
    private long i;
    private long j;
    private int k;
    private final i b = i.a();
    private final f c = f.a();
    private final h d = new h("DNS", true);
    private final h e = new h("HTTPDNS", false);
    private CachePolicy h = CachePolicy.POLICY_TOLERANT;

    public enum CachePolicy {
        POLICY_AGGRESSIVE,
        POLICY_TOLERANT,
        POLICY_STRICT
    }

    public interface CompletionHandler {
        void completionHandler(BDHttpDnsResult bDHttpDnsResult);
    }

    private BDHttpDns(Context context) {
        this.g = context;
        f();
        this.f.refreshIpReachable();
        this.j = System.currentTimeMillis();
    }

    private boolean a(long j) {
        return this.b.f() || j - this.i > 1000;
    }

    private boolean b(long j) {
        if (j - this.j <= 60000) {
            return false;
        }
        this.j = j;
        return true;
    }

    private void f() {
        this.f = new BDNetworkStateChangeReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION);
        this.g.registerReceiver(this.f, intentFilter);
    }

    public static BDHttpDns getService(Context context) {
        if (f7443a == null) {
            synchronized (BDHttpDns.class) {
                if (f7443a == null) {
                    f7443a = new BDHttpDns(context);
                }
            }
        }
        return f7443a;
    }

    h a() {
        return this.e;
    }

    public void asyncResolve(String str, CompletionHandler completionHandler) {
        if (e.a(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            m.a().b().execute(new a(this, completionHandler, arrayList));
            return;
        }
        if (e.b(str)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str.replaceAll("[\\[\\]]", ""));
            m.a().b().execute(new b(this, completionHandler, arrayList2));
            return;
        }
        h.a a2 = this.e.a(str);
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<String> arrayList3 = new ArrayList<>();
        if (a(currentTimeMillis)) {
            if (a2 == null) {
                arrayList3.add(str);
            } else if (a2.a()) {
                this.b.a(str);
            }
            if (b(currentTimeMillis)) {
                arrayList3.addAll(this.b.c());
            }
            this.b.a(arrayList3, new k(this.g));
        } else {
            l.a("please wait a moment to send request for %s, until preResolve finished or has passed 1000ms ", str);
        }
        if (a2 != null) {
            BDHttpDnsResult.ResolveType resolveType = a2.a() ? BDHttpDnsResult.ResolveType.RESOLVE_FROM_HTTPDNS_EXPIRED_CACHE : BDHttpDnsResult.ResolveType.RESOLVE_FROM_HTTPDNS_CACHE;
            l.a("Async resolve successful, host(%s) ipv4List(%s) ipv6List(%s) resolveType(%s)", str, a2.b() != null ? a2.b().toString() : null, a2.c() != null ? a2.c().toString() : null, resolveType.toString());
            m.a().b().execute(new c(this, completionHandler, resolveType, a2));
            return;
        }
        h.a a3 = this.d.a(str);
        if (a3 == null) {
            this.c.a(str, new g(this.g, completionHandler));
            return;
        }
        BDHttpDnsResult.ResolveType resolveType2 = BDHttpDnsResult.ResolveType.RESOLVE_FROM_DNS_CACHE;
        l.a("Async resolve successful, host(%s) ipv4List(%s) ipv6List(%s) resolveType(%s)", str, a3.b() != null ? a3.b().toString() : null, a3.c() != null ? a3.c().toString() : null, resolveType2.toString());
        m.a().b().execute(new d(this, completionHandler, resolveType2, a3));
    }

    h b() {
        return this.d;
    }

    CachePolicy c() {
        return this.h;
    }

    i d() {
        return this.b;
    }

    int e() {
        return this.k;
    }

    public void setAccountID(String str) {
        if (str.length() > 64) {
            throw new IllegalArgumentException("accountID length(" + str.length() + ") is bigger than 64");
        }
        this.b.c(str);
        l.a("Set account id to %s", str);
    }

    public void setCachePolicy(CachePolicy cachePolicy) {
        h hVar;
        boolean z;
        this.h = cachePolicy;
        if (cachePolicy == CachePolicy.POLICY_STRICT) {
            hVar = this.e;
            z = true;
        } else {
            hVar = this.e;
            z = false;
        }
        hVar.a(z);
        l.a("Set cache policy to %s", cachePolicy.name());
    }

    public void setHttpsRequestEnable(boolean z) {
        this.b.a(z);
        l.a("Set https enabled to %b", Boolean.valueOf(z));
    }

    public void setLogEnable(boolean z) {
        l.a(z);
        l.a("Set debug log enabled to %b", Boolean.valueOf(z));
    }

    public void setNetworkSwitchPolicy(boolean z, boolean z2) {
        this.f.a(z);
        this.f.b(z2);
        l.a("Set network change policy, clearCache(%b), httpDnsPrefetch(%b)", Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    public void setPreResolveHosts(ArrayList<String> arrayList) {
        if (arrayList.size() <= 0) {
            l.a("Set pre resolve hosts error, get empty hosts", new Object[0]);
            return;
        }
        ArrayList arrayList2 = new ArrayList(new HashSet(arrayList));
        int d = this.b.d();
        if (arrayList2.size() > d) {
            l.a("The current number of hosts is %d, and the max supported size is %s.Please reduce it to %s or less.", Integer.valueOf(arrayList2.size()), Integer.valueOf(d), Integer.valueOf(d));
            return;
        }
        int i = this.k + 1;
        this.k = i;
        if (i > 1) {
            l.a("You have already set PreResolveHosts, it is best to set it only once.", new Object[0]);
        }
        this.i = System.currentTimeMillis();
        String str = "";
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            str = str + ((String) arrayList2.get(i2)) + ",";
        }
        if (str == null || str.isEmpty()) {
            return;
        }
        String substring = str.substring(0, str.length() - 1);
        l.a("Set pre resolve hosts: %s", substring);
        this.b.a(substring, i.d.DNLIST_HOSTS, new k(this.g));
    }

    public void setPreResolveTag(String str) {
        if (str == null || str.isEmpty()) {
            l.a("Set pre resolve hosts error, get empty tag", new Object[0]);
            return;
        }
        int i = this.k + 1;
        this.k = i;
        if (i > 1) {
            l.a("You have already set PreResolveHosts, it is best to set it only once.", new Object[0]);
        }
        l.a(" Set preResolve tag : %s", str.toString());
        k kVar = new k(this.g);
        this.i = System.currentTimeMillis();
        this.b.a(str, i.d.TAG_OF_HOSTS, kVar);
    }

    public void setSecret(String str) {
        int length = str.length();
        if (length > 64 || length < 8) {
            throw new IllegalArgumentException("secret length(" + str.length() + ") check failed");
        }
        this.b.d(str);
        String substring = str.substring(0, 3);
        for (int i = 0; i < length - 6; i++) {
            substring = substring + String.valueOf('*');
        }
        l.a("Set secret to %s", substring + str.substring(length - 3));
    }

    public BDHttpDnsResult syncResolve(String str, boolean z) {
        if (e.a(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            return new BDHttpDnsResult(BDHttpDnsResult.ResolveType.RESOLVE_NONEED, BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveOK, arrayList, null);
        }
        if (e.b(str)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str.replaceAll("[\\[\\]]", ""));
            return new BDHttpDnsResult(BDHttpDnsResult.ResolveType.RESOLVE_NONEED, BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveOK, null, arrayList2);
        }
        BDHttpDnsResult.ResolveType resolveType = BDHttpDnsResult.ResolveType.RESOLVE_NONE;
        h.a a2 = this.e.a(str);
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<String> arrayList3 = new ArrayList<>();
        if (a(currentTimeMillis)) {
            if (a2 == null) {
                arrayList3.add(str);
            } else if (a2.a()) {
                this.b.a(str);
            }
            if (b(currentTimeMillis)) {
                arrayList3.addAll(this.b.c());
            }
            this.b.a(arrayList3, new k(this.g));
        } else {
            l.a("please wait a moment to send request for %s, until preResolve finished or has passed 1000ms ", str);
        }
        if (a2 != null) {
            BDHttpDnsResult.ResolveType resolveType2 = a2.a() ? BDHttpDnsResult.ResolveType.RESOLVE_FROM_HTTPDNS_EXPIRED_CACHE : BDHttpDnsResult.ResolveType.RESOLVE_FROM_HTTPDNS_CACHE;
            l.a("Sync resolve successful, host(%s) ipv4List(%s) ipv6List(%s) resolveType(%s)", str, a2.b() != null ? a2.b().toString() : null, a2.c() != null ? a2.c().toString() : null, resolveType2.toString());
            return new BDHttpDnsResult(resolveType2, BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveOK, a2.b(), a2.c());
        }
        if (a2 == null && z) {
            l.a("Sync resolve failed, host(%s), find no httpdns cache entry and cacheOnly is true", str);
            return new BDHttpDnsResult(resolveType, BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveErrorCacheMiss, null, null);
        }
        h.a a3 = this.d.a(str);
        if (a3 != null) {
            BDHttpDnsResult.ResolveType resolveType3 = BDHttpDnsResult.ResolveType.RESOLVE_FROM_DNS_CACHE;
            l.a("Sync resolve successful, host(%s) ipv4List(%s) ipv6List(%s) resolveType(%s)", str, a3.b() != null ? a3.b().toString() : null, a3.c() != null ? a3.c().toString() : null, resolveType3.toString());
            return new BDHttpDnsResult(resolveType3, BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveOK, a3.b(), a3.c());
        }
        BDHttpDnsResult a4 = this.c.a(str);
        if (a4.getResolveStatus() != BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveOK) {
            l.a("Sync resolve failed, host(%s), dns resolve failed", str);
            return a4;
        }
        h.a aVar = new h.a();
        aVar.a(60L);
        aVar.b(System.currentTimeMillis() / 1000);
        aVar.a(a4.getIpv4List());
        aVar.b(a4.getIpv6List());
        this.d.a(str, aVar);
        l.a("Sync resolve successful, host(%s) ipList(%s) ipv6List(%s) resolveType(%s)", str, aVar.b() != null ? aVar.b().toString() : null, aVar.c() != null ? aVar.c().toString() : null, a4.getResolveType().toString());
        return a4;
    }
}
