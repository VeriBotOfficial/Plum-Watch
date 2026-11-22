package com.wakeup.feature.weilife.utils;

import android.content.Context;
import android.text.TextUtils;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.network.host.EvnMgr;
import com.wakeup.common.storage.UserDao;
import com.wakeup.common.utils.AdvConstance;
import com.wakeup.common.utils.ToastUtils;
import com.wakeup.commonui.R;
import com.wakeup.commponent.Navigator;
import com.wakeup.commponent.ServiceManager;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.commponent.module.bi.PageEventConstants;
import com.wakeup.commponent.module.bi.PageEventManager;
import com.wakeup.commponent.module.h5.H5Config;
import com.wakeup.commponent.module.h5.H5Service;
import com.wakeup.feature.weilife.js.GainRewardsJumpJsApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThirdJumpUtils.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0005J\u0016\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0005J\u0016\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/wakeup/feature/weilife/utils/ThirdJumpUtils;", "", "<init>", "()V", "TAG", "", "INTERNA_LURL_MY_PRIZE", "", "getINTERNA_LURL_MY_PRIZE", "()I", "INTERNA_LURL_CURRENT_POINTS", "getINTERNA_LURL_CURRENT_POINTS", "INTERNA_LURL_POINTS_RULES", "getINTERNA_LURL_POINTS_RULES", "jump", "", "context", "Landroid/content/Context;", "jumpType", "jumpTarget", "isOverseas", "", "jgqPosition", "extendId", "jumpInternalUrl", "url", "type", "getScore", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-weilife_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThirdJumpUtils {
    public static final ThirdJumpUtils INSTANCE = new ThirdJumpUtils();
    private static final String TAG = "ThirdJumpUtils";
    private static final int INTERNA_LURL_MY_PRIZE = 1;
    private static final int INTERNA_LURL_CURRENT_POINTS = 2;
    private static final int INTERNA_LURL_POINTS_RULES = 3;

    private ThirdJumpUtils() {
    }

    public final int getINTERNA_LURL_MY_PRIZE() {
        return INTERNA_LURL_MY_PRIZE;
    }

    public final int getINTERNA_LURL_CURRENT_POINTS() {
        return INTERNA_LURL_CURRENT_POINTS;
    }

    public final int getINTERNA_LURL_POINTS_RULES() {
        return INTERNA_LURL_POINTS_RULES;
    }

    public static /* synthetic */ void jump$default(ThirdJumpUtils thirdJumpUtils, Context context, int i, String str, boolean z, int i2, String str2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i3 & 16) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        if ((i3 & 32) != 0) {
            str2 = "";
        }
        thirdJumpUtils.jump(context, i, str, z2, i4, str2);
    }

    public final void jump(Context context, int jumpType, String jumpTarget, boolean isOverseas, int jgqPosition, String extendId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jumpTarget, "jumpTarget");
        Intrinsics.checkNotNullParameter(extendId, "extendId");
        LogUtils.i(TAG, "jumpType ", Integer.valueOf(jumpType), " target ", jumpTarget, " jgq ", Integer.valueOf(jgqPosition));
        if (jgqPosition > -1) {
            if (!isOverseas) {
                PageEventManager.get().onEventMessage(PageEventConstants.WEI_LIFE_JUMP_01, String.valueOf(jgqPosition));
            } else {
                PageEventManager.get().onEventMessage(PageEventConstants.WEI_LIFE_OVERSEAS_JUMP_01, String.valueOf(jgqPosition));
            }
        }
        if (jumpType == 0) {
            return;
        }
        if (jumpType == 1) {
            jumpInternalUrl(context, jumpTarget);
            return;
        }
        if (jumpType == 2) {
            return;
        }
        if (jumpType == 3) {
            if (Intrinsics.areEqual(jumpTarget, AdvConstance.WELFARE_MALL)) {
                Navigator.start(context, PagePath.PAGE_MY_INTEGRAL_SHOPPING_MALL);
                return;
            }
            return;
        }
        if (jumpType != 5) {
            if (jumpType == 6) {
                H5Service h5Service = ServiceManager.getH5Service();
                H5Config build = new H5Config.Builder().setTitle(null).addApi(new GainRewardsJumpJsApi()).setUrl(jumpTarget + "?token=" + UserDao.getToken()).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                h5Service.open(context, build);
                return;
            }
            ToastUtils.showToast(context.getString(R.string.w_life_jump_toast));
            return;
        }
        WawaClubHelper wawaClubHelper = WawaClubHelper.INSTANCE;
        String uid = UserDao.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        String nickname = UserDao.getUser().getNickname();
        Intrinsics.checkNotNullExpressionValue(nickname, "getNickname(...)");
        String avatar = UserDao.getUser().getAvatar();
        Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
        String wawaClubH5Url = wawaClubHelper.getWawaClubH5Url(jumpTarget, uid, nickname, avatar);
        H5Service h5Service2 = ServiceManager.getH5Service();
        H5Config build2 = new H5Config.Builder().setTitle(null).setUrl(wawaClubH5Url).build();
        Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
        h5Service2.open(context, build2);
    }

    public final void jumpInternalUrl(Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        if (TextUtils.isEmpty(url)) {
            LogUtils.w(TAG, " jumpInternalUrl jumpTarget is empty");
            return;
        }
        H5Service h5Service = ServiceManager.getH5Service();
        H5Config build = new H5Config.Builder().setTitle(null).addApi(new GainRewardsJumpJsApi()).setUrl(url).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        h5Service.open(context, build);
    }

    public final void jumpInternalUrl(Context context, int type) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(context, "context");
        if (type == INTERNA_LURL_MY_PRIZE) {
            if (EvnMgr.isTest()) {
                str3 = "https://test.iwhopro.com/micro-life/myPrizeIndex?token=" + UserDao.getToken();
            } else {
                str3 = "https://api-cluster.iwhop.cn/micro-life/myPrizeIndex?token=" + UserDao.getToken();
            }
            jump$default(this, context, 1, str3, false, 0, null, 56, null);
            return;
        }
        if (type == INTERNA_LURL_CURRENT_POINTS) {
            if (EvnMgr.isTest()) {
                str2 = "https://test.iwhopro.com/micro-life/pointBreakdownIndex?token=" + UserDao.getToken();
            } else {
                str2 = "https://api-cluster.iwhop.cn/micro-life/pointBreakdownIndex?token=" + UserDao.getToken();
            }
            jump$default(this, context, 1, str2, false, 0, null, 56, null);
            return;
        }
        if (type == INTERNA_LURL_POINTS_RULES) {
            if (EvnMgr.isTest()) {
                str = "https://test.iwhopro.com/micro-life/pointsRulesIndex";
            } else {
                str = "https://api-cluster.iwhop.cn/micro-life/pointsRulesIndex";
            }
            jump$default(this, context, 1, str, false, 0, null, 56, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055 A[Catch: Exception -> 0x0073, TRY_LEAVE, TryCatch #0 {Exception -> 0x0073, blocks: (B:10:0x0028, B:11:0x004a, B:15:0x0055, B:21:0x0037), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getScore(kotlin.coroutines.Continuation<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.wakeup.feature.weilife.utils.ThirdJumpUtils$getScore$1
            if (r0 == 0) goto L14
            r0 = r6
            com.wakeup.feature.weilife.utils.ThirdJumpUtils$getScore$1 r0 = (com.wakeup.feature.weilife.utils.ThirdJumpUtils$getScore$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            com.wakeup.feature.weilife.utils.ThirdJumpUtils$getScore$1 r0 = new com.wakeup.feature.weilife.utils.ThirdJumpUtils$getScore$1
            r0.<init>(r5, r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            java.lang.String r3 = "0"
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L73
            goto L4a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            com.wakeup.common.network.RetrofitManager$Companion r6 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> L73
            com.wakeup.common.network.RetrofitManager r6 = r6.getInstance()     // Catch: java.lang.Exception -> L73
            com.wakeup.common.network.api.MyApService r6 = r6.getApiMyApService()     // Catch: java.lang.Exception -> L73
            r0.label = r4     // Catch: java.lang.Exception -> L73
            java.lang.Object r6 = r6.getTotalScore(r0)     // Catch: java.lang.Exception -> L73
            if (r6 != r1) goto L4a
            return r1
        L4a:
            com.wakeup.common.network.BaseResult r6 = (com.wakeup.common.network.BaseResult) r6     // Catch: java.lang.Exception -> L73
            int r0 = r6.getCode()     // Catch: java.lang.Exception -> L73
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L55
            return r3
        L55:
            java.lang.String r0 = com.wakeup.feature.weilife.utils.ThirdJumpUtils.TAG     // Catch: java.lang.Exception -> L73
            java.lang.String r1 = "getScore "
            java.lang.Object r2 = r6.getData()     // Catch: java.lang.Exception -> L73
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}     // Catch: java.lang.Exception -> L73
            com.wakeup.common.log.LogUtils.i(r0, r1)     // Catch: java.lang.Exception -> L73
            java.lang.Object r6 = r6.getData()     // Catch: java.lang.Exception -> L73
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Exception -> L73
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L73
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> L73
            return r6
        L73:
            java.lang.String r6 = com.wakeup.feature.weilife.utils.ThirdJumpUtils.TAG
            java.lang.String r0 = "getScore interface err"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.wakeup.common.log.LogUtils.e(r6, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.weilife.utils.ThirdJumpUtils.getScore(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
