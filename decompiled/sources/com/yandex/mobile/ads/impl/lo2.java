package com.yandex.mobile.ads.impl;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes5.dex */
public abstract class lo2 extends AsyncTask<Object, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    private a f16154a;
    protected final b b;

    public interface a {
    }

    public interface b {
    }

    public lo2(b bVar) {
        this.b = bVar;
    }

    public final void a(a aVar) {
        this.f16154a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f16154a;
        if (aVar != null) {
            ((po2) aVar).a();
        }
    }

    public final void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
