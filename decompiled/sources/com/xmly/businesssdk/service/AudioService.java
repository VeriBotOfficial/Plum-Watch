package com.xmly.businesssdk.service;

import com.xmly.businesssdk.network.bean.PlaybackSpeedInfo;
import com.xmly.businesssdk.network.bean.PreAndNextTrackInfo;
import com.xmly.businesssdk.network.bean.SkipPlayInfo;
import com.xmly.businesssdk.network.bean.TimerStateInfo;
import com.xmly.businesssdk.player.entity.Playable;
import com.xmly.businesssdk.player.entity.PlayerSleepStyle;
import com.yandex.div.core.ScrollDirection;
import com.yandex.div.core.timer.TimerController;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AudioService.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&J\u0017\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0002\u0010\fJ\n\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\u0011\u001a\u00020\u0012H&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\tH&J\u001a\u0010\u001c\u001a\u00020\u00042\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH&J\b\u0010 \u001a\u00020\tH&J<\u0010!\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\tH&JI\u0010'\u001a\u00020\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010/J\u001a\u00100\u001a\u00020\u00042\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH&J\u0010\u00101\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u00102\u001a\u00020\tH&J\u0010\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020)H&J\u0018\u00105\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\tH&J,\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u00109\u001a\u00020\t2\b\b\u0002\u0010:\u001a\u00020\tH&J \u0010;\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020)H&J\b\u0010>\u001a\u00020\tH&J\b\u0010?\u001a\u00020\tH&¨\u0006@"}, d2 = {"Lcom/xmly/businesssdk/service/AudioService;", "", "()V", "addPlayerListener", "", "listener", "Lcom/xmly/businesssdk/service/AudioPlayerListener;", "clearAllPlayerListeners", "getAlbumSort", "", "albumId", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getCurrentPlayable", "Lcom/xmly/businesssdk/player/entity/Playable;", "getPlaybackSpeed", "Lcom/xmly/businesssdk/network/bean/PlaybackSpeedInfo;", "getPlayerTimedStop", "Lcom/xmly/businesssdk/network/bean/TimerStateInfo;", "getPlaylist", "", "getSkipPlay", "Lcom/xmly/businesssdk/network/bean/SkipPlayInfo;", "getSpeed", "", "hasPreAndNextTrack", "Lcom/xmly/businesssdk/network/bean/PreAndNextTrackInfo;", "isPlaying", ScrollDirection.NEXT, "callback", "Lcom/xmly/businesssdk/service/AudioServiceCallback;", "Lcom/xmly/businesssdk/service/AudioOperationResult;", "pause", "playContent", "trackId", "listenPackageId", "breakSecond", "", "enableLocalBreakpointResume", "playerTimedStop", "episodes", "", "sleepStyle", "Lcom/xmly/businesssdk/player/entity/PlayerSleepStyle;", "second", "playStopEpisodes", "isOpen", "(Ljava/lang/Integer;Lcom/xmly/businesssdk/player/entity/PlayerSleepStyle;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Z", "prev", "removePlayerListener", "resume", "seekTo", "timeMs", "setAlbumSort", "isAsc", "setPlaybackSpeed", "rate", "useCurrentAlbum", "apply", "setSkipPlay", "skipBeginning", "skipEnding", TimerController.STOP_COMMAND, "toggle", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AudioService {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void next$default(AudioService audioService, AudioServiceCallback audioServiceCallback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: next");
        }
        if ((i & 1) != 0) {
            audioServiceCallback = null;
        }
        audioService.next(audioServiceCallback);
    }

    public static /* synthetic */ boolean playContent$default(AudioService audioService, String str, String str2, String str3, double d, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playContent");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            d = 0.0d;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return audioService.playContent(str, str2, str3, d, z);
    }

    public static /* synthetic */ boolean playerTimedStop$default(AudioService audioService, Integer num, PlayerSleepStyle playerSleepStyle, Integer num2, Boolean bool, Boolean bool2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playerTimedStop");
        }
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            playerSleepStyle = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            bool2 = null;
        }
        return audioService.playerTimedStop(num, playerSleepStyle, num2, bool, bool2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void prev$default(AudioService audioService, AudioServiceCallback audioServiceCallback, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prev");
        }
        if ((i & 1) != 0) {
            audioServiceCallback = null;
        }
        audioService.prev(audioServiceCallback);
    }

    public static /* synthetic */ boolean setPlaybackSpeed$default(AudioService audioService, float f, String str, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPlaybackSpeed");
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return audioService.setPlaybackSpeed(f, str, z, z2);
    }

    public abstract void addPlayerListener(AudioPlayerListener listener);

    public abstract void clearAllPlayerListeners();

    public abstract Boolean getAlbumSort(String albumId);

    public abstract Playable getCurrentPlayable();

    public abstract PlaybackSpeedInfo getPlaybackSpeed(String albumId);

    public abstract TimerStateInfo getPlayerTimedStop();

    public abstract List<Playable> getPlaylist();

    public abstract SkipPlayInfo getSkipPlay(String albumId);

    public abstract float getSpeed();

    public abstract PreAndNextTrackInfo hasPreAndNextTrack();

    public abstract boolean isPlaying();

    public abstract void next(AudioServiceCallback<AudioOperationResult> callback);

    public abstract boolean pause();

    public abstract boolean playContent(String albumId, String trackId, String listenPackageId, double breakSecond, boolean enableLocalBreakpointResume);

    public abstract boolean playerTimedStop(Integer episodes, PlayerSleepStyle sleepStyle, Integer second, Boolean playStopEpisodes, Boolean isOpen);

    public abstract void prev(AudioServiceCallback<AudioOperationResult> callback);

    public abstract void removePlayerListener(AudioPlayerListener listener);

    public abstract boolean resume();

    public abstract boolean seekTo(int timeMs);

    public abstract boolean setAlbumSort(String albumId, boolean isAsc);

    public abstract boolean setPlaybackSpeed(float rate, String albumId, boolean useCurrentAlbum, boolean apply);

    public abstract boolean setSkipPlay(String albumId, int skipBeginning, int skipEnding);

    public abstract boolean stop();

    public abstract boolean toggle();
}
