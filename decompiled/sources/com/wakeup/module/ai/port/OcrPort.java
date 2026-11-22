package com.wakeup.module.ai.port;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import kotlin.Metadata;

/* compiled from: OcrPort.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/wakeup/module/ai/port/OcrPort;", "", "<init>", "()V", "TAG", "", "imgOcr", "Lkotlin/Pair;", "", "file", "Ljava/io/File;", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMimeType", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OcrPort {
    private final String TAG = "OcrPort";

    /* JADX WARN: Removed duplicated region for block: B:14:0x0090 A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:11:0x002e, B:12:0x0088, B:14:0x0090, B:16:0x009f, B:19:0x00a6, B:20:0x00b1, B:22:0x00b7, B:24:0x00c9, B:27:0x00d8, B:29:0x00ed, B:31:0x00f6), top: B:10:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:11:0x002e, B:12:0x0088, B:14:0x0090, B:16:0x009f, B:19:0x00a6, B:20:0x00b1, B:22:0x00b7, B:24:0x00c9, B:27:0x00d8, B:29:0x00ed, B:31:0x00f6), top: B:10:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object imgOcr(java.io.File r9, kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Integer, java.lang.String>> r10) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.ai.port.OcrPort.imgOcr(java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final String getMimeType(File file) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(file).toString()));
    }
}
