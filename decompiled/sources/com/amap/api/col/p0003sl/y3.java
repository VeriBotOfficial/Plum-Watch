package com.amap.api.col.p0003sl;

import com.autonavi.base.ae.gmap.style.StyleItem;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: StyleParserResult.java */
/* loaded from: classes11.dex */
public class y3 {

    /* renamed from: a, reason: collision with root package name */
    private Map<Integer, StyleItem> f1983a = new ConcurrentHashMap();
    private StyleItem[] b;

    public StyleItem[] a() {
        Map<Integer, StyleItem> map = this.f1983a;
        if (map != null && map.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (StyleItem styleItem : this.f1983a.values()) {
                if (styleItem.isValid()) {
                    arrayList.add(styleItem);
                }
            }
            int size = arrayList.size();
            if (size > 0) {
                StyleItem[] styleItemArr = (StyleItem[]) arrayList.toArray(new StyleItem[size]);
                this.b = styleItemArr;
                return styleItemArr;
            }
        }
        return null;
    }

    public StyleItem[] b() {
        return this.b;
    }

    public Map<Integer, StyleItem> c() {
        return this.f1983a;
    }
}
