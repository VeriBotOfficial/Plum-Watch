package com.amap.location.support.bean.cell;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes11.dex */
public class AmapCellNr extends AmapCell implements Serializable {
    private static final long serialVersionUID = 1;
    public long nci;
    public int nrarfcn;
    public int pci;
    public int tac;

    public AmapCellNr() {
        this.tac = 0;
        this.nci = 0L;
        this.pci = Integer.MAX_VALUE;
        this.nrarfcn = Integer.MAX_VALUE;
    }

    @Override // com.amap.location.support.bean.cell.AmapCell
    public String getKey() {
        return "6#" + this.mcc + "#" + this.mnc + "#" + this.tac + "#" + this.nci;
    }

    @Override // com.amap.location.support.bean.cell.AmapCell
    public String toString() {
        return "AmapCellNr{tac=" + this.tac + ", nci=" + this.nci + ", pci=" + this.pci + ", nrarfcn=" + this.nrarfcn + ", mcc='" + this.mcc + "', mnc='" + this.mnc + "', signalStrength=" + this.signalStrength + ", asuLevel=" + this.asuLevel + ", lastUpdateSystemMills=" + this.lastUpdateSystemMills + ", lastUpdateUtcMills=" + this.lastUpdateUtcMills + ", age=" + this.age + ", main=" + this.main + ", newApi=" + this.newApi + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // com.amap.location.support.bean.cell.AmapCell
    public boolean valid() {
        int i = this.tac;
        if (i < 0 || i > 16777215) {
            return false;
        }
        long j = this.nci;
        return j >= 4096 && j <= 68719476735L;
    }

    @Override // com.amap.location.support.bean.cell.AmapCell
    /* renamed from: clone */
    public AmapCell mo6910clone() {
        AmapCellNr amapCellNr = new AmapCellNr(this.main);
        amapCellNr.cloneFrom(this);
        amapCellNr.tac = this.tac;
        amapCellNr.nci = this.nci;
        amapCellNr.pci = this.pci;
        amapCellNr.nrarfcn = this.nrarfcn;
        return amapCellNr;
    }

    public AmapCellNr(boolean z) {
        super(z, true);
        this.tac = 0;
        this.nci = 0L;
        this.pci = Integer.MAX_VALUE;
        this.nrarfcn = Integer.MAX_VALUE;
    }
}
