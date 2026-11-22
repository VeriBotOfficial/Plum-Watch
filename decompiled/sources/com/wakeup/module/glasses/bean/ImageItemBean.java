package com.wakeup.module.glasses.bean;

import android.gov.nist.core.Separators;
import com.luck.picture.lib.config.PictureMimeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GlassesAlbumBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001f\u001a\u00020\fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003JY\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\bHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u001b\"\u0004\b\u001e\u0010\u001d¨\u0006-"}, d2 = {"Lcom/wakeup/module/glasses/bean/ImageItemBean;", "", "file", "", "name", "createTime", "", "duration", "", "videoCover", "commonKey", "isSelect", "", "isUpgrade", "<init>", "(Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;ZZ)V", "getFile", "()Ljava/lang/String;", "setFile", "(Ljava/lang/String;)V", "getName", "getCreateTime", "()J", "getDuration", "()I", "getVideoCover", "getCommonKey", "()Z", "setSelect", "(Z)V", "setUpgrade", "isVideo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ImageItemBean {
    private final String commonKey;
    private final long createTime;
    private final int duration;
    private String file;
    private boolean isSelect;
    private boolean isUpgrade;
    private final String name;
    private final String videoCover;

    public static /* synthetic */ ImageItemBean copy$default(ImageItemBean imageItemBean, String str, String str2, long j, int i, String str3, String str4, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = imageItemBean.file;
        }
        if ((i2 & 2) != 0) {
            str2 = imageItemBean.name;
        }
        if ((i2 & 4) != 0) {
            j = imageItemBean.createTime;
        }
        if ((i2 & 8) != 0) {
            i = imageItemBean.duration;
        }
        if ((i2 & 16) != 0) {
            str3 = imageItemBean.videoCover;
        }
        if ((i2 & 32) != 0) {
            str4 = imageItemBean.commonKey;
        }
        if ((i2 & 64) != 0) {
            z = imageItemBean.isSelect;
        }
        if ((i2 & 128) != 0) {
            z2 = imageItemBean.isUpgrade;
        }
        boolean z3 = z2;
        String str5 = str4;
        int i3 = i;
        long j2 = j;
        return imageItemBean.copy(str, str2, j2, i3, str3, str5, z, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFile() {
        return this.file;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* renamed from: component5, reason: from getter */
    public final String getVideoCover() {
        return this.videoCover;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCommonKey() {
        return this.commonKey;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsUpgrade() {
        return this.isUpgrade;
    }

    public final ImageItemBean copy(String file, String name, long createTime, int duration, String videoCover, String commonKey, boolean isSelect, boolean isUpgrade) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(videoCover, "videoCover");
        Intrinsics.checkNotNullParameter(commonKey, "commonKey");
        return new ImageItemBean(file, name, createTime, duration, videoCover, commonKey, isSelect, isUpgrade);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageItemBean)) {
            return false;
        }
        ImageItemBean imageItemBean = (ImageItemBean) other;
        return Intrinsics.areEqual(this.file, imageItemBean.file) && Intrinsics.areEqual(this.name, imageItemBean.name) && this.createTime == imageItemBean.createTime && this.duration == imageItemBean.duration && Intrinsics.areEqual(this.videoCover, imageItemBean.videoCover) && Intrinsics.areEqual(this.commonKey, imageItemBean.commonKey) && this.isSelect == imageItemBean.isSelect && this.isUpgrade == imageItemBean.isUpgrade;
    }

    public int hashCode() {
        return (((((((((((((this.file.hashCode() * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.duration)) * 31) + this.videoCover.hashCode()) * 31) + this.commonKey.hashCode()) * 31) + Boolean.hashCode(this.isSelect)) * 31) + Boolean.hashCode(this.isUpgrade);
    }

    public String toString() {
        return "ImageItemBean(file=" + this.file + ", name=" + this.name + ", createTime=" + this.createTime + ", duration=" + this.duration + ", videoCover=" + this.videoCover + ", commonKey=" + this.commonKey + ", isSelect=" + this.isSelect + ", isUpgrade=" + this.isUpgrade + Separators.RPAREN;
    }

    public ImageItemBean(String file, String name, long j, int i, String videoCover, String commonKey, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(videoCover, "videoCover");
        Intrinsics.checkNotNullParameter(commonKey, "commonKey");
        this.file = file;
        this.name = name;
        this.createTime = j;
        this.duration = i;
        this.videoCover = videoCover;
        this.commonKey = commonKey;
        this.isSelect = z;
        this.isUpgrade = z2;
    }

    public final String getFile() {
        return this.file;
    }

    public final void setFile(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.file = str;
    }

    public final String getName() {
        return this.name;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getVideoCover() {
        return this.videoCover;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ImageItemBean(java.lang.String r13, java.lang.String r14, long r15, int r17, java.lang.String r18, java.lang.String r19, boolean r20, boolean r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 32
            if (r1 == 0) goto La
            java.lang.String r1 = ""
            r9 = r1
            goto Lc
        La:
            r9 = r19
        Lc:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L13
            r10 = r2
            goto L15
        L13:
            r10 = r20
        L15:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L23
            r11 = r2
            r3 = r13
            r4 = r14
            r5 = r15
            r7 = r17
            r8 = r18
            r2 = r12
            goto L2d
        L23:
            r11 = r21
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r7 = r17
            r8 = r18
        L2d:
            r2.<init>(r3, r4, r5, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.glasses.bean.ImageItemBean.<init>(java.lang.String, java.lang.String, long, int, java.lang.String, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getCommonKey() {
        return this.commonKey;
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    public final boolean isUpgrade() {
        return this.isUpgrade;
    }

    public final void setUpgrade(boolean z) {
        this.isUpgrade = z;
    }

    public final boolean isVideo() {
        return StringsKt.endsWith(this.file, PictureMimeType.MP4, true) || StringsKt.endsWith(this.file, PictureMimeType.AVI, true);
    }
}
