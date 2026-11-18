package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes15.dex */
public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int r1, int r2) {
        this.zaa = r1;
        this.zab = r2;
    }

    private static NumberFormatException zaa(String str) {
        throw new NumberFormatException("Invalid Size: \"" + str + "\"");
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.zaa == size.zaa && this.zab == size.zab) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.zab;
    }

    public int getWidth() {
        return this.zaa;
    }

    public int hashCode() {
        int r0 = this.zaa;
        return ((r0 >>> 16) | (r0 << 16)) ^ this.zab;
    }

    public String toString() {
        return this.zaa + "x" + this.zab;
    }

    public static Size parseSize(String str) throws NumberFormatException {
        if (str == null) {
            throw new IllegalArgumentException("string must not be null");
        }
        int r0 = str.indexOf(42);
        if (r0 < 0) {
            r0 = str.indexOf(120);
        }
        if (r0 < 0) {
            throw zaa(str);
        }
        try {
            return new Size(Integer.parseInt(str.substring(0, r0)), Integer.parseInt(str.substring(r0 + 1)));
        } catch (NumberFormatException unused) {
            throw zaa(str);
        }
    }
}
