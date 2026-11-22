package com.bytedance.sdk.component.sg.fxn;

import com.bytedance.sdk.component.sg.kg.gff;
import java.io.IOException;

/* loaded from: classes13.dex */
public abstract class kg extends fxn {
    public abstract void fxn(gff gffVar, IOException iOException, com.bytedance.sdk.component.sg.kg kgVar);

    @Override // com.bytedance.sdk.component.sg.fxn.fxn
    public void fxn(gff gffVar, IOException iOException) {
        fxn(gffVar, iOException, null);
    }
}
