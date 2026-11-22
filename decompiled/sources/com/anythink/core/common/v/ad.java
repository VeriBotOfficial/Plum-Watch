package com.anythink.core.common.v;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes12.dex */
final class ad {

    /* renamed from: a, reason: collision with root package name */
    private final PackageManager f4383a;

    public ad(Context context) {
        this.f4383a = context.getPackageManager();
    }

    public final a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return a.NOT_INSTALLED;
        }
        try {
            return this.f4383a.getApplicationInfo(str, 0).enabled ? a.ENABLED : a.DISABLED;
        } catch (PackageManager.NameNotFoundException unused) {
            return a.NOT_INSTALLED;
        }
    }

    private int c(String str) {
        try {
            PackageInfo packageInfo = this.f4383a.getPackageInfo(str, 16);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return 0;
    }

    private String d(String str) {
        try {
            PackageInfo packageInfo = this.f4383a.getPackageInfo(str, 16);
            if (packageInfo != null && packageInfo.versionName != null) {
                return packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return "";
    }

    public final String b(String str) {
        byte[] e = e(str);
        if (e == null || e.length == 0) {
            return null;
        }
        return x.a(a(e));
    }

    private byte[] e(String str) {
        try {
            PackageInfo packageInfo = this.f4383a.getPackageInfo(str, 64);
            if (packageInfo != null && packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return new byte[0];
    }

    private static byte[] a(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }

    public enum a {
        ENABLED,
        DISABLED,
        NOT_INSTALLED;

        private static /* synthetic */ a[] a() {
            return new a[]{ENABLED, DISABLED, NOT_INSTALLED};
        }
    }
}
