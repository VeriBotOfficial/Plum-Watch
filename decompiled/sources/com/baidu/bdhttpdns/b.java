package com.baidu.bdhttpdns;

import com.baidu.bdhttpdns.BDHttpDns;
import com.baidu.bdhttpdns.BDHttpDnsResult;
import java.util.ArrayList;

/* loaded from: classes12.dex */
class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BDHttpDns.CompletionHandler f7448a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ BDHttpDns c;

    b(BDHttpDns bDHttpDns, BDHttpDns.CompletionHandler completionHandler, ArrayList arrayList) {
        this.c = bDHttpDns;
        this.f7448a = completionHandler;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7448a.completionHandler(new BDHttpDnsResult(BDHttpDnsResult.ResolveType.RESOLVE_NONEED, BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveOK, null, this.b));
    }
}
