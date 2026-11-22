package com.hihonor.push.sdk;

import android.util.Log;
import com.hihonor.push.sdk.common.BooleanResult;

/* loaded from: classes11.dex */
public class x0 extends z0<BooleanResult> {
    public x0(String str, c cVar) {
        super(str, cVar);
    }

    @Override // com.hihonor.push.sdk.z0
    public void a(h hVar, Object obj) {
        if (hVar == null) {
            hVar = l.ERROR_UNKNOWN.a();
        }
        int i = hVar.f10138a;
        l lVar = l.SUCCESS;
        if (i == 0) {
            if (obj instanceof BooleanResult) {
                this.f10169a.a((m0<TResult>) obj);
                return;
            }
            hVar = l.ERROR_INTERNAL_ERROR.a();
        }
        Log.e("BooleanTask", "task execute failed. error:" + hVar.f10138a);
        this.f10169a.a((Exception) hVar);
    }
}
