package com.canhub.cropper.utils;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.phancy.mini.utils.MiniStorage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GetFilePathFromUri.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a \u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a \u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¨\u0006\u0012"}, d2 = {"copy", "", "source", "Ljava/io/InputStream;", "target", "Ljava/io/OutputStream;", "getFileExtension", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "getFileFromContentUri", "Ljava/io/File;", "contentUri", "uniqueName", "", "getFilePathFromUri", "cropper_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class GetFilePathFromUriKt {
    public static final String getFilePathFromUri(Context context, Uri uri, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String path = uri.getPath();
        if (path != null && StringsKt.contains$default((CharSequence) path, (CharSequence) MiniStorage.SCHEME_FILE, false, 2, (Object) null)) {
            String path2 = uri.getPath();
            Intrinsics.checkNotNull(path2);
            Intrinsics.checkNotNullExpressionValue(path2, "{\n    uri.path!!\n  }");
            return path2;
        }
        String path3 = getFileFromContentUri(context, uri, z).getPath();
        Intrinsics.checkNotNullExpressionValue(path3, "{\n    getFileFromContent…uri, uniqueName).path\n  }");
        return path3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.FileOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.io.File getFileFromContentUri(android.content.Context r5, android.net.Uri r6, boolean r7) {
        /*
            java.lang.String r0 = getFileExtension(r5, r6)
            java.lang.String r1 = ""
            if (r0 != 0) goto L9
            r0 = r1
        L9:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyyMMdd_HHmmss"
            java.util.Locale r4 = java.util.Locale.getDefault()
            r2.<init>(r3, r4)
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            java.lang.String r2 = r2.format(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "temp_file_"
            r3.<init>(r4)
            if (r7 == 0) goto L28
            r1 = r2
        L28:
            java.lang.StringBuilder r7 = r3.append(r1)
            r1 = 46
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.io.File r0 = new java.io.File
            java.io.File r1 = r5.getCacheDir()
            r0.<init>(r1, r7)
            r0.createNewFile()
            r7 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6d
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L83
            java.io.InputStream r7 = r5.openInputStream(r6)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L83
            if (r7 == 0) goto L5c
            r5 = r1
            java.io.OutputStream r5 = (java.io.OutputStream) r5     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L83
            copy(r7, r5)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L83
        L5c:
            r1.flush()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L83
            if (r7 == 0) goto L64
            r7.close()
        L64:
            r1.close()
            return r0
        L68:
            r5 = move-exception
            goto L6f
        L6a:
            r5 = move-exception
            r1 = r7
            goto L84
        L6d:
            r5 = move-exception
            r1 = r7
        L6f:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L83
            r5 = r7
            java.io.InputStream r5 = (java.io.InputStream) r5
            if (r7 == 0) goto L7a
            r7.close()
        L7a:
            r5 = r1
            java.io.FileOutputStream r5 = (java.io.FileOutputStream) r5
            if (r1 == 0) goto L82
            r1.close()
        L82:
            return r0
        L83:
            r5 = move-exception
        L84:
            r6 = r7
            java.io.InputStream r6 = (java.io.InputStream) r6
            if (r7 == 0) goto L8c
            r7.close()
        L8c:
            r6 = r1
            java.io.FileOutputStream r6 = (java.io.FileOutputStream) r6
            if (r1 == 0) goto L94
            r1.close()
        L94:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.utils.GetFilePathFromUriKt.getFileFromContentUri(android.content.Context, android.net.Uri, boolean):java.io.File");
    }

    private static final String getFileExtension(Context context, Uri uri) {
        if (Intrinsics.areEqual(uri.getScheme(), "content")) {
            return MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri));
        }
        String path = uri.getPath();
        if (path != null) {
            return MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(path)).toString());
        }
        return null;
    }

    private static final void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }
}
