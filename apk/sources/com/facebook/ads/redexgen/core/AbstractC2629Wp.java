package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2629Wp {
    public static byte[] A00;
    public static String[] A01 = {"CrCy7lrq6K7x8XfVc2fNdD07yQrJARzJ", "2MxjV7VZ3w9mO7JRBJp513kJ", "rmUL5G3ocM8QXPjdZtuh6zbaNsDgif4G", "2yiBwXDvjLEglhUZ76UGTCKc6ACbYUli", "XTHqKjDvfaB7R0kK8woS2JMLPY9kkXKh", "8qNbzU9VaySgM9v1BVYKE0up", "2SD8", "5eH9HzTGPv5UTtfJbfYv5z17pUBai2pZ"};

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{12, 27, 27, 23, 20, 14, 12, 31, 20, 26, 25, -38, 27, 15, 17, -3, 9, -2, -1, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.PowOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, -24, -27, -33};
    }

    static {
        A03();
    }

    public static String A01(int r4, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(15, 4, 57), r4);
            jSONObject.put(A00(19, 11, 99), str);
            JSONObject errorMsgObj = jSONObject.put(A00(30, 3, 18), str2);
            errorMsgObj.toString();
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        String[] strArr = A01;
        if (strArr[2].charAt(8) == strArr[4].charAt(8)) {
            throw new RuntimeException();
        }
        A01[3] = "VgY5LYgsJRJxHdOPZ6f9tdfdxgenUCo4";
        return string;
    }

    public static String A02(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String strA00 = A00(0, 0, 114);
        if (zIsEmpty) {
            return strA00;
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
            return strA00;
        }
        String extension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        return extension;
    }

    public static boolean A04(String str) {
        return A00(0, 15, 74).equalsIgnoreCase(A02(str));
    }
}
