package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.value.Keyframe;
import java.util.List;

/* loaded from: classes11.dex */
abstract class KeyframeAnimation<T> extends BaseKeyframeAnimation<T, T> {
    KeyframeAnimation(List<? extends Keyframe<T>> list) {
        super(list);
    }
}
