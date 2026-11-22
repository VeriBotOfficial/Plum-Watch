package com.xmly.businesssdk.player.core;

import com.xmly.businesssdk.player.core.local.FxPlayerManager;
import com.xmly.businesssdk.player.entity.Playable;
import com.xmly.businesssdk.utils.Logger;

/* loaded from: classes3.dex */
public abstract class PlayableCallback {
    public void onFailure(Exception exc) {
        Logger.w(FxPlayerManager.TAG, "PlayableCallback onFailure", exc);
    }

    public abstract void onSuccess(Playable playable);
}
