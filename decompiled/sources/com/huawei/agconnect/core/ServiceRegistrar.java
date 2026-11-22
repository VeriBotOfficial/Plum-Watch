package com.huawei.agconnect.core;

import android.content.Context;
import java.util.List;

/* loaded from: classes12.dex */
public interface ServiceRegistrar {
    List<Service> getServices(Context context);

    void initialize(Context context);
}
