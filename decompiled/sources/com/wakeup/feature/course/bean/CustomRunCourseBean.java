package com.wakeup.feature.course.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.core.d.l;
import com.wakeup.common.network.entity.course.CourseActionDetail;
import io.nats.client.support.ApiConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CustomRunCourseBean.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020!H\u0016J\u0006\u0010&\u001a\u00020'R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001a\u0010\u0016\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006)"}, d2 = {"Lcom/wakeup/feature/course/bean/CustomRunCourseBean;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", "getId", "()J", "setId", "(J)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", l.a.ac, "getUpdateTime", "setUpdateTime", "createTime", "getCreateTime", "setCreateTime", "actionList", "", "Lcom/wakeup/common/network/entity/course/CourseActionDetail;", "getActionList", "()Ljava/util/List;", "setActionList", "(Ljava/util/List;)V", "describeContents", "", "writeToParcel", "", ApiConstants.DEST, "flags", "toJson", "Lorg/json/JSONObject;", "CREATOR", "feature-course_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomRunCourseBean implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private List<CourseActionDetail> actionList;
    private long createTime;
    private long id;
    private String name;
    private long updateTime;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CustomRunCourseBean() {
        this.name = "";
        this.actionList = new ArrayList();
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

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final List<CourseActionDetail> getActionList() {
        return this.actionList;
    }

    public final void setActionList(List<CourseActionDetail> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.actionList = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomRunCourseBean(Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.id = parcel.readLong();
        String readString = parcel.readString();
        this.name = readString == null ? "" : readString;
        this.updateTime = parcel.readLong();
        this.createTime = parcel.readLong();
        ArrayList createTypedArrayList = parcel.createTypedArrayList(CourseActionDetail.INSTANCE);
        Intrinsics.checkNotNull(createTypedArrayList);
        this.actionList = createTypedArrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.id);
        dest.writeString(this.name);
        dest.writeLong(this.updateTime);
        dest.writeLong(this.createTime);
        dest.writeTypedList(this.actionList);
    }

    /* compiled from: CustomRunCourseBean.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/wakeup/feature/course/bean/CustomRunCourseBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/wakeup/feature/course/bean/CustomRunCourseBean;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/wakeup/feature/course/bean/CustomRunCourseBean;", "feature-course_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.wakeup.feature.course.bean.CustomRunCourseBean$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<CustomRunCourseBean> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomRunCourseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CustomRunCourseBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomRunCourseBean[] newArray(int size) {
            return new CustomRunCourseBean[size];
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put("name", this.name);
            jSONObject.put(l.a.ac, this.updateTime);
            jSONObject.put("createTime", this.createTime);
            JSONArray jSONArray = new JSONArray();
            if (!this.actionList.isEmpty()) {
                Iterator<T> it = this.actionList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((CourseActionDetail) it.next()).toJson());
                }
            }
            jSONObject.put("actionList", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
