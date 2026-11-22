package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes15.dex */
final class zzkz implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ zzjq zza;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ae A[Catch: RuntimeException -> 0x0194, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0194, blocks: (B:3:0x000b, B:5:0x0018, B:8:0x0029, B:14:0x00ae, B:16:0x00ba, B:19:0x00cb, B:21:0x00d3, B:24:0x00e0, B:26:0x00e6, B:27:0x00f9, B:29:0x0105, B:34:0x010d, B:38:0x0130, B:39:0x014c, B:41:0x013d, B:42:0x0152, B:44:0x0158, B:46:0x015e, B:48:0x0164, B:50:0x016a, B:52:0x0172, B:54:0x017a, B:56:0x0180, B:59:0x0186, B:61:0x003e, B:64:0x0046, B:66:0x004e, B:68:0x0054, B:70:0x005a, B:72:0x0060, B:74:0x0068, B:76:0x0070, B:78:0x0078, B:80:0x0080, B:81:0x008c, B:83:0x00a5), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010d A[Catch: RuntimeException -> 0x0194, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0194, blocks: (B:3:0x000b, B:5:0x0018, B:8:0x0029, B:14:0x00ae, B:16:0x00ba, B:19:0x00cb, B:21:0x00d3, B:24:0x00e0, B:26:0x00e6, B:27:0x00f9, B:29:0x0105, B:34:0x010d, B:38:0x0130, B:39:0x014c, B:41:0x013d, B:42:0x0152, B:44:0x0158, B:46:0x015e, B:48:0x0164, B:50:0x016a, B:52:0x0172, B:54:0x017a, B:56:0x0180, B:59:0x0186, B:61:0x003e, B:64:0x0046, B:66:0x004e, B:68:0x0054, B:70:0x005a, B:72:0x0060, B:74:0x0068, B:76:0x0070, B:78:0x0078, B:80:0x0080, B:81:0x008c, B:83:0x00a5), top: B:2:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void zza(com.google.android.gms.measurement.internal.zzkz r16, boolean r17, android.net.Uri r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkz.zza(com.google.android.gms.measurement.internal.zzkz, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    zzkz(zzjq zzjqVar) {
        this.zza = zzjqVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzkz zzkzVar;
        String str;
        try {
            this.zza.zzj().zzp().zza("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                this.zza.zzn().zza(activity, bundle);
                return;
            }
            Uri data = intent.getData();
            if (data == null || !data.isHierarchical()) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string)) {
                        data = Uri.parse(string);
                    }
                }
                data = null;
            }
            Uri uri = data;
            if (uri != null && uri.isHierarchical()) {
                this.zza.zzq();
                if (zzos.zza(intent)) {
                    str = "gs";
                } else {
                    str = "auto";
                }
                String str2 = str;
                String queryParameter = uri.getQueryParameter("referrer");
                zzkzVar = this;
                try {
                    try {
                        this.zza.zzl().zzb(new zzlc(zzkzVar, bundle == null, uri, str2, queryParameter));
                        zzkzVar.zza.zzn().zza(activity, bundle);
                        return;
                    } catch (RuntimeException e) {
                        e = e;
                        zzkzVar.zza.zzj().zzg().zza("Throwable caught in onActivityCreated", e);
                        zzkzVar.zza.zzn().zza(activity, bundle);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    zzkzVar.zza.zzn().zza(activity, bundle);
                    throw th;
                }
            }
            this.zza.zzn().zza(activity, bundle);
        } catch (RuntimeException e2) {
            e = e2;
            zzkzVar = this;
        } catch (Throwable th2) {
            th = th2;
            zzkzVar = this;
            zzkzVar.zza.zzn().zza(activity, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzn().zza(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.zza.zzn().zzb(activity);
        zznb zzp = this.zza.zzp();
        zzp.zzl().zzb(new zznd(zzp, zzp.zzb().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zznb zzp = this.zza.zzp();
        zzp.zzl().zzb(new zzne(zzp, zzp.zzb().elapsedRealtime()));
        this.zza.zzn().zzc(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzn().zzb(activity, bundle);
    }
}
