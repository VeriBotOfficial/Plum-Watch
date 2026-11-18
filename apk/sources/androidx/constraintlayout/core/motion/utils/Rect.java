package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes8.dex */
public class Rect {
    public int bottom;
    public int left;
    public int right;

    /* JADX INFO: renamed from: top, reason: collision with root package name */
    public int f1170top;

    public int width() {
        return this.right - this.left;
    }

    public int height() {
        return this.bottom - this.f1170top;
    }
}
