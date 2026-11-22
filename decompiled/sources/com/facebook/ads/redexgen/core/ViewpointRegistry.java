package com.facebook.ads.redexgen.core;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.tensorflow.lite.schema.BuiltinOptions;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u000e\u0010\u0011\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\tJ&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\tJ\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bJ\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\rJ*\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\u0014\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t0\u0018J\u0016\u0010\u0019\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\bJ*\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u001a\u0010\u001b\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u000f0\u001cJ\u0018\u0010\u001d\u001a\u00020\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\tH\u0002J\u0018\u0010\u001e\u001a\u00020\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t0\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/instagram/common/viewpoint/core/ViewpointRegistry;", "", "qeConfig", "Lcom/instagram/common/viewpoint/core/ViewpointQeConfig;", "<init>", "(Lcom/instagram/common/viewpoint/core/ViewpointQeConfig;)V", "viewpointDataMap", "", "Lcom/meta/analytics/dsp/uinode/DspViewableNode;", "Lcom/instagram/common/viewpoint/core/ViewpointData;", "recentlyUnregistered", "", "multiViewpointDataMap", "Lcom/instagram/common/viewpoint/core/SharedViewpointManager$UniqueKey;", "registerView", "", "node", "viewpointData", "key", "unregisterView", "getEligibleViews", "result", "", "toUnregister", "", "getViewpointData", "iterateMultiViewpointData", "action", "Lkotlin/Function1;", "addToRecentlyUnregistered", "markAsRegisteredAndThrowOnReuse", "fbandroid.java.com.instagram.common.viewpoint.core.core_an"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.po, reason: from Kotlin metadata */
/* loaded from: assets/audience_network.dex */
public final class ViewpointRegistry {
    public static byte[] A04;
    public static String[] A05 = {"hdmlO0", "Pao0VUuQuwhiUKXn89wfKbyo9VlN", "lRas", "TeEMb6eZZD5whrU9be0IX5ZV1M9RKr26", "Qnqbn5lACluJ2ApCqm5BpSPW4vhAMGtg", "gvJZrbHq4P5HQU5ufyPQZZXTOJgB", "vCidj0D7LJg5PqPuMk2VvvwKDqfmQpdZ", "0ZH2VL3AtCsRULFWGVsN9oD"};
    public final ViewpointQeConfig A00;
    public final Map<DspViewableNode, Map<C2956q0, C2952pu<?, ?>>> A01;
    public final Map<DspViewableNode, C2952pu<?, ?>> A02;
    public final Set<C2952pu<?, ?>> A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A05[2].length() == 16) {
                throw new RuntimeException();
            }
            A05[4] = "98jXpaahab3bDGJdYqYLl1lSw3QVyboZ";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 47);
            i4++;
        }
    }

    public static void A01() {
        A04 = new byte[]{-18, -10, -7, -3, 2, OtaCommandGenerator.CMD_GET_INFO, -91, -90, -80, BuiltinOptions.WhileOptions, -109, -90, -94, -76, -83, -84, -90, -85, -79, -127, -98, -79, -98, BuiltinOptions.WhileOptions, -91, -98, -80, BuiltinOptions.WhileOptions, -97, -94, -94, -85, BuiltinOptions.WhileOptions, ProtocolBytes.SOF, -94, -92, -90, -80, -79, -94, ProtocolBytes.SOF, -94, -95, BuiltinOptions.WhileOptions, -97, -94, -93, -84, ProtocolBytes.SOF, -94, BuiltinOptions.WhileOptions, -98, -85, -95, BuiltinOptions.WhileOptions, OtaCommandGenerator.CMD_OTA_INFO, -98, -85, -85, -84, -79, BuiltinOptions.WhileOptions, -97, -94, BuiltinOptions.WhileOptions, ProtocolBytes.SOF, -94, BuiltinOptions.Conv3DOptions, -78, -80, -94, -95, BuiltinOptions.HashtableOptions, -104, -102, -85, OtaCommandGenerator.CMD_OTA_INFO, -90, -91, -19, -25, -5, 13, 14, 3, 4, -14, -26, -60, TransmissionUnpacked.HD_VAL_MAGIC_HB, -17, -25, -22, -24, -53, -66, -52, -50, -59, -51, TransmissionUnpacked.HD_VAL_MAGIC_HB, -21, -47, -22, -18, -31, -29, -27, -17, TransmissionUnpacked.HD_VAL_MAGIC_HB, -31, -18, -83, OtaCommandGenerator.CMD_OTA_INFO, -100, -82, -89, -90, OtaCommandGenerator.CMD_OTA_INFO, -91, -85, BuiltinOptions.SignOptions, -104, -85, -104};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A07(DspViewableNode dspViewableNode, C2956q0 c2956q0, C2952pu<?, ?> c2952pu) {
        C2919p6.A09(dspViewableNode, A00(82, 4, 112));
        C2919p6.A09(c2956q0, A00(79, 3, 83));
        C2919p6.A09(c2952pu, A00(112, 13, 8));
        A03(c2952pu);
        Map<DspViewableNode, Map<C2956q0, C2952pu<?, ?>>> map = this.A01;
        WeakHashMap weakHashMap = map.get(dspViewableNode);
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            map.put(dspViewableNode, weakHashMap);
        }
        C2952pu<?, ?> put = weakHashMap.put(c2956q0, c2952pu);
        if (put != null) {
            A02(put);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A09(DspViewableNode dspViewableNode, InterfaceC13559v<? super C2952pu<?, ?>, C2928pL> interfaceC13559v) {
        Collection<C2952pu<?, ?>> values;
        C2919p6.A09(dspViewableNode, A00(82, 4, 112));
        C2919p6.A09(interfaceC13559v, A00(73, 6, 8));
        C2952pu<?, ?> c2952pu = this.A02.get(dspViewableNode);
        if (c2952pu != null) {
            interfaceC13559v.AAB(c2952pu);
        }
        Map<C2956q0, C2952pu<?, ?>> map = this.A01.get(dspViewableNode);
        if (map != null && (values = map.values()) != null) {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                interfaceC13559v.AAB((C2952pu) it.next());
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0A(Collection<DspViewableNode> collection, List<C2952pu<?, ?>> list) {
        C2919p6.A09(collection, A00(94, 6, 42));
        C2919p6.A09(list, A00(100, 12, 77));
        collection.addAll(this.A02.keySet());
        if (this.A00.A00) {
            Set<DspViewableNode> keySet = this.A01.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : keySet) {
                if (!this.A02.containsKey((DspViewableNode) obj)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                collection.add((DspViewableNode) it.next());
            }
        }
        if (!this.A03.isEmpty()) {
            list.addAll(this.A03);
            this.A03.clear();
        }
    }

    static {
        A01();
    }

    public ViewpointRegistry(ViewpointQeConfig viewpointQeConfig) {
        C2919p6.A09(viewpointQeConfig, A00(86, 8, 82));
        this.A00 = viewpointQeConfig;
        this.A02 = new WeakHashMap();
        this.A03 = new LinkedHashSet();
        this.A01 = new WeakHashMap();
    }

    private final void A02(C2952pu<?, ?> c2952pu) {
        if (c2952pu.A04) {
            c2952pu.A00 = EnumC2953pv.A04;
            this.A03.add(c2952pu);
        }
    }

    private final void A03(C2952pu<?, ?> c2952pu) {
        if (!c2952pu.A04 || c2952pu.A00 == EnumC2953pv.A02) {
            EnumC2953pv enumC2953pv = EnumC2953pv.A03;
            if (A05[4].charAt(11) == 'f') {
                throw new RuntimeException();
            }
            A05[0] = "Mg2SmI";
            c2952pu.A00 = enumC2953pv;
            return;
        }
        throw new IllegalArgumentException(A00(5, 68, 14));
    }

    public final synchronized C2952pu<?, ?> A04(DspViewableNode dspViewableNode) {
        C2952pu<?, ?> c2952pu;
        C2919p6.A09(dspViewableNode, A00(82, 4, 112));
        c2952pu = this.A02.get(dspViewableNode);
        if (c2952pu == null) {
            c2952pu = C2952pu.A0B;
            C2919p6.A08(c2952pu, A00(0, 5, 122));
        }
        return c2952pu;
    }

    public final synchronized void A05(DspViewableNode dspViewableNode) {
        C2919p6.A09(dspViewableNode, A00(82, 4, 112));
        C2952pu it = this.A02.remove(dspViewableNode);
        if (it != null) {
            A02(it);
        }
    }

    public final synchronized void A06(DspViewableNode dspViewableNode, C2956q0 c2956q0) {
        C2919p6.A09(dspViewableNode, A00(82, 4, 112));
        C2919p6.A09(c2956q0, A00(79, 3, 83));
        Map<C2956q0, C2952pu<?, ?>> map = this.A01.get(dspViewableNode);
        if (map != null) {
            C2952pu<?, ?> remove = map.remove(c2956q0);
            if (remove != null) {
                A02(remove);
            }
            if (map.isEmpty()) {
                Map nodeDataMap = this.A01;
                nodeDataMap.remove(dspViewableNode);
            }
        }
    }

    public final synchronized void A08(DspViewableNode dspViewableNode, C2952pu<?, ?> c2952pu) {
        C2919p6.A09(dspViewableNode, A00(82, 4, 112));
        C2919p6.A09(c2952pu, A00(112, 13, 8));
        A03(c2952pu);
        C2952pu it = this.A02.put(dspViewableNode, c2952pu);
        if (it != null) {
            A02(it);
        }
    }
}
