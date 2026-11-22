package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k01;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class ie0 {
    private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f15806a = -1;
    public int b = -1;

    public final void a(k01 k01Var) {
        for (int i = 0; i < k01Var.c(); i++) {
            k01.b a2 = k01Var.a(i);
            if (a2 instanceof tq) {
                tq tqVar = (tq) a2;
                if ("iTunSMPB".equals(tqVar.d) && a(tqVar.e)) {
                    return;
                }
            } else if (a2 instanceof qp0) {
                qp0 qp0Var = (qp0) a2;
                if ("com.apple.iTunes".equals(qp0Var.c) && "iTunSMPB".equals(qp0Var.d) && a(qp0Var.e)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    private boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = f92.f15466a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f15806a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
