package com.baidu.lbsapi.auth;

import android.content.Context;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Locale;

/* loaded from: classes13.dex */
class d {

    static class a {
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

    static String a() {
        return Locale.getDefault().getLanguage();
    }

    protected static String a(Context context) {
        String packageName = context.getPackageName();
        return a(context, packageName) + ";" + packageName;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096 A[LOOP:0: B:12:0x0096->B:22:0x00b6, LOOP_START, PHI: r1
      0x0096: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:11:0x0094, B:22:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "getFingerPrint："
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            r3 = 28
            r4 = 64
            if (r2 < r3) goto L48
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            r3 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r6, r3)     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            android.content.pm.SigningInfo r2 = r2.signingInfo     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            if (r2 != 0) goto L24
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r6, r4)     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
        L21:
            android.content.pm.Signature[] r5 = r5.signatures     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            goto L51
        L24:
            boolean r2 = r2.hasMultipleSigners()     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            if (r2 == 0) goto L39
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r6, r3)     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            android.content.pm.SigningInfo r5 = r5.signingInfo     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            android.content.pm.Signature[] r5 = r5.getApkContentsSigners()     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            goto L51
        L39:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r6, r3)     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            android.content.pm.SigningInfo r5 = r5.signingInfo     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            android.content.pm.Signature[] r5 = r5.getSigningCertificateHistory()     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            goto L51
        L48:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r6, r4)     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            goto L21
        L51:
            java.lang.String r6 = "X.509"
            java.security.cert.CertificateFactory r6 = java.security.cert.CertificateFactory.getInstance(r6)     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            r5 = r5[r1]     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            byte[] r5 = r5.toByteArray()     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            r2.<init>(r5)     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            java.security.cert.Certificate r5 = r6.generateCertificate(r2)     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            java.lang.String r5 = a(r5)     // Catch: java.security.cert.CertificateException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L78
            goto L8f
        L6d:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            java.lang.String r5 = r5.toString()
            goto L82
        L78:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            java.lang.String r5 = r5.toString()
        L82:
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            com.baidu.lbsapi.auth.b.a(r5)
            java.lang.String r5 = ""
        L8f:
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            r6.<init>()
            if (r5 == 0) goto Lb9
        L96:
            int r0 = r5.length()
            if (r1 >= r0) goto Lb9
            char r0 = r5.charAt(r1)
            r6.append(r0)
            if (r1 <= 0) goto Lb6
            int r0 = r1 % 2
            r2 = 1
            if (r0 != r2) goto Lb6
            int r0 = r5.length()
            int r0 = r0 - r2
            if (r1 >= r0) goto Lb6
            java.lang.String r0 = ":"
            r6.append(r0)
        Lb6:
            int r1 = r1 + 1
            goto L96
        Lb9:
            java.lang.String r5 = r6.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.lbsapi.auth.d.a(android.content.Context, java.lang.String):java.lang.String");
    }

    static String a(X509Certificate x509Certificate) {
        try {
            return a.a(a(x509Certificate.getEncoded()));
        } catch (CertificateEncodingException e) {
            b.a("getFingerprintAs：" + e.toString());
            return null;
        }
    }

    static byte[] a(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA1").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            b.a("generateSHA1：" + e.toString());
            return null;
        }
    }

    protected static String[] b(Context context) {
        String packageName = context.getPackageName();
        String[] b = b(context, packageName);
        if (b == null || b.length <= 0) {
            return null;
        }
        int length = b.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = b[i] + ";" + packageName;
            if (b.f7488a) {
                b.a("mcode" + strArr[i]);
            }
        }
        return strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String[] b(android.content.Context r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "getFingerPrint："
            r1 = 0
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.security.cert.CertificateException -> L70 android.content.pm.PackageManager.NameNotFoundException -> L7c
            r4 = 28
            r5 = 64
            if (r3 < r4) goto L35
            android.content.pm.PackageManager r3 = r7.getPackageManager()     // Catch: java.security.cert.CertificateException -> L70 android.content.pm.PackageManager.NameNotFoundException -> L7c
            r4 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r8, r4)     // Catch: java.security.cert.CertificateException -> L70 android.content.pm.PackageManager.NameNotFoundException -> L7c
            android.content.pm.SigningInfo r3 = r3.signingInfo     // Catch: java.security.cert.CertificateException -> L70 android.content.pm.PackageManager.NameNotFoundException -> L7c
            if (r3 != 0) goto L25
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.security.cert.CertificateException -> L70 android.content.pm.PackageManager.NameNotFoundException -> L7c
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r8, r5)     // Catch: java.security.cert.CertificateException -> L70 android.content.pm.PackageManager.NameNotFoundException -> L7c
        L22:
            android.content.pm.Signature[] r7 = r7.signatures     // Catch: java.security.cert.CertificateException -> L70 android.content.pm.PackageManager.NameNotFoundException -> L7c
            goto L3e
        L25:
            boolean r7 = r3.hasMultipleSigners()     // Catch: java.security.cert.CertificateException -> L70 android.content.pm.PackageManager.NameNotFoundException -> L7c
            if (r7 == 0) goto L30
            android.content.pm.Signature[] r7 = r3.getApkContentsSigners()     // Catch: java.security.cert.CertificateException -> L70 android.content.pm.PackageManager.NameNotFoundException -> L7c
            goto L3e
        L30:
            android.content.pm.Signature[] r7 = r3.getSigningCertificateHistory()     // Catch: java.security.cert.CertificateException -> L70 android.content.pm.PackageManager.NameNotFoundException -> L7c
            goto L3e
        L35:
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.security.cert.CertificateException -> L70 android.content.pm.PackageManager.NameNotFoundException -> L7c
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r8, r5)     // Catch: java.security.cert.CertificateException -> L70 android.content.pm.PackageManager.NameNotFoundException -> L7c
            goto L22
        L3e:
            if (r7 == 0) goto L6e
            int r8 = r7.length     // Catch: java.security.cert.CertificateException -> L70 android.content.pm.PackageManager.NameNotFoundException -> L7c
            if (r8 <= 0) goto L6e
            int r8 = r7.length     // Catch: java.security.cert.CertificateException -> L70 android.content.pm.PackageManager.NameNotFoundException -> L7c
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch: java.security.cert.CertificateException -> L70 android.content.pm.PackageManager.NameNotFoundException -> L7c
            r3 = r1
        L47:
            int r4 = r7.length     // Catch: java.security.cert.CertificateException -> L6a android.content.pm.PackageManager.NameNotFoundException -> L6c
            if (r3 >= r4) goto L92
            java.lang.String r4 = "X.509"
            java.security.cert.CertificateFactory r4 = java.security.cert.CertificateFactory.getInstance(r4)     // Catch: java.security.cert.CertificateException -> L6a android.content.pm.PackageManager.NameNotFoundException -> L6c
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch: java.security.cert.CertificateException -> L6a android.content.pm.PackageManager.NameNotFoundException -> L6c
            r6 = r7[r3]     // Catch: java.security.cert.CertificateException -> L6a android.content.pm.PackageManager.NameNotFoundException -> L6c
            byte[] r6 = r6.toByteArray()     // Catch: java.security.cert.CertificateException -> L6a android.content.pm.PackageManager.NameNotFoundException -> L6c
            r5.<init>(r6)     // Catch: java.security.cert.CertificateException -> L6a android.content.pm.PackageManager.NameNotFoundException -> L6c
            java.security.cert.Certificate r4 = r4.generateCertificate(r5)     // Catch: java.security.cert.CertificateException -> L6a android.content.pm.PackageManager.NameNotFoundException -> L6c
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4     // Catch: java.security.cert.CertificateException -> L6a android.content.pm.PackageManager.NameNotFoundException -> L6c
            java.lang.String r4 = a(r4)     // Catch: java.security.cert.CertificateException -> L6a android.content.pm.PackageManager.NameNotFoundException -> L6c
            r8[r3] = r4     // Catch: java.security.cert.CertificateException -> L6a android.content.pm.PackageManager.NameNotFoundException -> L6c
            int r3 = r3 + 1
            goto L47
        L6a:
            r7 = move-exception
            goto L72
        L6c:
            r7 = move-exception
            goto L7e
        L6e:
            r8 = r2
            goto L92
        L70:
            r7 = move-exception
            r8 = r2
        L72:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r7 = r7.toString()
            goto L87
        L7c:
            r7 = move-exception
            r8 = r2
        L7e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r7 = r7.toString()
        L87:
            java.lang.StringBuilder r7 = r3.append(r7)
            java.lang.String r7 = r7.toString()
            com.baidu.lbsapi.auth.b.a(r7)
        L92:
            if (r8 == 0) goto Ld6
            int r7 = r8.length
            if (r7 <= 0) goto Ld6
            int r7 = r8.length
            java.lang.String[] r2 = new java.lang.String[r7]
            r7 = r1
        L9b:
            int r0 = r8.length
            if (r7 >= r0) goto Ld6
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r3 = r1
        La4:
            r4 = r8[r7]
            if (r4 == 0) goto Lcd
            int r4 = r4.length()
            if (r3 >= r4) goto Lcd
            r4 = r8[r7]
            char r4 = r4.charAt(r3)
            r0.append(r4)
            int r4 = r3 % 2
            r5 = 1
            if (r4 != r5) goto Lca
            r4 = r8[r7]
            int r4 = r4.length()
            int r4 = r4 - r5
            if (r3 >= r4) goto Lca
            java.lang.String r4 = ":"
            r0.append(r4)
        Lca:
            int r3 = r3 + 1
            goto La4
        Lcd:
            java.lang.String r0 = r0.toString()
            r2[r7] = r0
            int r7 = r7 + 1
            goto L9b
        Ld6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.lbsapi.auth.d.b(android.content.Context, java.lang.String):java.lang.String[]");
    }
}
