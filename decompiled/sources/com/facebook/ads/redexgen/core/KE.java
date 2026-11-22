package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class KE extends AbstractC2033aB implements View.OnClickListener {
    public static byte[] A0D;
    public static String[] A0E = {"zJy5N3L509NIqOAGCBmq2SY7W4xK8HwT", "H2", "E", "vMyDxD7xbIgTd", "0bWjMiKAxESivC84rSJqWsF4vTTr4zpm", "NIsgbM1VoVKu1UXdUm6ipB03AExBFzGo", "hF", "2iAtRdiONhZPMieR3MSLVzPYox5YjbDW"};
    public static final int A0F;
    public int A00;
    public int A01;
    public Bitmap A02;
    public Paint A03;
    public Rect A04;
    public C2228dL A05;
    public C1925Wd A06;
    public KG A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public final a5 A0B;
    public final Map<String, String> A0C;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0D = new byte[]{-30, -21, -24, -30, -22, -34, -14, -18, -12, -15, -30, -28, -23, -27, -80, TransmissionUnpacked.HD_VAL_MAGIC_HB, -24, -10, -10, -24, -15, -22, -24, -11, BuiltinOptions.ArgMaxOptions, BuiltinOptions.DequantizeOptions, 24, BuiltinOptions.CastOptions, 22, 31, 28, 22, 30};
    }

    static {
        A04();
        A0F = (int) (AbstractC1931Wl.A02 * 24.0f);
    }

    public KE(C2228dL c2228dL, AbstractC2503hy abstractC2503hy, C1691My c1691My, US us, InterfaceC1959Xn interfaceC1959Xn, C2301eX c2301eX, XH xh, InterfaceC1941Wv interfaceC1941Wv) {
        this(c2228dL, abstractC2503hy.A0r(), c1691My, abstractC2503hy.A20().A0J().A06(), us, interfaceC1959Xn, c2301eX, xh, abstractC2503hy.A21(), interfaceC1941Wv);
        this.A0B.A08(abstractC2503hy);
    }

    public KE(C2228dL c2228dL, String str, C1691My c1691My, US us, InterfaceC1959Xn interfaceC1959Xn, C2301eX c2301eX, XH xh, N3 n3) {
        this(c2228dL, str, c1691My, false, us, interfaceC1959Xn, c2301eX, xh, n3);
    }

    public KE(C2228dL c2228dL, String str, C1691My c1691My, boolean z, US us, InterfaceC1959Xn interfaceC1959Xn, C2301eX c2301eX, XH xh, N3 n3) {
        super(c2228dL, c1691My);
        this.A0C = new HashMap();
        this.A05 = c2228dL;
        this.A0A = z;
        this.A0B = new a5(c2228dL, str, c2301eX, xh, us, n3, interfaceC1959Xn);
        setOnClickListener(this);
        XP.A0E(1001, this);
    }

    public KE(C2228dL c2228dL, String str, C1691My c1691My, boolean z, US us, InterfaceC1959Xn interfaceC1959Xn, C2301eX c2301eX, XH xh, N3 n3, InterfaceC1941Wv interfaceC1941Wv) {
        super(c2228dL, c1691My);
        this.A0C = new HashMap();
        this.A05 = c2228dL;
        this.A0A = z;
        this.A0B = new a5(c2228dL, str, c2301eX, xh, us, n3, interfaceC1959Xn, interfaceC1941Wv);
        setOnClickListener(this);
        XP.A0E(1001, this);
    }

    public static Bitmap A00(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private void A02() {
        if (this.A0A && this.A09 != null) {
            this.A02 = A00(XY.A03(this.A05, this.A09.contains(A01(12, 12, 10)) ? XX.MESSENGER : XX.WHATSAPP));
            this.A03 = new Paint();
            setPadding(A0F, 0, A0F, 0);
        }
    }

    private void A03() {
        if (this.A06 != null) {
            C1925Wd c1925Wd = this.A06;
            if (A0E[0].charAt(27) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[6] = "Jn";
            strArr[1] = "nM";
            c1925Wd.A06();
        }
        if (this.A07 != null) {
            this.A07.A04();
        }
    }

    public static boolean A05(AbstractC2503hy abstractC2503hy) {
        return ((long) abstractC2503hy.A1w()) > 0 && abstractC2503hy.A1u() >= 0;
    }

    public final ME A0E(String str) {
        if (TextUtils.isEmpty(this.A08) || TextUtils.isEmpty(this.A09)) {
            return ME.A09;
        }
        A03();
        this.A0C.put(A01(0, 12, 6), str);
        return this.A0B.A05(this.A08, this.A09, this.A0C);
    }

    public final boolean A0F(AbstractC2503hy abstractC2503hy, AbstractC1958Xm abstractC1958Xm) {
        if (this.A06 != null || !A05(abstractC2503hy) || abstractC2503hy.A24().A01() == null || abstractC2503hy.A24().A00() == null) {
            return false;
        }
        this.A07 = new KG(abstractC2503hy.A1u(), abstractC2503hy.A1w(), abstractC2503hy.A1v(), abstractC2503hy.A24().A01(), abstractC2503hy.A24().A00(), abstractC1958Xm, this);
        this.A06 = new C1925Wd(abstractC2503hy.A1w(), this.A07);
        this.A06.A07();
        return true;
    }

    public a5 getCtaActionHelper() {
        return this.A0B;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC1907Vl.A02(this)) {
            return;
        }
        try {
            A0E(A01(24, 9, 58));
        } catch (Throwable th) {
            AbstractC1907Vl.A00(th, this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A03();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A02 != null) {
            this.A04 = new Rect(0, 0, this.A02.getWidth(), this.A02.getHeight());
            this.A01 = this.A02.getWidth();
            this.A00 = 12;
            int shift = (this.A01 + this.A00) / 2;
            canvas.save();
            canvas.translate(shift, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            float width = (getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f);
            float textWidth = this.A01;
            float f = width - textWidth;
            float textWidth2 = this.A00;
            int i = (int) (f - textWidth2);
            int top2 = (getHeight() / 2) - (this.A01 / 2);
            int left = this.A01;
            Rect destRect = new Rect(i, top2, left + i, this.A01 + top2);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            A03();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z) {
            A03();
        }
    }

    public void setCreativeAsCtaLoggingHelper(C1927Wh c1927Wh) {
        this.A0B.A09(c1927Wh);
    }

    public void setCta(C1692Mz c1692Mz, String str, Map<String, String> extraData) {
        setCta(c1692Mz, str, extraData, null);
    }

    public void setCta(C1692Mz c1692Mz, String str, Map<String, String> extraData, InterfaceC1941Wv interfaceC1941Wv, InterfaceC2028a4 interfaceC2028a4) {
        setCta(c1692Mz, str, extraData, interfaceC2028a4);
        this.A0B.A0A(interfaceC1941Wv);
    }

    public void setCta(C1692Mz c1692Mz, String str, Map<String, String> extraData, InterfaceC2028a4 interfaceC2028a4) {
        this.A08 = str;
        this.A09 = c1692Mz.A05();
        this.A0C.putAll(extraData);
        this.A0B.A0B(interfaceC2028a4);
        String A04 = c1692Mz.A04();
        if (!TextUtils.isEmpty(A04)) {
            String buttonText = this.A09;
            if (!TextUtils.isEmpty(buttonText)) {
                setText(A04);
                A02();
                return;
            }
        }
        setVisibility(8);
    }

    public void setIsInAppBrowser(boolean z) {
        this.A0B.A0C(z);
    }
}
