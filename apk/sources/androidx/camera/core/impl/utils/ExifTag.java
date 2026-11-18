package androidx.camera.core.impl.utils;

/* JADX INFO: loaded from: classes.dex */
class ExifTag {
    public final String name;
    public final int number;
    public final int primaryFormat;
    public final int secondaryFormat;

    ExifTag(String str, int r2, int r3) {
        this.name = str;
        this.number = r2;
        this.primaryFormat = r3;
        this.secondaryFormat = -1;
    }

    ExifTag(String str, int r2, int r3, int r4) {
        this.name = str;
        this.number = r2;
        this.primaryFormat = r3;
        this.secondaryFormat = r4;
    }

    boolean isFormatCompatible(int r5) {
        int r2;
        int r0 = this.primaryFormat;
        if (r0 == 7 || r5 == 7 || r0 == r5 || (r2 = this.secondaryFormat) == r5) {
            return true;
        }
        if ((r0 == 4 || r2 == 4) && r5 == 3) {
            return true;
        }
        if ((r0 == 9 || r2 == 9) && r5 == 8) {
            return true;
        }
        return (r0 == 12 || r2 == 12) && r5 == 11;
    }
}
