package com.wakeup.common.utils;

import android.text.TextUtils;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.utils.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LicenseEncryptUtils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/wakeup/common/utils/LicenseEncryptUtils;", "", "<init>", "()V", "TAG", "", "encrypt", "data", "reverseCaseLetters", "input", "shiftDigits", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LicenseEncryptUtils {
    public static final LicenseEncryptUtils INSTANCE = new LicenseEncryptUtils();
    private static final String TAG = "LicenseEncryptUtils";

    private LicenseEncryptUtils() {
    }

    public final String encrypt(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (TextUtils.isEmpty(data)) {
            LogUtils.d(TAG, "待加密数据不能为空");
            return "";
        }
        try {
            Base64.Encoder encoder = Base64.getEncoder();
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = data.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            String encodeToString = encoder.encodeToString(bytes);
            Intrinsics.checkNotNull(encodeToString);
            return shiftDigits(reverseCaseLetters(encodeToString));
        } catch (Exception e) {
            LogUtils.d(TAG, "encrypt error: " + e.getMessage());
            return "";
        }
    }

    private final String reverseCaseLetters(String input) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = input.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        for (char c : charArray) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private final String shiftDigits(String input) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = input.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        int i = 0;
        for (char c : charArray) {
            if (Character.isDigit(c)) {
                int numericValue = Character.getNumericValue(c);
                sb.append((i % 2 == 0 ? numericValue + 1 : numericValue + 2) % 10);
                Integer.valueOf(i);
                i++;
            } else {
                sb.append(c);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
