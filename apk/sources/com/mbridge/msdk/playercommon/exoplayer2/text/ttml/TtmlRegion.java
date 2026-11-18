package com.mbridge.msdk.playercommon.exoplayer2.text.ttml;

/* JADX INFO: loaded from: classes2.dex */
final class TtmlRegion {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final String f11949id;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final float position;
    public final float textSize;
    public final int textSizeType;
    public final float width;

    public TtmlRegion(String str) {
        this(str, Float.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public TtmlRegion(String str, float f, float f2, int r4, int r5, float f3, int r7, float f4) {
        this.f11949id = str;
        this.position = f;
        this.line = f2;
        this.lineType = r4;
        this.lineAnchor = r5;
        this.width = f3;
        this.textSizeType = r7;
        this.textSize = f4;
    }
}
