package com.xmly.businesssdk.player.core.exo;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.exoplayer2.ControlDispatcher;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import com.xmly.businesssdk.player.command.CommandFactory;
import com.xmly.businesssdk.utils.Logger;

/* loaded from: classes3.dex */
public class ExoQueueNavigator implements MediaSessionConnector.QueueNavigator {
    private static final long PLAYBACK_ACTIONS = 560;
    private static final String TAG = "ExoQueueNavigator";
    private final Context mContext;

    public ExoQueueNavigator(Context context) {
        this.mContext = context;
    }

    public long getActiveQueueItemId(Player player) {
        return 0L;
    }

    public long getSupportedQueueNavigatorActions(Player player) {
        return PLAYBACK_ACTIONS;
    }

    public boolean onCommand(Player player, ControlDispatcher controlDispatcher, String str, Bundle bundle, ResultReceiver resultReceiver) {
        return onCommand(player, str, bundle, resultReceiver);
    }

    public void onCurrentWindowIndexChanged(Player player) {
    }

    public void onSkipToNext(Player player, ControlDispatcher controlDispatcher) {
        onSkipToNext(player);
    }

    public void onSkipToPrevious(Player player, ControlDispatcher controlDispatcher) {
        onSkipToPrevious(player);
    }

    public void onSkipToQueueItem(Player player, ControlDispatcher controlDispatcher, long j) {
        onSkipToQueueItem(player, j);
    }

    public void onTimelineChanged(Player player) {
    }

    public boolean onCommand(Player player, String str, Bundle bundle, ResultReceiver resultReceiver) {
        Logger.v(TAG, "onCommand: " + str);
        return false;
    }

    public void onSkipToNext(Player player) {
        Logger.v(TAG, "onSkipToNext");
        CommandFactory.getInstance(this.mContext).sendCommand(CommandFactory.Command.ACTION_NEXT);
    }

    public void onSkipToPrevious(Player player) {
        Logger.v(TAG, "onSkipToPrevious");
        CommandFactory.getInstance(this.mContext).sendCommand(CommandFactory.Command.ACTION_PRE);
    }

    public void onSkipToQueueItem(Player player, long j) {
        Logger.v(TAG, "onSkipToQueueItem: " + j);
    }
}
