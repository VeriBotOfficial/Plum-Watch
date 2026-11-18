package com.jwenfeng.library.pulltorefresh.view;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public interface FooterView {
    void begin();

    void finishing(float f, float f2);

    View getView();

    void loading();

    void normal();

    void progress(float f, float f2);
}
