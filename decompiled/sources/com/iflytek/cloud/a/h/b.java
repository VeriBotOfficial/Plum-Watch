package com.iflytek.cloud.a.h;

import com.iflytek.cloud.SpeechError;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public interface b {
    void a(ArrayList<byte[]> arrayList, int i, int i2, int i3, String str) throws SpeechError;

    void onCompleted(SpeechError speechError);
}
