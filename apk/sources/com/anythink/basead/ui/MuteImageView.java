package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes7.dex */
public class MuteImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f3080a;

    public MuteImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3080a = false;
    }

    public void setMute(boolean z) {
        if (z) {
            setSelected(true);
        } else {
            setSelected(false);
        }
    }
}
