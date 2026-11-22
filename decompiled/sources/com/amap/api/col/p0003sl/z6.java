package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.services.poisearch.PoiSearchV2;

/* compiled from: PoiHandler.java */
/* loaded from: classes11.dex */
abstract class z6<T, V> extends d6<T, V> {
    public z6(Context context, T t) {
        super(context, t);
    }

    protected String a(PoiSearchV2.ShowFields showFields) {
        if (showFields == null || showFields.getValue() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if ((showFields.getValue() & 1) != 0) {
            sb.append("children,");
        }
        if ((showFields.getValue() & 2) != 0) {
            sb.append("business,");
        }
        if ((showFields.getValue() & 4) != 0) {
            sb.append("indoor,");
        }
        if ((showFields.getValue() & 8) != 0) {
            sb.append("navi,");
        }
        if ((showFields.getValue() & 16) != 0) {
            sb.append("photos,");
        }
        if (sb.length() <= 0) {
            return null;
        }
        sb.replace(sb.length() - 1, sb.length(), "");
        return sb.toString();
    }

    protected boolean e(String str) {
        return str == null || str.equals("") || str.equals("[]");
    }
}
