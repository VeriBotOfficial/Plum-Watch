package com.hispark.clouddiag.devicefile;

import com.wakeup.feature.health.bloodGlucose.diabetes.DiabetesRiskFormActivity;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* compiled from: DeviceFileUploader.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001Jw\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2O\b\u0002\u0010\t\u001aI\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH¦@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/hispark/clouddiag/devicefile/DeviceFileUploader;", "", DiabetesRiskFormActivity.MODE_UPLOAD, "Lkotlin/Result;", "", "file", "Ljava/io/File;", "uploadUrl", "", "onProgress", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "uploadedBytes", "totalBytes", "rateBytesPerSecond", "upload-BWLJW6A", "(Ljava/io/File;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface DeviceFileUploader {
    /* renamed from: upload-BWLJW6A, reason: not valid java name */
    Object mo8126uploadBWLJW6A(File file, String str, Function3<? super Long, ? super Long, ? super Long, Unit> function3, Continuation<? super Result<Unit>> continuation);

    /* compiled from: DeviceFileUploader.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: upload-BWLJW6A$default, reason: not valid java name */
        public static /* synthetic */ Object m8127uploadBWLJW6A$default(DeviceFileUploader deviceFileUploader, File file, String str, Function3 function3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: upload-BWLJW6A");
            }
            if ((i & 4) != 0) {
                function3 = null;
            }
            return deviceFileUploader.mo8126uploadBWLJW6A(file, str, function3, continuation);
        }
    }
}
