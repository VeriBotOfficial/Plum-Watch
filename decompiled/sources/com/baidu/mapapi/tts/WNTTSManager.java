package com.baidu.mapapi.tts;

import com.baidu.platform.comapi.wnplatform.tts.BaseTTSPlayer;
import com.baidu.platform.comapi.wnplatform.tts.a;

/* loaded from: classes13.dex */
public class WNTTSManager {

    /* renamed from: a, reason: collision with root package name */
    private static WNTTSManager f8191a;

    public interface IOnTTSPlayStateChangedListener {
        void onPlayEnd(String str);

        void onPlayError(int i, String str);

        void onPlayStart();
    }

    public interface IWNOuterTTSPlayerCallback extends a {
        @Override // com.baidu.platform.comapi.wnplatform.tts.a
        int getTTSState();

        @Override // com.baidu.platform.comapi.wnplatform.tts.a
        int playTTSText(String str, int i, int i2);
    }

    public static WNTTSManager getInstance() {
        if (f8191a == null) {
            f8191a = new WNTTSManager();
        }
        return f8191a;
    }

    public void initTTS(WNTTsInitConfig wNTTsInitConfig) {
        if (wNTTsInitConfig == null) {
            return;
        }
        BaseTTSPlayer.a(wNTTsInitConfig, (IWNOuterTTSPlayerCallback) null);
    }

    public void removeOutTTSPlayerListener(IWNOuterTTSPlayerCallback iWNOuterTTSPlayerCallback) {
        BaseTTSPlayer.a(iWNOuterTTSPlayerCallback);
    }

    public void setOnTTSStateChangedListener(IOnTTSPlayStateChangedListener iOnTTSPlayStateChangedListener) {
        if (iOnTTSPlayStateChangedListener == null) {
            return;
        }
        BaseTTSPlayer.a(iOnTTSPlayStateChangedListener);
    }

    public void initTTS(IWNOuterTTSPlayerCallback iWNOuterTTSPlayerCallback) {
        BaseTTSPlayer.a((WNTTsInitConfig) null, iWNOuterTTSPlayerCallback);
    }
}
