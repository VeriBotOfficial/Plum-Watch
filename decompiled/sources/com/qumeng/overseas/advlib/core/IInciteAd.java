package com.qumeng.overseas.advlib.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.qumeng.overseas.advlib.ui.front.InciteVideoListener;

/* loaded from: classes17.dex */
public interface IInciteAd {
    void ReportBootstrapFeature(int[] iArr);

    void doWhenReflect(Activity activity);

    void onActivityResultRef(int i, int i2, Intent intent);

    void onDestroyRef(Activity activity);

    boolean onKeyEvent(int i, KeyEvent keyEvent);

    void onPauseRef(Activity activity);

    void onResumeRef(Activity activity);

    void onStartRef(Activity activity);

    void onStopRef(Activity activity);

    void showInciteVideo(Context context, ICliBundle iCliBundle, Bundle bundle, InciteVideoListener inciteVideoListener);

    void whenPermDialogReturns(int i, String[] strArr, int[] iArr);
}
