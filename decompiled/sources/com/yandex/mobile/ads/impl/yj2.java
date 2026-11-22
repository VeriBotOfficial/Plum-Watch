package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Build;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.yandex.mobile.ads.impl.pw1;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class yj2 implements xj2 {

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f17428a = LazyKt.lazy(a.b);

    static final class a extends Lambda implements Function0<CertificateFactory> {
        public static final a b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CertificateFactory invoke() {
            return CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
        }
    }

    @Override // com.yandex.mobile.ads.impl.xj2
    public final boolean a(Context context, SslError sslError) {
        X509Certificate a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sslError, "sslError");
        int i = pw1.l;
        ju1 a3 = pw1.a.a().a(context);
        if (a3 != null && a3.l0()) {
            if (Build.VERSION.SDK_INT >= 29) {
                a2 = sslError.getCertificate().getX509Certificate();
            } else {
                SslCertificate certificate = sslError.getCertificate();
                Intrinsics.checkNotNullExpressionValue(certificate, "getCertificate(...)");
                Object value = this.f17428a.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                a2 = bt1.a(certificate, (CertificateFactory) value);
            }
            if (a2 == null) {
                return false;
            }
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                pr0.a(new iu1(context)).checkServerTrusted(new X509Certificate[]{a2}, "RSA");
                return true;
            } catch (Exception unused) {
                Object[] args = new Object[0];
                int i2 = sp0.b;
                Intrinsics.checkNotNullParameter(args, "args");
            }
        }
        return false;
    }
}
