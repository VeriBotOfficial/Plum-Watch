package com.baidu.mapapi;

/* loaded from: classes13.dex */
public interface RequestAuthResultListener {
    public static final String MESSAGE_AUTH_RESULT_NULL = "AUTH_RESULT_NULL";
    public static final int STATUS_AUTH_RESULT_NULL = 2;

    void onAuthResult(int i, String str);
}
