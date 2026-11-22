package com.wakeup.common.network.entity;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class RankingModel implements Serializable {
    private List<ListBean> globalRanking;
    private List<ListBean> myRanking;

    public List<ListBean> getMyRanking() {
        return this.myRanking;
    }

    public void setMyRanking(List<ListBean> myRanking) {
        this.myRanking = myRanking;
    }

    public List<ListBean> getGlobalRanking() {
        return this.globalRanking;
    }

    public void setGlobalRanking(List<ListBean> globalRanking) {
        this.globalRanking = globalRanking;
    }

    public static class ListBean implements Serializable {
        private String area;
        private String avatar;
        private int isMember;
        private int isPraise;
        private String nickName;
        private int praiseCount;
        private int rankingNumber;
        private int stepCount;
        private int userId;

        public int getRankingNumber() {
            return this.rankingNumber;
        }

        public void setRankingNumber(int rankingNumber) {
            this.rankingNumber = rankingNumber;
        }

        public int getUserId() {
            return this.userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getNickName() {
            return this.nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public int getStepCount() {
            return this.stepCount;
        }

        public void setStepCount(int stepCount) {
            this.stepCount = stepCount;
        }

        public String getArea() {
            return this.area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public int getPraiseCount() {
            return this.praiseCount;
        }

        public void setPraiseCount(int praiseCount) {
            this.praiseCount = praiseCount;
        }

        public int getIsPraise() {
            return this.isPraise;
        }

        public void setIsPraise(int isPraise) {
            this.isPraise = isPraise;
        }

        public int getIsMember() {
            return this.isMember;
        }

        public void setIsMember(int isMember) {
            this.isMember = isMember;
        }
    }
}
