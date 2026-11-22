package com.pgl.ssdk;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.baidu.ar.sa;
import com.phancy.mini.api.file.FileSystemManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static volatile String f12765a = null;
    private static volatile String b = null;
    private static volatile boolean c = false;
    private static String d = null;
    private static String e = null;
    private static String f = null;
    private static int g = -1;
    private static long h = 0;
    private static long i = 0;
    private static volatile long j = -1;

    public static void a(File file, boolean z) {
        e a2;
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                try {
                    if (TextUtils.isEmpty(f12765a) && (a2 = a(file)) != null) {
                        f12765a = a(a2.a());
                        d = a2.b();
                        if (z) {
                            a();
                            randomAccessFile2.close();
                            return;
                        }
                    }
                    if (TextUtils.isEmpty(e)) {
                        e = a(randomAccessFile2);
                    }
                    if (h == 0) {
                        h = randomAccessFile2.length() / 1024;
                    }
                    if (i == 0) {
                        i = b(file);
                    }
                    randomAccessFile2.close();
                } catch (FileNotFoundException unused) {
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (IOException unused2) {
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused4) {
            }
        } catch (FileNotFoundException unused5) {
        } catch (IOException unused6) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String b() {
        long j2;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        long j3;
        long j4;
        int i2;
        String str5;
        if (TextUtils.isEmpty(f12765a) || TextUtils.isEmpty(e) || g == -1) {
            SharedPreferences a2 = ax.a(z.b());
            long j5 = -1;
            if (a2 != null) {
                j5 = a2.getLong("mt", -1L);
                str2 = a2.getString(sa.e, null);
                str3 = a2.getString("sj", null);
                str4 = a2.getString(FileSystemManager.DIGEST_MD5, null);
                j3 = a2.getLong("as", 0L);
                j4 = a2.getLong("ds", 0L);
                z = true;
                i2 = a2.getInt(com.qumeng.overseas.advlib.__remote__.framework.imageloader.j.e, -1);
                j2 = 0;
                str = a2.getString("ap", null);
            } else {
                j2 = 0;
                z = true;
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                j3 = 0;
                j4 = 0;
                i2 = 0;
            }
            String c2 = c();
            if (c2 == null) {
                return null;
            }
            File file = new File(c2);
            str5 = null;
            Object[] objArr = (Object[]) com.pgl.ssdk.ces.a.meta(158, z.b(), c2);
            Integer num = (Integer) objArr[0];
            String str6 = (String) objArr[z ? 1 : 0];
            long lastModified = file.lastModified();
            if (lastModified != j5 || str2 == null || i2 == -1) {
                j = lastModified;
                if (str6 != null) {
                    f = str6;
                }
                if (num != null) {
                    g = num.intValue();
                }
                a(file, false);
                a();
            } else {
                f12765a = str2;
                d = str3;
                h = j3;
                i = j4;
                e = str4;
                g = i2;
                f = str;
            }
        } else {
            j2 = 0;
            str5 = null;
            z = true;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f12765a)) {
                jSONObject.put("sign", f12765a);
            }
            if (!TextUtils.isEmpty(d)) {
                jSONObject.put("subject", d);
            }
            if (!TextUtils.isEmpty(e)) {
                jSONObject.put(FileSystemManager.DIGEST_MD5, e);
            }
            if (!TextUtils.isEmpty(f)) {
                jSONObject.put("path", f);
            }
            long j6 = h;
            if (j6 != j2) {
                jSONObject.put("apkSize", j6);
            }
            long j7 = i;
            if (j7 != j2) {
                jSONObject.put("dexSize", j7);
            }
            int i3 = g;
            if (i3 != -1) {
                jSONObject.put("code", i3);
            }
            f();
            jSONObject.put("signpm", b);
            if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(f12765a)) {
                if (!b.equals(f12765a)) {
                    c = z;
                }
                jSONObject.put("rebud", c);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str5;
        }
    }

    public static String c() {
        if (z.b() == null) {
            return null;
        }
        String packageCodePath = z.b().getPackageCodePath();
        if (TextUtils.isEmpty(packageCodePath)) {
            return null;
        }
        File file = new File(packageCodePath);
        if (file.exists() && file.canRead()) {
            return packageCodePath;
        }
        return null;
    }

    public static void d() {
        if (TextUtils.isEmpty(f12765a)) {
            SharedPreferences a2 = ax.a(z.b());
            String str = null;
            long j2 = -1;
            if (a2 != null) {
                j2 = a2.getLong("mt", -1L);
                str = a2.getString(sa.e, null);
            }
            String c2 = c();
            if (TextUtils.isEmpty(c2)) {
                return;
            }
            File file = new File(c2);
            long lastModified = file.lastModified();
            if (lastModified != j2 || str == null) {
                j = lastModified;
                a(file, true);
                a();
            } else {
                f12765a = str;
            }
        }
        f();
        if (TextUtils.isEmpty(b) || TextUtils.isEmpty(f12765a) || b.equals(f12765a)) {
            return;
        }
        c = true;
    }

    public static String e() {
        d();
        return f12765a;
    }

    public static String f() {
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        try {
            String a2 = a(z.b().getPackageManager().getPackageInfo(z.b().getPackageName(), 64).signatures[0].toByteArray());
            b = a2;
            return a2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        d();
        return c;
    }

    public static void a() {
        SharedPreferences a2 = ax.a(z.b());
        if (a2 != null) {
            if (!TextUtils.isEmpty(f12765a)) {
                a2.edit().putString(sa.e, f12765a).apply();
            }
            if (!TextUtils.isEmpty(e)) {
                a2.edit().putString(FileSystemManager.DIGEST_MD5, e).apply();
            }
            if (!TextUtils.isEmpty(d)) {
                a2.edit().putString("sj", d).apply();
            }
            if (h != 0) {
                a2.edit().putLong("as", h).apply();
            }
            if (i != 0) {
                a2.edit().putLong("ds", i).apply();
            }
            if (j != -1) {
                a2.edit().putLong("mt", j).apply();
            }
            if (g != -1) {
                a2.edit().putInt(com.qumeng.overseas.advlib.__remote__.framework.imageloader.j.e, g).apply();
            }
            if (TextUtils.isEmpty(f)) {
                return;
            }
            a2.edit().putString("ap", f).apply();
        }
    }

    public static long b(File file) {
        String format;
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(file);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 == 0) {
                        format = "classes.dex";
                    } else {
                        format = String.format(Locale.getDefault(), "classes%d.dex", Integer.valueOf(i2));
                    }
                    ZipEntry entry = zipFile2.getEntry(format);
                    if (entry == null) {
                        break;
                    }
                    try {
                        i3 = (int) (i3 + entry.getSize());
                        i2++;
                    } catch (ZipException unused) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (IOException unused2) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                long j2 = i3 / 1000;
                try {
                    zipFile2.close();
                } catch (IOException unused4) {
                }
                return j2;
            } catch (IOException unused5) {
                return 0L;
            }
        } catch (ZipException unused6) {
        } catch (IOException unused7) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(bArr);
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3).toUpperCase());
                sb.append(":");
            }
            return sb.substring(0, sb.length() - 1);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @com.pgl.ssdk.ces.out.DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.pgl.ssdk.e a(java.io.File r6) {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L1e com.pgl.ssdk.g.a -> L25
            java.lang.String r2 = "r"
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L1e com.pgl.ssdk.g.a -> L25
            long r2 = r1.length()     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.g.a -> L26
            r4 = 0
            com.pgl.ssdk.q r2 = com.pgl.ssdk.r.a(r1, r4, r2)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.g.a -> L26
            com.pgl.ssdk.c$a r3 = com.pgl.ssdk.c.a(r2)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.g.a -> L26
            java.util.List r2 = com.pgl.ssdk.l.a(r2, r3)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.g.a -> L26
            r1.close()     // Catch: java.io.IOException -> L2c
            goto L2c
        L1e:
            r1 = r0
        L1f:
            if (r1 == 0) goto L2b
            r1.close()     // Catch: java.io.IOException -> L2b
            goto L2b
        L25:
            r1 = r0
        L26:
            if (r1 == 0) goto L2b
            r1.close()     // Catch: java.io.IOException -> L2b
        L2b:
            r2 = r0
        L2c:
            if (r2 == 0) goto L34
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L38
        L34:
            java.util.List r2 = com.pgl.ssdk.k.a(r6)
        L38:
            if (r2 == 0) goto L48
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L48
            r6 = 0
            java.lang.Object r6 = r2.get(r6)
            com.pgl.ssdk.e r6 = (com.pgl.ssdk.e) r6
            return r6
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.v.a(java.io.File):com.pgl.ssdk.e");
    }

    public static String a(RandomAccessFile randomAccessFile) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1048576];
            while (true) {
                int read = randomAccessFile.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0".concat(String.valueOf(bigInteger));
            }
            return bigInteger;
        } catch (FileNotFoundException | IOException | NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
