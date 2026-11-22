package com.xmly.businesssdk.player.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.xmly.businesssdk.player.entity.PlaybackMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: AlbumSortManager.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xmly/businesssdk/player/util/AlbumSortManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "clearAlbumSort", "", "albumId", "", "clearAllAlbumSort", "convertFromPlaybackMode", "", DOMConstants.ATTR_MODE, "Lcom/xmly/businesssdk/player/entity/PlaybackMode;", "convertToPlaybackMode", "isAsc", "getAlbumSort", "getKey", "setAlbumSort", "Companion", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class AlbumSortManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String KEY_PREFIX = "album_sort_";
    private static final String PREF_NAME = "album_sort_settings";
    private static volatile AlbumSortManager instance;
    private final SharedPreferences sharedPreferences;

    /* compiled from: AlbumSortManager.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xmly/businesssdk/player/util/AlbumSortManager$Companion;", "", "()V", "KEY_PREFIX", "", "PREF_NAME", "instance", "Lcom/xmly/businesssdk/player/util/AlbumSortManager;", "getInstance", "context", "Landroid/content/Context;", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AlbumSortManager getInstance(Context context) {
            AlbumSortManager albumSortManager;
            Intrinsics.checkNotNullParameter(context, "context");
            AlbumSortManager albumSortManager2 = AlbumSortManager.instance;
            if (albumSortManager2 != null) {
                return albumSortManager2;
            }
            synchronized (this) {
                albumSortManager = AlbumSortManager.instance;
                if (albumSortManager == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                    albumSortManager = new AlbumSortManager(applicationContext, null);
                    Companion companion = AlbumSortManager.INSTANCE;
                    AlbumSortManager.instance = albumSortManager;
                }
            }
            return albumSortManager;
        }
    }

    /* compiled from: AlbumSortManager.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlaybackMode.values().length];
            try {
                iArr[PlaybackMode.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlaybackMode.SINGLE_REPEAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlaybackMode.LIST_COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlaybackMode.SHUFFLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlaybackMode.REVERSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AlbumSortManager(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.sharedPreferences = sharedPreferences;
    }

    public /* synthetic */ AlbumSortManager(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final String getKey(String albumId) {
        return KEY_PREFIX + albumId;
    }

    public final void clearAlbumSort(String albumId) {
        Intrinsics.checkNotNullParameter(albumId, "albumId");
        this.sharedPreferences.edit().remove(getKey(albumId)).apply();
    }

    public final void clearAllAlbumSort() {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        for (String key : this.sharedPreferences.getAll().keySet()) {
            Intrinsics.checkNotNullExpressionValue(key, "key");
            if (StringsKt.startsWith$default(key, KEY_PREFIX, false, 2, (Object) null)) {
                edit.remove(key);
            }
        }
        edit.apply();
    }

    public final boolean convertFromPlaybackMode(PlaybackMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final PlaybackMode convertToPlaybackMode(boolean isAsc) {
        return isAsc ? PlaybackMode.NORMAL : PlaybackMode.REVERSE;
    }

    public final boolean getAlbumSort(String albumId) {
        Intrinsics.checkNotNullParameter(albumId, "albumId");
        return this.sharedPreferences.getBoolean(getKey(albumId), true);
    }

    public final void setAlbumSort(String albumId, boolean isAsc) {
        Intrinsics.checkNotNullParameter(albumId, "albumId");
        this.sharedPreferences.edit().putBoolean(getKey(albumId), isAsc).apply();
    }
}
