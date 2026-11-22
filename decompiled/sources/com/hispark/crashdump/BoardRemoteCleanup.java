package com.hispark.crashdump;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/hispark/crashdump/BoardRemoteCleanup;", "", "deleteFile", "", "deviceId", "", "remotePath", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDirectory", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BoardRemoteCleanup {
    Object deleteDirectory(String str, String str2, Continuation<? super Boolean> continuation);

    Object deleteFile(String str, String str2, Continuation<? super Boolean> continuation);
}
