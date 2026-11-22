package com.wakeup.howear.game.offline;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: GameLoadingArtLayout.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/wakeup/howear/game/offline/GameLoadingArtGeometry;", "", "scale", "", "left", "top", "displayedWidth", "displayedHeight", "<init>", "(FFFFF)V", "getScale", "()F", "getLeft", "getTop", "getDisplayedWidth", "getDisplayedHeight", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GameLoadingArtGeometry {
    private final float displayedHeight;
    private final float displayedWidth;
    private final float left;
    private final float scale;
    private final float top;

    public static /* synthetic */ GameLoadingArtGeometry copy$default(GameLoadingArtGeometry gameLoadingArtGeometry, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
        if ((i & 1) != 0) {
            f = gameLoadingArtGeometry.scale;
        }
        if ((i & 2) != 0) {
            f2 = gameLoadingArtGeometry.left;
        }
        if ((i & 4) != 0) {
            f3 = gameLoadingArtGeometry.top;
        }
        if ((i & 8) != 0) {
            f4 = gameLoadingArtGeometry.displayedWidth;
        }
        if ((i & 16) != 0) {
            f5 = gameLoadingArtGeometry.displayedHeight;
        }
        float f6 = f5;
        float f7 = f3;
        return gameLoadingArtGeometry.copy(f, f2, f7, f4, f6);
    }

    /* renamed from: component1, reason: from getter */
    public final float getScale() {
        return this.scale;
    }

    /* renamed from: component2, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* renamed from: component3, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: component4, reason: from getter */
    public final float getDisplayedWidth() {
        return this.displayedWidth;
    }

    /* renamed from: component5, reason: from getter */
    public final float getDisplayedHeight() {
        return this.displayedHeight;
    }

    public final GameLoadingArtGeometry copy(float scale, float left, float top2, float displayedWidth, float displayedHeight) {
        return new GameLoadingArtGeometry(scale, left, top2, displayedWidth, displayedHeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameLoadingArtGeometry)) {
            return false;
        }
        GameLoadingArtGeometry gameLoadingArtGeometry = (GameLoadingArtGeometry) other;
        return Float.compare(this.scale, gameLoadingArtGeometry.scale) == 0 && Float.compare(this.left, gameLoadingArtGeometry.left) == 0 && Float.compare(this.top, gameLoadingArtGeometry.top) == 0 && Float.compare(this.displayedWidth, gameLoadingArtGeometry.displayedWidth) == 0 && Float.compare(this.displayedHeight, gameLoadingArtGeometry.displayedHeight) == 0;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.scale) * 31) + Float.hashCode(this.left)) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.displayedWidth)) * 31) + Float.hashCode(this.displayedHeight);
    }

    public String toString() {
        return "GameLoadingArtGeometry(scale=" + this.scale + ", left=" + this.left + ", top=" + this.top + ", displayedWidth=" + this.displayedWidth + ", displayedHeight=" + this.displayedHeight + Separators.RPAREN;
    }

    public GameLoadingArtGeometry(float f, float f2, float f3, float f4, float f5) {
        this.scale = f;
        this.left = f2;
        this.top = f3;
        this.displayedWidth = f4;
        this.displayedHeight = f5;
    }

    public final float getScale() {
        return this.scale;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getTop() {
        return this.top;
    }

    public final float getDisplayedWidth() {
        return this.displayedWidth;
    }

    public final float getDisplayedHeight() {
        return this.displayedHeight;
    }
}
