package com.xiaomi.push.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.autonavi.aps.amapapi.config.Const;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes4.dex */
public class ae {

    /* renamed from: a, reason: collision with root package name */
    private static long f14737a = 0;

    /* renamed from: a, reason: collision with other field name */
    private static boolean f992a = false;
    private static long b;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public long f14739a;

        /* renamed from: a, reason: collision with other field name */
        public Bitmap f994a;

        public b(Bitmap bitmap, long j) {
            this.f994a = bitmap;
            this.f14739a = j;
        }
    }

    public static b a(Context context, String str, boolean z) {
        ByteArrayInputStream byteArrayInputStream = null;
        b bVar = new b(null, 0L);
        try {
            try {
                Bitmap b2 = b(context, str);
                if (b2 != null) {
                    bVar.f994a = b2;
                    com.xiaomi.push.x.a((Closeable) null);
                    return bVar;
                }
                a a2 = a(str, z);
                if (a2 == null) {
                    com.xiaomi.push.x.a((Closeable) null);
                    return bVar;
                }
                bVar.f14739a = a2.f14738a;
                byte[] bArr = a2.f993a;
                if (bArr != null) {
                    if (z) {
                        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
                        try {
                            int a3 = a(context, byteArrayInputStream2);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = a3;
                            bVar.f994a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                            byteArrayInputStream = byteArrayInputStream2;
                        } catch (Exception e) {
                            e = e;
                            byteArrayInputStream = byteArrayInputStream2;
                            com.xiaomi.channel.commonutils.logger.b.a(e);
                            com.xiaomi.push.x.a((Closeable) byteArrayInputStream);
                            return bVar;
                        } catch (Throwable th) {
                            th = th;
                            byteArrayInputStream = byteArrayInputStream2;
                            com.xiaomi.push.x.a((Closeable) byteArrayInputStream);
                            throw th;
                        }
                    } else {
                        bVar.f994a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    }
                }
                a(context, a2.f993a, str);
                com.xiaomi.push.x.a((Closeable) byteArrayInputStream);
                return bVar;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f14738a;

        /* renamed from: a, reason: collision with other field name */
        byte[] f993a;

        public a(byte[] bArr, int i) {
            this.f993a = bArr;
            this.f14738a = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0100, code lost:
    
        if (r3 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0103, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r3.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00df, code lost:
    
        if (r3 == null) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.xiaomi.push.service.ae.a a(java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.ae.a(java.lang.String, boolean):com.xiaomi.push.service.ae$a");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public static Bitmap a(Context context, String str) {
        InputStream inputStream;
        InputStream inputStream2;
        Uri parse = Uri.parse(str);
        ?? r0 = 0;
        r0 = 0;
        try {
            try {
                inputStream = context.getContentResolver().openInputStream(parse);
            } catch (Throwable th) {
                th = th;
                r0 = context;
            }
        } catch (IOException e) {
            e = e;
            inputStream2 = null;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            int a2 = a(context, inputStream);
            inputStream2 = context.getContentResolver().openInputStream(parse);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = a2;
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream2, null, options);
                com.xiaomi.push.x.a((Closeable) inputStream2);
                com.xiaomi.push.x.a((Closeable) inputStream);
                return decodeStream;
            } catch (IOException e2) {
                e = e2;
                com.xiaomi.channel.commonutils.logger.b.a(e);
                com.xiaomi.push.x.a((Closeable) inputStream2);
                com.xiaomi.push.x.a((Closeable) inputStream);
                return null;
            }
        } catch (IOException e3) {
            e = e3;
            inputStream2 = null;
        } catch (Throwable th3) {
            th = th3;
            com.xiaomi.push.x.a((Closeable) r0);
            com.xiaomi.push.x.a((Closeable) inputStream);
            throw th;
        }
    }

    private static int a(Context context, InputStream inputStream) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("decode dimension failed for bitmap.");
            return 1;
        }
        int round = Math.round((context.getResources().getDisplayMetrics().densityDpi / 160.0f) * 48.0f);
        if (options.outWidth <= round || options.outHeight <= round) {
            return 1;
        }
        return Math.min(options.outWidth / round, options.outHeight / round);
    }

    private static synchronized Bitmap b(Context context, String str) {
        Bitmap bitmap;
        File file;
        synchronized (ae.class) {
            FileInputStream fileInputStream = null;
            Bitmap bitmap2 = null;
            try {
                file = new File(a(context), com.xiaomi.push.bc.a(str));
            } catch (Throwable th) {
                th = th;
                bitmap = null;
            }
            if (!file.exists()) {
                return null;
            }
            if (System.currentTimeMillis() - file.lastModified() > Const.L_MAX_HM) {
                com.xiaomi.channel.commonutils.logger.b.m11781a("The pic cache has expired.");
                return null;
            }
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                bitmap2 = BitmapFactory.decodeStream(fileInputStream2);
                file.setLastModified(System.currentTimeMillis());
                com.xiaomi.push.x.a((Closeable) fileInputStream2);
            } catch (Throwable th2) {
                Bitmap bitmap3 = bitmap2;
                fileInputStream = fileInputStream2;
                th = th2;
                bitmap = bitmap3;
                try {
                    com.xiaomi.channel.commonutils.logger.b.d("Load bmp from cache error: " + th);
                    bitmap2 = bitmap;
                    return bitmap2;
                } finally {
                    com.xiaomi.push.x.a((Closeable) fileInputStream);
                }
            }
            return bitmap2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.io.Closeable, java.io.FileOutputStream, java.io.OutputStream] */
    private static void a(Context context, byte[] bArr, String str) {
        File file;
        BufferedOutputStream bufferedOutputStream;
        if (bArr == null) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("cannot save small icon cause bitmap is null");
            return;
        }
        m12410a(context);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                File file2 = new File(a(context));
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file = new File(file2, com.xiaomi.push.bc.a((String) str));
                if (!file.exists()) {
                    file.createNewFile();
                }
                str = new FileOutputStream(file);
                try {
                    bufferedOutputStream = new BufferedOutputStream(str);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.flush();
                f14737a += file.length();
                long j = b;
                if (j <= 0) {
                    b = file.lastModified();
                } else {
                    b = Math.min(j, file.lastModified());
                }
                com.xiaomi.push.x.a(bufferedOutputStream);
                com.xiaomi.push.x.a((Closeable) str);
            } catch (Exception e2) {
                e = e2;
                bufferedOutputStream2 = bufferedOutputStream;
                com.xiaomi.channel.commonutils.logger.b.d("Save pic error: " + e);
                com.xiaomi.push.x.a(bufferedOutputStream2);
                com.xiaomi.push.x.a((Closeable) str);
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                com.xiaomi.push.x.a(bufferedOutputStream2);
                com.xiaomi.push.x.a((Closeable) str);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            str = 0;
        } catch (Throwable th3) {
            th = th3;
            str = 0;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static synchronized void m12410a(Context context) {
        File file;
        long j;
        synchronized (ae.class) {
            b(context);
            if (f14737a >= 62914560 || System.currentTimeMillis() - b >= Const.L_MAX_HM) {
                try {
                    file = new File(a(context));
                } catch (Throwable th) {
                    com.xiaomi.channel.commonutils.logger.b.d("Clear pic cache error: " + th);
                }
                if (!file.exists()) {
                    com.xiaomi.channel.commonutils.logger.b.m11781a("The pic cache dir do not exists.");
                    return;
                }
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    a(listFiles);
                    long j2 = f14737a;
                    int length = listFiles.length - 1;
                    while (true) {
                        if (length < 0) {
                            j = 0;
                            break;
                        }
                        File file2 = listFiles[length];
                        if (file2 != null) {
                            if (j2 <= 31457280 && System.currentTimeMillis() - file2.lastModified() <= 864000000) {
                                j = file2.lastModified();
                                break;
                            }
                            j2 -= file2.length();
                            file2.delete();
                        }
                        length--;
                    }
                    f14737a = Math.max(j2, 0L);
                    b = j;
                } else {
                    com.xiaomi.channel.commonutils.logger.b.m11781a("The pic cache file list is null.");
                }
            }
        }
    }

    private static synchronized void b(Context context) {
        String str;
        File file;
        synchronized (ae.class) {
            if (f992a) {
                return;
            }
            f14737a = 0L;
            b = 0L;
            try {
                file = new File(a(context));
            } catch (Throwable th) {
                try {
                    com.xiaomi.channel.commonutils.logger.b.d("Init pic cache error: " + th);
                    f992a = true;
                    str = "Init pic cache finish.";
                } finally {
                    f992a = true;
                    com.xiaomi.channel.commonutils.logger.b.b("Init pic cache finish.");
                }
            }
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        f14737a += file2.length();
                        long j = b;
                        if (j <= 0) {
                            b = file2.lastModified();
                        } else {
                            b = Math.min(j, file2.lastModified());
                        }
                    }
                }
                f992a = true;
                str = "Init pic cache finish.";
                com.xiaomi.channel.commonutils.logger.b.b(str);
            }
        }
    }

    private static void a(File[] fileArr) {
        if (fileArr != null) {
            try {
                if (fileArr.length > 1) {
                    Arrays.sort(fileArr, new Comparator<File>() { // from class: com.xiaomi.push.service.ae.1
                        @Override // java.util.Comparator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public int compare(File file, File file2) {
                            if (file == file2) {
                                return 0;
                            }
                            if (file == null) {
                                return 1;
                            }
                            if (file2 == null) {
                                return -1;
                            }
                            long lastModified = file.lastModified() - file2.lastModified();
                            if (lastModified == 0) {
                                return 0;
                            }
                            return lastModified < 0 ? 1 : -1;
                        }
                    });
                }
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.d("Sort pic cache error: " + th);
            }
        }
    }

    private static String a(Context context) {
        return context.getCacheDir().getPath() + File.separator + "mipush_icon";
    }
}
