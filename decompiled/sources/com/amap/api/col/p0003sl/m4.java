package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

/* compiled from: MapAssetsResourceLoader.java */
/* loaded from: classes11.dex */
public class m4 {

    /* renamed from: a, reason: collision with root package name */
    private static String f1765a;
    private static boolean b = new File("/system/framework/amap.jar").exists();
    private static volatile AssetManager c;

    private m4() {
    }

    private static AssetManager a(Context context) {
        if (context == null) {
            return null;
        }
        if (!b) {
            return context.getAssets();
        }
        if (c != null) {
            return c;
        }
        synchronized (m4.class) {
            if (c != null) {
                return c;
            }
            AssetManager assets = context.getAssets();
            try {
                Method declaredMethod = assets.getClass().getDeclaredMethod("addAssetPath", String.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(assets, "/system/framework/amap.jar");
            } catch (Throwable th) {
                ja.a(th, "MapAssetsResourceLoader", "addAssetPath");
            }
            c = assets;
            return assets;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    public static Bitmap b(Context context, String str) {
        InputStream inputStream;
        ?? r0 = 0;
        try {
            if (str == null) {
                return null;
            }
            try {
                inputStream = f(context, str);
                if (inputStream == null) {
                    a(inputStream);
                    return null;
                }
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                    a(inputStream);
                    return decodeStream;
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    a(inputStream);
                    return null;
                }
            } catch (IOException e2) {
                e = e2;
                inputStream = null;
            } catch (Throwable th) {
                th = th;
                a((Closeable) r0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r0 = context;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    public static byte[] c(Context context, String str) {
        InputStream inputStream;
        ?? r0 = 0;
        try {
            if (str == null) {
                return null;
            }
            try {
                inputStream = f(context, str);
                if (inputStream == null) {
                    a(inputStream);
                    return null;
                }
                try {
                    int available = inputStream.available();
                    if (available == 0) {
                        a(inputStream);
                        return null;
                    }
                    byte[] bArr = new byte[available];
                    for (int i = 0; i < available; i += inputStream.read(bArr, i, available - i)) {
                    }
                    a(inputStream);
                    return bArr;
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    a(inputStream);
                    return null;
                } catch (OutOfMemoryError e2) {
                    e = e2;
                    e.printStackTrace();
                    a(inputStream);
                    return null;
                }
            } catch (IOException e3) {
                e = e3;
                inputStream = null;
            } catch (OutOfMemoryError e4) {
                e = e4;
                inputStream = null;
            } catch (Throwable th) {
                th = th;
                a((Closeable) r0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r0 = context;
        }
    }

    public static InputStream d(Context context, String str) {
        if (str == null) {
            return null;
        }
        try {
            return f(context, str);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String e(Context context, String str) {
        InputStream d;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        if (str == null || (d = d(context, str)) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(d, "UTF-8"));
            while (true) {
                try {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            String sb2 = sb.toString();
                            a(bufferedReader);
                            a(d);
                            return sb2;
                        }
                        sb.append(readLine).append('\n');
                    } catch (IOException e) {
                        e = e;
                        e.printStackTrace();
                        a(bufferedReader);
                        a(d);
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    a(bufferedReader2);
                    a(d);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            a(bufferedReader2);
            a(d);
            throw th;
        }
    }

    private static InputStream f(Context context, String str) throws IOException {
        if (f1765a != null) {
            return new FileInputStream(f1765a + str);
        }
        AssetManager a2 = a(context);
        if (a2 != null) {
            return a2.open(str);
        }
        throw new IOException("AssetManager not available");
    }

    public static void a(String str) {
        if (str != null && !str.endsWith("/")) {
            f1765a = str + "/";
        } else {
            f1765a = str;
        }
    }

    public static String[] a(Context context, String str) {
        if (str == null) {
            return null;
        }
        if (f1765a != null) {
            File file = new File(f1765a + str);
            if (file.exists() && file.isDirectory()) {
                return file.list();
            }
            return null;
        }
        AssetManager a2 = a(context);
        if (a2 == null) {
            return null;
        }
        try {
            return a2.list(str);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] a(Context context, String str, String str2) {
        String[] list;
        String[] list2;
        if (str2 == null) {
            return null;
        }
        int i = 0;
        if (f1765a != null) {
            File file = new File(f1765a + str);
            if (file.exists() && file.isDirectory() && (list2 = file.list()) != null) {
                int length = list2.length;
                while (i < length) {
                    String str3 = list2[i];
                    if (str3 != null && str3.contains(str2)) {
                        return c(context, str + "/" + str3);
                    }
                    i++;
                }
            }
            return null;
        }
        AssetManager a2 = a(context);
        if (a2 == null) {
            return null;
        }
        try {
            list = a2.list(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (list == null) {
            return null;
        }
        int length2 = list.length;
        while (i < length2) {
            String str4 = list[i];
            if (str4 != null && str4.contains(str2)) {
                return c(context, str + "/" + str4);
            }
            i++;
        }
        return null;
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
