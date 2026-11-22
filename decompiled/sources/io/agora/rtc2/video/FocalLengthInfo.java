package io.agora.rtc2.video;

import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class FocalLengthInfo {
    public int cameraDirection;
    public int cameraId;
    public int focalLengthType;
    public int index;

    public FocalLengthInfo() {
    }

    public FocalLengthInfo(int i, int i2, int i3, int i4) {
        this.cameraDirection = i;
        this.index = i2;
        this.cameraId = i3;
        this.focalLengthType = i4;
    }

    public int getCameraDirection() {
        return this.cameraDirection;
    }

    public int getIndex() {
        return this.index;
    }

    public int getCameraId() {
        return this.cameraId;
    }

    public int getFocalLengthType() {
        return this.focalLengthType;
    }

    public String toString() {
        return "{cameraDirection=" + this.cameraDirection + ", Type=" + this.focalLengthType + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FocalLengthInfo focalLengthInfo = (FocalLengthInfo) obj;
            if (this.cameraDirection == focalLengthInfo.cameraDirection && this.focalLengthType == focalLengthInfo.focalLengthType) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.cameraDirection), Integer.valueOf(this.focalLengthType));
    }
}
