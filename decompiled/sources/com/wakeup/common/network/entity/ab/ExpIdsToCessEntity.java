package com.wakeup.common.network.entity.ab;

import java.util.List;
import kotlin.Metadata;

/* compiled from: ExpIdsToCessEntity.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/wakeup/common/network/entity/ab/ExpIdsToCessEntity;", "", "sceneId", "", "expIds", "", "requestTime", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)V", "getSceneId", "()Ljava/lang/String;", "getExpIds", "()Ljava/util/List;", "getRequestTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExpIdsToCessEntity {
    private final List<String> expIds;
    private final Long requestTime;
    private final String sceneId;

    public ExpIdsToCessEntity(String str, List<String> list, Long l) {
        this.sceneId = str;
        this.expIds = list;
        this.requestTime = l;
    }

    public final String getSceneId() {
        return this.sceneId;
    }

    public final List<String> getExpIds() {
        return this.expIds;
    }

    public final Long getRequestTime() {
        return this.requestTime;
    }
}
