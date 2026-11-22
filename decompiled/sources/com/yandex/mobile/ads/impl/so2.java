package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.xn2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class so2 implements xn2 {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f16880a = new int[2];

    @Override // com.yandex.mobile.ads.impl.xn2
    public final JSONObject a(View view) {
        if (view == null) {
            return io2.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f16880a);
        int[] iArr = this.f16880a;
        return io2.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.yandex.mobile.ads.impl.xn2
    public final void a(View view, JSONObject jSONObject, xn2.a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            if (!z) {
                while (i < viewGroup.getChildCount()) {
                    ((g72) aVar).a(viewGroup.getChildAt(i), this, jSONObject, z2);
                    i++;
                }
                return;
            }
            HashMap hashMap = new HashMap();
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i++;
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
                while (it2.hasNext()) {
                    ((g72) aVar).a((View) it2.next(), this, jSONObject, z2);
                }
            }
        }
    }
}
