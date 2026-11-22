package com.wakeup.feature.health.dashboard;

import android.gov.nist.core.Separators;
import android.graphics.Color;
import com.baidu.platform.comapi.map.MapBundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: HdScenes.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006%"}, d2 = {"Lcom/wakeup/feature/health/dashboard/HdPalette;", "", "bg", "", "card", "border", "text", "text2", "text3", "elevationDp", "", "<init>", "(IIIIIIF)V", "getBg", "()I", "getCard", "getBorder", "getText", "getText2", "getText3", "getElevationDp", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HdPalette {
    public static final int $stable = 0;
    private final int bg;
    private final int border;
    private final int card;
    private final float elevationDp;
    private final int text;
    private final int text2;
    private final int text3;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final HdPalette LIGHT = new HdPalette(Color.parseColor("#F5F6FA"), -1, Color.parseColor("#E8EAF0"), Color.parseColor("#1A1D27"), Color.parseColor("#6B7280"), Color.parseColor("#9CA3AF"), 1.0f);
    private static final HdPalette DARK = new HdPalette(Color.parseColor("#0F1117"), Color.parseColor("#1A1D27"), Color.parseColor("#2A2D3A"), Color.parseColor("#E2E8F0"), Color.parseColor("#94A3B8"), Color.parseColor("#4B5563"), 0.0f);

    public static /* synthetic */ HdPalette copy$default(HdPalette hdPalette, int i, int i2, int i3, int i4, int i5, int i6, float f, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = hdPalette.bg;
        }
        if ((i7 & 2) != 0) {
            i2 = hdPalette.card;
        }
        if ((i7 & 4) != 0) {
            i3 = hdPalette.border;
        }
        if ((i7 & 8) != 0) {
            i4 = hdPalette.text;
        }
        if ((i7 & 16) != 0) {
            i5 = hdPalette.text2;
        }
        if ((i7 & 32) != 0) {
            i6 = hdPalette.text3;
        }
        if ((i7 & 64) != 0) {
            f = hdPalette.elevationDp;
        }
        int i8 = i6;
        float f2 = f;
        int i9 = i5;
        int i10 = i3;
        return hdPalette.copy(i, i2, i10, i4, i9, i8, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBg() {
        return this.bg;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCard() {
        return this.card;
    }

    /* renamed from: component3, reason: from getter */
    public final int getBorder() {
        return this.border;
    }

    /* renamed from: component4, reason: from getter */
    public final int getText() {
        return this.text;
    }

    /* renamed from: component5, reason: from getter */
    public final int getText2() {
        return this.text2;
    }

    /* renamed from: component6, reason: from getter */
    public final int getText3() {
        return this.text3;
    }

    /* renamed from: component7, reason: from getter */
    public final float getElevationDp() {
        return this.elevationDp;
    }

    public final HdPalette copy(int bg, int card, int border, int text, int text2, int text3, float elevationDp) {
        return new HdPalette(bg, card, border, text, text2, text3, elevationDp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HdPalette)) {
            return false;
        }
        HdPalette hdPalette = (HdPalette) other;
        return this.bg == hdPalette.bg && this.card == hdPalette.card && this.border == hdPalette.border && this.text == hdPalette.text && this.text2 == hdPalette.text2 && this.text3 == hdPalette.text3 && Float.compare(this.elevationDp, hdPalette.elevationDp) == 0;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.bg) * 31) + Integer.hashCode(this.card)) * 31) + Integer.hashCode(this.border)) * 31) + Integer.hashCode(this.text)) * 31) + Integer.hashCode(this.text2)) * 31) + Integer.hashCode(this.text3)) * 31) + Float.hashCode(this.elevationDp);
    }

    public String toString() {
        return "HdPalette(bg=" + this.bg + ", card=" + this.card + ", border=" + this.border + ", text=" + this.text + ", text2=" + this.text2 + ", text3=" + this.text3 + ", elevationDp=" + this.elevationDp + Separators.RPAREN;
    }

    public HdPalette(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        this.bg = i;
        this.card = i2;
        this.border = i3;
        this.text = i4;
        this.text2 = i5;
        this.text3 = i6;
        this.elevationDp = f;
    }

    public final int getBg() {
        return this.bg;
    }

    public final int getCard() {
        return this.card;
    }

    public final int getBorder() {
        return this.border;
    }

    public final int getText() {
        return this.text;
    }

    public final int getText2() {
        return this.text2;
    }

    public final int getText3() {
        return this.text3;
    }

    public final float getElevationDp() {
        return this.elevationDp;
    }

    /* compiled from: HdScenes.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/wakeup/feature/health/dashboard/HdPalette$Companion;", "", "<init>", "()V", "LIGHT", "Lcom/wakeup/feature/health/dashboard/HdPalette;", "getLIGHT", "()Lcom/wakeup/feature/health/dashboard/HdPalette;", "DARK", "getDARK", MapBundleKey.MapObjKey.OBJ_OFFSET, "dark", "", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HdPalette getLIGHT() {
            return HdPalette.LIGHT;
        }

        public final HdPalette getDARK() {
            return HdPalette.DARK;
        }

        public final HdPalette of(boolean dark) {
            return dark ? getDARK() : getLIGHT();
        }
    }
}
