package androidx.media3.common.util;

/* loaded from: classes10.dex */
public final class GlRect {
    public int bottom;
    public int left;
    public int right;

    /* renamed from: top, reason: collision with root package name */
    public int f1197top;

    public GlRect(int i, int i2) {
        this(0, 0, i, i2);
    }

    public GlRect(int i, int i2, int i3, int i4) {
        Assertions.checkArgument(i <= i3 && i2 <= i4);
        this.left = i;
        this.bottom = i2;
        this.right = i3;
        this.f1197top = i4;
    }
}
