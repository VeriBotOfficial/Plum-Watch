package com.huawei.hms.feature.dynamic;

import android.os.Bundle;
import com.huawei.hms.common.util.Logger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes14.dex */
public final class c {
    private static final String b = "c";
    private static final c c = new c();

    /* renamed from: a, reason: collision with root package name */
    public Set<String> f10352a;

    private c() {
    }

    public static c a() {
        return c;
    }

    public final void a(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("installed_module_name");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            Logger.w(b, "Get installed module name failed.");
            this.f10352a = new HashSet();
        } else {
            Logger.i(b, "Installed module name:".concat(String.valueOf(stringArrayList)));
            this.f10352a = new HashSet(stringArrayList);
        }
    }
}
