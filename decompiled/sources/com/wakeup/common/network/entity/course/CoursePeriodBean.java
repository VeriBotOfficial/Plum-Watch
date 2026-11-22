package com.wakeup.common.network.entity.course;

import android.os.Parcel;
import android.os.Parcelable;
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

/* compiled from: CoursePeriodBean.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\bH\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\bH\u0016J\u0006\u0010\u0019\u001a\u00020\u001aR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/course/CoursePeriodBean;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "type", "", "getType", "()I", "setType", "(I)V", "actions", "", "Lcom/wakeup/common/network/entity/course/CourseActionDetail;", "getActions", "()Ljava/util/List;", "setActions", "(Ljava/util/List;)V", "describeContents", "writeToParcel", "", ApiConstants.DEST, "flags", "toJson", "Lorg/json/JSONObject;", "CREATOR", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CoursePeriodBean implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private List<CourseActionDetail> actions;
    private int type;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CoursePeriodBean() {
        this.actions = new ArrayList();
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final List<CourseActionDetail> getActions() {
        return this.actions;
    }

    public final void setActions(List<CourseActionDetail> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.actions = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoursePeriodBean(Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.type = parcel.readInt();
        ArrayList createTypedArrayList = parcel.createTypedArrayList(CourseActionDetail.INSTANCE);
        Intrinsics.checkNotNull(createTypedArrayList);
        this.actions = createTypedArrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.type);
        dest.writeTypedList(this.actions);
    }

    /* compiled from: CoursePeriodBean.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/wakeup/common/network/entity/course/CoursePeriodBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/wakeup/common/network/entity/course/CoursePeriodBean;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/wakeup/common/network/entity/course/CoursePeriodBean;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.wakeup.common.network.entity.course.CoursePeriodBean$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<CoursePeriodBean> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CoursePeriodBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CoursePeriodBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CoursePeriodBean[] newArray(int size) {
            return new CoursePeriodBean[size];
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.type);
            JSONArray jSONArray = new JSONArray();
            if (!this.actions.isEmpty()) {
                Iterator<T> it = this.actions.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((CourseActionDetail) it.next()).toJson());
                }
            }
            jSONObject.put("actions", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
