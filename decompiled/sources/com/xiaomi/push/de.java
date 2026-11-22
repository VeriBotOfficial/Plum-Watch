package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.util.Log;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* loaded from: classes4.dex */
public class de implements LoggerInterface {

    /* renamed from: a, reason: collision with root package name */
    private static volatile de f14520a;

    /* renamed from: a, reason: collision with other field name */
    private Context f338a;

    /* renamed from: a, reason: collision with other field name */
    private Handler f339a;
    private String b;

    /* renamed from: a, reason: collision with other field name */
    private static final SimpleDateFormat f336a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aaa");

    /* renamed from: a, reason: collision with other field name */
    public static String f335a = "/MiPushLog";

    /* renamed from: a, reason: collision with other field name */
    private static List<Pair<String, Throwable>> f337a = Collections.synchronizedList(new ArrayList());

    private de(Context context) {
        this.f338a = context;
        if (context.getApplicationContext() != null) {
            this.f338a = context.getApplicationContext();
        }
        this.b = this.f338a.getPackageName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Process.myPid();
        HandlerThread handlerThread = new HandlerThread("Log2FileHandlerThread");
        handlerThread.start();
        this.f339a = new Handler(handlerThread.getLooper());
    }

    public static de a(Context context) {
        if (f14520a == null) {
            synchronized (de.class) {
                if (f14520a == null) {
                    f14520a = new de(context);
                }
            }
        }
        return f14520a;
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void setTag(String str) {
        this.b = str;
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void log(String str) {
        log(str, null);
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void log(final String str, final Throwable th) {
        this.f339a.post(new Runnable() { // from class: com.xiaomi.push.de.1
            @Override // java.lang.Runnable
            public void run() {
                de.f337a.add(new Pair(String.format("%1$s %2$s %3$s ", de.f336a.format(new Date()), de.this.b, str), th));
                if (de.f337a.size() > 20000) {
                    int size = de.f337a.size() - 19950;
                    for (int i = 0; i < size; i++) {
                        try {
                            if (de.f337a.size() > 0) {
                                de.f337a.remove(0);
                            }
                        } catch (IndexOutOfBoundsException unused) {
                        }
                    }
                    de.f337a.add(new Pair(String.format("%1$s %2$s %3$s ", de.f336a.format(new Date()), de.this.b, "flush " + size + " lines logs."), null));
                }
                try {
                    de.this.m12000a();
                } catch (Exception e) {
                    Log.e(de.this.b, "", e);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x015f -> B:49:0x0164). Please report as a decompilation issue!!! */
    /* renamed from: a, reason: collision with other method in class */
    public void m12000a() {
        RandomAccessFile randomAccessFile;
        File file;
        FileLock fileLock = "Cannot wirte internal file: ";
        BufferedWriter bufferedWriter = null;
        try {
            try {
                try {
                    file = new File(this.f338a.getFilesDir(), f335a);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
                fileLock = 0;
                randomAccessFile = null;
            } catch (Throwable th2) {
                th = th2;
                fileLock = 0;
                randomAccessFile = null;
            }
        } catch (IOException e2) {
            Log.e(this.b, "", e2);
        }
        if (!w.m12498a(file)) {
            Log.w(this.b, "Cannot wirte internal file: " + file);
            return;
        }
        if ((!file.exists() || !file.isDirectory()) && !file.mkdirs()) {
            Log.w(this.b, "Create mipushlog directory fail.");
            return;
        }
        File file2 = new File(file, "log.lock");
        if (!file2.exists() || file2.isDirectory()) {
            file2.createNewFile();
        }
        randomAccessFile = new RandomAccessFile(file2, "rw");
        try {
            fileLock = randomAccessFile.getChannel().lock();
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(file, "log1.txt"), true)));
                while (!f337a.isEmpty()) {
                    try {
                        Pair<String, Throwable> remove = f337a.remove(0);
                        String str = (String) remove.first;
                        if (remove.second != null) {
                            str = (str + "\n") + Log.getStackTraceString((Throwable) remove.second);
                        }
                        bufferedWriter2.write(str + "\n");
                    } catch (Exception e3) {
                        e = e3;
                        bufferedWriter = bufferedWriter2;
                        Log.e(this.b, "", e);
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException e4) {
                                Log.e(this.b, "", e4);
                            }
                        }
                        if (fileLock != 0 && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e5) {
                                Log.e(this.b, "", e5);
                            }
                        }
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedWriter = bufferedWriter2;
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException e6) {
                                Log.e(this.b, "", e6);
                            }
                        }
                        if (fileLock != 0 && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e7) {
                                Log.e(this.b, "", e7);
                            }
                        }
                        if (randomAccessFile == null) {
                            throw th;
                        }
                        try {
                            randomAccessFile.close();
                            throw th;
                        } catch (IOException e8) {
                            Log.e(this.b, "", e8);
                            throw th;
                        }
                    }
                }
                bufferedWriter2.flush();
                bufferedWriter2.close();
                File file3 = new File(file, "log1.txt");
                if (file3.length() >= 1048576) {
                    File file4 = new File(file, "log0.txt");
                    if (file4.exists() && file4.isFile()) {
                        file4.delete();
                    }
                    file3.renameTo(file4);
                }
                if (fileLock != 0 && fileLock.isValid()) {
                    try {
                        fileLock.release();
                    } catch (IOException e9) {
                        Log.e(this.b, "", e9);
                    }
                }
                randomAccessFile.close();
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            fileLock = 0;
        } catch (Throwable th4) {
            th = th4;
            fileLock = 0;
        }
    }
}
