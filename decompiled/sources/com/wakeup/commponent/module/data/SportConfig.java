package com.wakeup.commponent.module.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.umeng.analytics.AnalyticsConfig;
import io.nats.client.support.ApiConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SportConfig.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 52\u00020\u0001:\u000245B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0012H\u0016J\b\u00103\u001a\u00020\u0012H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001a\u0010$\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010\u0016R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016¨\u00066"}, d2 = {"Lcom/wakeup/commponent/module/data/SportConfig;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", AnalyticsConfig.RTD_START_TIME, "", "getStartTime", "()J", "setStartTime", "(J)V", "endTime", "getEndTime", "setEndTime", "typeList", "", "", "getTypeList", "()Ljava/util/List;", "setTypeList", "(Ljava/util/List;)V", "mac", "", "getMac", "()Ljava/lang/String;", "setMac", "(Ljava/lang/String;)V", "isDesc", "", "()Z", "setDesc", "(Z)V", "isQueryOss", "setQueryOss", ApiConstants.LIMIT, "getLimit", "()I", "setLimit", "(I)V", "ossPathList", "getOssPathList", "setOssPathList", "synStateList", "getSynStateList", "setSynStateList", "writeToParcel", "", ApiConstants.DEST, "flags", "describeContents", "Builder", "CREATOR", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SportConfig implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long endTime;
    private boolean isDesc;
    private boolean isQueryOss;
    private int limit;
    private String mac;
    private List<String> ossPathList;
    private long startTime;
    private List<Integer> synStateList;
    private List<Integer> typeList;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final List<Integer> getTypeList() {
        return this.typeList;
    }

    public final void setTypeList(List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.typeList = list;
    }

    public final String getMac() {
        return this.mac;
    }

    public final void setMac(String str) {
        this.mac = str;
    }

    /* renamed from: isDesc, reason: from getter */
    public final boolean getIsDesc() {
        return this.isDesc;
    }

    public final void setDesc(boolean z) {
        this.isDesc = z;
    }

    /* renamed from: isQueryOss, reason: from getter */
    public final boolean getIsQueryOss() {
        return this.isQueryOss;
    }

    public final void setQueryOss(boolean z) {
        this.isQueryOss = z;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final void setLimit(int i) {
        this.limit = i;
    }

    public final List<String> getOssPathList() {
        return this.ossPathList;
    }

    public final void setOssPathList(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.ossPathList = list;
    }

    public final List<Integer> getSynStateList() {
        return this.synStateList;
    }

    public final void setSynStateList(List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.synStateList = list;
    }

    public SportConfig() {
        this.typeList = new ArrayList();
        this.mac = "";
        this.isQueryOss = true;
        this.ossPathList = new ArrayList();
        this.synStateList = new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportConfig(Parcel parcel) {
        this();
        ArrayList list;
        ArrayList list2;
        ArrayList list3;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        int[] createIntArray = parcel.createIntArray();
        this.typeList = (createIntArray == null || (list3 = ArraysKt.toList(createIntArray)) == null) ? new ArrayList() : list3;
        this.mac = parcel.readString();
        this.isDesc = parcel.readByte() != 0;
        this.limit = parcel.readInt();
        this.isQueryOss = parcel.readByte() != 0;
        String[] createStringArray = parcel.createStringArray();
        this.ossPathList = (createStringArray == null || (list2 = ArraysKt.toList(createStringArray)) == null) ? new ArrayList() : list2;
        int[] createIntArray2 = parcel.createIntArray();
        this.synStateList = (createIntArray2 == null || (list = ArraysKt.toList(createIntArray2)) == null) ? new ArrayList() : list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.startTime);
        dest.writeLong(this.endTime);
        dest.writeIntArray(CollectionsKt.toIntArray(this.typeList));
        dest.writeString(this.mac);
        dest.writeByte(this.isDesc ? (byte) 1 : (byte) 0);
        dest.writeInt(this.limit);
        dest.writeByte(this.isQueryOss ? (byte) 1 : (byte) 0);
        dest.writeStringArray((String[]) this.ossPathList.toArray(new String[0]));
        dest.writeIntArray(CollectionsKt.toIntArray(this.synStateList));
    }

    /* compiled from: SportConfig.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000eJ\u0014\u0010\u0019\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003J\u0014\u0010\u001a\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/wakeup/commponent/module/data/SportConfig$Builder;", "", "typeList", "", "", AnalyticsConfig.RTD_START_TIME, "", "endTime", "<init>", "(Ljava/util/List;JJ)V", "mac", "", ApiConstants.LIMIT, "isQueryOss", "", "isDesc", "ossPathList", "synStateList", "setIsDesc", "setMac", "setStartTime", "setEndTime", "setLimit", "setQueryOss", "queryOss", "setOssPathList", "setSynStateList", "build", "Lcom/wakeup/commponent/module/data/SportConfig;", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private long endTime;
        private boolean isDesc;
        private boolean isQueryOss;
        private int limit;
        private String mac;
        private List<String> ossPathList;
        private long startTime;
        private List<Integer> synStateList;
        private List<Integer> typeList;

        public Builder(List<Integer> typeList, long j, long j2) {
            Intrinsics.checkNotNullParameter(typeList, "typeList");
            this.typeList = new ArrayList();
            this.mac = "";
            this.isQueryOss = true;
            this.isDesc = true;
            this.ossPathList = new ArrayList();
            this.synStateList = new ArrayList();
            this.startTime = j;
            this.endTime = j2;
            this.typeList = typeList;
        }

        public final Builder setIsDesc(boolean isDesc) {
            this.isDesc = isDesc;
            return this;
        }

        public final Builder setMac(String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            this.mac = mac;
            return this;
        }

        public final Builder setStartTime(long startTime) {
            this.startTime = startTime;
            return this;
        }

        public final Builder setEndTime(long endTime) {
            this.endTime = endTime;
            return this;
        }

        public final Builder setLimit(int limit) {
            this.limit = limit;
            return this;
        }

        public final Builder setQueryOss(boolean queryOss) {
            this.isQueryOss = queryOss;
            return this;
        }

        public final Builder setOssPathList(List<String> ossPathList) {
            Intrinsics.checkNotNullParameter(ossPathList, "ossPathList");
            this.ossPathList = ossPathList;
            return this;
        }

        public final Builder setSynStateList(List<Integer> synStateList) {
            Intrinsics.checkNotNullParameter(synStateList, "synStateList");
            this.synStateList = synStateList;
            return this;
        }

        public final SportConfig build() {
            SportConfig sportConfig = new SportConfig();
            sportConfig.setStartTime(this.startTime);
            sportConfig.setEndTime(this.endTime);
            sportConfig.setTypeList(this.typeList);
            sportConfig.setMac(this.mac);
            sportConfig.setDesc(this.isDesc);
            sportConfig.setLimit(this.limit);
            sportConfig.setQueryOss(this.isQueryOss);
            sportConfig.setOssPathList(this.ossPathList);
            sportConfig.setSynStateList(this.synStateList);
            return sportConfig;
        }
    }

    /* compiled from: SportConfig.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/wakeup/commponent/module/data/SportConfig$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/wakeup/commponent/module/data/SportConfig;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/wakeup/commponent/module/data/SportConfig;", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.wakeup.commponent.module.data.SportConfig$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<SportConfig> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SportConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportConfig[] newArray(int size) {
            return new SportConfig[size];
        }
    }
}
