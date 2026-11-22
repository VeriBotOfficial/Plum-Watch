package com.bykv.vk.openvk.fxn.fxn.kg.fxn.kg;

import android.content.Context;
import com.bykv.vk.openvk.fxn.fxn.fxn.rb.fxn;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes13.dex */
public class gff {
    public static final ConcurrentHashMap<String, kg> fxn = new ConcurrentHashMap<>();

    public static synchronized void fxn(Context context, com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff gffVar, fxn.InterfaceC0447fxn interfaceC0447fxn) {
        synchronized (gff.class) {
            if (gffVar == null) {
                return;
            }
            ConcurrentHashMap<String, kg> concurrentHashMap = fxn;
            kg kgVar = concurrentHashMap.get(gffVar.rmu());
            if (kgVar == null) {
                kgVar = new kg(context, gffVar);
                concurrentHashMap.put(gffVar.rmu(), kgVar);
                new Object[]{"preloadVideo:  cache size = ", Integer.valueOf(gffVar.bh()), gffVar.rmu()};
            }
            kgVar.fxn(interfaceC0447fxn);
            new Object[]{"preloadVideo:  cache size = ", Integer.valueOf(gffVar.bh()), gffVar.rmu()};
        }
    }

    public static synchronized void fxn(com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff gffVar) {
        synchronized (gff.class) {
            kg remove = fxn.remove(gffVar.rmu());
            if (remove != null) {
                remove.fxn(true);
            }
            new Object[]{"removePreload:  cache size = ", Integer.valueOf(gffVar.bh()), gffVar.rmu()};
        }
    }
}
