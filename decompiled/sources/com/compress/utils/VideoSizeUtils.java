package com.compress.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes14.dex */
public class VideoSizeUtils {
    private static final String TAG = "VideoSizeUtils";

    public static long getVideoSize(Context context, Uri uri) {
        String scheme;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return -1L;
        }
        if ("content".equals(scheme)) {
            return getVideoSizeFromContentUri(context.getContentResolver(), uri);
        }
        if ("file".equals(scheme)) {
            return getVideoSizeFromFileUri(uri);
        }
        return getVideoSizeByOpeningStream(context, uri);
    }

    private static long getVideoSizeFromContentUri(ContentResolver contentResolver, Uri uri) {
        int columnIndex;
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(uri, null, null, null, null);
                if (cursor != null && cursor.moveToFirst() && (columnIndex = cursor.getColumnIndex("_size")) != -1) {
                    long j = cursor.getLong(columnIndex);
                    if (j > 0) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return j;
                    }
                }
                long videoSizeFromAssetFileDescriptor = getVideoSizeFromAssetFileDescriptor(contentResolver, uri);
                if (cursor != null) {
                    cursor.close();
                }
                return videoSizeFromAssetFileDescriptor;
            } catch (Exception e) {
                Log.e(TAG, "Error getting video size from content URI", e);
                long videoSizeFromAssetFileDescriptor2 = getVideoSizeFromAssetFileDescriptor(contentResolver, uri);
                if (cursor != null) {
                    cursor.close();
                }
                return videoSizeFromAssetFileDescriptor2;
            }
        } finally {
        }
    }

    private static long getVideoSizeFromAssetFileDescriptor(ContentResolver contentResolver, Uri uri) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            try {
                try {
                    assetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                } catch (Exception e) {
                    Log.e(TAG, "Error getting video size from AssetFileDescriptor", e);
                    if (assetFileDescriptor == null) {
                        return -1L;
                    }
                    assetFileDescriptor.close();
                }
                if (assetFileDescriptor != null) {
                    long length = assetFileDescriptor.getLength();
                    if (assetFileDescriptor != null) {
                        try {
                            return length;
                        } catch (Exception e2) {
                        }
                    }
                    return length;
                }
                if (assetFileDescriptor == null) {
                    return -1L;
                }
                assetFileDescriptor.close();
                return -1L;
            } finally {
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (Exception e22) {
                        Log.e(TAG, "Error closing AssetFileDescriptor", e22);
                    }
                }
            }
        } catch (Exception e3) {
            Log.e(TAG, "Error closing AssetFileDescriptor", e3);
            return -1L;
        }
    }

    private static long getVideoSizeFromFileUri(Uri uri) {
        try {
            String path = uri.getPath();
            if (path == null) {
                return -1L;
            }
            File file = new File(path);
            if (file.exists()) {
                return file.length();
            }
            return -1L;
        } catch (Exception e) {
            Log.e(TAG, "Error getting video size from file URI", e);
            return -1L;
        }
    }

    private static long getVideoSizeByOpeningStream(Context context, Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = context.getContentResolver().openInputStream(uri);
                    if (inputStream == null) {
                        if (inputStream == null) {
                            return -1L;
                        }
                        inputStream.close();
                        return -1L;
                    }
                    byte[] bArr = new byte[8192];
                    long j = 0;
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        j += read;
                    }
                    if (inputStream != null) {
                        try {
                            return j;
                        } catch (Exception e) {
                        }
                    }
                    return j;
                } catch (Exception e2) {
                    Log.e(TAG, "Error closing input stream", e2);
                    return -1L;
                }
            } catch (Exception e3) {
                Log.e(TAG, "Error getting video size by opening stream", e3);
                if (inputStream == null) {
                    return -1L;
                }
                inputStream.close();
                return -1L;
            }
        } finally {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (Exception e4) {
                    Log.e(TAG, "Error closing input stream", e4);
                }
            }
        }
    }

    public static String formatFileSize(long j) {
        if (j <= 0) {
            return "0 B";
        }
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        double d = j;
        int log10 = (int) (Math.log10(d) / Math.log10(1024.0d));
        int i = log10 < 5 ? log10 : 4;
        return String.format("%.2f %s", Double.valueOf(d / Math.pow(1024.0d, i)), strArr[i]);
    }

    public static VideoSizeInfo getVideoSizeInfo(Context context, Uri uri) {
        long videoSize = getVideoSize(context, uri);
        return new VideoSizeInfo(videoSize, formatFileSize(videoSize));
    }

    public static class VideoSizeInfo {
        private String formattedSize;
        private long sizeInBytes;

        public VideoSizeInfo(long j, String str) {
            this.sizeInBytes = j;
            this.formattedSize = str;
        }

        public long getSizeInBytes() {
            return this.sizeInBytes;
        }

        public String getFormattedSize() {
            return this.formattedSize;
        }

        public double getSizeInKB() {
            return this.sizeInBytes / 1024.0d;
        }

        public double getSizeInMB() {
            return this.sizeInBytes / 1048576.0d;
        }
    }
}
