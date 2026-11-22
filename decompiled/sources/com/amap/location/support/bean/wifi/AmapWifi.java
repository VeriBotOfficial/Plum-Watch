package com.amap.location.support.bean.wifi;

import com.amap.location.support.util.DataTypeUtil;
import com.autonavi.aps.amapapi.config.Const;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes11.dex */
public class AmapWifi {
    public static final long INVALID_MAC = 0;
    public boolean connected;
    public int frequency;
    public short freshness;
    public long mac;
    public String ssid;
    public long timestamp;
    public int rssi = Const.I_DEF_CGI_SIG;
    public long lastUpdateUtcMills = 0;

    public AmapWifi(boolean z) {
        this.connected = z;
    }

    public static String longToMac(long j) {
        if (j < 0 || j > 281474976710655L) {
            return null;
        }
        return DataTypeUtil.bytes2HexString(DataTypeUtil.digital2bytes(j, 6, true), null, ":");
    }

    public static long macToLong(String str) {
        if (str == null || str.length() == 0) {
            return 0L;
        }
        int i = 0;
        long j = 0;
        for (int length = str.length() - 1; length >= 0; length--) {
            long charAt = str.charAt(length);
            long j2 = 48;
            if (charAt < 48 || charAt > 57) {
                if (charAt >= 97 && charAt <= 102) {
                    j2 = 87;
                } else if (charAt < 65 || charAt > 70) {
                    if (charAt != 58 && charAt != 124) {
                        return 0L;
                    }
                } else {
                    j2 = 55;
                }
            }
            j += (charAt - j2) << i;
            i += 4;
        }
        if (i != 48) {
            return 0L;
        }
        return j;
    }

    public String getKey() {
        return this.connected + "#" + this.mac;
    }

    public String toString() {
        return "AmapWifi{mac=" + this.mac + ", ssid='" + this.ssid + "', rssi=" + this.rssi + ", frequency=" + this.frequency + ", timestamp=" + this.timestamp + ", lastUpdateUtcMills=" + this.lastUpdateUtcMills + ", freshness=" + ((int) this.freshness) + ", connected=" + this.connected + AbstractJsonLexerKt.END_OBJ;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AmapWifi m6911clone() {
        AmapWifi amapWifi = new AmapWifi(this.connected);
        amapWifi.mac = this.mac;
        amapWifi.ssid = this.ssid;
        amapWifi.rssi = this.rssi;
        amapWifi.frequency = this.frequency;
        amapWifi.timestamp = this.timestamp;
        amapWifi.lastUpdateUtcMills = this.lastUpdateUtcMills;
        amapWifi.freshness = this.freshness;
        amapWifi.connected = this.connected;
        return amapWifi;
    }
}
