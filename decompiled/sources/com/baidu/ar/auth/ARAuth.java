package com.baidu.ar.auth;

import android.content.Context;
import android.graphics.Bitmap;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.n3;
import com.baidu.ar.q5;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class ARAuth {

    /* renamed from: a, reason: collision with root package name */
    public static n3<q5> f6797a = new n3<>("com.baidu.ar.auth.ARAuthFacade");

    public static void a(int i) {
        q5 b = f6797a.b();
        if (b != null) {
            b.c(i);
        }
    }

    public static List<Integer> checkAuth(Context context, byte[] bArr, IDuMixAuthCallback iDuMixAuthCallback) {
        q5 b = f6797a.b();
        return b != null ? b.a(context, bArr, iDuMixAuthCallback) : new ArrayList();
    }

    public static List<Integer> checkAuth(Context context, byte[] bArr, ICallbackWith<List<Integer>> iCallbackWith, ICallbackWith<Integer> iCallbackWith2) {
        q5 b = f6797a.b();
        return b != null ? b.a(context, bArr, iCallbackWith, iCallbackWith2) : new ArrayList();
    }

    public static boolean checkFeatureAuth(int i) {
        q5 b = f6797a.b();
        if (b != null) {
            return b.b(i);
        }
        return true;
    }

    public static boolean checkOfflineLicenseAuth(Context context, byte[] bArr) {
        q5 b = f6797a.b();
        if (b != null) {
            return b.a(context, bArr);
        }
        return true;
    }

    public static Bitmap createTipBitmap(Context context) {
        q5 b = f6797a.b();
        if (b != null) {
            return b.a(context);
        }
        return null;
    }

    public static void doAuth(Context context, IAuthCallback iAuthCallback) {
        AuthJni.init();
        q5 b = f6797a.b();
        if (b != null) {
            b.a(context, iAuthCallback);
        }
    }

    public static boolean enableFeature(int i) {
        q5 b = f6797a.b();
        if (b != null) {
            return b.a(i);
        }
        return true;
    }

    public static boolean isShowAuthTip() {
        q5 b = f6797a.b();
        if (b != null) {
            return b.a();
        }
        return true;
    }

    public static void loadAuthInfo(Context context) {
        q5 b = f6797a.b();
        if (b != null) {
            b.b(context);
        }
    }

    public static void loadWhiteAuthInfo(Context context) {
        q5 b = f6797a.b();
        if (b != null) {
            b.c(context);
        }
    }

    public static void release() {
        q5 a2 = f6797a.a();
        if (a2 != null) {
            a2.release();
        }
        f6797a.d();
        AuthJni.release();
    }

    public static void setAuthLicense(byte[] bArr, String str, String str2, String str3) {
        q5 b = f6797a.b();
        if (b != null) {
            b.a(bArr, str, str2, str3);
        }
    }
}
