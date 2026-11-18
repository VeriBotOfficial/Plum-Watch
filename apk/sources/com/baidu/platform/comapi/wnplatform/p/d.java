package com.baidu.platform.comapi.wnplatform.p;

import android.content.Context;
import android.os.Handler;
import java.io.BufferedReader;

/* JADX INFO: compiled from: GpsRecordReplayUtils.java */
/* JADX INFO: loaded from: classes15.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Handler f8945a = new Handler();
    private static int b = 0;
    private static int c = 0;
    private static BufferedReader d = null;

    public static void a(Context context) {
        try {
            b = 0;
            c = 0;
            BufferedReader bufferedReader = d;
            if (bufferedReader != null) {
                bufferedReader.close();
                d = null;
            }
        } catch (Exception unused) {
        }
    }
}
