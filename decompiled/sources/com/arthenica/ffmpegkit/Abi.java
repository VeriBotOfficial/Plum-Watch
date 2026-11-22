package com.arthenica.ffmpegkit;

import com.facebook.soloader.MinElf;

/* loaded from: classes12.dex */
public enum Abi {
    ABI_ARMV7A_NEON("armeabi-v7a-neon"),
    ABI_ARMV7A(MinElf.ISA.ARM),
    ABI_ARM("armeabi"),
    ABI_X86(MinElf.ISA.X86),
    ABI_X86_64(MinElf.ISA.X86_64),
    ABI_ARM64_V8A(MinElf.ISA.AARCH64),
    ABI_UNKNOWN("unknown");

    private final String name;

    public static Abi from(String str) {
        if (str == null) {
            return ABI_UNKNOWN;
        }
        Abi abi = ABI_ARM;
        if (str.equals(abi.getName())) {
            return abi;
        }
        Abi abi2 = ABI_ARMV7A;
        if (str.equals(abi2.getName())) {
            return abi2;
        }
        Abi abi3 = ABI_ARMV7A_NEON;
        if (str.equals(abi3.getName())) {
            return abi3;
        }
        Abi abi4 = ABI_ARM64_V8A;
        if (str.equals(abi4.getName())) {
            return abi4;
        }
        Abi abi5 = ABI_X86;
        if (str.equals(abi5.getName())) {
            return abi5;
        }
        Abi abi6 = ABI_X86_64;
        return str.equals(abi6.getName()) ? abi6 : ABI_UNKNOWN;
    }

    public String getName() {
        return this.name;
    }

    Abi(String str) {
        this.name = str;
    }
}
