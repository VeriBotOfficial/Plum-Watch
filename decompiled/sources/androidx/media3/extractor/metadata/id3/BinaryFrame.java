package androidx.media3.extractor.metadata.id3;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class BinaryFrame extends Id3Frame {
    public final byte[] data;

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.data = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BinaryFrame binaryFrame = (BinaryFrame) obj;
            if (this.f1209id.equals(binaryFrame.f1209id) && Arrays.equals(this.data, binaryFrame.data)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f1209id.hashCode()) * 31) + Arrays.hashCode(this.data);
    }
}
