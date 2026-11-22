package com.xmly.businesssdk.player.core.exo;

import android.content.Context;
import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.xmly.businesssdk.player.command.CommandFactory;
import com.xmly.businesssdk.utils.Logger;

/* loaded from: classes3.dex */
public class MediaSessionCallback extends MediaSessionCompat.Callback {
    private static final String TAG = "MediaSessionCallback";
    private final Context mContext;
    private final SimpleExoPlayer mPlayer;

    public MediaSessionCallback(Context context, SimpleExoPlayer simpleExoPlayer) {
        this.mContext = context;
        this.mPlayer = simpleExoPlayer;
    }

    private void togglePlayPause() {
        CommandFactory.getInstance(this.mContext).sendCommand(CommandFactory.Command.ACTION_TOGGLE_PLAY);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public boolean onMediaButtonEvent(Intent intent) {
        Logger.i(TAG, "onMediaButtonEvent ");
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 85) {
            return super.onMediaButtonEvent(intent);
        }
        togglePlayPause();
        return true;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onPause() {
        Logger.i(TAG, "onPause ");
        CommandFactory.getInstance(this.mContext).sendCommand(CommandFactory.Command.ACTION_PAUSE);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onPlay() {
        Logger.i(TAG, "onPlay ");
        CommandFactory.getInstance(this.mContext).sendCommand(CommandFactory.Command.ACTION_PLAY);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onSeekTo(long j) {
        CommandFactory.getInstance(this.mContext).sendCommand(CommandFactory.Command.ACTION_PAUSE);
        long duration = this.mPlayer.getDuration();
        if (duration != Long.MIN_VALUE) {
            j = Math.min(j, duration);
        }
        long max = Math.max(j, 0L);
        Logger.i(TAG, "onSeekTo, seek position = " + max);
        this.mPlayer.seekTo(max);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onSkipToNext() {
        super.onSkipToNext();
        Logger.i(TAG, "onSkipToNext ");
        CommandFactory.getInstance(this.mContext).sendCommand(CommandFactory.Command.ACTION_NEXT);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onSkipToPrevious() {
        super.onSkipToPrevious();
        Logger.i(TAG, "onSkipToPrevious ");
        CommandFactory.getInstance(this.mContext).sendCommand(CommandFactory.Command.ACTION_PRE);
    }
}
