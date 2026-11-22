package com.phancy.mini.utils;

import java.io.File;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileSize.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\tH\u0007J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/phancy/mini/utils/FileSize;", "", "()V", "SIZE_TYPE_B", "", "SIZE_TYPE_GB", "SIZE_TYPE_KB", "SIZE_TYPE_MB", "autoFormatFileSize", "", "size", "", "formatFileSize", "", "sizeType", "getFileSize", "file", "Ljava/io/File;", "getFileStorageSize", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FileSize {
    public static final FileSize INSTANCE = new FileSize();
    public static final int SIZE_TYPE_B = 1;
    public static final int SIZE_TYPE_GB = 4;
    public static final int SIZE_TYPE_KB = 2;
    public static final int SIZE_TYPE_MB = 3;

    private FileSize() {
    }

    @JvmStatic
    public static final double getFileSize(String file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return getFileSize(new File(file));
    }

    @JvmStatic
    public static final double getFileSize(String file, int sizeType) {
        Intrinsics.checkNotNullParameter(file, "file");
        return getFileSize(new File(file), sizeType);
    }

    @JvmStatic
    public static final double getFileSize(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return formatFileSize(INSTANCE.getFileStorageSize(file));
    }

    @JvmStatic
    public static final double getFileSize(File file, int sizeType) {
        Intrinsics.checkNotNullParameter(file, "file");
        return formatFileSize(INSTANCE.getFileStorageSize(file), sizeType);
    }

    private final long getFileStorageSize(File file) {
        long j = 0;
        for (File file2 : FilesKt.walkTopDown(file)) {
            j += file2.isFile() ? file2.length() : 0L;
        }
        return j;
    }

    @JvmStatic
    public static final double formatFileSize(long size) {
        return formatFileSize(size, 3);
    }

    @JvmStatic
    public static final double formatFileSize(long size, int sizeType) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (sizeType == 1) {
            return size;
        }
        if (sizeType == 2) {
            String format = decimalFormat.format(size / 1024);
            Intrinsics.checkNotNullExpressionValue(format, "df.format(size.toDouble() / 1024)");
            return Double.parseDouble(format);
        }
        if (sizeType == 3) {
            String format2 = decimalFormat.format(size / 1048576);
            Intrinsics.checkNotNullExpressionValue(format2, "df.format(size.toDouble() / 1048576)");
            return Double.parseDouble(format2);
        }
        if (sizeType != 4) {
            return 0.0d;
        }
        String format3 = decimalFormat.format(size / 1073741824);
        Intrinsics.checkNotNullExpressionValue(format3, "df.format(size.toDouble() / 1073741824)");
        return Double.parseDouble(format3);
    }

    public final String autoFormatFileSize(long size) {
        if (size == 0) {
            return "0B";
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (size < 1024) {
            return decimalFormat.format(size) + 'B';
        }
        if (size < 1048576) {
            return decimalFormat.format(size / 1024) + "KB";
        }
        if (size < 1073741824) {
            return decimalFormat.format(size / 1048576) + "MB";
        }
        return decimalFormat.format(size / 1073741824) + "GB";
    }
}
