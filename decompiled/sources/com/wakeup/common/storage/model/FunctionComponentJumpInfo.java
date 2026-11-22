package com.wakeup.common.storage.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.wakeup.howear.rn.api.route.RnRouterApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FunctionComponentJumpInfo.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0006\u0010\u001a\u001a\u00020\u0000J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\bH\u0016J\b\u0010\u001e\u001a\u00020\bH\u0016R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\f¨\u0006 "}, d2 = {"Lcom/wakeup/common/storage/model/FunctionComponentJumpInfo;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "jumpType", "", "getJumpType", "()Ljava/lang/Integer;", "setJumpType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "jumpInfo", "", "getJumpInfo", "()Ljava/lang/String;", "setJumpInfo", "(Ljava/lang/String;)V", "extendInfo", "getExtendInfo", "setExtendInfo", RnRouterApi.KEY_DEPENDENT_TYPE, "getDependentType", "setDependentType", "deepCopy", "writeToParcel", "", "flags", "describeContents", "CREATOR", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class FunctionComponentJumpInfo implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Integer dependentType;
    private String extendInfo;
    private String jumpInfo;
    private Integer jumpType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public FunctionComponentJumpInfo() {
    }

    public final Integer getJumpType() {
        return this.jumpType;
    }

    public final void setJumpType(Integer num) {
        this.jumpType = num;
    }

    public final String getJumpInfo() {
        return this.jumpInfo;
    }

    public final void setJumpInfo(String str) {
        this.jumpInfo = str;
    }

    public final String getExtendInfo() {
        return this.extendInfo;
    }

    public final void setExtendInfo(String str) {
        this.extendInfo = str;
    }

    public final Integer getDependentType() {
        return this.dependentType;
    }

    public final void setDependentType(Integer num) {
        this.dependentType = num;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FunctionComponentJumpInfo(Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Object readValue = parcel.readValue(Integer.TYPE.getClassLoader());
        this.jumpType = readValue instanceof Integer ? (Integer) readValue : null;
        this.jumpInfo = parcel.readString();
        this.extendInfo = parcel.readString();
        Object readValue2 = parcel.readValue(Integer.TYPE.getClassLoader());
        this.dependentType = readValue2 instanceof Integer ? (Integer) readValue2 : null;
    }

    public final FunctionComponentJumpInfo deepCopy() {
        FunctionComponentJumpInfo functionComponentJumpInfo = new FunctionComponentJumpInfo();
        functionComponentJumpInfo.jumpType = this.jumpType;
        functionComponentJumpInfo.jumpInfo = this.jumpInfo;
        functionComponentJumpInfo.extendInfo = this.extendInfo;
        functionComponentJumpInfo.dependentType = this.dependentType;
        return functionComponentJumpInfo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.jumpType);
        parcel.writeString(this.jumpInfo);
        parcel.writeString(this.extendInfo);
        parcel.writeValue(this.dependentType);
    }

    /* compiled from: FunctionComponentJumpInfo.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/wakeup/common/storage/model/FunctionComponentJumpInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/wakeup/common/storage/model/FunctionComponentJumpInfo;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/wakeup/common/storage/model/FunctionComponentJumpInfo;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.wakeup.common.storage.model.FunctionComponentJumpInfo$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<FunctionComponentJumpInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FunctionComponentJumpInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FunctionComponentJumpInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FunctionComponentJumpInfo[] newArray(int size) {
            return new FunctionComponentJumpInfo[size];
        }
    }
}
