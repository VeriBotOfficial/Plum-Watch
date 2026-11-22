package com.amap.location.support.bean.cell;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes11.dex */
public class AmapCellWcdma extends AmapCell implements Serializable {
    private static final long serialVersionUID = 1;
    public int cid;
    public int lac;
    public int psc;
    public int uarfcn;

    public AmapCellWcdma() {
        this.lac = 0;
        this.cid = 0;
        this.psc = Integer.MAX_VALUE;
        this.uarfcn = Integer.MAX_VALUE;
    }

    @Override // com.amap.location.support.bean.cell.AmapCell
    public String getKey() {
        return "4#" + this.mcc + "#" + this.mnc + "#" + this.lac + "#" + this.cid;
    }

    @Override // com.amap.location.support.bean.cell.AmapCell
    public String toString() {
        return "AmapCellWcdma{lac=" + this.lac + ", cid=" + this.cid + ", psc=" + this.psc + ", uarfcn=" + this.uarfcn + ", mcc='" + this.mcc + "', mnc='" + this.mnc + "', signalStrength=" + this.signalStrength + ", asuLevel=" + this.asuLevel + ", lastUpdateSystemMills=" + this.lastUpdateSystemMills + ", lastUpdateUtcMills=" + this.lastUpdateUtcMills + ", age=" + this.age + ", main=" + this.main + ", newApi=" + this.newApi + AbstractJsonLexerKt.END_OBJ;
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
        AmapCellWcdma amapCellWcdma = new AmapCellWcdma(this.main, this.newApi);
        amapCellWcdma.cloneFrom(this);
        amapCellWcdma.lac = this.lac;
        amapCellWcdma.cid = this.cid;
        amapCellWcdma.psc = this.psc;
        amapCellWcdma.uarfcn = this.uarfcn;
        return amapCellWcdma;
    }

    public AmapCellWcdma(boolean z, boolean z2) {
        super(z, z2);
        this.lac = 0;
        this.cid = 0;
        this.psc = Integer.MAX_VALUE;
        this.uarfcn = Integer.MAX_VALUE;
    }
}
