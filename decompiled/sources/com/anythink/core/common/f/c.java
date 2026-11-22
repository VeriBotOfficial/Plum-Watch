package com.anythink.core.common.f;

import android.content.Context;

/* loaded from: classes12.dex */
public class c extends a {
    private static volatile c c;

    private c(Context context) {
        super(context);
        this.b = 1;
    }

    public static c a(Context context) {
        if (c == null) {
            synchronized (c.class) {
                if (c == null) {
                    c = new c(context);
                }
            }
        }
        return c;
    }
}
