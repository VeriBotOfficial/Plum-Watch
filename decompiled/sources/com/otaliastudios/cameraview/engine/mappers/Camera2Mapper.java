package com.otaliastudios.cameraview.engine.mappers;

import android.util.Pair;
import com.otaliastudios.cameraview.controls.Control;
import com.otaliastudios.cameraview.controls.Facing;
import com.otaliastudios.cameraview.controls.Flash;
import com.otaliastudios.cameraview.controls.Hdr;
import com.otaliastudios.cameraview.controls.WhiteBalance;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes17.dex */
public class Camera2Mapper {
    private static final Map<Facing, Integer> FACING;
    private static final Map<Hdr, Integer> HDR;
    private static final Map<WhiteBalance, Integer> WB;
    private static Camera2Mapper sInstance;

    public static Camera2Mapper get() {
        if (sInstance == null) {
            sInstance = new Camera2Mapper();
        }
        return sInstance;
    }

    static {
        HashMap hashMap = new HashMap();
        FACING = hashMap;
        HashMap hashMap2 = new HashMap();
        WB = hashMap2;
        HashMap hashMap3 = new HashMap();
        HDR = hashMap3;
        hashMap.put(Facing.BACK, 1);
        hashMap.put(Facing.FRONT, 0);
        hashMap2.put(WhiteBalance.AUTO, 1);
        hashMap2.put(WhiteBalance.CLOUDY, 6);
        hashMap2.put(WhiteBalance.DAYLIGHT, 5);
        hashMap2.put(WhiteBalance.FLUORESCENT, 3);
        hashMap2.put(WhiteBalance.INCANDESCENT, 2);
        hashMap3.put(Hdr.OFF, 0);
        hashMap3.put(Hdr.ON, 18);
    }

    private Camera2Mapper() {
    }

    /* renamed from: com.otaliastudios.cameraview.engine.mappers.Camera2Mapper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$otaliastudios$cameraview$controls$Flash;

        static {
            int[] iArr = new int[Flash.values().length];
            $SwitchMap$com$otaliastudios$cameraview$controls$Flash = iArr;
            try {
                iArr[Flash.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$otaliastudios$cameraview$controls$Flash[Flash.AUTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$otaliastudios$cameraview$controls$Flash[Flash.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$otaliastudios$cameraview$controls$Flash[Flash.TORCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public List<Pair<Integer, Integer>> mapFlash(Flash flash) {
        ArrayList arrayList = new ArrayList();
        int i = AnonymousClass1.$SwitchMap$com$otaliastudios$cameraview$controls$Flash[flash.ordinal()];
        if (i == 1) {
            arrayList.add(new Pair(3, 0));
            return arrayList;
        }
        if (i == 2) {
            arrayList.add(new Pair(2, 0));
            arrayList.add(new Pair(4, 0));
            return arrayList;
        }
        if (i == 3) {
            arrayList.add(new Pair(1, 0));
            arrayList.add(new Pair(0, 0));
            return arrayList;
        }
        if (i != 4) {
            return arrayList;
        }
        arrayList.add(new Pair(1, 2));
        arrayList.add(new Pair(0, 2));
        return arrayList;
    }

    public int mapFacing(Facing facing) {
        return FACING.get(facing).intValue();
    }

    public int mapWhiteBalance(WhiteBalance whiteBalance) {
        return WB.get(whiteBalance).intValue();
    }

    public int mapHdr(Hdr hdr) {
        return HDR.get(hdr).intValue();
    }

    public Set<Flash> unmapFlash(int i) {
        HashSet hashSet = new HashSet();
        if (i == 0 || i == 1) {
            hashSet.add(Flash.OFF);
            hashSet.add(Flash.TORCH);
            return hashSet;
        }
        if (i != 2) {
            if (i == 3) {
                hashSet.add(Flash.ON);
                return hashSet;
            }
            if (i != 4) {
                return hashSet;
            }
        }
        hashSet.add(Flash.AUTO);
        return hashSet;
    }

    public Facing unmapFacing(int i) {
        return (Facing) reverseLookup(FACING, Integer.valueOf(i));
    }

    public WhiteBalance unmapWhiteBalance(int i) {
        return (WhiteBalance) reverseLookup(WB, Integer.valueOf(i));
    }

    public Hdr unmapHdr(int i) {
        return (Hdr) reverseLookup(HDR, Integer.valueOf(i));
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
