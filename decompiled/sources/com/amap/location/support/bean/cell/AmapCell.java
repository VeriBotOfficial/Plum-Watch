package com.amap.location.support.bean.cell;

import com.amap.location.support.log.ALLog;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes11.dex */
public abstract class AmapCell implements Serializable {
    private static final long serialVersionUID = 1;
    public int age;
    public int asuLevel;
    public long lastUpdateSystemMills;
    public long lastUpdateUtcMills;
    public boolean main;
    public String mcc;
    public String mnc;
    public boolean newApi;
    public int signalStrength;

    public AmapCell() {
        this.mcc = "";
        this.mnc = "";
        this.signalStrength = 99;
        this.asuLevel = Integer.MAX_VALUE;
        this.lastUpdateSystemMills = 0L;
        this.lastUpdateUtcMills = 0L;
        this.age = 0;
        this.newApi = true;
    }

    private static int safeStrToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            ALLog.d(e);
            return 0;
        }
    }

    @Override // 
    /* renamed from: clone */
    public abstract AmapCell mo6910clone();

    public void cloneFrom(AmapCell amapCell) {
        if (amapCell != null) {
            this.mcc = amapCell.mcc;
            this.mnc = amapCell.mnc;
            this.signalStrength = amapCell.signalStrength;
            this.asuLevel = amapCell.asuLevel;
            this.lastUpdateSystemMills = amapCell.lastUpdateSystemMills;
            this.lastUpdateUtcMills = amapCell.lastUpdateUtcMills;
            this.age = amapCell.age;
            this.main = amapCell.main;
            this.newApi = amapCell.newApi;
        }
    }

    public long getAreaID() {
        int i;
        if (this instanceof AmapCellGsm) {
            i = ((AmapCellGsm) this).lac;
        } else if (this instanceof AmapCellCdma) {
            i = ((AmapCellCdma) this).nid;
        } else if (this instanceof AmapCellWcdma) {
            i = ((AmapCellWcdma) this).lac;
        } else if (this instanceof AmapCellLte) {
            i = ((AmapCellLte) this).tac;
        } else {
            if (!(this instanceof AmapCellNr)) {
                return 0L;
            }
            i = ((AmapCellNr) this).tac;
        }
        return i;
    }

    public long getCellID() {
        if (this instanceof AmapCellGsm) {
            return ((AmapCellGsm) this).cid;
        }
        if (this instanceof AmapCellCdma) {
            return ((AmapCellCdma) this).bid;
        }
        if (this instanceof AmapCellWcdma) {
            return ((AmapCellWcdma) this).cid;
        }
        if (this instanceof AmapCellLte) {
            return ((AmapCellLte) this).ci;
        }
        if (this instanceof AmapCellNr) {
            return ((AmapCellNr) this).nci;
        }
        return 0L;
    }

    public abstract String getKey();

    public String getKeyWithDifferentApi() {
        String key = getKey();
        if (key == null || key.length() <= 0) {
            return "";
        }
        return (this.newApi ? 1 : 0) + "#" + key;
    }

    public int getMccInt() {
        return safeStrToInt(this.mcc);
    }

    public int getMncInt() {
        return safeStrToInt(this.mnc);
    }

    public void setMccInt(int i) {
        this.mcc = String.valueOf(i);
    }

    public void setMncInt(int i) {
        this.mnc = String.valueOf(i);
    }

    public String toString() {
        return "AmapCell{mcc=" + this.mcc + ", mnc=" + this.mnc + ", signalStrength=" + this.signalStrength + ", asulevel=" + this.asuLevel + ", lastUpdateSystemMills=" + this.lastUpdateSystemMills + ", lastUpdateUtcMills=" + this.lastUpdateUtcMills + ", age=" + this.age + ", main=" + this.main + ", newapi=" + this.newApi + AbstractJsonLexerKt.END_OBJ;
    }

    public abstract boolean valid();

    public AmapCell(boolean z, boolean z2) {
        this.mcc = "";
        this.mnc = "";
        this.signalStrength = 99;
        this.asuLevel = Integer.MAX_VALUE;
        this.lastUpdateSystemMills = 0L;
        this.lastUpdateUtcMills = 0L;
        this.age = 0;
        this.main = z;
        this.newApi = z2;
    }
}
