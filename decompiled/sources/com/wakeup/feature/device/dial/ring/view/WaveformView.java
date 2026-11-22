package com.wakeup.feature.device.dial.ring.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.wakeup.commonui.R;
import com.wakeup.commonui.utils.UIHelper;
import com.wakeup.feature.device.dial.ring.bean.SoundFile;

/* loaded from: classes3.dex */
public class WaveformView extends View {
    private final Paint mBorderLinePaint;
    private float mDensity;
    private GestureDetector mGestureDetector;
    private final Paint mGridPaint;
    private int[] mHeightsAtThisZoomLevel;
    private float mInitialScaleSpan;
    private boolean mInitialized;
    private int[] mLenByZoomLevel;
    private WaveformListener mListener;
    private int mNumZoomLevels;
    private int mOffset;
    private final Paint mPlaybackLinePaint;
    private int mPlaybackPos;
    private int mSampleRate;
    private int mSamplesPerFrame;
    private ScaleGestureDetector mScaleGestureDetector;
    private final Paint mSelectedLinePaint;
    private int mSelectionEnd;
    private int mSelectionStart;
    private SoundFile mSoundFile;
    private final Paint mTimecodePaint;
    private final Paint mUnselectedBkgndLinePaint;
    private final Paint mUnselectedLinePaint;
    private double[][] mValuesByZoomLevel;
    private double[] mZoomFactorByZoomLevel;
    private int mZoomLevel;
    private int space10;

    public interface WaveformListener {
        void waveformDraw();
    }

    public WaveformView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setFocusable(false);
        Resources resources = getResources();
        Paint paint = new Paint();
        this.mGridPaint = paint;
        paint.setAntiAlias(false);
        paint.setColor(resources.getColor(R.color.white));
        Paint paint2 = new Paint();
        this.mSelectedLinePaint = paint2;
        paint2.setAntiAlias(false);
        paint2.setColor(resources.getColor(R.color.color_ff7300));
        Paint paint3 = new Paint();
        this.mUnselectedLinePaint = paint3;
        paint3.setAntiAlias(false);
        paint3.setColor(resources.getColor(R.color.color_ECECEC));
        Paint paint4 = new Paint();
        this.mUnselectedBkgndLinePaint = paint4;
        paint4.setAntiAlias(false);
        paint4.setColor(resources.getColor(R.color.white));
        Paint paint5 = new Paint();
        this.mBorderLinePaint = paint5;
        paint5.setAntiAlias(true);
        paint5.setStrokeWidth(1.5f);
        paint5.setPathEffect(new DashPathEffect(new float[]{3.0f, 2.0f}, 0.0f));
        paint5.setColor(resources.getColor(R.color.white));
        Paint paint6 = new Paint();
        this.mPlaybackLinePaint = paint6;
        paint6.setAntiAlias(false);
        paint6.setStrokeWidth(UIHelper.dp2px(2.0f));
        paint6.setColor(resources.getColor(R.color.color_FFAC68));
        Paint paint7 = new Paint();
        this.mTimecodePaint = paint7;
        paint7.setTextSize(12.0f);
        paint7.setAntiAlias(true);
        paint7.setColor(resources.getColor(R.color.white));
        paint7.setShadowLayer(2.0f, 1.0f, 1.0f, resources.getColor(R.color.white));
        this.space10 = UIHelper.dp2px(10.0f);
        this.mGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.wakeup.feature.device.dial.ring.view.WaveformView.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return true;
            }
        });
        this.mScaleGestureDetector = new ScaleGestureDetector(context, new ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: com.wakeup.feature.device.dial.ring.view.WaveformView.2
            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                Log.v("Ringdroid", "ScaleBegin " + scaleGestureDetector.getCurrentSpanX());
                WaveformView.this.mInitialScaleSpan = Math.abs(scaleGestureDetector.getCurrentSpanX());
                return true;
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                float abs = Math.abs(scaleGestureDetector.getCurrentSpanX());
                Log.v("Ringdroid", "Scale " + (abs - WaveformView.this.mInitialScaleSpan));
                if (abs - WaveformView.this.mInitialScaleSpan > 40.0f) {
                    WaveformView.this.mInitialScaleSpan = abs;
                }
                if (abs - WaveformView.this.mInitialScaleSpan >= -40.0f) {
                    return true;
                }
                WaveformView.this.mInitialScaleSpan = abs;
                return true;
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                Log.v("Ringdroid", "ScaleEnd " + scaleGestureDetector.getCurrentSpanX());
            }
        });
        this.mSoundFile = null;
        this.mLenByZoomLevel = null;
        this.mValuesByZoomLevel = null;
        this.mHeightsAtThisZoomLevel = null;
        this.mOffset = 0;
        this.mPlaybackPos = -1;
        this.mSelectionStart = 0;
        this.mSelectionEnd = 0;
        this.mDensity = 1.0f;
        this.mInitialized = false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.mScaleGestureDetector.onTouchEvent(motionEvent);
        if (this.mGestureDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        motionEvent.getAction();
        return true;
    }

    public boolean hasSoundFile() {
        return this.mSoundFile != null;
    }

    public void setSoundFile(SoundFile soundFile) {
        this.mSoundFile = soundFile;
        this.mSampleRate = soundFile.getSampleRate();
        this.mSamplesPerFrame = this.mSoundFile.getSamplesPerFrame();
        computeDoublesForAllZoomLevels();
        this.mHeightsAtThisZoomLevel = null;
    }

    public boolean isInitialized() {
        return this.mInitialized;
    }

    public int getZoomLevel() {
        return this.mZoomLevel;
    }

    public void setZoomLevel(int i) {
        while (this.mZoomLevel > i) {
            zoomIn();
        }
        while (this.mZoomLevel < i) {
            zoomOut();
        }
    }

    public boolean canZoomIn() {
        return this.mZoomLevel > 0;
    }

    public void zoomIn() {
        if (canZoomIn()) {
            this.mZoomLevel--;
            this.mSelectionStart *= 2;
            this.mSelectionEnd *= 2;
            this.mHeightsAtThisZoomLevel = null;
            int measuredWidth = ((this.mOffset + (getMeasuredWidth() / 2)) * 2) - (getMeasuredWidth() / 2);
            this.mOffset = measuredWidth;
            if (measuredWidth < 0) {
                this.mOffset = 0;
            }
            invalidate();
        }
    }

    public boolean canZoomOut() {
        return this.mZoomLevel < this.mNumZoomLevels - 1;
    }

    public void zoomOut() {
        if (canZoomOut()) {
            this.mZoomLevel++;
            this.mSelectionStart /= 2;
            this.mSelectionEnd /= 2;
            int measuredWidth = ((this.mOffset + (getMeasuredWidth() / 2)) / 2) - (getMeasuredWidth() / 2);
            this.mOffset = measuredWidth;
            if (measuredWidth < 0) {
                this.mOffset = 0;
            }
            this.mHeightsAtThisZoomLevel = null;
            invalidate();
        }
    }

    public int maxPos() {
        return this.mLenByZoomLevel[this.mZoomLevel];
    }

    public int secondsToFrames(double d) {
        return (int) ((((d * 1.0d) * this.mSampleRate) / this.mSamplesPerFrame) + 0.5d);
    }

    public int secondsToPixels(double d) {
        return (int) ((((this.mZoomFactorByZoomLevel[this.mZoomLevel] * d) * this.mSampleRate) / this.mSamplesPerFrame) + 0.5d);
    }

    public double pixelsToSeconds(int i) {
        return (i * this.mSamplesPerFrame) / (this.mSampleRate * this.mZoomFactorByZoomLevel[this.mZoomLevel]);
    }

    public int millisecsToPixels(int i) {
        return (int) (((((i * 1.0d) * this.mSampleRate) * this.mZoomFactorByZoomLevel[this.mZoomLevel]) / (this.mSamplesPerFrame * 1000.0d)) + 0.5d);
    }

    public int pixelsToMillisecs(int i) {
        return (int) (((i * (this.mSamplesPerFrame * 1000.0d)) / (this.mSampleRate * this.mZoomFactorByZoomLevel[this.mZoomLevel])) + 0.5d);
    }

    public void setParameters(int i, int i2, int i3) {
        this.mSelectionStart = i;
        this.mSelectionEnd = i2;
        this.mOffset = i3;
    }

    public int getStart() {
        return this.mSelectionStart;
    }

    public int getEnd() {
        return this.mSelectionEnd;
    }

    public int getOffset() {
        return this.mOffset;
    }

    public void setPlayback(int i) {
        this.mPlaybackPos = i;
    }

    public int getPlayPos() {
        return this.mPlaybackPos;
    }

    public void setListener(WaveformListener waveformListener) {
        this.mListener = waveformListener;
    }

    public void recomputeHeights(float f) {
        this.mHeightsAtThisZoomLevel = null;
        this.mDensity = f;
        this.mTimecodePaint.setTextSize((int) (f * 12.0f));
        invalidate();
    }

    protected void drawWaveformLine(Canvas canvas, int i, int i2, int i3, Paint paint) {
        float f = i;
        canvas.drawLine(f, i2, f, i3, paint);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i;
        Paint paint;
        boolean z;
        super.onDraw(canvas);
        if (this.mSoundFile == null) {
            return;
        }
        if (this.mHeightsAtThisZoomLevel == null) {
            computeIntsForThisZoomLevel();
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i2 = this.mOffset;
        int length = this.mHeightsAtThisZoomLevel.length - i2;
        int i3 = measuredHeight / 2;
        int i4 = length > measuredWidth ? measuredWidth : length;
        boolean z2 = true;
        double pixelsToSeconds = pixelsToSeconds(1);
        boolean z3 = pixelsToSeconds > 0.02d;
        double d = this.mOffset * pixelsToSeconds;
        int i5 = (int) d;
        int i6 = 0;
        while (i6 < i4) {
            i6++;
            d += pixelsToSeconds;
            int i7 = (int) d;
            if (i7 != i5) {
                if (!z3 || i7 % 5 == 0) {
                    float f = i6;
                    z = z2;
                    canvas.drawLine(f, 0.0f, f, measuredHeight, this.mGridPaint);
                } else {
                    z = z2;
                }
                i5 = i7;
            } else {
                z = z2;
            }
            z2 = z;
        }
        int i8 = 0;
        while (i8 < i4) {
            int i9 = i8 + i2;
            if (i9 >= this.mSelectionStart && i9 < this.mSelectionEnd) {
                paint = this.mSelectedLinePaint;
                i = measuredHeight;
            } else {
                drawWaveformLine(canvas, i8, 0, measuredHeight, this.mUnselectedBkgndLinePaint);
                i = measuredHeight;
                paint = this.mUnselectedLinePaint;
            }
            Paint paint2 = paint;
            int i10 = this.mHeightsAtThisZoomLevel[i9];
            drawWaveformLine(canvas, i8, i3 - i10, i3 + 1 + i10, paint2);
            if (i9 == this.mPlaybackPos) {
                float f2 = i8;
                canvas.drawLine(f2, 0.0f, f2, i, this.mPlaybackLinePaint);
            }
            i8++;
            measuredHeight = i;
        }
        int i11 = measuredHeight;
        float f3 = this.mSelectionStart;
        int i12 = this.space10;
        canvas.drawLine(f3, i12, this.mSelectionEnd, i12, this.mPlaybackLinePaint);
        float f4 = this.mSelectionStart;
        int i13 = this.space10;
        canvas.drawLine(f4, i11 - i13, this.mSelectionEnd, i11 - i13, this.mPlaybackLinePaint);
        for (int i14 = i4; i14 < measuredWidth; i14++) {
            drawWaveformLine(canvas, i14, 0, i11, this.mUnselectedBkgndLinePaint);
        }
        int i15 = this.mSelectionStart;
        int i16 = this.mOffset;
        canvas.drawLine((i15 - i16) + 0.5f, 30.0f, (i15 - i16) + 0.5f, i11, this.mBorderLinePaint);
        int i17 = this.mSelectionEnd;
        int i18 = this.mOffset;
        canvas.drawLine((i17 - i18) + 0.5f, 0.0f, (i17 - i18) + 0.5f, i11 - 30, this.mBorderLinePaint);
        WaveformListener waveformListener = this.mListener;
        if (waveformListener != null) {
            waveformListener.waveformDraw();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129 A[LOOP:5: B:62:0x0127->B:63:0x0129, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0156 A[LOOP:6: B:66:0x0150->B:68:0x0156, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0161 A[EDGE_INSN: B:69:0x0161->B:70:0x0161 BREAK  A[LOOP:6: B:66:0x0150->B:68:0x0156], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void computeDoublesForAllZoomLevels() {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.device.dial.ring.view.WaveformView.computeDoublesForAllZoomLevels():void");
    }

    private void computeIntsForThisZoomLevel() {
        int measuredHeight = (getMeasuredHeight() / 6) - 1;
        try {
            this.mHeightsAtThisZoomLevel = new int[this.mLenByZoomLevel[this.mZoomLevel]];
            int i = 0;
            while (true) {
                int[] iArr = this.mLenByZoomLevel;
                int i2 = this.mZoomLevel;
                if (i >= iArr[i2]) {
                    return;
                }
                int[] iArr2 = this.mHeightsAtThisZoomLevel;
                if (i < iArr2.length) {
                    double[] dArr = this.mValuesByZoomLevel[i2];
                    if (i < dArr.length) {
                        iArr2[i] = (int) (dArr[i] * measuredHeight);
                    }
                }
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
