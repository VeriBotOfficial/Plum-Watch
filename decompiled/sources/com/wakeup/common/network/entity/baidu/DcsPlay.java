package com.wakeup.common.network.entity.baidu;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: BaiduAiBean.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/baidu/DcsPlay;", "", "audioItem", "Lcom/wakeup/common/network/entity/baidu/DcsPlayAudioItem;", DOMConstants.TAG_EXTENSION, "Lcom/wakeup/common/network/entity/baidu/DcsPlayExtension;", "<init>", "(Lcom/wakeup/common/network/entity/baidu/DcsPlayAudioItem;Lcom/wakeup/common/network/entity/baidu/DcsPlayExtension;)V", "getAudioItem", "()Lcom/wakeup/common/network/entity/baidu/DcsPlayAudioItem;", "getExtension", "()Lcom/wakeup/common/network/entity/baidu/DcsPlayExtension;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DcsPlay {
    private final DcsPlayAudioItem audioItem;
    private final DcsPlayExtension extension;

    public static /* synthetic */ DcsPlay copy$default(DcsPlay dcsPlay, DcsPlayAudioItem dcsPlayAudioItem, DcsPlayExtension dcsPlayExtension, int i, Object obj) {
        if ((i & 1) != 0) {
            dcsPlayAudioItem = dcsPlay.audioItem;
        }
        if ((i & 2) != 0) {
            dcsPlayExtension = dcsPlay.extension;
        }
        return dcsPlay.copy(dcsPlayAudioItem, dcsPlayExtension);
    }

    /* renamed from: component1, reason: from getter */
    public final DcsPlayAudioItem getAudioItem() {
        return this.audioItem;
    }

    /* renamed from: component2, reason: from getter */
    public final DcsPlayExtension getExtension() {
        return this.extension;
    }

    public final DcsPlay copy(DcsPlayAudioItem audioItem, DcsPlayExtension extension) {
        Intrinsics.checkNotNullParameter(audioItem, "audioItem");
        Intrinsics.checkNotNullParameter(extension, "extension");
        return new DcsPlay(audioItem, extension);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DcsPlay)) {
            return false;
        }
        DcsPlay dcsPlay = (DcsPlay) other;
        return Intrinsics.areEqual(this.audioItem, dcsPlay.audioItem) && Intrinsics.areEqual(this.extension, dcsPlay.extension);
    }

    public int hashCode() {
        return (this.audioItem.hashCode() * 31) + this.extension.hashCode();
    }

    public String toString() {
        return "DcsPlay(audioItem=" + this.audioItem + ", extension=" + this.extension + Separators.RPAREN;
    }

    public DcsPlay(DcsPlayAudioItem audioItem, DcsPlayExtension extension) {
        Intrinsics.checkNotNullParameter(audioItem, "audioItem");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.audioItem = audioItem;
        this.extension = extension;
    }

    public final DcsPlayAudioItem getAudioItem() {
        return this.audioItem;
    }

    public final DcsPlayExtension getExtension() {
        return this.extension;
    }
}
