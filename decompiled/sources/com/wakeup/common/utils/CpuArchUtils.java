package com.wakeup.common.utils;

import android.os.Build;
import com.facebook.soloader.MinElf;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CpuArchUtils.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/wakeup/common/utils/CpuArchUtils;", "", "<init>", "()V", "getSupportedAbis", "", "", "()[Ljava/lang/String;", "getPrimaryCpuArch", "is64BitArch", "", "getCpuArchInfo", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CpuArchUtils {
    public static final CpuArchUtils INSTANCE = new CpuArchUtils();

    private CpuArchUtils() {
    }

    public final String[] getSupportedAbis() {
        try {
            String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
            Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
            return SUPPORTED_ABIS;
        } catch (Exception e) {
            e.printStackTrace();
            return new String[0];
        }
    }

    public final String getPrimaryCpuArch() {
        String[] supportedAbis = getSupportedAbis();
        return !(supportedAbis.length == 0) ? supportedAbis[0] : "unknown";
    }

    public final boolean is64BitArch() {
        String primaryCpuArch = getPrimaryCpuArch();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = primaryCpuArch.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = lowerCase;
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "arm64", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) MinElf.ISA.X86_64, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "mips64", false, 2, (Object) null);
    }

    public final String getCpuArchInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("主架构：" + getPrimaryCpuArch() + "\n");
        sb.append("是否64位：" + is64BitArch() + "\n");
        sb.append("所有支持的架构：" + ArraysKt.joinToString$default(getSupportedAbis(), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
