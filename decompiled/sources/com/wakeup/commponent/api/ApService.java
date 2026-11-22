package com.wakeup.commponent.api;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.wakeup.common.network.wsh.SignConfiguration;
import com.wakeup.commponent.module.ap.ApTaskModule;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApService.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\tH&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0006\u0010\f\u001a\u00020\tH&¨\u0006\u0011"}, d2 = {"Lcom/wakeup/commponent/api/ApService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "getFirstTasks", "", "Lcom/wakeup/commponent/module/ap/ApTaskModule;", "getDailyTasks", "completeTask", "", "taskId", "", "receiveAp", "todaySignIn", "time", "todaySignInState", "", "getSignInData", "Lcom/wakeup/common/network/wsh/SignConfiguration;", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ApService extends IProvider {
    void completeTask(int taskId);

    List<ApTaskModule> getDailyTasks();

    List<ApTaskModule> getFirstTasks();

    List<SignConfiguration> getSignInData(int time);

    void receiveAp(int taskId);

    void todaySignIn(int time);

    boolean todaySignInState(int time);
}
