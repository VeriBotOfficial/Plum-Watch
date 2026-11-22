package com.wakeup.module.gpt.entity;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TempDeviceOpts.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/wakeup/module/gpt/entity/TempDeviceOpts;", "", "type", "", "opt", "", "<init>", "(ILjava/lang/String;)V", "getType", "()I", "getOpt", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "feature-gpt_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TempDeviceOpts {
    private final String opt;
    private final int type;

    public static /* synthetic */ TempDeviceOpts copy$default(TempDeviceOpts tempDeviceOpts, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tempDeviceOpts.type;
        }
        if ((i2 & 2) != 0) {
            str = tempDeviceOpts.opt;
        }
        return tempDeviceOpts.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOpt() {
        return this.opt;
    }

    public final TempDeviceOpts copy(int type, String opt) {
        Intrinsics.checkNotNullParameter(opt, "opt");
        return new TempDeviceOpts(type, opt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TempDeviceOpts)) {
            return false;
        }
        TempDeviceOpts tempDeviceOpts = (TempDeviceOpts) other;
        return this.type == tempDeviceOpts.type && Intrinsics.areEqual(this.opt, tempDeviceOpts.opt);
    }

    public int hashCode() {
        return (Integer.hashCode(this.type) * 31) + this.opt.hashCode();
    }

    public String toString() {
        return "TempDeviceOpts(type=" + this.type + ", opt=" + this.opt + Separators.RPAREN;
    }

    public TempDeviceOpts(int i, String opt) {
        Intrinsics.checkNotNullParameter(opt, "opt");
        this.type = i;
        this.opt = opt;
    }

    public final int getType() {
        return this.type;
    }

    public final String getOpt() {
        return this.opt;
    }
}
