package com.qumeng.overseas.advlib.core;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

/* loaded from: classes17.dex */
public interface IADBrowser {
    void doWhenReflect(Activity activity, Bundle bundle);

    void onActivityResultRef(int i, int i2, Intent intent);

    boolean onKeyEvent(int i, KeyEvent keyEvent);

    void whenPermDialogReturns(int i, String[] strArr, int[] iArr);
}
