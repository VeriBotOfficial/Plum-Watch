package com.wakeup.common.storage.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AppConfig.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/storage/model/AppConfig;", "", "isAgreePrivacy", "", "isEnergyBall", "<init>", "(ZZ)V", "()Z", "setAgreePrivacy", "(Z)V", "setEnergyBall", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AppConfig {
    private boolean isAgreePrivacy;
    private boolean isEnergyBall;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppConfig() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.storage.model.AppConfig.<init>():void");
    }

    public static /* synthetic */ AppConfig copy$default(AppConfig appConfig, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = appConfig.isAgreePrivacy;
        }
        if ((i & 2) != 0) {
            z2 = appConfig.isEnergyBall;
        }
        return appConfig.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsAgreePrivacy() {
        return this.isAgreePrivacy;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEnergyBall() {
        return this.isEnergyBall;
    }

    public final AppConfig copy(boolean isAgreePrivacy, boolean isEnergyBall) {
        return new AppConfig(isAgreePrivacy, isEnergyBall);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppConfig)) {
            return false;
        }
        AppConfig appConfig = (AppConfig) other;
        return this.isAgreePrivacy == appConfig.isAgreePrivacy && this.isEnergyBall == appConfig.isEnergyBall;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isAgreePrivacy) * 31) + Boolean.hashCode(this.isEnergyBall);
    }

    public String toString() {
        return "AppConfig(isAgreePrivacy=" + this.isAgreePrivacy + ", isEnergyBall=" + this.isEnergyBall + Separators.RPAREN;
    }

    public AppConfig(boolean z, boolean z2) {
        this.isAgreePrivacy = z;
        this.isEnergyBall = z2;
    }

    public /* synthetic */ AppConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public final boolean isAgreePrivacy() {
        return this.isAgreePrivacy;
    }

    public final void setAgreePrivacy(boolean z) {
        this.isAgreePrivacy = z;
    }

    public final boolean isEnergyBall() {
        return this.isEnergyBall;
    }

    public final void setEnergyBall(boolean z) {
        this.isEnergyBall = z;
    }
}
