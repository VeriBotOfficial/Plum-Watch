package com.facebook.ads.redexgen.core;

import android.animation.AnimatorSet;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public class E1 extends RelativeLayout implements InterfaceC2299eV, InterfaceC2233dQ {
    public static byte[] A0F;
    public static String[] A0G = {"3L6CoO6YtrcW", "MjcsiBOYcGfrGyZBxeZgAjKXsDYhFJK", "NbVxNqWnj3", "Ob7MM92eIAC3XgmL", "XSQst8sM3v9Waw60ED5t21eOsn1IQUtw", "wvdS5a619fbySZdqvbmzcB7w", "WLvo7626w9dzVwCTBg7InBeeg1a7HKE3", "kYDrs41aRZaYTR0SA8npQuCfjZz7Tio6"};
    public static final DW A0H;
    public static final DQ A0I;
    public static final DO A0J;
    public static final DJ A0K;
    public static final DI A0L;
    public static final DF A0M;
    public static final DD A0N;
    public static final DC A0O;
    public float A00;
    public int A01;
    public C1871Ua A02;
    public C2241dY A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08;
    public final Handler A09;
    public final View.OnTouchListener A0A;
    public final C2228dL A0B;
    public final C1850Te<AbstractC1851Tf, C1849Td> A0C;
    public final List<InterfaceC2245dc> A0D;
    public final InterfaceC2296eS A0E;

    public static String A0G(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0G;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[6] = "HxnswxUpcuHv1wuLD4berTHtADZcXTin";
            strArr2[4] = "I3xDTi7RY5fAtwEllKfD6KKH3DCBcY9z";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 57);
            i4++;
        }
    }

    public static void A0J() {
        A0F = new byte[]{BuiltinOptions.WhileOptions, -80, -94, OtaCommandGenerator.CMD_OTA_INFO, BuiltinOptions.WhileOptions, -79, -84, -79, -98, -87, BuiltinOptions.WhileOptions, -76, -98, -79, OtaCommandGenerator.CMD_OTA_INFO, -91, BuiltinOptions.WhileOptions, -79, -90, -86, -94, BuiltinOptions.BitwiseXorOptions, ProtocolBytes.SOF, -84, -84, -97, -88, -82, -90, -77, BuiltinOptions.MatrixSetDiagOptions, -101, -82, BuiltinOptions.MatrixSetDiagOptions};
    }

    static {
        A0J();
        A0J = new DO();
        A0H = new DW();
        A0K = new DJ();
        A0L = new DI();
        A0I = new DQ();
        A0M = new DF();
        A0O = new DC();
        A0N = new DD();
    }

    public E1(C2228dL c2228dL) {
        super(c2228dL);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new C1850Te<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new ViewOnTouchListenerC2232dP(this);
        this.A0B = c2228dL;
        if (A0W(c2228dL)) {
            this.A0E = new CM(c2228dL);
        } else {
            this.A0E = new CJ(c2228dL);
        }
        A0H();
    }

    public E1(C2228dL c2228dL, AttributeSet attributeSet) {
        super(c2228dL, attributeSet);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new C1850Te<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new ViewOnTouchListenerC2232dP(this);
        this.A0B = c2228dL;
        if (A0W(c2228dL)) {
            this.A0E = new CM(c2228dL, attributeSet);
        } else {
            this.A0E = new CJ(c2228dL, attributeSet);
        }
        A0H();
    }

    public E1(C2228dL c2228dL, AttributeSet attributeSet, int i) {
        super(c2228dL, attributeSet, i);
        this.A0D = new ArrayList();
        this.A08 = new Handler();
        this.A09 = new Handler();
        this.A0C = new C1850Te<>();
        this.A06 = true;
        this.A01 = 200;
        this.A00 = 1.0f;
        this.A0A = new ViewOnTouchListenerC2232dP(this);
        this.A0B = c2228dL;
        if (A0W(c2228dL)) {
            this.A0E = new CM(c2228dL, attributeSet, i);
        } else {
            this.A0E = new CJ(c2228dL, attributeSet, i);
        }
        A0H();
    }

    private float A06(InterfaceC2296eS interfaceC2296eS) {
        int videoHeight = interfaceC2296eS.getVideoHeight();
        if (videoHeight == 0) {
            return 1.0f;
        }
        int height = interfaceC2296eS.getVideoWidth();
        return height / videoHeight;
    }

    public static /* synthetic */ DJ A0E() {
        DJ dj = A0K;
        if (A0G[7].charAt(27) == '4') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[5] = "Ykw7x5qbt5Y8x48JghoZKWeO";
        strArr[0] = "cKnPTPxPmv7r";
        return dj;
    }

    private void A0H() {
        this.A07 = U7.A0t(this.A0B);
        this.A0B.A0F().A3V();
        this.A0E.setRequestedVolume(1.0f);
        this.A0E.setVideoStateChangeListener(this);
        this.A03 = new C2241dY(this.A0B, this.A0E);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        XP.A0I(this.A03);
        addView(this.A03, layoutParams);
        setOnTouchListener(this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I() {
        this.A08.postDelayed(new EF(this), this.A01);
    }

    private final void A0K() {
        for (InterfaceC2245dc interfaceC2245dc : this.A0D) {
            boolean z = interfaceC2245dc instanceof AbstractC1435Da;
            String[] strArr = A0G;
            if (strArr[6].charAt(13) != strArr[4].charAt(13)) {
                throw new RuntimeException();
            }
            A0G[3] = "f6iKlyOeYddBSkQQnaXOCc7KzH8j";
            if (z) {
                A0R((AbstractC1435Da) interfaceC2245dc);
            }
            interfaceC2245dc.AAm(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(int i) {
        if (U7.A10(this.A0B)) {
            Toast.makeText(this.A0B, A0G(21, 13, 1) + (i / 1000.0f) + A0G(0, 21, 4), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(UZ uz) {
        if (this.A02 == null) {
            return;
        }
        this.A02.A04(uz, null);
    }

    private void A0Q(InterfaceC2245dc interfaceC2245dc) {
        if (interfaceC2245dc instanceof AbstractC1435Da) {
            A0S((AbstractC1435Da) interfaceC2245dc);
        }
        interfaceC2245dc.AJk(this);
    }

    private void A0R(AbstractC1435Da abstractC1435Da) {
        if (abstractC1435Da.getParent() == null) {
            if (abstractC1435Da instanceof C11802p) {
                this.A03.A02(abstractC1435Da);
            } else {
                addView(abstractC1435Da);
            }
        }
    }

    private void A0S(AbstractC1435Da abstractC1435Da) {
        if (abstractC1435Da instanceof C11802p) {
            this.A03.A03(abstractC1435Da);
        } else {
            XP.A0H(abstractC1435Da);
        }
    }

    public static boolean A0T(float f) {
        return f <= 0.7f;
    }

    public static boolean A0U(float f) {
        return f == 1.0f;
    }

    public static boolean A0V(float f) {
        return f >= 1.2f;
    }

    private boolean A0W(C2228dL c2228dL) {
        return U7.A2t(c2228dL, C2283eF.A03());
    }

    public final void A0Z() {
        this.A0E.setVideoStateChangeListener(null);
        this.A0E.destroy();
    }

    public final void A0a() {
        if (A0q()) {
            return;
        }
        this.A0E.A9V();
    }

    public final void A0b() {
        Iterator<InterfaceC2245dc> it = this.A0D.iterator();
        while (it.hasNext()) {
            A0Q(it.next());
        }
        this.A0D.clear();
    }

    public final void A0c(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A03.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.removeRule(10);
        layoutParams.removeRule(9);
        if (this.A00 == 1.0f) {
            this.A00 = A06(this.A0E);
        }
        if (i == 1) {
            layoutParams.addRule(10);
        } else if (A0V(this.A00)) {
            layoutParams.addRule(13);
        } else {
            layoutParams.addRule(9);
        }
        C2241dY c2241dY = this.A03;
        if (A0G[3].length() == 1) {
            throw new RuntimeException();
        }
        A0G[7] = "Fk13SNDKaQVX0dV87s1e6TAwbDOb9nQX";
        c2241dY.setLayoutParams(layoutParams);
    }

    public final void A0d(int i) {
        this.A08.removeCallbacksAndMessages(null);
        this.A0E.seekTo(i);
    }

    public final void A0e(int i) {
        this.A0E.AJU(i);
    }

    public final void A0f(AnimatorSet animatorSet, boolean z) {
        this.A03.A01(animatorSet, z);
    }

    public final void A0g(EnumC2236dT enumC2236dT) {
        E8 e8 = new E8(this);
        if (this.A07) {
            XJ.A00(e8);
        } else {
            this.A09.post(e8);
        }
        this.A0E.AJH(enumC2236dT.A03());
    }

    public final void A0h(EnumC2244db enumC2244db, int i) {
        if (this.A04 && this.A0E.getState() == EnumC2298eU.A06) {
            this.A04 = false;
        }
        this.A0E.AJM(enumC2244db, i);
        if (A0G[7].charAt(27) == '4') {
            throw new RuntimeException();
        }
        A0G[3] = "hMpnI8E";
    }

    public final void A0i(InterfaceC2245dc interfaceC2245dc) {
        this.A0D.add(interfaceC2245dc);
    }

    public final void A0j(InterfaceC2245dc interfaceC2245dc) {
        this.A0D.remove(interfaceC2245dc);
        A0Q(interfaceC2245dc);
    }

    public final void A0k(boolean z) {
        A0l(z, 0);
    }

    public final void A0l(boolean z, int i) {
        if (A0q()) {
            return;
        }
        this.A0E.AG7(z, i);
    }

    public final void A0m(boolean z, boolean z2, int i) {
        this.A06 = z2;
        A0l(z, i);
    }

    public final boolean A0n() {
        return this.A0E.A9i();
    }

    public final boolean A0o() {
        return this.A0E.A9j();
    }

    public final boolean A0p() {
        return getVolume() == 0.0f;
    }

    public final boolean A0q() {
        return getState() == EnumC2298eU.A05;
    }

    public final boolean A0r() {
        return A0q() && this.A0E.AAT();
    }

    public final boolean A0s() {
        return getState() == EnumC2298eU.A0A;
    }

    public final boolean A0t() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2233dQ
    public final boolean AAH() {
        return A0W(this.A0B);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2233dQ
    public final boolean AAM() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2299eV
    public final void ADK(final long j, final long j2, final long j3, final float f) {
        if (!U7.A1v(this.A0B)) {
            return;
        }
        this.A0C.A02(new DZ(j, j2, j3, f) { // from class: com.facebook.ads.redexgen.X.3Z
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2299eV
    public final void AE9() {
        A0l(true, 4);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2299eV
    public final void AEA() {
        A0h(EnumC2244db.A04, 6);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2299eV
    public final void AF9(int i, int i2) {
        EB eb = new EB(this, i, i2);
        if (this.A07) {
            XJ.A00(eb);
        } else {
            this.A09.post(eb);
        }
        A0I();
        if (A0G[3].length() == 1) {
            throw new RuntimeException();
        }
        A0G[7] = "9p5A7Zams3NJ3CBp1FBA5yfXzv5AdeGa";
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2299eV
    public final void AFt(EnumC2298eU enumC2298eU) {
        int currentPositionInMillis = getCurrentPositionInMillis();
        int currentPositionMS = getDuration();
        ED ed = new ED(this, enumC2298eU, currentPositionInMillis, currentPositionMS);
        if (this.A07) {
            XJ.A00(ed);
        } else {
            this.A09.post(ed);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2233dQ
    public int getCurrentPositionInMillis() {
        return this.A0E.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0E.getDuration();
    }

    public C1850Te<AbstractC1851Tf, C1849Td> getEventBus() {
        return this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2233dQ
    public long getInitialBufferTime() {
        return this.A0E.getInitialBufferTime();
    }

    public List<InterfaceC2245dc> getPlugins() {
        return this.A0D;
    }

    public EnumC2298eU getState() {
        return this.A0E.getState();
    }

    public Handler getStateHandler() {
        return this.A09;
    }

    public TextureView getTextureView() {
        return (TextureView) this.A0E;
    }

    public int getVideoHeight() {
        return this.A0E.getVideoHeight();
    }

    public View getVideoImplView() {
        return this.A0E.getView();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2233dQ
    public EnumC2244db getVideoStartReason() {
        return this.A0E.getStartReason();
    }

    public View getVideoView() {
        return this.A03;
    }

    public int getVideoWidth() {
        return this.A0E.getVideoWidth();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2233dQ
    public float getVolume() {
        return this.A0E.getVolume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.A0C.A02(A0N);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.A0C.A02(A0O);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        if (this.A0E != null) {
            this.A0E.setControlsAnchorView(view);
        }
    }

    public void setFunnelLoggingHandler(C1871Ua c1871Ua) {
        this.A02 = c1871Ua;
    }

    public void setIsFullScreen(boolean z) {
        this.A05 = z;
        this.A0E.setFullScreen(z);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setRoundedCornerVideoView(float f) {
        this.A03.setRoundedCornersVideoStyle(f);
    }

    public void setVideoMPD(String str) {
        this.A0E.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i) {
        this.A01 = i;
    }

    public void setVideoURI(Uri uri) {
        if (uri == null) {
            A0b();
        } else {
            A0K();
            if (A0G[2].length() != 10) {
                throw new RuntimeException();
            }
            A0G[2] = "2vtziZXFfU";
            this.A0E.setup(uri);
        }
        this.A04 = false;
    }

    public void setVideoURI(String str) {
        this.A0B.A0F().A3c(str);
        setVideoURI(str != null ? WQ.A00(str) : null);
    }

    public void setVolume(float f) {
        if (f == 1.0f) {
            A0M(UZ.A0n);
            this.A0B.A0F().A3g();
        } else {
            A0M(UZ.A0m);
            this.A0B.A0F().A3f();
        }
        this.A0E.setRequestedVolume(f);
        getEventBus().A02(A0M);
    }
}
