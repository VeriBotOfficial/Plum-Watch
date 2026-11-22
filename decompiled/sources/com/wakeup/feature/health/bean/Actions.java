package com.wakeup.feature.health.bean;

import android.gov.nist.core.Separators;
import com.anythink.expressad.foundation.h.k;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BreathTrainActionBean.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/wakeup/feature/health/bean/Actions;", "Ljava/io/Serializable;", "name", "", "duration", "", k.f, "<init>", "(Ljava/lang/String;DLjava/lang/String;)V", "getName", "()Ljava/lang/String;", "getDuration", "()D", "getAnim", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Actions implements Serializable {
    public static final int $stable = 0;
    private final String anim;
    private final double duration;
    private final String name;

    public static /* synthetic */ Actions copy$default(Actions actions, String str, double d, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actions.name;
        }
        if ((i & 2) != 0) {
            d = actions.duration;
        }
        if ((i & 4) != 0) {
            str2 = actions.anim;
        }
        return actions.copy(str, d, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final double getDuration() {
        return this.duration;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAnim() {
        return this.anim;
    }

    public final Actions copy(String name, double duration, String anim) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(anim, "anim");
        return new Actions(name, duration, anim);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Actions)) {
            return false;
        }
        Actions actions = (Actions) other;
        return Intrinsics.areEqual(this.name, actions.name) && Double.compare(this.duration, actions.duration) == 0 && Intrinsics.areEqual(this.anim, actions.anim);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + Double.hashCode(this.duration)) * 31) + this.anim.hashCode();
    }

    public String toString() {
        return "Actions(name=" + this.name + ", duration=" + this.duration + ", anim=" + this.anim + Separators.RPAREN;
    }

    public Actions(String name, double d, String anim) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(anim, "anim");
        this.name = name;
        this.duration = d;
        this.anim = anim;
    }

    public final String getName() {
        return this.name;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final String getAnim() {
        return this.anim;
    }
}
