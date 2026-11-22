package com.wakeup.common.network.entity.health;

import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;

/* compiled from: StepShareBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/wakeup/common/network/entity/health/StepShareBean;", "", "<init>", "()V", "records", "", "Lcom/wakeup/common/network/entity/health/StepShareBean$StepShareDetailBean;", "getRecords", "()Ljava/util/List;", "total", "", "getTotal", "()I", "size", "getSize", "current", "getCurrent", "StepShareDetailBean", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StepShareBean {
    private final int current;
    private final List<StepShareDetailBean> records;
    private final int size;
    private final int total;

    public final List<StepShareDetailBean> getRecords() {
        return this.records;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getCurrent() {
        return this.current;
    }

    /* compiled from: StepShareBean.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/wakeup/common/network/entity/health/StepShareBean$StepShareDetailBean;", "", "<init>", "()V", "alt", "", "getAlt", "()Ljava/lang/String;", SocialConstants.PARAM_IMG_URL, "getImg", "thumbnail", "getThumbnail", "select", "", "getSelect", "()Z", "setSelect", "(Z)V", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StepShareDetailBean {
        private boolean select;
        private final String alt = "";
        private final String img = "";
        private final String thumbnail = "";

        public final String getAlt() {
            return this.alt;
        }

        public final String getImg() {
            return this.img;
        }

        public final String getThumbnail() {
            return this.thumbnail;
        }

        public final boolean getSelect() {
            return this.select;
        }

        public final void setSelect(boolean z) {
            this.select = z;
        }
    }
}
