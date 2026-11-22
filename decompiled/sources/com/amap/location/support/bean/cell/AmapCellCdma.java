package com.amap.location.support.bean.cell;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes11.dex */
public class AmapCellCdma extends AmapCell implements Serializable {
    private static final long serialVersionUID = 1;
    public int bid;
    public int latitude;
    public int longitude;
    public int nid;
    public int sid;

    public AmapCellCdma() {
        this.sid = 0;
        this.nid = 0;
        this.bid = 0;
    }

    @Override // com.amap.location.support.bean.cell.AmapCell
    public String getKey() {
        return "2#" + this.sid + "#" + this.nid + "#" + this.bid;
    }

    @Override // com.amap.location.support.bean.cell.AmapCell
    public String toString() {
        return "AmapCellCdma{sid=" + this.sid + ", nid=" + this.nid + ", bid=" + this.bid + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", mcc='" + this.mcc + "', mnc='" + this.mnc + "', signalStrength=" + this.signalStrength + ", asuLevel=" + this.asuLevel + ", lastUpdateSystemMills=" + this.lastUpdateSystemMills + ", lastUpdateUtcMills=" + this.lastUpdateUtcMills + ", age=" + this.age + ", main=" + this.main + ", newApi=" + this.newApi + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // com.amap.location.support.bean.cell.AmapCell
    public boolean valid() {
        int i;
        int i2;
        int i3 = this.sid;
        return i3 > 0 && i3 <= 32767 && (i = this.nid) >= 0 && i <= 65535 && (i2 = this.bid) >= 0 && i2 <= 65535;
    }

    @Override // com.amap.location.support.bean.cell.AmapCell
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AmapCell mo6910clone() {
        AmapCellCdma amapCellCdma = new AmapCellCdma(this.main, this.newApi);
        amapCellCdma.cloneFrom(this);
        amapCellCdma.sid = this.sid;
        amapCellCdma.nid = this.nid;
        amapCellCdma.bid = this.bid;
        amapCellCdma.latitude = this.latitude;
        amapCellCdma.longitude = this.longitude;
        return amapCellCdma;
    }

    public AmapCellCdma(boolean z, boolean z2) {
        super(z, z2);
        this.sid = 0;
        this.nid = 0;
        this.bid = 0;
    }
}
