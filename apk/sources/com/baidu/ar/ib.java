package com.baidu.ar;

import android.util.Log;

/* JADX INFO: loaded from: classes16.dex */
public class ib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f6985a;

    public static void a() {
        Log.e("ResLoadMachine", "machine：reset");
        a(0);
    }

    public static void a(int r2) {
        String str;
        f6985a = r2;
        if (r2 == 0) {
            str = "machine：init";
        } else if (r2 == 1) {
            str = "machine：query";
        } else if (r2 != 2) {
            return;
        } else {
            str = "machine：engine is load finish!";
        }
        Log.e("ResLoadMachine", str);
    }

    public static boolean b() {
        int r0 = f6985a;
        boolean z = r0 == 2 || r0 == 0;
        if (z) {
            Log.e("ResLoadMachine", "machine：!!!!!! can query.");
        }
        return z;
    }
}
