package com.sifli.ezip;

/* loaded from: classes12.dex */
public class SFBoardType {
    public static final int BOARD_TYPE_52X = 2;
    public static final int BOARD_TYPE_55X = 0;
    public static final int BOARD_TYPE_56X = 1;
    public static final int BOARD_TYPE_57X = 3;
    public static final int BOARD_TYPE_58X = 4;

    public static boolean isValidBoardType(int i) {
        return i >= 0 && i <= 4;
    }
}
