package com.wakeup.feature.health.dashboard;

import androidx.lifecycle.MutableLiveData;
import com.wakeup.common.EventMgr;
import com.wakeup.common.SingleLiveEvent;
import com.wakeup.common.base.BaseViewModel;
import com.wakeup.common.burypoint.BuryPointPageId;
import com.wakeup.commponent.module.h5.api.HealthDashboardRepository;
import io.nats.client.support.ApiConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: HealthDashboardViewModel.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014J\u0006\u0010 \u001a\u00020\u001dJ\u0016\u0010!\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\"R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR)\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018RB\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n2\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006#"}, d2 = {"Lcom/wakeup/feature/health/dashboard/HealthDashboardViewModel;", "Lcom/wakeup/common/base/BaseViewModel;", "<init>", "()V", "snapshot", "Landroidx/lifecycle/MutableLiveData;", "Lcom/wakeup/commponent/module/h5/api/HealthDashboardRepository$Snapshot;", "getSnapshot", "()Landroidx/lifecycle/MutableLiveData;", BuryPointPageId.PAGE_ID_HISTORY, "", "", "", "", "getHistory", "initialRoute", "Lcom/wakeup/common/SingleLiveEvent;", "getInitialRoute", "()Lcom/wakeup/common/SingleLiveEvent;", ApiConstants.STARTED, "", "value", "latestSnapshot", "getLatestSnapshot", "()Lcom/wakeup/commponent/module/h5/api/HealthDashboardRepository$Snapshot;", "latestHistory", "getLatestHistory", "()Ljava/util/List;", "onCleared", "", "start", "emitRoute", "refresh", "publish", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthDashboardViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private boolean started;
    private final MutableLiveData<HealthDashboardRepository.Snapshot> snapshot = new MutableLiveData<>();
    private final MutableLiveData<List<Map<String, Object>>> history = new MutableLiveData<>();
    private final SingleLiveEvent<String> initialRoute = new SingleLiveEvent<>();
    private HealthDashboardRepository.Snapshot latestSnapshot = new HealthDashboardRepository.Snapshot(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, null, 262143, null);
    private List<? extends Map<String, ? extends Object>> latestHistory = CollectionsKt.emptyList();

    public HealthDashboardViewModel() {
        EventMgr.getCommonEvent().subscribe(this, new Function1() { // from class: com.wakeup.feature.health.dashboard.HealthDashboardViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$0;
                _init_$lambda$0 = HealthDashboardViewModel._init_$lambda$0(HealthDashboardViewModel.this, ((Integer) obj).intValue());
                return _init_$lambda$0;
            }
        });
    }

    public final MutableLiveData<HealthDashboardRepository.Snapshot> getSnapshot() {
        return this.snapshot;
    }

    public final MutableLiveData<List<Map<String, Object>>> getHistory() {
        return this.history;
    }

    public final SingleLiveEvent<String> getInitialRoute() {
        return this.initialRoute;
    }

    public final HealthDashboardRepository.Snapshot getLatestSnapshot() {
        return this.latestSnapshot;
    }

    public final List<Map<String, Object>> getLatestHistory() {
        return this.latestHistory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(HealthDashboardViewModel healthDashboardViewModel, int i) {
        if (i == 1) {
            healthDashboardViewModel.refresh();
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        EventMgr.getCommonEvent().unsubscribe(this);
        super.onCleared();
    }

    public final void start(boolean emitRoute) {
        if (this.started) {
            return;
        }
        this.started = true;
        launchIO(new HealthDashboardViewModel$start$1(this, emitRoute, null));
    }

    public final void refresh() {
        launchIO(new HealthDashboardViewModel$refresh$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r13, r5, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object publish(boolean r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.wakeup.feature.health.dashboard.HealthDashboardViewModel$publish$1
            if (r0 == 0) goto L14
            r0 = r14
            com.wakeup.feature.health.dashboard.HealthDashboardViewModel$publish$1 r0 = (com.wakeup.feature.health.dashboard.HealthDashboardViewModel$publish$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L19
        L14:
            com.wakeup.feature.health.dashboard.HealthDashboardViewModel$publish$1 r0 = new com.wakeup.feature.health.dashboard.HealthDashboardViewModel$publish$1
            r0.<init>(r12, r14)
        L19:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r14)
            goto L96
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            boolean r13 = r0.Z$0
            java.lang.Object r2 = r0.L$2
            com.wakeup.commponent.module.h5.api.HealthDashboardRepository r2 = (com.wakeup.commponent.module.h5.api.HealthDashboardRepository) r2
            java.lang.Object r4 = r0.L$1
            com.wakeup.commponent.module.h5.api.HealthDashboardRepository$SceneConfig r4 = (com.wakeup.commponent.module.h5.api.HealthDashboardRepository.SceneConfig) r4
            java.lang.Object r5 = r0.L$0
            com.wakeup.feature.health.dashboard.HealthDashboardViewModel r5 = (com.wakeup.feature.health.dashboard.HealthDashboardViewModel) r5
            kotlin.ResultKt.throwOnFailure(r14)
            r10 = r4
            r6 = r5
            goto L6a
        L49:
            kotlin.ResultKt.throwOnFailure(r14)
            com.wakeup.commponent.module.h5.api.HealthDashboardRepository r14 = com.wakeup.commponent.module.h5.api.HealthDashboardRepository.INSTANCE
            com.wakeup.commponent.module.h5.api.HealthDashboardRepository$SceneConfig r14 = r14.loadSceneConfig()
            com.wakeup.commponent.module.h5.api.HealthDashboardRepository r2 = com.wakeup.commponent.module.h5.api.HealthDashboardRepository.INSTANCE
            com.wakeup.commponent.module.h5.api.HealthDashboardRepository r5 = com.wakeup.commponent.module.h5.api.HealthDashboardRepository.INSTANCE
            r0.L$0 = r12
            r0.L$1 = r14
            r0.L$2 = r2
            r0.Z$0 = r13
            r0.label = r4
            java.lang.Object r4 = r5.loadHealthJson(r0)
            if (r4 != r1) goto L67
            goto L95
        L67:
            r6 = r12
            r10 = r14
            r14 = r4
        L6a:
            r9 = r13
            org.json.JSONObject r14 = (org.json.JSONObject) r14
            com.wakeup.commponent.module.h5.api.HealthDashboardRepository$Snapshot r7 = r2.toSnapshot(r14)
            com.wakeup.commponent.module.h5.api.HealthDashboardScoreService r13 = com.wakeup.commponent.module.h5.api.HealthDashboardScoreService.INSTANCE
            r14 = 7
            java.util.List r8 = r13.getScoreHistory(r14)
            kotlinx.coroutines.MainCoroutineDispatcher r13 = kotlinx.coroutines.Dispatchers.getMain()
            kotlin.coroutines.CoroutineContext r13 = (kotlin.coroutines.CoroutineContext) r13
            com.wakeup.feature.health.dashboard.HealthDashboardViewModel$publish$2 r5 = new com.wakeup.feature.health.dashboard.HealthDashboardViewModel$publish$2
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r14 = 0
            r0.L$0 = r14
            r0.L$1 = r14
            r0.L$2 = r14
            r0.label = r3
            java.lang.Object r13 = kotlinx.coroutines.BuildersKt.withContext(r13, r5, r0)
            if (r13 != r1) goto L96
        L95:
            return r1
        L96:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.health.dashboard.HealthDashboardViewModel.publish(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
