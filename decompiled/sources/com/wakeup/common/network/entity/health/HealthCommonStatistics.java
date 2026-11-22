package com.wakeup.common.network.entity.health;

import java.util.List;

/* loaded from: classes2.dex */
public class HealthCommonStatistics {
    private int average;
    private List<ListBean> list;
    private int maximum;
    private int minimum;
    private int recently;

    public int getAverage() {
        return this.average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getMaximum() {
        return this.maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return this.minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getRecently() {
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
        private int maxY;
        private int minY;
        private int x;
        private int y;

        public int getX() {
            return this.x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getMaxY() {
            return this.maxY;
        }

        public void setMaxY(int maxY) {
            this.maxY = maxY;
        }

        public int getMinY() {
            return this.minY;
        }

        public void setMinY(int minY) {
            this.minY = minY;
        }

        public int getY() {
            return this.y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
