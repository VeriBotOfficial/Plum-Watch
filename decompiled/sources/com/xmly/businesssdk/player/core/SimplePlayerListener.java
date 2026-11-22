package com.xmly.businesssdk.player.core;

import com.xmly.businesssdk.player.entity.Playable;

/* loaded from: classes3.dex */
public abstract class SimplePlayerListener implements PlayerListener {
    @Override // com.xmly.businesssdk.player.core.PlayerListener
    public void onListCompletion() {
    }

    @Override // com.xmly.businesssdk.player.core.PlayerListener
    public void onTrackBuffering(int i) {
    }

    @Override // com.xmly.businesssdk.player.core.PlayerListener
    public void onTrackChanged(Playable playable, boolean z) {
    }

    @Override // com.xmly.businesssdk.player.core.PlayerListener
    public boolean onTrackCompletion() {
        return true;
    }

    @Override // com.xmly.businesssdk.player.core.PlayerListener
    public void onTrackPause() {
    }

    @Override // com.xmly.businesssdk.player.core.PlayerListener
    public void onTrackProgress(int i, int i2) {
    }

    @Override // com.xmly.businesssdk.player.core.PlayerListener
    public boolean onTrackStart() {
        return true;
    }

    @Override // com.xmly.businesssdk.player.core.PlayerListener
    public void onTrackStop() {
    }

    @Override // com.xmly.businesssdk.player.core.PlayerListener
    public void onTrackStreamError(int i, int i2) {
    }
}
