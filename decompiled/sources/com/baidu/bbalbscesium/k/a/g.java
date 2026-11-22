package com.baidu.bbalbscesium.k.a;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes12.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static volatile byte[] f7423a;

    public static byte[] a() throws InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        if (f7423a == null) {
            synchronized (g.class) {
                if (f7423a == null) {
                    byte[] bArr = new byte[16];
                    System.arraycopy(com.baidu.bbalbscesium.k.c.b.a(), 0, bArr, 0, 16);
                    c cVar = new c();
                    cVar.a(2, bArr, bArr);
                    f7423a = cVar.a(new byte[]{-71, -100, -115, 26, BuiltinOptions.MaximumMinimumOptions, -124, 14, 14, -31, -46, -56, 1, 25, -127, -99, -107, -54, BuiltinOptions.TileOptions, BuiltinOptions.LessEqualOptions, 14, BuiltinOptions.FillOptions, PSSSigner.TRAILER_IMPLICIT, -19, 28, BuiltinOptions.SquareOptions, 19, -113, 5, 25, -11, -123, BuiltinOptions.SparseToDenseOptions});
                }
            }
        }
        return f7423a;
    }
}
