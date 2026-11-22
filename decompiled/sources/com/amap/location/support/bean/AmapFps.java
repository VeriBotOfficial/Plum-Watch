package com.amap.location.support.bean;

import com.amap.location.support.bean.cell.AmapCell;
import com.amap.location.support.bean.wifi.AmapWifi;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes11.dex */
public class AmapFps {
    public List<AmapCell> amapCellList = Collections.emptyList();
    public List<AmapWifi> amapWifiList = Collections.emptyList();
    public AmapCell mainAmapCell;
    public AmapWifi mainAmapWifi;
    public String networkOperator;

    public String toString() {
        return "AmapFps{networkOperator='" + this.networkOperator + "', mainAmapCell=" + this.mainAmapCell + ", mainAmapWifi=" + this.mainAmapWifi + ", amapCellList=" + this.amapCellList + ", amapWifiList=" + this.amapWifiList + AbstractJsonLexerKt.END_OBJ;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AmapFps m6909clone() {
        AmapFps amapFps = new AmapFps();
        amapFps.networkOperator = this.networkOperator;
        AmapCell amapCell = this.mainAmapCell;
        if (amapCell != null) {
            amapFps.mainAmapCell = amapCell.mo6910clone();
        }
        AmapWifi amapWifi = this.mainAmapWifi;
        if (amapWifi != null) {
            amapFps.mainAmapWifi = amapWifi.m6911clone();
        }
        amapFps.amapCellList.addAll(this.amapCellList);
        amapFps.amapWifiList.addAll(this.amapWifiList);
        return amapFps;
    }
}
