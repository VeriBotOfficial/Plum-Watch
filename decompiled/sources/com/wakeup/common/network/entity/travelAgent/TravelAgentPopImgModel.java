package com.wakeup.common.network.entity.travelAgent;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TravelAgentPopImgModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/travelAgent/TravelAgentPopImgModel;", "", "<init>", "()V", "guidePopimag", "Ljava/util/ArrayList;", "Lcom/wakeup/common/network/entity/travelAgent/TravelAgentPopImgBean;", "Lkotlin/collections/ArrayList;", "getGuidePopimag", "()Ljava/util/ArrayList;", "setGuidePopimag", "(Ljava/util/ArrayList;)V", "lbsPopImag", "getLbsPopImag", "()Lcom/wakeup/common/network/entity/travelAgent/TravelAgentPopImgBean;", "setLbsPopImag", "(Lcom/wakeup/common/network/entity/travelAgent/TravelAgentPopImgBean;)V", "agentIconUrl", "", "getAgentIconUrl", "()Ljava/lang/String;", "setAgentIconUrl", "(Ljava/lang/String;)V", "appletUrl", "getAppletUrl", "setAppletUrl", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelAgentPopImgModel {
    private ArrayList<TravelAgentPopImgBean> guidePopimag = new ArrayList<>();
    private TravelAgentPopImgBean lbsPopImag = new TravelAgentPopImgBean();
    private String agentIconUrl = "";
    private String appletUrl = "";

    public final ArrayList<TravelAgentPopImgBean> getGuidePopimag() {
        return this.guidePopimag;
    }

    public final void setGuidePopimag(ArrayList<TravelAgentPopImgBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.guidePopimag = arrayList;
    }

    public final TravelAgentPopImgBean getLbsPopImag() {
        return this.lbsPopImag;
    }

    public final void setLbsPopImag(TravelAgentPopImgBean travelAgentPopImgBean) {
        Intrinsics.checkNotNullParameter(travelAgentPopImgBean, "<set-?>");
        this.lbsPopImag = travelAgentPopImgBean;
    }

    public final String getAgentIconUrl() {
        return this.agentIconUrl;
    }

    public final void setAgentIconUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.agentIconUrl = str;
    }

    public final String getAppletUrl() {
        return this.appletUrl;
    }

    public final void setAppletUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appletUrl = str;
    }
}
