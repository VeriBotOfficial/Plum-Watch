package sg.bigo.ads.core.player.b;

import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;

/* loaded from: classes9.dex */
public final class g extends TextureView {

    /* renamed from: a, reason: collision with root package name */
    int f20160a;
    int b;
    private int c;

    public g(Context context, int i, int i2, int i3) {
        super(context);
        this.f20160a = i;
        this.b = i2;
        this.c = i3;
        setLayoutParams((i3 == 1 || i3 == 4) ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-1, -2, 17));
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (RuntimeException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r12 != 4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        if (r0 < (r12 * r3)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        r5 = (r12 * r3) / r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        if (r0 >= (r12 * r3)) goto L38;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r11, int r12) {
        /*
            Method dump skipped, instructions count: 173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.player.b.g.onMeasure(int, int):void");
    }
}
