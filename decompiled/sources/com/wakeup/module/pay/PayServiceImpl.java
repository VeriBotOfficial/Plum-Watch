package com.wakeup.module.pay;

import android.app.Activity;
import android.content.Context;
import com.alipay.sdk.m.m.b;
import com.autonavi.aps.amapapi.config.Const;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.wakeup.common.dfx.PayFeedbackLogHelper;
import com.wakeup.common.network.BaseResult;
import com.wakeup.common.utils.ToastUtils;
import com.wakeup.commponent.api.PayService;
import com.wakeup.commponent.module.pay.NewPayWayEnum;
import com.wakeup.commponent.module.pay.PayWayEnum;
import com.wakeup.feature.user.constant.UserConstants;
import com.wakeup.module.pay.aipay.AIPayManager;
import com.wakeup.module.pay.aliPay.AliPayMgr;
import com.wakeup.module.pay.paypal.PaypalPayMgr;
import com.wakeup.module.pay.stripe.StripePayMgr;
import com.wakeup.module.pay.wxpay.WeChatPayMgr;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PayServiceImpl.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tH\u0016J$\u0010\r\u001a\u00020\u00052\u001a\u0010\u000e\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0012H\u0002JD\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00050\tH\u0002JJ\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00122\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00050\tH\u0016JL\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\u000b2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00050\tH\u0016JL\u0010!\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\u000b2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00050\tH\u0016J[\u0010\"\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\u000b2\u0006\u0010$\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010&2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00050\tH\u0016¢\u0006\u0002\u0010'J:\u0010(\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00050\tH\u0016JB\u0010*\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00050\tH\u0016J:\u0010-\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010.\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00050\tH\u0016J:\u0010/\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00050\tH\u0016R\"\u0010\b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/wakeup/module/pay/PayServiceImpl;", "Lcom/wakeup/commponent/api/PayService;", "<init>", "()V", "init", "", "context", "Landroid/content/Context;", "payCallback", "Lkotlin/Function1;", "Lcom/wakeup/common/network/BaseResult;", "", "getCurrentCallBack", "setCurrentCallBack", "callback", "payWayName", "payWayEnum", "Lcom/wakeup/commponent/module/pay/PayWayEnum;", "Lcom/wakeup/commponent/module/pay/NewPayWayEnum;", "wrapPay", b.l, "payWay", "aiVipPay", Const.STR_PROCESS_TAG, "Landroid/app/Activity;", "orderFrom", "period", "", "aiMemberType", "vipPay", "membersKindId", "membersTypeId", "extend", "vipSignPay", "dialPay", UserConstants.DIAL_ID, "fromLadder", "benefitId", "", "(Landroid/app/Activity;ILcom/wakeup/commponent/module/pay/PayWayEnum;Ljava/lang/String;ILjava/lang/Long;Lkotlin/jvm/functions/Function1;)V", "guardPay", "guardProductId", "menuPay", "menuId", "equipmentId", "ringPay", "musicId", "aiEnergyPay", "packageId", "module-pay_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PayServiceImpl implements PayService {
    private Function1<? super BaseResult<String>, Unit> payCallback;

    /* compiled from: PayServiceImpl.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PayWayEnum.values().length];
            try {
                iArr[PayWayEnum.WECAHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PayWayEnum.ALI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NewPayWayEnum.values().length];
            try {
                iArr2[NewPayWayEnum.WECAHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[NewPayWayEnum.ALI.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.wakeup.commponent.api.PayService
    public Function1<BaseResult<String>, Unit> getCurrentCallBack() {
        return this.payCallback;
    }

    @Override // com.wakeup.commponent.api.PayService
    public void setCurrentCallBack(Function1<? super BaseResult<String>, Unit> callback) {
        this.payCallback = callback;
    }

    private final String payWayName(PayWayEnum payWayEnum) {
        int i = WhenMappings.$EnumSwitchMapping$0[payWayEnum.ordinal()];
        if (i == 1) {
            return ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE;
        }
        if (i == 2) {
            return "alipay";
        }
        String lowerCase = payWayEnum.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final String payWayName(NewPayWayEnum payWayEnum) {
        int i = WhenMappings.$EnumSwitchMapping$1[payWayEnum.ordinal()];
        if (i == 1) {
            return ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE;
        }
        if (i == 2) {
            return "alipay";
        }
        String lowerCase = payWayEnum.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final Function1<BaseResult<String>, Unit> wrapPay(final String biz, final String payWay, final Function1<? super BaseResult<String>, Unit> callback) {
        PayFeedbackLogHelper.begin(biz, payWay);
        return new Function1() { // from class: com.wakeup.module.pay.PayServiceImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit wrapPay$lambda$0;
                wrapPay$lambda$0 = PayServiceImpl.wrapPay$lambda$0(biz, payWay, callback, (BaseResult) obj);
                return wrapPay$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wrapPay$lambda$0(String str, String str2, Function1 function1, BaseResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        PayFeedbackLogHelper.onResult(str, str2, result);
        function1.invoke(result);
        return Unit.INSTANCE;
    }

    @Override // com.wakeup.commponent.api.PayService
    public void aiVipPay(Activity activity, String orderFrom, int period, String aiMemberType, NewPayWayEnum payWayEnum, Function1<? super BaseResult<String>, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(orderFrom, "orderFrom");
        Intrinsics.checkNotNullParameter(aiMemberType, "aiMemberType");
        Intrinsics.checkNotNullParameter(payWayEnum, "payWayEnum");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (period >= 5) {
            new AIPayManager().aiPayAuto(activity, period, aiMemberType, payWayEnum, wrapPay(PayFeedbackLogHelper.BIZ_AI_VIP, payWayName(payWayEnum), callback));
        } else {
            new AIPayManager().aiPay(activity, orderFrom, period, aiMemberType, payWayEnum, wrapPay(PayFeedbackLogHelper.BIZ_AI_VIP, payWayName(payWayEnum), callback));
        }
    }

    @Override // com.wakeup.commponent.api.PayService
    public void vipPay(Activity activity, int membersKindId, int membersTypeId, PayWayEnum payWayEnum, String extend, Function1<? super BaseResult<String>, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(payWayEnum, "payWayEnum");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Function1<BaseResult<String>, Unit> wrapPay = wrapPay(PayFeedbackLogHelper.BIZ_VIP, payWayName(payWayEnum), callback);
        if (payWayEnum == PayWayEnum.ALI) {
            new AliPayMgr().vipPay(activity, membersKindId, membersTypeId, extend, wrapPay);
        } else if (payWayEnum == PayWayEnum.WECAHT) {
            new WeChatPayMgr().vipPay(activity, membersKindId, membersTypeId, extend, wrapPay);
        } else if (payWayEnum == PayWayEnum.PAYPAL) {
            new PaypalPayMgr().vipPay(activity, membersKindId, membersTypeId, extend, wrapPay);
        }
    }

    @Override // com.wakeup.commponent.api.PayService
    public void vipSignPay(Activity activity, int membersKindId, int membersTypeId, PayWayEnum payWayEnum, String extend, Function1<? super BaseResult<String>, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(payWayEnum, "payWayEnum");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (payWayEnum == PayWayEnum.ALI) {
            new AliPayMgr().vipSignPay(activity, membersKindId, membersTypeId, extend, wrapPay(PayFeedbackLogHelper.BIZ_VIP_SIGN, payWayName(payWayEnum), callback));
        } else {
            ToastUtils.showToast("暂不支持该支付方式");
        }
    }

    @Override // com.wakeup.commponent.api.PayService
    public void dialPay(Activity activity, int dialId, PayWayEnum payWayEnum, String extend, int fromLadder, Long benefitId, Function1<? super BaseResult<String>, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(payWayEnum, "payWayEnum");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Function1<BaseResult<String>, Unit> wrapPay = wrapPay(PayFeedbackLogHelper.BIZ_DIAL, payWayName(payWayEnum), callback);
        if (payWayEnum == PayWayEnum.ALI) {
            AliPayMgr aliPayMgr = new AliPayMgr();
            if (extend == null) {
                extend = "";
            }
            aliPayMgr.dialPay(activity, dialId, extend, fromLadder, benefitId, wrapPay);
            return;
        }
        if (payWayEnum == PayWayEnum.WECAHT) {
            WeChatPayMgr weChatPayMgr = new WeChatPayMgr();
            if (extend == null) {
                extend = "";
            }
            weChatPayMgr.dialPay(activity, dialId, extend, fromLadder, benefitId, wrapPay);
            return;
        }
        if (payWayEnum == PayWayEnum.PAYPAL) {
            PaypalPayMgr paypalPayMgr = new PaypalPayMgr();
            if (extend == null) {
                extend = "";
            }
            paypalPayMgr.dialPay(activity, dialId, extend, wrapPay);
            return;
        }
        if (payWayEnum == PayWayEnum.STRIPE) {
            StripePayMgr stripePayMgr = new StripePayMgr();
            if (extend == null) {
                extend = "";
            }
            stripePayMgr.dialPay(activity, dialId, extend, wrapPay);
        }
    }

    @Override // com.wakeup.commponent.api.PayService
    public void guardPay(Activity activity, String guardProductId, PayWayEnum payWayEnum, Function1<? super BaseResult<String>, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(guardProductId, "guardProductId");
        Intrinsics.checkNotNullParameter(payWayEnum, "payWayEnum");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Function1<BaseResult<String>, Unit> wrapPay = wrapPay(PayFeedbackLogHelper.BIZ_GUARD, payWayName(payWayEnum), callback);
        if (payWayEnum == PayWayEnum.ALI) {
            new AliPayMgr().guardPay(activity, guardProductId, wrapPay);
        } else if (payWayEnum == PayWayEnum.WECAHT) {
            new WeChatPayMgr().guardPay(activity, guardProductId, wrapPay);
        } else if (payWayEnum == PayWayEnum.PAYPAL) {
            new PaypalPayMgr().guardPay(activity, guardProductId, wrapPay);
        }
    }

    @Override // com.wakeup.commponent.api.PayService
    public void menuPay(Activity activity, long menuId, long equipmentId, PayWayEnum payWayEnum, Function1<? super BaseResult<String>, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(payWayEnum, "payWayEnum");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Function1<BaseResult<String>, Unit> wrapPay = wrapPay("menu", payWayName(payWayEnum), callback);
        if (payWayEnum == PayWayEnum.ALI) {
            new AliPayMgr().menuPay(activity, menuId, equipmentId, wrapPay);
            return;
        }
        if (payWayEnum == PayWayEnum.WECAHT) {
            new WeChatPayMgr().menuPay(activity, menuId, equipmentId, wrapPay);
        } else if (payWayEnum == PayWayEnum.PAYPAL) {
            new PaypalPayMgr().menuPay(activity, menuId, equipmentId, wrapPay);
        } else if (payWayEnum == PayWayEnum.STRIPE) {
            new StripePayMgr().menuPay(activity, menuId, equipmentId, wrapPay);
        }
    }

    @Override // com.wakeup.commponent.api.PayService
    public void ringPay(Activity activity, long musicId, PayWayEnum payWayEnum, Function1<? super BaseResult<String>, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(payWayEnum, "payWayEnum");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Function1<BaseResult<String>, Unit> wrapPay = wrapPay(PayFeedbackLogHelper.BIZ_RING, payWayName(payWayEnum), callback);
        if (payWayEnum == PayWayEnum.ALI) {
            new AliPayMgr().ringPay(activity, musicId, wrapPay);
            return;
        }
        if (payWayEnum == PayWayEnum.WECAHT) {
            new WeChatPayMgr().ringPay(activity, musicId, wrapPay);
        } else if (payWayEnum == PayWayEnum.PAYPAL) {
            new PaypalPayMgr().ringPay(activity, musicId, wrapPay);
        } else if (payWayEnum == PayWayEnum.STRIPE) {
            new StripePayMgr().ringPay(activity, musicId, wrapPay);
        }
    }

    @Override // com.wakeup.commponent.api.PayService
    public void aiEnergyPay(Activity activity, int packageId, PayWayEnum payWayEnum, Function1<? super BaseResult<String>, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(payWayEnum, "payWayEnum");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Function1<BaseResult<String>, Unit> wrapPay = wrapPay(PayFeedbackLogHelper.BIZ_AI_ENERGY, payWayName(payWayEnum), callback);
        if (payWayEnum == PayWayEnum.ALI) {
            new AliPayMgr().aiEnergyPay(activity, packageId, wrapPay);
        } else if (payWayEnum == PayWayEnum.WECAHT) {
            new WeChatPayMgr().aiEnergyPay(activity, packageId, wrapPay);
        } else if (payWayEnum == PayWayEnum.STRIPE) {
            new StripePayMgr().aiEnergyPay(activity, packageId, wrapPay);
        }
    }
}
