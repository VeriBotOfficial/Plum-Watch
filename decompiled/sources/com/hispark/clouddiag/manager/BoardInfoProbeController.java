package com.hispark.clouddiag.manager;

import android.javax.sip.header.ContentDispositionHeader;
import com.hispark.clouddiag.protocol.MuxFrameProtocol;
import com.hispark.crashdump.BoardLinkType;
import com.hispark.crashdump.protocol.ProtocolBytes;
import com.tencent.connect.common.Constants;
import com.umeng.analytics.pro.d;
import com.yandex.div.core.timer.TimerController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* compiled from: BoardInfoProbeController.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u0000 *2\u00020\u0001:\u0002)*B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00126\u0010\b\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\t¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0018\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0010J\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\nJ\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nJ\u0006\u0010!\u001a\u00020\u001eJ\u0015\u0010\"\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0002\b#J\u0016\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010&J \u0010'\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R>\u0010\b\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/hispark/clouddiag/manager/BoardInfoProbeController;", "", Constants.PARAM_SCOPE, "Lkotlinx/coroutines/CoroutineScope;", "retryIntervalMs", "", "maxAttempts", "", "sendProbe", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "deviceId", "", "data", "", "<init>", "(Lkotlinx/coroutines/CoroutineScope;JILkotlin/jvm/functions/Function2;)V", "lock", "dispatchLock", d.n, "", "Lcom/hispark/clouddiag/manager/BoardInfoProbeController$Session;", "start", "linkType", "Lcom/hispark/crashdump/BoardLinkType;", "classicMuxKnown", TimerController.STOP_COMMAND, "rename", "", "oldDeviceId", "newDeviceId", "stopAll", "hasActiveProbe", "hasActiveProbe$cloud_sdk_release", "runSession", "session", "(Lcom/hispark/clouddiag/manager/BoardInfoProbeController$Session;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestFor", "attempt", ContentDispositionHeader.SESSION, "Companion", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BoardInfoProbeController {
    public static final int DEFAULT_MAX_ATTEMPTS = 6;
    public static final long DEFAULT_RETRY_INTERVAL_MS = 2000;
    public static final int RAW_BT_ATTEMPTS = 2;
    private final Object dispatchLock;
    private final Object lock;
    private final int maxAttempts;
    private final long retryIntervalMs;
    private final CoroutineScope scope;
    private final Function2<String, byte[], Boolean> sendProbe;
    private final Map<String, Session> sessions;
    private static final byte[] BOARD_INFO_REQUEST = {ProtocolBytes.SOF, 0, 2, 0, 5, -64};

    /* JADX WARN: Multi-variable type inference failed */
    public BoardInfoProbeController(CoroutineScope scope, long j, int i, Function2<? super String, ? super byte[], Boolean> sendProbe) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(sendProbe, "sendProbe");
        this.scope = scope;
        this.retryIntervalMs = j;
        this.maxAttempts = i;
        this.sendProbe = sendProbe;
        this.lock = new Object();
        this.dispatchLock = new Object();
        this.sessions = new LinkedHashMap();
        if (j < 0) {
            throw new IllegalArgumentException("retryIntervalMs must not be negative".toString());
        }
        if (i <= 0) {
            throw new IllegalArgumentException("maxAttempts must be positive".toString());
        }
    }

    public /* synthetic */ BoardInfoProbeController(CoroutineScope coroutineScope, long j, int i, Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, (i2 & 2) != 0 ? 2000L : j, (i2 & 4) != 0 ? 6 : i, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BoardInfoProbeController.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/hispark/clouddiag/manager/BoardInfoProbeController$Session;", "", "deviceId", "", "linkType", "Lcom/hispark/crashdump/BoardLinkType;", "classicMuxKnown", "", "<init>", "(Ljava/lang/String;Lcom/hispark/crashdump/BoardLinkType;Z)V", "getDeviceId", "()Ljava/lang/String;", "setDeviceId", "(Ljava/lang/String;)V", "getLinkType", "()Lcom/hispark/crashdump/BoardLinkType;", "getClassicMuxKnown", "()Z", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Session {
        private final boolean classicMuxKnown;
        private String deviceId;
        public Job job;
        private final BoardLinkType linkType;

        public Session(String deviceId, BoardLinkType linkType, boolean z) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(linkType, "linkType");
            this.deviceId = deviceId;
            this.linkType = linkType;
            this.classicMuxKnown = z;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final void setDeviceId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.deviceId = str;
        }

        public final BoardLinkType getLinkType() {
            return this.linkType;
        }

        public final boolean getClassicMuxKnown() {
            return this.classicMuxKnown;
        }

        public final Job getJob() {
            Job job = this.job;
            if (job != null) {
                return job;
            }
            Intrinsics.throwUninitializedPropertyAccessException("job");
            return null;
        }

        public final void setJob(Job job) {
            Intrinsics.checkNotNullParameter(job, "<set-?>");
            this.job = job;
        }
    }

    public static /* synthetic */ boolean start$default(BoardInfoProbeController boardInfoProbeController, String str, BoardLinkType boardLinkType, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return boardInfoProbeController.start(str, boardLinkType, z);
    }

    public final boolean start(String deviceId, BoardLinkType linkType, boolean classicMuxKnown) {
        Job launch$default;
        Job job;
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        if (StringsKt.isBlank(deviceId)) {
            throw new IllegalArgumentException("deviceId must not be blank".toString());
        }
        synchronized (this.dispatchLock) {
            synchronized (this.lock) {
                Session session = this.sessions.get(deviceId);
                if (session != null && (job = session.getJob()) != null && job.isActive()) {
                    return true;
                }
                if (session != null) {
                    this.sessions.remove(deviceId);
                }
                Session session2 = new Session(deviceId, linkType, classicMuxKnown);
                launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, CoroutineStart.LAZY, new BoardInfoProbeController$start$session$1$1$1$1(this, session2, null), 1, null);
                session2.setJob(launch$default);
                this.sessions.put(deviceId, session2);
                session2.getJob().start();
                return true;
            }
        }
    }

    public final boolean stop(String deviceId) {
        Session remove;
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        synchronized (this.dispatchLock) {
            synchronized (this.lock) {
                remove = this.sessions.remove(deviceId);
            }
        }
        if (remove == null) {
            return false;
        }
        Job.DefaultImpls.cancel$default(remove.getJob(), (CancellationException) null, 1, (Object) null);
        return true;
    }

    public final void rename(String oldDeviceId, String newDeviceId) {
        Intrinsics.checkNotNullParameter(oldDeviceId, "oldDeviceId");
        Intrinsics.checkNotNullParameter(newDeviceId, "newDeviceId");
        if (Intrinsics.areEqual(oldDeviceId, newDeviceId)) {
            return;
        }
        synchronized (this.dispatchLock) {
            synchronized (this.lock) {
                Session remove = this.sessions.remove(oldDeviceId);
                if (remove == null) {
                    return;
                }
                Session session = this.sessions.get(newDeviceId);
                if (session != null && session != remove) {
                    Job.DefaultImpls.cancel$default(remove.getJob(), (CancellationException) null, 1, (Object) null);
                    return;
                }
                remove.setDeviceId(newDeviceId);
                this.sessions.put(newDeviceId, remove);
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public final void stopAll() {
        ArrayList arrayList;
        synchronized (this.dispatchLock) {
            synchronized (this.lock) {
                Collection<Session> values = this.sessions.values();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(values, 10));
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Session) it.next()).getJob());
                }
                arrayList = arrayList2;
                this.sessions.clear();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Job.DefaultImpls.cancel$default((Job) it2.next(), (CancellationException) null, 1, (Object) null);
        }
    }

    public final boolean hasActiveProbe$cloud_sdk_release(String deviceId) {
        boolean z;
        Job job;
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        synchronized (this.lock) {
            Session session = this.sessions.get(deviceId);
            z = false;
            if (session != null && (job = session.getJob()) != null) {
                if (job.isActive()) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00a9 -> B:13:0x00c2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00be -> B:12:0x00c0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runSession(com.hispark.clouddiag.manager.BoardInfoProbeController.Session r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hispark.clouddiag.manager.BoardInfoProbeController.runSession(com.hispark.clouddiag.manager.BoardInfoProbeController$Session, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final byte[] requestFor(BoardLinkType linkType, boolean classicMuxKnown, int attempt) {
        if (linkType == BoardLinkType.BLE || classicMuxKnown || attempt > 2) {
            return MuxFrameProtocol.encode$default(MuxFrameProtocol.INSTANCE, MuxFrameProtocol.Port.HSO_LOG, BOARD_INFO_REQUEST, 0, 0, 0, 28, (Object) null);
        }
        byte[] bArr = BOARD_INFO_REQUEST;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }
}
