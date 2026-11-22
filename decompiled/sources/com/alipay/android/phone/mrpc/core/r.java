package com.alipay.android.phone.mrpc.core;

import android.util.Log;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes11.dex */
public class r {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.e("IOUtil", "", e);
            }
        }
    }
}
