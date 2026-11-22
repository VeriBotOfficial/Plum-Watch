package com.bytedance.sdk.openadsdk.core.rlu.gff;

import com.bytedance.sdk.component.utils.sg;
import java.io.File;
import java.util.List;

/* loaded from: classes14.dex */
public class gff extends com.bytedance.sdk.openadsdk.kg.kg {
    public gff(int i, int i2) {
        super(i, i2);
    }

    public gff(int i, int i2, boolean z) {
        super(i, i2);
        this.fxn = z;
    }

    @Override // com.bytedance.sdk.openadsdk.kg.kg, com.bytedance.sdk.openadsdk.kg.fxn
    protected void fxn(List<File> list) {
        int size = list.size();
        if (fxn(0L, size)) {
            return;
        }
        for (File file : list) {
            sg.gff(file);
            size--;
            if (fxn(file, 0L, size)) {
                return;
            }
        }
    }
}
