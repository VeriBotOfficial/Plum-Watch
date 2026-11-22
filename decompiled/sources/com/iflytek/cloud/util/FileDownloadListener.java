package com.iflytek.cloud.util;

import com.iflytek.cloud.SpeechError;

/* loaded from: classes17.dex */
public interface FileDownloadListener {
    void onCompleted(String str, SpeechError speechError);

    void onProgress(int i);

    void onStart();
}
