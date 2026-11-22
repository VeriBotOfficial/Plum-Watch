package com.amap.location.support.bean.cell;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes11.dex */
public class AmapCellLte extends AmapCell implements Serializable {
    private static final long serialVersionUID = 1;
    public int ci;
    public int earfcn;
    public int pci;
    public int tac;
    public int timingAdvance;

    public AmapCellLte() {
        this.tac = 0;
        this.ci = 0;
        this.pci = Integer.MAX_VALUE;
        this.earfcn = Integer.MAX_VALUE;
        this.timingAdvance = Integer.MAX_VALUE;
    }

    @Override // com.amap.location.support.bean.cell.AmapCell
    public String getKey() {
        return "3#" + this.mcc + "#" + this.mnc + "#" + this.tac + "#" + this.ci;
    }

    @Override // com.amap.location.support.bean.cell.AmapCell
    public String toString() {
        return "AmapCellLte{tac=" + this.tac + ", ci=" + this.ci + ", pci=" + this.pci + ", earfcn=" + this.earfcn + ", timingAdvance=" + this.timingAdvance + ", mcc='" + this.mcc + "', mnc='" + this.mnc + "', signalStrength=" + this.signalStrength + ", asuLevel=" + this.asuLevel + ", lastUpdateSystemMills=" + this.lastUpdateSystemMills + ", lastUpdateUtcMills=" + this.lastUpdateUtcMills + ", age=" + this.age + ", main=" + this.main + ", newApi=" + this.newApi + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // com.amap.location.support.bean.cell.AmapCell
    public boolean valid() {
        int i;
        int i2 = this.tac;
        return i2 >= 0 && i2 <= 65535 && (i = this.ci) >= 0 && i <= 268435455;
    }

    @Override // com.amap.location.support.bean.cell.AmapCell
    /* renamed from: clone */
    public AmapCell mo6910clone() {
        AmapCellLte amapCellLte = new AmapCellLte(this.main);
        amapCellLte.cloneFrom(this);
        amapCellLte.tac = this.tac;
        amapCellLte.ci = this.ci;
        amapCellLte.pci = this.pci;
        amapCellLte.earfcn = this.earfcn;
        amapCellLte.timingAdvance = this.timingAdvance;
        return amapCellLte;
    }

    public AmapCellLte(boolean z) {
        super(z, true);
        this.tac = 0;
        this.ci = 0;
        this.pci = Integer.MAX_VALUE;
        this.earfcn = Integer.MAX_VALUE;
        this.timingAdvance = Integer.MAX_VALUE;
    }
}
