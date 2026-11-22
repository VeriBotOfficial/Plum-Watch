package com.qumeng.overseas.advlib.core;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes17.dex */
public interface _factory extends Runnable {
    IMultiAdRequest createNativeMultiAdRequest();

    void mediaTrace(String str, String str2, String str3, Map<String, String> map);

    void notifyMsg(int i, Bundle bundle);

    void run();

    void setImageAutoDownload(boolean z);

    void setMediaUserId(String str);

    void terminate();

    void useDebugServer(int i);

    void useDebugServer(boolean z);

    void whenPermDialogReturns(int i, String[] strArr, int[] iArr);
}
