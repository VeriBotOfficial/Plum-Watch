package com.wakeup.common.utils;

/* loaded from: classes2.dex */
public class ToastUtils {
    private ToastUtils() {
    }

    public static synchronized void showToast(CharSequence text) {
        synchronized (ToastUtils.class) {
            com.blankj.utilcode.util.ToastUtils.showShort(text);
        }
    }

    public static synchronized com.blankj.utilcode.util.ToastUtils setTextColor(int textColor) {
        com.blankj.utilcode.util.ToastUtils textColor2;
        synchronized (ToastUtils.class) {
            textColor2 = com.blankj.utilcode.util.ToastUtils.getDefaultMaker().setTextColor(textColor);
        }
        return textColor2;
    }
}
