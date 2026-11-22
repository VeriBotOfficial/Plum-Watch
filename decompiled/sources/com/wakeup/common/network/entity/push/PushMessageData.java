package com.wakeup.common.network.entity.push;

import android.gov.nist.core.Separators;
import com.wakeup.common.network.entity.opts.MessageEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PushMessageData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/network/entity/push/PushMessageData;", "", "records", "", "Lcom/wakeup/common/network/entity/opts/MessageEntity;", "<init>", "(Ljava/util/List;)V", "getRecords", "()Ljava/util/List;", "setRecords", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PushMessageData {
    private List<MessageEntity> records;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PushMessageData copy$default(PushMessageData pushMessageData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pushMessageData.records;
        }
        return pushMessageData.copy(list);
    }

    public final List<MessageEntity> component1() {
        return this.records;
    }

    public final PushMessageData copy(List<MessageEntity> records) {
        Intrinsics.checkNotNullParameter(records, "records");
        return new PushMessageData(records);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PushMessageData) && Intrinsics.areEqual(this.records, ((PushMessageData) other).records);
    }

    public int hashCode() {
        return this.records.hashCode();
    }

    public String toString() {
        return "PushMessageData(records=" + this.records + Separators.RPAREN;
    }

    public PushMessageData(List<MessageEntity> records) {
        Intrinsics.checkNotNullParameter(records, "records");
        this.records = records;
    }

    public final List<MessageEntity> getRecords() {
        return this.records;
    }

    public final void setRecords(List<MessageEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.records = list;
    }
}
