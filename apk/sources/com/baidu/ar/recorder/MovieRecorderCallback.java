package com.baidu.ar.recorder;

/* JADX INFO: loaded from: classes16.dex */
public interface MovieRecorderCallback {
    void onRecorderComplete(boolean z, String str);

    void onRecorderError(int r1);

    void onRecorderProcess(int r1);

    void onRecorderStart(boolean z);
}
