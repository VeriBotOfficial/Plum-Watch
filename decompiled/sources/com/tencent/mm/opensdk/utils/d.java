package com.tencent.mm.opensdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class d {
    public static Context az;

    private static class a {
        public static ThreadPoolExecutor aA;

        static {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 9, 30L, TimeUnit.SECONDS, new LinkedBlockingDeque());
            aA = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
    }

    private static int a(ContentResolver contentResolver, Uri uri) {
        Log.i("MicroMsg.SDK.Util", "getFileSize with content url");
        if (contentResolver == null || uri == null) {
            Log.w("MicroMsg.SDK.Util", "getFileSize fail, resolver or uri is null");
            return 0;
        }
        InputStream inputStream = null;
        try {
            try {
                InputStream openInputStream = contentResolver.openInputStream(uri);
                if (openInputStream == null) {
                    if (openInputStream != null) {
                        try {
                            openInputStream.close();
                        } catch (IOException e) {
                            Log.e("MicroMsg.SDK.Util", "getFileSize exception: " + e.getMessage());
                        }
                    }
                    return 0;
                }
                int available = openInputStream.available();
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                        return available;
                    } catch (IOException e2) {
                        Log.e("MicroMsg.SDK.Util", "getFileSize exception: " + e2.getMessage());
                    }
                }
                return available;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        Log.e("MicroMsg.SDK.Util", "getFileSize exception: " + e3.getMessage());
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            Log.w("MicroMsg.SDK.Util", "getFileSize fail, " + e4.getMessage());
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    Log.e("MicroMsg.SDK.Util", "getFileSize exception: " + e5.getMessage());
                }
            }
            return 0;
        }
    }

    public static boolean a(int i) {
        return i == 36 || i == 46;
    }

    public static boolean b(int i) {
        return i == 101;
    }

    public static boolean f(String str) {
        return str == null || str.length() <= 0;
    }

    public static int g(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return Integer.parseInt(str);
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static int getFileSize(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        File file = new File(str);
        if (file.exists()) {
            return (int) file.length();
        }
        if (az != null && str.startsWith("content")) {
            try {
                return a(az.getContentResolver(), Uri.parse(str));
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static ThreadPoolExecutor h() {
        return a.aA;
    }
}
