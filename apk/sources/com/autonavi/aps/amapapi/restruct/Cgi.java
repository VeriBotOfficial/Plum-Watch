package com.autonavi.aps.amapapi.restruct;

import androidx.compose.ui.layout.LayoutKt;
import com.autonavi.aps.amapapi.config.Const;

/* JADX INFO: loaded from: classes16.dex */
public class Cgi {
    public static final int CDMA_TYPE = 2;
    public static final int DEFCGI_TYPE = 0;
    public static final int GSM_TYPE = 1;
    public static final int LTE_TYPE = 3;
    public static final int NR_TYPE = 5;
    public static final int WCDMA_TYPE = 4;
    public boolean isMain;
    public int type;
    public int mcc = 0;
    public int mnc = 0;
    public int lac = 0;
    public int cid = 0;
    public long cidNr = 0;
    public int lat = 0;
    public int lon = 0;
    public int sid = 0;
    public int nid = 0;
    public int bid = 0;
    public int sig = Const.I_DEF_CGI_SIG;
    public short cellAge = 0;
    public int pci = LayoutKt.LargeDimension;
    public int arfcn = Integer.MAX_VALUE;
    public int timingadvance = Integer.MAX_VALUE;
    public boolean newApi = true;
    public int signalStrength = 99;
    public long lastUpdateUtcMills = 0;

    public Cgi(int r5, boolean z) {
        this.type = r5;
        this.isMain = z;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Cgi)) {
            Cgi cgi = (Cgi) obj;
            int r1 = cgi.type;
            if (r1 != 1) {
                if (r1 == 2) {
                    return this.type == 2 && cgi.bid == this.bid && cgi.nid == this.nid && cgi.sid == this.sid;
                }
                if (r1 == 3) {
                    return this.type == 3 && cgi.lac == this.lac && cgi.cid == this.cid && cgi.mnc == this.mnc;
                }
                if (r1 != 4) {
                    return r1 == 5 && this.type == 5 && cgi.lac == this.lac && cgi.cidNr == this.cidNr && cgi.timingadvance == this.timingadvance;
                }
                return this.type == 4 && cgi.lac == this.lac && cgi.cid == this.cid && cgi.mnc == this.mnc;
            }
            if (this.type == 1 && cgi.lac == this.lac && cgi.cid == this.cid && cgi.mnc == this.mnc) {
                return true;
            }
        }
        return false;
    }

    public int getBid() {
        return this.bid;
    }

    public String getCellKey() {
        int r0 = this.type;
        if (r0 != 1) {
            if (r0 == 2) {
                return this.type + "#" + this.sid + "#" + this.nid + "#" + this.bid;
            }
            if (r0 != 3 && r0 != 4 && r0 != 5) {
                return null;
            }
        }
        return this.type + "#" + this.mcc + "#" + this.mnc + "#0#" + getCid();
    }

    public long getCid() {
        return this.type == 5 ? this.cidNr : this.cid;
    }

    public String getKeyWithDifferentApi() {
        String cellKey = getCellKey();
        if (cellKey == null || cellKey.length() <= 0) {
            return "";
        }
        return (this.newApi ? 1 : 0) + "#" + cellKey;
    }

    public int getLac() {
        return this.lac;
    }

    public int getNid() {
        return this.nid;
    }

    public int getSig() {
        return this.sig;
    }

    public int hashCode() {
        int r1;
        int r2;
        int r0 = String.valueOf(this.type).hashCode();
        if (this.type == 2) {
            r1 = String.valueOf(this.bid).hashCode() + String.valueOf(this.nid).hashCode();
            r2 = String.valueOf(this.sid).hashCode();
        } else {
            r1 = String.valueOf(this.lac).hashCode() + String.valueOf(this.cid).hashCode();
            r2 = String.valueOf(this.mnc).hashCode();
        }
        return r0 + r1 + r2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Cgi m7195clone() {
        Cgi cgi = new Cgi(this.type, this.isMain);
        cgi.mcc = this.mcc;
        cgi.mnc = this.mnc;
        cgi.lac = this.lac;
        cgi.cid = this.cid;
        cgi.cidNr = this.cidNr;
        cgi.lat = this.lat;
        cgi.lon = this.lon;
        cgi.sid = this.sid;
        cgi.nid = this.nid;
        cgi.bid = this.bid;
        cgi.sig = this.sig;
        cgi.cellAge = this.cellAge;
        cgi.pci = this.pci;
        cgi.arfcn = this.arfcn;
        cgi.timingadvance = this.timingadvance;
        cgi.newApi = this.newApi;
        cgi.signalStrength = this.signalStrength;
        cgi.lastUpdateUtcMills = this.lastUpdateUtcMills;
        return cgi;
    }
}
