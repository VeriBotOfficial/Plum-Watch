package com.wakeup.module.data.sync;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.wakeup.common.burypoint.BaseExtendInfo;
import com.wakeup.module.data.entity.HealthOssUploadBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthUpLoadManager.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u0006H\u0016R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/wakeup/module/data/sync/HealthSleepExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "dataList", "", "Lcom/wakeup/module/data/entity/HealthOssUploadBean$SleepPoint;", "launchId", "", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "toString", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HealthSleepExtendInfo extends BaseExtendInfo {
    private List<HealthOssUploadBean.SleepPoint> dataList;

    public final List<HealthOssUploadBean.SleepPoint> getDataList() {
        return this.dataList;
    }

    public final void setDataList(List<HealthOssUploadBean.SleepPoint> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthSleepExtendInfo(List<HealthOssUploadBean.SleepPoint> dataList, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.dataList = dataList;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "HealthSleepExtendInfo(dataList=" + this.dataList + ", launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
