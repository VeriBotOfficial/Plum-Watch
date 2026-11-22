package com.wakeup.module.religion.util;

import android.content.Context;
import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import com.anythink.expressad.video.dynview.a.a;
import com.blankj.utilcode.util.CollectionUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.network.entity.qibla.PraySceneBean;
import com.wakeup.common.network.entity.qibla.PraySceneSuraBean;
import com.wakeup.common.network.entity.qibla.SceneContentBean;
import com.wakeup.common.network.entity.qibla.SceneContentList;
import com.wakeup.commonui.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.xmind.core.style.IStyle;

/* compiled from: PraySceneHelper.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002GHB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0013J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0002J\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ>\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\u001b2\u0006\u0010)\u001a\u00020*H\u0002JF\u0010+\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020 H\u0082@¢\u0006\u0002\u0010.JF\u0010/\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00102\u0006\u0010-\u001a\u00020 H\u0082@¢\u0006\u0002\u0010.J(\u00101\u001a\u00020 2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0010H\u0002J \u00102\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0002J\u001e\u00103\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005J \u00104\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0002J \u00105\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0002J#\u00106\u001a\b\u0012\u0004\u0012\u0002070\f2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u00108\u001a\u000209¢\u0006\u0002\u0010:J+\u0010;\u001a\u00020<2\u0006\u0010!\u001a\u00020\"2\f\u0010=\u001a\b\u0012\u0004\u0012\u0002070\f2\u0006\u00108\u001a\u000209H\u0002¢\u0006\u0002\u0010>J+\u0010?\u001a\u00020<2\u0006\u0010!\u001a\u00020\"2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001c0\f2\u0006\u00108\u001a\u000209H\u0002¢\u0006\u0002\u0010@J#\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001c0\f2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u00108\u001a\u000209¢\u0006\u0002\u0010BJ\u0016\u0010C\u001a\u00020D2\u0006\u0010!\u001a\u00020\"2\u0006\u0010E\u001a\u00020\u0005J\u001e\u0010F\u001a\u00020\n2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006I"}, d2 = {"Lcom/wakeup/module/religion/util/PraySceneHelper;", "", "<init>", "()V", "maxSize", "", "pageNum", "textMaxLength", "appSizeNum", "TAG", "", "sceneNames", "", "[Ljava/lang/Integer;", "sceneSuraNames", "appGetScene", "Lcom/wakeup/common/network/entity/qibla/SceneContentList;", "suraId", "pageNumber", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPraySura", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrayTextByServer", "deviceGetPrayTextByServer", "convertRepeatData", "data", "filterTagSura", "", "Lcom/wakeup/common/network/entity/qibla/PraySceneSuraBean;", "tag", "suraList", "deviceGetContent", "Lcom/wakeup/module/religion/util/PraySceneHelper$SceneReadBookmark;", "context", "Landroid/content/Context;", "sura", "paragraphIndex", "position", "option", "(Landroid/content/Context;IIIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getParagraphs", IStyle.PARAGRAPH, "Lcom/wakeup/common/network/entity/qibla/SceneContentBean;", "optionNext", "koran", "complete", "(Landroid/content/Context;IIIILcom/wakeup/common/network/entity/qibla/SceneContentList;Lcom/wakeup/module/religion/util/PraySceneHelper$SceneReadBookmark;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "optionPrevious", "scene", "optionCurrent", "sceneNextSuraId", "sceneNextSuraPosition", "sceneSuraId", "scenePreviousSuraId", "getPraySceneConfig", "Lcom/wakeup/common/network/entity/qibla/PraySceneBean;", "isDevice", "", "(Landroid/content/Context;Z)[Lcom/wakeup/common/network/entity/qibla/PraySceneBean;", "sceneConfigConvert", "", "configArray", "(Landroid/content/Context;[Lcom/wakeup/common/network/entity/qibla/PraySceneBean;Z)V", "sceneSuraConfigConvert", "(Landroid/content/Context;[Lcom/wakeup/common/network/entity/qibla/PraySceneSuraBean;Z)V", "getPraySceneSuraConfig", "(Landroid/content/Context;Z)[Lcom/wakeup/common/network/entity/qibla/PraySceneSuraBean;", "deviceGetScenes", "Lcom/wakeup/module/religion/util/PraySceneHelper$DeviceSceneBean;", "page", "getSceneSuraTitle", "DeviceSceneBean", "SceneReadBookmark", "feature-religion_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PraySceneHelper {
    private static final String TAG = "PraySceneHelper";
    private static final int appSizeNum = 15;
    private static final int maxSize = 1000;
    private static final int pageNum = 1;
    private static final int textMaxLength = 300;
    public static final PraySceneHelper INSTANCE = new PraySceneHelper();
    private static final Integer[] sceneNames = {Integer.valueOf(R.string.religion_pray_scene_all), Integer.valueOf(R.string.religion_pray_scene_1), Integer.valueOf(R.string.religion_pray_scene_2), Integer.valueOf(R.string.religion_pray_scene_3), Integer.valueOf(R.string.religion_pray_scene_4), Integer.valueOf(R.string.religion_pray_scene_5), Integer.valueOf(R.string.religion_pray_scene_6), Integer.valueOf(R.string.religion_pray_scene_7), Integer.valueOf(R.string.religion_pray_scene_8), Integer.valueOf(R.string.religion_pray_scene_9), Integer.valueOf(R.string.religion_pray_scene_10), Integer.valueOf(R.string.religion_pray_scene_11)};
    private static final Integer[] sceneSuraNames = {Integer.valueOf(R.string.religion_pray_scene_sura_1), Integer.valueOf(R.string.religion_pray_scene_sura_2), Integer.valueOf(R.string.religion_pray_scene_sura_3), Integer.valueOf(R.string.religion_pray_scene_sura_4), Integer.valueOf(R.string.religion_pray_scene_sura_5), Integer.valueOf(R.string.religion_pray_scene_sura_6), Integer.valueOf(R.string.religion_pray_scene_sura_7), Integer.valueOf(R.string.religion_pray_scene_sura_8), Integer.valueOf(R.string.religion_pray_scene_sura_9), Integer.valueOf(R.string.religion_pray_scene_sura_10), Integer.valueOf(R.string.religion_pray_scene_sura_11), Integer.valueOf(R.string.religion_pray_scene_sura_12), Integer.valueOf(R.string.religion_pray_scene_sura_13), Integer.valueOf(R.string.religion_pray_scene_sura_14), Integer.valueOf(R.string.religion_pray_scene_sura_15), Integer.valueOf(R.string.religion_pray_scene_sura_16), Integer.valueOf(R.string.religion_pray_scene_sura_17), Integer.valueOf(R.string.religion_pray_scene_sura_18), Integer.valueOf(R.string.religion_pray_scene_sura_19), Integer.valueOf(R.string.religion_pray_scene_sura_20), Integer.valueOf(R.string.religion_pray_scene_sura_21), Integer.valueOf(R.string.religion_pray_scene_sura_22), Integer.valueOf(R.string.religion_pray_scene_sura_23), Integer.valueOf(R.string.religion_pray_scene_sura_24), Integer.valueOf(R.string.religion_pray_scene_sura_25), Integer.valueOf(R.string.religion_pray_scene_sura_26), Integer.valueOf(R.string.religion_pray_scene_sura_27), Integer.valueOf(R.string.religion_pray_scene_sura_28), Integer.valueOf(R.string.religion_pray_scene_sura_29), Integer.valueOf(R.string.religion_pray_scene_sura_30), Integer.valueOf(R.string.religion_pray_scene_sura_31), Integer.valueOf(R.string.religion_pray_scene_sura_32), Integer.valueOf(R.string.religion_pray_scene_sura_33), Integer.valueOf(R.string.religion_pray_scene_sura_34), Integer.valueOf(R.string.religion_pray_scene_sura_35), Integer.valueOf(R.string.religion_pray_scene_sura_36), Integer.valueOf(R.string.religion_pray_scene_sura_37), Integer.valueOf(R.string.religion_pray_scene_sura_38), Integer.valueOf(R.string.religion_pray_scene_sura_39), Integer.valueOf(R.string.religion_pray_scene_sura_40), Integer.valueOf(R.string.religion_pray_scene_sura_41), Integer.valueOf(R.string.religion_pray_scene_sura_42), Integer.valueOf(R.string.religion_pray_scene_sura_43), Integer.valueOf(R.string.religion_pray_scene_sura_44), Integer.valueOf(R.string.religion_pray_scene_sura_45), Integer.valueOf(R.string.religion_pray_scene_sura_46), Integer.valueOf(R.string.religion_pray_scene_sura_47), Integer.valueOf(R.string.religion_pray_scene_sura_48), Integer.valueOf(R.string.religion_pray_scene_sura_49), Integer.valueOf(R.string.religion_pray_scene_sura_50), Integer.valueOf(R.string.religion_pray_scene_sura_51), Integer.valueOf(R.string.religion_pray_scene_sura_52), Integer.valueOf(R.string.religion_pray_scene_sura_53), Integer.valueOf(R.string.religion_pray_scene_sura_54), Integer.valueOf(R.string.religion_pray_scene_sura_55), Integer.valueOf(R.string.religion_pray_scene_sura_56), Integer.valueOf(R.string.religion_pray_scene_sura_57), Integer.valueOf(R.string.religion_pray_scene_sura_58), Integer.valueOf(R.string.religion_pray_scene_sura_59), Integer.valueOf(R.string.religion_pray_scene_sura_60), Integer.valueOf(R.string.religion_pray_scene_sura_61), Integer.valueOf(R.string.religion_pray_scene_sura_62), Integer.valueOf(R.string.religion_pray_scene_sura_63), Integer.valueOf(R.string.religion_pray_scene_sura_64), Integer.valueOf(R.string.religion_pray_scene_sura_65), Integer.valueOf(R.string.religion_pray_scene_sura_66), Integer.valueOf(R.string.religion_pray_scene_sura_67), Integer.valueOf(R.string.religion_pray_scene_sura_68), Integer.valueOf(R.string.religion_pray_scene_sura_69), Integer.valueOf(R.string.religion_pray_scene_sura_70), Integer.valueOf(R.string.religion_pray_scene_sura_71), Integer.valueOf(R.string.religion_pray_scene_sura_72), Integer.valueOf(R.string.religion_pray_scene_sura_73), Integer.valueOf(R.string.religion_pray_scene_sura_74), Integer.valueOf(R.string.religion_pray_scene_sura_75), Integer.valueOf(R.string.religion_pray_scene_sura_76), Integer.valueOf(R.string.religion_pray_scene_sura_77), Integer.valueOf(R.string.religion_pray_scene_sura_78), Integer.valueOf(R.string.religion_pray_scene_sura_79), Integer.valueOf(R.string.religion_pray_scene_sura_80), Integer.valueOf(R.string.religion_pray_scene_sura_81), Integer.valueOf(R.string.religion_pray_scene_sura_82), Integer.valueOf(R.string.religion_pray_scene_sura_83), Integer.valueOf(R.string.religion_pray_scene_sura_84), Integer.valueOf(R.string.religion_pray_scene_sura_85), Integer.valueOf(R.string.religion_pray_scene_sura_86), Integer.valueOf(R.string.religion_pray_scene_sura_87), Integer.valueOf(R.string.religion_pray_scene_sura_88), Integer.valueOf(R.string.religion_pray_scene_sura_89), Integer.valueOf(R.string.religion_pray_scene_sura_90), Integer.valueOf(R.string.religion_pray_scene_sura_91), Integer.valueOf(R.string.religion_pray_scene_sura_92), Integer.valueOf(R.string.religion_pray_scene_sura_93), Integer.valueOf(R.string.religion_pray_scene_sura_94), Integer.valueOf(R.string.religion_pray_scene_sura_95), Integer.valueOf(R.string.religion_pray_scene_sura_96), Integer.valueOf(R.string.religion_pray_scene_sura_97), Integer.valueOf(R.string.religion_pray_scene_sura_98), Integer.valueOf(R.string.religion_pray_scene_sura_99), Integer.valueOf(R.string.religion_pray_scene_sura_100), Integer.valueOf(R.string.religion_pray_scene_sura_101), Integer.valueOf(R.string.religion_pray_scene_sura_102), Integer.valueOf(R.string.religion_pray_scene_sura_103), Integer.valueOf(R.string.religion_pray_scene_sura_104), Integer.valueOf(R.string.religion_pray_scene_sura_105), Integer.valueOf(R.string.religion_pray_scene_sura_106), Integer.valueOf(R.string.religion_pray_scene_sura_107), Integer.valueOf(R.string.religion_pray_scene_sura_108), Integer.valueOf(R.string.religion_pray_scene_sura_109), Integer.valueOf(R.string.religion_pray_scene_sura_110), Integer.valueOf(R.string.religion_pray_scene_sura_111), Integer.valueOf(R.string.religion_pray_scene_sura_112), Integer.valueOf(R.string.religion_pray_scene_sura_113), Integer.valueOf(R.string.religion_pray_scene_sura_114), Integer.valueOf(R.string.religion_pray_scene_sura_115), Integer.valueOf(R.string.religion_pray_scene_sura_116), Integer.valueOf(R.string.religion_pray_scene_sura_117), Integer.valueOf(R.string.religion_pray_scene_sura_118), Integer.valueOf(R.string.religion_pray_scene_sura_119), Integer.valueOf(R.string.religion_pray_scene_sura_120), Integer.valueOf(R.string.religion_pray_scene_sura_121), Integer.valueOf(R.string.religion_pray_scene_sura_122), Integer.valueOf(R.string.religion_pray_scene_sura_123), Integer.valueOf(R.string.religion_pray_scene_sura_124), Integer.valueOf(R.string.religion_pray_scene_sura_125), Integer.valueOf(R.string.religion_pray_scene_sura_126), Integer.valueOf(R.string.religion_pray_scene_sura_127), Integer.valueOf(R.string.religion_pray_scene_sura_128), Integer.valueOf(R.string.religion_pray_scene_sura_129), Integer.valueOf(R.string.religion_pray_scene_sura_130), Integer.valueOf(R.string.religion_pray_scene_sura_131), Integer.valueOf(R.string.religion_pray_scene_sura_132)};

    private PraySceneHelper() {
    }

    public static /* synthetic */ Object appGetScene$default(PraySceneHelper praySceneHelper, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return praySceneHelper.appGetScene(i, i2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object appGetScene(int r6, int r7, kotlin.coroutines.Continuation<? super com.wakeup.common.network.entity.qibla.SceneContentList> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.wakeup.module.religion.util.PraySceneHelper$appGetScene$1
            if (r0 == 0) goto L14
            r0 = r8
            com.wakeup.module.religion.util.PraySceneHelper$appGetScene$1 r0 = (com.wakeup.module.religion.util.PraySceneHelper$appGetScene$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            com.wakeup.module.religion.util.PraySceneHelper$appGetScene$1 r0 = new com.wakeup.module.religion.util.PraySceneHelper$appGetScene$1
            r0.<init>(r5, r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            int r7 = r0.I$0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L55
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            if (r6 >= r4) goto L4a
            java.lang.String r7 = "appGetKoranByCache suraId invalid "
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r7, r6}
            java.lang.String r7 = "PraySceneHelper"
            com.wakeup.common.log.LogUtils.w(r7, r6)
            return r3
        L4a:
            r0.I$0 = r7
            r0.label = r4
            java.lang.Object r8 = r5.getPrayTextByServer(r6, r0)
            if (r8 != r1) goto L55
            return r1
        L55:
            com.wakeup.common.network.entity.qibla.SceneContentList r8 = (com.wakeup.common.network.entity.qibla.SceneContentList) r8
            if (r8 != 0) goto L5a
            return r3
        L5a:
            int r6 = r7 + (-1)
            int r6 = r6 * 15
            int r7 = r7 * 15
            int r0 = r8.getTotal()
            if (r7 <= r0) goto L6a
            int r7 = r8.getTotal()
        L6a:
            java.util.List r0 = r8.getList()
            java.util.List r6 = r0.subList(r6, r7)
            com.wakeup.common.network.entity.qibla.SceneContentList r7 = new com.wakeup.common.network.entity.qibla.SceneContentList
            int r8 = r8.getTotal()
            r7.<init>(r8, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.religion.util.PraySceneHelper.appGetScene(int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getPraySura(int r5, kotlin.coroutines.Continuation<? super com.wakeup.common.network.entity.qibla.SceneContentList> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.wakeup.module.religion.util.PraySceneHelper$getPraySura$1
            if (r0 == 0) goto L14
            r0 = r6
            com.wakeup.module.religion.util.PraySceneHelper$getPraySura$1 r0 = (com.wakeup.module.religion.util.PraySceneHelper$getPraySura$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            com.wakeup.module.religion.util.PraySceneHelper$getPraySura$1 r0 = new com.wakeup.module.religion.util.PraySceneHelper$getPraySura$1
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
            com.wakeup.common.network.entity.qibla.SceneContentList r6 = r6.getSceneBySura(r5)
            if (r6 != 0) goto L48
            r0.label = r3
            java.lang.Object r6 = r4.deviceGetPrayTextByServer(r5, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            com.wakeup.common.network.entity.qibla.SceneContentList r6 = (com.wakeup.common.network.entity.qibla.SceneContentList) r6
        L48:
            if (r6 != 0) goto L4c
            r5 = 0
            return r5
        L4c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.religion.util.PraySceneHelper.getPraySura(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0093 A[Catch: Exception -> 0x009e, TRY_LEAVE, TryCatch #0 {Exception -> 0x009e, blocks: (B:11:0x002c, B:12:0x0078, B:14:0x0093, B:22:0x0060), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getPrayTextByServer(int r8, kotlin.coroutines.Continuation<? super com.wakeup.common.network.entity.qibla.SceneContentList> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.wakeup.module.religion.util.PraySceneHelper$getPrayTextByServer$1
            if (r0 == 0) goto L14
            r0 = r9
            com.wakeup.module.religion.util.PraySceneHelper$getPrayTextByServer$1 r0 = (com.wakeup.module.religion.util.PraySceneHelper$getPrayTextByServer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            com.wakeup.module.religion.util.PraySceneHelper$getPrayTextByServer$1 r0 = new com.wakeup.module.religion.util.PraySceneHelper$getPrayTextByServer$1
            r0.<init>(r7, r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            java.lang.String r3 = "PraySceneHelper"
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r8 = r0.L$0
            com.wakeup.module.religion.util.PraySceneHelper r8 = (com.wakeup.module.religion.util.PraySceneHelper) r8
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> L9e
            goto L78
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.ResultKt.throwOnFailure(r9)
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r2 = r9
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r5 = "pageNum"
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            r2.put(r5, r6)
            r5 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r5)
            java.lang.String r6 = "pageSize"
            r2.put(r6, r5)
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)
            java.lang.String r5 = "sura"
            r2.put(r5, r8)
            com.wakeup.common.network.RetrofitManager$Companion r8 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> L9e
            com.wakeup.common.network.RetrofitManager r8 = r8.getInstance()     // Catch: java.lang.Exception -> L9e
            com.wakeup.common.network.api.ReligionService r8 = r8.getApiReligion()     // Catch: java.lang.Exception -> L9e
            java.util.Map r9 = (java.util.Map) r9     // Catch: java.lang.Exception -> L9e
            r0.L$0 = r7     // Catch: java.lang.Exception -> L9e
            r0.label = r4     // Catch: java.lang.Exception -> L9e
            java.lang.Object r9 = r8.getPraySceneText(r9, r0)     // Catch: java.lang.Exception -> L9e
            if (r9 != r1) goto L77
            return r1
        L77:
            r8 = r7
        L78:
            com.wakeup.common.network.BaseResult r9 = (com.wakeup.common.network.BaseResult) r9     // Catch: java.lang.Exception -> L9e
            java.lang.String r0 = "getPrayTextByServer code "
            int r1 = r9.getCode()     // Catch: java.lang.Exception -> L9e
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)     // Catch: java.lang.Exception -> L9e
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}     // Catch: java.lang.Exception -> L9e
            com.wakeup.common.log.LogUtils.i(r3, r0)     // Catch: java.lang.Exception -> L9e
            int r0 = r9.getCode()     // Catch: java.lang.Exception -> L9e
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto Lac
            java.lang.Object r9 = r9.getData()     // Catch: java.lang.Exception -> L9e
            com.wakeup.common.network.entity.qibla.SceneContentList r9 = (com.wakeup.common.network.entity.qibla.SceneContentList) r9     // Catch: java.lang.Exception -> L9e
            com.wakeup.common.network.entity.qibla.SceneContentList r8 = r8.convertRepeatData(r9)     // Catch: java.lang.Exception -> L9e
            return r8
        L9e:
            r8 = move-exception
            java.lang.String r9 = "getPrayTextByServer "
            java.lang.String r8 = r8.toString()
            java.lang.Object[] r8 = new java.lang.Object[]{r9, r8}
            com.wakeup.common.log.LogUtils.e(r3, r8)
        Lac:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.religion.util.PraySceneHelper.getPrayTextByServer(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0090 A[Catch: Exception -> 0x00a0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a0, blocks: (B:11:0x002a, B:12:0x0075, B:14:0x0090, B:22:0x005e), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deviceGetPrayTextByServer(int r8, kotlin.coroutines.Continuation<? super com.wakeup.common.network.entity.qibla.SceneContentList> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.wakeup.module.religion.util.PraySceneHelper$deviceGetPrayTextByServer$1
            if (r0 == 0) goto L14
            r0 = r9
            com.wakeup.module.religion.util.PraySceneHelper$deviceGetPrayTextByServer$1 r0 = (com.wakeup.module.religion.util.PraySceneHelper$deviceGetPrayTextByServer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            com.wakeup.module.religion.util.PraySceneHelper$deviceGetPrayTextByServer$1 r0 = new com.wakeup.module.religion.util.PraySceneHelper$deviceGetPrayTextByServer$1
            r0.<init>(r7, r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            java.lang.String r3 = "PraySceneHelper"
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            int r8 = r0.I$0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> La0
            goto L75
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.ResultKt.throwOnFailure(r9)
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r2 = r9
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r5 = "pageNum"
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            r2.put(r5, r6)
            r5 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r5)
            java.lang.String r6 = "pageSize"
            r2.put(r6, r5)
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)
            java.lang.String r6 = "sura"
            r2.put(r6, r5)
            com.wakeup.common.network.RetrofitManager$Companion r2 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> La0
            com.wakeup.common.network.RetrofitManager r2 = r2.getInstance()     // Catch: java.lang.Exception -> La0
            com.wakeup.common.network.api.ReligionService r2 = r2.getApiReligion()     // Catch: java.lang.Exception -> La0
            java.util.Map r9 = (java.util.Map) r9     // Catch: java.lang.Exception -> La0
            r0.I$0 = r8     // Catch: java.lang.Exception -> La0
            r0.label = r4     // Catch: java.lang.Exception -> La0
            java.lang.Object r9 = r2.getPraySceneText(r9, r0)     // Catch: java.lang.Exception -> La0
            if (r9 != r1) goto L75
            return r1
        L75:
            com.wakeup.common.network.BaseResult r9 = (com.wakeup.common.network.BaseResult) r9     // Catch: java.lang.Exception -> La0
            java.lang.String r0 = "deviceGetPrayTextByServer code "
            int r1 = r9.getCode()     // Catch: java.lang.Exception -> La0
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)     // Catch: java.lang.Exception -> La0
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}     // Catch: java.lang.Exception -> La0
            com.wakeup.common.log.LogUtils.i(r3, r0)     // Catch: java.lang.Exception -> La0
            int r0 = r9.getCode()     // Catch: java.lang.Exception -> La0
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto Lae
            com.wakeup.module.religion.util.ReligionCacheHelper$Companion r0 = com.wakeup.module.religion.util.ReligionCacheHelper.INSTANCE     // Catch: java.lang.Exception -> La0
            java.lang.Object r1 = r9.getData()     // Catch: java.lang.Exception -> La0
            com.wakeup.common.network.entity.qibla.SceneContentList r1 = (com.wakeup.common.network.entity.qibla.SceneContentList) r1     // Catch: java.lang.Exception -> La0
            r0.saveSceneBySura(r8, r1)     // Catch: java.lang.Exception -> La0
            java.lang.Object r8 = r9.getData()     // Catch: java.lang.Exception -> La0
            return r8
        La0:
            r8 = move-exception
            java.lang.String r9 = "deviceGetPrayTextByServer "
            java.lang.String r8 = r8.toString()
            java.lang.Object[] r8 = new java.lang.Object[]{r9, r8}
            com.wakeup.common.log.LogUtils.e(r3, r8)
        Lae:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.religion.util.PraySceneHelper.deviceGetPrayTextByServer(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final SceneContentList convertRepeatData(SceneContentList data) {
        List<SceneContentBean> list = data.getList();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            SceneContentBean sceneContentBean = list.get(i2);
            if (i == sceneContentBean.getAyaId()) {
                StringBuffer stringBuffer = new StringBuffer();
                SceneContentBean sceneContentBean2 = (SceneContentBean) arrayList.get(arrayList.size() - 1);
                stringBuffer.append(sceneContentBean2.getContent());
                stringBuffer.append("\n");
                stringBuffer.append(sceneContentBean.getContent());
                sceneContentBean2.setContent(stringBuffer.toString());
            } else {
                i = sceneContentBean.getAyaId();
                arrayList.add(sceneContentBean);
            }
        }
        return new SceneContentList(arrayList.size(), arrayList);
    }

    public final List<PraySceneSuraBean> filterTagSura(int tag, List<PraySceneSuraBean> suraList) {
        Intrinsics.checkNotNullParameter(suraList, "suraList");
        if (CollectionUtils.isEmpty(suraList)) {
            return new ArrayList();
        }
        if (tag == 1) {
            return suraList;
        }
        ArrayList arrayList = new ArrayList();
        for (PraySceneSuraBean praySceneSuraBean : suraList) {
            if (praySceneSuraBean.getTag() == tag) {
                arrayList.add(praySceneSuraBean);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deviceGetContent(android.content.Context r25, int r26, int r27, int r28, int r29, int r30, kotlin.coroutines.Continuation<? super com.wakeup.module.religion.util.PraySceneHelper.SceneReadBookmark> r31) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.religion.util.PraySceneHelper.deviceGetContent(android.content.Context, int, int, int, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final List<String> getParagraphs(SceneContentBean paragraph) {
        String content = paragraph.getContent();
        ArrayList arrayList = new ArrayList();
        if (content.length() < 300) {
            arrayList.add(content);
            return arrayList;
        }
        int i = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, content.length(), 300);
        if (progressionLastElement >= 0) {
            while (true) {
                int length = content.length() - i;
                if (length > 300) {
                    length = 300;
                }
                arrayList.add(content.subSequence(i, length + i).toString());
                if (i == progressionLastElement) {
                    break;
                }
                i += 300;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object optionNext(android.content.Context r14, int r15, int r16, int r17, int r18, com.wakeup.common.network.entity.qibla.SceneContentList r19, com.wakeup.module.religion.util.PraySceneHelper.SceneReadBookmark r20, kotlin.coroutines.Continuation<? super com.wakeup.module.religion.util.PraySceneHelper.SceneReadBookmark> r21) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.religion.util.PraySceneHelper.optionNext(android.content.Context, int, int, int, int, com.wakeup.common.network.entity.qibla.SceneContentList, com.wakeup.module.religion.util.PraySceneHelper$SceneReadBookmark, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object optionPrevious(android.content.Context r8, int r9, int r10, int r11, int r12, com.wakeup.common.network.entity.qibla.SceneContentList r13, com.wakeup.module.religion.util.PraySceneHelper.SceneReadBookmark r14, kotlin.coroutines.Continuation<? super com.wakeup.module.religion.util.PraySceneHelper.SceneReadBookmark> r15) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.religion.util.PraySceneHelper.optionPrevious(android.content.Context, int, int, int, int, com.wakeup.common.network.entity.qibla.SceneContentList, com.wakeup.module.religion.util.PraySceneHelper$SceneReadBookmark, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final SceneReadBookmark optionCurrent(int position, int paragraphIndex, int sura, SceneContentList koran) {
        if (paragraphIndex > koran.getTotal()) {
            LogUtils.w(TAG, "optionCurrent paragraphIndex Excessive size");
            return new SceneReadBookmark(sura, paragraphIndex, position, "");
        }
        List<String> paragraphs = getParagraphs(koran.getList().get(paragraphIndex));
        if (position > paragraphs.size()) {
            LogUtils.w(TAG, "optionCurrent position Excessive size");
            return new SceneReadBookmark(sura, paragraphIndex + 1, position + 1, "");
        }
        return new SceneReadBookmark(sura, paragraphIndex + 1, position + 1, paragraphs.get(position));
    }

    private final int sceneNextSuraId(Context context, int tag, int sura) {
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, getPraySceneSuraConfig$default(this, context, false, 2, null));
        List<PraySceneSuraBean> filterTagSura = filterTagSura(tag, arrayList);
        int size = filterTagSura.size();
        for (int i = 0; i < size; i++) {
            if (sura - 1 == i) {
                int i2 = i + 1;
                if (i2 >= filterTagSura.size()) {
                    return -1;
                }
                return filterTagSura.get(i2).getSura();
            }
        }
        return -1;
    }

    public final int sceneNextSuraPosition(Context context, int tag, int sura) {
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, getPraySceneSuraConfig$default(this, context, false, 2, null));
        return sura >= filterTagSura(tag, arrayList).size() ? -1 : 1;
    }

    private final int sceneSuraId(Context context, int tag, int sura) {
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, getPraySceneSuraConfig$default(this, context, false, 2, null));
        List<PraySceneSuraBean> filterTagSura = filterTagSura(tag, arrayList);
        int size = filterTagSura.size();
        for (int i = 0; i < size; i++) {
            if (i == sura - 1) {
                return filterTagSura.get(i).getSura();
            }
        }
        return -1;
    }

    private final int scenePreviousSuraId(Context context, int tag, int sura) {
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, getPraySceneSuraConfig$default(this, context, false, 2, null));
        List<PraySceneSuraBean> filterTagSura = filterTagSura(tag, arrayList);
        int size = filterTagSura.size();
        for (int i = 0; i < size; i++) {
            if (sura - 1 == i) {
                int i2 = i - 1;
                if (i2 < 0) {
                    return -1;
                }
                return filterTagSura.get(i2).getSura();
            }
        }
        return -1;
    }

    public static /* synthetic */ PraySceneBean[] getPraySceneConfig$default(PraySceneHelper praySceneHelper, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return praySceneHelper.getPraySceneConfig(context, z);
    }

    public final PraySceneBean[] getPraySceneConfig(Context context, boolean isDevice) {
        Intrinsics.checkNotNullParameter(context, "context");
        StringBuilder sb = new StringBuilder();
        try {
            InputStream open = context.getResources().getAssets().open("DuasScene.json");
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
        PraySceneBean[] praySceneBeanArr = (PraySceneBean[]) GsonUtils.fromJson(sb2, PraySceneBean[].class);
        Intrinsics.checkNotNull(praySceneBeanArr);
        sceneConfigConvert(context, praySceneBeanArr, isDevice);
        return praySceneBeanArr;
    }

    private final void sceneConfigConvert(Context context, PraySceneBean[] configArray, boolean isDevice) {
        Locale locale;
        if (isDevice) {
            locale = new Locale(a.X, "Arabic");
        } else {
            locale = Locale.getDefault();
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        int length = configArray.length;
        for (int i = 0; i < length; i++) {
            configArray[i].setTitle(context.createConfigurationContext(configuration).getResources().getString(sceneNames[i].intValue()));
        }
    }

    private final void sceneSuraConfigConvert(Context context, PraySceneSuraBean[] configArray, boolean isDevice) {
        Locale locale;
        if (isDevice) {
            locale = new Locale(a.X, "Arabic");
        } else {
            locale = Locale.getDefault();
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        int length = configArray.length;
        for (int i = 0; i < length; i++) {
            configArray[i].setTitle(context.createConfigurationContext(configuration).getResources().getString(sceneSuraNames[i].intValue()));
        }
    }

    public static /* synthetic */ PraySceneSuraBean[] getPraySceneSuraConfig$default(PraySceneHelper praySceneHelper, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return praySceneHelper.getPraySceneSuraConfig(context, z);
    }

    public final PraySceneSuraBean[] getPraySceneSuraConfig(Context context, boolean isDevice) {
        Intrinsics.checkNotNullParameter(context, "context");
        StringBuilder sb = new StringBuilder();
        try {
            InputStream open = context.getResources().getAssets().open("DuasSura.json");
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
        PraySceneSuraBean[] praySceneSuraBeanArr = (PraySceneSuraBean[]) GsonUtils.fromJson(sb2, PraySceneSuraBean[].class);
        Intrinsics.checkNotNull(praySceneSuraBeanArr);
        sceneSuraConfigConvert(context, praySceneSuraBeanArr, isDevice);
        return praySceneSuraBeanArr;
    }

    public final DeviceSceneBean deviceGetScenes(Context context, int page) {
        Intrinsics.checkNotNullParameter(context, "context");
        LogUtils.i(TAG, "deviceGetScenes page ", Integer.valueOf(page));
        ArrayList arrayList = new ArrayList();
        PraySceneBean[] praySceneConfig = getPraySceneConfig(context, true);
        int i = page * 6;
        int i2 = i < praySceneConfig.length ? 0 : 1;
        int length = praySceneConfig.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (i3 < i) {
                arrayList.add(praySceneConfig[i3].getTitle());
            }
        }
        if (page == 2) {
            arrayList = arrayList.subList(6, arrayList.size());
        }
        return new DeviceSceneBean(i2, arrayList);
    }

    public final String getSceneSuraTitle(Context context, int tag, int suraId) {
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, getPraySceneSuraConfig(context, true));
        List<PraySceneSuraBean> filterTagSura = filterTagSura(tag, arrayList);
        int size = filterTagSura.size();
        for (int i = 0; i < size; i++) {
            if (i == suraId - 1) {
                return filterTagSura.get(i).getTitle();
            }
        }
        return "";
    }

    /* compiled from: PraySceneHelper.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/wakeup/module/religion/util/PraySceneHelper$DeviceSceneBean;", "", "isLast", "", "scenes", "", "", "<init>", "(ILjava/util/List;)V", "()I", "setLast", "(I)V", "getScenes", "()Ljava/util/List;", "setScenes", "(Ljava/util/List;)V", "toString", "feature-religion_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DeviceSceneBean {
        private int isLast;
        private List<String> scenes;

        public DeviceSceneBean(int i, List<String> scenes) {
            Intrinsics.checkNotNullParameter(scenes, "scenes");
            this.isLast = i;
            this.scenes = scenes;
        }

        public final List<String> getScenes() {
            return this.scenes;
        }

        /* renamed from: isLast, reason: from getter */
        public final int getIsLast() {
            return this.isLast;
        }

        public final void setLast(int i) {
            this.isLast = i;
        }

        public final void setScenes(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.scenes = list;
        }

        public String toString() {
            return "DeviceSceneBean(isLast=" + this.isLast + ", scenes=" + this.scenes + Separators.RPAREN;
        }
    }

    /* compiled from: PraySceneHelper.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0014\u001a\u00020\u0007H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/wakeup/module/religion/util/PraySceneHelper$SceneReadBookmark;", "", "completeSura", "", "completeParagraph", "completePosition", "curContent", "", "<init>", "(IIILjava/lang/String;)V", "getCompleteSura", "()I", "setCompleteSura", "(I)V", "getCompleteParagraph", "setCompleteParagraph", "getCompletePosition", "setCompletePosition", "getCurContent", "()Ljava/lang/String;", "toString", "feature-religion_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SceneReadBookmark {
        private int completeParagraph;
        private int completePosition;
        private int completeSura;
        private final String curContent;

        public SceneReadBookmark(int i, int i2, int i3, String curContent) {
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

        public /* synthetic */ SceneReadBookmark(int i, int i2, int i3, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, i3, (i4 & 8) != 0 ? "" : str);
        }

        public final String getCurContent() {
            return this.curContent;
        }

        public String toString() {
            return "SceneReadBookmark(completeSura=" + this.completeSura + ", completeParagraph=" + this.completeParagraph + ", completePosition=" + this.completePosition + ", curContent='" + this.curContent + "')";
        }
    }
}
