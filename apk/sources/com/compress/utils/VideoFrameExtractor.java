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
import java.io.File;
import java.io.FileOutputStream;
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

/* JADX INFO: loaded from: classes11.dex */
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
        final Future futureSubmit = this.executor.submit(new Callable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return VideoFrameExtractor.lambda$extractFrameSafely3$0(context, uri, j);
            }
        });
        this.executor.execute(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.m7289xff7685ba(futureSubmit, context, str, frameExtractCallback3);
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

    /* JADX INFO: renamed from: lambda$extractFrameSafely3$5$com-compress-utils-VideoFrameExtractor, reason: not valid java name */
    /* synthetic */ void m7289xff7685ba(Future future, Context context, String str, final FrameExtractCallback3 frameExtractCallback3) throws Throwable {
        try {
            Bitmap bitmap = (Bitmap) future.get(10000L, TimeUnit.MILLISECONDS);
            if (bitmap != null) {
                final String strSaveBitmapToPrivateStorage = saveBitmapToPrivateStorage(context, scaleBitmap(bitmap, Videoio.CAP_PROP_XI_COOLING, Videoio.CAP_PROP_XI_COOLING), str);
                this.mainHandler.post(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        frameExtractCallback3.onSuccess(strSaveBitmapToPrivateStorage);
                    }
                });
            } else {
                this.mainHandler.post(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        frameExtractCallback3.onError("Failed to extract frame");
                    }
                });
            }
        } catch (TimeoutException unused) {
            future.cancel(true);
            this.mainHandler.post(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    frameExtractCallback3.onError("Timeout while extracting frame");
                }
            });
        } catch (Exception e) {
            this.mainHandler.post(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    frameExtractCallback3.onError("Error: " + e.getMessage());
                }
            });
        }
    }

    public static long getVideoDurationFromContentResolver(Context context, Uri uri) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"duration"}, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                return cursorQuery.getLong(cursorQuery.getColumnIndex("duration"));
            }
            if (cursorQuery == null) {
                return 0L;
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (cursorQuery == null) {
                return 0L;
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return 0L;
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
        int r10;
        int r11;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                try {
                    mediaMetadataRetriever.setDataSource(context, uri);
                    int[] videoDimensionsWithExtractor = getVideoDimensionsWithExtractor(context, uri);
                    int r7 = videoDimensionsWithExtractor[0];
                    int r6 = videoDimensionsWithExtractor[1];
                    Log.i(TAG, "originalWidth: " + r7 + ", originalHeight: " + r6);
                    if (r7 > 466 || r6 > 466) {
                        float f = r7;
                        float f2 = r6;
                        float fMin = Math.min(466.0f / f, 466.0f / f2);
                        Log.i(TAG, "scale: " + fMin);
                        r10 = Math.max(1, Math.round(f * fMin));
                        r11 = Math.max(1, Math.round(f2 * fMin));
                    } else {
                        Log.i(TAG, "not scale Bitmap");
                        r11 = r6;
                        r10 = r7;
                    }
                    Log.i(TAG, "newWidth: " + r10 + ", newHeight: " + r11);
                    Bitmap scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j, 2, r10, r11);
                    if (scaledFrameAtTime != null) {
                        Log.i(TAG, "frameTimePath: " + saveBitmapToPrivateStorage(context, scaledFrameAtTime, str));
                    }
                    mediaMetadataRetriever.release();
                } catch (Exception e) {
                    e.printStackTrace();
                    mediaMetadataRetriever.release();
                }
            } catch (Throwable th) {
                try {
                    mediaMetadataRetriever.release();
                    throw th;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    throw th;
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static int[] getVideoDimensionsWithExtractor(Context context, Uri uri) {
        int integer;
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            try {
                mediaExtractor.setDataSource(context, uri, (Map<String, String>) null);
                int trackCount = mediaExtractor.getTrackCount();
                for (int r7 = 0; r7 < trackCount; r7++) {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(r7);
                    String string = trackFormat.getString(IMediaFormat.KEY_MIME);
                    if (string != null && string.startsWith("video/")) {
                        int integer2 = trackFormat.getInteger("width");
                        int integer3 = trackFormat.getInteger("height");
                        if (trackFormat.containsKey("rotation-degrees") && ((integer = trackFormat.getInteger("rotation-degrees")) == 90 || integer == 270)) {
                            int[] r6 = {integer3, integer2};
                            mediaExtractor.release();
                            return r6;
                        }
                        int[] r8 = {integer2, integer3};
                        mediaExtractor.release();
                        return r8;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            mediaExtractor.release();
            return null;
        } catch (Throwable th) {
            mediaExtractor.release();
            throw th;
        }
    }

    public static void extractVideoFrames2(final Context context, final Uri uri, final long j, final List<String> list, final FrameExtractCallback2 frameExtractCallback2) {
        final ArrayList arrayList = new ArrayList();
        new Thread(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                VideoFrameExtractor.lambda$extractVideoFrames2$7(context, uri, j, list, arrayList, frameExtractCallback2);
            }
        }).start();
    }

    static /* synthetic */ void lambda$extractVideoFrames2$7(Context context, Uri uri, long j, List list, List list2, FrameExtractCallback2 frameExtractCallback2) throws Throwable {
        StringBuilder sb;
        MediaMetadataRetriever mediaMetadataRetriever = null;
        try {
            try {
                MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever2.setDataSource(context, uri);
                    Log.e(TAG, "durationMs: " + j);
                    if (j <= 0) {
                        Log.e(TAG, "Invalid video duration");
                        try {
                            mediaMetadataRetriever2.release();
                            return;
                        } catch (Exception e) {
                            Log.e(TAG, "Error releasing MediaMetadataRetriever: " + e.getMessage());
                            return;
                        }
                    }
                    for (int r2 = 1; r2 < list.size() + 1; r2++) {
                        long size = r2 == list.size() ? (j * 1000) - 1000 : ((long) r2) * ((1000 * j) / ((long) list.size()));
                        Log.i(TAG, "i: " + r2 + ", frameTime: " + size);
                        Bitmap frameAtTime = mediaMetadataRetriever2.getFrameAtTime(size, 2);
                        if (frameAtTime != null) {
                            Bitmap bitmapScaleBitmap = scaleBitmap(frameAtTime, Videoio.CAP_PROP_XI_COOLING, Videoio.CAP_PROP_XI_COOLING);
                            String strSaveBitmapToPrivateStorage = saveBitmapToPrivateStorage(context, bitmapScaleBitmap, (String) list.get(r2 - 1));
                            if (strSaveBitmapToPrivateStorage != null) {
                                list2.add(strSaveBitmapToPrivateStorage);
                            }
                            frameAtTime.recycle();
                            bitmapScaleBitmap.recycle();
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
                        mediaMetadataRetriever2.release();
                    } catch (Exception e2) {
                        e = e2;
                        sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                        Log.e(TAG, sb.append(e.getMessage()).toString());
                    }
                } catch (Exception e3) {
                    e = e3;
                    mediaMetadataRetriever = mediaMetadataRetriever2;
                    if (frameExtractCallback2 != null) {
                        frameExtractCallback2.onFailure(e.getMessage());
                    }
                    Log.e(TAG, "Error extracting video frames: " + e.getMessage());
                    e.printStackTrace();
                    if (mediaMetadataRetriever != null) {
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Exception e4) {
                            e = e4;
                            sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                            Log.e(TAG, sb.append(e.getMessage()).toString());
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    mediaMetadataRetriever = mediaMetadataRetriever2;
                    if (mediaMetadataRetriever != null) {
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Exception e5) {
                            Log.e(TAG, "Error releasing MediaMetadataRetriever: " + e5.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void extractVideoFrames3(final Context context, final Uri uri, final List<String> list, final FrameExtractCallback2 frameExtractCallback2) {
        final ArrayList arrayList = new ArrayList();
        new Thread(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                VideoFrameExtractor.lambda$extractVideoFrames3$8(context, uri, list, arrayList, frameExtractCallback2);
            }
        }).start();
    }

    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x01d0 A[Catch: all -> 0x01ca, TRY_ENTER, TryCatch #7 {all -> 0x01ca, blocks: (B:3:0x0013, B:68:0x01d0, B:69:0x01d7), top: B:83:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0213 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static /* synthetic */ void lambda$extractVideoFrames3$8(Context context, Uri uri, List list, List list2, FrameExtractCallback2 frameExtractCallback2) throws Throwable {
        Throwable th;
        Exception exc;
        StringBuilder sb;
        int r7;
        MediaMetadataRetriever mediaMetadataRetriever = null;
        try {
            try {
                MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever2.setDataSource(context, uri);
                    int[] videoDimensionsWithExtractor = getVideoDimensionsWithExtractor(context, uri);
                    int r10 = videoDimensionsWithExtractor[0];
                    int r14 = 1;
                    int r9 = videoDimensionsWithExtractor[1];
                    Log.i(TAG, "originalWidth: " + r10 + ", originalHeight: " + r9);
                    if (r10 > 466 || r9 > 466) {
                        float f = r10;
                        float f2 = r9;
                        float fMin = Math.min(466.0f / f, 466.0f / f2);
                        Log.i(TAG, "scale: " + fMin);
                        r7 = Math.max(1, Math.round(f * fMin));
                        r9 = Math.max(1, Math.round(f2 * fMin));
                    } else {
                        try {
                            Log.i(TAG, "not scale Bitmap");
                            r7 = r10;
                        } catch (Exception e) {
                            e = e;
                            mediaMetadataRetriever = mediaMetadataRetriever2;
                            if (frameExtractCallback2 != null) {
                                frameExtractCallback2.onFailure(e.getMessage());
                            }
                            Log.e(TAG, "Error extracting video frames: " + e.getMessage());
                            e.printStackTrace();
                            if (mediaMetadataRetriever != null) {
                                try {
                                    mediaMetadataRetriever.release();
                                } catch (Exception e2) {
                                    exc = e2;
                                    sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                                    Log.e(TAG, sb.append(exc.getMessage()).toString());
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            mediaMetadataRetriever = mediaMetadataRetriever2;
                            if (mediaMetadataRetriever != null) {
                                throw th;
                            }
                            try {
                                mediaMetadataRetriever.release();
                                throw th;
                            } catch (Exception e3) {
                                Log.e(TAG, "Error releasing MediaMetadataRetriever: " + e3.getMessage());
                                throw th;
                            }
                        }
                    }
                    Log.i(TAG, "newWidth: " + r7 + ", newHeight: " + r9);
                    long j = Long.parseLong(mediaMetadataRetriever2.extractMetadata(9));
                    Log.e(TAG, "durationMs: " + j);
                    if (j <= 0) {
                        Log.e(TAG, "Invalid video duration");
                        try {
                            mediaMetadataRetriever2.release();
                            return;
                        } catch (Exception e4) {
                            Log.e(TAG, "Error releasing MediaMetadataRetriever: " + e4.getMessage());
                            return;
                        }
                    }
                    int r5 = 1;
                    while (r5 < list.size() + r14) {
                        long size = r5 == list.size() ? (j * 1000) - 1000 : ((1000 * j) / ((long) list.size())) * ((long) r5);
                        try {
                            Log.i(TAG, "i: " + r5 + ", frameTime: " + size);
                            long j2 = j;
                            Bitmap scaledFrameAtTime = mediaMetadataRetriever2.getScaledFrameAtTime(size, 2, r7, r9);
                            if (scaledFrameAtTime != null) {
                                String strSaveBitmapToPrivateStorage = saveBitmapToPrivateStorage(context, scaledFrameAtTime, (String) list.get(r5 - 1));
                                if (strSaveBitmapToPrivateStorage != null) {
                                    list2.add(strSaveBitmapToPrivateStorage);
                                }
                                scaledFrameAtTime.recycle();
                            }
                            r5++;
                            r14 = 1;
                            mediaMetadataRetriever2 = mediaMetadataRetriever2;
                            j = j2;
                        } catch (Exception e5) {
                            e = e5;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            mediaMetadataRetriever = mediaMetadataRetriever2;
                            if (mediaMetadataRetriever != null) {
                                throw th;
                            }
                            mediaMetadataRetriever.release();
                            throw th;
                        }
                    }
                    mediaMetadataRetriever2 = mediaMetadataRetriever2;
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
                        mediaMetadataRetriever2.release();
                        return;
                    } catch (Exception e6) {
                        exc = e6;
                        sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                        Log.e(TAG, sb.append(exc.getMessage()).toString());
                        return;
                    }
                } catch (Exception e7) {
                    e = e7;
                    mediaMetadataRetriever2 = mediaMetadataRetriever2;
                } catch (Throwable th4) {
                    th = th4;
                    mediaMetadataRetriever2 = mediaMetadataRetriever2;
                }
                mediaMetadataRetriever = mediaMetadataRetriever2;
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Exception e8) {
            e = e8;
        }
        if (frameExtractCallback2 != null) {
            frameExtractCallback2.onFailure(e.getMessage());
        }
        Log.e(TAG, "Error extracting video frames: " + e.getMessage());
        e.printStackTrace();
        if (mediaMetadataRetriever != null) {
            mediaMetadataRetriever.release();
        }
    }

    public static void extractVideoFrames4(final Context context, final Uri uri, final List<String> list, final FrameExtractCallback2 frameExtractCallback2) {
        final ArrayList arrayList = new ArrayList();
        new Thread(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                VideoFrameExtractor.lambda$extractVideoFrames4$9(context, uri, list, arrayList, frameExtractCallback2);
            }
        }).start();
    }

    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x01d0 A[Catch: all -> 0x01ca, TRY_ENTER, TryCatch #7 {all -> 0x01ca, blocks: (B:3:0x0013, B:68:0x01d0, B:69:0x01d7), top: B:83:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0213 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static /* synthetic */ void lambda$extractVideoFrames4$9(Context context, Uri uri, List list, List list2, FrameExtractCallback2 frameExtractCallback2) throws Throwable {
        Throwable th;
        Exception exc;
        StringBuilder sb;
        int r7;
        MediaMetadataRetriever mediaMetadataRetriever = null;
        try {
            try {
                MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever2.setDataSource(context, uri);
                    int[] videoDimensionsWithExtractor = getVideoDimensionsWithExtractor(context, uri);
                    int r10 = videoDimensionsWithExtractor[0];
                    int r14 = 1;
                    int r9 = videoDimensionsWithExtractor[1];
                    Log.i(TAG, "originalWidth: " + r10 + ", originalHeight: " + r9);
                    if (r10 > 466 || r9 > 466) {
                        float f = r10;
                        float f2 = r9;
                        float fMin = Math.min(466.0f / f, 466.0f / f2);
                        Log.i(TAG, "scale: " + fMin);
                        r7 = Math.max(1, Math.round(f * fMin));
                        r9 = Math.max(1, Math.round(f2 * fMin));
                    } else {
                        try {
                            Log.i(TAG, "not scale Bitmap");
                            r7 = r10;
                        } catch (Exception e) {
                            e = e;
                            mediaMetadataRetriever = mediaMetadataRetriever2;
                            if (frameExtractCallback2 != null) {
                                frameExtractCallback2.onFailure(e.getMessage());
                            }
                            Log.e(TAG, "Error extracting video frames: " + e.getMessage());
                            e.printStackTrace();
                            if (mediaMetadataRetriever != null) {
                                try {
                                    mediaMetadataRetriever.release();
                                } catch (Exception e2) {
                                    exc = e2;
                                    sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                                    Log.e(TAG, sb.append(exc.getMessage()).toString());
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            mediaMetadataRetriever = mediaMetadataRetriever2;
                            if (mediaMetadataRetriever != null) {
                                throw th;
                            }
                            try {
                                mediaMetadataRetriever.release();
                                throw th;
                            } catch (Exception e3) {
                                Log.e(TAG, "Error releasing MediaMetadataRetriever: " + e3.getMessage());
                                throw th;
                            }
                        }
                    }
                    Log.i(TAG, "newWidth: " + r7 + ", newHeight: " + r9);
                    long j = Long.parseLong(mediaMetadataRetriever2.extractMetadata(9));
                    Log.e(TAG, "durationMs: " + j);
                    if (j <= 0) {
                        Log.e(TAG, "Invalid video duration");
                        try {
                            mediaMetadataRetriever2.release();
                            return;
                        } catch (Exception e4) {
                            Log.e(TAG, "Error releasing MediaMetadataRetriever: " + e4.getMessage());
                            return;
                        }
                    }
                    int r5 = 1;
                    while (r5 < list.size() + r14) {
                        long size = r5 == list.size() ? (j * 1000) - 1000 : ((1000 * j) / ((long) list.size())) * ((long) r5);
                        try {
                            Log.i(TAG, "i: " + r5 + ", frameTime: " + size);
                            long j2 = j;
                            Bitmap scaledFrameAtTime = mediaMetadataRetriever2.getScaledFrameAtTime(size, 2, r7, r9);
                            if (scaledFrameAtTime != null) {
                                String strSaveBitmapToPrivateStorage = saveBitmapToPrivateStorage(context, scaledFrameAtTime, (String) list.get(r5 - 1));
                                if (strSaveBitmapToPrivateStorage != null) {
                                    list2.add(strSaveBitmapToPrivateStorage);
                                }
                                scaledFrameAtTime.recycle();
                            }
                            r5++;
                            r14 = 1;
                            mediaMetadataRetriever2 = mediaMetadataRetriever2;
                            j = j2;
                        } catch (Exception e5) {
                            e = e5;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            mediaMetadataRetriever = mediaMetadataRetriever2;
                            if (mediaMetadataRetriever != null) {
                                throw th;
                            }
                            mediaMetadataRetriever.release();
                            throw th;
                        }
                    }
                    mediaMetadataRetriever2 = mediaMetadataRetriever2;
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
                        mediaMetadataRetriever2.release();
                        return;
                    } catch (Exception e6) {
                        exc = e6;
                        sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                        Log.e(TAG, sb.append(exc.getMessage()).toString());
                        return;
                    }
                } catch (Exception e7) {
                    e = e7;
                    mediaMetadataRetriever2 = mediaMetadataRetriever2;
                } catch (Throwable th4) {
                    th = th4;
                    mediaMetadataRetriever2 = mediaMetadataRetriever2;
                }
                mediaMetadataRetriever = mediaMetadataRetriever2;
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Exception e8) {
            e = e8;
        }
        if (frameExtractCallback2 != null) {
            frameExtractCallback2.onFailure(e.getMessage());
        }
        Log.e(TAG, "Error extracting video frames: " + e.getMessage());
        e.printStackTrace();
        if (mediaMetadataRetriever != null) {
            mediaMetadataRetriever.release();
        }
    }

    public static void extractVideoFrames(final Context context, final Uri uri, final List<String> list) {
        final ArrayList arrayList = new ArrayList();
        new Thread(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                VideoFrameExtractor.lambda$extractVideoFrames$10(uri, context, list, arrayList);
            }
        }).start();
    }

    static /* synthetic */ void lambda$extractVideoFrames$10(Uri uri, Context context, List list, List list2) throws Throwable {
        StringBuilder sb;
        MediaMetadataRetriever mediaMetadataRetriever = null;
        try {
            try {
                MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                try {
                    if (uri.getScheme().equals("content")) {
                        mediaMetadataRetriever2.setDataSource(context, uri);
                    } else {
                        mediaMetadataRetriever2.setDataSource(context, uri);
                    }
                    long j = Long.parseLong(mediaMetadataRetriever2.extractMetadata(9));
                    Log.e(TAG, "durationMs: " + j);
                    if (j <= 0) {
                        Log.e(TAG, "Invalid video duration");
                        try {
                            mediaMetadataRetriever2.release();
                            return;
                        } catch (IOException e) {
                            Log.e(TAG, "Error releasing MediaMetadataRetriever: " + e.getMessage());
                            return;
                        }
                    }
                    for (int r2 = 1; r2 < list.size() + 1; r2++) {
                        long size = r2 == list.size() ? (j * 1000) - 1000 : ((long) r2) * ((1000 * j) / ((long) list.size()));
                        Log.i(TAG, "i: " + r2 + ", frameTime: " + size);
                        Bitmap frameAtTime = mediaMetadataRetriever2.getFrameAtTime(size, 2);
                        if (frameAtTime != null) {
                            Bitmap bitmapScaleBitmap = scaleBitmap(frameAtTime, Videoio.CAP_PROP_XI_COOLING, Videoio.CAP_PROP_XI_COOLING);
                            String strSaveBitmapToPrivateStorage = saveBitmapToPrivateStorage(context, bitmapScaleBitmap, (String) list.get(r2 - 1));
                            if (strSaveBitmapToPrivateStorage != null) {
                                list2.add(strSaveBitmapToPrivateStorage);
                            }
                            frameAtTime.recycle();
                            bitmapScaleBitmap.recycle();
                        }
                    }
                    Log.i(TAG, "Successfully frameImagePath: " + list2.size());
                    try {
                        mediaMetadataRetriever2.release();
                    } catch (IOException e2) {
                        e = e2;
                        sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                        Log.e(TAG, sb.append(e.getMessage()).toString());
                    }
                } catch (Exception e3) {
                    e = e3;
                    mediaMetadataRetriever = mediaMetadataRetriever2;
                    Log.e(TAG, "Error extracting video frames: " + e.getMessage());
                    e.printStackTrace();
                    if (mediaMetadataRetriever != null) {
                        try {
                            mediaMetadataRetriever.release();
                        } catch (IOException e4) {
                            e = e4;
                            sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                            Log.e(TAG, sb.append(e.getMessage()).toString());
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    mediaMetadataRetriever = mediaMetadataRetriever2;
                    if (mediaMetadataRetriever != null) {
                        try {
                            mediaMetadataRetriever.release();
                        } catch (IOException e5) {
                            Log.e(TAG, "Error releasing MediaMetadataRetriever: " + e5.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e6) {
            e = e6;
        }
    }

    public static void extractVideoFrames(final Context context, final Uri uri, final String str) {
        new Thread(new Runnable() { // from class: com.compress.utils.VideoFrameExtractor$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                VideoFrameExtractor.lambda$extractVideoFrames$11(uri, context, str);
            }
        }).start();
    }

    static /* synthetic */ void lambda$extractVideoFrames$11(Uri uri, Context context, String str) throws Throwable {
        StringBuilder sb;
        MediaMetadataRetriever mediaMetadataRetriever = null;
        try {
            try {
                MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                try {
                    if (uri.getScheme().equals("content")) {
                        mediaMetadataRetriever2.setDataSource(context, uri);
                    } else {
                        mediaMetadataRetriever2.setDataSource(context, uri);
                    }
                    long j = Long.parseLong(mediaMetadataRetriever2.extractMetadata(9));
                    Log.e(TAG, "durationMs: " + j);
                    if (j <= 0) {
                        Log.e(TAG, "Invalid video duration");
                        try {
                            mediaMetadataRetriever2.release();
                            return;
                        } catch (IOException e) {
                            Log.e(TAG, "Error releasing MediaMetadataRetriever: " + e.getMessage());
                            return;
                        }
                    }
                    Bitmap frameAtTime = mediaMetadataRetriever2.getFrameAtTime((j * 1000) / 10, 2);
                    if (frameAtTime != null) {
                        Log.i(TAG, "firstFramePath: " + saveBitmapToPrivateStorage(context, frameAtTime, str));
                        frameAtTime.recycle();
                    }
                    Log.i(TAG, "Successfully frameImagePath");
                    try {
                        mediaMetadataRetriever2.release();
                    } catch (IOException e2) {
                        e = e2;
                        sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                        Log.e(TAG, sb.append(e.getMessage()).toString());
                    }
                } catch (Exception e3) {
                    e = e3;
                    mediaMetadataRetriever = mediaMetadataRetriever2;
                    Log.e(TAG, "Error extracting video frames: " + e.getMessage());
                    e.printStackTrace();
                    if (mediaMetadataRetriever != null) {
                        try {
                            mediaMetadataRetriever.release();
                        } catch (IOException e4) {
                            e = e4;
                            sb = new StringBuilder("Error releasing MediaMetadataRetriever: ");
                            Log.e(TAG, sb.append(e.getMessage()).toString());
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    mediaMetadataRetriever = mediaMetadataRetriever2;
                    if (mediaMetadataRetriever != null) {
                        try {
                            mediaMetadataRetriever.release();
                        } catch (IOException e5) {
                            Log.e(TAG, "Error releasing MediaMetadataRetriever: " + e5.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e6) {
            e = e6;
        }
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
        int r12;
        int r13;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                try {
                    mediaMetadataRetriever.setDataSource(context, uri);
                    int[] videoDimensionsWithExtractor = getVideoDimensionsWithExtractor(context, uri);
                    int r9 = videoDimensionsWithExtractor[0];
                    int r8 = videoDimensionsWithExtractor[1];
                    Log.i(TAG, "originalWidth: " + r9 + ", originalHeight: " + r8);
                    if (r9 > 466 || r8 > 466) {
                        float f = r9;
                        float f2 = r8;
                        float fMin = Math.min(466.0f / f, 466.0f / f2);
                        Log.i(TAG, "scale: " + fMin);
                        r12 = Math.max(1, Math.round(f * fMin));
                        r13 = Math.max(1, Math.round(f2 * fMin));
                    } else {
                        Log.i(TAG, "not scale Bitmap");
                        r13 = r8;
                        r12 = r9;
                    }
                    Log.i(TAG, "newWidth: " + r12 + ", newHeight: " + r13);
                    Bitmap scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j, 2, r12, r13);
                    if (scaledFrameAtTime != null) {
                        String strSaveBitmapToPrivateStorage = saveBitmapToPrivateStorage(context, scaledFrameAtTime, str);
                        Log.i(TAG, "savedPath: " + strSaveBitmapToPrivateStorage);
                        if (strSaveBitmapToPrivateStorage != null) {
                            if (frameExtractCallback != null) {
                                frameExtractCallback.onSuccess(scaledFrameAtTime, strSaveBitmapToPrivateStorage);
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
            } catch (IOException e2) {
                Log.e(TAG, "释放资源失败", e2);
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
                throw th;
            } catch (IOException e3) {
                Log.e(TAG, "释放资源失败", e3);
                throw th;
            }
        }
    }

    private static Bitmap scaleBitmap(Bitmap bitmap, int r5, int r6) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Log.i(TAG, "scaleBitmap w: " + width + ", h: " + height);
        if (width <= r5 && height <= r6) {
            Log.e(TAG, "not scale Bitmap");
            return bitmap;
        }
        float f = width;
        float f2 = height;
        float fMin = Math.min(r5 / f, r6 / f2);
        int r7 = Math.max(1, Math.round(f * fMin));
        int r8 = Math.max(1, Math.round(f2 * fMin));
        Log.i(TAG, "scaleBitmap nw: " + r7 + ", nh: " + r8);
        return Bitmap.createScaledBitmap(bitmap, r7, r8, false);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static String saveBitmapToPrivateStorage(Context context, Bitmap bitmap, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            File externalFilesDir = context.getExternalFilesDir("watchface");
            if (externalFilesDir == null) {
                externalFilesDir = context.getFilesDir();
            }
            if (!externalFilesDir.exists()) {
                externalFilesDir.mkdirs();
            }
            File file = new File(externalFilesDir, str);
            fileOutputStream = new FileOutputStream(file);
            try {
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream);
                    fileOutputStream.flush();
                    String absolutePath = file.getAbsolutePath();
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        Log.e(TAG, "关闭流失败", e);
                    }
                    return absolutePath;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e2) {
                            Log.e(TAG, "关闭流失败", e2);
                        }
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                Log.e(TAG, "保存图片失败", e);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e4) {
                        Log.e(TAG, "关闭流失败", e4);
                    }
                }
                return null;
            }
        } catch (Exception e5) {
            e = e5;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static String saveBitmapToPrivateStorage2(Context context, Bitmap bitmap, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            File file = new File(context.getFilesDir(), "video_frames");
            if (!file.exists() && !file.mkdirs()) {
                Log.e(TAG, "Failed to create directory: " + file.getAbsolutePath());
                return null;
            }
            File file2 = new File(file, str);
            fileOutputStream = new FileOutputStream(file2);
            try {
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.flush();
                    Log.i(TAG, "Image saved: " + file2.getAbsolutePath());
                    String absolutePath = file2.getAbsolutePath();
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        Log.e(TAG, "Error closing FileOutputStream: " + e.getMessage());
                    }
                    return absolutePath;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e2) {
                            Log.e(TAG, "Error closing FileOutputStream: " + e2.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                Log.e(TAG, "Error saving bitmap: " + e.getMessage());
                e.printStackTrace();
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e4) {
                        Log.e(TAG, "Error closing FileOutputStream: " + e4.getMessage());
                    }
                }
                return null;
            }
        } catch (Exception e5) {
            e = e5;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }
}
