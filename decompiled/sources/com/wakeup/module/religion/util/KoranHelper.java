package com.wakeup.module.religion.util;

import android.content.Context;
import com.blankj.utilcode.util.GsonUtils;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.network.entity.qibla.KoranBean;
import com.wakeup.common.network.entity.qibla.ReligionKoranBean;
import com.wakeup.common.network.entity.qibla.ReligionKoranList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.xmind.core.style.IStyle;

/* compiled from: KoranHelper.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001/B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0013J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010\u0013J.\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J6\u0010 \u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010#J6\u0010$\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010#J(\u0010%\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u000eH\u0002J\u0019\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010)\u001a\u00020*¢\u0006\u0002\u0010+J\u0016\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010.R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/wakeup/module/religion/util/KoranHelper;", "", "<init>", "()V", "maxSize", "", "pageNum", "textMaxLength", "appSizeNum", "getAppSizeNum", "()I", "TAG", "", "appGetKoran", "Lcom/wakeup/common/network/entity/qibla/ReligionKoranList;", "suraId", "pageNumber", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getKoranSura", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getKoranByServer", "deviceGetKoran", "Lcom/wakeup/module/religion/util/KoranHelper$KoranReadBookmark;", "sura", "paragraphIndex", "position", "option", "(IIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getParagraphs", "", IStyle.PARAGRAPH, "Lcom/wakeup/common/network/entity/qibla/ReligionKoranBean;", "optionNext", "koran", "complete", "(IIILcom/wakeup/common/network/entity/qibla/ReligionKoranList;Lcom/wakeup/module/religion/util/KoranHelper$KoranReadBookmark;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "optionPrevious", "optionCurrent", "getKoranSuraConfig", "", "Lcom/wakeup/common/network/entity/qibla/KoranBean;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)[Lcom/wakeup/common/network/entity/qibla/KoranBean;", "hasNextKoran", "bookmark", "(Lcom/wakeup/module/religion/util/KoranHelper$KoranReadBookmark;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "KoranReadBookmark", "feature-religion_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class KoranHelper {
    public static final KoranHelper INSTANCE = new KoranHelper();
    private static final int maxSize = 1000;
    private static final int pageNum = 1;
    private static final int textMaxLength = 300;
    private static final int appSizeNum = 300;
    private static final String TAG = "KoranHelper";

    private KoranHelper() {
    }

    public final int getAppSizeNum() {
        return appSizeNum;
    }

    public static /* synthetic */ Object appGetKoran$default(KoranHelper koranHelper, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return koranHelper.appGetKoran(i, i2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object appGetKoran(int r8, int r9, kotlin.coroutines.Continuation<? super com.wakeup.common.network.entity.qibla.ReligionKoranList> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.wakeup.module.religion.util.KoranHelper$appGetKoran$1
            if (r0 == 0) goto L14
            r0 = r10
            com.wakeup.module.religion.util.KoranHelper$appGetKoran$1 r0 = (com.wakeup.module.religion.util.KoranHelper$appGetKoran$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            com.wakeup.module.religion.util.KoranHelper$appGetKoran$1 r0 = new com.wakeup.module.religion.util.KoranHelper$appGetKoran$1
            r0.<init>(r7, r10)
        L19:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            int r9 = r0.I$0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L55
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.ResultKt.throwOnFailure(r10)
            if (r8 >= r4) goto L4a
            java.lang.String r9 = com.wakeup.module.religion.util.KoranHelper.TAG
            java.lang.String r10 = "appGetKoranByCache suraId invalid "
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r10, r8}
            com.wakeup.common.log.LogUtils.w(r9, r8)
            return r3
        L4a:
            r0.I$0 = r9
            r0.label = r4
            java.lang.Object r10 = r7.getKoranSura(r8, r0)
            if (r10 != r1) goto L55
            return r1
        L55:
            com.wakeup.common.network.entity.qibla.ReligionKoranList r10 = (com.wakeup.common.network.entity.qibla.ReligionKoranList) r10
            if (r10 != 0) goto L5a
            return r3
        L5a:
            int r8 = r9 + (-1)
            int r0 = com.wakeup.module.religion.util.KoranHelper.appSizeNum
            int r8 = r8 * r0
            int r1 = r9 * r0
            int r2 = r10.getTotal()
            if (r1 <= r2) goto L6c
            int r9 = r10.getTotal()
            goto L6d
        L6c:
            int r9 = r9 * r0
        L6d:
            int r0 = r10.getTotal()
            if (r8 < r0) goto L74
            return r3
        L74:
            java.lang.String r0 = com.wakeup.module.religion.util.KoranHelper.TAG
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r9)
            int r1 = r10.getTotal()
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
            java.lang.String r1 = "appGetKoran "
            java.lang.String r3 = " length "
            java.lang.String r5 = " total "
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3, r4, r5, r6}
            com.wakeup.common.log.LogUtils.i(r0, r1)
            java.util.List r0 = r10.getList()
            java.util.List r8 = r0.subList(r8, r9)
            com.wakeup.common.network.entity.qibla.ReligionKoranList r9 = new com.wakeup.common.network.entity.qibla.ReligionKoranList
            int r10 = r10.getTotal()
            r9.<init>(r10, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.religion.util.KoranHelper.appGetKoran(int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getKoranSura(int r5, kotlin.coroutines.Continuation<? super com.wakeup.common.network.entity.qibla.ReligionKoranList> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.wakeup.module.religion.util.KoranHelper$getKoranSura$1
            if (r0 == 0) goto L14
            r0 = r6
            com.wakeup.module.religion.util.KoranHelper$getKoranSura$1 r0 = (com.wakeup.module.religion.util.KoranHelper$getKoranSura$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            com.wakeup.module.religion.util.KoranHelper$getKoranSura$1 r0 = new com.wakeup.module.religion.util.KoranHelper$getKoranSura$1
            r0.<init>(r4, r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L46
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            kotlin.ResultKt.throwOnFailure(r6)
            com.wakeup.module.religion.util.ReligionCacheHelper$Companion r6 = com.wakeup.module.religion.util.ReligionCacheHelper.INSTANCE
            com.wakeup.common.network.entity.qibla.ReligionKoranList r6 = r6.getKoranBySura(r5)
            if (r6 != 0) goto L48
            r0.label = r3
            java.lang.Object r6 = r4.getKoranByServer(r5, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            com.wakeup.common.network.entity.qibla.ReligionKoranList r6 = (com.wakeup.common.network.entity.qibla.ReligionKoranList) r6
        L48:
            if (r6 != 0) goto L4c
            r5 = 0
            return r5
        L4c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.religion.util.KoranHelper.getKoranSura(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0092 A[Catch: Exception -> 0x00a2, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a2, blocks: (B:11:0x0028, B:12:0x0075, B:14:0x0092, B:22:0x005e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getKoranByServer(int r7, kotlin.coroutines.Continuation<? super com.wakeup.common.network.entity.qibla.ReligionKoranList> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.wakeup.module.religion.util.KoranHelper$getKoranByServer$1
            if (r0 == 0) goto L14
            r0 = r8
            com.wakeup.module.religion.util.KoranHelper$getKoranByServer$1 r0 = (com.wakeup.module.religion.util.KoranHelper$getKoranByServer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            com.wakeup.module.religion.util.KoranHelper$getKoranByServer$1 r0 = new com.wakeup.module.religion.util.KoranHelper$getKoranByServer$1
            r0.<init>(r6, r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            int r7 = r0.I$0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> La2
            goto L75
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.ResultKt.throwOnFailure(r8)
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r2 = r8
            java.util.Map r2 = (java.util.Map) r2
            int r4 = com.wakeup.module.religion.util.KoranHelper.pageNum
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            java.lang.String r5 = "pageNum"
            r2.put(r5, r4)
            int r4 = com.wakeup.module.religion.util.KoranHelper.maxSize
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            java.lang.String r5 = "pageSize"
            r2.put(r5, r4)
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            java.lang.String r5 = "sura"
            r2.put(r5, r4)
            com.wakeup.common.network.RetrofitManager$Companion r2 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> La2
            com.wakeup.common.network.RetrofitManager r2 = r2.getInstance()     // Catch: java.lang.Exception -> La2
            com.wakeup.common.network.api.ReligionService r2 = r2.getApiReligion()     // Catch: java.lang.Exception -> La2
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Exception -> La2
            r0.I$0 = r7     // Catch: java.lang.Exception -> La2
            r0.label = r3     // Catch: java.lang.Exception -> La2
            java.lang.Object r8 = r2.getQuranText(r8, r0)     // Catch: java.lang.Exception -> La2
            if (r8 != r1) goto L75
            return r1
        L75:
            com.wakeup.common.network.BaseResult r8 = (com.wakeup.common.network.BaseResult) r8     // Catch: java.lang.Exception -> La2
            java.lang.String r0 = com.wakeup.module.religion.util.KoranHelper.TAG     // Catch: java.lang.Exception -> La2
            java.lang.String r1 = "getKoranByServer code "
            int r2 = r8.getCode()     // Catch: java.lang.Exception -> La2
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)     // Catch: java.lang.Exception -> La2
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}     // Catch: java.lang.Exception -> La2
            com.wakeup.common.log.LogUtils.i(r0, r1)     // Catch: java.lang.Exception -> La2
            int r0 = r8.getCode()     // Catch: java.lang.Exception -> La2
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto Lb2
            com.wakeup.module.religion.util.ReligionCacheHelper$Companion r0 = com.wakeup.module.religion.util.ReligionCacheHelper.INSTANCE     // Catch: java.lang.Exception -> La2
            java.lang.Object r1 = r8.getData()     // Catch: java.lang.Exception -> La2
            com.wakeup.common.network.entity.qibla.ReligionKoranList r1 = (com.wakeup.common.network.entity.qibla.ReligionKoranList) r1     // Catch: java.lang.Exception -> La2
            r0.saveKoranBySura(r7, r1)     // Catch: java.lang.Exception -> La2
            java.lang.Object r7 = r8.getData()     // Catch: java.lang.Exception -> La2
            return r7
        La2:
            r7 = move-exception
            java.lang.String r8 = com.wakeup.module.religion.util.KoranHelper.TAG
            java.lang.String r0 = "getKoranByServer "
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r0, r7}
            com.wakeup.common.log.LogUtils.e(r8, r7)
        Lb2:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.religion.util.KoranHelper.getKoranByServer(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deviceGetKoran(int r24, int r25, int r26, int r27, kotlin.coroutines.Continuation<? super com.wakeup.module.religion.util.KoranHelper.KoranReadBookmark> r28) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.religion.util.KoranHelper.deviceGetKoran(int, int, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final List<String> getParagraphs(ReligionKoranBean paragraph) {
        String str = paragraph.getContent() + paragraph.getAya();
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = textMaxLength;
        if (length < i) {
            arrayList.add(str);
            return arrayList;
        }
        int length2 = str.length();
        if (i <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + i + ".");
        }
        int i2 = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, length2, i);
        if (progressionLastElement >= 0) {
            while (true) {
                int length3 = str.length() - i2;
                int i3 = textMaxLength;
                if (length3 > i3) {
                    length3 = i3;
                }
                arrayList.add(str.subSequence(i2, length3 + i2).toString());
                if (i2 == progressionLastElement) {
                    break;
                }
                i2 += i;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object optionNext(int r7, int r8, int r9, com.wakeup.common.network.entity.qibla.ReligionKoranList r10, com.wakeup.module.religion.util.KoranHelper.KoranReadBookmark r11, kotlin.coroutines.Continuation<? super com.wakeup.module.religion.util.KoranHelper.KoranReadBookmark> r12) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.religion.util.KoranHelper.optionNext(int, int, int, com.wakeup.common.network.entity.qibla.ReligionKoranList, com.wakeup.module.religion.util.KoranHelper$KoranReadBookmark, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object optionPrevious(int r7, int r8, int r9, com.wakeup.common.network.entity.qibla.ReligionKoranList r10, com.wakeup.module.religion.util.KoranHelper.KoranReadBookmark r11, kotlin.coroutines.Continuation<? super com.wakeup.module.religion.util.KoranHelper.KoranReadBookmark> r12) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.religion.util.KoranHelper.optionPrevious(int, int, int, com.wakeup.common.network.entity.qibla.ReligionKoranList, com.wakeup.module.religion.util.KoranHelper$KoranReadBookmark, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final KoranReadBookmark optionCurrent(int position, int paragraphIndex, int sura, ReligionKoranList koran) {
        if (paragraphIndex > koran.getTotal()) {
            LogUtils.w(TAG, "optionCurrent paragraphIndex Excessive size");
            return new KoranReadBookmark(sura, paragraphIndex, position, "");
        }
        List<String> paragraphs = getParagraphs(koran.getList().get(paragraphIndex));
        if (position > paragraphs.size()) {
            LogUtils.w(TAG, "optionCurrent position Excessive size");
            return new KoranReadBookmark(sura, paragraphIndex + 1, position + 1, "");
        }
        return new KoranReadBookmark(sura, paragraphIndex + 1, position + 1, paragraphs.get(position));
    }

    public final KoranBean[] getKoranSuraConfig(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        StringBuilder sb = new StringBuilder();
        try {
            InputStream open = context.getResources().getAssets().open("koranSura.json");
            InputStreamReader inputStreamReader = new InputStreamReader(open);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            inputStreamReader.close();
            open.close();
        } catch (IOException e) {
            LogUtils.e(TAG, "e：", e.toString());
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        Object fromJson = GsonUtils.fromJson(sb2, (Class<Object>) KoranBean[].class);
        Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
        return (KoranBean[]) fromJson;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        if (r1 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[Catch: IndexOutOfBoundsException -> 0x00bb, TRY_ENTER, TryCatch #0 {IndexOutOfBoundsException -> 0x00bb, blocks: (B:11:0x002e, B:12:0x00a2, B:28:0x0073), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hasNextKoran(com.wakeup.module.religion.util.KoranHelper.KoranReadBookmark r19, kotlin.coroutines.Continuation<? super java.lang.Integer> r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof com.wakeup.module.religion.util.KoranHelper$hasNextKoran$1
            if (r2 == 0) goto L18
            r2 = r1
            com.wakeup.module.religion.util.KoranHelper$hasNextKoran$1 r2 = (com.wakeup.module.religion.util.KoranHelper$hasNextKoran$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L1d
        L18:
            com.wakeup.module.religion.util.KoranHelper$hasNextKoran$1 r2 = new com.wakeup.module.religion.util.KoranHelper$hasNextKoran$1
            r2.<init>(r0, r1)
        L1d:
            r9 = r2
            java.lang.Object r1 = r9.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r9.label
            r4 = 2
            r10 = 1
            if (r3 == 0) goto L47
            if (r3 == r10) goto L3b
            if (r3 != r4) goto L33
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.IndexOutOfBoundsException -> Lbb
            goto La2
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            java.lang.Object r3 = r9.L$1
            com.wakeup.module.religion.util.KoranHelper$KoranReadBookmark r3 = (com.wakeup.module.religion.util.KoranHelper.KoranReadBookmark) r3
            java.lang.Object r5 = r9.L$0
            com.wakeup.module.religion.util.KoranHelper r5 = (com.wakeup.module.religion.util.KoranHelper) r5
            kotlin.ResultKt.throwOnFailure(r1)
            goto L69
        L47:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.String r1 = com.wakeup.module.religion.util.KoranHelper.TAG
            java.lang.String r3 = "hasNextKoran"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.wakeup.common.log.LogUtils.i(r1, r3)
            int r1 = r19.getCompleteSura()
            r9.L$0 = r0
            r3 = r19
            r9.L$1 = r3
            r9.label = r10
            java.lang.Object r1 = r0.getKoranSura(r1, r9)
            if (r1 != r2) goto L68
            goto La1
        L68:
            r5 = r0
        L69:
            r7 = r1
            com.wakeup.common.network.entity.qibla.ReligionKoranList r7 = (com.wakeup.common.network.entity.qibla.ReligionKoranList) r7
            if (r7 != 0) goto L73
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r10)
            return r1
        L73:
            int r1 = r3.getCompletePosition()     // Catch: java.lang.IndexOutOfBoundsException -> Lbb
            int r1 = r1 - r10
            int r6 = r3.getCompleteParagraph()     // Catch: java.lang.IndexOutOfBoundsException -> Lbb
            int r6 = r6 - r10
            int r3 = r3.getCompleteSura()     // Catch: java.lang.IndexOutOfBoundsException -> Lbb
            com.wakeup.module.religion.util.KoranHelper$KoranReadBookmark r8 = new com.wakeup.module.religion.util.KoranHelper$KoranReadBookmark     // Catch: java.lang.IndexOutOfBoundsException -> Lbb
            r16 = 8
            r17 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r11 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.IndexOutOfBoundsException -> Lbb
            r11 = 0
            r9.L$0 = r11     // Catch: java.lang.IndexOutOfBoundsException -> Lbb
            r9.L$1 = r11     // Catch: java.lang.IndexOutOfBoundsException -> Lbb
            r9.label = r4     // Catch: java.lang.IndexOutOfBoundsException -> Lbb
            r4 = r6
            r6 = r3
            r3 = r5
            r5 = r4
            r4 = r1
            java.lang.Object r1 = r3.optionNext(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.IndexOutOfBoundsException -> Lbb
            if (r1 != r2) goto La2
        La1:
            return r2
        La2:
            com.wakeup.module.religion.util.KoranHelper$KoranReadBookmark r1 = (com.wakeup.module.religion.util.KoranHelper.KoranReadBookmark) r1     // Catch: java.lang.IndexOutOfBoundsException -> Lbb
            java.lang.String r1 = r1.getCurContent()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto Lb5
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r10)
            return r1
        Lb5:
            r1 = 0
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
            return r1
        Lbb:
            java.lang.String r1 = com.wakeup.module.religion.util.KoranHelper.TAG
            java.lang.String r2 = "hasNextKoran IndexOutOfBoundsException"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            com.wakeup.common.log.LogUtils.i(r1, r2)
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.religion.util.KoranHelper.hasNextKoran(com.wakeup.module.religion.util.KoranHelper$KoranReadBookmark, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: KoranHelper.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0014\u001a\u00020\u0007H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/wakeup/module/religion/util/KoranHelper$KoranReadBookmark;", "", "completeSura", "", "completeParagraph", "completePosition", "curContent", "", "<init>", "(IIILjava/lang/String;)V", "getCompleteSura", "()I", "setCompleteSura", "(I)V", "getCompleteParagraph", "setCompleteParagraph", "getCompletePosition", "setCompletePosition", "getCurContent", "()Ljava/lang/String;", "toString", "feature-religion_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class KoranReadBookmark {
        private int completeParagraph;
        private int completePosition;
        private int completeSura;
        private final String curContent;

        public KoranReadBookmark(int i, int i2, int i3, String curContent) {
            Intrinsics.checkNotNullParameter(curContent, "curContent");
            this.completeSura = i;
            this.completeParagraph = i2;
            this.completePosition = i3;
            this.curContent = curContent;
        }

        public final int getCompleteSura() {
            return this.completeSura;
        }

        public final void setCompleteSura(int i) {
            this.completeSura = i;
        }

        public final int getCompleteParagraph() {
            return this.completeParagraph;
        }

        public final void setCompleteParagraph(int i) {
            this.completeParagraph = i;
        }

        public final int getCompletePosition() {
            return this.completePosition;
        }

        public final void setCompletePosition(int i) {
            this.completePosition = i;
        }

        public /* synthetic */ KoranReadBookmark(int i, int i2, int i3, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, i3, (i4 & 8) != 0 ? "" : str);
        }

        public final String getCurContent() {
            return this.curContent;
        }

        public String toString() {
            return "KoranReadBookmark(completeSura=" + this.completeSura + ", completeParagraph=" + this.completeParagraph + ", completePosition=" + this.completePosition + ", curContent='" + this.curContent + "')";
        }
    }
}
