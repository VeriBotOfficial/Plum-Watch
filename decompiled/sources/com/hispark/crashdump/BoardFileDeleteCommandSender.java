package com.hispark.crashdump;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: BoardFileDeleteCommandSender.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0014JV\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0082@¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/hispark/crashdump/BoardFileDeleteCommandSender;", "", "<init>", "()V", "sendDelete", "", "byteTransport", "Lcom/hispark/crashdump/BoardByteTransport;", "deviceId", "", "remotePath", "isDirectory", "linkType", "Lcom/hispark/crashdump/BoardLinkType;", "ackTimeoutMs", "", "maxAttempts", "", "retryDelayMs", "logTag", "(Lcom/hispark/crashdump/BoardByteTransport;Ljava/lang/String;Ljava/lang/String;ZLcom/hispark/crashdump/BoardLinkType;JIJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendDeleteAttempt", "normalizedPath", "attemptNo", "(Lcom/hispark/crashdump/BoardByteTransport;Ljava/lang/String;Ljava/lang/String;ZLcom/hispark/crashdump/BoardLinkType;JIILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BoardFileDeleteCommandSender {
    public static final BoardFileDeleteCommandSender INSTANCE = new BoardFileDeleteCommandSender();

    private BoardFileDeleteCommandSender() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0150, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r0, r2) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0129 -> B:11:0x015a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0150 -> B:12:0x0153). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendDelete(com.hispark.crashdump.BoardByteTransport r32, java.lang.String r33, java.lang.String r34, boolean r35, com.hispark.crashdump.BoardLinkType r36, long r37, int r39, long r40, java.lang.String r42, kotlin.coroutines.Continuation<? super java.lang.Boolean> r43) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hispark.crashdump.BoardFileDeleteCommandSender.sendDelete(com.hispark.crashdump.BoardByteTransport, java.lang.String, java.lang.String, boolean, com.hispark.crashdump.BoardLinkType, long, int, long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendDeleteAttempt(BoardByteTransport boardByteTransport, String str, String str2, boolean z, BoardLinkType boardLinkType, long j, int i, int i2, String str3, Continuation<? super Boolean> continuation) {
        return CoroutineScopeKt.coroutineScope(new BoardFileDeleteCommandSender$sendDeleteAttempt$2(boardByteTransport, str, str3, str2, i, i2, z, boardLinkType, j, null), continuation);
    }
}
