package com.wakeup.module.glasses.bean;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesFilmBean.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/wakeup/module/glasses/bean/GlassesFilmFileBean;", "Ljava/io/Serializable;", "filePath", "", "sourceType", "", "<init>", "(Ljava/lang/String;I)V", "getFilePath", "()Ljava/lang/String;", "getSourceType", "()I", "ossPath", "getOssPath", "setOssPath", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GlassesFilmFileBean implements Serializable {
    private final String filePath;
    private String ossPath;
    private final int sourceType;

    public static /* synthetic */ GlassesFilmFileBean copy$default(GlassesFilmFileBean glassesFilmFileBean, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = glassesFilmFileBean.filePath;
        }
        if ((i2 & 2) != 0) {
            i = glassesFilmFileBean.sourceType;
        }
        return glassesFilmFileBean.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSourceType() {
        return this.sourceType;
    }

    public final GlassesFilmFileBean copy(String filePath, int sourceType) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new GlassesFilmFileBean(filePath, sourceType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlassesFilmFileBean)) {
            return false;
        }
        GlassesFilmFileBean glassesFilmFileBean = (GlassesFilmFileBean) other;
        return Intrinsics.areEqual(this.filePath, glassesFilmFileBean.filePath) && this.sourceType == glassesFilmFileBean.sourceType;
    }

    public int hashCode() {
        return (this.filePath.hashCode() * 31) + Integer.hashCode(this.sourceType);
    }

    public String toString() {
        return "GlassesFilmFileBean(filePath=" + this.filePath + ", sourceType=" + this.sourceType + Separators.RPAREN;
    }

    public GlassesFilmFileBean(String filePath, int i) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.filePath = filePath;
        this.sourceType = i;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    public final String getOssPath() {
        return this.ossPath;
    }

    public final void setOssPath(String str) {
        this.ossPath = str;
    }
}
