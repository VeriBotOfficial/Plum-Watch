package com.baidu.bdhttpdns;

import com.baidu.bdhttpdns.BDHttpDns;
import com.baidu.bdhttpdns.BDHttpDnsResult;
import com.baidu.bdhttpdns.h;

/* loaded from: classes12.dex */
class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BDHttpDns.CompletionHandler f7449a;
    final /* synthetic */ BDHttpDnsResult.ResolveType b;
    final /* synthetic */ h.a c;
    final /* synthetic */ BDHttpDns d;

    c(BDHttpDns bDHttpDns, BDHttpDns.CompletionHandler completionHandler, BDHttpDnsResult.ResolveType resolveType, h.a aVar) {
        this.d = bDHttpDns;
        this.f7449a = completionHandler;
        this.b = resolveType;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7449a.completionHandler(new BDHttpDnsResult(this.b, BDHttpDnsResult.ResolveStatus.BDHttpDnsResolveOK, this.c.b(), null));
    }
}
