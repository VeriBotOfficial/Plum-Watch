package com.wakeup.common.network.entity.user;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class GradeModel implements Serializable {
    private float experienceNum;
    private int gradeNum;
    private String levelNum;
    private List<ListBean> list;
    private float needExperience;
    private String nextGradeName;
    private float nextInitialNum;
    private String nowLevelNum;
    private String url;

    public String getNextGradeName() {
        return this.nextGradeName;
    }

    public void setNextGradeName(String nextGradeName) {
        this.nextGradeName = nextGradeName;
    }

    public float getExperienceNum() {
        return this.experienceNum;
    }

    public void setExperienceNum(float experienceNum) {
        this.experienceNum = experienceNum;
    }

    public String getLevelNum() {
        return this.levelNum;
    }

    public void setLevelNum(String levelNum) {
        this.levelNum = levelNum;
    }

    public String getNowLevelNum() {
        return this.nowLevelNum;
    }

    public void setNowLevelNum(String nowLevelNum) {
        this.nowLevelNum = nowLevelNum;
    }

    public int getGradeNum() {
        return this.gradeNum;
    }

    public void setGradeNum(int gradeNum) {
        this.gradeNum = gradeNum;
    }

    public float getNeedExperience() {
        return this.needExperience;
    }

    public void setNeedExperience(float needExperience) {
        this.needExperience = needExperience;
    }

    public float getNextInitialNum() {
        return this.nextInitialNum;
    }

    public void setNextInitialNum(float nextInitialNum) {
        this.nextInitialNum = nextInitialNum;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<ListBean> getList() {
        return this.list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean implements Serializable {
        private int experienceNum;
        private long gotTime;
        private int gradeId;
        private int gradeNum;
        private String imgUrl;
        private int isGot;
        private String levelNum;

        public int getGradeId() {
            return this.gradeId;
        }

        public void setGradeId(int gradeId) {
            this.gradeId = gradeId;
        }

        public int getExperienceNum() {
            return this.experienceNum;
        }

        public void setExperienceNum(int experienceNum) {
            this.experienceNum = experienceNum;
        }

        public long getGotTime() {
            return this.gotTime;
        }

        public void setGotTime(long gotTime) {
            this.gotTime = gotTime;
        }

        public int getGradeNum() {
            return this.gradeNum;
        }

        public void setGradeNum(int gradeNum) {
            this.gradeNum = gradeNum;
        }

        public String getImgUrl() {
            return this.imgUrl;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public int getIsGot() {
            return this.isGot;
        }

        public void setIsGot(int isGot) {
            this.isGot = isGot;
        }

        public String getLevelNum() {
            return this.levelNum;
        }

        public void setLevelNum(String levelNum) {
            this.levelNum = levelNum;
        }
    }
}
