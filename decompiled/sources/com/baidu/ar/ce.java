package com.baidu.ar;

import com.baidu.ar.marker.model.LocationMarkerData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class ce extends h1 implements de {
    public List<ja> h;
    public double i;
    public float j;

    public ce(String str, int i) {
        super(str, i);
    }

    @Override // com.baidu.ar.de
    public void a(String str, double d) {
        this.i = d;
        this.j = 0.0f;
    }

    @Override // com.baidu.ar.de
    public void a(String str, s2 s2Var) {
    }

    @Override // com.baidu.ar.de
    public void a(boolean z, String str, List<LocationMarkerData> list) {
        if (z) {
            this.h = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                LocationMarkerData locationMarkerData = list.get(i);
                ja jaVar = new ja();
                String str2 = locationMarkerData.floorId;
                s2 s2Var = new s2();
                double[] dArr = locationMarkerData.locationPoints;
                s2Var.f7184a = (float) dArr[0];
                s2Var.b = (float) dArr[1];
                this.h.add(jaVar);
            }
        }
    }

    @Override // com.baidu.ar.de
    public void a(float[] fArr) {
        this.g = fArr;
    }

    public void b(u6 u6Var) {
        this.f = u6Var;
    }

    @Override // com.baidu.ar.de
    public void c(float[] fArr) {
        this.c = fArr;
        this.f6940a = true;
        u6 u6Var = this.f;
        if (u6Var != null) {
            u6Var.a(this);
        }
    }
}
