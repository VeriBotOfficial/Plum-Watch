package com.wakeup.feature.aimusic.model;

import android.gov.nist.core.Separators;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Style.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lcom/wakeup/feature/aimusic/model/Style;", "Ljava/io/Serializable;", "styleId", "", "styleName", "hint", "imageUrl", "backdropFile", "songCount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getStyleId", "()Ljava/lang/String;", "getStyleName", "getHint", "getImageUrl", "getBackdropFile", "getSongCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Style implements Serializable {
    private static final long serialVersionUID = 1;

    @SerializedName("backdrop_file")
    private final String backdropFile;

    @SerializedName("hint")
    private final String hint;

    @SerializedName("image_url")
    private final String imageUrl;

    @SerializedName("song_count")
    private final int songCount;

    @SerializedName(MapBundleKey.MapObjKey.OBJ_STYLE_ID)
    private final String styleId;

    @SerializedName("style_name")
    private final String styleName;

    public Style() {
        this(null, null, null, null, null, 0, 63, null);
    }

    public static /* synthetic */ Style copy$default(Style style, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = style.styleId;
        }
        if ((i2 & 2) != 0) {
            str2 = style.styleName;
        }
        if ((i2 & 4) != 0) {
            str3 = style.hint;
        }
        if ((i2 & 8) != 0) {
            str4 = style.imageUrl;
        }
        if ((i2 & 16) != 0) {
            str5 = style.backdropFile;
        }
        if ((i2 & 32) != 0) {
            i = style.songCount;
        }
        String str6 = str5;
        int i3 = i;
        return style.copy(str, str2, str3, str4, str6, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStyleId() {
        return this.styleId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStyleName() {
        return this.styleName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackdropFile() {
        return this.backdropFile;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSongCount() {
        return this.songCount;
    }

    public final Style copy(String styleId, String styleName, String hint, String imageUrl, String backdropFile, int songCount) {
        Intrinsics.checkNotNullParameter(styleId, "styleId");
        Intrinsics.checkNotNullParameter(styleName, "styleName");
        return new Style(styleId, styleName, hint, imageUrl, backdropFile, songCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Style)) {
            return false;
        }
        Style style = (Style) other;
        return Intrinsics.areEqual(this.styleId, style.styleId) && Intrinsics.areEqual(this.styleName, style.styleName) && Intrinsics.areEqual(this.hint, style.hint) && Intrinsics.areEqual(this.imageUrl, style.imageUrl) && Intrinsics.areEqual(this.backdropFile, style.backdropFile) && this.songCount == style.songCount;
    }

    public int hashCode() {
        int hashCode = ((this.styleId.hashCode() * 31) + this.styleName.hashCode()) * 31;
        String str = this.hint;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backdropFile;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.songCount);
    }

    public String toString() {
        return "Style(styleId=" + this.styleId + ", styleName=" + this.styleName + ", hint=" + this.hint + ", imageUrl=" + this.imageUrl + ", backdropFile=" + this.backdropFile + ", songCount=" + this.songCount + Separators.RPAREN;
    }

    public Style(String styleId, String styleName, String str, String str2, String str3, int i) {
        Intrinsics.checkNotNullParameter(styleId, "styleId");
        Intrinsics.checkNotNullParameter(styleName, "styleName");
        this.styleId = styleId;
        this.styleName = styleName;
        this.hint = str;
        this.imageUrl = str2;
        this.backdropFile = str3;
        this.songCount = i;
    }

    public /* synthetic */ Style(String str, String str2, String str3, String str4, String str5, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? 0 : i);
    }

    public final String getStyleId() {
        return this.styleId;
    }

    public final String getStyleName() {
        return this.styleName;
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getBackdropFile() {
        return this.backdropFile;
    }

    public final int getSongCount() {
        return this.songCount;
    }
}
