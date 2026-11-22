package com.wakeup.common.network.entity.health;

import java.util.List;

/* loaded from: classes2.dex */
public class HealthStepStatistics {
    private long appTime;
    private int avgStep;
    private double countDistance;
    private int countKcal;
    private int countStep;
    private List<ListBean> list;

    public long getAppTime() {
        return this.appTime;
    }

    public void setAppTime(long appTime) {
        this.appTime = appTime;
    }

    public int getAvgStep() {
        return this.avgStep;
    }

    public void setAvgStep(int avgStep) {
        this.avgStep = avgStep;
    }

    public double getCountDistance() {
        return this.countDistance;
    }

    public void setCountDistance(double countDistance) {
        this.countDistance = countDistance;
    }

    public int getCountKcal() {
        return this.countKcal;
    }

    public void setCountKcal(int countKcal) {
        this.countKcal = countKcal;
    }

    public int getCountStep() {
        return this.countStep;
    }

    public void setCountStep(int countStep) {
        this.countStep = countStep;
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
