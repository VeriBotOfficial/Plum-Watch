package com.hihonor.push.sdk;

import android.util.Log;
import com.hihonor.push.sdk.common.BaseResult;

/* loaded from: classes11.dex */
public class a1 extends z0<BaseResult> {
    public a1(String str, c cVar) {
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
            this.f10169a.a((m0<TResult>) null);
        } else {
            Log.e("VoidTask", "task execute failed. error:" + hVar.f10138a);
            this.f10169a.a((Exception) hVar);
        }
    }
}
