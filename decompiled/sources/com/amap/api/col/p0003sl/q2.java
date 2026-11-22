package com.amap.api.col.p0003sl;

import com.wakeup.common.burypoint.BuryPointPageId;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: FileAccessI.java */
/* loaded from: classes11.dex */
class q2 {

    /* renamed from: a, reason: collision with root package name */
    RandomAccessFile f1844a;

    public q2(String str, long j) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (IOException e) {
                ja.a(e, "FileAccessI", BuryPointPageId.PAGE_ID_PLAN_CREATE);
                e.printStackTrace();
            }
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
        this.f1844a = randomAccessFile;
        randomAccessFile.seek(j);
    }
}
