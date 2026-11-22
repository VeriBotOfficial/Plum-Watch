package com.wakeup.common.network.entity.course;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes2.dex */
public class CourseDetailBean implements Parcelable {
    public static final Parcelable.Creator<CourseDetailBean> CREATOR = new Parcelable.Creator<CourseDetailBean>() { // from class: com.wakeup.common.network.entity.course.CourseDetailBean.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CourseDetailBean createFromParcel(Parcel in) {
            return new CourseDetailBean(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CourseDetailBean[] newArray(int size) {
            return new CourseDetailBean[size];
        }
    };
    public String adaptPopulation;
    public int commentNum;
    public ArrayList<CourseBroadcastBean> contentList;
    public List<CourseActionVoBean> courseActionVOList;
    public int courseCode;
    public int courseType;
    public String disclaimers;
    public int grade;
    public String illustrate;
    public String interiorImg;
    public int isFree;
    public int isLike;
    public int isNew;
    public int isVip;
    public int kcal;
    public int likeNum;
    public int min;
    public String name;
    public int num;
    public List<CoursePeriodBean> periodList;
    public String practiceSuggestions;
    public int saveTimeLimit;
    public String shareImg;
    public int shareNum;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CourseDetailBean() {
    }

    protected CourseDetailBean(Parcel in) {
        this.name = in.readString();
        this.num = in.readInt();
        this.interiorImg = in.readString();
        this.shareImg = in.readString();
        this.grade = in.readInt();
        this.kcal = in.readInt();
        this.min = in.readInt();
        this.commentNum = in.readInt();
        this.likeNum = in.readInt();
        this.isLike = in.readInt();
        this.shareNum = in.readInt();
        this.courseType = in.readInt();
        this.saveTimeLimit = in.readInt();
        this.courseCode = in.readInt();
        this.courseActionVOList = in.createTypedArrayList(CourseActionVoBean.CREATOR);
        this.illustrate = in.readString();
        this.adaptPopulation = in.readString();
        this.practiceSuggestions = in.readString();
        this.disclaimers = in.readString();
        this.isVip = in.readInt();
        this.isFree = in.readInt();
        this.isNew = in.readInt();
        this.periodList = in.createTypedArrayList(CoursePeriodBean.INSTANCE);
        this.contentList = in.createTypedArrayList(CourseBroadcastBean.INSTANCE);
    }

    public String formatNum() {
        return new DecimalFormat(",###").format(this.num);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.num);
        dest.writeString(this.interiorImg);
        dest.writeString(this.shareImg);
        dest.writeInt(this.grade);
        dest.writeInt(this.kcal);
        dest.writeInt(this.min);
        dest.writeInt(this.commentNum);
        dest.writeInt(this.likeNum);
        dest.writeInt(this.isLike);
        dest.writeInt(this.shareNum);
        dest.writeInt(this.courseType);
        dest.writeInt(this.saveTimeLimit);
        dest.writeInt(this.courseCode);
        dest.writeTypedList(this.courseActionVOList);
        dest.writeString(this.illustrate);
        dest.writeString(this.adaptPopulation);
        dest.writeString(this.practiceSuggestions);
        dest.writeString(this.disclaimers);
        dest.writeInt(this.isVip);
        dest.writeInt(this.isFree);
        dest.writeInt(this.isNew);
        dest.writeTypedList(this.periodList);
        dest.writeTypedList(this.contentList);
    }

    public static class CourseActionVoBean implements Parcelable {
        public static final Parcelable.Creator<CourseActionVoBean> CREATOR = new Parcelable.Creator<CourseActionVoBean>() { // from class: com.wakeup.common.network.entity.course.CourseDetailBean.CourseActionVoBean.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public CourseActionVoBean createFromParcel(Parcel in) {
                return new CourseActionVoBean(in);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public CourseActionVoBean[] newArray(int size) {
                return new CourseActionVoBean[size];
            }
        };
        public int actionCount;
        public int actionType;
        public String coverImg;
        public String explainContent;

        /* renamed from: id, reason: collision with root package name */
        public int f14193id;
        public Integer isSameName;
        public String name;
        public int rest;
        public String video;
        public long videoDuration;
        public int videoNum;
        public int videoSize;
        public long videoStartTime;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        protected CourseActionVoBean(Parcel in) {
            this.isSameName = null;
            this.f14193id = in.readInt();
            this.video = in.readString();
            this.videoSize = in.readInt();
            this.videoDuration = in.readLong();
            this.coverImg = in.readString();
            this.name = in.readString();
            this.explainContent = in.readString();
            this.actionCount = in.readInt();
            this.actionType = in.readInt();
            this.rest = in.readInt();
            this.videoStartTime = in.readLong();
            this.videoNum = in.readInt();
            if (in.readByte() == 0) {
                this.isSameName = null;
            } else {
                this.isSameName = Integer.valueOf(in.readInt());
            }
        }

        public String toString() {
            return "CourseActionVoBean{id=" + this.f14193id + ", video='" + this.video + "', videoSize=" + this.videoSize + ", videoDuration=" + this.videoDuration + ", coverImg='" + this.coverImg + "', name='" + this.name + "', explainContent='" + this.explainContent + "', actionCount=" + this.actionCount + ", actionType=" + this.actionType + ", rest=" + this.rest + ", videoStartTime=" + this.videoStartTime + ", videoNum=" + this.videoNum + ", isSameName=" + this.isSameName + AbstractJsonLexerKt.END_OBJ;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.f14193id);
            dest.writeString(this.video);
            dest.writeInt(this.videoSize);
            dest.writeLong(this.videoDuration);
            dest.writeString(this.coverImg);
            dest.writeString(this.name);
            dest.writeString(this.explainContent);
            dest.writeInt(this.actionCount);
            dest.writeInt(this.actionType);
            dest.writeInt(this.rest);
            dest.writeLong(this.videoStartTime);
            dest.writeInt(this.videoNum);
            if (this.isSameName == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(this.isSameName.intValue());
            }
        }
    }
}
