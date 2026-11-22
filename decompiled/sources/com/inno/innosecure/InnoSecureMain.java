package com.inno.innosecure;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.anythink.expressad.foundation.h.k;
import com.jifen.open.lib.relinkerx.ReLinker;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.UUID;

/* loaded from: classes17.dex */
public class InnoSecureMain {
    private static final String CID_QTT = "47514950895225";
    private static final String TAG = "encrypt";
    private String localSdkVersion = "4.0.2.210115";
    private String mCid;
    private Context mContext;
    private String mPackageName;
    private int mVerifySign;
    private byte[] res;
    private String sign;
    private String v;

    public InnoSecureMain(Context context, String str, String str2) {
        this.mCid = null;
        this.mVerifySign = 1;
        if (context == null) {
            Log.e(TAG, "context null!");
        } else {
            this.mContext = context.getApplicationContext();
        }
        checkLib(context);
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "请设置cid避免加密异常!!!!!");
        }
        str = TextUtils.equals(str, CID_QTT) ? "qtt" : str;
        if (!TextUtils.isEmpty(str2) || context == null) {
            this.mPackageName = str2;
        } else {
            this.mPackageName = context.getPackageName();
        }
        this.mCid = str;
        this.mVerifySign = 1;
        this.res = getRes(getnSecure());
        this.sign = getSign();
        InnoSecureUtils.newInterfaceInited = true;
        InnoSecureUtils.sCid = str;
    }

    private void checkLib(Context context) {
        try {
            try {
                ReLinker.loadLibrary(context, "InnoSecure");
            } catch (Throwable unused) {
                System.loadLibrary("InnoSecure");
            }
        } catch (Throwable unused2) {
        }
    }

    private boolean checkParamsAvailable() {
        return this.res == null || (1 == this.mVerifySign && this.sign == null);
    }

    private static native byte[] decode(byte[] bArr, String str, byte[] bArr2, int i);

    private int getImageByName(String str) {
        try {
            return this.mContext.getResources().getIdentifier(str, k.c, this.mPackageName);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    private byte[] getRes(String str) {
        try {
            int resource1 = getResource1(str, this.mPackageName);
            if (resource1 == 0) {
                resource1 = getImageByName(str);
            }
            if (resource1 == 0) {
                return null;
            }
            InputStream openRawResource = this.mContext.getResources().openRawResource(resource1);
            byte[] bArr = new byte[openRawResource.available()];
            openRawResource.read(bArr);
            return bArr;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private int getResource1(String str, String str2) {
        try {
            Field field = Class.forName(str2 + ".R$drawable").getField(str);
            if (field == null) {
                return 0;
            }
            return field.getInt(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    private synchronized String getSign() {
        try {
        } catch (Throwable th) {
            Log.e(TAG, "出错1:   " + th.toString());
            return null;
        }
        return this.mContext.getPackageManager().getPackageInfo(this.mPackageName, 64).signatures[0].toCharsString();
    }

    private static native String getn();

    private String getnSecure() {
        try {
            return getn();
        } catch (Throwable unused) {
            return "555555555";
        }
    }

    private static native String getv(byte[] bArr);

    private static native byte[] secure(String str, String str2, String str3, byte[] bArr, String str4, int i);

    private static native byte[] secureData(byte[] bArr, int i, String str, String str2, byte[] bArr2, String str3, int i2);

    public String getCid() {
        return this.mCid;
    }

    public byte[] innoSecureDecodeV2(byte[] bArr) {
        if (bArr == null || bArr.length == 0 || checkParamsAvailable()) {
            return null;
        }
        if (this.res == null) {
            this.res = getRes(getnSecure());
        }
        if (this.sign == null) {
            this.sign = getSign();
        }
        try {
            return decode(bArr, this.sign, this.res, this.mVerifySign);
        } catch (Throwable unused) {
            return null;
        }
    }

    public byte[] innoSecureEncodeV2(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        UUID randomUUID = UUID.randomUUID();
        String uuid = (randomUUID == null || randomUUID.toString().length() != 36) ? "12345678-1234-1234-1234-123456789012" : randomUUID.toString();
        if (checkParamsAvailable()) {
            return null;
        }
        if (this.res == null) {
            this.res = getRes(getnSecure());
        }
        if (this.sign == null) {
            this.sign = getSign();
        }
        if (TextUtils.isEmpty(this.mCid)) {
            Log.e(TAG, "初始化未设置cid!!!!!");
        }
        try {
            return secure(str, uuid, this.sign, this.res, this.mCid, this.mVerifySign);
        } catch (Throwable unused) {
            return null;
        }
    }

    public byte[] innoSecureEncodeData(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        UUID randomUUID = UUID.randomUUID();
        String uuid = (randomUUID == null || randomUUID.toString().length() != 36) ? "12345678-1234-1234-1234-123456789012" : randomUUID.toString();
        if (checkParamsAvailable()) {
            return null;
        }
        if (this.res == null) {
            this.res = getRes(getnSecure());
        }
        if (this.sign == null) {
            this.sign = getSign();
        }
        if (TextUtils.isEmpty(this.mCid)) {
            Log.e(TAG, "初始化未设置cid!!!!!");
        }
        try {
            return secureData(bArr, bArr.length, uuid, this.sign, this.res, this.mCid, this.mVerifySign);
        } catch (Throwable unused) {
            return null;
        }
    }

    public InnoSecureMain(Context context, String str, String str2, String str3) {
        this.mCid = null;
        this.mVerifySign = 1;
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "请设置cid避免加密异常!!!!!");
        }
        str = TextUtils.equals(str, CID_QTT) ? "qtt" : str;
        this.mContext = context.getApplicationContext();
        checkLib(context);
        if (TextUtils.isEmpty(str3)) {
            this.mPackageName = context.getPackageName();
        } else {
            this.mPackageName = str3;
        }
        this.mCid = str;
        this.mVerifySign = 0;
        InnoSecureUtils.newInterfaceInited = true;
        byte[] decode = Base64.decode(str2 == null ? "" : str2, 2);
        byte[] bArr = new byte[decode.length];
        this.res = bArr;
        System.arraycopy(decode, 0, bArr, 0, decode.length);
    }
}
