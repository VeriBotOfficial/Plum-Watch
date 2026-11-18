package com.baidu.ar.util;

import android.content.Context;
import android.os.Process;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes16.dex */
public class LogcatHelper {
    private static LogcatHelper sInatance;
    private static String sPath;
    private a mLogDumper = null;
    private int mPId;

    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Process f7249a;
        public BufferedReader b = null;
        public boolean c = true;
        public String d;
        public String e;
        public FileOutputStream f;

        public a(LogcatHelper logcatHelper, String str, String str2) {
            this.d = null;
            this.f = null;
            this.e = str;
            try {
                this.f = new FileOutputStream(new File(str2, "Log-" + logcatHelper.getDateToString(System.currentTimeMillis()) + ".log"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            this.d = "logcat *:e *:i -s 'huangyn1' | grep \"(" + logcatHelper.mPId + ")\"";
        }

        public void b() {
            this.c = false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            FileOutputStream fileOutputStream;
            String line;
            try {
                try {
                    this.f7249a = Runtime.getRuntime().exec(this.d);
                    this.b = new BufferedReader(new InputStreamReader(this.f7249a.getInputStream()), 1024);
                    while (this.c && (line = this.b.readLine()) != null && this.c) {
                        if (line.length() != 0 && this.f != null && line.contains(this.e)) {
                            this.f.write((line + "\n").getBytes());
                        }
                    }
                    Process process = this.f7249a;
                    if (process != null) {
                        process.destroy();
                        this.f7249a = null;
                    }
                    BufferedReader bufferedReader = this.b;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            this.b = null;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    fileOutputStream = this.f;
                    if (fileOutputStream == null) {
                        return;
                    }
                } catch (Throwable th) {
                    Process process2 = this.f7249a;
                    if (process2 != null) {
                        process2.destroy();
                        this.f7249a = null;
                    }
                    BufferedReader bufferedReader2 = this.b;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                            this.b = null;
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    FileOutputStream fileOutputStream2 = this.f;
                    if (fileOutputStream2 == null) {
                        throw th;
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    this.f = null;
                    throw th;
                }
            } catch (IOException e4) {
                e4.printStackTrace();
                Process process3 = this.f7249a;
                if (process3 != null) {
                    process3.destroy();
                    this.f7249a = null;
                }
                BufferedReader bufferedReader3 = this.b;
                if (bufferedReader3 != null) {
                    try {
                        bufferedReader3.close();
                        this.b = null;
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                fileOutputStream = this.f;
                if (fileOutputStream == null) {
                    return;
                }
            }
            try {
                fileOutputStream.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
            this.f = null;
        }
    }

    private LogcatHelper(Context context) {
        init(context);
        this.mPId = Process.myPid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getDateToString(long j) {
        return new SimpleDateFormat("yyyy年MM月dd日-HH:mm:ss").format(new Date(j));
    }

    public static LogcatHelper getInstance(Context context) {
        if (sInatance == null) {
            sInatance = new LogcatHelper(context);
        }
        return sInatance;
    }

    public void init(Context context) {
        File externalFilesDir = context.getExternalFilesDir(null);
        sPath = (externalFilesDir == null ? new StringBuilder().append(context.getFilesDir().getAbsolutePath()) : new StringBuilder().append(externalFilesDir.getAbsolutePath())).append(File.separator).append("Navigation").toString();
        File file = new File(sPath);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public void start() {
        if (this.mLogDumper == null) {
            this.mLogDumper = new a(this, String.valueOf(this.mPId), sPath);
        }
        this.mLogDumper.start();
    }

    public void stop() {
        a aVar = this.mLogDumper;
        if (aVar != null) {
            aVar.b();
            this.mLogDumper = null;
        }
    }
}
