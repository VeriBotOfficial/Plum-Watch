package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.expressad.foundation.h.k;
import com.mbridge.msdk.foundation.tools.g0;

/* loaded from: classes17.dex */
public class SoundImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private boolean f11396a;

    public SoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11396a = true;
    }

    public boolean getStatus() {
        return this.f11396a;
    }

    public void setSoundStatus(boolean z) {
        this.f11396a = z;
        if (z) {
            setImageResource(g0.a(getContext(), "mbridge_reward_sound_open", k.c));
        } else {
            setImageResource(g0.a(getContext(), "mbridge_reward_sound_close", k.c));
        }
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11396a = true;
    }

    public SoundImageView(Context context) {
        super(context);
        this.f11396a = true;
    }
}
