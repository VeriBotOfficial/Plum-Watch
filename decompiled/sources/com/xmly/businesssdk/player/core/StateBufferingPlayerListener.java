package com.xmly.businesssdk.player.core;

import com.xmly.businesssdk.player.entity.Playable;

/* loaded from: classes3.dex */
public class StateBufferingPlayerListener extends BufferingPlayerListener {
    private final PlayStateListener playStateListener;

    public interface PlayStateListener {
        void onStatePause();

        void onStatePlay();
    }

    public StateBufferingPlayerListener(PlayStateListener playStateListener) {
        this.playStateListener = playStateListener;
    }

    @Override // com.xmly.businesssdk.player.core.BufferingPlayerListener, com.xmly.businesssdk.player.core.PlayerListener
    public void onTrackBuffering(int i) {
        super.onTrackBuffering(i);
    }

    @Override // com.xmly.businesssdk.player.core.BufferingPlayerListener
    public void onTrackBuffering(boolean z) {
    }

    @Override // com.xmly.businesssdk.player.core.BufferingPlayerListener, com.xmly.businesssdk.player.core.PlayerListener
    public void onTrackChanged(Playable playable, boolean z) {
        super.onTrackChanged(playable, z);
        this.playStateListener.onStatePlay();
    }

    @Override // com.xmly.businesssdk.player.core.BufferingPlayerListener, com.xmly.businesssdk.player.core.PlayerListener
    public boolean onTrackCompletion() {
        super.onTrackCompletion();
        return false;
    }

    @Override // com.xmly.businesssdk.player.core.BufferingPlayerListener, com.xmly.businesssdk.player.core.PlayerListener
    public void onTrackPause() {
        super.onTrackPause();
        this.playStateListener.onStatePause();
    }

    @Override // com.xmly.businesssdk.player.core.BufferingPlayerListener, com.xmly.businesssdk.player.core.PlayerListener
    public void onTrackProgress(int i, int i2) {
        super.onTrackProgress(i, i2);
    }

    @Override // com.xmly.businesssdk.player.core.BufferingPlayerListener, com.xmly.businesssdk.player.core.PlayerListener
    public boolean onTrackStart() {
        super.onTrackStart();
        this.playStateListener.onStatePlay();
        return false;
    }

    @Override // com.xmly.businesssdk.player.core.BufferingPlayerListener, com.xmly.businesssdk.player.core.PlayerListener
    public void onTrackStop() {
        super.onTrackStop();
        this.playStateListener.onStatePause();
    }

    @Override // com.xmly.businesssdk.player.core.BufferingPlayerListener, com.xmly.businesssdk.player.core.PlayerListener
    public void onTrackStreamError(int i, int i2) {
        super.onTrackStreamError(i, i2);
        this.playStateListener.onStatePause();
    }
}
