package com.baidu.ar;

import android.util.Log;

/* loaded from: classes12.dex */
public class ib {

    /* renamed from: a, reason: collision with root package name */
    public static int f6985a;

    public static void a() {
        Log.e("ResLoadMachine", "machine：reset");
        a(0);
    }

    public static void a(int i) {
        String str;
        f6985a = i;
        if (i == 0) {
            str = "machine：init";
        } else if (i == 1) {
            str = "machine：query";
        } else if (i != 2) {
            return;
        } else {
            str = "machine：engine is load finish!";
        }
        Log.e("ResLoadMachine", str);
    }

    public static boolean b() {
        int i = f6985a;
        boolean z = i == 2 || i == 0;
        if (z) {
            Log.e("ResLoadMachine", "machine：!!!!!! can query.");
        }
        return z;
    }
}
