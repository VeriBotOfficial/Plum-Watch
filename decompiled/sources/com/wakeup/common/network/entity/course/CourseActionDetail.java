package com.wakeup.common.network.entity.course;

import android.os.Parcel;
import android.os.Parcelable;
import com.autonavi.aps.amapapi.config.Const;
import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CourseActionDetail.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\b\u00100\u001a\u00020\u0017H\u0016J\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0017H\u0016J\u0006\u00105\u001a\u000206R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\"\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\u001a\u0010%\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u001a\u0010(\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\u001a\u0010+\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010-\"\u0004\b.\u0010/¨\u00068"}, d2 = {"Lcom/wakeup/common/network/entity/course/CourseActionDetail;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", "getId", "()J", "setId", "(J)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "coverImg", "getCoverImg", "setCoverImg", Const.SP_KEY_CALL_LOC_COUNT, "", "getCount", "()I", "setCount", "(I)V", "actionCount", "getActionCount", "setActionCount", "rest", "getRest", "setRest", "periodType", "getPeriodType", "setPeriodType", "heartbeatHigh", "getHeartbeatHigh", "setHeartbeatHigh", "heartbeatLow", "getHeartbeatLow", "setHeartbeatLow", "isCustom", "", "()Z", "setCustom", "(Z)V", "describeContents", "writeToParcel", "", ApiConstants.DEST, "flags", "toJson", "Lorg/json/JSONObject;", "CREATOR", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CourseActionDetail implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int CUSTOM_TYPE_1 = 0;
    public static final int CUSTOM_TYPE_2 = 1;
    public static final int CUSTOM_TYPE_3 = 2;
    public static final int CUSTOM_TYPE_4 = 3;
    public static final int CUSTOM_TYPE_5 = 4;
    private int actionCount;
    private int count;
    private String coverImg;
    private int heartbeatHigh;
    private int heartbeatLow;
    private long id;
    private boolean isCustom;
    private String name;
    private int periodType;
    private int rest;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CourseActionDetail() {
        this.name = "";
        this.coverImg = "";
    }

    public final long getId() {
        return this.id;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getCoverImg() {
        return this.coverImg;
    }

    public final void setCoverImg(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.coverImg = str;
    }

    public final int getCount() {
        return this.count;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final int getActionCount() {
        return this.actionCount;
    }

    public final void setActionCount(int i) {
        this.actionCount = i;
    }

    public final int getRest() {
        return this.rest;
    }

    public final void setRest(int i) {
        this.rest = i;
    }

    public final int getPeriodType() {
        return this.periodType;
    }

    public final void setPeriodType(int i) {
        this.periodType = i;
    }

    public final int getHeartbeatHigh() {
        return this.heartbeatHigh;
    }

    public final void setHeartbeatHigh(int i) {
        this.heartbeatHigh = i;
    }

    public final int getHeartbeatLow() {
        return this.heartbeatLow;
    }

    public final void setHeartbeatLow(int i) {
        this.heartbeatLow = i;
    }

    /* renamed from: isCustom, reason: from getter */
    public final boolean getIsCustom() {
        return this.isCustom;
    }

    public final void setCustom(boolean z) {
        this.isCustom = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CourseActionDetail(Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.id = parcel.readLong();
        String readString = parcel.readString();
        this.name = readString == null ? "" : readString;
        String readString2 = parcel.readString();
        this.coverImg = readString2 != null ? readString2 : "";
        this.count = parcel.readInt();
        this.actionCount = parcel.readInt();
        this.rest = parcel.readInt();
        this.periodType = parcel.readInt();
        this.heartbeatHigh = parcel.readInt();
        this.heartbeatLow = parcel.readInt();
        this.isCustom = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.id);
        dest.writeString(this.name);
        dest.writeString(this.coverImg);
        dest.writeInt(this.count);
        dest.writeInt(this.actionCount);
        dest.writeInt(this.rest);
        dest.writeInt(this.periodType);
        dest.writeInt(this.heartbeatHigh);
        dest.writeInt(this.heartbeatLow);
        dest.writeInt(this.isCustom ? 1 : 0);
    }

    /* compiled from: CourseActionDetail.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u001d\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/wakeup/common/network/entity/course/CourseActionDetail$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/wakeup/common/network/entity/course/CourseActionDetail;", "<init>", "()V", "CUSTOM_TYPE_1", "", "CUSTOM_TYPE_2", "CUSTOM_TYPE_3", "CUSTOM_TYPE_4", "CUSTOM_TYPE_5", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "(I)[Lcom/wakeup/common/network/entity/course/CourseActionDetail;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.wakeup.common.network.entity.course.CourseActionDetail$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<CourseActionDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CourseActionDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CourseActionDetail(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CourseActionDetail[] newArray(int size) {
            return new CourseActionDetail[size];
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put("name", this.name);
            jSONObject.put("coverImg", this.coverImg);
            jSONObject.put(Const.SP_KEY_CALL_LOC_COUNT, this.count);
            jSONObject.put("actionCount", this.actionCount);
            jSONObject.put("rest", this.rest);
            jSONObject.put("periodType", this.periodType);
            jSONObject.put("heartbeatHigh", this.heartbeatHigh);
            jSONObject.put("heartbeatLow", this.heartbeatLow);
            jSONObject.put("isCustom", this.isCustom);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
