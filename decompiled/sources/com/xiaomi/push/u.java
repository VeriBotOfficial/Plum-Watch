package com.xiaomi.push;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f14824a = Collections.synchronizedSet(new HashSet());

    /* renamed from: a, reason: collision with other field name */
    private Context f1119a;

    /* renamed from: a, reason: collision with other field name */
    private RandomAccessFile f1120a;

    /* renamed from: a, reason: collision with other field name */
    private String f1121a;

    /* renamed from: a, reason: collision with other field name */
    private FileLock f1122a;

    private u(Context context) {
        this.f1119a = context;
    }

    public static u a(Context context, File file) {
        com.xiaomi.channel.commonutils.logger.b.c("Locking: " + file.getAbsolutePath());
        String str = file.getAbsolutePath() + ".LOCK";
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        Set<String> set = f14824a;
        if (set.add(str)) {
            u uVar = new u(context);
            uVar.f1121a = str;
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                uVar.f1120a = randomAccessFile;
                uVar.f1122a = randomAccessFile.getChannel().lock();
                com.xiaomi.channel.commonutils.logger.b.c("Locked: " + str + " :" + uVar.f1122a);
                if (uVar.f1122a == null) {
                    RandomAccessFile randomAccessFile2 = uVar.f1120a;
                    if (randomAccessFile2 != null) {
                        x.a(randomAccessFile2);
                    }
                    set.remove(uVar.f1121a);
                }
                return uVar;
            } catch (Throwable th) {
                if (uVar.f1122a == null) {
                    RandomAccessFile randomAccessFile3 = uVar.f1120a;
                    if (randomAccessFile3 != null) {
                        x.a(randomAccessFile3);
                    }
                    f14824a.remove(uVar.f1121a);
                }
                throw th;
            }
        }
        throw new IOException("abtain lock failure");
    }

    public void a() {
        com.xiaomi.channel.commonutils.logger.b.c("unLock: " + this.f1122a);
        FileLock fileLock = this.f1122a;
        if (fileLock != null && fileLock.isValid()) {
            try {
                this.f1122a.release();
            } catch (IOException unused) {
            }
            this.f1122a = null;
        }
        RandomAccessFile randomAccessFile = this.f1120a;
        if (randomAccessFile != null) {
            x.a(randomAccessFile);
        }
        f14824a.remove(this.f1121a);
    }
}
