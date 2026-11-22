package com.wakeup.common.network.entity.health;

import java.util.List;

/* loaded from: classes2.dex */
public class HealthMetStatistics {
    private int avgMet;
    private int goalMet;
    private List<ListBean> list;
    private int sumMet;

    public int getAvgMet() {
        return this.avgMet;
    }

    public void setAvgMet(int avgMet) {
        this.avgMet = avgMet;
    }

    public int getGoalMet() {
        return this.goalMet;
    }

    public void setGoalMet(int goalMet) {
        this.goalMet = goalMet;
    }

    public int getSumMet() {
        return this.sumMet;
    }

    public void setSumMet(int sumMet) {
        this.sumMet = sumMet;
    }

    public List<ListBean> getList() {
        return this.list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        private int x;
        private int y;

        public ListBean(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return this.x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return this.y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
