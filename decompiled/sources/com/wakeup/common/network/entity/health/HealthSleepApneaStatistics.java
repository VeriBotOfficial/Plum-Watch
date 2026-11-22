package com.wakeup.common.network.entity.health;

import java.util.List;

/* loaded from: classes2.dex */
public class HealthSleepApneaStatistics {
    private int avg;
    private List<ListBean> list;
    private int total;

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return this.total;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public int getAvg() {
        return this.avg;
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
