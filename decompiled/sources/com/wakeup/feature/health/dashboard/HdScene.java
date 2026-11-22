package com.wakeup.feature.health.dashboard;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HdScenes.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u000eHÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011HÆ\u0003J\u0097\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011HÆ\u0001J\u0013\u00105\u001a\u00020\u000e2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0006HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%¨\u00069"}, d2 = {"Lcom/wakeup/feature/health/dashboard/HdScene;", "", "key", "", "icon", "nameRes", "", "itemDescRes", "descRes", "introRes", "color", "iconBg", "confirmBg", "dark", "", HdScenes.FATBURN, "dimensions", "", "Lcom/wakeup/feature/health/dashboard/HdDim;", "featureRes", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIIIIIIZZLjava/util/List;Ljava/util/List;)V", "getKey", "()Ljava/lang/String;", "getIcon", "getNameRes", "()I", "getItemDescRes", "getDescRes", "getIntroRes", "getColor", "getIconBg", "getConfirmBg", "getDark", "()Z", "getFatburn", "getDimensions", "()Ljava/util/List;", "getFeatureRes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HdScene {
    public static final int $stable = 8;
    private final int color;
    private final int confirmBg;
    private final boolean dark;
    private final int descRes;
    private final List<HdDim> dimensions;
    private final boolean fatburn;
    private final List<Integer> featureRes;
    private final String icon;
    private final int iconBg;
    private final int introRes;
    private final int itemDescRes;
    private final String key;
    private final int nameRes;

    public static /* synthetic */ HdScene copy$default(HdScene hdScene, String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, List list, List list2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = hdScene.key;
        }
        return hdScene.copy(str, (i8 & 2) != 0 ? hdScene.icon : str2, (i8 & 4) != 0 ? hdScene.nameRes : i, (i8 & 8) != 0 ? hdScene.itemDescRes : i2, (i8 & 16) != 0 ? hdScene.descRes : i3, (i8 & 32) != 0 ? hdScene.introRes : i4, (i8 & 64) != 0 ? hdScene.color : i5, (i8 & 128) != 0 ? hdScene.iconBg : i6, (i8 & 256) != 0 ? hdScene.confirmBg : i7, (i8 & 512) != 0 ? hdScene.dark : z, (i8 & 1024) != 0 ? hdScene.fatburn : z2, (i8 & 2048) != 0 ? hdScene.dimensions : list, (i8 & 4096) != 0 ? hdScene.featureRes : list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getDark() {
        return this.dark;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getFatburn() {
        return this.fatburn;
    }

    public final List<HdDim> component12() {
        return this.dimensions;
    }

    public final List<Integer> component13() {
        return this.featureRes;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final int getNameRes() {
        return this.nameRes;
    }

    /* renamed from: component4, reason: from getter */
    public final int getItemDescRes() {
        return this.itemDescRes;
    }

    /* renamed from: component5, reason: from getter */
    public final int getDescRes() {
        return this.descRes;
    }

    /* renamed from: component6, reason: from getter */
    public final int getIntroRes() {
        return this.introRes;
    }

    /* renamed from: component7, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* renamed from: component8, reason: from getter */
    public final int getIconBg() {
        return this.iconBg;
    }

    /* renamed from: component9, reason: from getter */
    public final int getConfirmBg() {
        return this.confirmBg;
    }

    public final HdScene copy(String key, String icon, int nameRes, int itemDescRes, int descRes, int introRes, int color, int iconBg, int confirmBg, boolean dark, boolean fatburn, List<HdDim> dimensions, List<Integer> featureRes) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(featureRes, "featureRes");
        return new HdScene(key, icon, nameRes, itemDescRes, descRes, introRes, color, iconBg, confirmBg, dark, fatburn, dimensions, featureRes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HdScene)) {
            return false;
        }
        HdScene hdScene = (HdScene) other;
        return Intrinsics.areEqual(this.key, hdScene.key) && Intrinsics.areEqual(this.icon, hdScene.icon) && this.nameRes == hdScene.nameRes && this.itemDescRes == hdScene.itemDescRes && this.descRes == hdScene.descRes && this.introRes == hdScene.introRes && this.color == hdScene.color && this.iconBg == hdScene.iconBg && this.confirmBg == hdScene.confirmBg && this.dark == hdScene.dark && this.fatburn == hdScene.fatburn && Intrinsics.areEqual(this.dimensions, hdScene.dimensions) && Intrinsics.areEqual(this.featureRes, hdScene.featureRes);
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.key.hashCode() * 31) + this.icon.hashCode()) * 31) + Integer.hashCode(this.nameRes)) * 31) + Integer.hashCode(this.itemDescRes)) * 31) + Integer.hashCode(this.descRes)) * 31) + Integer.hashCode(this.introRes)) * 31) + Integer.hashCode(this.color)) * 31) + Integer.hashCode(this.iconBg)) * 31) + Integer.hashCode(this.confirmBg)) * 31) + Boolean.hashCode(this.dark)) * 31) + Boolean.hashCode(this.fatburn)) * 31) + this.dimensions.hashCode()) * 31) + this.featureRes.hashCode();
    }

    public String toString() {
        return "HdScene(key=" + this.key + ", icon=" + this.icon + ", nameRes=" + this.nameRes + ", itemDescRes=" + this.itemDescRes + ", descRes=" + this.descRes + ", introRes=" + this.introRes + ", color=" + this.color + ", iconBg=" + this.iconBg + ", confirmBg=" + this.confirmBg + ", dark=" + this.dark + ", fatburn=" + this.fatburn + ", dimensions=" + this.dimensions + ", featureRes=" + this.featureRes + Separators.RPAREN;
    }

    public HdScene(String key, String icon, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, List<HdDim> dimensions, List<Integer> featureRes) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(featureRes, "featureRes");
        this.key = key;
        this.icon = icon;
        this.nameRes = i;
        this.itemDescRes = i2;
        this.descRes = i3;
        this.introRes = i4;
        this.color = i5;
        this.iconBg = i6;
        this.confirmBg = i7;
        this.dark = z;
        this.fatburn = z2;
        this.dimensions = dimensions;
        this.featureRes = featureRes;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final int getNameRes() {
        return this.nameRes;
    }

    public final int getItemDescRes() {
        return this.itemDescRes;
    }

    public final int getDescRes() {
        return this.descRes;
    }

    public final int getIntroRes() {
        return this.introRes;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getIconBg() {
        return this.iconBg;
    }

    public final int getConfirmBg() {
        return this.confirmBg;
    }

    public final boolean getDark() {
        return this.dark;
    }

    public final boolean getFatburn() {
        return this.fatburn;
    }

    public final List<HdDim> getDimensions() {
        return this.dimensions;
    }

    public final List<Integer> getFeatureRes() {
        return this.featureRes;
    }
}
