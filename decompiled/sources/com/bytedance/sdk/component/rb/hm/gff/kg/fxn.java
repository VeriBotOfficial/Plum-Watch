package com.bytedance.sdk.component.rb.hm.gff.kg;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.sdk.component.rb.hm.gff.bh;
import com.bytedance.sdk.component.utils.dx;
import com.bytedance.sdk.component.utils.sg;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes13.dex */
public class fxn {

    /* renamed from: com.bytedance.sdk.component.rb.hm.gff.kg.fxn$fxn, reason: collision with other inner class name */
    public interface InterfaceC0484fxn {
        void fxn();

        void fxn(Drawable drawable);

        void fxn(byte[] bArr);
    }

    public void fxn(byte[] bArr, bh bhVar, InterfaceC0484fxn interfaceC0484fxn) {
        if (Build.VERSION.SDK_INT <= 30) {
            fxn(bArr, interfaceC0484fxn, bhVar);
        } else {
            fxn(bArr, interfaceC0484fxn);
        }
    }

    public void fxn(byte[] bArr, InterfaceC0484fxn interfaceC0484fxn) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT < 28) {
            if (interfaceC0484fxn != null) {
                interfaceC0484fxn.fxn(bArr);
                return;
            }
            return;
        }
        try {
            Drawable decodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(wrap));
            if (interfaceC0484fxn != null) {
                interfaceC0484fxn.fxn(decodeDrawable);
            }
        } catch (Throwable th) {
            dx.gff("PAGGifDefaultDecoder", th.getMessage());
            if (interfaceC0484fxn != null) {
                interfaceC0484fxn.fxn();
            }
        }
    }

    private void fxn(final byte[] bArr, final InterfaceC0484fxn interfaceC0484fxn, final bh bhVar) {
        try {
            bhVar.tw().submit(new Runnable() { // from class: com.bytedance.sdk.component.rb.hm.gff.kg.fxn.1
                @Override // java.lang.Runnable
                public void run() {
                    fxn.this.kg(bArr, bhVar, interfaceC0484fxn);
                }
            });
        } catch (Throwable th) {
            dx.gff("PAGGifDefaultDecoder", th.getMessage());
            if (interfaceC0484fxn != null) {
                interfaceC0484fxn.fxn();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kg(byte[] bArr, bh bhVar, InterfaceC0484fxn interfaceC0484fxn) {
        File fxn;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            boolean sg2 = bhVar.sg();
            fxn = sg.fxn(bhVar.fxn(), sg2, sg2 ? "P_GIF_MUTIL_CACHE/" : "/P_GIF_CACHE/", "P_U_GIF_FILE");
            fileOutputStream = new FileOutputStream(fxn);
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr, 0, bArr.length);
            if (Build.VERSION.SDK_INT >= 28) {
                Drawable decodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fxn));
                if (interfaceC0484fxn != null) {
                    interfaceC0484fxn.fxn(decodeDrawable);
                }
            } else if (interfaceC0484fxn != null) {
                interfaceC0484fxn.fxn(bArr);
            }
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            try {
                dx.fxn("PAGGifDefaultDecoder", "Gif  getSourceByFile fail : ", th);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable unused2) {
                    }
                }
                if (interfaceC0484fxn != null) {
                    interfaceC0484fxn.fxn();
                }
            } catch (Throwable th3) {
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable unused3) {
                    }
                }
                throw th3;
            }
        }
    }
}
