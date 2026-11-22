package com.hispark.clouddiag.manager;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.e;
import io.livekit.android.room.SignalClient;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: MqttPublishPriorityQueue.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0086@¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\fJ\n\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001cH\u0002J$\u0010\u001d\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/hispark/clouddiag/manager/MqttPublishPriorityQueue;", "", "<init>", "()V", "lock", "critical", "Ljava/util/ArrayDeque;", "Lcom/hispark/clouddiag/manager/QueuedMqttPublish;", "fileProgress", "debugLog", e.t, "Lkotlinx/coroutines/channels/Channel;", "", "closed", "", SignalClient.SD_TYPE_OFFER, "request", "take", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "pollLocked", "queueFor", "priority", "Lcom/hispark/clouddiag/manager/MqttPublishPriority;", "removeProgressLocked", "progressKey", "", "removed", "", "drainTo", FirebaseAnalytics.Param.DESTINATION, "source", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MqttPublishPriorityQueue {
    private boolean closed;
    private final Object lock = new Object();
    private final ArrayDeque<QueuedMqttPublish> critical = new ArrayDeque<>();
    private final ArrayDeque<QueuedMqttPublish> fileProgress = new ArrayDeque<>();
    private final ArrayDeque<QueuedMqttPublish> debugLog = new ArrayDeque<>();
    private final Channel<Unit> signal = ChannelKt.Channel$default(-1, null, null, 6, null);

    /* compiled from: MqttPublishPriorityQueue.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MqttPublishPriority.values().length];
            try {
                iArr[MqttPublishPriority.CRITICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MqttPublishPriority.FILE_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MqttPublishPriority.DEBUG_LOG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final boolean offer(QueuedMqttPublish request) {
        boolean m15577isSuccessimpl;
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = new ArrayList();
        synchronized (this.lock) {
            if (this.closed) {
                m15577isSuccessimpl = false;
            } else {
                if (request.getPriority() == MqttPublishPriority.FILE_PROGRESS && request.getProgressKey() != null) {
                    removeProgressLocked(request.getProgressKey(), arrayList);
                }
                String supersedesProgressKey = request.getSupersedesProgressKey();
                if (supersedesProgressKey != null) {
                    removeProgressLocked(supersedesProgressKey, arrayList);
                }
                queueFor(request.getPriority()).addLast(request);
                m15577isSuccessimpl = ChannelResult.m15577isSuccessimpl(this.signal.mo6833trySendJP2dKIU(Unit.INSTANCE));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CompletableDeferred<Boolean> completion = ((QueuedMqttPublish) it.next()).getCompletion();
            if (completion != null) {
                completion.complete(false);
            }
        }
        return m15577isSuccessimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x005f -> B:10:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object take(kotlin.coroutines.Continuation<? super com.hispark.clouddiag.manager.QueuedMqttPublish> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.hispark.clouddiag.manager.MqttPublishPriorityQueue$take$1
            if (r0 == 0) goto L14
            r0 = r7
            com.hispark.clouddiag.manager.MqttPublishPriorityQueue$take$1 r0 = (com.hispark.clouddiag.manager.MqttPublishPriorityQueue$take$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.hispark.clouddiag.manager.MqttPublishPriorityQueue$take$1 r0 = new com.hispark.clouddiag.manager.MqttPublishPriorityQueue$take$1
            r0.<init>(r6, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r2 = r0.L$0
            com.hispark.clouddiag.manager.MqttPublishPriorityQueue r2 = (com.hispark.clouddiag.manager.MqttPublishPriorityQueue) r2
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.channels.ChannelResult r7 = (kotlinx.coroutines.channels.ChannelResult) r7
            java.lang.Object r7 = r7.getHolder()
            goto L62
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3d:
            kotlin.ResultKt.throwOnFailure(r7)
            r2 = r6
        L41:
            java.lang.Object r7 = r2.lock
            monitor-enter(r7)
            com.hispark.clouddiag.manager.QueuedMqttPublish r5 = r2.pollLocked()     // Catch: java.lang.Throwable -> L69
            if (r5 == 0) goto L4c
            monitor-exit(r7)
            return r5
        L4c:
            boolean r5 = r2.closed     // Catch: java.lang.Throwable -> L69
            if (r5 == 0) goto L52
            monitor-exit(r7)
            return r3
        L52:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L69
            monitor-exit(r7)
            kotlinx.coroutines.channels.Channel<kotlin.Unit> r7 = r2.signal
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.mo15560receiveCatchingJP2dKIU(r0)
            if (r7 != r1) goto L62
            return r1
        L62:
            java.lang.Object r7 = kotlinx.coroutines.channels.ChannelResult.m15572getOrNullimpl(r7)
            if (r7 != 0) goto L41
            return r3
        L69:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hispark.clouddiag.manager.MqttPublishPriorityQueue.take(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void close() {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            List<QueuedMqttPublish> createListBuilder = CollectionsKt.createListBuilder();
            drainTo(createListBuilder, this.critical);
            drainTo(createListBuilder, this.fileProgress);
            drainTo(createListBuilder, this.debugLog);
            List build = CollectionsKt.build(createListBuilder);
            SendChannel.DefaultImpls.close$default(this.signal, null, 1, null);
            Iterator it = build.iterator();
            while (it.hasNext()) {
                CompletableDeferred<Boolean> completion = ((QueuedMqttPublish) it.next()).getCompletion();
                if (completion != null) {
                    completion.complete(false);
                }
            }
        }
    }

    private final QueuedMqttPublish pollLocked() {
        QueuedMqttPublish pollFirst;
        CompletableDeferred<Boolean> completion;
        do {
            pollFirst = this.critical.pollFirst();
            if (pollFirst != null || (pollFirst = this.fileProgress.pollFirst()) != null || (pollFirst = this.debugLog.pollFirst()) != null) {
                completion = pollFirst.getCompletion();
                if (completion == null) {
                    break;
                }
            } else {
                return null;
            }
        } while (completion.isCancelled());
        return pollFirst;
    }

    private final ArrayDeque<QueuedMqttPublish> queueFor(MqttPublishPriority priority) {
        int i = WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i == 1) {
            return this.critical;
        }
        if (i == 2) {
            return this.fileProgress;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return this.debugLog;
    }

    private final void removeProgressLocked(String progressKey, List<QueuedMqttPublish> removed) {
        Iterator<QueuedMqttPublish> it = this.fileProgress.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            QueuedMqttPublish next = it.next();
            if (Intrinsics.areEqual(next.getProgressKey(), progressKey)) {
                it.remove();
                Intrinsics.checkNotNull(next);
                removed.add(next);
            }
        }
    }

    private final void drainTo(List<QueuedMqttPublish> destination, ArrayDeque<QueuedMqttPublish> source) {
        while (!source.isEmpty()) {
            QueuedMqttPublish removeFirst = source.removeFirst();
            Intrinsics.checkNotNullExpressionValue(removeFirst, "removeFirst(...)");
            destination.add(removeFirst);
        }
    }
}
