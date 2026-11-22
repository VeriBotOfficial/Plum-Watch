package com.baidu.platform.comapi.bikenavi.ui;

import android.content.Context;
import com.baidu.bikenavi.R;
import com.baidu.mapapi.map.MapLanguage;
import com.baidu.platform.comapi.wnplatform.o.a;

/* loaded from: classes13.dex */
public class BikeUiRes extends a {
    public BikeUiRes(Context context, MapLanguage mapLanguage) {
        super(context, mapLanguage);
    }

    public int b0() {
        return this.b == MapLanguage.ENGLISH ? R.string.sdk_bike_already_riding_en : R.string.sdk_bike_already_riding;
    }

    public int c0() {
        return this.b == MapLanguage.ENGLISH ? R.string.sdk_bike_cycling_to_open_areas_en : R.string.sdk_bike_cycling_to_open_areas;
    }
}
