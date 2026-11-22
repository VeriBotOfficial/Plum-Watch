package com.baidu.location.b;

import android.util.Base64;
import com.baidu.location.Jni;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes13.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private boolean f7565a;
    private String[] b;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static n f7566a = new n();
    }

    private n() {
        this.f7565a = false;
        this.b = null;
        try {
            String str = Jni.getldkaiv();
            if (str == null || !str.contains("|")) {
                return;
            }
            String[] split = str.split("\\|");
            this.b = split;
            if (split == null || split.length != 2) {
                return;
            }
            this.f7565a = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static n a() {
        return a.f7566a;
    }

    public synchronized String a(String str) {
        if (this.f7565a) {
            try {
                IvParameterSpec ivParameterSpec = new IvParameterSpec(this.b[1].getBytes("UTF-8"));
                SecretKeySpec secretKeySpec = new SecretKeySpec(this.b[0].getBytes("UTF-8"), "AES");
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                cipher.init(1, secretKeySpec, ivParameterSpec);
                return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public synchronized String b(String str) {
        if (!this.f7565a) {
            return null;
        }
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(this.b[1].getBytes("UTF-8"));
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.b[0].getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(str, 0)), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean b() {
        return this.f7565a;
    }
}
