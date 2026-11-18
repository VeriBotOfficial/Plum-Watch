package com.iab.omid.library.applovin.adsession.media;

import com.anythink.core.express.b.a;

/* JADX INFO: loaded from: classes2.dex */
public enum PlayerState {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL("normal"),
    EXPANDED(a.g),
    FULLSCREEN("fullscreen");

    private final String playerState;

    PlayerState(String str) {
        this.playerState = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.playerState;
    }
}
