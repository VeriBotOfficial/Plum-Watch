package com.anythink.expressad.foundation.webview;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes16.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f4955a = 4;
    public static final int b = 5;
    public static final int c = 6;
    public static final int d = 7;
    public static final int e = 8;

    public interface a {
        void a();

        void b();
    }

    Drawable getBackground();

    ViewGroup.LayoutParams getLayoutParams();

    float getProgress();

    int getVisibility();

    void initResource(boolean z);

    void onThemeChange();

    void setBackgroundColor(int r1);

    void setBackgroundDrawable(Drawable drawable);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);

    void setPaused(boolean z);

    void setProgress(float f, boolean z);

    void setProgressBarListener(a aVar);

    void setProgressState(int r1);

    void setVisibility(int r1);

    void setVisible(boolean z);

    void startEndAnimation();
}
