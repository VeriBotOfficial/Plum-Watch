package com.wakeup.common.network.entity.health;

import java.util.List;

/* loaded from: classes2.dex */
public class HealthCommonFloatStatistics {
    private float average;
    private List<ListBean> list;
    private float maximum;
    private float minimum;
    private float recently;

    public float getAverage() {
        return this.average;
    }

    public void setAverage(int average) {
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

    public void setRecently(float recently) {
        this.recently = recently;
    }

    public List<ListBean> getList() {
        return this.list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        private float maxY;
        private float minY;
        private int x;
        private float y;

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

        public float getY() {
            return this.y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
