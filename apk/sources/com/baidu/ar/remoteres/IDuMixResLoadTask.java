package com.baidu.ar.remoteres;

/* JADX INFO: loaded from: classes16.dex */
public interface IDuMixResLoadTask {
    boolean canRetry();

    String getError();

    void retry();
}
