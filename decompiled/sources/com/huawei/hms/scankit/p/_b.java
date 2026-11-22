package com.huawei.hms.scankit.p;

import androidx.core.view.InputDeviceCompat;
import org.apache.commons.net.telnet.TelnetCommand;

/* compiled from: Base256Encoder.java */
/* loaded from: classes14.dex */
final class _b implements InterfaceC2998ec {
    _b() {
    }

    public int a() {
        return 5;
    }

    @Override // com.huawei.hms.scankit.p.InterfaceC2998ec
    public void a(C3002fc c3002fc) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!c3002fc.h()) {
                break;
            }
            sb.append(c3002fc.c());
            c3002fc.f++;
            if (C3010hc.a(c3002fc.d(), c3002fc.f, a()) != a()) {
                c3002fc.b(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int a2 = c3002fc.a() + length + 1;
        c3002fc.c(a2);
        boolean z = c3002fc.g().a() - a2 > 0;
        if (c3002fc.h() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: " + length);
                }
                sb.setCharAt(0, (char) ((length / 250) + TelnetCommand.GA));
                sb.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            c3002fc.a(a(sb.charAt(i), c3002fc.a() + 1));
        }
    }

    private static char a(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 + InputDeviceCompat.SOURCE_ANY);
    }
}
