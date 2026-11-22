package com.compress.utils;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.compress.utils.VideoFrameExtractor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.opencv.videoio.Videoio;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

/* loaded from: classes14.dex */
public class VideoFrameExtractor {
    private static final String TAG = "WatchFaceVideoActivity_VideoFrameExtractor";
    private static final int TIMEOUT_MS = 10000;
    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    public interface FrameExtractCallback {
        void onFailure(String str);

        void onSuccess(Bitmap bitmap, String str);
    }

    public interface FrameExtractCallback2 {
        void onFailure(String str);

        void onSuccess(List<String> list);
    }

    public interface FrameExtractCallback3 {
        void onError(String str);

        void onSuccess(String str);
    }

    public void extractFrameSafely3(final Context context, final Uri uri, final long j, final String str, final FrameExtractCallback3 frameExtractCallback3) {
        Log.i(TAG, "extractFrameSafely3");
        final Future submit = this.executor.submit(new Callable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return VideoFrameExtractor.lambda$extractFrameSafely3$0(context, uri, j);
            }
        });
        this.executor.execute(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                VideoFrameExtractor.this.m7289xff7685ba(submit, context, str, frameExtractCallback3);
            }
        });
    }

    static /* synthetic */ Bitmap lambda$extractFrameSafely3$0(Context context, Uri uri, long j) throws Exception {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(context, uri);
            return mediaMetadataRetriever.getFrameAtTime(j, 2);
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* renamed from: lambda$extractFrameSafely3$5$com-compress-utils-VideoFrameExtractor, reason: not valid java name */
    /* synthetic */ void m7289xff7685ba(Future future, Context context, String str, final FrameExtractCallback3 frameExtractCallback3) {
        try {
            Bitmap bitmap = (Bitmap) future.get(10000L, TimeUnit.MILLISECONDS);
            if (bitmap != null) {
                final String saveBitmapToPrivateStorage = saveBitmapToPrivateStorage(context, scaleBitmap(bitmap, Videoio.CAP_PROP_XI_COOLING, Videoio.CAP_PROP_XI_COOLING), str);
                this.mainHandler.post(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoFrameExtractor.FrameExtractCallback3.this.onSuccess(saveBitmapToPrivateStorage);
                    }
                });
            } else {
                this.mainHandler.post(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoFrameExtractor.FrameExtractCallback3.this.onError("Failed to extract frame");
                    }
                });
            }
        } catch (TimeoutException unused) {
            future.cancel(true);
            this.mainHandler.post(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    VideoFrameExtractor.FrameExtractCallback3.this.onError("Timeout while extracting frame");
                }
            });
        } catch (Exception e) {
            this.mainHandler.post(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    VideoFrameExtractor.FrameExtractCallback3.this.onError("Error: " + e.getMessage());
                }
            });
        }
    }

    public static long getVideoDurationFromContentResolver(Context context, Uri uri) {
        Cursor cursor = null;
        try {
            try {
                cursor = context.getContentResolver().query(uri, new String[]{"duration"}, null, null, null);
            } catch (Exception e) {
                e.printStackTrace();
                if (cursor == null) {
                    return 0L;
                }
            }
            if (cursor != null && cursor.moveToFirst()) {
                long j = cursor.getLong(cursor.getColumnIndex("duration"));
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            if (cursor == null) {
                return 0L;
            }
            cursor.close();
            return 0L;
        } finally {
        }
    }

    public static void extractScaledFrame(final Context context, final Uri uri, final long j, final String str) {
        new Thread(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                VideoFrameExtractor.lambda$extractScaledFrame$6(context, uri, j, str);
            }
        }).start();
    }

    static /* synthetic */ void lambda$extractScaledFrame$6(Context context, Uri uri, long j, String str) {
        int i;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                try {
                    mediaMetadataRetriever.setDataSource(context, uri);
                    int[] videoDimensionsWithExtractor = getVideoDimensionsWithExtractor(context, uri);
                    int i2 = videoDimensionsWithExtractor[0];
                    int i3 = videoDimensionsWithExtractor[1];
                    Log.i(TAG, "originalWidth: " + i2 + ", originalHeight: " + i3);
                    if (i2 > 466 || i3 > 466) {
                        float f = i2;
                        float f2 = i3;
                        float min = Math.min(466.0f / f, 466.0f / f2);
                        Log.i(TAG, "scale: " + min);
                        int max = Math.max(1, Math.round(f * min));
                        i3 = Math.max(1, Math.round(f2 * min));
                        i = max;
                    } else {
                        Log.i(TAG, "not scale Bitmap");
                        i = i2;
                    }
                    int i4 = i3;
                    Log.i(TAG, "newWidth: " + i + ", newHeight: " + i4);
                    Bitmap scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j, 2, i, i4);
                    if (scaledFrameAtTime != null) {
                        Log.i(TAG, "frameTimePath: " + saveBitmapToPrivateStorage(context, scaledFrameAtTime, str));
                    }
                    mediaMetadataRetriever.release();
                } catch (Exception e) {
                    e.printStackTrace();
                    mediaMetadataRetriever.release();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } finally {
        }
    }

    public static int[] getVideoDimensionsWithExtractor(Context context, Uri uri) {
        int integer;
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            try {
                mediaExtractor.setDataSource(context, uri, (Map<String, String>) null);
                int trackCount = mediaExtractor.getTrackCount();
                for (int i = 0; i < trackCount; i++) {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                    String string = trackFormat.getString(IMediaFormat.KEY_MIME);
                    if (string != null && string.startsWith("video/")) {
                        int integer2 = trackFormat.getInteger("width");
                        int integer3 = trackFormat.getInteger("height");
                        if (trackFormat.containsKey("rotation-degrees") && ((integer = trackFormat.getInteger("rotation-degrees")) == 90 || integer == 270)) {
                            return new int[]{integer3, integer2};
                        }
                        return new int[]{integer2, integer3};
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        } finally {
            mediaExtractor.release();
        }
    }

    public static void extractVideoFrames2(final Context context, final Uri uri, final long j, final List<String> list, final FrameExtractCallback2 frameExtractCallback2) {
        final ArrayList arrayList = new ArrayList();
        new Thread(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                VideoFrameExtractor.lambda$extractVideoFrames2$7(context, uri, j, list, arrayList, frameExtractCallback2);
            }
        }).start();
    }

    static /* synthetic */ void lambda$extractVideoFrames2$7(Context context, Uri uri, long j, List list, List list2, FrameExtractCallback2 frameExtractCallback2) {
        StringBuilder sb;
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            mediaMetadataRetriever.setDataSource(context, uri);
            Log.e(TAG, "durationMs: " + j);
            if (j <= 0) {
                Log.e(TAG, "Invalid video duration");
                try {
                    mediaMetadataRetriever.release();
                    return;
                } catch (Exception e2) {
                    e = e2;
                    sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                }
            } else {
                for (int i = 1; i < list.size() + 1; i++) {
                    long size = i == list.size() ? (j * 1000) - 1000 : i * ((1000 * j) / list.size());
                    Log.i(TAG, "i: " + i + ", frameTime: " + size);
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(size, 2);
                    if (frameAtTime != null) {
                        Bitmap scaleBitmap = scaleBitmap(frameAtTime, Videoio.CAP_PROP_XI_COOLING, Videoio.CAP_PROP_XI_COOLING);
                        String saveBitmapToPrivateStorage = saveBitmapToPrivateStorage(context, scaleBitmap, (String) list.get(i - 1));
                        if (saveBitmapToPrivateStorage != null) {
                            list2.add(saveBitmapToPrivateStorage);
                        }
                        frameAtTime.recycle();
                        scaleBitmap.recycle();
                    }
                }
                Log.i(TAG, "names: " + list.size() + ", frameImagePath: " + list2.size());
                if (list2.size() == list.size()) {
                    if (frameExtractCallback2 != null) {
                        frameExtractCallback2.onSuccess(list2);
                    }
                } else if (frameExtractCallback2 != null) {
                    frameExtractCallback2.onFailure("无法提取视频帧");
                }
                Log.i(TAG, "Successfully frameImagePath: " + list2.size());
                try {
                    mediaMetadataRetriever.release();
                    return;
                } catch (Exception e3) {
                    e = e3;
                    sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                }
            }
        } catch (Exception e4) {
            e = e4;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (frameExtractCallback2 != null) {
                frameExtractCallback2.onFailure(e.getMessage());
            }
            Log.e(TAG, "Error extracting video frames: " + e.getMessage());
            e.printStackTrace();
            if (mediaMetadataRetriever2 == null) {
                return;
            }
            try {
                mediaMetadataRetriever2.release();
                return;
            } catch (Exception e5) {
                e = e5;
                sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
            }
        } catch (Throwable th2) {
            th = th2;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (mediaMetadataRetriever2 != null) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (Exception e6) {
                    Log.e(TAG, "Error releasing MediaMetadataRetriever: " + e6.getMessage());
                }
            }
            throw th;
        }
        Log.e(TAG, sb.append(e.getMessage()).toString());
    }

    public static void extractVideoFrames3(final Context context, final Uri uri, final List<String> list, final FrameExtractCallback2 frameExtractCallback2) {
        final ArrayList arrayList = new ArrayList();
        new Thread(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                VideoFrameExtractor.lambda$extractVideoFrames3$8(context, uri, list, arrayList, frameExtractCallback2);
            }
        }).start();
    }

    static /* synthetic */ void lambda$extractVideoFrames3$8(Context context, Uri uri, List list, List list2, FrameExtractCallback2 frameExtractCallback2) {
        Throwable th;
        StringBuilder sb;
        MediaMetadataRetriever mediaMetadataRetriever;
        int i;
        long size;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            mediaMetadataRetriever.setDataSource(context, uri);
            int[] videoDimensionsWithExtractor = getVideoDimensionsWithExtractor(context, uri);
            int i2 = videoDimensionsWithExtractor[0];
            int i3 = 1;
            int i4 = videoDimensionsWithExtractor[1];
            Log.i(TAG, "originalWidth: " + i2 + ", originalHeight: " + i4);
            if (i2 > 466 || i4 > 466) {
                float f = i2;
                float f2 = i4;
                float min = Math.min(466.0f / f, 466.0f / f2);
                Log.i(TAG, "scale: " + min);
                int max = Math.max(1, Math.round(f * min));
                i4 = Math.max(1, Math.round(f2 * min));
                i = max;
            } else {
                Log.i(TAG, "not scale Bitmap");
                i = i2;
            }
            int i5 = i4;
            Log.i(TAG, "newWidth: " + i + ", newHeight: " + i5);
            long parseLong = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            Log.e(TAG, "durationMs: " + parseLong);
            if (parseLong <= 0) {
                Log.e(TAG, "Invalid video duration");
                try {
                    mediaMetadataRetriever.release();
                    return;
                } catch (Exception e2) {
                    e = e2;
                    sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                }
            } else {
                int i6 = 1;
                while (i6 < list.size() + i3) {
                    if (i6 == list.size()) {
                        size = (parseLong * 1000) - 1000;
                    } else {
                        size = i6 * ((1000 * parseLong) / list.size());
                    }
                    Log.i(TAG, "i: " + i6 + ", frameTime: " + size);
                    long j = size;
                    int i7 = i3;
                    Bitmap scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j, 2, i, i5);
                    if (scaledFrameAtTime != null) {
                        String saveBitmapToPrivateStorage = saveBitmapToPrivateStorage(context, scaledFrameAtTime, (String) list.get(i6 - 1));
                        if (saveBitmapToPrivateStorage != null) {
                            list2.add(saveBitmapToPrivateStorage);
                        }
                        scaledFrameAtTime.recycle();
                    }
                    i6++;
                    i3 = i7;
                }
                Log.i(TAG, "names: " + list.size() + ", frameImagePath: " + list2.size());
                if (list2.size() == list.size()) {
                    if (frameExtractCallback2 != null) {
                        frameExtractCallback2.onSuccess(list2);
                    }
                } else if (frameExtractCallback2 != null) {
                    frameExtractCallback2.onFailure("无法提取视频帧");
                }
                Log.i(TAG, "Successfully frameImagePath: " + list2.size());
                try {
                    mediaMetadataRetriever.release();
                    return;
                } catch (Exception e3) {
                    e = e3;
                    sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                }
            }
        } catch (Exception e4) {
            e = e4;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (frameExtractCallback2 != null) {
                frameExtractCallback2.onFailure(e.getMessage());
            }
            Log.e(TAG, "Error extracting video frames: " + e.getMessage());
            e.printStackTrace();
            if (mediaMetadataRetriever2 == null) {
                return;
            }
            try {
                mediaMetadataRetriever2.release();
                return;
            } catch (Exception e5) {
                e = e5;
                sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
            }
        } catch (Throwable th3) {
            th = th3;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (mediaMetadataRetriever2 == null) {
                throw th;
            }
            try {
                mediaMetadataRetriever2.release();
                throw th;
            } catch (Exception e6) {
                Log.e(TAG, "Error releasing MediaMetadataRetriever: " + e6.getMessage());
                throw th;
            }
        }
        Log.e(TAG, sb.append(e.getMessage()).toString());
    }

    public static void extractVideoFrames4(final Context context, final Uri uri, final List<String> list, final FrameExtractCallback2 frameExtractCallback2) {
        final ArrayList arrayList = new ArrayList();
        new Thread(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                VideoFrameExtractor.lambda$extractVideoFrames4$9(context, uri, list, arrayList, frameExtractCallback2);
            }
        }).start();
    }

    static /* synthetic */ void lambda$extractVideoFrames4$9(Context context, Uri uri, List list, List list2, FrameExtractCallback2 frameExtractCallback2) {
        Throwable th;
        StringBuilder sb;
        MediaMetadataRetriever mediaMetadataRetriever;
        int i;
        long size;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            mediaMetadataRetriever.setDataSource(context, uri);
            int[] videoDimensionsWithExtractor = getVideoDimensionsWithExtractor(context, uri);
            int i2 = videoDimensionsWithExtractor[0];
            int i3 = 1;
            int i4 = videoDimensionsWithExtractor[1];
            Log.i(TAG, "originalWidth: " + i2 + ", originalHeight: " + i4);
            if (i2 > 466 || i4 > 466) {
                float f = i2;
                float f2 = i4;
                float min = Math.min(466.0f / f, 466.0f / f2);
                Log.i(TAG, "scale: " + min);
                int max = Math.max(1, Math.round(f * min));
                i4 = Math.max(1, Math.round(f2 * min));
                i = max;
            } else {
                Log.i(TAG, "not scale Bitmap");
                i = i2;
            }
            int i5 = i4;
            Log.i(TAG, "newWidth: " + i + ", newHeight: " + i5);
            long parseLong = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            Log.e(TAG, "durationMs: " + parseLong);
            if (parseLong <= 0) {
                Log.e(TAG, "Invalid video duration");
                try {
                    mediaMetadataRetriever.release();
                    return;
                } catch (Exception e2) {
                    e = e2;
                    sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                }
            } else {
                int i6 = 1;
                while (i6 < list.size() + i3) {
                    if (i6 == list.size()) {
                        size = (parseLong * 1000) - 1000;
                    } else {
                        size = i6 * ((1000 * parseLong) / list.size());
                    }
                    Log.i(TAG, "i: " + i6 + ", frameTime: " + size);
                    long j = size;
                    int i7 = i3;
                    Bitmap scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j, 2, i, i5);
                    if (scaledFrameAtTime != null) {
                        String saveBitmapToPrivateStorage = saveBitmapToPrivateStorage(context, scaledFrameAtTime, (String) list.get(i6 - 1));
                        if (saveBitmapToPrivateStorage != null) {
                            list2.add(saveBitmapToPrivateStorage);
                        }
                        scaledFrameAtTime.recycle();
                    }
                    i6++;
                    i3 = i7;
                }
                Log.i(TAG, "names: " + list.size() + ", frameImagePath: " + list2.size());
                if (list2.size() == list.size()) {
                    if (frameExtractCallback2 != null) {
                        frameExtractCallback2.onSuccess(list2);
                    }
                } else if (frameExtractCallback2 != null) {
                    frameExtractCallback2.onFailure("无法提取视频帧");
                }
                Log.i(TAG, "Successfully frameImagePath: " + list2.size());
                try {
                    mediaMetadataRetriever.release();
                    return;
                } catch (Exception e3) {
                    e = e3;
                    sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                }
            }
        } catch (Exception e4) {
            e = e4;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (frameExtractCallback2 != null) {
                frameExtractCallback2.onFailure(e.getMessage());
            }
            Log.e(TAG, "Error extracting video frames: " + e.getMessage());
            e.printStackTrace();
            if (mediaMetadataRetriever2 == null) {
                return;
            }
            try {
                mediaMetadataRetriever2.release();
                return;
            } catch (Exception e5) {
                e = e5;
                sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
            }
        } catch (Throwable th3) {
            th = th3;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (mediaMetadataRetriever2 == null) {
                throw th;
            }
            try {
                mediaMetadataRetriever2.release();
                throw th;
            } catch (Exception e6) {
                Log.e(TAG, "Error releasing MediaMetadataRetriever: " + e6.getMessage());
                throw th;
            }
        }
        Log.e(TAG, sb.append(e.getMessage()).toString());
    }

    public static void extractVideoFrames(final Context context, final Uri uri, final List<String> list) {
        final ArrayList arrayList = new ArrayList();
        new Thread(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                VideoFrameExtractor.lambda$extractVideoFrames$10(uri, context, list, arrayList);
            }
        }).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.media.MediaMetadataRetriever] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    static /* synthetic */ void lambda$extractVideoFrames$10(Uri uri, Context context, List list, List list2) {
        StringBuilder sb;
        MediaMetadataRetriever mediaMetadataRetriever;
        long size;
        ?? r3 = 0;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            boolean equals = uri.getScheme().equals("content");
            if (equals) {
                mediaMetadataRetriever.setDataSource(context, uri);
            } else {
                mediaMetadataRetriever.setDataSource(context, uri);
            }
            long parseLong = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            Log.e(TAG, "durationMs: " + parseLong);
            if (parseLong <= 0) {
                Log.e(TAG, "Invalid video duration");
                try {
                    mediaMetadataRetriever.release();
                    return;
                } catch (IOException e2) {
                    e = e2;
                    sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                    r3 = equals;
                }
            } else {
                int i = 1;
                while (true) {
                    int size2 = list.size() + 1;
                    if (i < size2) {
                        if (i == list.size()) {
                            size = (parseLong * 1000) - 1000;
                        } else {
                            size = i * ((1000 * parseLong) / list.size());
                        }
                        Log.i(TAG, "i: " + i + ", frameTime: " + size);
                        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(size, 2);
                        if (frameAtTime != null) {
                            Bitmap scaleBitmap = scaleBitmap(frameAtTime, Videoio.CAP_PROP_XI_COOLING, Videoio.CAP_PROP_XI_COOLING);
                            String saveBitmapToPrivateStorage = saveBitmapToPrivateStorage(context, scaleBitmap, (String) list.get(i - 1));
                            if (saveBitmapToPrivateStorage != null) {
                                list2.add(saveBitmapToPrivateStorage);
                            }
                            frameAtTime.recycle();
                            scaleBitmap.recycle();
                        }
                        i++;
                    } else {
                        Log.i(TAG, "Successfully frameImagePath: " + list2.size());
                        try {
                            mediaMetadataRetriever.release();
                            return;
                        } catch (IOException e3) {
                            e = e3;
                            sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                            r3 = size2;
                        }
                    }
                }
            }
        } catch (Exception e4) {
            e = e4;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            Log.e(TAG, "Error extracting video frames: " + e.getMessage());
            e.printStackTrace();
            if (mediaMetadataRetriever2 == null) {
                return;
            }
            try {
                mediaMetadataRetriever2.release();
                return;
            } catch (IOException e5) {
                e = e5;
                sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                r3 = mediaMetadataRetriever2;
            }
        } catch (Throwable th2) {
            th = th2;
            r3 = mediaMetadataRetriever;
            if (r3 != 0) {
                try {
                    r3.release();
                } catch (IOException e6) {
                    Log.e(TAG, "Error releasing MediaMetadataRetriever: " + e6.getMessage());
                }
            }
            throw th;
        }
        Log.e(TAG, sb.append(e.getMessage()).toString());
    }

    public static void extractVideoFrames(final Context context, final Uri uri, final String str) {
        new Thread(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                VideoFrameExtractor.lambda$extractVideoFrames$11(uri, context, str);
            }
        }).start();
    }

    static /* synthetic */ void lambda$extractVideoFrames$11(Uri uri, Context context, String str) {
        StringBuilder sb;
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (uri.getScheme().equals("content")) {
                mediaMetadataRetriever.setDataSource(context, uri);
            } else {
                mediaMetadataRetriever.setDataSource(context, uri);
            }
            long parseLong = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            Log.e(TAG, "durationMs: " + parseLong);
            if (parseLong <= 0) {
                Log.e(TAG, "Invalid video duration");
                try {
                    mediaMetadataRetriever.release();
                    return;
                } catch (IOException e2) {
                    e = e2;
                    sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                }
            } else {
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime((parseLong * 1000) / 10, 2);
                if (frameAtTime != null) {
                    Log.i(TAG, "firstFramePath: " + saveBitmapToPrivateStorage(context, frameAtTime, str));
                    frameAtTime.recycle();
                }
                Log.i(TAG, "Successfully frameImagePath");
                try {
                    mediaMetadataRetriever.release();
                    return;
                } catch (IOException e3) {
                    e = e3;
                    sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                }
            }
        } catch (Exception e4) {
            e = e4;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            Log.e(TAG, "Error extracting video frames: " + e.getMessage());
            e.printStackTrace();
            if (mediaMetadataRetriever2 == null) {
                return;
            }
            try {
                mediaMetadataRetriever2.release();
                return;
            } catch (IOException e5) {
                e = e5;
                sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
            }
        } catch (Throwable th2) {
            th = th2;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (mediaMetadataRetriever2 != null) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (IOException e6) {
                    Log.e(TAG, "Error releasing MediaMetadataRetriever: " + e6.getMessage());
                }
            }
            throw th;
        }
        Log.e(TAG, sb.append(e.getMessage()).toString());
    }

    public static void extractFrame(final Context context, final Uri uri, final long j, final String str, final FrameExtractCallback frameExtractCallback) {
        new Thread(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                VideoFrameExtractor.lambda$extractFrame$12(context, uri, j, str, frameExtractCallback);
            }
        }).start();
    }

    static /* synthetic */ void lambda$extractFrame$12(Context context, Uri uri, long j, String str, FrameExtractCallback frameExtractCallback) {
        int i;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                try {
                    mediaMetadataRetriever.setDataSource(context, uri);
                    int[] videoDimensionsWithExtractor = getVideoDimensionsWithExtractor(context, uri);
                    int i2 = videoDimensionsWithExtractor[0];
                    int i3 = videoDimensionsWithExtractor[1];
                    Log.i(TAG, "originalWidth: " + i2 + ", originalHeight: " + i3);
                    if (i2 > 466 || i3 > 466) {
                        float f = i2;
                        float f2 = i3;
                        float min = Math.min(466.0f / f, 466.0f / f2);
                        Log.i(TAG, "scale: " + min);
                        int max = Math.max(1, Math.round(f * min));
                        i3 = Math.max(1, Math.round(f2 * min));
                        i = max;
                    } else {
                        Log.i(TAG, "not scale Bitmap");
                        i = i2;
                    }
                    int i4 = i3;
                    Log.i(TAG, "newWidth: " + i + ", newHeight: " + i4);
                    Bitmap scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j, 2, i, i4);
                    if (scaledFrameAtTime != null) {
                        String saveBitmapToPrivateStorage = saveBitmapToPrivateStorage(context, scaledFrameAtTime, str);
                        Log.i(TAG, "savedPath: " + saveBitmapToPrivateStorage);
                        if (saveBitmapToPrivateStorage != null) {
                            if (frameExtractCallback != null) {
                                frameExtractCallback.onSuccess(scaledFrameAtTime, saveBitmapToPrivateStorage);
                            }
                        } else if (frameExtractCallback != null) {
                            frameExtractCallback.onFailure("保存图片失败");
                        }
                    } else if (frameExtractCallback != null) {
                        frameExtractCallback.onFailure("无法提取视频帧");
                    }
                    mediaMetadataRetriever.release();
                } catch (Exception e) {
                    Log.e(TAG, "提取视频帧失败", e);
                    if (frameExtractCallback != null) {
                        frameExtractCallback.onFailure(e.getMessage());
                    }
                    mediaMetadataRetriever.release();
                }
            } finally {
            }
        } catch (IOException e2) {
            Log.e(TAG, "释放资源失败", e2);
        }
    }

    private static Bitmap scaleBitmap(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Log.i(TAG, "scaleBitmap w: " + width + ", h: " + height);
        if (width <= i && height <= i2) {
            Log.e(TAG, "not scale Bitmap");
            return bitmap;
        }
        float f = width;
        float f2 = height;
        float min = Math.min(i / f, i2 / f2);
        int max = Math.max(1, Math.round(f * min));
        int max2 = Math.max(1, Math.round(f2 * min));
        Log.i(TAG, "scaleBitmap nw: " + max + ", nh: " + max2);
        return Bitmap.createScaledBitmap(bitmap, max, max2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String saveBitmapToPrivateStorage(android.content.Context r5, android.graphics.Bitmap r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "关闭流失败"
            java.lang.String r1 = "WatchFaceVideoActivity_VideoFrameExtractor"
            r2 = 0
            java.lang.String r3 = "watchface"
            java.io.File r3 = r5.getExternalFilesDir(r3)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            if (r3 != 0) goto L13
            java.io.File r3 = r5.getFilesDir()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
        L13:
            boolean r5 = r3.exists()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            if (r5 != 0) goto L1c
            r3.mkdirs()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
        L1c:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            r5.<init>(r3, r7)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L54
            r4 = 85
            r6.compress(r3, r4, r7)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L54
            r7.flush()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L54
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L54
            r7.close()     // Catch: java.io.IOException -> L38
            return r5
        L38:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            return r5
        L3d:
            r5 = move-exception
            goto L43
        L3f:
            r5 = move-exception
            goto L56
        L41:
            r5 = move-exception
            r7 = r2
        L43:
            java.lang.String r6 = "保存图片失败"
            android.util.Log.e(r1, r6, r5)     // Catch: java.lang.Throwable -> L54
            if (r7 == 0) goto L53
            r7.close()     // Catch: java.io.IOException -> L4f
            goto L53
        L4f:
            r5 = move-exception
            android.util.Log.e(r1, r0, r5)
        L53:
            return r2
        L54:
            r5 = move-exception
            r2 = r7
        L56:
            if (r2 == 0) goto L60
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L60
        L5c:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L60:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.compress.utils.VideoFrameExtractor.saveBitmapToPrivateStorage(android.content.Context, android.graphics.Bitmap, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String saveBitmapToPrivateStorage2(android.content.Context r8, android.graphics.Bitmap r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "Error closing FileOutputStream: "
            java.lang.String r1 = "WatchFaceVideoActivity_VideoFrameExtractor"
            java.lang.String r2 = "Image saved: "
            java.lang.String r3 = "Failed to create directory: "
            java.lang.String r4 = "Error saving bitmap: "
            r5 = 0
            java.io.File r8 = r8.getFilesDir()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            java.lang.String r7 = "video_frames"
            r6.<init>(r8, r7)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            boolean r8 = r6.exists()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            if (r8 != 0) goto L38
            boolean r8 = r6.mkdirs()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            if (r8 != 0) goto L38
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            java.lang.String r9 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            android.util.Log.e(r1, r8)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            return r5
        L38:
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            r8.<init>(r6, r10)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb7
            r6 = 90
            r9.compress(r3, r6, r10)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb7
            r10.flush()     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb7
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb7
            r9.<init>(r2)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb7
            java.lang.String r2 = r8.getAbsolutePath()     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb7
            java.lang.StringBuilder r9 = r9.append(r2)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb7
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb7
            android.util.Log.i(r1, r9)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb7
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> Lb7
            r10.close()     // Catch: java.io.IOException -> L68
            return r8
        L68:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r0)
            java.lang.String r9 = r9.getMessage()
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r9 = r9.toString()
            android.util.Log.e(r1, r9)
            return r8
        L7e:
            r8 = move-exception
            goto L84
        L80:
            r8 = move-exception
            goto Lb9
        L82:
            r8 = move-exception
            r10 = r5
        L84:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r9.<init>(r4)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r2 = r8.getMessage()     // Catch: java.lang.Throwable -> Lb7
            java.lang.StringBuilder r9 = r9.append(r2)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lb7
            android.util.Log.e(r1, r9)     // Catch: java.lang.Throwable -> Lb7
            r8.printStackTrace()     // Catch: java.lang.Throwable -> Lb7
            if (r10 == 0) goto Lb6
            r10.close()     // Catch: java.io.IOException -> La1
            goto Lb6
        La1:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r0)
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r8 = r8.toString()
            android.util.Log.e(r1, r8)
        Lb6:
            return r5
        Lb7:
            r8 = move-exception
            r5 = r10
        Lb9:
            if (r5 == 0) goto Ld4
            r5.close()     // Catch: java.io.IOException -> Lbf
            goto Ld4
        Lbf:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r0)
            java.lang.String r9 = r9.getMessage()
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r9 = r9.toString()
            android.util.Log.e(r1, r9)
        Ld4:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.compress.utils.VideoFrameExtractor.saveBitmapToPrivateStorage2(android.content.Context, android.graphics.Bitmap, java.lang.String):java.lang.String");
    }
}
