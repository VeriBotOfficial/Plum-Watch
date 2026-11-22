package com.baidu.mapauto.auth.org.spongycastle.util;

import io.livekit.android.room.util.MediaConstraintKeys;
import java.security.AccessControlException;
import java.security.AccessController;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f8307a = new ThreadLocal();

    public static boolean a() {
        try {
            String str = (String) AccessController.doPrivileged(new b());
            if (str == null) {
                return false;
            }
            int i = d.f8308a;
            char[] charArray = str.toCharArray();
            boolean z = false;
            for (int i2 = 0; i2 != charArray.length; i2++) {
                char c = charArray[i2];
                if ('A' <= c && 'Z' >= c) {
                    charArray[i2] = (char) (c + ' ');
                    z = true;
                }
            }
            if (z) {
                str = new String(charArray);
            }
            return MediaConstraintKeys.TRUE.equals(str);
        } catch (AccessControlException unused) {
            return false;
        }
    }
}
