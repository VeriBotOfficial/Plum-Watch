package com.wakeup.feature.aimusic.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RemoteAsmrRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.feature.aimusic.data.RemoteAsmrRepository", f = "RemoteAsmrRepository.kt", i = {}, l = {35}, m = "getPlaylists", n = {}, s = {})
/* loaded from: classes2.dex */
final class RemoteAsmrRepository$getPlaylists$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteAsmrRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteAsmrRepository$getPlaylists$1(RemoteAsmrRepository remoteAsmrRepository, Continuation<? super RemoteAsmrRepository$getPlaylists$1> continuation) {
        super(continuation);
        this.this$0 = remoteAsmrRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getPlaylists(this);
    }
}
