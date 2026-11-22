package com.wakeup.common.storage.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FunctionComponentModel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 72\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0006\u00102\u001a\u00020\u0000J\u0018\u00103\u001a\u0002042\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00105\u001a\u00020\bH\u0016J\b\u00106\u001a\u00020\bH\u0016R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001e\u0010 \u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b!\u0010\n\"\u0004\b\"\u0010\fR\u001e\u0010#\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b$\u0010\n\"\u0004\b%\u0010\fR\u001e\u0010&\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b'\u0010\n\"\u0004\b(\u0010\fR\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019¨\u00068"}, d2 = {"Lcom/wakeup/common/storage/model/FunctionComponentModel;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "pid", "getPid", "setPid", "appFunctionId", "getAppFunctionId", "setAppFunctionId", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "subtitleName", "getSubtitleName", "setSubtitleName", "icon", "getIcon", "setIcon", "selectType", "getSelectType", "setSelectType", "showType", "getShowType", "setShowType", "interactiveType", "getInteractiveType", "setInteractiveType", "jumpVo", "Lcom/wakeup/common/storage/model/FunctionComponentJumpInfo;", "getJumpVo", "()Lcom/wakeup/common/storage/model/FunctionComponentJumpInfo;", "setJumpVo", "(Lcom/wakeup/common/storage/model/FunctionComponentJumpInfo;)V", "backgroundImg", "getBackgroundImg", "setBackgroundImg", "deepCopy", "writeToParcel", "", "flags", "describeContents", "CREATOR", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FunctionComponentModel implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Integer appFunctionId;
    private String backgroundImg;
    private String icon;
    private Integer id;
    private Integer interactiveType;
    private FunctionComponentJumpInfo jumpVo;
    private String name;
    private Integer pid;
    private Integer selectType;
    private Integer showType;
    private String subtitleName;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public FunctionComponentModel() {
    }

    public final Integer getId() {
        return this.id;
    }

    public final void setId(Integer num) {
        this.id = num;
    }

    public final Integer getPid() {
        return this.pid;
    }

    public final void setPid(Integer num) {
        this.pid = num;
    }

    public final Integer getAppFunctionId() {
        return this.appFunctionId;
    }

    public final void setAppFunctionId(Integer num) {
        this.appFunctionId = num;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final String getSubtitleName() {
        return this.subtitleName;
    }

    public final void setSubtitleName(String str) {
        this.subtitleName = str;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final void setIcon(String str) {
        this.icon = str;
    }

    public final Integer getSelectType() {
        return this.selectType;
    }

    public final void setSelectType(Integer num) {
        this.selectType = num;
    }

    public final Integer getShowType() {
        return this.showType;
    }

    public final void setShowType(Integer num) {
        this.showType = num;
    }

    public final Integer getInteractiveType() {
        return this.interactiveType;
    }

    public final void setInteractiveType(Integer num) {
        this.interactiveType = num;
    }

    public final FunctionComponentJumpInfo getJumpVo() {
        return this.jumpVo;
    }

    public final void setJumpVo(FunctionComponentJumpInfo functionComponentJumpInfo) {
        this.jumpVo = functionComponentJumpInfo;
    }

    public final String getBackgroundImg() {
        return this.backgroundImg;
    }

    public final void setBackgroundImg(String str) {
        this.backgroundImg = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FunctionComponentModel(Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Object readValue = parcel.readValue(Integer.TYPE.getClassLoader());
        this.id = readValue instanceof Integer ? (Integer) readValue : null;
        Object readValue2 = parcel.readValue(Integer.TYPE.getClassLoader());
        this.pid = readValue2 instanceof Integer ? (Integer) readValue2 : null;
        Object readValue3 = parcel.readValue(Integer.TYPE.getClassLoader());
        this.appFunctionId = readValue3 instanceof Integer ? (Integer) readValue3 : null;
        this.name = parcel.readString();
        this.subtitleName = parcel.readString();
        this.icon = parcel.readString();
        Object readValue4 = parcel.readValue(Integer.TYPE.getClassLoader());
        this.selectType = readValue4 instanceof Integer ? (Integer) readValue4 : null;
        Object readValue5 = parcel.readValue(Integer.TYPE.getClassLoader());
        this.showType = readValue5 instanceof Integer ? (Integer) readValue5 : null;
        Object readValue6 = parcel.readValue(Integer.TYPE.getClassLoader());
        this.interactiveType = readValue6 instanceof Integer ? (Integer) readValue6 : null;
        this.backgroundImg = parcel.readString();
    }

    public final FunctionComponentModel deepCopy() {
        FunctionComponentModel functionComponentModel = new FunctionComponentModel();
        functionComponentModel.id = this.id;
        functionComponentModel.pid = this.pid;
        functionComponentModel.appFunctionId = this.appFunctionId;
        functionComponentModel.name = this.name;
        functionComponentModel.subtitleName = this.subtitleName;
        functionComponentModel.icon = this.icon;
        functionComponentModel.selectType = this.selectType;
        functionComponentModel.showType = this.showType;
        functionComponentModel.interactiveType = this.interactiveType;
        FunctionComponentJumpInfo functionComponentJumpInfo = this.jumpVo;
        functionComponentModel.jumpVo = functionComponentJumpInfo != null ? functionComponentJumpInfo.deepCopy() : null;
        return functionComponentModel;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.id);
        parcel.writeValue(this.pid);
        parcel.writeValue(this.appFunctionId);
        parcel.writeString(this.name);
        parcel.writeString(this.subtitleName);
        parcel.writeString(this.icon);
        parcel.writeValue(this.selectType);
        parcel.writeValue(this.showType);
        parcel.writeValue(this.interactiveType);
        parcel.writeString(this.backgroundImg);
    }

    /* compiled from: FunctionComponentModel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/wakeup/common/storage/model/FunctionComponentModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/wakeup/common/storage/model/FunctionComponentModel;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/wakeup/common/storage/model/FunctionComponentModel;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.wakeup.common.storage.model.FunctionComponentModel$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<FunctionComponentModel> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FunctionComponentModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FunctionComponentModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FunctionComponentModel[] newArray(int size) {
            return new FunctionComponentModel[size];
        }
    }
}
