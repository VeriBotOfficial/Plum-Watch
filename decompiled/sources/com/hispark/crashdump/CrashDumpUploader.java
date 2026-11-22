package com.hispark.crashdump;

import com.wakeup.feature.health.bloodGlucose.diabetes.DiabetesRiskFormActivity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* compiled from: CrashDumpUploader.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u008f\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2O\b\u0002\u0010\r\u001aI\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000eH¦@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/hispark/crashdump/CrashDumpUploader;", "", DiabetesRiskFormActivity.MODE_UPLOAD, "Lkotlin/Result;", "", "record", "Lcom/hispark/crashdump/DumpUploadRecord;", "deviceInfo", "Lcom/hispark/crashdump/DumpDeviceInfo;", "authToken", "cloudFileBaseUrl", "config", "Lcom/hispark/crashdump/CrashDumpConfig;", "onProgress", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "uploadedBytes", "totalBytes", "rateBytesPerSecond", "", "upload-bMdYcbs", "(Lcom/hispark/crashdump/DumpUploadRecord;Lcom/hispark/crashdump/DumpDeviceInfo;Ljava/lang/String;Ljava/lang/String;Lcom/hispark/crashdump/CrashDumpConfig;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CrashDumpUploader {
    /* renamed from: upload-bMdYcbs, reason: not valid java name */
    Object mo8153uploadbMdYcbs(DumpUploadRecord dumpUploadRecord, DumpDeviceInfo dumpDeviceInfo, String str, String str2, CrashDumpConfig crashDumpConfig, Function3<? super Long, ? super Long, ? super Long, Unit> function3, Continuation<? super Result<String>> continuation);

    /* compiled from: CrashDumpUploader.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* renamed from: upload-bMdYcbs$default, reason: not valid java name */
        public static /* synthetic */ Object m8154uploadbMdYcbs$default(CrashDumpUploader crashDumpUploader, DumpUploadRecord dumpUploadRecord, DumpDeviceInfo dumpDeviceInfo, String str, String str2, CrashDumpConfig crashDumpConfig, Function3 function3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: upload-bMdYcbs");
            }
            if ((i & 32) != 0) {
                function3 = null;
            }
            return crashDumpUploader.mo8153uploadbMdYcbs(dumpUploadRecord, dumpDeviceInfo, str, str2, crashDumpConfig, function3, continuation);
        }
    }
}
