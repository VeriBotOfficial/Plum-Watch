package com.yandex.mobile.ads.impl;

import android.net.http.SslCertificate;
import android.os.Bundle;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bt1 {
    public static final X509Certificate a(SslCertificate sslCertificate, CertificateFactory x509CertificateFactory) {
        byte[] byteArray;
        Intrinsics.checkNotNullParameter(sslCertificate, "<this>");
        Intrinsics.checkNotNullParameter(x509CertificateFactory, "x509CertificateFactory");
        if (!Intrinsics.areEqual(x509CertificateFactory.getType(), AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509)) {
            String str = "Wrong certificateFactory.\nExpected type: X.509\nActual type: " + x509CertificateFactory.getType();
            sp0.b(new Object[0]);
            return null;
        }
        Bundle saveState = SslCertificate.saveState(sslCertificate);
        if (saveState != null && (byteArray = saveState.getByteArray("x509-certificate")) != null) {
            try {
                Certificate generateCertificate = x509CertificateFactory.generateCertificate(new ByteArrayInputStream(byteArray));
                if (generateCertificate instanceof X509Certificate) {
                    return (X509Certificate) generateCertificate;
                }
                return null;
            } catch (CertificateException unused) {
                sp0.c(new Object[0]);
            }
        }
        return null;
    }
}
