package com.wakeup.feature.device.dial.desktop;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DesktopImgModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/wakeup/feature/device/dial/desktop/DesktopImgModel;", "", "path", "", "isSelect", "", "isAdd", "<init>", "(Ljava/lang/String;ZZ)V", "getPath", "()Ljava/lang/String;", "()Z", "setSelect", "(Z)V", "isCustom", "setCustom", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DesktopImgModel {
    private final boolean isAdd;
    private boolean isCustom;
    private boolean isSelect;
    private final String path;

    public DesktopImgModel() {
        this(null, false, false, 7, null);
    }

    public static /* synthetic */ DesktopImgModel copy$default(DesktopImgModel desktopImgModel, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = desktopImgModel.path;
        }
        if ((i & 2) != 0) {
            z = desktopImgModel.isSelect;
        }
        if ((i & 4) != 0) {
            z2 = desktopImgModel.isAdd;
        }
        return desktopImgModel.copy(str, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsAdd() {
        return this.isAdd;
    }

    public final DesktopImgModel copy(String path, boolean isSelect, boolean isAdd) {
        Intrinsics.checkNotNullParameter(path, "path");
        return new DesktopImgModel(path, isSelect, isAdd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DesktopImgModel)) {
            return false;
        }
        DesktopImgModel desktopImgModel = (DesktopImgModel) other;
        return Intrinsics.areEqual(this.path, desktopImgModel.path) && this.isSelect == desktopImgModel.isSelect && this.isAdd == desktopImgModel.isAdd;
    }

    public int hashCode() {
        return (((this.path.hashCode() * 31) + Boolean.hashCode(this.isSelect)) * 31) + Boolean.hashCode(this.isAdd);
    }

    public String toString() {
        return "DesktopImgModel(path=" + this.path + ", isSelect=" + this.isSelect + ", isAdd=" + this.isAdd + Separators.RPAREN;
    }

    public DesktopImgModel(String path, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
        this.isSelect = z;
        this.isAdd = z2;
    }

    public /* synthetic */ DesktopImgModel(String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    public final boolean isAdd() {
        return this.isAdd;
    }

    /* renamed from: isCustom, reason: from getter */
    public final boolean getIsCustom() {
        return this.isCustom;
    }

    public final void setCustom(boolean z) {
        this.isCustom = z;
    }
}
