package com.wakeup.module.ai.robot;

import com.alipay.sdk.m.c0.d;
import com.wakeup.common.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatHistory.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/wakeup/module/ai/robot/ChatHistory;", "", "id", "", "title", "", Constants.BundleKey.TIMESTAMP, "data", "", "Lcom/wakeup/module/ai/robot/ChatEntity;", "<init>", "(JLjava/lang/String;JLjava/util/List;)V", "getId", "()J", "setId", "(J)V", "getTitle", "()Ljava/lang/String;", d.p, "(Ljava/lang/String;)V", "getTimeStamp", "setTimeStamp", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChatHistory {
    private List<ChatEntity> data;
    private long id;
    private long timeStamp;
    private String title;

    public ChatHistory() {
        this(0L, null, 0L, null, 15, null);
    }

    public ChatHistory(long j, String title, long j2, List<ChatEntity> data) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(data, "data");
        this.id = j;
        this.title = title;
        this.timeStamp = j2;
        this.data = data;
    }

    public final long getId() {
        return this.id;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public /* synthetic */ ChatHistory(long j, String str, long j2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? new ArrayList() : arrayList);
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public final List<ChatEntity> getData() {
        return this.data;
    }

    public final void setData(List<ChatEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }
}
