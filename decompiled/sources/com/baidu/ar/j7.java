package com.baidu.ar;

import com.baidu.ar.recg.ImgRecognitionClient;
import com.baidu.ar.recg.RecognitionResult;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class j7 {
    public static j7 c;
    public boolean b = false;

    /* renamed from: a, reason: collision with root package name */
    public ImgRecognitionClient f7003a = new ImgRecognitionClient();

    public static synchronized j7 a() {
        j7 j7Var;
        synchronized (j7.class) {
            if (c == null) {
                c = new j7();
            }
            j7Var = c;
        }
        return j7Var;
    }

    public RecognitionResult a(ByteBuffer byteBuffer, int i, int i2) {
        String str;
        if (this.f7003a == null) {
            return null;
        }
        RecognitionResult recogniseImageByteBuffer = ImgRecognitionClient.recogniseImageByteBuffer(byteBuffer, i, i2);
        int i3 = recogniseImageByteBuffer.errCode;
        if (i3 != 1) {
            if (i3 == 0) {
                str = "model process fail!";
            }
            this.b = false;
            return recogniseImageByteBuffer;
        }
        str = "model process success! process score = " + recogniseImageByteBuffer.score + " process time = " + recogniseImageByteBuffer.time;
        h.a("AlgoRecg", str);
        this.b = false;
        return recogniseImageByteBuffer;
    }

    public boolean a(String[] strArr) {
        if (this.f7003a == null || strArr == null) {
            return false;
        }
        return ImgRecognitionClient.init(strArr);
    }

    public boolean b() {
        if (this.f7003a != null && !this.b) {
            this.b = ImgRecognitionClient.release();
        }
        this.f7003a = null;
        c = null;
        return this.b;
    }
}
