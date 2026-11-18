package com.qumeng.overseas.advlib.core;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes2.dex */
public interface IADBrowser {
    void doWhenReflect(Activity activity, Bundle bundle);

    void onActivityResultRef(int r1, int r2, Intent intent);

    boolean onKeyEvent(int r1, KeyEvent keyEvent);

    void whenPermDialogReturns(int r1, String[] strArr, int[] r3);
}
