package com.qumeng.overseas.advlib.__remote__.ui.elements;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.x;

/* loaded from: classes17.dex */
public class ExImageView extends AppCompatImageView {
    private boolean mAutoPlay;
    private Movie mMovie;
    private long mMovieStart;
    private Paint mPaint;
    private boolean mPause;
    private boolean mRepeatPlay;
    private x.b runnableGroup;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExImageView.this.startPlay();
        }
    }

    public ExImageView(Context context) {
        super(context);
        this.mAutoPlay = true;
        this.mRepeatPlay = true;
        this.mPause = false;
        a();
    }

    private void a() {
        setBackgroundColor(-1118482);
        this.mPaint = new Paint();
    }

    public void loadGif(Movie movie) {
        setBackgroundColor(0);
        this.mMovieStart = 0L;
        this.mMovie = movie;
        setLayerType(1, null);
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mMovie == null) {
            super.onDraw(canvas);
            return;
        }
        try {
            if (a(canvas)) {
                return;
            }
            invalidate();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.runnableGroup != null) {
            com.qumeng.overseas.advlib.__remote__.utils.n.a("anthony", "visibility == " + i, new Object[0]);
            if (i == 4 || i == 8) {
                this.runnableGroup.run();
            }
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.mPause = !z;
        if (z) {
            com.qumeng.overseas.advlib.__remote__.utils.j.c().postDelayed(new a(), 100L);
        }
    }

    public void playSetting(boolean z, boolean z2) {
        this.mAutoPlay = z;
        this.mRepeatPlay = z2;
    }

    public void setGrayImage(boolean z) {
        if (z) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.mPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        }
    }

    public void startPlay() {
        this.mAutoPlay = true;
        this.mMovieStart = 0L;
        invalidate();
    }

    private boolean a(Canvas canvas) {
        boolean z;
        if (canvas != null && this.mMovie != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.mMovieStart == 0) {
                this.mMovieStart = uptimeMillis;
            }
            int duration = this.mMovie.duration();
            if (duration == 0) {
                duration = 1000;
            }
            long j = duration;
            this.mMovie.setTime((int) ((uptimeMillis - this.mMovieStart) % j));
            float max = Math.max((getWidth() * 1.0f) / this.mMovie.width(), (getHeight() * 1.0f) / this.mMovie.height());
            canvas.scale(max, max);
            this.mMovie.draw(canvas, 0.0f, 0.0f, this.mPaint);
            if (this.mPause) {
                return true;
            }
            if (uptimeMillis - this.mMovieStart >= j) {
                this.mMovie.setTime(duration);
                this.mMovie.draw(canvas, 0.0f, 0.0f);
                if (!this.mRepeatPlay) {
                    return true;
                }
                this.mMovieStart = 0L;
            }
            z = this.mAutoPlay;
        } else {
            z = this.mAutoPlay;
        }
        return !z;
    }

    public ExImageView(Context context, x.b bVar) {
        super(context);
        this.mAutoPlay = true;
        this.mRepeatPlay = true;
        this.mPause = false;
        this.runnableGroup = bVar;
        a();
    }

    public ExImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAutoPlay = true;
        this.mRepeatPlay = true;
        this.mPause = false;
        a();
    }

    public ExImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAutoPlay = true;
        this.mRepeatPlay = true;
        this.mPause = false;
        a();
    }
}
