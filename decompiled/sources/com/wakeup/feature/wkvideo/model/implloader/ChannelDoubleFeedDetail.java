package com.wakeup.feature.wkvideo.model.implloader;

import com.wakeup.feature.wkvideo.model.VideoLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChannelDoubleFeedDetail.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u0007H\u0094@¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u0007H\u0094@¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/wakeup/feature/wkvideo/model/implloader/ChannelDoubleFeedDetail;", "Lcom/wakeup/feature/wkvideo/model/VideoLoader;", "categoryId", "", "<init>", "(Ljava/lang/String;)V", "pullUpLoad", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMore", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChannelDoubleFeedDetail extends VideoLoader {
    private final String categoryId;

    public ChannelDoubleFeedDetail(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.categoryId = categoryId;
    }

    @Override // com.wakeup.feature.wkvideo.model.VideoLoader
    protected Object pullUpLoad(Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|(1:(1:(2:10|11)(2:13|14))(4:15|16|17|18))(9:33|34|35|36|37|38|39|(1:41)|26)|19|20|(1:22)|24|(1:26)(1:27)))|49|6|(0)(0)|19|20|(0)|24|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097 A[Catch: Exception -> 0x00a5, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a5, blocks: (B:20:0x008f, B:22:0x0097), top: B:19:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd A[PHI: r2
      0x00cd: PHI (r2v7 java.lang.Object) = (r2v5 java.lang.Object), (r2v8 java.lang.Object) binds: [B:40:0x008a, B:25:0x00cb] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.wakeup.feature.wkvideo.model.VideoLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object loadMore(kotlin.coroutines.Continuation<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.model.implloader.ChannelDoubleFeedDetail.loadMore(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
