package com.wakeup.license;

import android.text.TextUtils;
import com.wakeup.license.binary.Base64;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086 ¨\u0006\u0007"}, d2 = {"Lcom/wakeup/license/Utils;", "", "()V", "encrypt", "", "data", "nativeEncrypt", "WkLicense_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Utils {
    public static final Utils INSTANCE = new Utils();

    public final native String nativeEncrypt(String data);

    private Utils() {
    }

    static {
        System.loadLibrary("wk-license-native-lib");
    }

    public final String encrypt(String data) {
        String nativeEncrypt;
        Intrinsics.checkNotNullParameter(data, "data");
        if (TextUtils.isEmpty(data)) {
            return "";
        }
        try {
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] encodeBase64 = Base64.encodeBase64(bytes);
            Intrinsics.checkNotNullExpressionValue(encodeBase64, "encodeBase64(data.toByteArray())");
            nativeEncrypt = nativeEncrypt(new String(encodeBase64, Charsets.UTF_8));
        } catch (Exception unused) {
        }
        return nativeEncrypt != null ? nativeEncrypt : "";
    }
}
