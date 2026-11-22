package com.canhub.cropper.utils;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetUriForFile.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0003H\u0000¨\u0006\b"}, d2 = {"getUriForFile", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "file", "Ljava/io/File;", "authority", "", "cropper_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class GetUriForFileKt {
    public static final String authority(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getPackageName() + ".cropper.fileprovider";
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00da A[Catch: Exception -> 0x00e3, TryCatch #6 {Exception -> 0x00e3, blocks: (B:9:0x0022, B:19:0x0068, B:34:0x00da, B:36:0x00df, B:37:0x00e2, B:27:0x00ce, B:29:0x00d3), top: B:8:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df A[Catch: Exception -> 0x00e3, TryCatch #6 {Exception -> 0x00e3, blocks: (B:9:0x0022, B:19:0x0068, B:34:0x00da, B:36:0x00df, B:37:0x00e2, B:27:0x00ce, B:29:0x00d3), top: B:8:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.net.Uri getUriForFile(android.content.Context r9, java.io.File r10) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.utils.GetUriForFileKt.getUriForFile(android.content.Context, java.io.File):android.net.Uri");
    }
}
