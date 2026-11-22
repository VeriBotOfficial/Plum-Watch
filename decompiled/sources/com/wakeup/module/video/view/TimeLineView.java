package com.wakeup.module.video.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.LongSparseArray;
import android.view.View;
import com.wakeup.module.video.R;
import com.wakeup.module.video.utils.BackgroundExecutor;
import com.wakeup.module.video.utils.UiThreadExecutor;
import java.lang.Thread;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimeLineView.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0014J(\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0014J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J\u0016\u0010\u001c\u001a\u00020\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 H\u0014J\u000e\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u000bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/wakeup/module/video/view/TimeLineView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mVideoUri", "Landroid/net/Uri;", "mHeightView", "mBitmapList", "Landroid/util/LongSparseArray;", "Landroid/graphics/Bitmap;", "init", "", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "w", "h", "oldW", "oldH", "getBitmap", "viewWidth", "returnBitmaps", "thumbnailList", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setVideo", "data", "module-video_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimeLineView extends View {
    private LongSparseArray<Bitmap> mBitmapList;
    private int mHeightView;
    private Uri mVideoUri;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeLineView(Context context, AttributeSet attrs) {
        this(context, attrs, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    public /* synthetic */ TimeLineView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeLineView(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        init();
    }

    private final void init() {
        this.mHeightView = getContext().getResources().getDimensionPixelOffset(R.dimen.frames_video_height);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.resolveSizeAndState(getPaddingLeft() + getPaddingRight() + getSuggestedMinimumWidth(), widthMeasureSpec, 1), View.resolveSizeAndState(getPaddingBottom() + getPaddingTop() + this.mHeightView, heightMeasureSpec, 1));
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldW, int oldH) {
        super.onSizeChanged(w, h, oldW, oldH);
        if (w != oldW) {
            getBitmap(w);
        }
    }

    private final void getBitmap(final int viewWidth) {
        BackgroundExecutor.INSTANCE.execute(new BackgroundExecutor.Task() { // from class: com.wakeup.module.video.view.TimeLineView$getBitmap$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("", 0L, "");
            }

            @Override // com.wakeup.module.video.utils.BackgroundExecutor.Task
            public void execute() {
                Uri uri;
                int i;
                try {
                    LongSparseArray longSparseArray = new LongSparseArray();
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    Context context = TimeLineView.this.getContext();
                    uri = TimeLineView.this.mVideoUri;
                    mediaMetadataRetriever.setDataSource(context, uri);
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    if (extractMetadata == null) {
                        extractMetadata = "0";
                    }
                    long parseInt = Integer.parseInt(extractMetadata) * 1000;
                    i = TimeLineView.this.mHeightView;
                    Float valueOf = mediaMetadataRetriever.getFrameAtTime(0L, 2) != null ? Float.valueOf(r5.getWidth()) : null;
                    Intrinsics.checkNotNull(valueOf);
                    int floatValue = (int) ((valueOf.floatValue() / r5.getHeight()) * i);
                    int ceil = (int) Math.ceil(viewWidth / floatValue);
                    if (ceil < 11) {
                        ceil = 11;
                    }
                    int i2 = viewWidth / 11;
                    long j = parseInt / ceil;
                    for (int i3 = 0; i3 < ceil; i3++) {
                        long j2 = i3;
                        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(j2 * j, 2);
                        if (frameAtTime != null) {
                            try {
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(frameAtTime, floatValue, i, false);
                                frameAtTime = Bitmap.createBitmap(createScaledBitmap, 0, 0, i2, createScaledBitmap.getHeight());
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            longSparseArray.put(j2, frameAtTime);
                        }
                    }
                    mediaMetadataRetriever.release();
                    TimeLineView.this.returnBitmaps(longSparseArray);
                } catch (Throwable th) {
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                    if (defaultUncaughtExceptionHandler != null) {
                        defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void returnBitmaps(final LongSparseArray<Bitmap> thumbnailList) {
        UiThreadExecutor.INSTANCE.runTask("", new Runnable() { // from class: com.wakeup.module.video.view.TimeLineView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TimeLineView.returnBitmaps$lambda$0(TimeLineView.this, thumbnailList);
            }
        }, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void returnBitmaps$lambda$0(TimeLineView timeLineView, LongSparseArray longSparseArray) {
        timeLineView.mBitmapList = longSparseArray;
        timeLineView.invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.mBitmapList != null) {
            canvas.save();
            LongSparseArray<Bitmap> longSparseArray = this.mBitmapList;
            int size = longSparseArray != null ? longSparseArray.size() : 0;
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                LongSparseArray<Bitmap> longSparseArray2 = this.mBitmapList;
                Bitmap bitmap = longSparseArray2 != null ? longSparseArray2.get(i2) : null;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, i, 0.0f, (Paint) null);
                    i += bitmap.getWidth();
                }
            }
        }
    }

    public final void setVideo(Uri data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.mVideoUri = data;
    }
}
