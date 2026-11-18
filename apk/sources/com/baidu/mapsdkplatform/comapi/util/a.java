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

/* JADX INFO: compiled from: Cert.java */
/* JADX INFO: loaded from: classes15.dex */
public class a {

    /* JADX INFO: renamed from: com.baidu.mapsdkplatform.comapi.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Cert.java */
    static class C0469a {
        public static String a(byte[] bArr) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (int r2 = 0; r2 < bArr.length; r2++) {
                sb.append(cArr[(bArr[r2] & TransmissionUnpacked.HD_VAL_MAGIC_HB) >> 4]);
                sb.append(cArr[bArr[r2] & 15]);
            }
            return sb.toString();
        }
    }

    public static String a(Context context) {
        String packageName = context.getPackageName();
        return a(context, packageName) + ";" + packageName;
    }

    private static String a(Context context, String str) {
        String strA;
        Signature[] signingCertificateHistory;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                if (context.getPackageManager().getPackageInfo(str, 134217728).signingInfo.hasMultipleSigners()) {
                    signingCertificateHistory = context.getPackageManager().getPackageInfo(str, 134217728).signingInfo.getApkContentsSigners();
                } else {
                    signingCertificateHistory = context.getPackageManager().getPackageInfo(str, 134217728).signingInfo.getSigningCertificateHistory();
                }
            } else {
                signingCertificateHistory = context.getPackageManager().getPackageInfo(str, 64).signatures;
            }
            strA = a((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signingCertificateHistory[0].toByteArray())));
        } catch (Exception e) {
            e.printStackTrace();
            strA = "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int r0 = 0; r0 < strA.length(); r0++) {
            stringBuffer.append(strA.charAt(r0));
            if (r0 > 0 && r0 % 2 == 1 && r0 < strA.length() - 1) {
                stringBuffer.append(":");
            }
        }
        return stringBuffer.toString();
    }

    static String a(X509Certificate x509Certificate) {
        try {
            return C0469a.a(a(x509Certificate.getEncoded()));
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
