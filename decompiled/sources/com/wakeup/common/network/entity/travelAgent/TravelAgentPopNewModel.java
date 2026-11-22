package com.wakeup.common.network.entity.travelAgent;

import com.anythink.core.common.m.b.g;
import kotlin.Metadata;

/* compiled from: TravelAgentPopNewModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/travelAgent/TravelAgentPopNewModel;", "", "<init>", "()V", "popimage", "Lcom/wakeup/common/network/entity/travelAgent/TravelAgentPopImageInfoModel;", "getPopimage", "()Lcom/wakeup/common/network/entity/travelAgent/TravelAgentPopImageInfoModel;", "setPopimage", "(Lcom/wakeup/common/network/entity/travelAgent/TravelAgentPopImageInfoModel;)V", g.h, "Lcom/wakeup/common/network/entity/travelAgent/TravelAgentInfoBean;", "getAgent", "()Lcom/wakeup/common/network/entity/travelAgent/TravelAgentInfoBean;", "setAgent", "(Lcom/wakeup/common/network/entity/travelAgent/TravelAgentInfoBean;)V", "display", "", "getDisplay", "()Z", "setDisplay", "(Z)V", "extra", "Lcom/wakeup/common/network/entity/travelAgent/TravelAgentExtraBean;", "getExtra", "()Lcom/wakeup/common/network/entity/travelAgent/TravelAgentExtraBean;", "setExtra", "(Lcom/wakeup/common/network/entity/travelAgent/TravelAgentExtraBean;)V", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelAgentPopNewModel {
    private TravelAgentInfoBean agent;
    private boolean display;
    private TravelAgentExtraBean extra;
    private TravelAgentPopImageInfoModel popimage;

    public final TravelAgentPopImageInfoModel getPopimage() {
        return this.popimage;
    }

    public final void setPopimage(TravelAgentPopImageInfoModel travelAgentPopImageInfoModel) {
        this.popimage = travelAgentPopImageInfoModel;
    }

    public final TravelAgentInfoBean getAgent() {
        return this.agent;
    }

    public final void setAgent(TravelAgentInfoBean travelAgentInfoBean) {
        this.agent = travelAgentInfoBean;
    }

    public final boolean getDisplay() {
        return this.display;
    }

    public final void setDisplay(boolean z) {
        this.display = z;
    }

    public final TravelAgentExtraBean getExtra() {
        return this.extra;
    }

    public final void setExtra(TravelAgentExtraBean travelAgentExtraBean) {
        this.extra = travelAgentExtraBean;
    }
}
