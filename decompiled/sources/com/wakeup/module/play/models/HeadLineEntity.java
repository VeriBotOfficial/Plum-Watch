package com.wakeup.module.play.models;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HeadLineEntity.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001)BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\n\u0010\u000eJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u001aHÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006*"}, d2 = {"Lcom/wakeup/module/play/models/HeadLineEntity;", "Landroid/os/Parcelable;", "id", "", "url", "", "title", "subTitle", "describe", "content", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getId", "()J", "getUrl", "()Ljava/lang/String;", "getTitle", "getSubTitle", "getDescribe", "getContent", "writeToParcel", "", "flags", "", "describeContents", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "module-play_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HeadLineEntity implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String content;
    private final String describe;
    private final long id;
    private final String subTitle;
    private final String title;
    private final String url;

    public static /* synthetic */ HeadLineEntity copy$default(HeadLineEntity headLineEntity, long j, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            j = headLineEntity.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = headLineEntity.url;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = headLineEntity.title;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = headLineEntity.subTitle;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = headLineEntity.describe;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = headLineEntity.content;
        }
        return headLineEntity.copy(j2, str6, str7, str8, str9, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescribe() {
        return this.describe;
    }

    /* renamed from: component6, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final HeadLineEntity copy(long id2, String url, String title, String subTitle, String describe, String content) {
        return new HeadLineEntity(id2, url, title, subTitle, describe, content);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeadLineEntity)) {
            return false;
        }
        HeadLineEntity headLineEntity = (HeadLineEntity) other;
        return this.id == headLineEntity.id && Intrinsics.areEqual(this.url, headLineEntity.url) && Intrinsics.areEqual(this.title, headLineEntity.title) && Intrinsics.areEqual(this.subTitle, headLineEntity.subTitle) && Intrinsics.areEqual(this.describe, headLineEntity.describe) && Intrinsics.areEqual(this.content, headLineEntity.content);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subTitle;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.describe;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.content;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "HeadLineEntity(id=" + this.id + ", url=" + this.url + ", title=" + this.title + ", subTitle=" + this.subTitle + ", describe=" + this.describe + ", content=" + this.content + Separators.RPAREN;
    }

    public HeadLineEntity(long j, String str, String str2, String str3, String str4, String str5) {
        this.id = j;
        this.url = str;
        this.title = str2;
        this.subTitle = str3;
        this.describe = str4;
        this.content = str5;
    }

    public final long getId() {
        return this.id;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getDescribe() {
        return this.describe;
    }

    public final String getContent() {
        return this.content;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeadLineEntity(Parcel parcel) {
        this(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.id);
        parcel.writeString(this.url);
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.describe);
        parcel.writeString(this.content);
    }

    /* compiled from: HeadLineEntity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/wakeup/module/play/models/HeadLineEntity$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/wakeup/module/play/models/HeadLineEntity;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/wakeup/module/play/models/HeadLineEntity;", "module-play_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.wakeup.module.play.models.HeadLineEntity$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<HeadLineEntity> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HeadLineEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HeadLineEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HeadLineEntity[] newArray(int size) {
            return new HeadLineEntity[size];
        }
    }
}
