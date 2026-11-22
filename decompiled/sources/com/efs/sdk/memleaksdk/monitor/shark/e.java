package com.efs.sdk.memleaksdk.monitor.shark;

import android.content.Context;
import android.os.StatFs;
import com.efs.sdk.memleaksdk.monitor.UMonitor;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* loaded from: classes14.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static String f9909a;
    private static String b;

    public static abstract class a {
        public abstract boolean a(String str);
    }

    public static void a(String str) {
        if (str != null) {
            b = str;
        }
        f9909a = UMUtils.getAppVersionName(UMonitor.getContext());
    }

    public static void a(Context context, String str) {
        if (str != null) {
            b = str;
        }
        f9909a = UMUtils.getAppVersionName(context);
    }

    public static File a() {
        return new File(b);
    }

    public static File b() {
        File file = new File(a(), "memory/hprof_analysis");
        file.mkdirs();
        return file;
    }

    public static File c() {
        File file = new File(a(), "memory/hprof_script");
        file.mkdirs();
        return file;
    }

    public static File d() {
        File file = new File(a(), "thread");
        file.mkdirs();
        return file;
    }

    public static File e() {
        File file = new File(a(), IjkMediaPlayer.OnNativeInvokeListener.ARG_FD);
        file.mkdirs();
        return file;
    }

    public static File a(Date date) {
        return new File(b(), f9909a + "_" + new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS", Locale.CHINESE).format(date) + ".hprof");
    }

    public static File b(Date date) {
        return new File(b(), f9909a + "_" + new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS", Locale.CHINESE).format(date) + ".json");
    }

    public static File c(Date date) {
        return new File(c(), f9909a + "_" + new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS", Locale.CHINESE).format(date) + ".hprof");
    }

    public static File a(File file) {
        return new File(file, "dump.txt");
    }

    public static boolean f() {
        StatFs statFs = new StatFs(b().getPath());
        return ((double) (statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong())) > 1258291.2d;
    }

    public static String b(File file) {
        BufferedReader bufferedReader;
        FileInputStream fileInputStream;
        if (!file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                        } else {
                            return sb.toString();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        g.b(UMonitor.TAG, "read file failed", th);
                        return null;
                    } finally {
                        i.a(bufferedReader);
                        i.a(fileInputStream);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            fileInputStream = null;
        }
    }

    public static void a(File file, a aVar) {
        FileInputStream fileInputStream;
        String readLine;
        if (!file.exists()) {
            return;
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"));
                    do {
                        try {
                            readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                        } catch (Exception e) {
                            e = e;
                            bufferedReader = bufferedReader2;
                            g.b(UMonitor.TAG, "read file failed", e);
                            i.a(bufferedReader);
                            i.a(fileInputStream);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            i.a(bufferedReader);
                            i.a(fileInputStream);
                            throw th;
                        }
                    } while (aVar.a(readLine));
                    i.a(bufferedReader2);
                    i.a(fileInputStream);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    public static void a(File file, String str) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(str.getBytes("UTF-8"));
            i.a(fileOutputStream);
        } catch (Exception e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            g.b(UMonitor.TAG, "write file failed", e);
            i.a(fileOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            i.a(fileOutputStream2);
            throw th;
        }
    }
}
