package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.af;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* loaded from: classes4.dex */
public abstract class dm extends af.a {

    /* renamed from: a, reason: collision with root package name */
    protected int f14527a;

    /* renamed from: a, reason: collision with other field name */
    protected Context f347a;

    public abstract gi a();

    public abstract String b();

    /* renamed from: b, reason: collision with other method in class */
    protected boolean m12005b() {
        return true;
    }

    /* renamed from: c, reason: collision with other method in class */
    protected boolean m12006c() {
        return false;
    }

    public dm(Context context, int i) {
        this.f14527a = i;
        this.f347a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        String b = b();
        if (TextUtils.isEmpty(b)) {
            return;
        }
        if (m12004a()) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("DC run job mutual: " + a());
            return;
        }
        dg m12002a = dh.a().m12002a();
        String a2 = m12002a == null ? "" : m12002a.a();
        if (!TextUtils.isEmpty(a2) && m12005b()) {
            if (m12006c()) {
                SharedPreferences sharedPreferences = this.f347a.getSharedPreferences("mipush_extra", 0);
                if (bc.a(b).equals(sharedPreferences.getString(d(), null))) {
                    long j = sharedPreferences.getLong(c(), 0L);
                    int a3 = com.xiaomi.push.service.ah.a(this.f347a).a(gl.DCJobUploadRepeatedInterval.a(), 604800);
                    if ((System.currentTimeMillis() - j) / 1000 < this.f14527a) {
                        return;
                    }
                    if ((System.currentTimeMillis() - j) / 1000 < a3) {
                        b = "same_" + j;
                    }
                }
            }
            go goVar = new go();
            goVar.a(b);
            goVar.a(System.currentTimeMillis());
            goVar.a(a());
            a(this.f347a, goVar, a2);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    protected boolean m12004a() {
        return dj.a(this.f347a, String.valueOf(a()), this.f14527a);
    }

    public static void a(Context context, go goVar) {
        dg m12002a = dh.a().m12002a();
        String a2 = m12002a == null ? "" : m12002a.a();
        if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(goVar.a())) {
            return;
        }
        a(context, goVar, a2);
    }

    private static void a(Context context, go goVar, String str) {
        BufferedOutputStream bufferedOutputStream;
        RandomAccessFile randomAccessFile;
        byte[] b = dj.b(str, hq.a(goVar));
        if (b == null || b.length == 0) {
            return;
        }
        synchronized (dk.f14524a) {
            FileLock fileLock = null;
            BufferedOutputStream bufferedOutputStream2 = null;
            fileLock = null;
            fileLock = null;
            fileLock = null;
            try {
                try {
                    File file = new File(context.getFilesDir(), "push_cdata.lock");
                    x.m12499a(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        FileLock lock = randomAccessFile.getChannel().lock();
                        try {
                            File file2 = new File(context.getFilesDir(), "push_cdata.data");
                            if (w.m12498a(file2)) {
                                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2, true));
                                try {
                                    bufferedOutputStream.write(z.a(b.length));
                                    bufferedOutputStream.write(b);
                                    bufferedOutputStream.flush();
                                    file2.setLastModified(0L);
                                    bufferedOutputStream2 = bufferedOutputStream;
                                } catch (IOException e) {
                                    e = e;
                                    fileLock = lock;
                                    try {
                                        e.printStackTrace();
                                        if (fileLock != null && fileLock.isValid()) {
                                            try {
                                                fileLock.release();
                                            } catch (IOException unused) {
                                            }
                                        }
                                        x.a(bufferedOutputStream);
                                        x.a(randomAccessFile);
                                    } catch (Throwable th) {
                                        th = th;
                                        if (fileLock != null && fileLock.isValid()) {
                                            try {
                                                fileLock.release();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        x.a(bufferedOutputStream);
                                        x.a(randomAccessFile);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileLock = lock;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    x.a(bufferedOutputStream);
                                    x.a(randomAccessFile);
                                    throw th;
                                }
                            }
                            if (lock != null && lock.isValid()) {
                                try {
                                    lock.release();
                                } catch (IOException unused3) {
                                }
                            }
                            x.a(bufferedOutputStream2);
                        } catch (IOException e2) {
                            e = e2;
                            bufferedOutputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedOutputStream = null;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        bufferedOutputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedOutputStream = null;
                    }
                } finally {
                }
            } catch (IOException e4) {
                e = e4;
                bufferedOutputStream = null;
                randomAccessFile = null;
            } catch (Throwable th5) {
                th = th5;
                bufferedOutputStream = null;
                randomAccessFile = null;
            }
            x.a(randomAccessFile);
        }
    }

    private String c() {
        return "dc_job_result_time_" + a();
    }

    private String d() {
        return "dc_job_result_" + a();
    }
}
