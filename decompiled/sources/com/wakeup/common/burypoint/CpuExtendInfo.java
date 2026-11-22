package com.wakeup.common.burypoint;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.wakeup.common.utils.CpuArchUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/wakeup/common/burypoint/CpuExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "is64", "", "cpuArch", "", "cpuArchInfo", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()I", "getCpuArch", "()Ljava/lang/String;", "getCpuArchInfo", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CpuExtendInfo extends BaseExtendInfo {
    private final String cpuArch;
    private final String cpuArchInfo;
    private final int is64;

    public /* synthetic */ CpuExtendInfo(int i, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CpuArchUtils.INSTANCE.is64BitArch() ? 64 : 32 : i, (i2 & 2) != 0 ? CpuArchUtils.INSTANCE.getPrimaryCpuArch() : str, (i2 & 4) != 0 ? CpuArchUtils.INSTANCE.getCpuArchInfo() : str2, str3, str4);
    }

    /* renamed from: is64, reason: from getter */
    public final int getIs64() {
        return this.is64;
    }

    public final String getCpuArch() {
        return this.cpuArch;
    }

    public final String getCpuArchInfo() {
        return this.cpuArchInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CpuExtendInfo(int i, String cpuArch, String cpuArchInfo, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(cpuArch, "cpuArch");
        Intrinsics.checkNotNullParameter(cpuArchInfo, "cpuArchInfo");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.is64 = i;
        this.cpuArch = cpuArch;
        this.cpuArchInfo = cpuArchInfo;
    }
}
