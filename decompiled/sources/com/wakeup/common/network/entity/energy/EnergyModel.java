package com.wakeup.common.network.entity.energy;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: EnergyModel.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/energy/EnergyModel;", "", "bindFlag", "", "canCollectEnergy", "", "forestUser", "vitalityFlag", "<init>", "(ZIZZ)V", "getBindFlag", "()Z", "getCanCollectEnergy", "()I", "getForestUser", "getVitalityFlag", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EnergyModel {
    private final boolean bindFlag;
    private final int canCollectEnergy;
    private final boolean forestUser;
    private final boolean vitalityFlag;

    public static /* synthetic */ EnergyModel copy$default(EnergyModel energyModel, boolean z, int i, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = energyModel.bindFlag;
        }
        if ((i2 & 2) != 0) {
            i = energyModel.canCollectEnergy;
        }
        if ((i2 & 4) != 0) {
            z2 = energyModel.forestUser;
        }
        if ((i2 & 8) != 0) {
            z3 = energyModel.vitalityFlag;
        }
        return energyModel.copy(z, i, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getBindFlag() {
        return this.bindFlag;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCanCollectEnergy() {
        return this.canCollectEnergy;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getForestUser() {
        return this.forestUser;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getVitalityFlag() {
        return this.vitalityFlag;
    }

    public final EnergyModel copy(boolean bindFlag, int canCollectEnergy, boolean forestUser, boolean vitalityFlag) {
        return new EnergyModel(bindFlag, canCollectEnergy, forestUser, vitalityFlag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnergyModel)) {
            return false;
        }
        EnergyModel energyModel = (EnergyModel) other;
        return this.bindFlag == energyModel.bindFlag && this.canCollectEnergy == energyModel.canCollectEnergy && this.forestUser == energyModel.forestUser && this.vitalityFlag == energyModel.vitalityFlag;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.bindFlag) * 31) + Integer.hashCode(this.canCollectEnergy)) * 31) + Boolean.hashCode(this.forestUser)) * 31) + Boolean.hashCode(this.vitalityFlag);
    }

    public String toString() {
        return "EnergyModel(bindFlag=" + this.bindFlag + ", canCollectEnergy=" + this.canCollectEnergy + ", forestUser=" + this.forestUser + ", vitalityFlag=" + this.vitalityFlag + Separators.RPAREN;
    }

    public EnergyModel(boolean z, int i, boolean z2, boolean z3) {
        this.bindFlag = z;
        this.canCollectEnergy = i;
        this.forestUser = z2;
        this.vitalityFlag = z3;
    }

    public final boolean getBindFlag() {
        return this.bindFlag;
    }

    public final int getCanCollectEnergy() {
        return this.canCollectEnergy;
    }

    public final boolean getForestUser() {
        return this.forestUser;
    }

    public final boolean getVitalityFlag() {
        return this.vitalityFlag;
    }
}
