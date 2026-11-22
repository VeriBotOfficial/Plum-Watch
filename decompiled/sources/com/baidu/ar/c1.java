package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.auth.ARAuth;
import com.baidu.ar.auth.IAuthenticateCallback;
import com.baidu.ar.auth.IAuthenticator;
import com.baidu.ar.auth.IDuMixAuthCallback;
import com.baidu.ar.libloader.ILibLoader;
import java.util.List;

/* loaded from: classes12.dex */
public class c1 implements IAuthenticator {

    /* renamed from: a, reason: collision with root package name */
    public static volatile c1 f6834a;

    public class a implements IDuMixAuthCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f6835a;
        public final /* synthetic */ List[] b;
        public final /* synthetic */ IAuthenticateCallback c;

        public a(c1 c1Var, Context context, List[] listArr, IAuthenticateCallback iAuthenticateCallback) {
            this.f6835a = context;
            this.b = listArr;
            this.c = iAuthenticateCallback;
        }

        @Override // com.baidu.ar.auth.IDuMixAuthCallback
        public void onAvailFeaturesUpdate(List<Integer> list) {
            this.b[0] = list;
            IAuthenticateCallback iAuthenticateCallback = this.c;
            if (iAuthenticateCallback != null) {
                iAuthenticateCallback.onAvailFeaturesChanged(list);
            }
        }

        @Override // com.baidu.ar.auth.IDuMixAuthCallback
        public void onFeatureRejected(int i) {
            IAuthenticateCallback iAuthenticateCallback = this.c;
            if (iAuthenticateCallback != null) {
                iAuthenticateCallback.onFeatureRejected(i);
            }
        }

        @Override // com.baidu.ar.auth.IDuMixAuthCallback
        public void onResult(boolean z) {
            if (z) {
                ARAuth.doAuth(this.f6835a, null);
            } else {
                this.b[0].clear();
            }
            IAuthenticateCallback iAuthenticateCallback = this.c;
            if (iAuthenticateCallback != null) {
                iAuthenticateCallback.onResult(z, this.b[0]);
            }
        }
    }

    public static c1 a() {
        if (f6834a == null) {
            f6834a = new c1();
        }
        return f6834a;
    }

    @Override // com.baidu.ar.auth.IAuthenticator
    public void init(Context context, byte[] bArr) {
        init(context, bArr, null);
    }

    @Override // com.baidu.ar.auth.IAuthenticator
    public void init(Context context, byte[] bArr, IAuthenticateCallback iAuthenticateCallback) {
        com.baidu.ar.libloader.a.a(context, (ILibLoader.b) null);
        List[] listArr = new List[1];
        listArr[0] = ARAuth.checkAuth(context, bArr, new a(this, context, listArr, iAuthenticateCallback));
    }

    @Override // com.baidu.ar.auth.IAuthenticator
    public void release() {
        ARAuth.release();
    }
}
