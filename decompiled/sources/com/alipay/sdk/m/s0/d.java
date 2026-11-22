package com.alipay.sdk.m.s0;

import android.content.Context;
import android.text.TextUtils;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes11.dex */
public class d {
    public static d j;

    /* renamed from: a, reason: collision with root package name */
    public Context f1455a;
    public e c;
    public String d;
    public String e;
    public com.alipay.sdk.m.r0.a f;
    public com.alipay.sdk.m.r0.a g;
    public static final Object i = new Object();
    public static final String k = ".UTSystemConfig" + File.separator + "Global";
    public String b = null;
    public Pattern h = Pattern.compile("[^0-9a-zA-Z=/+]+");

    public d(Context context) {
        this.f1455a = null;
        this.c = null;
        this.d = "xx_utdid_key";
        this.e = "xx_utdid_domain";
        this.f = null;
        this.g = null;
        this.f1455a = context;
        this.g = new com.alipay.sdk.m.r0.a(context, k, "Alvin2", false, true);
        this.f = new com.alipay.sdk.m.r0.a(context, ".DataStorage", "ContextData", false, true);
        this.c = new e();
        this.d = String.format("K_%d", Integer.valueOf(com.alipay.sdk.m.q0.f.a(this.d)));
        this.e = String.format("D_%d", Integer.valueOf(com.alipay.sdk.m.q0.f.a(this.e)));
    }

    public final void a() {
        boolean z;
        com.alipay.sdk.m.r0.a aVar = this.g;
        if (aVar != null) {
            if (com.alipay.sdk.m.q0.f.b(aVar.a("UTDID2"))) {
                String a2 = this.g.a("UTDID");
                if (!com.alipay.sdk.m.q0.f.b(a2)) {
                    b(a2);
                }
            }
            boolean z2 = true;
            if (com.alipay.sdk.m.q0.f.b(this.g.a("DID"))) {
                z = false;
            } else {
                this.g.b("DID");
                z = true;
            }
            if (!com.alipay.sdk.m.q0.f.b(this.g.a("EI"))) {
                this.g.b("EI");
                z = true;
            }
            if (com.alipay.sdk.m.q0.f.b(this.g.a("SI"))) {
                z2 = z;
            } else {
                this.g.b("SI");
            }
            if (z2) {
                this.g.b();
            }
        }
    }

    public final void b(String str) {
        com.alipay.sdk.m.r0.a aVar;
        if (a(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() != 24 || (aVar = this.g) == null) {
                return;
            }
            aVar.a("UTDID2", str);
            this.g.b();
        }
    }

    public final void c(String str) {
        com.alipay.sdk.m.r0.a aVar;
        if (str == null || (aVar = this.f) == null || str.equals(aVar.a(this.d))) {
            return;
        }
        this.f.a(this.d, str);
        this.f.b();
    }

    public synchronized String d() {
        String f = f();
        this.b = f;
        if (!TextUtils.isEmpty(f)) {
            return this.b;
        }
        try {
            byte[] b = b();
            if (b != null) {
                String c = com.alipay.sdk.m.q0.b.c(b, 2);
                this.b = c;
                b(c);
                String a2 = this.c.a(b);
                if (a2 != null) {
                    c(a2);
                }
                return this.b;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public synchronized String e() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        return d();
    }

    public synchronized String f() {
        String c = c();
        if (a(c)) {
            c(this.c.a(c));
            this.b = c;
            return c;
        }
        String a2 = this.f.a(this.d);
        if (!com.alipay.sdk.m.q0.f.b(a2)) {
            String a3 = new f().a(a2);
            if (!a(a3)) {
                a3 = this.c.b(a2);
            }
            if (a(a3) && !com.alipay.sdk.m.q0.f.b(a3)) {
                this.b = a3;
                b(a3);
                return this.b;
            }
        }
        return null;
    }

    public final String c() {
        com.alipay.sdk.m.r0.a aVar = this.g;
        if (aVar == null) {
            return null;
        }
        String a2 = aVar.a("UTDID2");
        if (com.alipay.sdk.m.q0.f.b(a2) || this.c.a(a2) == null) {
            return null;
        }
        return a2;
    }

    public final byte[] b() throws Exception {
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int nextInt = new Random().nextInt();
        byte[] a2 = com.alipay.sdk.m.q0.c.a(currentTimeMillis);
        byte[] a3 = com.alipay.sdk.m.q0.c.a(nextInt);
        byteArrayOutputStream.write(a2, 0, 4);
        byteArrayOutputStream.write(a3, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            str = com.alipay.sdk.m.q0.d.a(this.f1455a);
        } catch (Exception unused) {
            str = "" + new Random().nextInt();
        }
        byteArrayOutputStream.write(com.alipay.sdk.m.q0.c.a(com.alipay.sdk.m.q0.f.a(str)), 0, 4);
        byteArrayOutputStream.write(com.alipay.sdk.m.q0.c.a(com.alipay.sdk.m.q0.f.a(a(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    public static d a(Context context) {
        if (context != null && j == null) {
            synchronized (i) {
                if (j == null) {
                    d dVar = new d(context);
                    j = dVar;
                    dVar.a();
                }
            }
        }
        return j;
    }

    public final boolean a(String str) {
        if (str != null) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 == str.length() && !this.h.matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    public static String a(byte[] bArr) throws Exception {
        byte[] bArr2 = {BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.RandomOptions, BuiltinOptions.GeluOptions, -33, BuiltinOptions.BitwiseXorOptions, -54, -31, BuiltinOptions.RankOptions, -11, 11, -78, OtaCommandGenerator.CMD_OTA_INFO, -17, -99, 64, 23, -95, -126, -82, -64, BuiltinOptions.AssignVariableOptions, BuiltinOptions.GeluOptions, TransmissionUnpacked.HD_VAL_MAGIC_HB, -103, BuiltinOptions.TransposeConvOptions, -30, 9, -39, BuiltinOptions.ExpOptions, -80, PSSSigner.TRAILER_IMPLICIT, -78, -117, BuiltinOptions.EqualOptions, 30, -122, 64, -104, BuiltinOptions.ResizeNearestNeighborOptions, -49, BuiltinOptions.Conv3DOptions, BuiltinOptions.WhereOptions, -38, -93};
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(com.alipay.sdk.m.q0.e.a(bArr2), mac.getAlgorithm()));
        return com.alipay.sdk.m.q0.b.c(mac.doFinal(bArr), 2);
    }
}
