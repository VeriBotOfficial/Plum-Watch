package com.wakeup.commponent.module.sport;

import android.os.Parcel;
import android.os.Parcelable;
import com.wakeup.common.Constants;
import com.wakeup.common.network.entity.course.CourseActionDetail;
import com.wakeup.common.network.entity.course.CourseBroadcastBean;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SportCourseEntity implements Parcelable {
    public static final Parcelable.Creator<SportCourseEntity> CREATOR = new Parcelable.Creator<SportCourseEntity>() { // from class: com.wakeup.commponent.module.sport.SportCourseEntity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportCourseEntity createFromParcel(Parcel parcel) {
            return new SportCourseEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportCourseEntity[] newArray(int i) {
            return new SportCourseEntity[i];
        }
    };
    private int actionCount;
    private ArrayList<CourseActionDetail> courseActionDetailList;
    private long courseActionId;
    private int courseBroadcastData;
    private ArrayList<CourseBroadcastBean> courseBroadcastList;
    private int courseBroadcastPos;
    private int courseDuration;
    private long courseId;
    private int coursePosition;
    public int grade;
    private String keyword;
    private String name;
    private int saveType;
    private String shareImg;
    public int sourceType;
    private String video;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SportCourseEntity() {
        this.courseId = 0L;
        this.shareImg = "";
        this.courseActionId = 0L;
        this.video = "";
        this.keyword = "";
        this.name = "";
        this.saveType = 0;
        this.actionCount = 0;
        this.sourceType = 0;
        this.courseDuration = 0;
        this.coursePosition = 0;
        this.courseActionDetailList = new ArrayList<>();
        this.courseBroadcastList = new ArrayList<>();
        this.courseBroadcastPos = 0;
        this.courseBroadcastData = 0;
    }

    public SportCourseEntity(long j, String str, long j2, String str2, String str3, String str4, int i, int i2, int i3, int i4) {
        this.courseId = 0L;
        this.shareImg = "";
        this.courseActionId = 0L;
        this.video = "";
        this.keyword = "";
        this.name = "";
        this.saveType = 0;
        this.actionCount = 0;
        this.sourceType = 0;
        this.courseDuration = 0;
        this.coursePosition = 0;
        this.courseActionDetailList = new ArrayList<>();
        this.courseBroadcastList = new ArrayList<>();
        this.courseBroadcastPos = 0;
        this.courseBroadcastData = 0;
        this.courseId = j;
        this.shareImg = str;
        this.courseActionId = j2;
        this.video = str2;
        this.keyword = str3;
        this.name = str4;
        this.saveType = i;
        this.actionCount = i2;
        this.grade = i3;
        this.sourceType = i4;
    }

    protected SportCourseEntity(Parcel parcel) {
        this.courseId = 0L;
        this.shareImg = "";
        this.courseActionId = 0L;
        this.video = "";
        this.keyword = "";
        this.name = "";
        this.saveType = 0;
        this.actionCount = 0;
        this.sourceType = 0;
        this.courseDuration = 0;
        this.coursePosition = 0;
        this.courseActionDetailList = new ArrayList<>();
        this.courseBroadcastList = new ArrayList<>();
        this.courseBroadcastPos = 0;
        this.courseBroadcastData = 0;
        this.courseId = parcel.readLong();
        this.shareImg = parcel.readString();
        this.courseActionId = parcel.readLong();
        this.video = parcel.readString();
        this.keyword = parcel.readString();
        this.name = parcel.readString();
        this.saveType = parcel.readInt();
        this.actionCount = parcel.readInt();
        this.grade = parcel.readInt();
        this.sourceType = parcel.readInt();
        this.courseDuration = parcel.readInt();
        this.coursePosition = parcel.readInt();
        this.courseActionDetailList = parcel.createTypedArrayList(CourseActionDetail.INSTANCE);
        this.courseBroadcastList = parcel.createTypedArrayList(CourseBroadcastBean.INSTANCE);
        this.courseBroadcastPos = parcel.readInt();
        this.courseBroadcastData = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.courseId);
        parcel.writeString(this.shareImg);
        parcel.writeLong(this.courseActionId);
        parcel.writeString(this.video);
        parcel.writeString(this.keyword);
        parcel.writeString(this.name);
        parcel.writeInt(this.saveType);
        parcel.writeInt(this.actionCount);
        parcel.writeInt(this.grade);
        parcel.writeInt(this.sourceType);
        parcel.writeInt(this.courseDuration);
        parcel.writeInt(this.coursePosition);
        parcel.writeTypedList(this.courseActionDetailList);
        parcel.writeTypedList(this.courseBroadcastList);
        parcel.writeInt(this.courseBroadcastPos);
        parcel.writeInt(this.courseBroadcastData);
    }

    public long getCourseId() {
        return this.courseId;
    }

    public void setCourseId(long j) {
        this.courseId = j;
    }

    public String getShareImg() {
        return this.shareImg;
    }

    public void setShareImg(String str) {
        this.shareImg = str;
    }

    public long getCourseActionId() {
        return this.courseActionId;
    }

    public void setCourseActionId(long j) {
        this.courseActionId = j;
    }

    public String getVideo() {
        return this.video;
    }

    public void setVideo(String str) {
        this.video = str;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String str) {
        this.keyword = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public int getSaveType() {
        return this.saveType;
    }

    public void setSaveType(int i) {
        this.saveType = i;
    }

    public int getActionCount() {
        return this.actionCount;
    }

    public void setActionCount(int i) {
        this.actionCount = i;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int i) {
        this.grade = i;
    }

    public int getSourceType() {
        return this.sourceType;
    }

    public void setSourceType(int i) {
        this.sourceType = i;
    }

    public int getCourseDuration() {
        return this.courseDuration;
    }

    public void setCourseDuration(int i) {
        this.courseDuration = i;
    }

    public int getCoursePosition() {
        return this.coursePosition;
    }

    public void setCoursePosition(int i) {
        this.coursePosition = i;
    }

    public ArrayList<CourseActionDetail> getCourseActionDetailList() {
        return this.courseActionDetailList;
    }

    public void setCourseActionDetailList(ArrayList<CourseActionDetail> arrayList) {
        this.courseActionDetailList = arrayList;
    }

    public ArrayList<CourseBroadcastBean> getCourseBroadcastList() {
        return this.courseBroadcastList;
    }

    public void setCourseBroadcastList(ArrayList<CourseBroadcastBean> arrayList) {
        this.courseBroadcastList = arrayList;
    }

    public int getCourseBroadcastPos() {
        return this.courseBroadcastPos;
    }

    public void setCourseBroadcastPos(int i) {
        this.courseBroadcastPos = i;
    }

    public int getCourseBroadcastData() {
        return this.courseBroadcastData;
    }

    public void setCourseBroadcastData(int i) {
        this.courseBroadcastData = i;
    }

    public String toString() {
        return "SportCourseEntity{courseId=" + this.courseId + ", shareImg='" + this.shareImg + "', courseActionId=" + this.courseActionId + ", video='" + this.video + "', keyword='" + this.keyword + "', name='" + this.name + "', saveType=" + this.saveType + ", actionCount=" + this.actionCount + ", grade=" + this.grade + ", sourceType=" + this.sourceType + ", courseDuration=" + this.courseDuration + ", coursePosition=" + this.coursePosition + ", courseActionDetailList=" + this.courseActionDetailList + ", courseBroadcastList=" + this.courseBroadcastList + ", courseBroadcastPos=" + this.courseBroadcastPos + ", courseBroadcastData=" + this.courseBroadcastData + AbstractJsonLexerKt.END_OBJ;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("courseId", this.courseId);
            jSONObject.put("shareImg", this.shareImg);
            jSONObject.put("courseActionId", this.courseActionId);
            jSONObject.put("video", this.video);
            jSONObject.put("keyword", this.keyword);
            jSONObject.put("name", this.name);
            jSONObject.put("saveType", this.saveType);
            jSONObject.put("actionCount", this.actionCount);
            jSONObject.put(Constants.BundleKey.GRADE, this.grade);
            jSONObject.put("sourceType", this.sourceType);
            jSONObject.put("courseDuration", this.courseDuration);
            jSONObject.put("coursePosition", this.coursePosition);
            JSONArray jSONArray = new JSONArray();
            if (!this.courseActionDetailList.isEmpty()) {
                Iterator<CourseActionDetail> it = this.courseActionDetailList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().toJson());
                }
            }
            jSONObject.put("courseActionDetailList", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            if (!this.courseBroadcastList.isEmpty()) {
                Iterator<CourseBroadcastBean> it2 = this.courseBroadcastList.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next().toJson());
                }
            }
            jSONObject.put("courseBroadcastList", jSONArray2);
            jSONObject.put("courseBroadcastPos", this.courseBroadcastPos);
            jSONObject.put("courseBroadcastData", this.courseBroadcastData);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
