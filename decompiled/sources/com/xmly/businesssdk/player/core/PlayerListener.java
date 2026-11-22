package com.xmly.businesssdk.player.core;

import com.xmly.businesssdk.player.entity.Playable;

/* loaded from: classes3.dex */
public interface PlayerListener {
    public static final int USER_ERROR_WHAT = -202002;

    void onListCompletion();

    void onTrackBuffering(int i);

    void onTrackChanged(Playable playable, boolean z);

    boolean onTrackCompletion();

    void onTrackPause();

    void onTrackProgress(int i, int i2);

    boolean onTrackStart();

    void onTrackStop();

    void onTrackStreamError(int i, int i2);
}
