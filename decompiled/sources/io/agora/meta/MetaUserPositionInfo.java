package io.agora.meta;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class MetaUserPositionInfo {
    public float[] mForward;
    public float[] mPosition;
    public float[] mRight;
    public float[] mUp;

    MetaUserPositionInfo(float[] position, float[] forward, float[] right, float[] up) {
        this.mPosition = position;
        this.mForward = forward;
        this.mRight = right;
        this.mUp = up;
    }

    public String toString() {
        return "MetaUserPositionInfo{mPosition=" + Arrays.toString(this.mPosition) + ", mForward=" + Arrays.toString(this.mForward) + ", mRight=" + Arrays.toString(this.mRight) + ", mUp=" + Arrays.toString(this.mUp) + AbstractJsonLexerKt.END_OBJ;
    }
}
