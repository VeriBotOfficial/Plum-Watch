package com.wakeup.module.ai.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.SparseArray;
import com.wakeup.commonui.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class WaveLineView extends RenderView {
    private final float DEFAULT_OFFSET_SPEED;
    private final int DEFAULT_SAMPLING_SIZE;
    private final int DEFAULT_SENSIBILITY;
    private float amplitude;
    private int backGroundColor;
    private int centerHeight;
    private final Object dataLock;
    public double db;
    private int fineLineWidth;
    private int height;
    private boolean isOpenPrepareAnim;
    private boolean isPrepareAlphaAnimEnd;
    private boolean isPrepareLineAnimEnd;
    private int lineAnimX;
    private int lineColor;
    private float[] mapX;
    private float offsetSpeed;
    private final Paint paint;
    private float[] pathFuncs;
    private List<Path> paths;
    private float perVolume;
    private float prepareAlpha;
    private SparseArray<Double> recessionFuncs;
    private int samplingSize;
    private float[] samplingX;
    private int sensibility;
    private volatile int targetVolume;
    private int thickLineWidth;
    private volatile double voiceDb;
    private float volume;
    private int width;

    public WaveLineView(Context context) {
        this(context, null);
    }

    public WaveLineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WaveLineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.DEFAULT_SAMPLING_SIZE = 64;
        this.DEFAULT_OFFSET_SPEED = 250.0f;
        this.DEFAULT_SENSIBILITY = 5;
        this.volume = 0.0f;
        this.targetVolume = 0;
        this.backGroundColor = -1;
        this.dataLock = new Object();
        Paint paint = new Paint();
        this.paint = paint;
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.paths = new ArrayList();
        this.pathFuncs = new float[]{0.6f, 0.35f, 0.1f, -0.1f};
        for (int i2 = 0; i2 < this.pathFuncs.length; i2++) {
            this.paths.add(new Path());
        }
        this.recessionFuncs = new SparseArray<>();
        this.isPrepareLineAnimEnd = false;
        this.lineAnimX = 0;
        this.isPrepareAlphaAnimEnd = false;
        this.prepareAlpha = 0.0f;
        this.isOpenPrepareAnim = false;
        this.db = 0.0d;
        initAttr(attributeSet);
    }

    private void initAttr(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.WaveLineView);
        this.backGroundColor = obtainStyledAttributes.getColor(R.styleable.WaveLineView_wlvBackgroundColor, -1);
        this.samplingSize = obtainStyledAttributes.getInt(R.styleable.WaveLineView_wlvSamplingSize, 64);
        this.lineColor = obtainStyledAttributes.getColor(R.styleable.WaveLineView_wlvLineColor, Color.parseColor("#ffffff"));
        this.thickLineWidth = (int) obtainStyledAttributes.getDimension(R.styleable.WaveLineView_wlvThickLineWidth, 6.0f);
        this.fineLineWidth = (int) obtainStyledAttributes.getDimension(R.styleable.WaveLineView_wlvFineLineWidth, 2.0f);
        this.offsetSpeed = obtainStyledAttributes.getFloat(R.styleable.WaveLineView_wlvMoveSpeed, 250.0f);
        this.sensibility = obtainStyledAttributes.getInt(R.styleable.WaveLineView_wlvSensibility, 5);
        obtainStyledAttributes.recycle();
        checkVolumeValue();
        checkSensibilityValue();
    }

    @Override // com.wakeup.module.ai.view.RenderView
    protected void doDrawBackground(Canvas canvas) {
        canvas.drawColor(this.backGroundColor);
    }

    @Override // com.wakeup.module.ai.view.RenderView
    protected void onRender(Canvas canvas, long j) {
        float[] fArr;
        float[] fArr2;
        int i;
        int i2;
        int i3;
        float f;
        float f2 = j / this.offsetSpeed;
        synchronized (this.dataLock) {
            if (this.samplingX == null || this.mapX == null) {
                initDrawLocked(canvas);
            }
            fArr = this.samplingX;
            fArr2 = this.mapX;
            i = this.width;
            i2 = this.height;
            i3 = this.centerHeight;
            f = this.amplitude;
        }
        if (fArr == null || fArr2 == null) {
            return;
        }
        resetPaths();
        softerChangeVolume();
        for (int i4 = 0; i4 <= this.samplingSize; i4++) {
            float f3 = fArr[i4];
            float calcValue = (float) (f * calcValue(fArr2[i4], f2));
            for (int i5 = 0; i5 < this.paths.size(); i5++) {
                this.paths.get(i5).lineTo(f3, i3 + (this.pathFuncs[i5] * calcValue * this.volume * 0.03f));
            }
        }
        for (int i6 = 0; i6 < this.paths.size(); i6++) {
            this.paths.get(i6).lineTo(i, i3);
        }
        float f4 = i2;
        this.paths.get(0).lineTo(i, f4);
        this.paths.get(0).lineTo(0.0f, f4);
        this.paths.get(0).lineTo(0.0f, i3);
        for (int i7 = 0; i7 < this.paths.size(); i7++) {
            if (i7 == 0) {
                this.paint.setStrokeWidth(this.thickLineWidth);
                this.paint.setAlpha((int) (alphaInAnim() * 255.0f));
            } else {
                this.paint.setStrokeWidth(this.fineLineWidth);
                this.paint.setAlpha((int) (alphaInAnim() * 100.0f));
            }
            canvas.drawPath(this.paths.get(i7), this.paint);
        }
    }

    private void checkVolumeValue() {
        if (this.targetVolume > 100) {
            this.targetVolume = 100;
        }
    }

    private void checkSensibilityValue() {
        if (this.sensibility > 10) {
            this.sensibility = 10;
        }
        if (this.sensibility < 1) {
            this.sensibility = 1;
        }
    }

    private void softerChangeVolume() {
        float f = this.volume;
        float f2 = this.targetVolume;
        float f3 = this.perVolume;
        if (f < f2 - f3) {
            this.volume += f3;
            return;
        }
        float f4 = this.volume;
        float f5 = this.targetVolume;
        float f6 = this.perVolume;
        if (f4 > f5 + f6) {
            float f7 = this.volume;
            if (f7 < f6 * 2.0f) {
                this.volume = f6 * 2.0f;
                return;
            } else {
                this.volume = f7 - f6;
                return;
            }
        }
        this.volume = this.targetVolume;
    }

    private float alphaInAnim() {
        if (!this.isOpenPrepareAnim) {
            return 1.0f;
        }
        float f = this.prepareAlpha;
        if (f < 1.0f) {
            this.prepareAlpha = f + 0.02f;
        } else {
            this.prepareAlpha = 1.0f;
        }
        return this.prepareAlpha;
    }

    private boolean lineAnim(Canvas canvas) {
        if (this.isPrepareLineAnimEnd || !this.isOpenPrepareAnim) {
            return true;
        }
        this.paths.get(0).moveTo(0.0f, this.centerHeight);
        int i = 1;
        while (true) {
            if (i > this.samplingSize) {
                break;
            }
            this.paths.get(0).lineTo((this.lineAnimX * i) / r2, this.centerHeight);
            i++;
        }
        this.paths.get(0).moveTo(this.width / 2, this.centerHeight);
        int i2 = this.lineAnimX;
        int i3 = this.width;
        int i4 = i2 + (i3 / 60);
        this.lineAnimX = i4;
        if (i4 <= i3 / 2) {
            return false;
        }
        this.isPrepareLineAnimEnd = true;
        return true;
    }

    private void resetPaths() {
        for (int i = 0; i < this.paths.size(); i++) {
            this.paths.get(i).rewind();
            this.paths.get(i).moveTo(0.0f, this.centerHeight);
        }
    }

    private void initParameters() {
        this.lineAnimX = 0;
        this.prepareAlpha = 0.0f;
        this.isPrepareLineAnimEnd = false;
        this.isPrepareAlphaAnimEnd = false;
        synchronized (this.dataLock) {
            this.samplingX = null;
            this.mapX = null;
        }
    }

    @Override // com.wakeup.module.ai.view.RenderView
    public void startAnim() {
        initParameters();
        super.startAnim();
        onResume();
    }

    @Override // com.wakeup.module.ai.view.RenderView
    public void stopAnim() {
        super.stopAnim();
        onPause();
    }

    public void destroy() {
        clearDraw();
        release();
    }

    public void clearDraw() {
        Canvas canvas = null;
        try {
            canvas = getHolder().lockCanvas(null);
            canvas.drawColor(this.backGroundColor);
            resetPaths();
            for (int i = 0; i < this.paths.size(); i++) {
                canvas.drawPath(this.paths.get(i), this.paint);
            }
            if (canvas != null) {
                getHolder().unlockCanvasAndPost(canvas);
            }
        } catch (Exception unused) {
            if (canvas != null) {
                getHolder().unlockCanvasAndPost(canvas);
            }
        } catch (Throwable th) {
            if (canvas != null) {
                getHolder().unlockCanvasAndPost(canvas);
            }
            throw th;
        }
    }

    private void initDrawLocked(Canvas canvas) {
        int i;
        this.width = canvas.getWidth();
        int height = canvas.getHeight();
        this.height = height;
        int i2 = this.width;
        if (i2 <= 0 || height <= 0 || (i = this.samplingSize) <= 0) {
            this.samplingX = null;
            this.mapX = null;
            return;
        }
        this.centerHeight = (int) (height / 2.55f);
        this.amplitude = height;
        this.perVolume = this.sensibility * 0.35f;
        float[] fArr = new float[i + 1];
        float[] fArr2 = new float[i + 1];
        float f = i2 / i;
        for (int i3 = 0; i3 <= this.samplingSize; i3++) {
            float f2 = i3 * f;
            fArr[i3] = f2;
            fArr2[i3] = ((f2 / this.width) * 4.0f) - 2.0f;
        }
        this.samplingX = fArr;
        this.mapX = fArr2;
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(this.lineColor);
        this.paint.setStrokeWidth(this.thickLineWidth);
    }

    private double calcValue(float f, float f2) {
        double d;
        int i = (int) (1000.0f * f);
        double d2 = f;
        double sin = Math.sin((d2 * 3.141592653589793d) - ((f2 % 2.0f) * 3.141592653589793d));
        if (this.recessionFuncs.indexOfKey(i) >= 0) {
            d = this.recessionFuncs.get(i).doubleValue();
        } else {
            double pow = 4.0d / (Math.pow(d2, 4.0d) + 4.0d);
            this.recessionFuncs.put(i, Double.valueOf(pow));
            d = pow;
        }
        return sin * d;
    }

    public void setMoveSpeed(float f) {
        this.offsetSpeed = f;
    }

    public void setVolume(int i) {
        if (Math.abs(this.targetVolume - i) > this.perVolume) {
            setTargetVolume(i);
        }
    }

    public void setBackGroundColor(int i) {
        this.backGroundColor = i;
    }

    public void setLineColor(int i) {
        this.lineColor = i;
    }

    public void setSensibility(int i) {
        this.sensibility = i;
        checkSensibilityValue();
    }

    public void initMice() {
        setTargetVolume((int) this.voiceDb);
    }

    public void mice() {
        setTargetVolume((int) this.voiceDb);
    }

    public void setDecibel(int i) {
        if (i == 0) {
            i = 2;
        }
        this.voiceDb = i;
        setTargetVolume(i);
    }

    private void setTargetVolume(int i) {
        this.targetVolume = Math.max(0, Math.min(100, i));
        this.db = this.targetVolume;
    }
}
