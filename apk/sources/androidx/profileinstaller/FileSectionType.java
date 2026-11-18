package androidx.profileinstaller;

/* JADX INFO: loaded from: classes7.dex */
enum FileSectionType {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    FileSectionType(long j) {
        this.mValue = j;
    }

    public long getValue() {
        return this.mValue;
    }

    static FileSectionType fromValue(long j) {
        FileSectionType[] fileSectionTypeArrValues = values();
        for (int r1 = 0; r1 < fileSectionTypeArrValues.length; r1++) {
            if (fileSectionTypeArrValues[r1].getValue() == j) {
                return fileSectionTypeArrValues[r1];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j);
    }
}
