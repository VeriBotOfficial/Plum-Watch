package com.wakeup.common.temp.model;

import kotlin.Metadata;

/* compiled from: DeviceLoginQrModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/wakeup/common/temp/model/DeviceLoginQrModel;", "", "<init>", "()V", "analysisVersion", "", "getAnalysisVersion", "()I", "type", "", "getType", "()Ljava/lang/String;", "data", "Lcom/wakeup/common/temp/model/DeviceLoginQrModel$Data;", "getData", "()Lcom/wakeup/common/temp/model/DeviceLoginQrModel$Data;", "Data", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceLoginQrModel {
    private final int analysisVersion;
    private final Data data;
    private final String type;

    public final int getAnalysisVersion() {
        return this.analysisVersion;
    }

    public final String getType() {
        return this.type;
    }

    public final Data getData() {
        return this.data;
    }

    /* compiled from: DeviceLoginQrModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/wakeup/common/temp/model/DeviceLoginQrModel$Data;", "", "<init>", "()V", "uid", "", "getUid", "()Ljava/lang/String;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Data {
        private final String uid;

        public final String getUid() {
            return this.uid;
        }
    }
}
