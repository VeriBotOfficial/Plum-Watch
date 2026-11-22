package io.agora.base;

import android.graphics.Rect;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public final class FaceDetectionInfo implements IMetaInfo {
    private double mDepth;
    private Rect mFaceRect;
    private int mId;

    public FaceDetectionInfo(int i, Rect rect, double d) {
        this.mId = i;
        this.mFaceRect = rect;
        this.mDepth = d;
    }

    @Override // io.agora.base.IMetaInfo
    public int getId() {
        return this.mId;
    }

    @Override // io.agora.base.IMetaInfo
    public String getTag() {
        return getClass().getSimpleName();
    }

    public Rect getFaceRect() {
        return this.mFaceRect;
    }

    public double getDepth() {
        return this.mDepth;
    }

    public String toString() {
        return "FaceDetectionInfo{mId=" + this.mId + ", mFaceRect=" + this.mFaceRect + ", mDepth=" + this.mDepth + AbstractJsonLexerKt.END_OBJ;
    }
}
