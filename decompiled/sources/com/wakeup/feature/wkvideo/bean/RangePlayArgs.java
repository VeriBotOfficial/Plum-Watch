package com.wakeup.feature.wkvideo.bean;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.wakeup.common.network.entity.video.VideoEntity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RangePlayArgs.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 42\u00020\u0001:\u00014B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u0012J\u0018\u0010 \u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0003H\u0016J\b\u0010#\u001a\u00020\u0003H\u0016J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003Jl\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001a¨\u00065"}, d2 = {"Lcom/wakeup/feature/wkvideo/bean/RangePlayArgs;", "Landroid/os/Parcelable;", "loaderType", "", "page", "maxPage", "list", "Ljava/util/ArrayList;", "Lcom/wakeup/common/network/entity/video/VideoEntity;", "pushId", "", "collectId", "current", "tag", "<init>", "(IIILjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getLoaderType", "()I", "getPage", "getMaxPage", "getList", "()Ljava/util/ArrayList;", "getPushId", "()Ljava/lang/String;", "getCollectId", "getCurrent", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTag", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(IIILjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/wakeup/feature/wkvideo/bean/RangePlayArgs;", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RangePlayArgs implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String collectId;
    private final Integer current;
    private final ArrayList<VideoEntity> list;
    private final int loaderType;
    private final int maxPage;
    private final int page;
    private final String pushId;
    private final String tag;

    public static /* synthetic */ RangePlayArgs copy$default(RangePlayArgs rangePlayArgs, int i, int i2, int i3, ArrayList arrayList, String str, String str2, Integer num, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = rangePlayArgs.loaderType;
        }
        if ((i4 & 2) != 0) {
            i2 = rangePlayArgs.page;
        }
        if ((i4 & 4) != 0) {
            i3 = rangePlayArgs.maxPage;
        }
        if ((i4 & 8) != 0) {
            arrayList = rangePlayArgs.list;
        }
        if ((i4 & 16) != 0) {
            str = rangePlayArgs.pushId;
        }
        if ((i4 & 32) != 0) {
            str2 = rangePlayArgs.collectId;
        }
        if ((i4 & 64) != 0) {
            num = rangePlayArgs.current;
        }
        if ((i4 & 128) != 0) {
            str3 = rangePlayArgs.tag;
        }
        Integer num2 = num;
        String str4 = str3;
        String str5 = str;
        String str6 = str2;
        return rangePlayArgs.copy(i, i2, i3, arrayList, str5, str6, num2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLoaderType() {
        return this.loaderType;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxPage() {
        return this.maxPage;
    }

    public final ArrayList<VideoEntity> component4() {
        return this.list;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPushId() {
        return this.pushId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCollectId() {
        return this.collectId;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getCurrent() {
        return this.current;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    public final RangePlayArgs copy(int loaderType, int page, int maxPage, ArrayList<VideoEntity> list, String pushId, String collectId, Integer current, String tag) {
        Intrinsics.checkNotNullParameter(list, "list");
        return new RangePlayArgs(loaderType, page, maxPage, list, pushId, collectId, current, tag);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RangePlayArgs)) {
            return false;
        }
        RangePlayArgs rangePlayArgs = (RangePlayArgs) other;
        return this.loaderType == rangePlayArgs.loaderType && this.page == rangePlayArgs.page && this.maxPage == rangePlayArgs.maxPage && Intrinsics.areEqual(this.list, rangePlayArgs.list) && Intrinsics.areEqual(this.pushId, rangePlayArgs.pushId) && Intrinsics.areEqual(this.collectId, rangePlayArgs.collectId) && Intrinsics.areEqual(this.current, rangePlayArgs.current) && Intrinsics.areEqual(this.tag, rangePlayArgs.tag);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.loaderType) * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.maxPage)) * 31) + this.list.hashCode()) * 31;
        String str = this.pushId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.collectId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.current;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.tag;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "RangePlayArgs(loaderType=" + this.loaderType + ", page=" + this.page + ", maxPage=" + this.maxPage + ", list=" + this.list + ", pushId=" + this.pushId + ", collectId=" + this.collectId + ", current=" + this.current + ", tag=" + this.tag + Separators.RPAREN;
    }

    public RangePlayArgs(int i, int i2, int i3, ArrayList<VideoEntity> list, String str, String str2, Integer num, String str3) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.loaderType = i;
        this.page = i2;
        this.maxPage = i3;
        this.list = list;
        this.pushId = str;
        this.collectId = str2;
        this.current = num;
        this.tag = str3;
    }

    public final int getLoaderType() {
        return this.loaderType;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getMaxPage() {
        return this.maxPage;
    }

    public final ArrayList<VideoEntity> getList() {
        return this.list;
    }

    public final String getPushId() {
        return this.pushId;
    }

    public final String getCollectId() {
        return this.collectId;
    }

    public /* synthetic */ RangePlayArgs(int i, int i2, int i3, ArrayList arrayList, String str, String str2, Integer num, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, arrayList, (i4 & 16) != 0 ? null : str, (i4 & 32) != 0 ? null : str2, (i4 & 64) != 0 ? 0 : num, (i4 & 128) != 0 ? null : str3);
    }

    public final Integer getCurrent() {
        return this.current;
    }

    public final String getTag() {
        return this.tag;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RangePlayArgs(android.os.Parcel r11) {
        /*
            r10 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            int r2 = r11.readInt()
            int r3 = r11.readInt()
            int r4 = r11.readInt()
            com.wakeup.common.network.entity.video.VideoEntity$CREATOR r0 = com.wakeup.common.network.entity.video.VideoEntity.INSTANCE
            android.os.Parcelable$Creator r0 = (android.os.Parcelable.Creator) r0
            java.util.ArrayList r5 = r11.createTypedArrayList(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            java.lang.String r6 = r11.readString()
            java.lang.String r7 = r11.readString()
            int r0 = r11.readInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.String r9 = r11.readString()
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.bean.RangePlayArgs.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.loaderType);
        parcel.writeInt(this.page);
        parcel.writeInt(this.maxPage);
        parcel.writeTypedList(this.list);
        parcel.writeString(this.pushId);
        parcel.writeString(this.collectId);
        Integer num = this.current;
        parcel.writeInt(num != null ? num.intValue() : 0);
        parcel.writeString(this.tag);
    }

    /* compiled from: RangePlayArgs.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/wakeup/feature/wkvideo/bean/RangePlayArgs$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/wakeup/feature/wkvideo/bean/RangePlayArgs;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/wakeup/feature/wkvideo/bean/RangePlayArgs;", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.wakeup.feature.wkvideo.bean.RangePlayArgs$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<RangePlayArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RangePlayArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RangePlayArgs(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RangePlayArgs[] newArray(int size) {
            return new RangePlayArgs[size];
        }
    }
}
