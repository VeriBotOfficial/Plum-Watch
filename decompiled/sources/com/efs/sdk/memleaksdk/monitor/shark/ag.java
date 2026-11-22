package com.efs.sdk.memleaksdk.monitor.shark;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Locale;

/* loaded from: classes14.dex */
public class ag extends ae {
    private int b = 0;
    private int c = 0;

    public void c() {
        this.b = 0;
        this.c = 0;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.ae
    public String d() {
        return "reason_thread";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e() {
        File[] listFiles;
        if (this.c > a().getMaxOverThresholdCount() || (listFiles = new File("/proc/self/task").listFiles()) == null) {
            return;
        }
        g.b("UMonitor.Thread", "over threshold dump thread");
        StringBuilder sb = new StringBuilder();
        int length = listFiles.length;
        int i = 0;
        while (true) {
            FileOutputStream fileOutputStream = null;
            if (i < length) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(listFiles[i], "comm")));
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb.append(readLine).append(",");
                        }
                        i.a(bufferedReader);
                    } catch (Throwable unused) {
                        fileOutputStream = bufferedReader;
                        i.a(fileOutputStream);
                        i++;
                    }
                } catch (Throwable unused2) {
                }
                i++;
            } else {
                sb.setLength(sb.length() - 1);
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(e.a(e.d()), false);
                    try {
                        fileOutputStream2.write(sb.toString().getBytes());
                        i.a(fileOutputStream2);
                        return;
                    } catch (Throwable unused3) {
                        fileOutputStream = fileOutputStream2;
                        i.a(fileOutputStream);
                        return;
                    }
                } catch (Throwable unused4) {
                }
            }
        }
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.ae
    public boolean b() {
        int i = ah.e.f9680a;
        if (i > a().getThreadThreshold() && i >= this.b - 50) {
            this.c++;
            g.c("UMonitor.Thread", String.format(Locale.US, "match: overThresholdCount: %d, threadCount: %d", Integer.valueOf(this.c), Integer.valueOf(i)));
            e();
        } else {
            c();
        }
        this.b = i;
        return this.c > a().getMaxOverThresholdCount();
    }
}
