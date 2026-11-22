package com.wakeup.module.jacket.bean;

import com.umeng.analytics.AnalyticsConfig;
import com.wakeup.common.network.entity.ai.AiLanguage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LiveHistoryBean.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/wakeup/module/jacket/bean/LiveHistoryBean;", "", "<init>", "()V", "id", "", "getId", "()I", "setId", "(I)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", AnalyticsConfig.RTD_START_TIME, "", "getStartTime", "()J", "setStartTime", "(J)V", "sourceLan", "Lcom/wakeup/common/network/entity/ai/AiLanguage;", "getSourceLan", "()Lcom/wakeup/common/network/entity/ai/AiLanguage;", "setSourceLan", "(Lcom/wakeup/common/network/entity/ai/AiLanguage;)V", "transLan", "getTransLan", "setTransLan", "data", "", "Lcom/wakeup/module/jacket/bean/LiveChatEntity;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "feature-jacket_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LiveHistoryBean {
    private int id;
    private long startTime;
    private String name = "";
    private AiLanguage sourceLan = new AiLanguage(0, null, null, null, 0, 0, 0, 0, null, 511, null);
    private AiLanguage transLan = new AiLanguage(0, null, null, null, 0, 0, 0, 0, null, 511, null);
    private List<LiveChatEntity> data = new ArrayList();

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final AiLanguage getSourceLan() {
        return this.sourceLan;
    }

    public final void setSourceLan(AiLanguage aiLanguage) {
        Intrinsics.checkNotNullParameter(aiLanguage, "<set-?>");
        this.sourceLan = aiLanguage;
    }

    public final AiLanguage getTransLan() {
        return this.transLan;
    }

    public final void setTransLan(AiLanguage aiLanguage) {
        Intrinsics.checkNotNullParameter(aiLanguage, "<set-?>");
        this.transLan = aiLanguage;
    }

    public final List<LiveChatEntity> getData() {
        return this.data;
    }

    public final void setData(List<LiveChatEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }
}
