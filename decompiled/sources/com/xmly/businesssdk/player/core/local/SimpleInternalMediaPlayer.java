package com.xmly.businesssdk.player.core.local;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import com.xmly.businesssdk.player.core.PlayerListener;
import com.xmly.businesssdk.utils.Logger;

/* loaded from: classes3.dex */
class SimpleInternalMediaPlayer extends MediaPlayer {
    private static final String TAG = "SimpleInternalMediaPlayer";
    private final Context context;
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private MediaPlayer.OnErrorListener onErrorListener;
    private MediaPlayer.OnInfoListener onInfoListener;
    private final String url;

    public SimpleInternalMediaPlayer(Context context, String str) {
        this.context = context;
        this.url = str;
        play();
    }

    @Override // android.media.MediaPlayer
    public int getCurrentPosition() {
        return super.getCurrentPosition();
    }

    public void play() {
        this.mMainHandler.post(new Runnable() { // from class: com.xmly.businesssdk.player.core.local.SimpleInternalMediaPlayer.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SimpleInternalMediaPlayer simpleInternalMediaPlayer = SimpleInternalMediaPlayer.this;
                    simpleInternalMediaPlayer.setDataSource(simpleInternalMediaPlayer.url);
                    SimpleInternalMediaPlayer.this.setAudioStreamType(3);
                    SimpleInternalMediaPlayer.this.prepareAsync();
                    SimpleInternalMediaPlayer.this.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.xmly.businesssdk.player.core.local.SimpleInternalMediaPlayer.1.1
                        @Override // android.media.MediaPlayer.OnPreparedListener
                        public void onPrepared(MediaPlayer mediaPlayer) {
                            SimpleInternalMediaPlayer.this.start();
                        }
                    });
                } catch (Exception e) {
                    Logger.w(SimpleInternalMediaPlayer.TAG, "SimpleInternalMediaPlayer play Exception", e);
                    if (SimpleInternalMediaPlayer.this.onErrorListener != null) {
                        SimpleInternalMediaPlayer.this.onErrorListener.onError(SimpleInternalMediaPlayer.this, PlayerListener.USER_ERROR_WHAT, -1);
                    }
                }
            }
        });
    }

    @Override // android.media.MediaPlayer
    public void release() {
        this.onErrorListener = null;
        super.release();
    }

    @Override // android.media.MediaPlayer
    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.onErrorListener = onErrorListener;
        super.setOnErrorListener(onErrorListener);
    }
}
