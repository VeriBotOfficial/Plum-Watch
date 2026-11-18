package com.alibaba.android.arouter.thread;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public class CancelableCountDownLatch extends CountDownLatch {
    public CancelableCountDownLatch(int r1) {
        super(r1);
    }

    public void cancel() {
        while (getCount() > 0) {
            countDown();
        }
    }
}
