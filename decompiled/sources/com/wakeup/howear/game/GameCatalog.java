package com.wakeup.howear.game;

import android.gov.nist.core.Separators;
import androidx.camera.core.RetryPolicy;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.wakeup.common.burypoint.BuryPointEventName;
import com.wakeup.common.burypoint.BuryPointPageId;
import com.wakeup.howear.view.home.slot.HomeSlotConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: GameCatalog.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\tJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\tJ\u0010\u0010\u000f\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/wakeup/howear/game/GameCatalog;", "", "<init>", "()V", "GAMES", "", "Lcom/wakeup/howear/game/GameCatalog$Game;", "BY_ID", "", "", "all", "find", AndroidGetAdPlayerContext.KEY_GAME_ID, "isRemote", "", "displayName", "coverAsset", "h5Path", "fromUrl", "url", "Game", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GameCatalog {
    private static final Map<String, Game> BY_ID;
    private static final List<Game> GAMES;
    public static final GameCatalog INSTANCE = new GameCatalog();

    private GameCatalog() {
    }

    /* compiled from: GameCatalog.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b5\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\fHÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010*J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u0010B\u001a\u00020\u0015HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÚ\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\u00062\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020KHÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001cR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001cR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001c¨\u0006M"}, d2 = {"Lcom/wakeup/howear/game/GameCatalog$Game;", "", "id", "", "displayName", "remote", "", "wxShim", "coverAsset", "loadingAssets", "", "loadingArtAlpha", "", "loadingArtCenterCrop", "loadingArtMaxCropFraction", "loadingArtBackgroundColor", "loadingProgressTopRatio", "loadingArtworkContainsStatusText", "loadingTitle", "readyMarkers", "minHoldMs", "", "trackPageId", "enterEvent", "exitEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;FZFLjava/lang/String;Ljava/lang/Float;ZLjava/lang/String;Ljava/util/List;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getDisplayName", "getRemote", "()Z", "getWxShim", "getCoverAsset", "getLoadingAssets", "()Ljava/util/List;", "getLoadingArtAlpha", "()F", "getLoadingArtCenterCrop", "getLoadingArtMaxCropFraction", "getLoadingArtBackgroundColor", "getLoadingProgressTopRatio", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getLoadingArtworkContainsStatusText", "getLoadingTitle", "getReadyMarkers", "getMinHoldMs", "()J", "getTrackPageId", "getEnterEvent", "getExitEvent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;FZFLjava/lang/String;Ljava/lang/Float;ZLjava/lang/String;Ljava/util/List;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/wakeup/howear/game/GameCatalog$Game;", "equals", "other", "hashCode", "", "toString", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Game {
        private final String coverAsset;
        private final String displayName;
        private final String enterEvent;
        private final String exitEvent;
        private final String id;
        private final float loadingArtAlpha;
        private final String loadingArtBackgroundColor;
        private final boolean loadingArtCenterCrop;
        private final float loadingArtMaxCropFraction;
        private final boolean loadingArtworkContainsStatusText;
        private final List<String> loadingAssets;
        private final Float loadingProgressTopRatio;
        private final String loadingTitle;
        private final long minHoldMs;
        private final List<String> readyMarkers;
        private final boolean remote;
        private final String trackPageId;
        private final boolean wxShim;

        public static /* synthetic */ Game copy$default(Game game, String str, String str2, boolean z, boolean z2, String str3, List list, float f, boolean z3, float f2, String str4, Float f3, boolean z4, String str5, List list2, long j, String str6, String str7, String str8, int i, Object obj) {
            String str9;
            String str10;
            String str11 = (i & 1) != 0 ? game.id : str;
            String str12 = (i & 2) != 0 ? game.displayName : str2;
            boolean z5 = (i & 4) != 0 ? game.remote : z;
            boolean z6 = (i & 8) != 0 ? game.wxShim : z2;
            String str13 = (i & 16) != 0 ? game.coverAsset : str3;
            List list3 = (i & 32) != 0 ? game.loadingAssets : list;
            float f4 = (i & 64) != 0 ? game.loadingArtAlpha : f;
            boolean z7 = (i & 128) != 0 ? game.loadingArtCenterCrop : z3;
            float f5 = (i & 256) != 0 ? game.loadingArtMaxCropFraction : f2;
            String str14 = (i & 512) != 0 ? game.loadingArtBackgroundColor : str4;
            Float f6 = (i & 1024) != 0 ? game.loadingProgressTopRatio : f3;
            boolean z8 = (i & 2048) != 0 ? game.loadingArtworkContainsStatusText : z4;
            String str15 = (i & 4096) != 0 ? game.loadingTitle : str5;
            List list4 = (i & 8192) != 0 ? game.readyMarkers : list2;
            String str16 = str11;
            long j2 = (i & 16384) != 0 ? game.minHoldMs : j;
            String str17 = (i & 32768) != 0 ? game.trackPageId : str6;
            String str18 = (i & 65536) != 0 ? game.enterEvent : str7;
            if ((i & 131072) != 0) {
                str10 = str17;
                str9 = game.exitEvent;
            } else {
                str9 = str8;
                str10 = str17;
            }
            return game.copy(str16, str12, z5, z6, str13, list3, f4, z7, f5, str14, f6, z8, str15, list4, j2, str10, str18, str9);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getLoadingArtBackgroundColor() {
            return this.loadingArtBackgroundColor;
        }

        /* renamed from: component11, reason: from getter */
        public final Float getLoadingProgressTopRatio() {
            return this.loadingProgressTopRatio;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getLoadingArtworkContainsStatusText() {
            return this.loadingArtworkContainsStatusText;
        }

        /* renamed from: component13, reason: from getter */
        public final String getLoadingTitle() {
            return this.loadingTitle;
        }

        public final List<String> component14() {
            return this.readyMarkers;
        }

        /* renamed from: component15, reason: from getter */
        public final long getMinHoldMs() {
            return this.minHoldMs;
        }

        /* renamed from: component16, reason: from getter */
        public final String getTrackPageId() {
            return this.trackPageId;
        }

        /* renamed from: component17, reason: from getter */
        public final String getEnterEvent() {
            return this.enterEvent;
        }

        /* renamed from: component18, reason: from getter */
        public final String getExitEvent() {
            return this.exitEvent;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getRemote() {
            return this.remote;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getWxShim() {
            return this.wxShim;
        }

        /* renamed from: component5, reason: from getter */
        public final String getCoverAsset() {
            return this.coverAsset;
        }

        public final List<String> component6() {
            return this.loadingAssets;
        }

        /* renamed from: component7, reason: from getter */
        public final float getLoadingArtAlpha() {
            return this.loadingArtAlpha;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getLoadingArtCenterCrop() {
            return this.loadingArtCenterCrop;
        }

        /* renamed from: component9, reason: from getter */
        public final float getLoadingArtMaxCropFraction() {
            return this.loadingArtMaxCropFraction;
        }

        public final Game copy(String id2, String displayName, boolean remote, boolean wxShim, String coverAsset, List<String> loadingAssets, float loadingArtAlpha, boolean loadingArtCenterCrop, float loadingArtMaxCropFraction, String loadingArtBackgroundColor, Float loadingProgressTopRatio, boolean loadingArtworkContainsStatusText, String loadingTitle, List<String> readyMarkers, long minHoldMs, String trackPageId, String enterEvent, String exitEvent) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(loadingAssets, "loadingAssets");
            Intrinsics.checkNotNullParameter(loadingArtBackgroundColor, "loadingArtBackgroundColor");
            Intrinsics.checkNotNullParameter(readyMarkers, "readyMarkers");
            return new Game(id2, displayName, remote, wxShim, coverAsset, loadingAssets, loadingArtAlpha, loadingArtCenterCrop, loadingArtMaxCropFraction, loadingArtBackgroundColor, loadingProgressTopRatio, loadingArtworkContainsStatusText, loadingTitle, readyMarkers, minHoldMs, trackPageId, enterEvent, exitEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Game)) {
                return false;
            }
            Game game = (Game) other;
            return Intrinsics.areEqual(this.id, game.id) && Intrinsics.areEqual(this.displayName, game.displayName) && this.remote == game.remote && this.wxShim == game.wxShim && Intrinsics.areEqual(this.coverAsset, game.coverAsset) && Intrinsics.areEqual(this.loadingAssets, game.loadingAssets) && Float.compare(this.loadingArtAlpha, game.loadingArtAlpha) == 0 && this.loadingArtCenterCrop == game.loadingArtCenterCrop && Float.compare(this.loadingArtMaxCropFraction, game.loadingArtMaxCropFraction) == 0 && Intrinsics.areEqual(this.loadingArtBackgroundColor, game.loadingArtBackgroundColor) && Intrinsics.areEqual((Object) this.loadingProgressTopRatio, (Object) game.loadingProgressTopRatio) && this.loadingArtworkContainsStatusText == game.loadingArtworkContainsStatusText && Intrinsics.areEqual(this.loadingTitle, game.loadingTitle) && Intrinsics.areEqual(this.readyMarkers, game.readyMarkers) && this.minHoldMs == game.minHoldMs && Intrinsics.areEqual(this.trackPageId, game.trackPageId) && Intrinsics.areEqual(this.enterEvent, game.enterEvent) && Intrinsics.areEqual(this.exitEvent, game.exitEvent);
        }

        public int hashCode() {
            int hashCode = ((((((this.id.hashCode() * 31) + this.displayName.hashCode()) * 31) + Boolean.hashCode(this.remote)) * 31) + Boolean.hashCode(this.wxShim)) * 31;
            String str = this.coverAsset;
            int hashCode2 = (((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.loadingAssets.hashCode()) * 31) + Float.hashCode(this.loadingArtAlpha)) * 31) + Boolean.hashCode(this.loadingArtCenterCrop)) * 31) + Float.hashCode(this.loadingArtMaxCropFraction)) * 31) + this.loadingArtBackgroundColor.hashCode()) * 31;
            Float f = this.loadingProgressTopRatio;
            int hashCode3 = (((hashCode2 + (f == null ? 0 : f.hashCode())) * 31) + Boolean.hashCode(this.loadingArtworkContainsStatusText)) * 31;
            String str2 = this.loadingTitle;
            int hashCode4 = (((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.readyMarkers.hashCode()) * 31) + Long.hashCode(this.minHoldMs)) * 31;
            String str3 = this.trackPageId;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.enterEvent;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.exitEvent;
            return hashCode6 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "Game(id=" + this.id + ", displayName=" + this.displayName + ", remote=" + this.remote + ", wxShim=" + this.wxShim + ", coverAsset=" + this.coverAsset + ", loadingAssets=" + this.loadingAssets + ", loadingArtAlpha=" + this.loadingArtAlpha + ", loadingArtCenterCrop=" + this.loadingArtCenterCrop + ", loadingArtMaxCropFraction=" + this.loadingArtMaxCropFraction + ", loadingArtBackgroundColor=" + this.loadingArtBackgroundColor + ", loadingProgressTopRatio=" + this.loadingProgressTopRatio + ", loadingArtworkContainsStatusText=" + this.loadingArtworkContainsStatusText + ", loadingTitle=" + this.loadingTitle + ", readyMarkers=" + this.readyMarkers + ", minHoldMs=" + this.minHoldMs + ", trackPageId=" + this.trackPageId + ", enterEvent=" + this.enterEvent + ", exitEvent=" + this.exitEvent + Separators.RPAREN;
        }

        public Game(String id2, String displayName, boolean z, boolean z2, String str, List<String> loadingAssets, float f, boolean z3, float f2, String loadingArtBackgroundColor, Float f3, boolean z4, String str2, List<String> readyMarkers, long j, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(loadingAssets, "loadingAssets");
            Intrinsics.checkNotNullParameter(loadingArtBackgroundColor, "loadingArtBackgroundColor");
            Intrinsics.checkNotNullParameter(readyMarkers, "readyMarkers");
            this.id = id2;
            this.displayName = displayName;
            this.remote = z;
            this.wxShim = z2;
            this.coverAsset = str;
            this.loadingAssets = loadingAssets;
            this.loadingArtAlpha = f;
            this.loadingArtCenterCrop = z3;
            this.loadingArtMaxCropFraction = f2;
            this.loadingArtBackgroundColor = loadingArtBackgroundColor;
            this.loadingProgressTopRatio = f3;
            this.loadingArtworkContainsStatusText = z4;
            this.loadingTitle = str2;
            this.readyMarkers = readyMarkers;
            this.minHoldMs = j;
            this.trackPageId = str3;
            this.enterEvent = str4;
            this.exitEvent = str5;
        }

        public final String getId() {
            return this.id;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final boolean getRemote() {
            return this.remote;
        }

        public final boolean getWxShim() {
            return this.wxShim;
        }

        public final String getCoverAsset() {
            return this.coverAsset;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Game(java.lang.String r24, java.lang.String r25, boolean r26, boolean r27, java.lang.String r28, java.util.List r29, float r30, boolean r31, float r32, java.lang.String r33, java.lang.Float r34, boolean r35, java.lang.String r36, java.util.List r37, long r38, java.lang.String r40, java.lang.String r41, java.lang.String r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
            /*
                Method dump skipped, instructions count: 174
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.wakeup.howear.game.GameCatalog.Game.<init>(java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.util.List, float, boolean, float, java.lang.String, java.lang.Float, boolean, java.lang.String, java.util.List, long, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final List<String> getLoadingAssets() {
            return this.loadingAssets;
        }

        public final float getLoadingArtAlpha() {
            return this.loadingArtAlpha;
        }

        public final boolean getLoadingArtCenterCrop() {
            return this.loadingArtCenterCrop;
        }

        public final float getLoadingArtMaxCropFraction() {
            return this.loadingArtMaxCropFraction;
        }

        public final String getLoadingArtBackgroundColor() {
            return this.loadingArtBackgroundColor;
        }

        public final Float getLoadingProgressTopRatio() {
            return this.loadingProgressTopRatio;
        }

        public final boolean getLoadingArtworkContainsStatusText() {
            return this.loadingArtworkContainsStatusText;
        }

        public final String getLoadingTitle() {
            return this.loadingTitle;
        }

        public final List<String> getReadyMarkers() {
            return this.readyMarkers;
        }

        public final long getMinHoldMs() {
            return this.minHoldMs;
        }

        public final String getTrackPageId() {
            return this.trackPageId;
        }

        public final String getEnterEvent() {
            return this.enterEvent;
        }

        public final String getExitEvent() {
            return this.exitEvent;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = false;
        float f = 0.0f;
        String str = null;
        boolean z4 = false;
        String str2 = null;
        long j = 0;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = false;
        boolean z8 = false;
        String str3 = null;
        long j2 = RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS;
        String str4 = BuryPointPageId.PAGE_ID_GAME_PLANET;
        String str5 = BuryPointEventName.ACTION_NAME_GAME_PLANET_ENTER;
        String str6 = BuryPointEventName.ACTION_NAME_GAME_PLANET_EXIT;
        String str7 = BuryPointPageId.PAGE_ID_GAME_GOBANG;
        String str8 = BuryPointEventName.ACTION_NAME_GAME_GOBANG_ENTER;
        String str9 = BuryPointEventName.ACTION_NAME_GAME_GOBANG_EXIT;
        boolean z9 = true;
        String str10 = BuryPointPageId.PAGE_ID_GAME_GUANDAN;
        String str11 = BuryPointEventName.ACTION_NAME_GAME_GUANDAN_ENTER;
        String str12 = BuryPointEventName.ACTION_NAME_GAME_GUANDAN_EXIT;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        boolean z10 = true;
        String str13 = BuryPointPageId.PAGE_ID_GAME_MAJIANG;
        String str14 = BuryPointEventName.ACTION_NAME_GAME_MAJIANG_ENTER;
        String str15 = BuryPointEventName.ACTION_NAME_GAME_MAJIANG_EXIT;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        String str16 = BuryPointPageId.PAGE_ID_GAME_DOUDIZHU;
        String str17 = BuryPointEventName.ACTION_NAME_GAME_DOUDIZHU_ENTER;
        String str18 = BuryPointEventName.ACTION_NAME_GAME_DOUDIZHU_EXIT;
        List list = null;
        long j3 = 0;
        boolean z11 = false;
        String str19 = null;
        String str20 = null;
        boolean z12 = false;
        String str21 = null;
        boolean z13 = false;
        String str22 = null;
        float f2 = 0.0f;
        boolean z14 = false;
        String str23 = null;
        List<Game> listOf = CollectionsKt.listOf((Object[]) new Game[]{new Game(HomeSlotConfig.GAME_ZHAOYUN, "赵云与阿斗", z, z2, "game_art/zhaoyun_cover.png", CollectionsKt.listOf((Object[]) new String[]{"game_art/zhaoyun_loading.png", "game_art/zhaoyun_cover.png"}), 0.0f, z3, f, str, null, z4, str2, null, j, BuryPointPageId.PAGE_ID_GAME_ZHAOYUN, BuryPointEventName.ACTION_NAME_GAME_ZHAOYUN_ENTER, BuryPointEventName.ACTION_NAME_GAME_ZHAOYUN_EXIT, 32704, defaultConstructorMarker), new Game(HomeSlotConfig.GAME_PLANET, "星球·守卫", z5, z6, "game_art/planet_poster.jpg", CollectionsKt.listOf("game_art/planet_poster.jpg"), 0.0f, z7, 0.0f, null, null, z8, str3, CollectionsKt.listOf((Object[]) new String[]{"LoadHall.SceneLoaded", "LoadHall.AutoSetLanguage.OpenPanelHall"}), j2, str4, str5, str6, 8128, defaultConstructorMarker2), new Game(HomeSlotConfig.GAME_GOBANG, "五子棋对弈", z, z2, "game_art/gobang_cover.jpg", CollectionsKt.listOf("game_art/gobang_loading.jpg"), 1.0f, z3, f, str, 0 == true ? 1 : 0, z4, str2, 0 == true ? 1 : 0, j, str7, str8, str9, 32640, defaultConstructorMarker), new Game(HomeSlotConfig.GAME_GUANDAN, "掼蛋对战", z2, z9, null, null, 0.0f, false, 0.0f, objArr, null, false, objArr2, null, 0L, str10, str11, str12, 32752, null), new Game("majiang", "麻将对弈", z9, z10, objArr3, null, 0.0f, false, 0.0f, objArr4, null, false, objArr5, null, 0L, str13, str14, str15, 32752, null), new Game("doudizhu", "斗地主争霸", z10, true, 0 == true ? 1 : 0, null, 0.0f, false, 0.0f, 0 == true ? 1 : 0, null, false, 0 == true ? 1 : 0, null, 0L, str16, str17, str18, 32752, defaultConstructorMarker3), new Game(HomeSlotConfig.GAME_XIANGQI, "象棋对决", z5, z6, "game_art/xiangqi_cover.jpg", CollectionsKt.listOf("game_art/xiangqi_loading.jpg"), 1.0f, z7, 0.08f, "#F1EDE8", Float.valueOf(0.5f), z8, str3, list, j3, BuryPointPageId.PAGE_ID_GAME_XIANGQI, BuryPointEventName.ACTION_NAME_GAME_XIANGQI_ENTER, BuryPointEventName.ACTION_NAME_GAME_XIANGQI_EXIT, 30720, defaultConstructorMarker2), new Game("wpgame", "烽火据点", false, z11, null, null, 0.0f, false, 0.0f, null, null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, str19, str20, 262140, null), new Game("wpgame2", "流浪星海", z11, z12, 0 == true ? 1 : 0, null, 0.0f, false, 0.0f, 0 == true ? 1 : 0, null, false, 0 == true ? 1 : 0, null, 0L, str19, str20, str21, 262140, null), new Game("wpgame3", "五子棋", z12, z13, 0 == true ? 1 : 0, null, 0.0f, false, 0.0f, 0 == true ? 1 : 0, null, false, 0 == true ? 1 : 0, null, 0L, str20, str21, str22, 262140, null), new Game("wpgame4", "麻将", z13, false, 0 == true ? 1 : 0, null, f2, false, 0.0f, 0 == true ? 1 : 0, null, false, 0 == true ? 1 : 0, null, 0L, str21, str22, null, 262140, defaultConstructorMarker3), new Game("wpgame5", "斗地主", false, false, null, null, 0.0f, z7, 0.0f, null, null, z8, str3, list, j3, null, null, null, 262140, defaultConstructorMarker2), new Game("wpgame6", "象棋", false, z14, null, null, 0.0f, false, f2, null, null, false, 0 == true ? 1 : 0, null, 0L, null, str23, str21, 262140, 0 == true ? 1 : 0), new Game("wpgame7", "掼蛋", z14, false, 0 == true ? 1 : 0, null, 0.0f, false, 0.0f, 0 == true ? 1 : 0, null, false, 0 == true ? 1 : 0, null, 0L, str23, str21, null, 262140, null)});
        GAMES = listOf;
        List<Game> list2 = listOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (Object obj : list2) {
            linkedHashMap.put(((Game) obj).getId(), obj);
        }
        BY_ID = linkedHashMap;
    }

    public final List<Game> all() {
        return GAMES;
    }

    public final Game find(String gameId) {
        if (gameId != null) {
            return BY_ID.get(gameId);
        }
        return null;
    }

    public final boolean isRemote(String gameId) {
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        Game find = find(gameId);
        return find != null && find.getRemote();
    }

    public final String displayName(String gameId) {
        String displayName;
        Game find = find(gameId);
        return (find == null || (displayName = find.getDisplayName()) == null) ? "好穿戴小游戏" : displayName;
    }

    public final String coverAsset(String gameId) {
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        Game find = find(gameId);
        if (find != null) {
            return find.getCoverAsset();
        }
        return null;
    }

    public final String h5Path(String gameId) {
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        return "h5/" + gameId + "/index.html";
    }

    public final String fromUrl(String url) {
        Object obj;
        Intrinsics.checkNotNullParameter(url, "url");
        Iterator<T> it = GAMES.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (StringsKt.contains$default((CharSequence) url, (CharSequence) ("/h5/" + ((Game) obj).getId() + "/"), false, 2, (Object) null)) {
                break;
            }
        }
        Game game = (Game) obj;
        if (game != null) {
            return game.getId();
        }
        return null;
    }
}
