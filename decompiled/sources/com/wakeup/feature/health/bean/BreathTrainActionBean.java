package com.wakeup.feature.health.bean;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BreathTrainActionBean.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/wakeup/feature/health/bean/BreathTrainActionBean;", "Ljava/io/Serializable;", "name", "", "maxDuration", "", "actions", "", "Lcom/wakeup/feature/health/bean/Actions;", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getName", "()Ljava/lang/String;", "getMaxDuration", "()I", "getActions", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BreathTrainActionBean implements Serializable {
    public static final int $stable = 8;
    private final List<Actions> actions;
    private final int maxDuration;
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BreathTrainActionBean copy$default(BreathTrainActionBean breathTrainActionBean, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = breathTrainActionBean.name;
        }
        if ((i2 & 2) != 0) {
            i = breathTrainActionBean.maxDuration;
        }
        if ((i2 & 4) != 0) {
            list = breathTrainActionBean.actions;
        }
        return breathTrainActionBean.copy(str, i, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxDuration() {
        return this.maxDuration;
    }

    public final List<Actions> component3() {
        return this.actions;
    }

    public final BreathTrainActionBean copy(String name, int maxDuration, List<Actions> actions) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new BreathTrainActionBean(name, maxDuration, actions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BreathTrainActionBean)) {
            return false;
        }
        BreathTrainActionBean breathTrainActionBean = (BreathTrainActionBean) other;
        return Intrinsics.areEqual(this.name, breathTrainActionBean.name) && this.maxDuration == breathTrainActionBean.maxDuration && Intrinsics.areEqual(this.actions, breathTrainActionBean.actions);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + Integer.hashCode(this.maxDuration)) * 31) + this.actions.hashCode();
    }

    public String toString() {
        return "BreathTrainActionBean(name=" + this.name + ", maxDuration=" + this.maxDuration + ", actions=" + this.actions + Separators.RPAREN;
    }

    public BreathTrainActionBean(String name, int i, List<Actions> actions) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.name = name;
        this.maxDuration = i;
        this.actions = actions;
    }

    public final String getName() {
        return this.name;
    }

    public final int getMaxDuration() {
        return this.maxDuration;
    }

    public final List<Actions> getActions() {
        return this.actions;
    }
}
