package com.wakeup.feature.aimusic.model;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ArtistBrief.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001(Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0005J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003Jc\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006)"}, d2 = {"Lcom/wakeup/feature/aimusic/model/ArtistBrief;", "Ljava/io/Serializable;", "artistId", "", "newName", "", "oldName", "packageName", "imagePath", "musicStyle", "temperament", "idolTone", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getArtistId", "()I", "getNewName", "()Ljava/lang/String;", "getOldName", "getPackageName", "getImagePath", "getMusicStyle", "getTemperament", "getIdolTone", "displayName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ArtistBrief implements Serializable {
    private static final long serialVersionUID = 1;

    @SerializedName("artist_id")
    private final int artistId;

    @SerializedName("idol_tone")
    private final String idolTone;

    @SerializedName("image_path")
    private final String imagePath;

    @SerializedName("music_style")
    private final String musicStyle;

    @SerializedName("new_name")
    private final String newName;

    @SerializedName("old_name")
    private final String oldName;

    @SerializedName("package_name")
    private final String packageName;

    @SerializedName("temperament")
    private final String temperament;

    public ArtistBrief() {
        this(0, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ ArtistBrief copy$default(ArtistBrief artistBrief, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = artistBrief.artistId;
        }
        if ((i2 & 2) != 0) {
            str = artistBrief.newName;
        }
        if ((i2 & 4) != 0) {
            str2 = artistBrief.oldName;
        }
        if ((i2 & 8) != 0) {
            str3 = artistBrief.packageName;
        }
        if ((i2 & 16) != 0) {
            str4 = artistBrief.imagePath;
        }
        if ((i2 & 32) != 0) {
            str5 = artistBrief.musicStyle;
        }
        if ((i2 & 64) != 0) {
            str6 = artistBrief.temperament;
        }
        if ((i2 & 128) != 0) {
            str7 = artistBrief.idolTone;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return artistBrief.copy(i, str, str2, str3, str10, str11, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final int getArtistId() {
        return this.artistId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNewName() {
        return this.newName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOldName() {
        return this.oldName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImagePath() {
        return this.imagePath;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMusicStyle() {
        return this.musicStyle;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTemperament() {
        return this.temperament;
    }

    /* renamed from: component8, reason: from getter */
    public final String getIdolTone() {
        return this.idolTone;
    }

    public final ArtistBrief copy(int artistId, String newName, String oldName, String packageName, String imagePath, String musicStyle, String temperament, String idolTone) {
        Intrinsics.checkNotNullParameter(newName, "newName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return new ArtistBrief(artistId, newName, oldName, packageName, imagePath, musicStyle, temperament, idolTone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArtistBrief)) {
            return false;
        }
        ArtistBrief artistBrief = (ArtistBrief) other;
        return this.artistId == artistBrief.artistId && Intrinsics.areEqual(this.newName, artistBrief.newName) && Intrinsics.areEqual(this.oldName, artistBrief.oldName) && Intrinsics.areEqual(this.packageName, artistBrief.packageName) && Intrinsics.areEqual(this.imagePath, artistBrief.imagePath) && Intrinsics.areEqual(this.musicStyle, artistBrief.musicStyle) && Intrinsics.areEqual(this.temperament, artistBrief.temperament) && Intrinsics.areEqual(this.idolTone, artistBrief.idolTone);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.artistId) * 31) + this.newName.hashCode()) * 31;
        String str = this.oldName;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.packageName.hashCode()) * 31;
        String str2 = this.imagePath;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.musicStyle;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.temperament;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.idolTone;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "ArtistBrief(artistId=" + this.artistId + ", newName=" + this.newName + ", oldName=" + this.oldName + ", packageName=" + this.packageName + ", imagePath=" + this.imagePath + ", musicStyle=" + this.musicStyle + ", temperament=" + this.temperament + ", idolTone=" + this.idolTone + Separators.RPAREN;
    }

    public ArtistBrief(int i, String newName, String str, String packageName, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(newName, "newName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.artistId = i;
        this.newName = newName;
        this.oldName = str;
        this.packageName = packageName;
        this.imagePath = str2;
        this.musicStyle = str3;
        this.temperament = str4;
        this.idolTone = str5;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ArtistBrief(int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r2 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L5
            r3 = 0
        L5:
            r12 = r11 & 2
            java.lang.String r0 = ""
            if (r12 == 0) goto Lc
            r4 = r0
        Lc:
            r12 = r11 & 4
            r1 = 0
            if (r12 == 0) goto L12
            r5 = r1
        L12:
            r12 = r11 & 8
            if (r12 == 0) goto L17
            r6 = r0
        L17:
            r12 = r11 & 16
            if (r12 == 0) goto L1c
            r7 = r1
        L1c:
            r12 = r11 & 32
            if (r12 == 0) goto L21
            r8 = r1
        L21:
            r12 = r11 & 64
            if (r12 == 0) goto L26
            r9 = r1
        L26:
            r11 = r11 & 128(0x80, float:1.8E-43)
            if (r11 == 0) goto L34
            r12 = r1
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            goto L3d
        L34:
            r12 = r10
            r11 = r9
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
        L3d:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.aimusic.model.ArtistBrief.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final int getArtistId() {
        return this.artistId;
    }

    public final String getNewName() {
        return this.newName;
    }

    public final String getOldName() {
        return this.oldName;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final String getMusicStyle() {
        return this.musicStyle;
    }

    public final String getTemperament() {
        return this.temperament;
    }

    public final String getIdolTone() {
        return this.idolTone;
    }

    public final String displayName() {
        String str = this.packageName;
        if (StringsKt.isBlank(str)) {
            str = this.newName;
        }
        return str;
    }
}
