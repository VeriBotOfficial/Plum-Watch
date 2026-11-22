package com.yandex.div.internal.util;

import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes5.dex */
public abstract class NamedRunnable implements Runnable {
    private final String mThreadSuffix;

    public abstract void execute();

    public NamedRunnable(String str) {
        this.mThreadSuffix = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(name + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.mThreadSuffix);
        try {
            execute();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
