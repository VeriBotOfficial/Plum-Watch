package com.vivo.push.f;

import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.ServiceInfo;
import com.vivo.push.util.aa;
import com.vivo.push.util.t;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: ConfigSecureUtil.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private volatile Boolean f14083a = null;
    private volatile Boolean b = null;

    private synchronized boolean c(Context context) {
        if (this.b != null) {
            return this.b.booleanValue();
        }
        boolean z = true;
        if (context == null) {
            return true;
        }
        boolean d = aa.d(context, context.getPackageName());
        if (!aa.c(context, context.getPackageName()) && !d) {
            z = false;
        }
        this.b = Boolean.valueOf(z);
        return this.b.booleanValue();
    }

    private synchronized boolean d(Context context) {
        String str;
        if (this.f14083a != null) {
            return this.f14083a.booleanValue();
        }
        if (context == null) {
            t.c("ConfigSecureUtil", "checkHasService paramContext is empty ");
            return true;
        }
        try {
            if (aa.c(context, context.getPackageName())) {
                str = "com.vivo.push.sdk.service.CommandClientService";
            } else {
                str = "com.vivo.push.sdk.service.CommandService";
            }
            ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services;
            if (serviceInfoArr == null) {
                t.c("ConfigSecureUtil", "checkHasService serviceInfos is empty ");
                this.f14083a = Boolean.TRUE;
            }
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (str.equals(((ComponentInfo) serviceInfo).name)) {
                    this.f14083a = Boolean.TRUE;
                    return this.f14083a.booleanValue();
                }
            }
            this.f14083a = Boolean.FALSE;
        } catch (Exception e) {
            t.a("ConfigSecureUtil", "checkHasService error " + e.getMessage());
            this.f14083a = Boolean.TRUE;
        }
        return this.f14083a.booleanValue();
    }

    public final synchronized byte[] a(Context context) {
        byte[] bArr;
        bArr = new byte[16];
        bArr[0] = 34;
        bArr[1] = 32;
        bArr[2] = BuiltinOptions.ExpOptions;
        bArr[3] = BuiltinOptions.CastOptions;
        if (d(context)) {
            bArr[4] = BuiltinOptions.ExpOptions;
            bArr[5] = 34;
            bArr[6] = 32;
            bArr[7] = BuiltinOptions.ExpOptions;
        }
        bArr[8] = BuiltinOptions.ExpOptions;
        bArr[9] = BuiltinOptions.ExpOptions;
        bArr[10] = 34;
        bArr[11] = BuiltinOptions.LessOptions;
        if (c(context)) {
            bArr[12] = 35;
            bArr[13] = 32;
            bArr[14] = 32;
            bArr[15] = 32;
        }
        return bArr;
    }

    public final synchronized byte[] b(Context context) {
        byte[] bArr;
        bArr = new byte[16];
        bArr[0] = BuiltinOptions.ExpOptions;
        bArr[1] = 34;
        bArr[2] = 35;
        bArr[3] = BuiltinOptions.LogSoftmaxOptions;
        if (d(context)) {
            bArr[4] = BuiltinOptions.CastOptions;
            bArr[5] = BuiltinOptions.DequantizeOptions;
            bArr[6] = BuiltinOptions.MaximumMinimumOptions;
            bArr[7] = BuiltinOptions.ArgMaxOptions;
        }
        bArr[8] = BuiltinOptions.LessOptions;
        bArr[9] = 32;
        bArr[10] = BuiltinOptions.DequantizeOptions;
        bArr[11] = BuiltinOptions.CastOptions;
        if (c(context)) {
            bArr[12] = BuiltinOptions.LogSoftmaxOptions;
            bArr[13] = 35;
            bArr[14] = 34;
            bArr[15] = BuiltinOptions.ExpOptions;
        }
        return bArr;
    }
}
