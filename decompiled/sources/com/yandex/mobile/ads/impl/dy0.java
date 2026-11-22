package com.yandex.mobile.ads.impl;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public final class dy0 {
    public static Map a(tx0 mediatedAdData) {
        Intrinsics.checkNotNullParameter(mediatedAdData, "mediatedAdData");
        MediatedAdapterInfo b = mediatedAdData.b();
        Pair[] pairArr = new Pair[3];
        String adapterVersion = b.getAdapterVersion();
        String str = AbstractJsonLexerKt.NULL;
        if (adapterVersion == null) {
            adapterVersion = AbstractJsonLexerKt.NULL;
        }
        pairArr[0] = TuplesKt.to("mediation_adapter_version", adapterVersion);
        String networkName = b.getNetworkName();
        if (networkName == null) {
            networkName = AbstractJsonLexerKt.NULL;
        }
        pairArr[1] = TuplesKt.to("mediation_network_name", networkName);
        String networkSdkVersion = b.getNetworkSdkVersion();
        if (networkSdkVersion != null) {
            str = networkSdkVersion;
        }
        pairArr[2] = TuplesKt.to("mediation_network_sdk_version", str);
        return MapsKt.mapOf(pairArr);
    }
}
