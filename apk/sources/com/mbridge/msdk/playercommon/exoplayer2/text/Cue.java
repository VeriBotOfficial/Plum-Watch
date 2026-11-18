package com.mbridge.msdk.playercommon.exoplayer2.text;

import android.graphics.Bitmap;
import android.text.Layout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class Cue {
    public static final int ANCHOR_TYPE_END = 2;
    public static final int ANCHOR_TYPE_MIDDLE = 1;
    public static final int ANCHOR_TYPE_START = 0;
    public static final float DIMEN_UNSET = Float.MIN_VALUE;
    public static final int LINE_TYPE_FRACTION = 0;
    public static final int LINE_TYPE_NUMBER = 1;
    public static final int TEXT_SIZE_TYPE_ABSOLUTE = 2;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL = 0;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL_IGNORE_PADDING = 1;
    public static final int TYPE_UNSET = Integer.MIN_VALUE;
    public final Bitmap bitmap;
    public final float bitmapHeight;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final float position;
    public final int positionAnchor;
    public final float size;
    public final CharSequence text;
    public final Layout.Alignment textAlignment;
    public final float textSize;
    public final int textSizeType;
    public final int windowColor;
    public final boolean windowColorSet;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AnchorType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LineType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TextSizeType {
    }

    public Cue(Bitmap bitmap, float f, int r18, float f2, int r20, float f3, float f4) {
        this(null, null, bitmap, f2, 0, r20, f, r18, Integer.MIN_VALUE, Float.MIN_VALUE, f3, f4, false, -16777216);
    }

    public Cue(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, float f, int r15, int r16, float f2, int r18, float f3) {
        this(charSequence, alignment, f, r15, r16, f2, r18, f3, false, -16777216);
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, float f, int r19, int r20, float f2, int r22, float f3, int r24, float f4) {
        this(charSequence, alignment, null, f, r19, r20, f2, r22, r24, f4, f3, Float.MIN_VALUE, false, -16777216);
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, float f, int r19, int r20, float f2, int r22, float f3, boolean z, int r25) {
        this(charSequence, alignment, null, f, r19, r20, f2, r22, Integer.MIN_VALUE, Float.MIN_VALUE, f3, Float.MIN_VALUE, z, r25);
    }

    private Cue(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f, int r5, int r6, float f2, int r8, int r9, float f3, float f4, float f5, boolean z, int r14) {
        this.text = charSequence;
        this.textAlignment = alignment;
        this.bitmap = bitmap;
        this.line = f;
        this.lineType = r5;
        this.lineAnchor = r6;
        this.position = f2;
        this.positionAnchor = r8;
        this.size = f4;
        this.bitmapHeight = f5;
        this.windowColorSet = z;
        this.windowColor = r14;
        this.textSizeType = r9;
        this.textSize = f3;
    }
}
