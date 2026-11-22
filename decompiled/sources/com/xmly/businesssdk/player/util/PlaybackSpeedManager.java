package com.xmly.businesssdk.player.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.xmly.businesssdk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlaybackSpeedManager.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001e\u0010\u0014\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xmly/businesssdk/player/util/PlaybackSpeedManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "clearAllPlaybackSpeeds", "", "clearPlaybackSpeed", "albumId", "", "getPlaybackSpeed", "", "getPlaybackSpeedInfo", "Lcom/xmly/businesssdk/player/util/PlaybackSpeedManager$PlaybackSpeedInfo;", "getSpeedKey", "getUseCurrentAlbum", "", "getUseCurrentAlbumKey", "setPlaybackSpeed", "rate", "useCurrentAlbum", "Companion", "PlaybackSpeedInfo", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class PlaybackSpeedManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float DEFAULT_SPEED = 1.0f;
    private static final String KEY_PREFIX = "speed_";
    private static final String KEY_USE_CURRENT_ALBUM_PREFIX = "use_current_";
    private static final String PREF_NAME = "playback_speed_settings";
    private static volatile PlaybackSpeedManager instance;
    private final SharedPreferences sharedPreferences;

    /* compiled from: PlaybackSpeedManager.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xmly/businesssdk/player/util/PlaybackSpeedManager$Companion;", "", "()V", "DEFAULT_SPEED", "", "KEY_PREFIX", "", "KEY_USE_CURRENT_ALBUM_PREFIX", "PREF_NAME", "instance", "Lcom/xmly/businesssdk/player/util/PlaybackSpeedManager;", "getInstance", "context", "Landroid/content/Context;", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PlaybackSpeedManager getInstance(Context context) {
            PlaybackSpeedManager playbackSpeedManager;
            Intrinsics.checkNotNullParameter(context, "context");
            PlaybackSpeedManager playbackSpeedManager2 = PlaybackSpeedManager.instance;
            if (playbackSpeedManager2 != null) {
                return playbackSpeedManager2;
            }
            synchronized (this) {
                playbackSpeedManager = PlaybackSpeedManager.instance;
                if (playbackSpeedManager == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                    playbackSpeedManager = new PlaybackSpeedManager(applicationContext, null);
                    Companion companion = PlaybackSpeedManager.INSTANCE;
                    PlaybackSpeedManager.instance = playbackSpeedManager;
                }
            }
            return playbackSpeedManager;
        }
    }

    /* compiled from: PlaybackSpeedManager.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/xmly/businesssdk/player/util/PlaybackSpeedManager$PlaybackSpeedInfo;", "", "albumId", "", "rate", "", "useCurrentAlbum", "", "(Ljava/lang/String;FZ)V", "getAlbumId", "()Ljava/lang/String;", "getRate", "()F", "getUseCurrentAlbum", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class PlaybackSpeedInfo {
        private final String albumId;
        private final float rate;
        private final boolean useCurrentAlbum;

        public PlaybackSpeedInfo(String albumId, float f, boolean z) {
            Intrinsics.checkNotNullParameter(albumId, "albumId");
            this.albumId = albumId;
            this.rate = f;
            this.useCurrentAlbum = z;
        }

        public static /* synthetic */ PlaybackSpeedInfo copy$default(PlaybackSpeedInfo playbackSpeedInfo, String str, float f, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = playbackSpeedInfo.albumId;
            }
            if ((i & 2) != 0) {
                f = playbackSpeedInfo.rate;
            }
            if ((i & 4) != 0) {
                z = playbackSpeedInfo.useCurrentAlbum;
            }
            return playbackSpeedInfo.copy(str, f, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAlbumId() {
            return this.albumId;
        }

        /* renamed from: component2, reason: from getter */
        public final float getRate() {
            return this.rate;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getUseCurrentAlbum() {
            return this.useCurrentAlbum;
        }

        public final PlaybackSpeedInfo copy(String albumId, float rate, boolean useCurrentAlbum) {
            Intrinsics.checkNotNullParameter(albumId, "albumId");
            return new PlaybackSpeedInfo(albumId, rate, useCurrentAlbum);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlaybackSpeedInfo)) {
                return false;
            }
            PlaybackSpeedInfo playbackSpeedInfo = (PlaybackSpeedInfo) other;
            return Intrinsics.areEqual(this.albumId, playbackSpeedInfo.albumId) && Float.compare(this.rate, playbackSpeedInfo.rate) == 0 && this.useCurrentAlbum == playbackSpeedInfo.useCurrentAlbum;
        }

        public final String getAlbumId() {
            return this.albumId;
        }

        public final float getRate() {
            return this.rate;
        }

        public final boolean getUseCurrentAlbum() {
            return this.useCurrentAlbum;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = (Float.hashCode(this.rate) + (this.albumId.hashCode() * 31)) * 31;
            boolean z = this.useCurrentAlbum;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            return c.a("PlaybackSpeedInfo(albumId=").append(this.albumId).append(", rate=").append(this.rate).append(", useCurrentAlbum=").append(this.useCurrentAlbum).append(')').toString();
        }
    }

    private PlaybackSpeedManager(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.sharedPreferences = sharedPreferences;
    }

    public /* synthetic */ PlaybackSpeedManager(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final String getSpeedKey(String albumId) {
        return KEY_PREFIX + albumId;
    }

    private final String getUseCurrentAlbumKey(String albumId) {
        return KEY_USE_CURRENT_ALBUM_PREFIX + albumId;
    }

    public final void clearAllPlaybackSpeeds() {
        this.sharedPreferences.edit().clear().apply();
    }

    public final void clearPlaybackSpeed(String albumId) {
        Intrinsics.checkNotNullParameter(albumId, "albumId");
        this.sharedPreferences.edit().remove(getSpeedKey(albumId)).remove(getUseCurrentAlbumKey(albumId)).apply();
    }

    public final float getPlaybackSpeed(String albumId) {
        Intrinsics.checkNotNullParameter(albumId, "albumId");
        return this.sharedPreferences.getFloat(getSpeedKey(albumId), 1.0f);
    }

    public final PlaybackSpeedInfo getPlaybackSpeedInfo(String albumId) {
        Intrinsics.checkNotNullParameter(albumId, "albumId");
        return new PlaybackSpeedInfo(albumId, getPlaybackSpeed(albumId), getUseCurrentAlbum(albumId));
    }

    public final boolean getUseCurrentAlbum(String albumId) {
        Intrinsics.checkNotNullParameter(albumId, "albumId");
        return this.sharedPreferences.getBoolean(getUseCurrentAlbumKey(albumId), false);
    }

    public final void setPlaybackSpeed(String albumId, float rate, boolean useCurrentAlbum) {
        Intrinsics.checkNotNullParameter(albumId, "albumId");
        this.sharedPreferences.edit().putFloat(getSpeedKey(albumId), rate).putBoolean(getUseCurrentAlbumKey(albumId), useCurrentAlbum).apply();
    }
}
