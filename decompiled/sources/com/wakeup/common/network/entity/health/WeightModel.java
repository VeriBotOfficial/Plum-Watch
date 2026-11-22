package com.wakeup.common.network.entity.health;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes2.dex */
public class WeightModel {
    private float avgBMI;
    private float avgWeight;
    private float lastWeight;
    private List<ListBean> list;
    private float nowBMI;
    private float nowWeight;
    private int userId;
    private float weightChange;
    private float weightCyclicalChange;

    public void convertWeekData(String type) {
        if (type.equals("week")) {
            for (ListBean listBean : getList()) {
                if (listBean.getX().equals("0")) {
                    listBean.setX("7");
                }
            }
        }
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public float getNowWeight() {
        return this.nowWeight;
    }

    public void setNowWeight(float nowWeight) {
        this.nowWeight = nowWeight;
    }

    public float getNowBMI() {
        return this.nowBMI;
    }

    public void setNowBMI(float nowBMI) {
        this.nowBMI = nowBMI;
    }

    public float getLastWeight() {
        return this.lastWeight;
    }

    public void setLastWeight(float lastWeight) {
        this.lastWeight = lastWeight;
    }

    public float getWeightChange() {
        return this.weightChange;
    }

    public void setWeightChange(float weightChange) {
        this.weightChange = weightChange;
    }

    public float getAvgBMI() {
        return this.avgBMI;
    }

    public void setAvgBMI(float avgBMI) {
        this.avgBMI = avgBMI;
    }

    public float getAvgWeight() {
        return this.avgWeight;
    }

    public void setAvgWeight(float avgWeight) {
        this.avgWeight = avgWeight;
    }

    public float getWeightCyclicalChange() {
        return this.weightCyclicalChange;
    }

    public void setWeightCyclicalChange(float weightCyclicalChange) {
        this.weightCyclicalChange = weightCyclicalChange;
    }

    public List<ListBean> getList() {
        if (this.list == null) {
            this.list = new ArrayList();
        }
        return this.list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public List<ListBean> getList2() {
        if (this.list == null) {
            this.list = new ArrayList();
        }
        while (this.list.size() < 3 && this.list.size() > 0) {
            this.list.add(new ListBean(String.valueOf(Float.valueOf(this.list.get(0).getX()).intValue() + 1), this.list.get(0).getY()));
        }
        return this.list;
    }

    public List<ListBean> getListByComplete(int start, int size) {
        ArrayList arrayList = new ArrayList();
        while (start < size) {
            ListBean listIndex = getListIndex(start);
            if (listIndex != null) {
                arrayList.add(listIndex);
            } else {
                arrayList.add(new ListBean(String.valueOf(start), "0"));
            }
            start++;
        }
        return arrayList;
    }

    private ListBean getListIndex(int i) {
        for (ListBean listBean : getList()) {
            if (!TextUtils.isEmpty(listBean.getX()) && Float.valueOf(listBean.getX()).intValue() == i) {
                return listBean;
            }
        }
        return null;
    }

    public static class ListBean {
        private String X;
        private String Y;

        public ListBean(String x, String y) {
            this.X = x;
            this.Y = y;
        }

        public String getX() {
            return this.X;
        }

        public void setX(String x) {
            this.X = x;
        }

        public String getY() {
            return this.Y;
        }

        public void setY(String y) {
            this.Y = y;
        }

        public String toString() {
            return "ListBean{X='" + this.X + "', Y='" + this.Y + "'}";
        }
    }

    public String toString() {
        return "WeightModel{userId=" + this.userId + ", nowWeight=" + this.nowWeight + ", nowBMI=" + this.nowBMI + ", avgBMI=" + this.avgBMI + ", lastWeight=" + this.lastWeight + ", weightChange=" + this.weightChange + ", avgWeight=" + this.avgWeight + ", weightCyclicalChange=" + this.weightCyclicalChange + ", list=" + this.list + AbstractJsonLexerKt.END_OBJ;
    }
}
