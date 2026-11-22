package com.xmly.businesssdk.player.core;

import com.xmly.businesssdk.player.core.local.FxPlayerManager;
import com.xmly.businesssdk.player.entity.Playable;

/* loaded from: classes3.dex */
public abstract class BufferingPlayerListener implements PlayerListener {
    private int trackBufferingPercent;
    private int trackDuration;
    private int trackProgress;
    private boolean isBuffering = false;
    private boolean isPlaying = FxPlayerManager.sIsPlaying();
    private boolean hasInit = false;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if ((r3.trackProgress + 5) >= ((int) ((r0 * 0.01f) * r1))) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void calcBufferingState() {
        /*
            r3 = this;
            boolean r0 = r3.isPlaying
            if (r0 == 0) goto L27
            boolean r0 = r3.hasInit
            if (r0 != 0) goto L9
            goto L27
        L9:
            int r0 = r3.trackBufferingPercent
            if (r0 <= 0) goto L25
            int r1 = r3.trackDuration
            if (r1 > 0) goto L12
            goto L25
        L12:
            r2 = 98
            if (r0 < r2) goto L17
            goto L27
        L17:
            float r0 = (float) r0
            r2 = 1008981770(0x3c23d70a, float:0.01)
            float r0 = r0 * r2
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = (int) r0
            int r1 = r3.trackProgress
            int r1 = r1 + 5
            if (r1 < r0) goto L27
        L25:
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            boolean r1 = r3.isBuffering
            if (r1 == r0) goto L31
            r3.isBuffering = r0
            r3.onTrackBuffering(r0)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xmly.businesssdk.player.core.BufferingPlayerListener.calcBufferingState():void");
    }

    @Override // com.xmly.businesssdk.player.core.PlayerListener
    public void onListCompletion() {
    }

    @Override // com.xmly.businesssdk.player.core.PlayerListener
    public void onTrackBuffering(int i) {
        this.trackBufferingPercent = i;
        this.hasInit = true;
        calcBufferingState();
    }

    public abstract void onTrackBuffering(boolean z);

    @Override // com.xmly.businesssdk.player.core.PlayerListener
    public void onTrackChanged(Playable playable, boolean z) {
        this.isPlaying = true;
        this.trackDuration = 0;
        this.trackProgress = 0;
        this.trackBufferingPercent = 0;
        this.hasInit = true;
        calcBufferingState();
    }

    @Override // com.xmly.businesssdk.player.core.PlayerListener
    public boolean onTrackCompletion() {
        this.isPlaying = false;
        calcBufferingState();
        return true;
    }

    @Override // com.xmly.businesssdk.player.core.PlayerListener
    public void onTrackPause() {
        this.isPlaying = false;
        calcBufferingState();
    }

    @Override // com.xmly.businesssdk.player.core.PlayerListener
    public void onTrackProgress(int i, int i2) {
        this.trackBufferingPercent = i;
        this.trackProgress = i2;
        this.trackDuration = FxPlayerManager.sGetCurrentPlayDuration() / 1000;
        this.hasInit = true;
        calcBufferingState();
    }

    @Override // com.xmly.businesssdk.player.core.PlayerListener
    public boolean onTrackStart() {
        this.isPlaying = true;
        calcBufferingState();
        return true;
    }

    @Override // com.xmly.businesssdk.player.core.PlayerListener
    public void onTrackStop() {
        this.isPlaying = false;
        calcBufferingState();
    }

    @Override // com.xmly.businesssdk.player.core.PlayerListener
    public void onTrackStreamError(int i, int i2) {
        this.isPlaying = false;
        calcBufferingState();
    }
}
