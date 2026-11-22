package com.xmly.businesssdk.fragment;

import kotlin.Metadata;

/* compiled from: FragmentCallback.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH&J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/xmly/businesssdk/fragment/FragmentCallback;", "T", "", "onError", "", "message", "", "code", "", "onSuccess", "result", "(Ljava/lang/Object;)V", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface FragmentCallback<T> {

    /* compiled from: FragmentCallback.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void onError$default(FragmentCallback fragmentCallback, String str, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onError");
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            fragmentCallback.onError(str, i);
        }
    }

    void onError(String message, int code);

    void onSuccess(T result);
}
