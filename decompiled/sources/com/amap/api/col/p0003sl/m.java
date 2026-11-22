package com.amap.api.col.p0003sl;

import android.webkit.WebView;

/* compiled from: H5LocationClient.java */
/* loaded from: classes11.dex */
class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1760a;
    final /* synthetic */ n b;

    m(n nVar, String str) {
        this.b = nVar;
        this.f1760a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        WebView webView;
        String str;
        webView = this.b.d;
        StringBuilder sb = new StringBuilder("javascript:");
        str = this.b.e;
        webView.loadUrl(sb.append(str).append("('").append(this.f1760a).append("')").toString());
    }
}
