package com.wakeup.common.network.entity.health;

import java.util.List;

/* loaded from: classes2.dex */
public class HealthWeightStatistics {
    private float avgBmi;
    private float avgWeight;
    private float lastWeight;
    private List<ListBean> list;
    private float maximum;
    private float minimum;
    private float weight;

    public float getAvgWeight() {
        return this.avgWeight;
    }

    public void setAvgWeight(float avgWeight) {
        this.avgWeight = avgWeight;
    }

    public void setAvgBmi(int avgBmi) {
        this.avgBmi = avgBmi;
    }

    public float getAvgBmi() {
        return this.avgBmi;
    }

    public float getLastWeight() {
        return this.lastWeight;
    }

    public void setLastWeight(float lastWeight) {
        this.lastWeight = lastWeight;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public List<ListBean> getList() {
        return this.list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
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

    public static class ListBean {
        private int x;
        private float y;

        public ListBean(int x, float y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return this.x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public float getY() {
            return this.y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
