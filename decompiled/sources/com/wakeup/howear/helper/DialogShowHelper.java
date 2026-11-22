package com.wakeup.howear.helper;

/* loaded from: classes3.dex */
public class DialogShowHelper {
    private static String TAG = "DialogShowHelper";
    private static volatile DialogShowHelper instance;
    public boolean isShowWatchConnectTip = false;
    public boolean isShowSoundConnectTip = false;

    private DialogShowHelper() {
    }

    public static DialogShowHelper getInstance() {
        if (instance == null) {
            synchronized (DialogShowHelper.class) {
                if (instance == null) {
                    instance = new DialogShowHelper();
                }
            }
        }
        return instance;
    }
}
