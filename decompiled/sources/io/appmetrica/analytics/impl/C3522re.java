package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;

/* renamed from: io.appmetrica.analytics.impl.re, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3522re extends Jc {
    public C3522re() {
        super(EnumC3597ue.UNDEFINED);
        a(1, EnumC3597ue.WIFI);
        a(0, EnumC3597ue.CELL);
        a(3, EnumC3597ue.ETHERNET);
        a(2, EnumC3597ue.BLUETOOTH);
        a(4, EnumC3597ue.VPN);
        if (AndroidUtils.isApiAchieved(27)) {
            a(6, EnumC3597ue.LOWPAN);
        }
        if (AndroidUtils.isApiAchieved(26)) {
            a(5, EnumC3597ue.WIFI_AWARE);
        }
    }
}
