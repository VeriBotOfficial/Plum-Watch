package com.wakeup.feature.aimusic.data;

import android.util.LruCache;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.wakeup.feature.aimusic.model.AsmrItem;
import com.wakeup.feature.aimusic.network.AsmrApi;
import com.wakeup.feature.aimusic.network.AsmrService;
import com.wakeup.feature.aimusic.network.MusicApiResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: RemoteAsmrRepository.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010H\u0002¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0018J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\u0005J\u0016\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001fH\u0002J\u001a\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\f2\u0006\u0010\"\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/wakeup/feature/aimusic/data/RemoteAsmrRepository;", "", "<init>", "()V", "TAG", "", "service", "Lcom/wakeup/feature/aimusic/network/AsmrService;", "getService", "()Lcom/wakeup/feature/aimusic/network/AsmrService;", "itemCache", "Landroid/util/LruCache;", "Lcom/wakeup/feature/aimusic/model/AsmrItem;", "unwrap", "T", "resp", "Lcom/wakeup/feature/aimusic/network/MusicApiResponse;", "(Lcom/wakeup/feature/aimusic/network/MusicApiResponse;)Ljava/lang/Object;", "getPlaylists", "Lcom/wakeup/feature/aimusic/model/AsmrPlaylistList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlaylistDetail", "Lcom/wakeup/feature/aimusic/model/AsmrPlaylist;", "playlistId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getItem", "itemId", "peekItem", "cacheItems", "", FirebaseAnalytics.Param.ITEMS, "", "mergePreferText", "old", "neo", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RemoteAsmrRepository {
    private static final String TAG = "RemoteAsmrRepository";
    public static final RemoteAsmrRepository INSTANCE = new RemoteAsmrRepository();
    private static final LruCache<String, AsmrItem> itemCache = new LruCache<>(256);

    private RemoteAsmrRepository() {
    }

    private final AsmrService getService() {
        return AsmrApi.INSTANCE.getService();
    }

    private final <T> T unwrap(MusicApiResponse<T> resp) {
        if (!resp.isSuccess()) {
            throw new IllegalStateException("asmr api fail code=" + resp.getCode() + " msg=" + resp.getMessage());
        }
        T data = resp.getData();
        if (data != null) {
            return data;
        }
        throw new IllegalStateException("asmr api empty data code=" + resp.getCode());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getPlaylists(kotlin.coroutines.Continuation<? super com.wakeup.feature.aimusic.model.AsmrPlaylistList> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.wakeup.feature.aimusic.data.RemoteAsmrRepository$getPlaylists$1
            if (r0 == 0) goto L14
            r0 = r7
            com.wakeup.feature.aimusic.data.RemoteAsmrRepository$getPlaylists$1 r0 = (com.wakeup.feature.aimusic.data.RemoteAsmrRepository$getPlaylists$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.wakeup.feature.aimusic.data.RemoteAsmrRepository$getPlaylists$1 r0 = new com.wakeup.feature.aimusic.data.RemoteAsmrRepository$getPlaylists$1
            r0.<init>(r6, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            java.lang.String r3 = "RemoteAsmrRepository"
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r0 = r0.L$0
            com.wakeup.feature.aimusic.data.RemoteAsmrRepository r0 = (com.wakeup.feature.aimusic.data.RemoteAsmrRepository) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L68
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            kotlin.ResultKt.throwOnFailure(r7)
            com.wakeup.feature.aimusic.network.AsmrConfig r7 = com.wakeup.feature.aimusic.network.AsmrConfig.INSTANCE
            java.lang.String r7 = r7.getBaseUrl()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "getPlaylists base="
            r2.<init>(r5)
            java.lang.StringBuilder r7 = r2.append(r7)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            com.wakeup.common.log.LogUtils.i(r3, r7)
            com.wakeup.feature.aimusic.network.AsmrService r7 = r6.getService()
            r0.L$0 = r6
            r0.label = r4
            r2 = 0
            java.lang.Object r7 = com.wakeup.feature.aimusic.network.AsmrService.DefaultImpls.getPlaylists$default(r7, r2, r0, r4, r2)
            if (r7 != r1) goto L67
            return r1
        L67:
            r0 = r6
        L68:
            com.wakeup.feature.aimusic.network.MusicApiResponse r7 = (com.wakeup.feature.aimusic.network.MusicApiResponse) r7
            java.lang.Object r7 = r0.unwrap(r7)
            com.wakeup.feature.aimusic.model.AsmrPlaylistList r7 = (com.wakeup.feature.aimusic.model.AsmrPlaylistList) r7
            java.util.List r0 = r7.getPlaylists()
            int r0 = r0.size()
            java.lang.String r1 = r7.getCopy()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "getPlaylists ok size="
            r2.<init>(r4)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = " copy="
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.wakeup.common.log.LogUtils.i(r3, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.aimusic.data.RemoteAsmrRepository.getPlaylists(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getPlaylistDetail(java.lang.String r8, kotlin.coroutines.Continuation<? super com.wakeup.feature.aimusic.model.AsmrPlaylist> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.wakeup.feature.aimusic.data.RemoteAsmrRepository$getPlaylistDetail$1
            if (r0 == 0) goto L14
            r0 = r9
            com.wakeup.feature.aimusic.data.RemoteAsmrRepository$getPlaylistDetail$1 r0 = (com.wakeup.feature.aimusic.data.RemoteAsmrRepository$getPlaylistDetail$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            com.wakeup.feature.aimusic.data.RemoteAsmrRepository$getPlaylistDetail$1 r0 = new com.wakeup.feature.aimusic.data.RemoteAsmrRepository$getPlaylistDetail$1
            r0.<init>(r7, r9)
        L19:
            r4 = r0
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 != r2) goto L37
            java.lang.Object r8 = r4.L$2
            com.wakeup.feature.aimusic.data.RemoteAsmrRepository r8 = (com.wakeup.feature.aimusic.data.RemoteAsmrRepository) r8
            java.lang.Object r0 = r4.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r4.L$0
            com.wakeup.feature.aimusic.data.RemoteAsmrRepository r1 = (com.wakeup.feature.aimusic.data.RemoteAsmrRepository) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L5c
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            kotlin.ResultKt.throwOnFailure(r9)
            com.wakeup.feature.aimusic.network.AsmrService r1 = r7.getService()
            r4.L$0 = r7
            r4.L$1 = r8
            r4.L$2 = r7
            r4.label = r2
            r3 = 0
            r5 = 2
            r6 = 0
            r2 = r8
            java.lang.Object r9 = com.wakeup.feature.aimusic.network.AsmrService.DefaultImpls.getPlaylistDetail$default(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L59
            return r0
        L59:
            r8 = r7
            r1 = r8
            r0 = r2
        L5c:
            com.wakeup.feature.aimusic.network.MusicApiResponse r9 = (com.wakeup.feature.aimusic.network.MusicApiResponse) r9
            java.lang.Object r8 = r8.unwrap(r9)
            com.wakeup.feature.aimusic.model.AsmrPlaylist r8 = (com.wakeup.feature.aimusic.model.AsmrPlaylist) r8
            java.util.List r9 = r8.getItems()
            r1.cacheItems(r9)
            java.util.List r9 = r8.getItems()
            int r9 = r9.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getPlaylistDetail id="
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " items="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r9 = r0.append(r9)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r0 = "RemoteAsmrRepository"
            com.wakeup.common.log.LogUtils.i(r0, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.aimusic.data.RemoteAsmrRepository.getPlaylistDetail(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getItem(java.lang.String r5, kotlin.coroutines.Continuation<? super com.wakeup.feature.aimusic.model.AsmrItem> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.wakeup.feature.aimusic.data.RemoteAsmrRepository$getItem$1
            if (r0 == 0) goto L14
            r0 = r6
            com.wakeup.feature.aimusic.data.RemoteAsmrRepository$getItem$1 r0 = (com.wakeup.feature.aimusic.data.RemoteAsmrRepository$getItem$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            com.wakeup.feature.aimusic.data.RemoteAsmrRepository$getItem$1 r0 = new com.wakeup.feature.aimusic.data.RemoteAsmrRepository$getItem$1
            r0.<init>(r4, r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r5 = r0.L$2
            com.wakeup.feature.aimusic.data.RemoteAsmrRepository r5 = (com.wakeup.feature.aimusic.data.RemoteAsmrRepository) r5
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.L$0
            com.wakeup.feature.aimusic.data.RemoteAsmrRepository r0 = (com.wakeup.feature.aimusic.data.RemoteAsmrRepository) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L71
        L36:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3e:
            kotlin.ResultKt.throwOnFailure(r6)
            android.util.LruCache<java.lang.String, com.wakeup.feature.aimusic.model.AsmrItem> r6 = com.wakeup.feature.aimusic.data.RemoteAsmrRepository.itemCache
            java.lang.Object r6 = r6.get(r5)
            com.wakeup.feature.aimusic.model.AsmrItem r6 = (com.wakeup.feature.aimusic.model.AsmrItem) r6
            if (r6 == 0) goto L5b
            java.lang.String r2 = r6.getText()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L5b
            boolean r2 = kotlin.text.StringsKt.isBlank(r2)
            if (r2 == 0) goto L5a
            goto L5b
        L5a:
            return r6
        L5b:
            com.wakeup.feature.aimusic.network.AsmrService r6 = r4.getService()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r4
            r0.label = r3
            java.lang.Object r6 = r6.getItem(r5, r0)
            if (r6 != r1) goto L6e
            return r1
        L6e:
            r0 = r4
            r1 = r5
            r5 = r0
        L71:
            com.wakeup.feature.aimusic.network.MusicApiResponse r6 = (com.wakeup.feature.aimusic.network.MusicApiResponse) r6
            java.lang.Object r5 = r5.unwrap(r6)
            com.wakeup.feature.aimusic.model.AsmrItem r5 = (com.wakeup.feature.aimusic.model.AsmrItem) r5
            android.util.LruCache<java.lang.String, com.wakeup.feature.aimusic.model.AsmrItem> r6 = com.wakeup.feature.aimusic.data.RemoteAsmrRepository.itemCache
            java.lang.String r2 = r5.getItemId()
            java.lang.String r3 = r5.getItemId()
            java.lang.Object r3 = r6.get(r3)
            com.wakeup.feature.aimusic.model.AsmrItem r3 = (com.wakeup.feature.aimusic.model.AsmrItem) r3
            com.wakeup.feature.aimusic.model.AsmrItem r0 = r0.mergePreferText(r3, r5)
            r6.put(r2, r0)
            java.lang.String r0 = r5.getText()
            if (r0 == 0) goto L9b
            int r0 = r0.length()
            goto L9c
        L9b:
            r0 = 0
        L9c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getItem id="
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " textLen="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "RemoteAsmrRepository"
            com.wakeup.common.log.LogUtils.i(r1, r0)
            java.lang.String r0 = r5.getItemId()
            java.lang.Object r6 = r6.get(r0)
            com.wakeup.feature.aimusic.model.AsmrItem r6 = (com.wakeup.feature.aimusic.model.AsmrItem) r6
            if (r6 != 0) goto Lcb
            return r5
        Lcb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.aimusic.data.RemoteAsmrRepository.getItem(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final AsmrItem peekItem(String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        return itemCache.get(itemId);
    }

    private final void cacheItems(List<AsmrItem> items) {
        for (AsmrItem asmrItem : items) {
            if (!StringsKt.isBlank(asmrItem.getItemId())) {
                LruCache<String, AsmrItem> lruCache = itemCache;
                lruCache.put(asmrItem.getItemId(), INSTANCE.mergePreferText(lruCache.get(asmrItem.getItemId()), asmrItem));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.wakeup.feature.aimusic.model.AsmrItem mergePreferText(com.wakeup.feature.aimusic.model.AsmrItem r19, com.wakeup.feature.aimusic.model.AsmrItem r20) {
        /*
            r18 = this;
            if (r19 != 0) goto L3
            goto L47
        L3:
            java.lang.String r0 = r20.getText()
            r1 = 0
            if (r0 == 0) goto L17
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = kotlin.text.StringsKt.isBlank(r2)
            if (r2 != 0) goto L14
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 != 0) goto L1b
        L17:
            java.lang.String r0 = r19.getText()
        L1b:
            r14 = r0
            java.lang.String r0 = r20.getTextPath()
            if (r0 == 0) goto L2e
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = kotlin.text.StringsKt.isBlank(r2)
            if (r2 != 0) goto L2c
            r1 = r0
        L2c:
            if (r1 != 0) goto L32
        L2e:
            java.lang.String r1 = r19.getTextPath()
        L32:
            r13 = r1
            java.lang.String r0 = r20.getText()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r14, r0)
            if (r0 == 0) goto L48
            java.lang.String r0 = r20.getTextPath()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r13, r0)
            if (r0 == 0) goto L48
        L47:
            return r20
        L48:
            r16 = 5119(0x13ff, float:7.173E-42)
            r17 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r2 = r20
            com.wakeup.feature.aimusic.model.AsmrItem r0 = com.wakeup.feature.aimusic.model.AsmrItem.copy$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.aimusic.data.RemoteAsmrRepository.mergePreferText(com.wakeup.feature.aimusic.model.AsmrItem, com.wakeup.feature.aimusic.model.AsmrItem):com.wakeup.feature.aimusic.model.AsmrItem");
    }
}
