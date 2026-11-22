package com.wakeup.commponent.module.device.work;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomDialBean.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\b\u00104\u001a\u00020\u0016H\u0016J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J;\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010;\u001a\u00020\u001a2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001a\u0010$\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\u001a\u0010&\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001dR\u001a\u0010(\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001a\u0010*\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR\u001a\u00100\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dR\u001a\u00102\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u0010\u001d¨\u0006>"}, d2 = {"Lcom/wakeup/commponent/module/device/work/CustomDialBean;", "", TokenNames.R, "", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "B", "font", "location", "<init>", "(IIIII)V", "getR", "()I", "getG", "getB", "getFont", "getLocation", "resolution", "", "getResolution", "()[I", "pathsList", "", "", "getPathsList", "()Ljava/util/List;", "isNewStyle", "", "()Z", "setNewStyle", "(Z)V", "functionType", "getFunctionType", "setFunctionType", "(I)V", "isPuzzle", "setPuzzle", "isAiClassify", "setAiClassify", "isAiAlbumType", "setAiAlbumType", "isThumb", "setThumb", "thumbResolution", "getThumbResolution", "setThumbResolution", "([I)V", "isDesktop", "setDesktop", "is579x", "set579x", "isRotate", "setRotate", "toString", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CustomDialBean {
    private final int B;
    private final int G;
    private final int R;
    private final int font;
    private boolean is579x;
    private boolean isAiAlbumType;
    private boolean isAiClassify;
    private boolean isDesktop;
    private boolean isNewStyle;
    private boolean isPuzzle;
    private boolean isThumb;
    private final int location;
    private final int[] resolution = new int[2];
    private final List<String> pathsList = new ArrayList();
    private int functionType = -1;
    private int[] thumbResolution = new int[2];
    private boolean isRotate = true;

    public static /* synthetic */ CustomDialBean copy$default(CustomDialBean customDialBean, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = customDialBean.R;
        }
        if ((i6 & 2) != 0) {
            i2 = customDialBean.G;
        }
        if ((i6 & 4) != 0) {
            i3 = customDialBean.B;
        }
        if ((i6 & 8) != 0) {
            i4 = customDialBean.font;
        }
        if ((i6 & 16) != 0) {
            i5 = customDialBean.location;
        }
        int i7 = i5;
        int i8 = i3;
        return customDialBean.copy(i, i2, i8, i4, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getR() {
        return this.R;
    }

    /* renamed from: component2, reason: from getter */
    public final int getG() {
        return this.G;
    }

    /* renamed from: component3, reason: from getter */
    public final int getB() {
        return this.B;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFont() {
        return this.font;
    }

    /* renamed from: component5, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    public final CustomDialBean copy(int R, int G, int B, int font, int location) {
        return new CustomDialBean(R, G, B, font, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomDialBean)) {
            return false;
        }
        CustomDialBean customDialBean = (CustomDialBean) other;
        return this.R == customDialBean.R && this.G == customDialBean.G && this.B == customDialBean.B && this.font == customDialBean.font && this.location == customDialBean.location;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.R) * 31) + Integer.hashCode(this.G)) * 31) + Integer.hashCode(this.B)) * 31) + Integer.hashCode(this.font)) * 31) + Integer.hashCode(this.location);
    }

    public CustomDialBean(int i, int i2, int i3, int i4, int i5) {
        this.R = i;
        this.G = i2;
        this.B = i3;
        this.font = i4;
        this.location = i5;
    }

    public final int getR() {
        return this.R;
    }

    public final int getG() {
        return this.G;
    }

    public final int getB() {
        return this.B;
    }

    public final int getFont() {
        return this.font;
    }

    public final int getLocation() {
        return this.location;
    }

    public final int[] getResolution() {
        return this.resolution;
    }

    public final List<String> getPathsList() {
        return this.pathsList;
    }

    /* renamed from: isNewStyle, reason: from getter */
    public final boolean getIsNewStyle() {
        return this.isNewStyle;
    }

    public final void setNewStyle(boolean z) {
        this.isNewStyle = z;
    }

    public final int getFunctionType() {
        return this.functionType;
    }

    public final void setFunctionType(int i) {
        this.functionType = i;
    }

    /* renamed from: isPuzzle, reason: from getter */
    public final boolean getIsPuzzle() {
        return this.isPuzzle;
    }

    public final void setPuzzle(boolean z) {
        this.isPuzzle = z;
    }

    /* renamed from: isAiClassify, reason: from getter */
    public final boolean getIsAiClassify() {
        return this.isAiClassify;
    }

    public final void setAiClassify(boolean z) {
        this.isAiClassify = z;
    }

    /* renamed from: isAiAlbumType, reason: from getter */
    public final boolean getIsAiAlbumType() {
        return this.isAiAlbumType;
    }

    public final void setAiAlbumType(boolean z) {
        this.isAiAlbumType = z;
    }

    /* renamed from: isThumb, reason: from getter */
    public final boolean getIsThumb() {
        return this.isThumb;
    }

    public final void setThumb(boolean z) {
        this.isThumb = z;
    }

    public final int[] getThumbResolution() {
        return this.thumbResolution;
    }

    public final void setThumbResolution(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.thumbResolution = iArr;
    }

    /* renamed from: isDesktop, reason: from getter */
    public final boolean getIsDesktop() {
        return this.isDesktop;
    }

    public final void setDesktop(boolean z) {
        this.isDesktop = z;
    }

    /* renamed from: is579x, reason: from getter */
    public final boolean getIs579x() {
        return this.is579x;
    }

    public final void set579x(boolean z) {
        this.is579x = z;
    }

    /* renamed from: isRotate, reason: from getter */
    public final boolean getIsRotate() {
        return this.isRotate;
    }

    public final void setRotate(boolean z) {
        this.isRotate = z;
    }

    public String toString() {
        return "CustomDialBean(R=" + this.R + ", G=" + this.G + ", B=" + this.B + ", font=" + this.font + ", isDesktop=" + this.isDesktop + ", is579x=" + this.is579x + ", isRotate=" + this.isRotate + ", isThumb=" + this.isThumb + ", isAiAlbumType=" + this.isAiAlbumType + ", isAiClassify=" + this.isAiClassify + ", isPuzzle=" + this.isPuzzle + ", isNewStyle=" + this.isNewStyle + Separators.RPAREN;
    }
}
