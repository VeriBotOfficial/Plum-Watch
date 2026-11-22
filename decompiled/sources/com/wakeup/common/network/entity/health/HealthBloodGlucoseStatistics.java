package com.wakeup.common.network.entity.health;

import java.util.List;

/* loaded from: classes2.dex */
public class HealthBloodGlucoseStatistics {
    private float average;
    private List<ListBean> list;
    private float maximum;
    private float minimum;
    private float recently;

    public float getAverage() {
        return this.average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public float getMaximum() {
        return this.maximum;
    }

    public void setMaximum(float maximum) {
        this.maximum = maximum;
    }

    public float getMinimum() {
        return this.minimum;
    }

    public void setMinimum(float minimum) {
        this.minimum = minimum;
    }

    public float getRecently() {
        return this.recently;
    }

    public void setRecently(int recently) {
        this.recently = recently;
    }

    public List<ListBean> getList() {
        return this.list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        private int maxType;
        private float maxY;
        private int minType;
        private float minY;
        private int x;

        public int getX() {
            return this.x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public float getMaxY() {
            return this.maxY;
        }

        public void setMaxY(float maxY) {
            this.maxY = maxY;
        }

        public float getMinY() {
            return this.minY;
        }

        public void setMinY(float minY) {
            this.minY = minY;
        }

        public void setMinType(int minType) {
            this.minType = minType;
        }

        public int getMinType() {
            return this.minType;
        }

        public void setMaxType(int maxType) {
            this.maxType = maxType;
        }

        public int getMaxType() {
            return this.maxType;
        }
    }
}
