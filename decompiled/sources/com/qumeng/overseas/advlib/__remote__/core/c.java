package com.qumeng.overseas.advlib.__remote__.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.m;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes17.dex */
public class c {
    @Deprecated
    public static Bitmap a(String str) {
        Bitmap bitmap = null;
        int i = 3;
        while (true) {
            int i2 = i - 1;
            if (i <= 0 || bitmap != null) {
                break;
            }
            try {
                bitmap = BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            i = i2;
        }
        return bitmap;
    }

    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        return m.a(new byte[4096], inputStream, outputStream);
    }
}
