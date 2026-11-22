package com.hispark.clouddiag.devicefile;

import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* compiled from: DeviceFileUploader.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0083\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2O\b\u0002\u0010\u000b\u001aI\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fH¦@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/hispark/clouddiag/devicefile/DeviceFileSourceDownloader;", "", "download", "Lkotlin/Result;", "", "downloadUrl", "", "targetFile", "Ljava/io/File;", "expectedSize", "", "onProgress", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "downloadedBytes", "totalBytes", "rateBytesPerSecond", "download-yxL6bBk", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/Long;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface DeviceFileSourceDownloader {
    /* renamed from: download-yxL6bBk, reason: not valid java name */
    Object mo8122downloadyxL6bBk(String str, File file, Long l, Function3<? super Long, ? super Long, ? super Long, Unit> function3, Continuation<? super Result<Unit>> continuation);

    /* compiled from: DeviceFileUploader.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: download-yxL6bBk$default, reason: not valid java name */
        public static /* synthetic */ Object m8123downloadyxL6bBk$default(DeviceFileSourceDownloader deviceFileSourceDownloader, String str, File file, Long l, Function3 function3, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: download-yxL6bBk");
            }
            if ((i & 4) != 0) {
                l = null;
            }
            if ((i & 8) != 0) {
                function3 = null;
            }
            return deviceFileSourceDownloader.mo8122downloadyxL6bBk(str, file, l, function3, continuation);
        }
    }
}
