package com.otaliastudios.opengl.draw;

import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Gl2dDrawable.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\nj\u0002`\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/otaliastudios/opengl/draw/Gl2dDrawable;", "Lcom/otaliastudios/opengl/draw/GlDrawable;", "()V", "coordsPerVertex", "", "getCoordsPerVertex", "()I", "getBounds", "", "rect", "Landroid/graphics/RectF;", "Lcom/otaliastudios/opengl/geometry/RectF;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes17.dex */
public abstract class Gl2dDrawable extends GlDrawable {
    private final int coordsPerVertex = 2;

    @Override // com.otaliastudios.opengl.draw.GlDrawable
    public final int getCoordsPerVertex() {
        return this.coordsPerVertex;
    }

    public final void getBounds(RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        float f = -3.4028235E38f;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        while (getVertexArray().hasRemaining()) {
            float f5 = getVertexArray().get();
            if (i % 2 == 0) {
                f4 = Math.min(f4, f5);
                f3 = Math.max(f3, f5);
            } else {
                f = Math.max(f, f5);
                f2 = Math.min(f2, f5);
            }
            i++;
        }
        getVertexArray().rewind();
        rect.set(f4, f, f3, f2);
    }
}
