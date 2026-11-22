package com.wakeup.common.network.entity.health;

import java.util.List;

/* loaded from: classes2.dex */
public class HealthBloodPressureStatistics {
    private int averageDiastolic;
    private int averagePulse;
    private int averageSystolic;
    private List<ListBean> list;

    public int getAverageDiastolic() {
        return this.averageDiastolic;
    }

    public void setAverageDiastolic(int averageDiastolic) {
        this.averageDiastolic = averageDiastolic;
    }

    public int getAverageSystolic() {
        return this.averageSystolic;
    }

    public void setAverageSystolic(int averageSystolic) {
        this.averageSystolic = averageSystolic;
    }

    public List<ListBean> getList() {
        return this.list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public void setAveragePulse(int averagePulse) {
        this.averagePulse = averagePulse;
    }

    public int getAveragePulse() {
        return this.averagePulse;
    }

    public static class ListBean {
        private int averageDiastolicY;
        private int averageSystolicY;
        private int pulse;
        private int x;

        public int getX() {
            return this.x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getAverageDiastolicY() {
            return this.averageDiastolicY;
        }

        public void setAverageDiastolicY(int averageDiastolicY) {
            this.averageDiastolicY = averageDiastolicY;
        }

        public int getAverageSystolicY() {
            return this.averageSystolicY;
        }

        public void setAverageSystolicY(int averageSystolicY) {
            this.averageSystolicY = averageSystolicY;
        }

        public void setPulse(int pulse) {
            this.pulse = pulse;
        }

        public int getPulse() {
            return this.pulse;
        }
    }
}
