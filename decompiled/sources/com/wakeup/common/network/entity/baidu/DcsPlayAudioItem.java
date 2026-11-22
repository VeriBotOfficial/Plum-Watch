package com.wakeup.common.network.entity.baidu;

import android.gov.nist.core.Separators;
import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaiduAiBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/common/network/entity/baidu/DcsPlayAudioItem;", "", "audioItemId", "", ApiConstants.STREAM, "Lcom/wakeup/common/network/entity/baidu/DcsPlayStream;", "<init>", "(Ljava/lang/String;Lcom/wakeup/common/network/entity/baidu/DcsPlayStream;)V", "getAudioItemId", "()Ljava/lang/String;", "getStream", "()Lcom/wakeup/common/network/entity/baidu/DcsPlayStream;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DcsPlayAudioItem {
    private final String audioItemId;
    private final DcsPlayStream stream;

    public static /* synthetic */ DcsPlayAudioItem copy$default(DcsPlayAudioItem dcsPlayAudioItem, String str, DcsPlayStream dcsPlayStream, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dcsPlayAudioItem.audioItemId;
        }
        if ((i & 2) != 0) {
            dcsPlayStream = dcsPlayAudioItem.stream;
        }
        return dcsPlayAudioItem.copy(str, dcsPlayStream);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAudioItemId() {
        return this.audioItemId;
    }

    /* renamed from: component2, reason: from getter */
    public final DcsPlayStream getStream() {
        return this.stream;
    }

    public final DcsPlayAudioItem copy(String audioItemId, DcsPlayStream stream) {
        Intrinsics.checkNotNullParameter(audioItemId, "audioItemId");
        Intrinsics.checkNotNullParameter(stream, "stream");
        return new DcsPlayAudioItem(audioItemId, stream);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DcsPlayAudioItem)) {
            return false;
        }
        DcsPlayAudioItem dcsPlayAudioItem = (DcsPlayAudioItem) other;
        return Intrinsics.areEqual(this.audioItemId, dcsPlayAudioItem.audioItemId) && Intrinsics.areEqual(this.stream, dcsPlayAudioItem.stream);
    }

    public int hashCode() {
        return (this.audioItemId.hashCode() * 31) + this.stream.hashCode();
    }

    public String toString() {
        return "DcsPlayAudioItem(audioItemId=" + this.audioItemId + ", stream=" + this.stream + Separators.RPAREN;
    }

    public DcsPlayAudioItem(String audioItemId, DcsPlayStream stream) {
        Intrinsics.checkNotNullParameter(audioItemId, "audioItemId");
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.audioItemId = audioItemId;
        this.stream = stream;
    }

    public final String getAudioItemId() {
        return this.audioItemId;
    }

    public final DcsPlayStream getStream() {
        return this.stream;
    }
}
