package com.anythink.expressad.video.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes12.dex */
public class SoundImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private boolean f5504a;

    public SoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5504a = true;
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5504a = true;
    }

    public SoundImageView(Context context) {
        super(context);
        this.f5504a = true;
    }

    public boolean getStatus() {
        return this.f5504a;
    }

    public void setSoundStatus(boolean z) {
        this.f5504a = z;
        if (z) {
            setImageResource(k.a(getContext(), "anythink_reward_sound_open", k.c));
        } else {
            setImageResource(k.a(getContext(), "anythink_reward_sound_close", k.c));
        }
    }
}
