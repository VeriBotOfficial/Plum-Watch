package com.efs.sdk.memleaksdk.monitor.shark;

import android.system.Os;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;

/* loaded from: classes14.dex */
public class ab extends ae {
    private int b = 0;
    private int c = 0;

    @Override // com.efs.sdk.memleaksdk.monitor.shark.ae
    public boolean b() {
        int e = e();
        if (e > a().getFdThreshold() && e >= this.b - 50) {
            this.c++;
            g.c("UMonitor.Fd", String.format(Locale.US, "match: overThresholdCount: %d, fdCount: %d", Integer.valueOf(this.c), Integer.valueOf(e)));
            f();
        } else {
            c();
        }
        this.b = e;
        return this.c >= a().getMaxOverThresholdCount();
    }

    public void c() {
        this.b = 0;
        this.c = 0;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.ae
    public String d() {
        return "reason_fd";
    }

    private int e() {
        File[] listFiles = new File("/proc/self/fd").listFiles();
        if (listFiles != null) {
            return listFiles.length;
        }
        return 0;
    }

    private void f() {
        File[] listFiles;
        FileOutputStream fileOutputStream;
        if (this.c <= a().getMaxOverThresholdCount() && (listFiles = new File("/proc/self/fd").listFiles()) != null) {
            g.b("UMonitor.Fd", "over threshold dump fd if need.");
            StringBuilder sb = new StringBuilder();
            for (File file : listFiles) {
                try {
                    sb.append(Os.readlink(file.getPath())).append(",");
                } catch (Throwable unused) {
                }
            }
            sb.setLength(sb.length() - 1);
            try {
                fileOutputStream = new FileOutputStream(e.a(e.e()), false);
                try {
                    fileOutputStream.write(sb.toString().getBytes());
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                fileOutputStream = null;
            }
            i.a(fileOutputStream);
        }
    }
}
