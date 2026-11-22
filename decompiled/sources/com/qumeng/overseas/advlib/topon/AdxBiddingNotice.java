package com.qumeng.overseas.advlib.topon;

import android.util.Log;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBiddingNotice;
import com.qumeng.overseas.advlib.core.IMultiAdObject;
import java.util.Map;

/* loaded from: classes17.dex */
public class AdxBiddingNotice implements ATBiddingNotice {
    private final String TAG = "AdxBiddingNotice";
    IMultiAdObject multiAdObject;

    public AdxBiddingNotice(IMultiAdObject iMultiAdObject) {
        this.multiAdObject = iMultiAdObject;
    }

    @Override // com.anythink.core.api.ATBiddingNotice
    public ATAdConst.CURRENCY getNoticePriceCurrency() {
        return ATAdConst.CURRENCY.USD;
    }

    @Override // com.anythink.core.api.ATBiddingNotice
    public void notifyBidDisplay(boolean z, double d) {
        Log.d(this.TAG, "notifyBidDisplay: isWinner:" + z + " displayPrice:" + d);
    }

    @Override // com.anythink.core.api.ATBiddingNotice
    public void notifyBidLoss(String str, double d, Map<String, Object> map) {
        Log.d(this.TAG, "notifyBidLoss: lossCode " + str + "  winPrice " + d);
        this.multiAdObject.lossNotice((int) (d * 100.0d), str, "");
    }

    @Override // com.anythink.core.api.ATBiddingNotice
    public void notifyBidWin(double d, double d2, Map<String, Object> map) {
        Log.d(this.TAG, "notifyBidWin: costPrice " + d + "  secondPrice " + d2);
        this.multiAdObject.winNotice((int) (d2 * 100.0d));
    }
}
