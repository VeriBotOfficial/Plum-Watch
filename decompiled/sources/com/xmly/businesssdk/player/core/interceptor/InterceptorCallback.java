package com.xmly.businesssdk.player.core.interceptor;

import com.xmly.businesssdk.player.entity.Playable;

/* loaded from: classes3.dex */
public interface InterceptorCallback {
    void onContinue(Playable playable);

    void onInterrupt(int i);

    void onProcessIng();
}
