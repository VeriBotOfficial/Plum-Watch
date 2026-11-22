package com.wakeup.feature.user.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.wakeup.common.storage.UserDao;
import com.wakeup.common.utils.DateUtil;
import com.wakeup.feature.user.report.bean.HistoryReportBean;
import com.wakeup.feature.user.report.bean.ReportBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryReportViewModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/wakeup/feature/user/viewmodel/HistoryReportViewModel;", "Lcom/wakeup/feature/user/viewmodel/ReportHomeViewModel;", "<init>", "()V", "historyLiveDate", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/wakeup/feature/user/report/bean/ReportBean;", "getHistoryLiveDate", "()Landroidx/lifecycle/MutableLiveData;", "setHistoryLiveDate", "(Landroidx/lifecycle/MutableLiveData;)V", "exit", "", "getExit", "()Z", "setExit", "(Z)V", "initUserDateList", "", "type", "", "feature-user_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class HistoryReportViewModel extends ReportHomeViewModel {
    private boolean exit;
    private MutableLiveData<List<ReportBean>> historyLiveDate = new MutableLiveData<>();

    public final MutableLiveData<List<ReportBean>> getHistoryLiveDate() {
        return this.historyLiveDate;
    }

    public final void setHistoryLiveDate(MutableLiveData<List<ReportBean>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.historyLiveDate = mutableLiveData;
    }

    public final boolean getExit() {
        return this.exit;
    }

    public final void setExit(boolean z) {
        this.exit = z;
    }

    public final void initUserDateList(String type) {
        long j;
        long firstDayOfYear;
        long firstDayOfYear2;
        long endDayOfYear;
        long j2;
        long j3;
        Intrinsics.checkNotNullParameter(type, "type");
        long createTime = UserDao.getUser().getCreateTime();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Intrinsics.areEqual(type, "1")) {
            j = 1000;
            firstDayOfYear = DateUtil.getFirstDayOfWeekMonday(System.currentTimeMillis() / j);
        } else if (Intrinsics.areEqual(type, "2")) {
            j = 1000;
            firstDayOfYear = DateUtil.getFirstDayOfMonth(System.currentTimeMillis() / j);
        } else {
            j = 1000;
            firstDayOfYear = DateUtil.getFirstDayOfYear(System.currentTimeMillis() / j);
        }
        long j4 = firstDayOfYear - j;
        while (!this.exit) {
            if (Intrinsics.areEqual(type, "1")) {
                j3 = DateUtil.getFirstDayOfWeekMonday(j4);
                j2 = DateUtil.addDay(DateUtil.getDayEndTime(j3) * 1000, 6) / 1000;
            } else {
                if (Intrinsics.areEqual(type, "2")) {
                    firstDayOfYear2 = DateUtil.getFirstDayOfMonth(j4);
                    endDayOfYear = DateUtil.getEndDayOfMonth(j4);
                } else {
                    firstDayOfYear2 = DateUtil.getFirstDayOfYear(j4);
                    endDayOfYear = DateUtil.getEndDayOfYear(j4);
                }
                long j5 = firstDayOfYear2;
                j2 = endDayOfYear;
                j3 = j5;
            }
            arrayList.add(new HistoryReportBean(j3, j2));
            long j6 = j3 - 1000;
            arrayList2.add(new ReportBean(j3, arrayList));
            if (arrayList2.size() >= 12 || ((int) createTime) > ((int) j6)) {
                this.exit = true;
            }
            j4 = j6;
        }
        this.historyLiveDate.postValue(arrayList2);
    }
}
