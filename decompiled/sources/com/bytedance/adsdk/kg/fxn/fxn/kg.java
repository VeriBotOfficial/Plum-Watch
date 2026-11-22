package com.bytedance.adsdk.kg.fxn.fxn;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class kg {
    private final List<ums> fxn = new ArrayList();

    void fxn(ums umsVar) {
        this.fxn.add(umsVar);
    }

    public void fxn(Path path) {
        for (int size = this.fxn.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.kg.bh.bh.fxn(path, this.fxn.get(size));
        }
    }
}
