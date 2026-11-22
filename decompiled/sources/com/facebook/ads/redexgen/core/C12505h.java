package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.5h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C12505h extends AbstractC1581Ir {
    public YM A00;
    public InterfaceC2117bX A01;
    public C2197cp A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public RelativeLayout A06;
    public FH A07;
    public final C2228dL A08;
    public final DX A09;
    public final DR A0A;
    public final DP A0B;
    public final DN A0C;
    public final DE A0D;
    public final String A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final C2066ai A0I;
    public static String[] A0J = {"MpRqvkZj1q70y", "JmeA7cKwz52Cf66UfzrPr0LMRH4SYAx7", "6sdDVsKAMYqDcEUPGSGZSzHS1QCr5tGd", "kTGZxaoWJV94XtNMqSwvdL", "Mc6tnSsqpweEwwZBrEzxWewdD5U0ZBnH", "pH8A6EuZ6tOwC2LEaYgoPeYfMAE", "hIXMP87egv28CzL5Z81pRvvAccgq29VA", "kjeLkimcHFb7T02SebLVQF"};
    public static final int A0L = (int) (AbstractC1931Wl.A02 * 0.0f);
    public static final int A0M = (int) (AbstractC1931Wl.A02 * 9.0f);
    public static final int A0K = (int) (AbstractC1931Wl.A02 * 9.0f);

    public C12505h(C2066ai c2066ai, boolean z, String str, FH fh) {
        super(c2066ai, z);
        this.A0G = new Path();
        this.A0H = new RectF();
        this.A0D = new DE() { // from class: com.facebook.ads.redexgen.X.5o
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1851Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DF df) {
                if (C12505h.this.getVideoView() != null) {
                    C12505h.this.A07.A0P().setVolume(C12505h.this.getVideoView().getVolume());
                }
            }
        };
        this.A09 = new DX() { // from class: com.facebook.ads.redexgen.X.5m
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1851Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C11943d c11943d) {
                C12505h.this.A01();
                Object tag = C12505h.this.getTag(-1593835536);
                if (tag != null) {
                    C12505h.this.A07.A0N().AFc(((Integer) tag).intValue());
                }
            }
        };
        this.A0B = new DP() { // from class: com.facebook.ads.redexgen.X.5l
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1851Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq) {
                C12505h.this.A00();
                C12505h.this.A07.A0O().AFo(C12505h.this);
            }
        };
        this.A0A = new DR() { // from class: com.facebook.ads.redexgen.X.5k
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1851Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Y c3y) {
                C12505h.this.A01();
                C12505h.this.A07.A0O().AFm(C12505h.this);
            }
        };
        this.A0C = new DN() { // from class: com.facebook.ads.redexgen.X.5i
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1851Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DO r3) {
                C12505h.this.A05 = true;
                C12505h.this.A02();
            }
        };
        this.A0I = c2066ai;
        this.A07 = fh;
        this.A0E = str;
        this.A08 = c2066ai.A06();
        setGravity(17);
        setPadding(A0L, 0, A0L, A0L);
        XP.A0K(this, 0);
        setUpView(this.A08);
        this.A0F = new Paint();
        this.A0F.setColor(-16777216);
        this.A0F.setStyle(Paint.Style.FILL);
        this.A0F.setAlpha(16);
        this.A0F.setAntiAlias(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        if (this.A0I.A0F() != null && this.A02 != null) {
            C1431Cw A0F = this.A0I.A0F();
            E1 simpleVideoView = this.A02.getSimpleVideoView();
            if (A0J[2].charAt(30) != 'G') {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[6] = "7Tm7E6hvxl2lrINlaGqN4b4kJs9I709m";
            strArr[1] = "njm7q4dCrj2NJr9FsCrNNlLowJdEGDJD";
            A0F.AAm(simpleVideoView);
            if (U7.A2E(getContext())) {
                this.A0I.A0F().A09(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (this.A0I.A0F() != null) {
            this.A0I.A0F().A06();
            if (this.A02 != null) {
                this.A0I.A0F().AJk(this.A02.getSimpleVideoView());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r3 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A02() {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.bX r0 = r4.A01
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r4.A1T()
            if (r0 == 0) goto L25
            boolean r3 = r4.A05
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C12505h.A0J
            r0 = 4
            r1 = r1[r0]
            r0 = 16
            char r1 = r1.charAt(r0)
            r0 = 83
            if (r1 == r0) goto L35
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C12505h.A0J
            java.lang.String r1 = "H2PvwmHOgvOi5klEuL8elNjNTBtJADxS"
            r0 = 4
            r2[r0] = r1
            if (r3 != 0) goto L2f
        L25:
            boolean r0 = r4.A1T()
            if (r0 != 0) goto L34
            boolean r0 = r4.A04
            if (r0 == 0) goto L34
        L2f:
            com.facebook.ads.redexgen.X.bX r0 = r4.A01
            r0.ACO()
        L34:
            return
        L35:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C12505h.A02():void");
    }

    private void A03(View view) {
        RelativeLayout.LayoutParams layoutParams;
        if (view == null || (layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.addRule(13, -1);
        view.setLayoutParams(layoutParams);
    }

    public static void A04(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        XP.A0I(view);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2062ae
    public final boolean A0C() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2062ae
    public final boolean A1M() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1581Ir
    public final void A1P() {
        if (A1T() && this.A02 != null) {
            C2197cp c2197cp = this.A02;
            if (A0J[4].charAt(16) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[0] = "PPsdw83Xwgr8n";
            strArr[5] = "5ciU0wOzbld7CiHKSmuHpDfStOE";
            c2197cp.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1581Ir
    public final void A1Q() {
        if (A1T()) {
            A1R();
            if (this.A02 != null) {
                this.A02.A05(EnumC2244db.A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1581Ir
    public final void A1R() {
        float volume = this.A07.A0P().getVolume();
        if (!A1T() || this.A02 == null) {
            return;
        }
        float newVolume = this.A02.getVolume();
        if (volume != newVolume) {
            this.A02.setVolume(volume);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1581Ir
    public final boolean A1S() {
        return A1T() && this.A02 != null && this.A02.A06();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1581Ir
    public final boolean A1T() {
        return this.A03;
    }

    public final void A1U(Map<String, String> extraParams) {
        if (this.A02 != null) {
            this.A02.A02();
            if (A1T()) {
                this.A02.A04(getAdEventManager(), this.A0E, extraParams);
            }
        }
    }

    public final C2197cp getVideoView() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2062ae, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A0G.reset();
        this.A0H.set(0.0f, 0.0f, getWidth(), getHeight());
        int i = 0;
        int radius = getResources().getConfiguration().orientation;
        boolean z = radius == 1;
        if (z) {
            i = A0K;
        }
        this.A0G.addRoundRect(this.A0H, i, i, Path.Direction.CW);
        canvas.drawPath(this.A0G, this.A0F);
        RectF rectF = this.A0H;
        int radius2 = A0L;
        float f = radius2;
        int width = getWidth();
        int radius3 = A0L;
        float f2 = width - radius3;
        int height = getHeight();
        int radius4 = A0L;
        rectF.set(f, 0.0f, f2, height - radius4);
        if (z) {
            i = A0M;
        }
        this.A0G.addRoundRect(this.A0H, i, i, Path.Direction.CW);
        canvas.clipPath(this.A0G);
        super.onDraw(canvas);
    }

    public void setCTAInfo(C1692Mz c1692Mz, Map<String, String> extraData) {
        getCtaButton().setCta(c1692Mz, this.A0E, extraData);
    }

    public void setImageUrl(String str) {
        if (this.A00 != null) {
            this.A00.setVisibility(0);
            new KZ(this.A00, this.A08).A04().A06(new K0(this)).A07(str);
        }
        if (this.A02 != null) {
            this.A02.setVisibility(8);
        }
    }

    public void setIsVideo(boolean z) {
        this.A03 = z;
    }

    public void setOnAssetsLoadedListener(InterfaceC2117bX interfaceC2117bX) {
        this.A01 = interfaceC2117bX;
    }

    public void setUpImageView(C2228dL c2228dL) {
        this.A00 = new YM(c2228dL);
        if (U7.A1I(c2228dL)) {
            AbstractC2016Zs.A00(this.A00, U7.A1J(c2228dL), new ViewOnClickListenerC2034aC(this));
        }
        A04(this.A00);
    }

    public void setUpMediaContainer(C2228dL c2228dL) {
        this.A06 = new RelativeLayout(c2228dL);
        A04(this.A06);
        if (this.A00 != null) {
            this.A06.addView(this.A00);
            A03(this.A00);
        }
        if (this.A02 != null) {
            this.A06.addView(this.A02);
            A03(this.A02);
        }
        addView(this.A06);
    }

    public void setUpVideoView(C2228dL c2228dL) {
        this.A02 = new C2197cp(c2228dL, new C1871Ua(this.A0E, getAdEventManager()));
        if (U7.A1K(c2228dL)) {
            AbstractC2016Zs.A00(this.A02, U7.A1L(c2228dL), new ViewOnClickListenerC2035aD(this));
        }
        C2197cp c2197cp = this.A02;
        if (A0J[2].charAt(30) != 'G') {
            throw new RuntimeException();
        }
        A0J[4] = "tNSgYVifT5FMSy2OwNBjuNxtKDkDnPPF";
        A04(c2197cp);
    }

    private void setUpView(C2228dL c2228dL) {
        setUpImageView(c2228dL);
        setUpVideoView(c2228dL);
        setUpMediaContainer(c2228dL);
    }

    public void setVideoPlaceholderUrl(String str) {
        if (this.A02 != null) {
            this.A02.setPlaceholderUrl(str);
        }
    }

    public void setVideoUrl(String str) {
        if (this.A00 != null) {
            this.A00.setVisibility(8);
        }
        C2197cp c2197cp = this.A02;
        String[] strArr = A0J;
        if (strArr[6].charAt(10) != strArr[1].charAt(10)) {
            throw new RuntimeException();
        }
        A0J[2] = "Key351avhXFGNIES0xzUdjVz8AR1nkGO";
        if (c2197cp != null) {
            this.A02.setVisibility(0);
            this.A02.setVideoURI(str);
            this.A02.A03(this.A0D);
            this.A02.A03(this.A09);
            this.A02.A03(this.A0B);
            this.A02.A03(this.A0A);
            this.A02.A03(this.A0C);
        }
    }
}
