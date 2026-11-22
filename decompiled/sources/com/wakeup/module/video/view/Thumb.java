package com.wakeup.module.video.view;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.anythink.expressad.foundation.h.k;
import com.wakeup.module.video.R;
import java.util.List;
import java.util.Vector;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Thumb.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000  2\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR(\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\r¨\u0006!"}, d2 = {"Lcom/wakeup/module/video/view/Thumb;", "", "<init>", "()V", "value", "", "index", "getIndex", "()I", "", "getValue", "()F", "setValue", "(F)V", "pos", "getPos", "setPos", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "widthBitmap", "getWidthBitmap", "heightBitmap", "getHeightBitmap", "setHeightBitmap", "(I)V", "lastTouchX", "getLastTouchX", "setLastTouchX", "Companion", "module-video_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Thumb {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    private Bitmap bitmap;
    private int heightBitmap;
    private int index;
    private float lastTouchX;
    private float pos;
    private float value;
    private int widthBitmap;

    public /* synthetic */ Thumb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Thumb() {
        this.value = 0.0f;
        this.pos = 0.0f;
    }

    public final int getIndex() {
        return this.index;
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue(float f) {
        this.value = f;
    }

    public final float getPos() {
        return this.pos;
    }

    public final void setPos(float f) {
        this.pos = f;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
        this.widthBitmap = bitmap != null ? bitmap.getWidth() : 0;
        this.heightBitmap = bitmap != null ? bitmap.getHeight() : 0;
    }

    public final int getWidthBitmap() {
        return this.widthBitmap;
    }

    public final int getHeightBitmap() {
        return this.heightBitmap;
    }

    public final void setHeightBitmap(int i) {
        this.heightBitmap = i;
    }

    public final float getLastTouchX() {
        return this.lastTouchX;
    }

    public final void setLastTouchX(float f) {
        this.lastTouchX = f;
    }

    /* compiled from: Thumb.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/wakeup/module/video/view/Thumb$Companion;", "", "<init>", "()V", "LEFT", "", "RIGHT", "initThumbs", "", "Lcom/wakeup/module/video/view/Thumb;", "resources", "Landroid/content/res/Resources;", "getWidthBitmap", "thumbs", "getHeightBitmap", "drawableToBitmap", "Landroid/graphics/Bitmap;", k.c, "Landroid/graphics/drawable/Drawable;", "module-video_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Thumb> initThumbs(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            float f = resources.getDisplayMetrics().density;
            int i = (int) ((12 * f) + 0.5f);
            int i2 = (int) ((50 * f) + 0.5f);
            Vector vector = new Vector();
            for (int i3 = 0; i3 < 2; i3++) {
                Thumb thumb = new Thumb(null);
                thumb.index = i3;
                if (i3 == 0) {
                    thumb.setBitmap(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, R.drawable.seek_left_handle), i, i2, true));
                } else {
                    thumb.setBitmap(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, R.drawable.seek_right_handle), i, i2, true));
                }
                vector.add(thumb);
            }
            return vector;
        }

        public final int getWidthBitmap(List<Thumb> thumbs) {
            Intrinsics.checkNotNullParameter(thumbs, "thumbs");
            return thumbs.get(0).getWidthBitmap();
        }

        public final int getHeightBitmap(List<Thumb> thumbs) {
            Intrinsics.checkNotNullParameter(thumbs, "thumbs");
            return thumbs.get(0).getHeightBitmap();
        }

        public final Bitmap drawableToBitmap(Drawable drawable) {
            Bitmap createBitmap;
            Intrinsics.checkNotNullParameter(drawable, "drawable");
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    Bitmap bitmap = bitmapDrawable.getBitmap();
                    Intrinsics.checkNotNullExpressionValue(bitmap, "getBitmap(...)");
                    return bitmap;
                }
            }
            if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            } else {
                createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            }
            Intrinsics.checkNotNull(createBitmap);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        }
    }
}
