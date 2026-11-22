package com.baidu.mapsdkplatform.comapi.util;

import android.content.Context;
import android.content.pm.Signature;
import android.os.Build;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* compiled from: Cert.java */
/* loaded from: classes13.dex */
public class a {

    /* compiled from: Cert.java */
    /* renamed from: com.baidu.mapsdkplatform.comapi.util.a$a, reason: collision with other inner class name */
    static class C0382a {
        public static String a(byte[] bArr) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (int i = 0; i < bArr.length; i++) {
                sb.append(cArr[(bArr[i] & TransmissionUnpacked.HD_VAL_MAGIC_HB) >> 4]);
                sb.append(cArr[bArr[i] & 15]);
            }
            return sb.toString();
        }
    }

    public static String a(Context context) {
        String packageName = context.getPackageName();
        return a(context, packageName) + ";" + packageName;
    }

    private static String a(Context context, String str) {
        String str2;
        Signature[] signatureArr;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                if (context.getPackageManager().getPackageInfo(str, 134217728).signingInfo.hasMultipleSigners()) {
                    signatureArr = context.getPackageManager().getPackageInfo(str, 134217728).signingInfo.getApkContentsSigners();
                } else {
                    signatureArr = context.getPackageManager().getPackageInfo(str, 134217728).signingInfo.getSigningCertificateHistory();
                }
            } else {
                signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            }
            str2 = a((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray())));
        } catch (Exception e) {
            e.printStackTrace();
            str2 = "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str2.length(); i++) {
            stringBuffer.append(str2.charAt(i));
            if (i > 0 && i % 2 == 1 && i < str2.length() - 1) {
                stringBuffer.append(":");
            }
        }
        return stringBuffer.toString();
    }

    static String a(X509Certificate x509Certificate) {
        try {
            return C0382a.a(a(x509Certificate.getEncoded()));
        } catch (CertificateEncodingException unused) {
            return null;
        }
    }

    static byte[] a(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA1").digest(bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
