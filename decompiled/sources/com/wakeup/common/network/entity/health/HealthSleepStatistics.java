package com.wakeup.common.network.entity.health;

import java.util.List;

/* loaded from: classes2.dex */
public class HealthSleepStatistics {
    private int awakeRatio;
    private int deepRatio;
    private List<ListBean> list;
    private int shallowRatio;
    private int sumDuration;

    public int getAwakeRatio() {
        return this.awakeRatio;
    }

    public void setAwakeRatio(int awakeRatio) {
        this.awakeRatio = awakeRatio;
    }

    public int getDeepRatio() {
        return this.deepRatio;
    }

    public void setDeepRatio(int deepRatio) {
        this.deepRatio = deepRatio;
    }

    public int getShallowRatio() {
        return this.shallowRatio;
    }

    public void setShallowRatio(int shallowRatio) {
        this.shallowRatio = shallowRatio;
    }

    public int getSumDuration() {
        return this.sumDuration;
    }

    public void setSumDuration(int sumDuration) {
        this.sumDuration = sumDuration;
    }

    public List<ListBean> getList() {
        return this.list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        private int awakeY;
        private int deepY;
        private int shallowY;
        private int x;

        public int getAwakeY() {
            return this.awakeY;
        }

        public void setAwakeY(int awakeY) {
            this.awakeY = awakeY;
        }

        public int getDeepY() {
            return this.deepY;
        }

        public void setDeepY(int deepY) {
            this.deepY = deepY;
        }

        public int getShallowY() {
            return this.shallowY;
        }

        public void setShallowY(int shallowY) {
            this.shallowY = shallowY;
        }

        public int getX() {
            return this.x;
        }

        public void setX(int x) {
            this.x = x;
        }
    }
}
