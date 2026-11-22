package com.wakeup.howear.view.home.connectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import com.anythink.expressad.foundation.g.g.a.b;
import com.wakeup.common.log.LogUtils;
import io.nats.client.support.ApiConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: DeviceContainerConnectivityMonitor.kt */
@Metadata(d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u001e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020!J\u000e\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'J\u0010\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\u0016H\u0002J\u0018\u0010*\u001a\u00020!2\u0006\u0010)\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u0018H\u0002J\u0010\u0010,\u001a\u00020!2\u0006\u0010)\u001a\u00020\u0016H\u0002J\"\u0010-\u001a\u00020!2\b\u0010)\u001a\u0004\u0018\u00010\u00162\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020!H\u0002J\b\u00102\u001a\u00020!H\u0002J\b\u00103\u001a\u00020!H\u0002J\u0018\u00104\u001a\u00020!2\u0006\u00105\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f¨\u00066"}, d2 = {"Lcom/wakeup/howear/view/home/connectivity/DeviceContainerConnectivityMonitor;", "", "<init>", "()V", "TAG", "", "OFFLINE_DEBOUNCE_MS", "", ApiConstants.STARTED, "Ljava/util/concurrent/atomic/AtomicBoolean;", "mainHandler", "Landroid/os/Handler;", "mutableState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/wakeup/howear/view/home/connectivity/DeviceContainerNetworkState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "connectivityManager", "Landroid/net/ConnectivityManager;", "defaultNetwork", "Landroid/net/Network;", "defaultCapabilities", "Landroid/net/NetworkCapabilities;", "offlineConfirmationGate", "Lcom/wakeup/howear/view/home/connectivity/OfflineConfirmationGate;", "evaluateOfflineRunnable", "Ljava/lang/Runnable;", "callback", "com/wakeup/howear/view/home/connectivity/DeviceContainerConnectivityMonitor$callback$1", "Lcom/wakeup/howear/view/home/connectivity/DeviceContainerConnectivityMonitor$callback$1;", "start", "", "context", "Landroid/content/Context;", "reportRequestSuccess", "reportRequestFailure", "error", "", "handleNetworkAvailable", "network", "handleCapabilitiesChanged", "capabilities", "handleNetworkLost", "ensureOfflineConfirmation", "source", "forceUnknown", "", "cancelOfflineConfirmation", "evaluateTrackedNetwork", "evaluateSuspectedFailure", "updateState", "nextState", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceContainerConnectivityMonitor {
    private static final long OFFLINE_DEBOUNCE_MS = 500;
    private static final String TAG = "DeviceNetworkMonitor";
    private static final DeviceContainerConnectivityMonitor$callback$1 callback;
    private static ConnectivityManager connectivityManager;
    private static NetworkCapabilities defaultCapabilities;
    private static Network defaultNetwork;
    private static final Runnable evaluateOfflineRunnable;
    private static final MutableStateFlow<DeviceContainerNetworkState> mutableState;
    private static final OfflineConfirmationGate<Network> offlineConfirmationGate;
    private static final StateFlow<DeviceContainerNetworkState> state;
    public static final DeviceContainerConnectivityMonitor INSTANCE = new DeviceContainerConnectivityMonitor();
    private static final AtomicBoolean started = new AtomicBoolean(false);
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());

    /* compiled from: DeviceContainerConnectivityMonitor.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkFailureConfidence.values().length];
            try {
                iArr[NetworkFailureConfidence.CONFIRMED_OFFLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkFailureConfidence.SUSPECTED_OFFLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkFailureConfidence.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DeviceContainerConnectivityMonitor() {
    }

    static {
        MutableStateFlow<DeviceContainerNetworkState> MutableStateFlow = StateFlowKt.MutableStateFlow(DeviceContainerNetworkState.UNKNOWN);
        mutableState = MutableStateFlow;
        state = FlowKt.asStateFlow(MutableStateFlow);
        offlineConfirmationGate = new OfflineConfirmationGate<>();
        evaluateOfflineRunnable = new Runnable() { // from class: com.wakeup.howear.view.home.connectivity.DeviceContainerConnectivityMonitor$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                DeviceContainerConnectivityMonitor.evaluateOfflineRunnable$lambda$0();
            }
        };
        callback = new DeviceContainerConnectivityMonitor$callback$1();
    }

    public final StateFlow<DeviceContainerNetworkState> getState() {
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void evaluateOfflineRunnable$lambda$0() {
        offlineConfirmationGate.clear();
        INSTANCE.evaluateTrackedNetwork();
    }

    public final void start(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (started.compareAndSet(false, true)) {
            Object systemService = context.getApplicationContext().getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager2 = (ConnectivityManager) systemService;
            connectivityManager = connectivityManager2;
            if (connectivityManager2 == null) {
                try {
                    Intrinsics.throwUninitializedPropertyAccessException("connectivityManager");
                    connectivityManager2 = null;
                } catch (RuntimeException e) {
                    started.set(false);
                    LogUtils.w(TAG, "register callback failed: " + e.getClass().getSimpleName());
                    return;
                }
            }
            connectivityManager2.registerDefaultNetworkCallback(callback);
            ensureOfflineConfirmation(null, "monitor_started", true);
        }
    }

    public final void reportRequestSuccess() {
        mainHandler.post(new Runnable() { // from class: com.wakeup.howear.view.home.connectivity.DeviceContainerConnectivityMonitor$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                DeviceContainerConnectivityMonitor.reportRequestSuccess$lambda$1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportRequestSuccess$lambda$1() {
        NetworkCapabilities networkCapabilities;
        if (defaultNetwork != null && (networkCapabilities = defaultCapabilities) != null && networkCapabilities.hasCapability(12)) {
            DeviceContainerConnectivityMonitor deviceContainerConnectivityMonitor = INSTANCE;
            deviceContainerConnectivityMonitor.cancelOfflineConfirmation();
            deviceContainerConnectivityMonitor.updateState(DeviceContainerNetworkState.ONLINE, "request_success");
            return;
        }
        INSTANCE.ensureOfflineConfirmation(defaultNetwork, "request_success_without_active_network", true);
    }

    public final void reportRequestFailure(final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        mainHandler.post(new Runnable() { // from class: com.wakeup.howear.view.home.connectivity.DeviceContainerConnectivityMonitor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                DeviceContainerConnectivityMonitor.reportRequestFailure$lambda$2(error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportRequestFailure$lambda$2(Throwable th) {
        int i = WhenMappings.$EnumSwitchMapping$0[DeviceContainerConnectivityPolicy.INSTANCE.classifyFailure(th).ordinal()];
        if (i == 1) {
            DeviceContainerConnectivityMonitor deviceContainerConnectivityMonitor = INSTANCE;
            deviceContainerConnectivityMonitor.cancelOfflineConfirmation();
            deviceContainerConnectivityMonitor.updateState(DeviceContainerNetworkState.CONFIRMED_OFFLINE, "request_failure");
        } else if (i == 2) {
            INSTANCE.evaluateSuspectedFailure();
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleNetworkAvailable(Network network) {
        boolean areEqual = Intrinsics.areEqual(defaultNetwork, network);
        boolean z = !areEqual;
        if (!areEqual) {
            defaultNetwork = network;
            defaultCapabilities = null;
        }
        if (mutableState.getValue() == DeviceContainerNetworkState.CONFIRMED_OFFLINE && areEqual) {
            return;
        }
        ensureOfflineConfirmation(network, b.ae, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        boolean areEqual = Intrinsics.areEqual(defaultNetwork, network);
        boolean z = !areEqual;
        if (!areEqual) {
            defaultNetwork = network;
        }
        defaultCapabilities = capabilities;
        if (capabilities.hasCapability(16)) {
            cancelOfflineConfirmation();
            updateState(DeviceContainerNetworkState.ONLINE, "system_validated");
        } else {
            if (mutableState.getValue() == DeviceContainerNetworkState.CONFIRMED_OFFLINE && areEqual) {
                return;
            }
            ensureOfflineConfirmation(network, "system_unvalidated", z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleNetworkLost(Network network) {
        if (Intrinsics.areEqual(defaultNetwork, network)) {
            defaultNetwork = null;
            defaultCapabilities = null;
            if (mutableState.getValue() == DeviceContainerNetworkState.CONFIRMED_OFFLINE) {
                return;
            }
            ensureOfflineConfirmation(null, "network_lost", true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureOfflineConfirmation(Network network, String source, boolean forceUnknown) {
        if (forceUnknown || mutableState.getValue() != DeviceContainerNetworkState.UNKNOWN) {
            updateState(DeviceContainerNetworkState.UNKNOWN, source);
        }
        if (offlineConfirmationGate.begin(network)) {
            Handler handler = mainHandler;
            Runnable runnable = evaluateOfflineRunnable;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 500L);
        }
    }

    private final void cancelOfflineConfirmation() {
        mainHandler.removeCallbacks(evaluateOfflineRunnable);
        offlineConfirmationGate.clear();
    }

    private final void evaluateTrackedNetwork() {
        DeviceContainerConnectivityPolicy deviceContainerConnectivityPolicy = DeviceContainerConnectivityPolicy.INSTANCE;
        boolean z = defaultNetwork != null;
        NetworkCapabilities networkCapabilities = defaultCapabilities;
        boolean z2 = networkCapabilities != null && networkCapabilities.hasCapability(12);
        NetworkCapabilities networkCapabilities2 = defaultCapabilities;
        updateState(deviceContainerConnectivityPolicy.resolveStableSystemState(z, z2, networkCapabilities2 != null && networkCapabilities2.hasCapability(16)), "system");
    }

    private final void evaluateSuspectedFailure() {
        NetworkCapabilities networkCapabilities = defaultCapabilities;
        if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
            updateState(DeviceContainerNetworkState.ONLINE, "suspected_failure_system_validated");
        } else {
            if (mutableState.getValue() == DeviceContainerNetworkState.CONFIRMED_OFFLINE) {
                return;
            }
            ensureOfflineConfirmation(defaultNetwork, "suspected_failure", false);
        }
    }

    private final void updateState(DeviceContainerNetworkState nextState, String source) {
        MutableStateFlow<DeviceContainerNetworkState> mutableStateFlow = mutableState;
        DeviceContainerNetworkState value = mutableStateFlow.getValue();
        if (value == nextState) {
            return;
        }
        mutableStateFlow.setValue(nextState);
        LogUtils.i(TAG, "state " + value.name() + " -> " + nextState.name() + ", source=" + source);
    }
}
