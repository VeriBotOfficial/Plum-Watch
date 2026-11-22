package com.wakeup.common.storage.model;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepInfoModel.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/wakeup/common/storage/model/SleepInfoModel;", "Ljava/io/Serializable;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "type", "", "content", "", "<init>", "(ILjava/lang/String;)V", "getType", "()I", "getContent", "()Ljava/lang/String;", "itemType", "getItemType", "Companion", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SleepInfoModel implements Serializable, MultiItemEntity {
    public static final int CONTENT = 1;
    public static final int TITLE = 0;
    private final String content;
    private final int type;

    public SleepInfoModel(int i, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.type = i;
        this.content = content;
    }

    public final int getType() {
        return this.type;
    }

    public final String getContent() {
        return this.content;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    /* renamed from: getItemType, reason: from getter */
    public int getType() {
        return this.type;
    }
}
