package com.facebook.ads.internal.api;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes11.dex */
public interface AdComponentView {
    void addView(View view);

    void addView(View view, int r2);

    void addView(View view, int r2, int r3);

    void addView(View view, int r2, ViewGroup.LayoutParams layoutParams);

    void addView(View view, ViewGroup.LayoutParams layoutParams);

    void onWindowFocusChanged(boolean z);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);
}
