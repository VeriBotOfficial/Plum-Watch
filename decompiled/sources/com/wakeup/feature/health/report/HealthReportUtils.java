package com.wakeup.feature.health.report;

import com.wakeup.common.base.BaseCallback;
import com.wakeup.common.network.entity.BasicRequest;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* compiled from: HealthReportUtils.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u0005j\b\u0012\u0004\u0012\u00020\f`\u00070\u000bJ&\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0005j\b\u0012\u0004\u0012\u00020\f`\u00072\u0006\u0010\u000e\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010\u000fR\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/wakeup/feature/health/report/HealthReportUtils;", "", "<init>", "()V", "healthReportMap", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "queryData", "", "callBack", "Lcom/wakeup/common/base/BaseCallback;", "Lcom/wakeup/common/network/entity/BasicRequest$HealthCheckTime;", "initData", "dataType", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthReportUtils {
    public static final HealthReportUtils INSTANCE = new HealthReportUtils();
    private static final ArrayList<Integer> healthReportMap = CollectionsKt.arrayListOf(10005, 10001, 10002, 10003, 10004, 10009, 10007, 10006, 10011, 10010, 10008);
    public static final int $stable = 8;

    private HealthReportUtils() {
    }

    public final void queryData(BaseCallback<ArrayList<BasicRequest.HealthCheckTime>> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new HealthReportUtils$queryData$1(callBack, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object initData(int r25, kotlin.coroutines.Continuation<? super java.util.ArrayList<com.wakeup.common.network.entity.BasicRequest.HealthCheckTime>> r26) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.health.report.HealthReportUtils.initData(int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
