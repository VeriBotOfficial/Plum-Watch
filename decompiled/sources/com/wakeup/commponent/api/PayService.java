package com.wakeup.commponent.api;

import android.app.Activity;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.network.BaseResult;
import com.wakeup.commponent.module.pay.NewPayWayEnum;
import com.wakeup.commponent.module.pay.PayWayEnum;
import com.wakeup.feature.user.constant.UserConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: PayService.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001JJ\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\u0004\u0012\u00020\u00030\u000eH&JL\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\u0004\u0012\u00020\u00030\u000eH&JL\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\u0004\u0012\u00020\u00030\u000eH&J_\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0018\u001a\u00020\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\u0004\u0012\u00020\u00030\u000eH&¢\u0006\u0002\u0010\u001bJ:\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00132\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\u0004\u0012\u00020\u00030\u000eH&JB\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u00132\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\u0004\u0012\u00020\u00030\u000eH&J\u001c\u0010!\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eH&J$\u0010\"\u001a\u00020\u00032\u001a\u0010#\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eH&J:\u0010$\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u00132\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\u0004\u0012\u00020\u00030\u000eH&J:\u0010&\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00132\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\u0004\u0012\u00020\u00030\u000eH&¨\u0006("}, d2 = {"Lcom/wakeup/commponent/api/PayService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "aiVipPay", "", Const.STR_PROCESS_TAG, "Landroid/app/Activity;", "orderFrom", "", "period", "", "aiMemberType", "payWayEnum", "Lcom/wakeup/commponent/module/pay/NewPayWayEnum;", "callback", "Lkotlin/Function1;", "Lcom/wakeup/common/network/BaseResult;", "vipPay", "membersKindId", "membersTypeId", "Lcom/wakeup/commponent/module/pay/PayWayEnum;", "extend", "vipSignPay", "dialPay", UserConstants.DIAL_ID, "fromLadder", "benefitId", "", "(Landroid/app/Activity;ILcom/wakeup/commponent/module/pay/PayWayEnum;Ljava/lang/String;ILjava/lang/Long;Lkotlin/jvm/functions/Function1;)V", "guardPay", "guardProductId", "menuPay", "menuId", "equipmentId", "getCurrentCallBack", "setCurrentCallBack", "payCallback", "ringPay", "musicId", "aiEnergyPay", "packageId", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PayService extends IProvider {
    void aiEnergyPay(Activity activity, int packageId, PayWayEnum payWayEnum, Function1<? super BaseResult<String>, Unit> callback);

    void aiVipPay(Activity activity, String orderFrom, int period, String aiMemberType, NewPayWayEnum payWayEnum, Function1<? super BaseResult<String>, Unit> callback);

    void dialPay(Activity activity, int dialId, PayWayEnum payWayEnum, String extend, int fromLadder, Long benefitId, Function1<? super BaseResult<String>, Unit> callback);

    Function1<BaseResult<String>, Unit> getCurrentCallBack();

    void guardPay(Activity activity, String guardProductId, PayWayEnum payWayEnum, Function1<? super BaseResult<String>, Unit> callback);

    void menuPay(Activity activity, long menuId, long equipmentId, PayWayEnum payWayEnum, Function1<? super BaseResult<String>, Unit> callback);

    void ringPay(Activity activity, long musicId, PayWayEnum payWayEnum, Function1<? super BaseResult<String>, Unit> callback);

    void setCurrentCallBack(Function1<? super BaseResult<String>, Unit> payCallback);

    void vipPay(Activity activity, int membersKindId, int membersTypeId, PayWayEnum payWayEnum, String extend, Function1<? super BaseResult<String>, Unit> callback);

    void vipSignPay(Activity activity, int membersKindId, int membersTypeId, PayWayEnum payWayEnum, String extend, Function1<? super BaseResult<String>, Unit> callback);

    /* compiled from: PayService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void dialPay$default(PayService payService, Activity activity, int i, PayWayEnum payWayEnum, String str, int i2, Long l, Function1 function1, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dialPay");
            }
            if ((i3 & 16) != 0) {
                i2 = 0;
            }
            int i4 = i2;
            if ((i3 & 32) != 0) {
                l = null;
            }
            payService.dialPay(activity, i, payWayEnum, str, i4, l, function1);
        }
    }
}
