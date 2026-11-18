package com.anythink.core.api;

/* JADX INFO: loaded from: classes7.dex */
public interface ATCustomVideo {
    String getVideoUrl();

    void reportVideoAutoStart();

    void reportVideoBreak(long j);

    void reportVideoContinue(long j);

    void reportVideoError(long j, int r3, int r4);

    void reportVideoFinish();

    void reportVideoPause(long j);

    void reportVideoStart();

    void reportVideoStartError(int r1, int r2);
}
