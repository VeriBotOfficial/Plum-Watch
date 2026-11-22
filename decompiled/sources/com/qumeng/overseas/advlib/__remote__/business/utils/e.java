package com.qumeng.overseas.advlib.__remote__.business.utils;

import android.content.Context;
import android.os.Process;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.z;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* loaded from: classes17.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static String f12795a;

    public static synchronized String a(Context context) {
        synchronized (e.class) {
            String str = f12795a;
            if (str != null) {
                return str;
            }
            String packageName = context.getPackageName();
            int myPid = Process.myPid();
            long currentTimeMillis = System.currentTimeMillis();
            long nanoTime = System.nanoTime();
            String uuid = UUID.randomUUID().toString();
            byte[] bytes = ("P:" + packageName + "|PID:" + myPid + "|T:" + currentTimeMillis + "|N:" + nanoTime + "|R:" + uuid).getBytes(StandardCharsets.UTF_8);
            String a2 = z.a(bytes, 0, bytes.length);
            if (a2 != null) {
                uuid = a2.substring(0, 16);
            }
            f12795a = uuid;
            return uuid;
        }
    }
}
