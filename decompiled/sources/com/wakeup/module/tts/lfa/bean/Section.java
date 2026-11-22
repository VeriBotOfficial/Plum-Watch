package com.wakeup.module.tts.lfa.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LfaBeans.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/wakeup/module/tts/lfa/bean/Section;", "", "st", "Lcom/wakeup/module/tts/lfa/bean/St;", "<init>", "(Lcom/wakeup/module/tts/lfa/bean/St;)V", "getSt", "()Lcom/wakeup/module/tts/lfa/bean/St;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "module-tts_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Section {
    private final St st;

    public static /* synthetic */ Section copy$default(Section section, St st, int i, Object obj) {
        if ((i & 1) != 0) {
            st = section.st;
        }
        return section.copy(st);
    }

    /* renamed from: component1, reason: from getter */
    public final St getSt() {
        return this.st;
    }

    public final Section copy(St st) {
        Intrinsics.checkNotNullParameter(st, "st");
        return new Section(st);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Section) && Intrinsics.areEqual(this.st, ((Section) other).st);
    }

    public int hashCode() {
        return this.st.hashCode();
    }

    public String toString() {
        return "Section(st=" + this.st + Separators.RPAREN;
    }

    public Section(St st) {
        Intrinsics.checkNotNullParameter(st, "st");
        this.st = st;
    }

    public final St getSt() {
        return this.st;
    }
}
