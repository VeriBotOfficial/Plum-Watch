package com.compress.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
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
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, null, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_size")) != -1) {
                long j = cursorQuery.getLong(columnIndex);
                if (j > 0) {
                    return j;
                }
            }
            return getVideoSizeFromAssetFileDescriptor(contentResolver, uri);
        } catch (Exception e) {
            Log.e(TAG, "Error getting video size from content URI", e);
            return getVideoSizeFromAssetFileDescriptor(contentResolver, uri);
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    private static long getVideoSizeFromAssetFileDescriptor(ContentResolver contentResolver, Uri uri) {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = null;
        try {
            try {
                try {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                        long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                            try {
                                assetFileDescriptorOpenAssetFileDescriptor.close();
                            } catch (Exception e) {
                                Log.e(TAG, "Error closing AssetFileDescriptor", e);
                            }
                        }
                        return length;
                    }
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        return -1L;
                    }
                    assetFileDescriptorOpenAssetFileDescriptor.close();
                } catch (Exception e2) {
                    Log.e(TAG, "Error getting video size from AssetFileDescriptor", e2);
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        return -1L;
                    }
                    assetFileDescriptorOpenAssetFileDescriptor.close();
                }
                return -1L;
            } catch (Throwable th) {
                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                    try {
                        assetFileDescriptorOpenAssetFileDescriptor.close();
                    } catch (Exception e3) {
                        Log.e(TAG, "Error closing AssetFileDescriptor", e3);
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            Log.e(TAG, "Error closing AssetFileDescriptor", e4);
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
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                try {
                    inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream == null) {
                        if (inputStreamOpenInputStream == null) {
                            return -1L;
                        }
                        inputStreamOpenInputStream.close();
                        return -1L;
                    }
                    byte[] bArr = new byte[8192];
                    long j = 0;
                    while (true) {
                        int r8 = inputStreamOpenInputStream.read(bArr);
                        if (r8 == -1) {
                            break;
                        }
                        j += (long) r8;
                    }
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (Exception e) {
                            Log.e(TAG, "Error closing input stream", e);
                        }
                    }
                    return j;
                } catch (Exception e2) {
                    Log.e(TAG, "Error getting video size by opening stream", e2);
                    if (inputStreamOpenInputStream == null) {
                        return -1L;
                    }
                    inputStreamOpenInputStream.close();
                    return -1L;
                }
            } catch (Exception e3) {
                Log.e(TAG, "Error closing input stream", e3);
                return -1L;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (Exception e4) {
                    Log.e(TAG, "Error closing input stream", e4);
                }
            }
            throw th;
        }
    }

    public static String formatFileSize(long j) {
        if (j <= 0) {
            return "0 B";
        }
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        double d = j;
        int r2 = (int) (Math.log10(d) / Math.log10(1024.0d));
        int r3 = r2 < 5 ? r2 : 4;
        return String.format("%.2f %s", Double.valueOf(d / Math.pow(1024.0d, r3)), strArr[r3]);
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
