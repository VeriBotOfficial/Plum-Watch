package com.wakeup.module.ap;

import android.content.Context;
import com.wakeup.common.network.wsh.SignConfiguration;
import com.wakeup.commponent.api.ApService;
import com.wakeup.commponent.module.ap.ApTaskModule;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApServiceImpl.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¨\u0006\u0016"}, d2 = {"Lcom/wakeup/module/ap/ApServiceImpl;", "Lcom/wakeup/commponent/api/ApService;", "<init>", "()V", "init", "", "context", "Landroid/content/Context;", "getFirstTasks", "", "Lcom/wakeup/commponent/module/ap/ApTaskModule;", "getDailyTasks", "completeTask", "taskId", "", "receiveAp", "todaySignIn", "time", "todaySignInState", "", "getSignInData", "Lcom/wakeup/common/network/wsh/SignConfiguration;", "module-ap_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApServiceImpl implements ApService {
    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.wakeup.commponent.api.ApService
    public List<ApTaskModule> getFirstTasks() {
        return TaskMgr.INSTANCE.getFirstTasks();
    }

    @Override // com.wakeup.commponent.api.ApService
    public List<ApTaskModule> getDailyTasks() {
        return TaskMgr.INSTANCE.getDailyTasks();
    }

    @Override // com.wakeup.commponent.api.ApService
    public void completeTask(int taskId) {
        TaskMgr.INSTANCE.completeTask(taskId);
    }

    @Override // com.wakeup.commponent.api.ApService
    public void receiveAp(int taskId) {
        TaskMgr.INSTANCE.receiveAp(taskId);
    }

    @Override // com.wakeup.commponent.api.ApService
    public void todaySignIn(int time) {
        SignInMgr.INSTANCE.signIn(time);
    }

    @Override // com.wakeup.commponent.api.ApService
    public boolean todaySignInState(int time) {
        return SignInMgr.INSTANCE.todaySignInState(time);
    }

    @Override // com.wakeup.commponent.api.ApService
    public List<SignConfiguration> getSignInData(int time) {
        return SignInMgr.INSTANCE.getSignInData(time);
    }
}
