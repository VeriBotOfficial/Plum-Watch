package com.wakeup.common.network.entity.health;

import java.util.List;

/* loaded from: classes2.dex */
public class ActiveHeatStatistics {
    private int avg;
    private int cyclePercent;
    private int exercisePercent;
    private List<ListBean> list;
    private int otherPercent;
    private int runPercent;
    private int total;
    private int walkPercent;

    public int getAvg() {
        return this.avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public int getCyclePercent() {
        return this.cyclePercent;
    }

    public void setCyclePercent(int cyclePercent) {
        this.cyclePercent = cyclePercent;
    }

    public int getExercisePercent() {
        return this.exercisePercent;
    }

    public void setExercisePercent(int exercisePercent) {
        this.exercisePercent = exercisePercent;
    }

    public int getOtherPercent() {
        return this.otherPercent;
    }

    public void setOtherPercent(int otherPercent) {
        this.otherPercent = otherPercent;
    }

    public int getRunPercent() {
        return this.runPercent;
    }

    public void setRunPercent(int runPercent) {
        this.runPercent = runPercent;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getWalkPercent() {
        return this.walkPercent;
    }

    public void setWalkPercent(int walkPercent) {
        this.walkPercent = walkPercent;
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
