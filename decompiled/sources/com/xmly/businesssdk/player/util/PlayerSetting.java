package com.xmly.businesssdk.player.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import com.xmly.businesssdk.player.core.exo.ExoInternalMediaPlayer;
import com.xmly.businesssdk.player.core.exo.ExoMediaMetadataProvider;
import com.xmly.businesssdk.player.core.interceptor.PlayerInterceptor;
import com.xmly.businesssdk.player.core.local.IMediaPlayer;
import com.xmly.businesssdk.player.entity.Playable;
import com.xmly.businesssdk.player.entity.PlaybackMode;
import com.xmly.businesssdk.utils.ClassUtil;

/* loaded from: classes3.dex */
public class PlayerSetting {
    private static final String SETTING_ENABLE_MOBILE_NET = "setting_enable_mobile_net";
    private static final String SETTING_PLAYBACK_MODE = "setting_playback_mode";
    private static final String SETTING_PLAY_LIST_POSITION = "setting_play_list_position";
    private static final String SETTING_PLAY_PROGRESS = "setting_play_progress";
    private static final String SETTING_PLAY_PROGRESS_ID = "setting_play_progress_id";
    private static final String SETTING_PLAY_SPEED = "setting_play_speed";
    private static boolean forceUseExoPlayer = true;
    private static PlayerSetting instance = null;
    private static MediaPlayerCreator mediaPlayerCreator = null;
    private static Class<? extends MediaPlayerCreator> mediaPlayerCreatorClass = ExoMediaPlayerCreator.class;
    private static Class<?> notificationClickActivity = null;
    private static Integer notificationIconResId = null;
    private static boolean sHideNotificationSeekbar = false;
    private static boolean showNotification = false;
    private static boolean useCacheSpeed = false;
    private static boolean useMediaSession = true;
    private final SharedPreferences mSharedPreferences;

    public static class ExoMediaPlayerCreator implements MediaPlayerCreator {
        @Override // com.xmly.businesssdk.player.util.PlayerSetting.MediaPlayerCreator
        public IMediaPlayer createMediaPlayer(Context context, Playable playable, MediaSessionCompat mediaSessionCompat, PlayerInterceptor playerInterceptor, ExoMediaMetadataProvider exoMediaMetadataProvider) {
            String path;
            if (PlayerSetting.forceUseExoPlayer) {
                if (ClassUtil.existClass("com.google.android.exoplayer2.Player")) {
                    return new ExoInternalMediaPlayer(context, playerInterceptor, mediaSessionCompat, exoMediaMetadataProvider);
                }
                return null;
            }
            String url = playable.getUrl();
            if (!TextUtils.isEmpty(url) && (path = Uri.parse(url).getPath()) != null && path.endsWith(".m3u8") && ClassUtil.existClass("com.google.android.exoplayer2.Player")) {
                return new ExoInternalMediaPlayer(context, playerInterceptor, mediaSessionCompat, exoMediaMetadataProvider);
            }
            return null;
        }
    }

    public interface MediaPlayerCreator {
        IMediaPlayer createMediaPlayer(Context context, Playable playable, MediaSessionCompat mediaSessionCompat, PlayerInterceptor playerInterceptor, ExoMediaMetadataProvider exoMediaMetadataProvider);
    }

    private PlayerSetting(Context context) {
        this.mSharedPreferences = context.getSharedPreferences("playerSetting", 0);
    }

    public static PlayerSetting getInstance(Context context) {
        if (instance == null) {
            instance = new PlayerSetting(context);
        }
        return instance;
    }

    public static MediaPlayerCreator getMediaPlayerCreator() {
        if (mediaPlayerCreator == null) {
            mediaPlayerCreator = (MediaPlayerCreator) ClassUtil.createFromClass(mediaPlayerCreatorClass);
        }
        return mediaPlayerCreator;
    }

    public static Class<?> getNotificationClickActivity() {
        return notificationClickActivity;
    }

    public static Integer getNotificationIconResId() {
        return notificationIconResId;
    }

    public static boolean isHideNotificationSeekbar() {
        return sHideNotificationSeekbar;
    }

    public static boolean isUseCacheSpeed() {
        return useCacheSpeed;
    }

    public static boolean isUseMediaSession() {
        return useMediaSession;
    }

    public static void setForceUseExoPlayer(boolean z) {
        forceUseExoPlayer = z;
    }

    public static void setHideNotificationSeekbar(boolean z) {
        sHideNotificationSeekbar = z;
    }

    public static void setMediaPlayerCreator(Class<? extends MediaPlayerCreator> cls) {
        if (mediaPlayerCreatorClass != cls) {
            mediaPlayerCreator = null;
        }
        mediaPlayerCreatorClass = cls;
    }

    public static void setNotificationClickActivity(Class<?> cls) {
        notificationClickActivity = cls;
    }

    public static void setNotificationIconResId(Integer num) {
        notificationIconResId = num;
    }

    public static void setShowNotification(boolean z) {
        showNotification = z;
    }

    public static void setUseCacheSpeed(boolean z) {
        useCacheSpeed = z;
    }

    public static void setUseMediaSession(boolean z) {
        useMediaSession = z;
    }

    public static boolean showNotification() {
        return showNotification;
    }

    public boolean enableMobileNet() {
        return this.mSharedPreferences.getBoolean(SETTING_ENABLE_MOBILE_NET, false);
    }

    public int getPlayProgress() {
        return this.mSharedPreferences.getInt(SETTING_PLAY_PROGRESS, 0);
    }

    public String getPlayProgressId() {
        return this.mSharedPreferences.getString(SETTING_PLAY_PROGRESS_ID, null);
    }

    public PlaybackMode getPlaybackMode() {
        PlaybackMode[] values = PlaybackMode.values();
        int i = this.mSharedPreferences.getInt(SETTING_PLAYBACK_MODE, 0);
        return i < values.length ? values[i] : PlaybackMode.NORMAL;
    }

    public int getPlaylistPosition() {
        return this.mSharedPreferences.getInt(SETTING_PLAY_LIST_POSITION, 0);
    }

    public float getSpeed() {
        if (useCacheSpeed) {
            return this.mSharedPreferences.getFloat(SETTING_PLAY_SPEED, 1.0f);
        }
        return 1.0f;
    }

    public void setMobileNetEnable(boolean z) {
        this.mSharedPreferences.edit().putBoolean(SETTING_ENABLE_MOBILE_NET, z).apply();
    }

    public void setPlayProgress(int i) {
        this.mSharedPreferences.edit().putInt(SETTING_PLAY_PROGRESS, i).apply();
    }

    public void setPlayProgressId(String str) {
        this.mSharedPreferences.edit().putString(SETTING_PLAY_PROGRESS_ID, str).apply();
    }

    public void setPlaybackMode(PlaybackMode playbackMode) {
        this.mSharedPreferences.edit().putInt(SETTING_PLAYBACK_MODE, playbackMode.ordinal()).apply();
    }

    public void setPlaylistPosition(int i) {
        this.mSharedPreferences.edit().putInt(SETTING_PLAY_LIST_POSITION, i).apply();
    }

    public void setSpeed(float f) {
        if (useCacheSpeed) {
            this.mSharedPreferences.edit().putFloat(SETTING_PLAY_SPEED, f).apply();
        }
    }
}
