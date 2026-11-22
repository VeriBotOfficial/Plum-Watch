package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes17.dex */
public class BksUtil {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10821a = "BksUtil";
    private static final String b = "com.huawei.hwid";
    private static final String c = "com.huawei.hwid";
    private static final String d = "com.huawei.hms";
    private static final String e = "com.huawei.hwid.tv";
    private static final String g = "files/hmsrootcas.bks";
    private static final String h = "4.0.2.300";
    private static final String i = "aegis";
    private static final String j = "hmsrootcas.bks";
    private static final long k = 604800000;
    private static final String l = "last_update_time";
    private static final String m = "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05";
    private static final String n = "3517262215D8D3008CBF888750B6418EDC4D562AC33ED6874E0D73ABA667BC3C";

    /* renamed from: q, reason: collision with root package name */
    private static final String f10822q = "";
    private static final String r = "bks_hash";
    private static final Uri f = Uri.parse("content://com.huawei.hwid");
    private static final String o = "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539";
    private static final String[] p = {"B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05", o};

    private BksUtil() {
    }

    private static void a(InputStream inputStream, Context context) {
        FileOutputStream fileOutputStream;
        if (inputStream == null || context == null) {
            return;
        }
        String a2 = a(context);
        if (!new File(a2).exists()) {
            a(a2);
        }
        File file = new File(a2, "hmsrootcas.bks");
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                e.c(f10821a, "write output stream ");
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused) {
        }
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int read = inputStream.read(bArr, 0, 2048);
                if (read == -1) {
                    d.a((OutputStream) fileOutputStream);
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            e.b(f10821a, " IOException");
            d.a((OutputStream) fileOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            d.a((OutputStream) fileOutputStream2);
            throw th;
        }
    }

    private static boolean a(int i2) {
        return i2 >= 40002300;
    }

    private static String b(Context context) {
        return a(context) + File.separator + "hmsrootcas.bks";
    }

    private static boolean c(Context context) {
        return new File(a(context) + File.separator + "hmsrootcas.bks").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    public static synchronized InputStream getBksFromTss(Context context) {
        ByteArrayInputStream byteArrayInputStream;
        boolean z;
        ByteArrayInputStream byteArrayInputStream2;
        InputStream inputStream;
        ?? r0;
        ?? byteArrayOutputStream;
        String a2;
        String b2;
        synchronized (BksUtil.class) {
            e.c(f10821a, "get bks from tss begin");
            if (context != null) {
                ContextUtil.setContext(context);
            }
            Context contextUtil = ContextUtil.getInstance();
            ByteArrayInputStream byteArrayInputStream3 = null;
            if (contextUtil == null) {
                e.b(f10821a, com.anythink.expressad.foundation.g.b.b.f4836a);
                return null;
            }
            ?? b3 = b(f.a("com.huawei.hwid"));
            ByteArrayInputStream byteArrayInputStream4 = b3;
            if (b3 == 0) {
                ?? b4 = b(f.a("com.huawei.hms"));
                byteArrayInputStream4 = b4;
                if (b4 == 0) {
                    e.b(f10821a, "hms version code is too low : " + f.a("com.huawei.hwid"));
                    return null;
                }
            }
            boolean c2 = c(contextUtil, "com.huawei.hwid");
            boolean z2 = c2;
            if (!c2) {
                boolean b5 = b(contextUtil, "com.huawei.hms");
                z2 = b5;
                if (!b5) {
                    e.b(f10821a, "hms sign error");
                    return null;
                }
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th) {
                th = th;
                ByteArrayInputStream byteArrayInputStream5 = byteArrayInputStream4;
                byteArrayInputStream = null;
                byteArrayInputStream3 = byteArrayInputStream5;
                z = z2;
            }
            try {
                inputStream = contextUtil.getContentResolver().openInputStream(Uri.withAppendedPath(f, g));
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read <= -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArrayOutputStream.flush();
                    byteArrayInputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    a2 = g.a(r, "", contextUtil);
                    b2 = b(byteArrayOutputStream.toByteArray());
                } catch (Exception e3) {
                    e = e3;
                    byteArrayInputStream3 = byteArrayInputStream2;
                    e.b(f10821a, "Get bks from HMS_VERSION_CODE exception : No content provider" + e.getMessage());
                    d.a(inputStream);
                    d.a((OutputStream) byteArrayOutputStream);
                    d.a((InputStream) byteArrayInputStream3);
                    return getFilesBksIS(contextUtil);
                } catch (Throwable th2) {
                    th = th2;
                    r0 = byteArrayOutputStream;
                    d.a(inputStream);
                    d.a((OutputStream) r0);
                    d.a((InputStream) byteArrayInputStream2);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayInputStream = null;
                z = byteArrayOutputStream;
                byteArrayInputStream2 = byteArrayInputStream;
                inputStream = byteArrayInputStream3;
                r0 = z;
                d.a(inputStream);
                d.a((OutputStream) r0);
                d.a((InputStream) byteArrayInputStream2);
                throw th;
            }
            if (c(contextUtil) && a2.equals(b2)) {
                e.c(f10821a, "bks not update");
                d.a(inputStream);
                d.a((OutputStream) byteArrayOutputStream);
                d.a((InputStream) byteArrayInputStream2);
                return getFilesBksIS(contextUtil);
            }
            e.c(f10821a, "update bks and sp");
            a(byteArrayInputStream2, contextUtil);
            g.b(r, b2, contextUtil);
            d.a(inputStream);
            d.a((OutputStream) byteArrayOutputStream);
            d.a((InputStream) byteArrayInputStream2);
            return getFilesBksIS(contextUtil);
        }
    }

    public static InputStream getFilesBksIS(Context context) {
        if (!c(context)) {
            return null;
        }
        e.c(f10821a, "getFilesBksIS ");
        try {
            return new FileInputStream(b(context));
        } catch (FileNotFoundException unused) {
            e.b(f10821a, "FileNotFoundExceptio: ");
            return null;
        }
    }

    private static boolean b(String str) {
        int parseInt;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        e.c(f10821a, "hms version code is : " + str);
        String[] split = str.split("\\.");
        String[] split2 = h.split("\\.");
        int length = split.length;
        int length2 = split2.length;
        int max = Math.max(length, length2);
        int i2 = 0;
        while (i2 < max) {
            if (i2 < length) {
                try {
                    parseInt = Integer.parseInt(split[i2]);
                } catch (Exception e2) {
                    e.b(f10821a, " exception : " + e2.getMessage());
                    return i2 >= length2;
                }
            } else {
                parseInt = 0;
            }
            int parseInt2 = i2 < length2 ? Integer.parseInt(split2[i2]) : 0;
            if (parseInt < parseInt2) {
                return false;
            }
            if (parseInt > parseInt2) {
                return true;
            }
            i2++;
        }
        return true;
    }

    private static boolean c(Context context, String str) {
        byte[] a2 = a(context, str);
        for (String str2 : p) {
            if (str2.equalsIgnoreCase(c(a2))) {
                return true;
            }
        }
        return false;
    }

    private static String c(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                return a(MessageDigest.getInstance("SHA-256").digest(bArr));
            } catch (NoSuchAlgorithmException e2) {
                Log.e(f10821a, "NoSuchAlgorithmException" + e2.getMessage());
            }
        }
        return "";
    }

    private static boolean b(Context context, String str) {
        return o.equalsIgnoreCase(c(a(context, str)));
    }

    private static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        File file = new File(str);
        if (file.exists()) {
            e.e(f10821a, "The directory  has already exists");
            return 1;
        }
        if (file.mkdirs()) {
            e.a(f10821a, "create directory  success");
            return 0;
        }
        e.b(f10821a, "create directory  failed");
        return -1;
    }

    private static String b(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return a(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            e.b(f10821a, "inputstraem exception");
            return "";
        }
    }

    private static String a(Context context) {
        return context.createDeviceProtectedStorageContext().getFilesDir() + File.separator + i;
    }

    private static byte[] a(Context context, String str) {
        PackageInfo packageInfo;
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 64)) != null) {
                    return packageInfo.signatures[0].toByteArray();
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e(f10821a, "PackageManager.NameNotFoundException : " + e2.getMessage());
            } catch (Exception e3) {
                Log.e(f10821a, "get pm exception : " + e3.getMessage());
            }
            return new byte[0];
        }
        Log.e(f10821a, "packageName is null or context is null");
        return new byte[0];
    }

    private static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }
}
