package com.huawei.hms.push.task;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.PushNaming;
import java.util.concurrent.Callable;

/* loaded from: classes14.dex */
public class IntentCallable implements Callable<Void> {

    /* renamed from: a, reason: collision with root package name */
    private Context f10488a;
    private Intent b;
    private String c;

    public IntentCallable(Context context, Intent intent, String str) {
        this.f10488a = context;
        this.b = intent;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f10488a.sendBroadcast(this.b);
        PushBiUtil.reportExit(this.f10488a, PushNaming.SET_NOTIFY_FLAG, this.c, ErrorEnum.SUCCESS);
        return null;
    }
}
