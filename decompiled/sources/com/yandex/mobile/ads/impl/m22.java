package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rh1;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m22 extends xd {
    public static final /* synthetic */ int h = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m22(Class<? super SSLSocket> sslSocketClass, Class<? super SSLSocketFactory> sslSocketFactoryClass, Class<?> paramClass) {
        super(sslSocketClass);
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
        Intrinsics.checkNotNullParameter(paramClass, "paramClass");
    }

    public static final class a {
        public static m22 a(String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> cls3 = Class.forName(packageName + ".SSLParametersImpl");
                Intrinsics.checkNotNull(cls3);
                return new m22(cls, cls2, cls3);
            } catch (Exception e) {
                int i = rh1.c;
                rh1.a.a().getClass();
                rh1.a(5, "unable to load android socket classes", e);
                return null;
            }
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }
}
