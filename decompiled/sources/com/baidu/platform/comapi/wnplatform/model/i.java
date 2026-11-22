package com.baidu.platform.comapi.wnplatform.model;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: RouteSegmentsModel.java */
/* loaded from: classes13.dex */
public class i extends a {

    /* renamed from: a, reason: collision with root package name */
    List<h> f8935a = new ArrayList();
    ArrayList<LatLng> b = new ArrayList<>();

    public void a(Bundle[] bundleArr) {
        if (bundleArr == null) {
            this.f8935a.clear();
            this.b.clear();
            return;
        }
        this.f8935a.clear();
        this.b.clear();
        for (Bundle bundle : bundleArr) {
            this.f8935a.add(new h(bundle));
        }
        Iterator<h> it = this.f8935a.iterator();
        while (it.hasNext()) {
            this.b.addAll(it.next().a());
        }
    }

    public ArrayList<LatLng> a() {
        return this.b;
    }
}
