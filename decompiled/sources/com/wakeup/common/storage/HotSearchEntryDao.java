package com.wakeup.common.storage;

import com.google.gson.Gson;
import com.wakeup.common.network.entity.search.HotSearchInfoBean;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HotSearchEntryDao.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0086@¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0086@¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0086@¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0017\u001a\u00020\u0018J\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0082@¢\u0006\u0002\u0010\u0012J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0082@¢\u0006\u0002\u0010\u0012J\u0018\u0010\u001d\u001a\u00020\u001e2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/wakeup/common/storage/HotSearchEntryDao;", "", "<init>", "()V", "CACHE_KEY", "", "TAG", "HOT_SEARCH_QUERY", "HOT_SEARCH_QUERY_INDEX", "HOT_SEARCH_ACTION", "mHotSearchEntrys", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/wakeup/common/network/entity/search/HotSearchInfoBean;", "mHotSearchEntryTexts", "mGson", "Lcom/google/gson/Gson;", "getHotSearchEntryTextsLatest", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHotSearchEntryText", "", "getHotSearchEntrys", "getRandomHotSearchEntry", "position", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRandomHotSearchEntryFromCache", "getHotSearchEntrysFromNet", "getHotSearchEntrysFromCache", "synHotSearchEntrys", "", "entrys", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HotSearchEntryDao {
    private static final String CACHE_KEY = "_hotSearchEntryData";
    public static final String HOT_SEARCH_ACTION = "hotSearchAction";
    public static final String HOT_SEARCH_QUERY = "hotSearchQuery";
    public static final String HOT_SEARCH_QUERY_INDEX = "hotSearchQueryIndex";
    private static final String TAG = "HotSearchEntryDao";
    public static final HotSearchEntryDao INSTANCE = new HotSearchEntryDao();
    private static final CopyOnWriteArrayList<HotSearchInfoBean> mHotSearchEntrys = new CopyOnWriteArrayList<>();
    private static final CopyOnWriteArrayList<String> mHotSearchEntryTexts = new CopyOnWriteArrayList<>();
    private static final Gson mGson = new Gson();

    private HotSearchEntryDao() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        if (r2.getHotSearchEntrysFromCache(r0) != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getHotSearchEntryTextsLatest(kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.wakeup.common.storage.HotSearchEntryDao$getHotSearchEntryTextsLatest$1
            if (r0 == 0) goto L14
            r0 = r6
            com.wakeup.common.storage.HotSearchEntryDao$getHotSearchEntryTextsLatest$1 r0 = (com.wakeup.common.storage.HotSearchEntryDao$getHotSearchEntryTextsLatest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            com.wakeup.common.storage.HotSearchEntryDao$getHotSearchEntryTextsLatest$1 r0 = new com.wakeup.common.storage.HotSearchEntryDao$getHotSearchEntryTextsLatest$1
            r0.<init>(r5, r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r6)
            goto L89
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            java.lang.Object r2 = r0.L$0
            com.wakeup.common.storage.HotSearchEntryDao r2 = (com.wakeup.common.storage.HotSearchEntryDao) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4c
        L3d:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.getHotSearchEntrysFromNet(r0)
            if (r6 != r1) goto L4b
            goto L88
        L4b:
            r2 = r5
        L4c:
            java.util.concurrent.CopyOnWriteArrayList<com.wakeup.common.network.entity.search.HotSearchInfoBean> r6 = com.wakeup.common.storage.HotSearchEntryDao.mHotSearchEntrys
            if (r6 == 0) goto L7d
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto L57
            goto L7d
        L57:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r0 = com.wakeup.common.storage.HotSearchEntryDao.mHotSearchEntryTexts
            if (r0 == 0) goto L61
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L89
        L61:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L67:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r0 = r6.next()
            com.wakeup.common.network.entity.search.HotSearchInfoBean r0 = (com.wakeup.common.network.entity.search.HotSearchInfoBean) r0
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r1 = com.wakeup.common.storage.HotSearchEntryDao.mHotSearchEntryTexts
            java.lang.String r0 = r0.getTitle()
            r1.add(r0)
            goto L67
        L7d:
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r2.getHotSearchEntrysFromCache(r0)
            if (r6 != r1) goto L89
        L88:
            return r1
        L89:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r6 = com.wakeup.common.storage.HotSearchEntryDao.mHotSearchEntryTexts
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.storage.HotSearchEntryDao.getHotSearchEntryTextsLatest(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getHotSearchEntryText(kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.wakeup.common.storage.HotSearchEntryDao$getHotSearchEntryText$1
            if (r0 == 0) goto L14
            r0 = r5
            com.wakeup.common.storage.HotSearchEntryDao$getHotSearchEntryText$1 r0 = (com.wakeup.common.storage.HotSearchEntryDao$getHotSearchEntryText$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L19
        L14:
            com.wakeup.common.storage.HotSearchEntryDao$getHotSearchEntryText$1 r0 = new com.wakeup.common.storage.HotSearchEntryDao$getHotSearchEntryText$1
            r0.<init>(r4, r5)
        L19:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L71
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L32:
            kotlin.ResultKt.throwOnFailure(r5)
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r5 = com.wakeup.common.storage.HotSearchEntryDao.mHotSearchEntryTexts
            if (r5 == 0) goto L3f
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L71
        L3f:
            java.util.concurrent.CopyOnWriteArrayList<com.wakeup.common.network.entity.search.HotSearchInfoBean> r5 = com.wakeup.common.storage.HotSearchEntryDao.mHotSearchEntrys
            if (r5 == 0) goto L68
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L68
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L4f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r5.next()
            com.wakeup.common.network.entity.search.HotSearchInfoBean r0 = (com.wakeup.common.network.entity.search.HotSearchInfoBean) r0
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r1 = com.wakeup.common.storage.HotSearchEntryDao.mHotSearchEntryTexts
            java.lang.String r0 = r0.getTitle()
            r1.add(r0)
            goto L4f
        L65:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            goto L71
        L68:
            r0.label = r3
            java.lang.Object r5 = r4.getHotSearchEntrys(r0)
            if (r5 != r1) goto L71
            return r1
        L71:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r5 = com.wakeup.common.storage.HotSearchEntryDao.mHotSearchEntryTexts
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.storage.HotSearchEntryDao.getHotSearchEntryText(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r2.getHotSearchEntrysFromNet(r0) != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getHotSearchEntrys(kotlin.coroutines.Continuation<? super java.util.List<com.wakeup.common.network.entity.search.HotSearchInfoBean>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.wakeup.common.storage.HotSearchEntryDao$getHotSearchEntrys$1
            if (r0 == 0) goto L14
            r0 = r6
            com.wakeup.common.storage.HotSearchEntryDao$getHotSearchEntrys$1 r0 = (com.wakeup.common.storage.HotSearchEntryDao$getHotSearchEntrys$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            com.wakeup.common.storage.HotSearchEntryDao$getHotSearchEntrys$1 r0 = new com.wakeup.common.storage.HotSearchEntryDao$getHotSearchEntrys$1
            r0.<init>(r5, r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r6)
            goto L6c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            java.lang.Object r2 = r0.L$0
            com.wakeup.common.storage.HotSearchEntryDao r2 = (com.wakeup.common.storage.HotSearchEntryDao) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L56
        L3d:
            kotlin.ResultKt.throwOnFailure(r6)
            java.util.concurrent.CopyOnWriteArrayList<com.wakeup.common.network.entity.search.HotSearchInfoBean> r6 = com.wakeup.common.storage.HotSearchEntryDao.mHotSearchEntrys
            if (r6 == 0) goto L4a
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L6c
        L4a:
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.getHotSearchEntrysFromCache(r0)
            if (r6 != r1) goto L55
            goto L6b
        L55:
            r2 = r5
        L56:
            java.util.concurrent.CopyOnWriteArrayList<com.wakeup.common.network.entity.search.HotSearchInfoBean> r6 = com.wakeup.common.storage.HotSearchEntryDao.mHotSearchEntrys
            if (r6 == 0) goto L60
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L6c
        L60:
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r2.getHotSearchEntrysFromNet(r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            java.util.concurrent.CopyOnWriteArrayList<com.wakeup.common.network.entity.search.HotSearchInfoBean> r6 = com.wakeup.common.storage.HotSearchEntryDao.mHotSearchEntrys
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.storage.HotSearchEntryDao.getHotSearchEntrys(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getRandomHotSearchEntry(int r5, kotlin.coroutines.Continuation<? super com.wakeup.common.network.entity.search.HotSearchInfoBean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.wakeup.common.storage.HotSearchEntryDao$getRandomHotSearchEntry$1
            if (r0 == 0) goto L14
            r0 = r6
            com.wakeup.common.storage.HotSearchEntryDao$getRandomHotSearchEntry$1 r0 = (com.wakeup.common.storage.HotSearchEntryDao$getRandomHotSearchEntry$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            com.wakeup.common.storage.HotSearchEntryDao$getRandomHotSearchEntry$1 r0 = new com.wakeup.common.storage.HotSearchEntryDao$getRandomHotSearchEntry$1
            r0.<init>(r4, r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r5 = r0.I$0
            java.lang.Object r0 = r0.L$0
            com.wakeup.common.storage.HotSearchEntryDao r0 = (com.wakeup.common.storage.HotSearchEntryDao) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L5d
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.ResultKt.throwOnFailure(r6)
            java.util.concurrent.CopyOnWriteArrayList<com.wakeup.common.network.entity.search.HotSearchInfoBean> r6 = com.wakeup.common.storage.HotSearchEntryDao.mHotSearchEntrys
            if (r6 == 0) goto L50
            boolean r2 = r6.isEmpty()
            if (r2 != 0) goto L50
            if (r5 < 0) goto L50
            int r6 = r6.size()
            if (r5 < r6) goto L4e
            goto L50
        L4e:
            r0 = r4
            goto L5d
        L50:
            r0.L$0 = r4
            r0.I$0 = r5
            r0.label = r3
            java.lang.Object r6 = r4.getHotSearchEntrys(r0)
            if (r6 != r1) goto L4e
            return r1
        L5d:
            com.wakeup.common.network.entity.search.HotSearchInfoBean r5 = r0.getRandomHotSearchEntryFromCache(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.storage.HotSearchEntryDao.getRandomHotSearchEntry(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final HotSearchInfoBean getRandomHotSearchEntryFromCache(int position) {
        CopyOnWriteArrayList<HotSearchInfoBean> copyOnWriteArrayList = mHotSearchEntrys;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty() || position < 0 || position >= copyOnWriteArrayList.size()) {
            return null;
        }
        return copyOnWriteArrayList.get(position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26)(1:27))|12|(1:16)|18|19))|30|6|7|(0)(0)|12|(2:14|16)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        com.wakeup.common.log.LogUtils.e(com.wakeup.common.storage.HotSearchEntryDao.TAG, java.lang.String.valueOf(r5.getMessage()));
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getHotSearchEntrysFromNet(kotlin.coroutines.Continuation<? super java.util.List<com.wakeup.common.network.entity.search.HotSearchInfoBean>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.wakeup.common.storage.HotSearchEntryDao$getHotSearchEntrysFromNet$1
            if (r0 == 0) goto L14
            r0 = r5
            com.wakeup.common.storage.HotSearchEntryDao$getHotSearchEntrysFromNet$1 r0 = (com.wakeup.common.storage.HotSearchEntryDao$getHotSearchEntrysFromNet$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L19
        L14:
            com.wakeup.common.storage.HotSearchEntryDao$getHotSearchEntrysFromNet$1 r0 = new com.wakeup.common.storage.HotSearchEntryDao$getHotSearchEntrysFromNet$1
            r0.<init>(r4, r5)
        L19:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.L$0
            com.wakeup.common.storage.HotSearchEntryDao r0 = (com.wakeup.common.storage.HotSearchEntryDao) r0
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Exception -> L78
            goto L4f
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L36:
            kotlin.ResultKt.throwOnFailure(r5)
            com.wakeup.common.network.RetrofitManager$Companion r5 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> L78
            com.wakeup.common.network.RetrofitManager r5 = r5.getInstance()     // Catch: java.lang.Exception -> L78
            com.wakeup.common.network.api.SearchService r5 = r5.getSearch()     // Catch: java.lang.Exception -> L78
            r0.L$0 = r4     // Catch: java.lang.Exception -> L78
            r0.label = r3     // Catch: java.lang.Exception -> L78
            java.lang.Object r5 = r5.getHotSearchEntrys(r0)     // Catch: java.lang.Exception -> L78
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
        L4f:
            com.wakeup.common.network.BaseResult r5 = (com.wakeup.common.network.BaseResult) r5     // Catch: java.lang.Exception -> L78
            java.lang.Object r5 = r5.getData()     // Catch: java.lang.Exception -> L78
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Exception -> L78
            if (r5 == 0) goto L8a
            boolean r1 = r5.isEmpty()     // Catch: java.lang.Exception -> L78
            if (r1 != 0) goto L8a
            r0.synHotSearchEntrys(r5)     // Catch: java.lang.Exception -> L78
            com.wakeup.common.storage.CacheManager r5 = com.wakeup.common.storage.CacheManager.INSTANCE     // Catch: java.lang.Exception -> L78
            java.lang.String r0 = "_hotSearchEntryData"
            com.google.gson.Gson r1 = com.wakeup.common.storage.HotSearchEntryDao.mGson     // Catch: java.lang.Exception -> L78
            java.util.concurrent.CopyOnWriteArrayList<com.wakeup.common.network.entity.search.HotSearchInfoBean> r2 = com.wakeup.common.storage.HotSearchEntryDao.mHotSearchEntrys     // Catch: java.lang.Exception -> L78
            java.lang.String r1 = r1.toJson(r2)     // Catch: java.lang.Exception -> L78
            java.lang.String r2 = "toJson(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.Exception -> L78
            r5.saveString(r0, r1)     // Catch: java.lang.Exception -> L78
            goto L8a
        L78:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r0 = "HotSearchEntryDao"
            com.wakeup.common.log.LogUtils.e(r0, r5)
        L8a:
            java.util.concurrent.CopyOnWriteArrayList<com.wakeup.common.network.entity.search.HotSearchInfoBean> r5 = com.wakeup.common.storage.HotSearchEntryDao.mHotSearchEntrys
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.storage.HotSearchEntryDao.getHotSearchEntrysFromNet(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getHotSearchEntrysFromCache(Continuation<? super List<HotSearchInfoBean>> continuation) {
        String string = CacheManager.INSTANCE.getString(CACHE_KEY);
        if (string != null && string.length() != 0) {
            HotSearchInfoBean[] hotSearchInfoBeanArr = (HotSearchInfoBean[]) mGson.fromJson(string, HotSearchInfoBean[].class);
            Intrinsics.checkNotNull(hotSearchInfoBeanArr);
            synHotSearchEntrys(ArraysKt.toList(hotSearchInfoBeanArr));
        }
        return mHotSearchEntrys;
    }

    private final void synHotSearchEntrys(List<HotSearchInfoBean> entrys) {
        if (entrys == null || entrys.isEmpty()) {
            return;
        }
        CopyOnWriteArrayList<HotSearchInfoBean> copyOnWriteArrayList = mHotSearchEntrys;
        copyOnWriteArrayList.clear();
        List<HotSearchInfoBean> list = entrys;
        copyOnWriteArrayList.addAll(CollectionsKt.toList(list));
        mHotSearchEntryTexts.clear();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            mHotSearchEntryTexts.add(((HotSearchInfoBean) it.next()).getTitle());
        }
    }
}
