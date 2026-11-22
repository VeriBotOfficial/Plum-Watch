package com.otaliastudios.cameraview.engine.mappers;

import com.otaliastudios.cameraview.controls.Control;
import com.otaliastudios.cameraview.controls.Facing;
import com.otaliastudios.cameraview.controls.Flash;
import com.otaliastudios.cameraview.controls.Hdr;
import com.otaliastudios.cameraview.controls.WhiteBalance;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes17.dex */
public class Camera1Mapper {
    private static final Map<Facing, Integer> FACING;
    private static final Map<Flash, String> FLASH;
    private static final Map<Hdr, String> HDR;
    private static final Map<WhiteBalance, String> WB;
    private static Camera1Mapper sInstance;

    public static Camera1Mapper get() {
        if (sInstance == null) {
            sInstance = new Camera1Mapper();
        }
        return sInstance;
    }

    static {
        HashMap hashMap = new HashMap();
        FLASH = hashMap;
        HashMap hashMap2 = new HashMap();
        WB = hashMap2;
        HashMap hashMap3 = new HashMap();
        FACING = hashMap3;
        HashMap hashMap4 = new HashMap();
        HDR = hashMap4;
        hashMap.put(Flash.OFF, DebugKt.DEBUG_PROPERTY_VALUE_OFF);
        hashMap.put(Flash.ON, "on");
        hashMap.put(Flash.AUTO, "auto");
        hashMap.put(Flash.TORCH, "torch");
        hashMap3.put(Facing.BACK, 0);
        hashMap3.put(Facing.FRONT, 1);
        hashMap2.put(WhiteBalance.AUTO, "auto");
        hashMap2.put(WhiteBalance.INCANDESCENT, "incandescent");
        hashMap2.put(WhiteBalance.FLUORESCENT, "fluorescent");
        hashMap2.put(WhiteBalance.DAYLIGHT, "daylight");
        hashMap2.put(WhiteBalance.CLOUDY, "cloudy-daylight");
        hashMap4.put(Hdr.OFF, "auto");
        hashMap4.put(Hdr.ON, "hdr");
    }

    private Camera1Mapper() {
    }

    public String mapFlash(Flash flash) {
        return FLASH.get(flash);
    }

    public int mapFacing(Facing facing) {
        return FACING.get(facing).intValue();
    }

    public String mapWhiteBalance(WhiteBalance whiteBalance) {
        return WB.get(whiteBalance);
    }

    public String mapHdr(Hdr hdr) {
        return HDR.get(hdr);
    }

    public Flash unmapFlash(String str) {
        return (Flash) reverseLookup(FLASH, str);
    }

    public Facing unmapFacing(int i) {
        return (Facing) reverseLookup(FACING, Integer.valueOf(i));
    }

    public WhiteBalance unmapWhiteBalance(String str) {
        return (WhiteBalance) reverseLookup(WB, str);
    }

    public Hdr unmapHdr(String str) {
        return (Hdr) reverseLookup(HDR, str);
    }

    private <C extends Control, T> C reverseLookup(Map<C, T> map, T t) {
        for (C c : map.keySet()) {
            if (t.equals(map.get(c))) {
                return c;
            }
        }
        return null;
    }
}
