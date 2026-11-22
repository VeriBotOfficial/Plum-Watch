package com.wakeup.commponent.module.device.work;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.android.gms.ads.RequestConfiguration;
import com.tencent.connect.share.QzonePublish;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomVideoBean.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J;\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020\u001e2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010%¨\u00060"}, d2 = {"Lcom/wakeup/commponent/module/device/work/CustomVideoBean;", "", TokenNames.R, "", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "B", "font", "location", "<init>", "(IIIII)V", "getR", "()I", "getG", "getB", "getFont", "getLocation", "resolution", "", "getResolution", "()[I", QzonePublish.PUBLISH_TO_QZONE_VIDEO_PATH, "", "getVideoPath", "()Ljava/lang/String;", "setVideoPath", "(Ljava/lang/String;)V", "imgPath", "getImgPath", "setImgPath", "isNewStyle", "", "()Z", "setNewStyle", "(Z)V", "functionType", "getFunctionType", "setFunctionType", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CustomVideoBean {
    private final int B;
    private final int G;
    private final int R;
    private final int font;
    private boolean isNewStyle;
    private final int location;
    private final int[] resolution = new int[2];
    private String videoPath = "";
    private String imgPath = "";
    private int functionType = -1;

    public static /* synthetic */ CustomVideoBean copy$default(CustomVideoBean customVideoBean, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = customVideoBean.R;
        }
        if ((i6 & 2) != 0) {
            i2 = customVideoBean.G;
        }
        if ((i6 & 4) != 0) {
            i3 = customVideoBean.B;
        }
        if ((i6 & 8) != 0) {
            i4 = customVideoBean.font;
        }
        if ((i6 & 16) != 0) {
            i5 = customVideoBean.location;
        }
        int i7 = i5;
        int i8 = i3;
        return customVideoBean.copy(i, i2, i8, i4, i7);
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

    public final CustomVideoBean copy(int R, int G, int B, int font, int location) {
        return new CustomVideoBean(R, G, B, font, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomVideoBean)) {
            return false;
        }
        CustomVideoBean customVideoBean = (CustomVideoBean) other;
        return this.R == customVideoBean.R && this.G == customVideoBean.G && this.B == customVideoBean.B && this.font == customVideoBean.font && this.location == customVideoBean.location;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.R) * 31) + Integer.hashCode(this.G)) * 31) + Integer.hashCode(this.B)) * 31) + Integer.hashCode(this.font)) * 31) + Integer.hashCode(this.location);
    }

    public String toString() {
        return "CustomVideoBean(R=" + this.R + ", G=" + this.G + ", B=" + this.B + ", font=" + this.font + ", location=" + this.location + Separators.RPAREN;
    }

    public CustomVideoBean(int i, int i2, int i3, int i4, int i5) {
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

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final void setVideoPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.videoPath = str;
    }

    public final String getImgPath() {
        return this.imgPath;
    }

    public final void setImgPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imgPath = str;
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
}
