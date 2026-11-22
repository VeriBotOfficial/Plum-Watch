package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzava;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes13.dex */
final class zzr extends AsyncTask {
    final /* synthetic */ zzu zza;

    /* synthetic */ zzr(zzu zzuVar, zzt zztVar) {
        this.zza = zzuVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        WebView webView;
        WebView webView2;
        zzu zzuVar = this.zza;
        String str = (String) obj;
        webView = zzuVar.zzf;
        if (webView == null || str == null) {
            return;
        }
        webView2 = zzuVar.zzf;
        webView2.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        Future future;
        try {
            zzu zzuVar = this.zza;
            future = zzuVar.zzc;
            zzuVar.zzh = (zzava) future.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
        } catch (ExecutionException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
        } catch (TimeoutException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e3);
        }
        return this.zza.zzp();
    }
}
