package com.xmly.businesssdk.player.core;

import com.xmly.businesssdk.player.entity.Playable;

/* loaded from: classes3.dex */
public interface PlaybackCallback {
    void onListCompletion();

    void onPlaybackInfoChanged(PlaybackInfo playbackInfo);

    void onTrackBuffering(boolean z);

    void onTrackChanged(Playable playable);

    void onTrackCompletion();

    void onTrackPause();

    void onTrackProgress(int i, int i2);

    void onTrackStart(Playable playable);

    void onTrackStop();

    void onTrackStreamError(int i, String str);
}
