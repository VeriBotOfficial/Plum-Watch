package com.baidu.bdhttpdns;

import android.content.Context;
import com.baidu.bdhttpdns.BDHttpDns;
import com.baidu.bdhttpdns.BDHttpDnsResult;
import com.baidu.bdhttpdns.f;
import com.baidu.bdhttpdns.h;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class g implements f.a {

    /* renamed from: a, reason: collision with root package name */
    private final BDHttpDns.CompletionHandler f7454a;
    private final BDHttpDns b;
    private final h c;

    public g(Context context, BDHttpDns.CompletionHandler completionHandler) {
        this.f7454a = completionHandler;
        BDHttpDns service = BDHttpDns.getService(context);
        this.b = service;
        this.c = service.b();
    }

    @Override // com.baidu.bdhttpdns.f.a
    public void a(int i, ArrayList<String> arrayList, ArrayList<String> arrayList2, long j, String str) {
        if (i == -1) {
            l.a("Async resolve failed, host(%s), dns resolve failed", str);
            BDHttpDns.CompletionHandler completionHandler = this.f7454a;
            if (completionHandler != null) {
                completionHandler.completionHandler(new BDHttpDnsResult(BDHttpDnsResult.ResolveType.RESOLVE_NONE, BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveErrorDnsResolve, arrayList, arrayList2));
                return;
            }
            return;
        }
        if (i != 0) {
            l.a("Internal error: async dns resolve completion get error ret(%d)", Integer.valueOf(i));
            return;
        }
        l.a("Async resolve successful, host(%s) ipv4List(%s) ipv6List(%s) resolveType(%s)", str, arrayList != null ? arrayList.toString() : null, arrayList2 != null ? arrayList2.toString() : null, BDHttpDnsResult.ResolveType.RESOLVE_FROM_DNS.toString());
        h.a aVar = new h.a();
        aVar.a(60L);
        aVar.b(System.currentTimeMillis() / 1000);
        aVar.a(arrayList);
        aVar.b(arrayList2);
        this.c.a(str, aVar);
        BDHttpDns.CompletionHandler completionHandler2 = this.f7454a;
        if (completionHandler2 != null) {
            completionHandler2.completionHandler(new BDHttpDnsResult(BDHttpDnsResult.ResolveType.RESOLVE_FROM_DNS, BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveOK, arrayList, arrayList2));
        }
    }
}
