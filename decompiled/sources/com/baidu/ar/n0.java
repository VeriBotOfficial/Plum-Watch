package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.auth.ARAuth;
import com.baidu.ar.auth.AuthJni;
import com.baidu.ar.auth.IAuthenticateCallback;
import com.baidu.ar.auth.IAuthenticator;
import com.baidu.ar.libloader.ILibLoader;

/* loaded from: classes12.dex */
public class n0 implements IAuthenticator {
    public static volatile n0 e;

    /* renamed from: a, reason: collision with root package name */
    public String f7092a;
    public String b;
    public String c;
    public q0 d;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f7093a;
        public final /* synthetic */ byte[] b;
        public final /* synthetic */ IAuthenticateCallback c;

        public a(Context context, byte[] bArr, IAuthenticateCallback iAuthenticateCallback) {
            this.f7093a = context;
            this.b = bArr;
            this.c = iAuthenticateCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            n0.this.a(this.f7093a, this.b, this.c);
        }
    }

    public n0(String str, String str2, String str3) {
        this.f7092a = str;
        this.b = str2;
        this.c = str3;
    }

    public static n0 a(String str, String str2, String str3) {
        if (e == null) {
            e = new n0(str, str2, str3);
        } else {
            e.f7092a = str;
            e.b = str2;
            e.c = str3;
        }
        return e;
    }

    public final void a(Context context, byte[] bArr, IAuthenticateCallback iAuthenticateCallback) {
        c1.a().init(context, bArr, iAuthenticateCallback);
    }

    @Override // com.baidu.ar.auth.IAuthenticator
    public void init(Context context, byte[] bArr) {
        init(context, bArr, null);
    }

    @Override // com.baidu.ar.auth.IAuthenticator
    public void init(Context context, byte[] bArr, IAuthenticateCallback iAuthenticateCallback) {
        com.baidu.ar.libloader.a.a(context, (ILibLoader.b) null);
        ARAuth.setAuthLicense(bArr, this.f7092a, this.b, this.c);
        if (this.d == null) {
            q0 q0Var = new q0("AsyncAuthenticator");
            this.d = q0Var;
            q0Var.a();
        }
        AuthJni.init();
        this.d.a(new a(context, bArr, iAuthenticateCallback));
    }

    @Override // com.baidu.ar.auth.IAuthenticator
    public void release() {
        ARAuth.release();
    }
}
