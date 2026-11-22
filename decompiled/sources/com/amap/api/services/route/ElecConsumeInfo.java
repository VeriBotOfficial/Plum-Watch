package com.amap.api.services.route;

import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class ElecConsumeInfo {

    /* renamed from: a, reason: collision with root package name */
    private int f2166a;
    private int b;
    private LatLonPoint c;
    private List<Integer> d = new ArrayList();

    public int getConsumeEnergy() {
        return this.f2166a;
    }

    public List<Integer> getLeftEnergy() {
        return this.d;
    }

    public LatLonPoint getRunOutPoint() {
        return this.c;
    }

    public int getRunOutStepIndex() {
        return this.b;
    }

    public void setConsumeEnergy(int i) {
        this.f2166a = i;
    }

    public void setLeftEnergy(List<Integer> list) {
        this.d = list;
    }

    public void setRunOutPoint(LatLonPoint latLonPoint) {
        this.c = latLonPoint;
    }

    public void setRunOutStepIndex(int i) {
        this.b = i;
    }
}
