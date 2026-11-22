package com.wakeup.feature.health.bloodGlucose.diabetes;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiabetesSampleFileHelper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/wakeup/feature/health/bloodGlucose/diabetes/DiabetesSampleFileHelper;", "", "<init>", "()V", "ASSET_NAME", "", "DISPLAY_NAME", "copyFromAssets", "Ljava/io/File;", "context", "Landroid/content/Context;", "saveToDownloads", "", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiabetesSampleFileHelper {
    public static final int $stable = 0;
    private static final String ASSET_NAME = "diabetes_sample_report.pdf";
    public static final String DISPLAY_NAME = "示例体检报告.pdf";
    public static final DiabetesSampleFileHelper INSTANCE = new DiabetesSampleFileHelper();

    private DiabetesSampleFileHelper() {
    }

    public final File copyFromAssets(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            File file = new File(context.getCacheDir(), ASSET_NAME);
            FileOutputStream open = context.getAssets().open(ASSET_NAME);
            try {
                InputStream inputStream = open;
                open = new FileOutputStream(file);
                try {
                    Intrinsics.checkNotNull(inputStream);
                    ByteStreamsKt.copyTo$default(inputStream, open, 0, 2, null);
                    CloseableKt.closeFinally(open, null);
                    CloseableKt.closeFinally(open, null);
                    return file;
                } finally {
                }
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean saveToDownloads(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            OutputStream open = context.getAssets().open(ASSET_NAME);
            try {
                InputStream inputStream = open;
                Intrinsics.checkNotNull(inputStream);
                byte[] readBytes = ByteStreamsKt.readBytes(inputStream);
                CloseableKt.closeFinally(open, null);
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", DISPLAY_NAME);
                    contentValues.put("mime_type", "application/pdf");
                    contentValues.put("is_pending", (Integer) 1);
                    contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                    Uri insert = context.getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
                    if (insert == null) {
                        return false;
                    }
                    OutputStream openOutputStream = context.getContentResolver().openOutputStream(insert);
                    if (openOutputStream != null) {
                        open = openOutputStream;
                        try {
                            open.write(readBytes);
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(open, null);
                        } finally {
                        }
                    }
                    contentValues.clear();
                    contentValues.put("is_pending", (Integer) 0);
                    context.getContentResolver().update(insert, contentValues, null, null);
                } else {
                    File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                    if (!externalStoragePublicDirectory.exists()) {
                        externalStoragePublicDirectory.mkdirs();
                    }
                    FilesKt.writeBytes(new File(externalStoragePublicDirectory, DISPLAY_NAME), readBytes);
                }
                return true;
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Exception unused) {
            return false;
        }
    }
}
