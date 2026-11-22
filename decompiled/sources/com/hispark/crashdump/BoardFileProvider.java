package com.hispark.crashdump;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\bJN\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010H¦@¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/hispark/crashdump/BoardFileProvider;", "", "listDirectory", "", "Lcom/hispark/crashdump/BoardFileItem;", "deviceId", "", "directoryPath", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFile", "Ljava/io/File;", "remotePath", "expectedSize", "", "suggestedFileName", "onProgress", "Lkotlin/Function1;", "Lcom/hispark/crashdump/DumpFileTransferProgress;", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BoardFileProvider {
    Object fetchFile(String str, String str2, Long l, String str3, Function1<? super DumpFileTransferProgress, Unit> function1, Continuation<? super File> continuation);

    Object listDirectory(String str, String str2, Continuation<? super List<BoardFileItem>> continuation);

    /* compiled from: CrashDumpModels.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object fetchFile$default(BoardFileProvider boardFileProvider, String str, String str2, Long l, String str3, Function1 function1, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchFile");
            }
            if ((i & 4) != 0) {
                l = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            if ((i & 16) != 0) {
                function1 = null;
            }
            return boardFileProvider.fetchFile(str, str2, l, str3, function1, continuation);
        }
    }
}
