package com.amap.location.support.bean.cell;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes11.dex */
public class AmapCellGsm extends AmapCell implements Serializable {
    private static final long serialVersionUID = 1;
    public int arfcn;
    public int bsic;
    public int cid;
    public int lac;
    public int psc;
    public int timingAdvance;

    public AmapCellGsm() {
        this.lac = 0;
        this.cid = 0;
        this.psc = Integer.MAX_VALUE;
        this.arfcn = Integer.MAX_VALUE;
        this.bsic = Integer.MAX_VALUE;
        this.timingAdvance = Integer.MAX_VALUE;
    }

    @Override // com.amap.location.support.bean.cell.AmapCell
    public String getKey() {
        return "1#" + this.mcc + "#" + this.mnc + "#" + this.lac + "#" + this.cid;
    }

    @Override // com.amap.location.support.bean.cell.AmapCell
    public String toString() {
        return "AmapCellGsm{lac=" + this.lac + ", cid=" + this.cid + ", psc=" + this.psc + ", arfcn=" + this.arfcn + ", bsic=" + this.bsic + ", timingAdvance=" + this.timingAdvance + ", mcc='" + this.mcc + "', mnc='" + this.mnc + "', signalStrength=" + this.signalStrength + ", asuLevel=" + this.asuLevel + ", lastUpdateSystemMills=" + this.lastUpdateSystemMills + ", lastUpdateUtcMills=" + this.lastUpdateUtcMills + ", age=" + this.age + ", main=" + this.main + ", newApi=" + this.newApi + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // com.amap.location.support.bean.cell.AmapCell
    public boolean valid() {
        int i;
        int i2 = this.lac;
        return i2 >= 0 && i2 <= 65535 && (i = this.cid) >= 0 && i <= 268435455;
    }

    @Override // com.amap.location.support.bean.cell.AmapCell
    /* renamed from: clone */
    public AmapCell mo6910clone() {
        AmapCellGsm amapCellGsm = new AmapCellGsm(this.main, this.newApi);
        amapCellGsm.cloneFrom(this);
        amapCellGsm.lac = this.lac;
        amapCellGsm.cid = this.cid;
        amapCellGsm.psc = this.psc;
        amapCellGsm.arfcn = this.arfcn;
        amapCellGsm.bsic = this.bsic;
        amapCellGsm.timingAdvance = this.timingAdvance;
        return amapCellGsm;
    }

    public AmapCellGsm(boolean z, boolean z2) {
        super(z, z2);
        this.lac = 0;
        this.cid = 0;
        this.psc = Integer.MAX_VALUE;
        this.arfcn = Integer.MAX_VALUE;
        this.bsic = Integer.MAX_VALUE;
        this.timingAdvance = Integer.MAX_VALUE;
    }
}
