package com.xmly.businesssdk.player.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.config.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SkipPlayManager.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\u0013\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rJ*\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xmly/businesssdk/player/util/SkipPlayManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "clearAllSkipPlay", "", "clearSkipPlay", "albumId", "", "getSkipBeginning", "", "getSkipBeginningKey", "getSkipEnding", "getSkipEndingKey", "getSkipPlayInfo", "Lcom/xmly/businesssdk/player/util/SkipPlayManager$SkipPlayInfo;", "setSkipPlay", "skipBeginning", "skipEnding", "shouldSkip", "Lkotlin/Pair;", "", "durationSeconds", "Companion", "SkipPlayInfo", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class SkipPlayManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int DEFAULT_SKIP_TIME = 0;
    private static final String KEY_SKIP_BEGINNING_PREFIX = "skip_beginning_";
    private static final String KEY_SKIP_ENDING_PREFIX = "skip_ending_";
    private static final int MAX_SKIP_TIME = 120;
    private static final String PREF_NAME = "skip_play_settings";
    private static volatile SkipPlayManager instance;
    private final SharedPreferences sharedPreferences;

    /* compiled from: SkipPlayManager.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xmly/businesssdk/player/util/SkipPlayManager$Companion;", "", "()V", "DEFAULT_SKIP_TIME", "", "KEY_SKIP_BEGINNING_PREFIX", "", "KEY_SKIP_ENDING_PREFIX", "MAX_SKIP_TIME", "PREF_NAME", "instance", "Lcom/xmly/businesssdk/player/util/SkipPlayManager;", "getInstance", "context", "Landroid/content/Context;", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SkipPlayManager getInstance(Context context) {
            SkipPlayManager skipPlayManager;
            Intrinsics.checkNotNullParameter(context, "context");
            SkipPlayManager skipPlayManager2 = SkipPlayManager.instance;
            if (skipPlayManager2 != null) {
                return skipPlayManager2;
            }
            synchronized (this) {
                skipPlayManager = SkipPlayManager.instance;
                if (skipPlayManager == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                    skipPlayManager = new SkipPlayManager(applicationContext, null);
                    Companion companion = SkipPlayManager.INSTANCE;
                    SkipPlayManager.instance = skipPlayManager;
                }
            }
            return skipPlayManager;
        }
    }

    /* compiled from: SkipPlayManager.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xmly/businesssdk/player/util/SkipPlayManager$SkipPlayInfo;", "", "albumId", "", "skipBeginning", "", "skipEnding", "(Ljava/lang/String;II)V", "getAlbumId", "()Ljava/lang/String;", "getSkipBeginning", "()I", "getSkipEnding", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class SkipPlayInfo {
        private final String albumId;
        private final int skipBeginning;
        private final int skipEnding;

        public SkipPlayInfo(String albumId, int i, int i2) {
            Intrinsics.checkNotNullParameter(albumId, "albumId");
            this.albumId = albumId;
            this.skipBeginning = i;
            this.skipEnding = i2;
        }

        public static /* synthetic */ SkipPlayInfo copy$default(SkipPlayInfo skipPlayInfo, String str, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = skipPlayInfo.albumId;
            }
            if ((i3 & 2) != 0) {
                i = skipPlayInfo.skipBeginning;
            }
            if ((i3 & 4) != 0) {
                i2 = skipPlayInfo.skipEnding;
            }
            return skipPlayInfo.copy(str, i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAlbumId() {
            return this.albumId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getSkipBeginning() {
            return this.skipBeginning;
        }

        /* renamed from: component3, reason: from getter */
        public final int getSkipEnding() {
            return this.skipEnding;
        }

        public final SkipPlayInfo copy(String albumId, int skipBeginning, int skipEnding) {
            Intrinsics.checkNotNullParameter(albumId, "albumId");
            return new SkipPlayInfo(albumId, skipBeginning, skipEnding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SkipPlayInfo)) {
                return false;
            }
            SkipPlayInfo skipPlayInfo = (SkipPlayInfo) other;
            return Intrinsics.areEqual(this.albumId, skipPlayInfo.albumId) && this.skipBeginning == skipPlayInfo.skipBeginning && this.skipEnding == skipPlayInfo.skipEnding;
        }

        public final String getAlbumId() {
            return this.albumId;
        }

        public final int getSkipBeginning() {
            return this.skipBeginning;
        }

        public final int getSkipEnding() {
            return this.skipEnding;
        }

        public int hashCode() {
            return Integer.hashCode(this.skipEnding) + b.a(this.skipBeginning, this.albumId.hashCode() * 31, 31);
        }

        public String toString() {
            return c.a("SkipPlayInfo(albumId=").append(this.albumId).append(", skipBeginning=").append(this.skipBeginning).append(", skipEnding=").append(this.skipEnding).append(')').toString();
        }
    }

    private SkipPlayManager(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.sharedPreferences = sharedPreferences;
    }

    public /* synthetic */ SkipPlayManager(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final String getSkipBeginningKey(String albumId) {
        return KEY_SKIP_BEGINNING_PREFIX + albumId;
    }

    private final String getSkipEndingKey(String albumId) {
        return KEY_SKIP_ENDING_PREFIX + albumId;
    }

    public final void clearAllSkipPlay() {
        this.sharedPreferences.edit().clear().apply();
    }

    public final void clearSkipPlay(String albumId) {
        Intrinsics.checkNotNullParameter(albumId, "albumId");
        this.sharedPreferences.edit().remove(getSkipBeginningKey(albumId)).remove(getSkipEndingKey(albumId)).apply();
    }

    public final int getSkipBeginning(String albumId) {
        Intrinsics.checkNotNullParameter(albumId, "albumId");
        return this.sharedPreferences.getInt(getSkipBeginningKey(albumId), 0);
    }

    public final int getSkipEnding(String albumId) {
        Intrinsics.checkNotNullParameter(albumId, "albumId");
        return this.sharedPreferences.getInt(getSkipEndingKey(albumId), 0);
    }

    public final SkipPlayInfo getSkipPlayInfo(String albumId) {
        Intrinsics.checkNotNullParameter(albumId, "albumId");
        return new SkipPlayInfo(albumId, getSkipBeginning(albumId), getSkipEnding(albumId));
    }

    public final void setSkipPlay(String albumId, int skipBeginning, int skipEnding) {
        Intrinsics.checkNotNullParameter(albumId, "albumId");
        int coerceIn = RangesKt.coerceIn(skipBeginning, 0, 120);
        this.sharedPreferences.edit().putInt(getSkipBeginningKey(albumId), coerceIn).putInt(getSkipEndingKey(albumId), RangesKt.coerceIn(skipEnding, 0, 120)).apply();
    }

    public final Pair<Boolean, Boolean> shouldSkip(int durationSeconds, int skipBeginning, int skipEnding) {
        if (durationSeconds <= 0 || (skipBeginning <= 0 && skipEnding <= 0)) {
            Boolean bool = Boolean.FALSE;
            return new Pair<>(bool, bool);
        }
        if (durationSeconds <= 120) {
            Boolean bool2 = Boolean.FALSE;
            return new Pair<>(bool2, bool2);
        }
        if (durationSeconds <= 120 || durationSeconds >= 240) {
            return new Pair<>(Boolean.valueOf(skipBeginning > 0), Boolean.valueOf(skipEnding > 0 && skipBeginning + skipEnding < durationSeconds));
        }
        return new Pair<>(Boolean.valueOf(skipBeginning > 0 && skipBeginning <= durationSeconds / 2), Boolean.FALSE);
    }
}
