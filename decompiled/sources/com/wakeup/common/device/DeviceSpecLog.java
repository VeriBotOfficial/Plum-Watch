package com.wakeup.common.device;

import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.text.format.Formatter;
import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.utils.AdvConstance;
import com.wakeup.common.utils.CpuArchUtils;
import com.xiaomi.mipush.sdk.Constants;
import io.nats.client.support.ApiConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DeviceSpecLog.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/device/DeviceSpecLog;", "", "<init>", "()V", "TAG", "", "logged", "", "logOnce", "", "context", "Landroid/content/Context;", "collect", "Lcom/wakeup/common/device/DeviceSpecSnapshot;", "phoneName", "romSpace", "Lkotlin/Pair;", "", "formatBytes", ApiConstants.BYTES, "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceSpecLog {
    public static final DeviceSpecLog INSTANCE = new DeviceSpecLog();
    private static final String TAG = "DeviceSpec";
    private static volatile boolean logged;

    /* compiled from: DeviceSpecLog.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceTier.values().length];
            try {
                iArr[DeviceTier.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceTier.MID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceTier.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DeviceSpecLog() {
    }

    @JvmStatic
    public static final void logOnce(Context context) {
        Object m14057constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        if (logged) {
            return;
        }
        logged = true;
        try {
            Result.Companion companion = Result.INSTANCE;
            LogUtils.i(TAG, collect(context).toLogLine());
            m14057constructorimpl = Result.m14057constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m14060exceptionOrNullimpl = Result.m14060exceptionOrNullimpl(m14057constructorimpl);
        if (m14060exceptionOrNullimpl != null) {
            LogUtils.w(TAG, "logOnce failed: " + m14060exceptionOrNullimpl.getMessage());
        }
    }

    @JvmStatic
    public static final DeviceSpecSnapshot collect(Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Object systemService = applicationContext.getSystemService(Const.STR_PROCESS_TAG);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager activityManager = (ActivityManager) systemService;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        Intrinsics.checkNotNull(applicationContext);
        DeviceLevel.get(applicationContext);
        DeviceSpecLog deviceSpecLog = INSTANCE;
        Pair<Long, Long> romSpace = deviceSpecLog.romSpace();
        long longValue = romSpace.component1().longValue();
        long longValue2 = romSpace.component2().longValue();
        int i = WhenMappings.$EnumSwitchMapping$0[DeviceLevel.get(applicationContext).ordinal()];
        if (i == 1) {
            str = "LOW";
        } else if (i == 2) {
            str = "MID";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "HIGH";
        }
        String str2 = str;
        String phoneName = deviceSpecLog.phoneName(applicationContext);
        String str3 = Build.MANUFACTURER + " " + Build.MODEL;
        String formatBytes = deviceSpecLog.formatBytes(applicationContext, memoryInfo.totalMem);
        String formatBytes2 = deviceSpecLog.formatBytes(applicationContext, memoryInfo.availMem);
        String formatBytes3 = deviceSpecLog.formatBytes(applicationContext, longValue);
        String formatBytes4 = deviceSpecLog.formatBytes(applicationContext, longValue2);
        String primaryCpuArch = CpuArchUtils.INSTANCE.getPrimaryCpuArch();
        String str4 = CpuArchUtils.INSTANCE.is64BitArch() ? "64" : AdvConstance.FRIEND_LOCATION;
        String joinToString$default = ArraysKt.joinToString$default(CpuArchUtils.INSTANCE.getSupportedAbis(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        if (StringsKt.isBlank(joinToString$default)) {
            joinToString$default = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
        String str5 = joinToString$default;
        String str6 = Build.VERSION.RELEASE + Separators.LPAREN + Build.VERSION.SDK_INT + Separators.RPAREN;
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(DeviceLevel.totalGb())}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return new DeviceSpecSnapshot(phoneName, str3, formatBytes, formatBytes2, formatBytes3, formatBytes4, primaryCpuArch, str4, str5, str6, str2, format, activityManager.isLowRamDevice());
    }

    private final String phoneName(Context context) {
        Object m14057constructorimpl;
        Object m14057constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            DeviceSpecLog deviceSpecLog = this;
            m14057constructorimpl = Result.m14057constructorimpl(Settings.Global.getString(context.getContentResolver(), "device_name"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m14063isFailureimpl(m14057constructorimpl)) {
            m14057constructorimpl = null;
        }
        String str = (String) m14057constructorimpl;
        String str2 = str;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            return str;
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            DeviceSpecLog deviceSpecLog2 = this;
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            m14057constructorimpl2 = Result.m14057constructorimpl(defaultAdapter != null ? defaultAdapter.getName() : null);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            m14057constructorimpl2 = Result.m14057constructorimpl(ResultKt.createFailure(th2));
        }
        String str3 = (String) (Result.m14063isFailureimpl(m14057constructorimpl2) ? null : m14057constructorimpl2);
        String str4 = str3;
        if (str4 != null && !StringsKt.isBlank(str4)) {
            return str3;
        }
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return MODEL;
    }

    private final Pair<Long, Long> romSpace() {
        Object m14057constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            DeviceSpecLog deviceSpecLog = this;
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            long blockSizeLong = statFs.getBlockSizeLong();
            m14057constructorimpl = Result.m14057constructorimpl(TuplesKt.to(Long.valueOf(statFs.getAvailableBlocksLong() * blockSizeLong), Long.valueOf(statFs.getBlockCountLong() * blockSizeLong)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        Pair pair = TuplesKt.to(0L, 0L);
        if (Result.m14063isFailureimpl(m14057constructorimpl)) {
            m14057constructorimpl = pair;
        }
        return (Pair) m14057constructorimpl;
    }

    private final String formatBytes(Context context, long bytes) {
        if (bytes <= 0) {
            return Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
        String formatFileSize = Formatter.formatFileSize(context, bytes);
        Intrinsics.checkNotNullExpressionValue(formatFileSize, "formatFileSize(...)");
        return formatFileSize;
    }
}
