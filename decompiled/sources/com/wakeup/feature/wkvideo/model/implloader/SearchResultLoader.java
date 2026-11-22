package com.wakeup.feature.wkvideo.model.implloader;

import com.wakeup.feature.wkvideo.model.VideoLoader;
import com.wakeup.feature.wkvideo.search.repo.RemoteSearchDataSource;
import com.wakeup.feature.wkvideo.search.repo.SearchRepo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SearchResultLoader.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u000e\u0010\u0012\u001a\u00020\u000eH\u0094@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u000eH\u0094@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/wakeup/feature/wkvideo/model/implloader/SearchResultLoader;", "Lcom/wakeup/feature/wkvideo/model/VideoLoader;", "<init>", "()V", "page", "", "pageSize", "end", "", "tag", "", "searchRepo", "Lcom/wakeup/feature/wkvideo/search/repo/SearchRepo;", "setArgs", "", "args", "", "", "pullUpLoad", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMore", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchResultLoader extends VideoLoader {
    private boolean end;
    private int page = 1;
    private int pageSize = 50;
    private String tag = "";
    private SearchRepo searchRepo = new SearchRepo(new RemoteSearchDataSource());

    @Override // com.wakeup.feature.wkvideo.model.VideoLoader
    public void setArgs(Map<String, ? extends Object> args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Object obj = args.get("page");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        this.page = num != null ? num.intValue() : 1;
        Object obj2 = args.get("maxPage");
        Integer num2 = obj2 instanceof Integer ? (Integer) obj2 : null;
        this.pageSize = num2 != null ? num2.intValue() : 30;
        Object obj3 = args.get("tag");
        String str = obj3 instanceof String ? (String) obj3 : null;
        if (str == null) {
            str = "";
        }
        this.tag = str;
        this.searchRepo.setCurTag(str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        r6.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.wakeup.feature.wkvideo.model.VideoLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object pullUpLoad(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.wakeup.feature.wkvideo.model.implloader.SearchResultLoader$pullUpLoad$1
            if (r0 == 0) goto L14
            r0 = r6
            com.wakeup.feature.wkvideo.model.implloader.SearchResultLoader$pullUpLoad$1 r0 = (com.wakeup.feature.wkvideo.model.implloader.SearchResultLoader$pullUpLoad$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            com.wakeup.feature.wkvideo.model.implloader.SearchResultLoader$pullUpLoad$1 r0 = new com.wakeup.feature.wkvideo.model.implloader.SearchResultLoader$pullUpLoad$1
            r0.<init>(r5, r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L2a
            goto L4e
        L2a:
            r6 = move-exception
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.MainCoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getMain()     // Catch: java.lang.Exception -> L2a
            kotlin.coroutines.CoroutineContext r6 = (kotlin.coroutines.CoroutineContext) r6     // Catch: java.lang.Exception -> L2a
            com.wakeup.feature.wkvideo.model.implloader.SearchResultLoader$pullUpLoad$2 r2 = new com.wakeup.feature.wkvideo.model.implloader.SearchResultLoader$pullUpLoad$2     // Catch: java.lang.Exception -> L2a
            r4 = 0
            r2.<init>(r5, r4)     // Catch: java.lang.Exception -> L2a
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2     // Catch: java.lang.Exception -> L2a
            r0.label = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)     // Catch: java.lang.Exception -> L2a
            if (r6 != r1) goto L4e
            return r1
        L4e:
            kotlin.Unit r6 = (kotlin.Unit) r6     // Catch: java.lang.Exception -> L2a
            goto L54
        L51:
            r6.printStackTrace()
        L54:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.model.implloader.SearchResultLoader.pullUpLoad(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.wakeup.feature.wkvideo.model.VideoLoader
    protected Object loadMore(Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new SearchResultLoader$loadMore$2(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
