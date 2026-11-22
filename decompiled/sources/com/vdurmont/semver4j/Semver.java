package com.vdurmont.semver4j;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Objects;

/* loaded from: classes2.dex */
public class Semver implements Comparable<Semver> {
    private final String build;
    private final Integer major;
    private final Integer minor;
    private final String originalValue;
    private final Integer patch;
    private final String[] suffixTokens;
    private final SemverType type;
    private final String value;

    public enum SemverType {
        STRICT,
        LOOSE,
        NPM,
        COCOAPODS,
        IVY
    }

    public enum VersionDiff {
        NONE,
        MAJOR,
        MINOR,
        PATCH,
        SUFFIX,
        BUILD
    }

    public Semver(String str) {
        this(str, SemverType.STRICT);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:21|22|(2:24|25)|26|27|28|29|30|31|32|(4:34|(1:36)(1:40)|37|38)(2:41|42)) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010b, code lost:
    
        if (r23 == com.vdurmont.semver4j.Semver.SemverType.STRICT) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x015a, code lost:
    
        throw new com.vdurmont.semver4j.SemverException("Invalid version (no patch version): " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e3, code lost:
    
        if (r23 != com.vdurmont.semver4j.Semver.SemverType.NPM) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0108, code lost:
    
        throw new com.vdurmont.semver4j.SemverException("Invalid version (no patch version): " + r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011e A[Catch: IndexOutOfBoundsException -> 0x0140, TryCatch #4 {IndexOutOfBoundsException -> 0x0140, blocks: (B:32:0x0116, B:34:0x011e, B:36:0x0128, B:40:0x0133, B:41:0x013a, B:42:0x013f), top: B:31:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013a A[Catch: IndexOutOfBoundsException -> 0x0140, TryCatch #4 {IndexOutOfBoundsException -> 0x0140, blocks: (B:32:0x0116, B:34:0x011e, B:36:0x0128, B:40:0x0133, B:41:0x013a, B:42:0x013f), top: B:31:0x0116 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Semver(java.lang.String r22, com.vdurmont.semver4j.Semver.SemverType r23) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdurmont.semver4j.Semver.<init>(java.lang.String, com.vdurmont.semver4j.Semver$SemverType):void");
    }

    private void validate(SemverType semverType) {
        if (this.minor == null && semverType == SemverType.STRICT) {
            throw new SemverException("Invalid version (no minor version): " + this.value);
        }
        if (this.patch == null && semverType == SemverType.STRICT) {
            throw new SemverException("Invalid version (no patch version): " + this.value);
        }
    }

    private boolean hasPreRelease(String str) {
        int indexOf = this.value.indexOf("+");
        int indexOf2 = this.value.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (indexOf2 == -1) {
            return false;
        }
        return indexOf == -1 || indexOf2 < indexOf;
    }

    public boolean satisfies(Requirement requirement) {
        return requirement.isSatisfiedBy(this);
    }

    /* renamed from: com.vdurmont.semver4j.Semver$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$vdurmont$semver4j$Semver$SemverType;

        static {
            int[] iArr = new int[SemverType.values().length];
            $SwitchMap$com$vdurmont$semver4j$Semver$SemverType = iArr;
            try {
                iArr[SemverType.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$vdurmont$semver4j$Semver$SemverType[SemverType.LOOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$vdurmont$semver4j$Semver$SemverType[SemverType.NPM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$vdurmont$semver4j$Semver$SemverType[SemverType.COCOAPODS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$vdurmont$semver4j$Semver$SemverType[SemverType.IVY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public boolean satisfies(String str) {
        Requirement buildStrict;
        int i = AnonymousClass1.$SwitchMap$com$vdurmont$semver4j$Semver$SemverType[this.type.ordinal()];
        if (i == 1) {
            buildStrict = Requirement.buildStrict(str);
        } else if (i == 2) {
            buildStrict = Requirement.buildLoose(str);
        } else if (i == 3) {
            buildStrict = Requirement.buildNPM(str);
        } else if (i == 4) {
            buildStrict = Requirement.buildCocoapods(str);
        } else if (i == 5) {
            buildStrict = Requirement.buildIvy(str);
        } else {
            throw new SemverException("Invalid requirement type: " + this.type);
        }
        return satisfies(buildStrict);
    }

    public boolean isGreaterThan(String str) {
        return isGreaterThan(new Semver(str, getType()));
    }

    public boolean isGreaterThan(Semver semver) {
        int compareToIgnoreCase;
        if (getMajor().intValue() > semver.getMajor().intValue()) {
            return true;
        }
        if (getMajor().intValue() < semver.getMajor().intValue()) {
            return false;
        }
        if (this.type == SemverType.NPM && semver.getMinor() == null) {
            return false;
        }
        int intValue = semver.getMinor() != null ? semver.getMinor().intValue() : 0;
        if (getMinor() != null && getMinor().intValue() > intValue) {
            return true;
        }
        if (getMinor() != null && getMinor().intValue() < intValue) {
            return false;
        }
        if (this.type == SemverType.NPM && semver.getPatch() == null) {
            return false;
        }
        int intValue2 = semver.getPatch() != null ? semver.getPatch().intValue() : 0;
        if (getPatch() != null && getPatch().intValue() > intValue2) {
            return true;
        }
        if (getPatch() != null && getPatch().intValue() < intValue2) {
            return false;
        }
        String[] suffixTokens = getSuffixTokens();
        String[] suffixTokens2 = semver.getSuffixTokens();
        if (suffixTokens.length == 0 && suffixTokens2.length > 0) {
            return true;
        }
        if (suffixTokens2.length == 0 && suffixTokens.length > 0) {
            return false;
        }
        for (int i = 0; i < suffixTokens.length && i < suffixTokens2.length; i++) {
            try {
                compareToIgnoreCase = Integer.valueOf(suffixTokens[i]).intValue() - Integer.valueOf(suffixTokens2[i]).intValue();
            } catch (NumberFormatException unused) {
                compareToIgnoreCase = suffixTokens[i].compareToIgnoreCase(suffixTokens2[i]);
            }
            if (compareToIgnoreCase < 0) {
                return false;
            }
            if (compareToIgnoreCase > 0) {
                return true;
            }
        }
        return suffixTokens.length > suffixTokens2.length;
    }

    public boolean isGreaterThanOrEqualTo(String str) {
        return isGreaterThanOrEqualTo(new Semver(str, this.type));
    }

    public boolean isGreaterThanOrEqualTo(Semver semver) {
        return isGreaterThan(semver) || isEquivalentTo(semver);
    }

    public boolean isLowerThan(String str) {
        return isLowerThan(new Semver(str, this.type));
    }

    public boolean isLowerThan(Semver semver) {
        return (isGreaterThan(semver) || isEquivalentTo(semver)) ? false : true;
    }

    public boolean isLowerThanOrEqualTo(String str) {
        return isLowerThanOrEqualTo(new Semver(str, this.type));
    }

    public boolean isLowerThanOrEqualTo(Semver semver) {
        return !isGreaterThan(semver);
    }

    public boolean isEquivalentTo(String str) {
        return isEquivalentTo(new Semver(str, this.type));
    }

    public boolean isEquivalentTo(Semver semver) {
        Semver semver2 = getBuild() == null ? this : new Semver(getValue().replace("+" + getBuild(), ""));
        if (semver.getBuild() != null) {
            semver = new Semver(semver.getValue().replace("+" + semver.getBuild(), ""));
        }
        return semver2.isEqualTo(semver);
    }

    public boolean isEqualTo(String str) {
        return isEqualTo(new Semver(str, this.type));
    }

    public boolean isEqualTo(Semver semver) {
        if (this.type == SemverType.NPM) {
            if (getMajor() != semver.getMajor()) {
                return false;
            }
            if (semver.getMinor() == null || semver.getPatch() == null) {
                return true;
            }
        }
        return equals(semver);
    }

    public boolean isStable() {
        if (getMajor() == null || getMajor().intValue() <= 0) {
            return false;
        }
        return getSuffixTokens() == null || getSuffixTokens().length == 0;
    }

    public VersionDiff diff(String str) {
        return diff(new Semver(str, this.type));
    }

    public VersionDiff diff(Semver semver) {
        return !Objects.equals(this.major, semver.getMajor()) ? VersionDiff.MAJOR : !Objects.equals(this.minor, semver.getMinor()) ? VersionDiff.MINOR : !Objects.equals(this.patch, semver.getPatch()) ? VersionDiff.PATCH : !areSameSuffixes(semver.getSuffixTokens()) ? VersionDiff.SUFFIX : !Objects.equals(this.build, semver.getBuild()) ? VersionDiff.BUILD : VersionDiff.NONE;
    }

    private boolean areSameSuffixes(String[] strArr) {
        String[] strArr2 = this.suffixTokens;
        if (strArr2 == null && strArr == null) {
            return true;
        }
        if (strArr2 == null || strArr == null || strArr2.length != strArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            String[] strArr3 = this.suffixTokens;
            if (i >= strArr3.length) {
                return true;
            }
            if (!strArr3[i].equals(strArr[i])) {
                return false;
            }
            i++;
        }
    }

    public Semver toStrict() {
        Integer num = this.minor;
        Integer valueOf = Integer.valueOf(num != null ? num.intValue() : 0);
        Integer num2 = this.patch;
        return create(SemverType.STRICT, this.major.intValue(), valueOf, Integer.valueOf(num2 != null ? num2.intValue() : 0), this.suffixTokens, this.build);
    }

    public Semver withIncMajor() {
        return withIncMajor(1);
    }

    public Semver withIncMajor(int i) {
        return withInc(i, 0, 0);
    }

    public Semver withIncMinor() {
        return withIncMinor(1);
    }

    public Semver withIncMinor(int i) {
        return withInc(0, i, 0);
    }

    public Semver withIncPatch() {
        return withIncPatch(1);
    }

    public Semver withIncPatch(int i) {
        return withInc(0, 0, i);
    }

    private Semver withInc(int i, int i2, int i3) {
        Integer num = this.minor;
        Integer num2 = this.patch;
        if (num != null) {
            num = Integer.valueOf(num.intValue() + i2);
        }
        Integer num3 = num;
        if (this.patch != null) {
            num2 = Integer.valueOf(num2.intValue() + i3);
        }
        return with(this.major.intValue() + i, num3, num2, true, true);
    }

    public Semver withClearedSuffix() {
        return with(this.major.intValue(), this.minor, this.patch, false, true);
    }

    public Semver withClearedBuild() {
        return with(this.major.intValue(), this.minor, this.patch, true, false);
    }

    public Semver withClearedSuffixAndBuild() {
        return with(this.major.intValue(), this.minor, this.patch, false, false);
    }

    public Semver withSuffix(String str) {
        return with(this.major.intValue(), this.minor, this.patch, str.split("\\."), this.build);
    }

    public Semver withBuild(String str) {
        return with(this.major.intValue(), this.minor, this.patch, this.suffixTokens, str);
    }

    public Semver nextMajor() {
        return with(this.major.intValue() + 1, (Integer) 0, (Integer) 0, false, false);
    }

    public Semver nextMinor() {
        return with(this.major.intValue(), Integer.valueOf(this.minor.intValue() + 1), (Integer) 0, false, false);
    }

    public Semver nextPatch() {
        return with(this.major.intValue(), this.minor, Integer.valueOf(this.patch.intValue() + 1), false, false);
    }

    private Semver with(int i, Integer num, Integer num2, boolean z, boolean z2) {
        Integer num3 = this.minor != null ? num : null;
        Integer num4 = this.patch != null ? num2 : null;
        String str = z2 ? this.build : null;
        return create(this.type, i, num3, num4, z ? this.suffixTokens : null, str);
    }

    private Semver with(int i, Integer num, Integer num2, String[] strArr, String str) {
        return create(this.type, i, this.minor != null ? num : null, this.patch != null ? num2 : null, strArr, str);
    }

    private static Semver create(SemverType semverType, int i, Integer num, Integer num2, String[] strArr, String str) {
        StringBuilder append = new StringBuilder().append(i);
        if (num != null) {
            append.append(".").append(num);
        }
        if (num2 != null) {
            append.append(".").append(num2);
        }
        if (strArr != null) {
            boolean z = true;
            for (String str2 : strArr) {
                if (z) {
                    append.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                    z = false;
                } else {
                    append.append(".");
                }
                append.append(str2);
            }
        }
        if (str != null) {
            append.append("+").append(str);
        }
        return new Semver(append.toString(), semverType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Semver) {
            return this.value.equals(((Semver) obj).value);
        }
        return false;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @Override // java.lang.Comparable
    public int compareTo(Semver semver) {
        if (isGreaterThan(semver)) {
            return 1;
        }
        return isLowerThan(semver) ? -1 : 0;
    }

    public String toString() {
        return getValue();
    }

    public String getOriginalValue() {
        return this.originalValue;
    }

    public String getValue() {
        return this.value;
    }

    public Integer getMajor() {
        return this.major;
    }

    public Integer getMinor() {
        return this.minor;
    }

    public Integer getPatch() {
        return this.patch;
    }

    public String[] getSuffixTokens() {
        return this.suffixTokens;
    }

    public String getBuild() {
        return this.build;
    }

    public SemverType getType() {
        return this.type;
    }
}
