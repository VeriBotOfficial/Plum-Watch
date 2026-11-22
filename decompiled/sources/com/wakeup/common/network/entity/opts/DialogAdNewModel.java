package com.wakeup.common.network.entity.opts;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xmind.core.style.IStyle;

/* compiled from: DialogAdNewModel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005HÆ\u0003J/\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/wakeup/common/network/entity/opts/DialogAdNewModel;", "", "intervalTime", "", IStyle.MAP, "", "", "", "Lcom/wakeup/common/network/entity/opts/DialogAdModel;", "<init>", "(ILjava/util/Map;)V", "getIntervalTime", "()I", "getMap", "()Ljava/util/Map;", "closeDialogTime", "", "getCloseDialogTime", "()J", "setCloseDialogTime", "(J)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DialogAdNewModel {
    private long closeDialogTime;
    private final int intervalTime;
    private final Map<String, List<DialogAdModel>> map;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialogAdNewModel copy$default(DialogAdNewModel dialogAdNewModel, int i, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dialogAdNewModel.intervalTime;
        }
        if ((i2 & 2) != 0) {
            map = dialogAdNewModel.map;
        }
        return dialogAdNewModel.copy(i, map);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIntervalTime() {
        return this.intervalTime;
    }

    public final Map<String, List<DialogAdModel>> component2() {
        return this.map;
    }

    public final DialogAdNewModel copy(int intervalTime, Map<String, ? extends List<DialogAdModel>> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new DialogAdNewModel(intervalTime, map);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogAdNewModel)) {
            return false;
        }
        DialogAdNewModel dialogAdNewModel = (DialogAdNewModel) other;
        return this.intervalTime == dialogAdNewModel.intervalTime && Intrinsics.areEqual(this.map, dialogAdNewModel.map);
    }

    public int hashCode() {
        return (Integer.hashCode(this.intervalTime) * 31) + this.map.hashCode();
    }

    public String toString() {
        return "DialogAdNewModel(intervalTime=" + this.intervalTime + ", map=" + this.map + Separators.RPAREN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DialogAdNewModel(int i, Map<String, ? extends List<DialogAdModel>> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.intervalTime = i;
        this.map = map;
    }

    public final int getIntervalTime() {
        return this.intervalTime;
    }

    public final Map<String, List<DialogAdModel>> getMap() {
        return this.map;
    }

    public final long getCloseDialogTime() {
        return this.closeDialogTime;
    }

    public final void setCloseDialogTime(long j) {
        this.closeDialogTime = j;
    }
}
