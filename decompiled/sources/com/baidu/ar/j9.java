package com.baidu.ar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.camera.core.RetryPolicy;
import androidx.core.internal.view.SupportMenu;
import androidx.exifinterface.media.ExifInterface;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.ar.bean.NavigationNpc;
import com.baidu.ar.marker.model.TranslationPrior;
import com.baidu.ar.util.UiThreadUtil;
import com.baidu.bikenavi.R;
import com.umeng.analytics.pro.ak;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes12.dex */
public class j9 implements SensorEventListener, x4 {
    public static j9 Y;
    public int C;
    public Button D;
    public Button E;
    public Button F;
    public Button G;
    public Button H;
    public TextView K;
    public boolean L;
    public boolean M;
    public boolean N;
    public Handler P;
    public String Q;
    public boolean R;
    public ImageView S;
    public ImageView T;

    /* renamed from: a, reason: collision with root package name */
    public Context f7007a;
    public ViewGroup b;
    public SensorManager c;
    public boolean d;
    public Handler e;
    public View.OnClickListener h;
    public View.OnClickListener i;
    public RelativeLayout k;
    public RelativeLayout l;
    public RelativeLayout m;
    public RelativeLayout n;
    public RelativeLayout o;
    public boolean p;
    public float r;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public TextView y;
    public ScrollView z;
    public RelativeLayout f = null;
    public RelativeLayout g = null;
    public long j = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f7008q = System.currentTimeMillis();
    public float s = 50.0f;
    public TextView x = null;
    public StringBuffer A = new StringBuffer();
    public long B = System.currentTimeMillis();
    public ValueAnimator I = null;
    public ValueAnimator J = null;
    public int O = -1;
    public final float[] U = new float[3];
    public final float[] V = new float[9];
    public String[] W = {" . ", " . . ", " . . ."};
    public boolean X = false;

    public class a extends Handler {

        /* renamed from: com.baidu.ar.j9$a$a, reason: collision with other inner class name */
        public class RunnableC0330a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Message f7010a;

            public RunnableC0330a(Message message) {
                this.f7010a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                j9 j9Var;
                boolean z;
                Message message = this.f7010a;
                if (message == null || message.what != 1001 || j9.this.S == null) {
                    return;
                }
                j9.this.i();
                if (j9.this.R) {
                    ValueAnimator valueAnimator = j9.this.I;
                    j9 j9Var2 = j9.this;
                    valueAnimator.addUpdateListener(new a0(j9Var2, j9Var2.T));
                    j9.this.I.start();
                    ValueAnimator valueAnimator2 = j9.this.J;
                    j9 j9Var3 = j9.this;
                    valueAnimator2.addUpdateListener(new a0(j9Var3, j9Var3.S));
                    j9.this.J.start();
                    j9Var = j9.this;
                    z = false;
                } else {
                    ValueAnimator valueAnimator3 = j9.this.I;
                    j9 j9Var4 = j9.this;
                    valueAnimator3.addUpdateListener(new a0(j9Var4, j9Var4.S));
                    j9.this.I.start();
                    ValueAnimator valueAnimator4 = j9.this.J;
                    j9 j9Var5 = j9.this;
                    valueAnimator4.addUpdateListener(new a0(j9Var5, j9Var5.T));
                    j9.this.J.start();
                    j9Var = j9.this;
                    z = true;
                }
                j9Var.R = z;
            }
        }

        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            UiThreadUtil.runOnUiThread(new RunnableC0330a(message));
            super.handleMessage(message);
        }
    }

    public class a0 implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public View f7011a;

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ValueAnimator f7012a;

            public a(ValueAnimator valueAnimator) {
                this.f7012a = valueAnimator;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a0.this.f7011a != null) {
                    a0.this.f7011a.setAlpha(((Float) this.f7012a.getAnimatedValue()).floatValue());
                }
            }
        }

        public a0(j9 j9Var, View view) {
            this.f7011a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            UiThreadUtil.runOnUiThread(new a(valueAnimator));
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j9.this.y != null) {
                j9.this.y.setText("AREngine Pause");
                j9.this.y.setTextColor(SupportMenu.CATEGORY_MASK);
            }
        }
    }

    public static class b0 extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public x4 f7014a;

        public b0(Looper looper, x4 x4Var) {
            super(looper);
            this.f7014a = x4Var;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            this.f7014a.a(message);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7015a;

        public c(int i) {
            this.f7015a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f7015a;
            if (i == 0) {
                j9.this.e();
            } else if (i == 1) {
                j9.this.a(false);
            } else {
                if (i != 9) {
                    return;
                }
                j9.this.d();
            }
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7016a;

        public d(String str) {
            this.f7016a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            j9.this.x.setText(this.f7016a);
            j9.this.z.fullScroll(130);
        }
    }

    public class e implements Animation.AnimationListener {
        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (j9.this.k == null || j9.this.e == null) {
                return;
            }
            Message message = new Message();
            message.what = 1002;
            message.obj = j9.this.k;
            j9.this.e.sendMessageDelayed(message, 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (j9.this.i != null) {
                j9.this.i.onClick(view);
            }
            j9.this.v = false;
            if (j9.this.f != null) {
                j9.this.f.setVisibility(8);
            }
            if (j9.this.k != null) {
                j9.this.k.setVisibility(8);
            }
            if (j9.this.n != null) {
                j9.this.n.setVisibility(8);
            }
            if (j9.this.l != null) {
                j9.this.l.setVisibility(8);
            }
            if (j9.this.o != null) {
                j9.this.o.setVisibility(8);
            }
            if (j9.this.m != null) {
                j9.this.m.setVisibility(8);
            }
            j9.this.p = false;
            j9.this.j = 0L;
            j9.this.D();
            j9.this.A.append("点击网络异常的重试\n");
            j9 j9Var = j9.this;
            j9Var.b(j9Var.A.toString());
        }
    }

    public class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f7019a;
        public final /* synthetic */ String b;

        public g(TextView textView, String str) {
            this.f7019a = textView;
            this.b = str;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f7019a.setText(this.b + j9.this.W[((Integer) valueAnimator.getAnimatedValue()).intValue() % j9.this.W.length]);
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (j9.this.h != null) {
                j9.this.h.onClick(view);
            }
            j9.this.v = false;
            if (j9.this.f != null) {
                j9.this.f.setVisibility(8);
            }
            if (j9.this.k != null) {
                j9.this.k.setVisibility(8);
            }
            if (j9.this.n != null) {
                j9.this.n.setVisibility(8);
            }
            if (j9.this.l != null) {
                j9.this.l.setVisibility(8);
            }
            if (j9.this.o != null) {
                j9.this.o.setVisibility(8);
            }
            j9.this.p = false;
            j9.this.j = 0L;
            j9.this.D();
            j9.this.A.append("点击了重试\n");
            j9 j9Var = j9.this;
            j9Var.b(j9Var.A.toString());
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j9.this.E != null) {
                j9.this.E.setBackground(j9.this.E.getContext().getDrawable(R.drawable.bdar_round_button_red));
            }
            if (j9.this.F != null) {
                j9.this.F.setBackground(j9.this.F.getContext().getDrawable(R.drawable.bdar_round_button_red));
            }
            if (j9.this.G != null) {
                j9.this.G.setBackground(j9.this.G.getContext().getDrawable(R.drawable.bdar_round_button_red));
            }
            if (j9.this.H != null) {
                j9.this.H.setBackground(j9.this.H.getContext().getDrawable(R.drawable.bdar_round_button_red));
            }
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j9.this.v = true;
            j9.this.f();
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j9.this.f != null) {
                j9.this.f.setVisibility(8);
            }
            if (j9.this.k != null) {
                j9.this.k.setVisibility(8);
            }
            if (j9.this.n != null) {
                j9.this.n.setVisibility(8);
            }
            if (j9.this.l != null) {
                j9.this.l.setVisibility(8);
            }
            if (j9.this.m != null) {
                j9.this.m.setVisibility(8);
            }
            if (j9.this.o != null) {
                j9.this.o.setVisibility(8);
            }
            j9.this.p = false;
            j9.this.j = 0L;
            j9.this.D();
            j9.this.O = 1;
        }
    }

    public class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f7024a;

        public l(boolean z) {
            this.f7024a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            j9.this.k();
            if (this.f7024a) {
                j9.this.O = 0;
            }
            j9.this.v = false;
            j9.this.j = 0L;
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j9.this.v = false;
            j9.this.k();
            j9.this.p = false;
            j9.this.j = 0L;
            if (j9.this.O == 0) {
                return;
            }
            j9.this.A.append("resetUI:resetUIControllerState \n");
            j9 j9Var = j9.this;
            j9Var.b(j9Var.A.toString());
            j9.this.D();
        }
    }

    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j9.this.h();
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j9.this.c();
        }
    }

    public class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7028a;

        public p(int i) {
            this.f7028a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            if (j9.this.X && ((i = this.f7028a) == -86 || i == -1)) {
                j9.this.X = false;
                j9.this.u();
            }
            if (this.f7028a == 0) {
                j9.this.X = true;
            }
        }
    }

    public class q implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f7029a;

        public q(boolean z) {
            this.f7029a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            Button button;
            Resources resources;
            int i;
            if (j9.this.H != null) {
                if (this.f7029a) {
                    button = j9.this.H;
                    resources = j9.this.H.getResources();
                    i = R.drawable.bdar_round_button_greed;
                } else {
                    button = j9.this.H;
                    resources = j9.this.H.getResources();
                    i = R.drawable.bdar_round_button_red;
                }
                button.setBackground(resources.getDrawable(i));
            }
        }
    }

    public class r implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7030a;
        public final /* synthetic */ float b;

        public r(int i, float f) {
            this.f7030a = i;
            this.b = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j9.this.K != null) {
                j9.this.K.setVisibility(0);
                j9.this.K.setText("stepCount:" + this.f7030a + "\r\n stepLength:" + this.b + "\r\n VpasLocCount:" + j9.this.C);
                j9.this.K.setTextColor(-16711936);
            }
        }
    }

    public class s implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f7031a;

        public s(float f) {
            this.f7031a = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j9.this.K != null) {
                j9.this.K.setVisibility(0);
                j9.this.K.setText(String.valueOf(this.f7031a));
            }
        }
    }

    public class t implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f7032a;
        public final /* synthetic */ NavigationNpc b;

        public t(boolean z, NavigationNpc navigationNpc) {
            this.f7032a = z;
            this.b = navigationNpc;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j9.this.b != null) {
                if (!this.f7032a || this.b == null) {
                    j9.this.A();
                    return;
                }
                j9.this.b.findViewById(R.id.bdar_npc_view_group).setVisibility(0);
                if (this.b != null) {
                    j9 j9Var = j9.this;
                    j9Var.S = (ImageView) j9Var.b.findViewById(R.id.bdar_iv_npc_icon);
                    j9 j9Var2 = j9.this;
                    j9Var2.T = (ImageView) j9Var2.b.findViewById(R.id.bdar_iv_npc_dir);
                    TextView textView = (TextView) j9.this.b.findViewById(R.id.bdar_npc_content);
                    ((RelativeLayout) j9.this.b.findViewById(R.id.bdar_npc_bg)).setBackground(new BitmapDrawable(BitmapFactory.decodeFile(this.b.getBGPath())));
                    j9.this.T.setImageBitmap(BitmapFactory.decodeFile(this.b.getDirPath()));
                    j9.this.S.setImageBitmap(BitmapFactory.decodeFile(this.b.getIconPath()));
                    if (TextUtils.isEmpty(j9.this.Q) || (!j9.this.Q.equals(this.b.getDirPath()) && j9.this.P != null)) {
                        j9.this.Q = this.b.getDirPath();
                        j9.this.P.removeMessages(1001);
                        j9.this.P.removeCallbacksAndMessages(null);
                        Message message = new Message();
                        message.what = 1001;
                        j9.this.P.sendMessageDelayed(message, Const.L_SAME_TOAST);
                    }
                    String titleTxt = this.b.getTitleTxt();
                    int indexOf = titleTxt.indexOf("[");
                    int indexOf2 = titleTxt.indexOf("]") - 1;
                    if (indexOf < 0 || indexOf2 < 0) {
                        textView.setText(titleTxt);
                        return;
                    }
                    SpannableString spannableString = new SpannableString(titleTxt.replace("[", "").replace("]", ""));
                    spannableString.setSpan(new AbsoluteSizeSpan(55), indexOf, indexOf2, 33);
                    spannableString.setSpan(new ud(55), indexOf, indexOf2, 33);
                    spannableString.setSpan(new StyleSpan(0), indexOf, indexOf2, 33);
                    textView.setText(spannableString);
                }
            }
        }
    }

    public class u extends AnimatorListenerAdapter {
        public u() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Message message = new Message();
            message.what = 1001;
            j9.this.P.sendMessageDelayed(message, Const.L_SAME_TOAST);
        }
    }

    public class v implements Runnable {
        public v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j9.this.F != null) {
                j9.this.F.setBackground(j9.this.F.getResources().getDrawable(R.drawable.bdar_round_button_greed));
                j9.this.F.setTextColor(-16777216);
                j9.this.F.setText(TokenNames.R);
            }
        }
    }

    public class w implements Runnable {
        public w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j9.this.f != null) {
                j9.this.f.setVisibility(8);
            }
            if (j9.this.k != null) {
                j9.this.k.setVisibility(8);
            }
            if (j9.this.n != null) {
                j9.this.n.setVisibility(8);
            }
            if (j9.this.l != null) {
                j9.this.l.setVisibility(8);
            }
            if (j9.this.o != null) {
                j9.this.o.setVisibility(8);
            }
            j9.this.e.removeCallbacksAndMessages(null);
            j9.this.A.append("渲染路线 \n");
            j9 j9Var = j9.this;
            j9Var.b(j9Var.A.toString());
            if (j9.this.F != null) {
                j9.this.F.setBackground(j9.this.F.getResources().getDrawable(R.drawable.bdar_round_button_greed));
                j9.this.F.setTextColor(-16777216);
                j9.this.F.setText(TokenNames.R);
            }
        }
    }

    public class x implements Runnable {
        public x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j9.this.e.removeMessages(1002);
            j9.this.v = false;
            j9 j9Var = j9.this;
            j9Var.a(j9Var.w, true);
            j9.this.w = false;
        }
    }

    public class y implements Runnable {
        public y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j9.this.G != null) {
                j9.this.G.setBackground(j9.this.G.getResources().getDrawable(R.drawable.bdar_round_button_greed));
                j9.this.G.setTextColor(-16777216);
                j9.this.G.setText(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
            }
        }
    }

    public class z implements Runnable {
        public z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j9.this.y != null) {
                j9.this.y.setText("AREngine Tracking");
                j9.this.y.setTextColor(-16711936);
            }
        }
    }

    public j9(Context context, ViewGroup viewGroup, boolean z2) {
        this.f7007a = context;
        this.b = viewGroup;
        if (z2) {
            return;
        }
        this.e = new b0(context.getMainLooper(), this);
    }

    public static j9 a(Context context, ViewGroup viewGroup, boolean z2) {
        if (Y == null) {
            Y = new j9(context, viewGroup, z2);
        }
        return Y;
    }

    public final void A() {
        ViewGroup viewGroup = this.b;
        if (viewGroup == null || this.P == null) {
            return;
        }
        viewGroup.findViewById(R.id.bdar_npc_view_group).setVisibility(8);
        this.P.removeMessages(1001);
        this.P.removeCallbacksAndMessages(null);
        this.Q = null;
    }

    public final void B() {
        UiThreadUtil.runOnUiThread(new i());
    }

    public void C() {
        this.N = false;
        this.A.append("resetUI \n");
        b(this.A.toString());
        Handler handler = this.e;
        if (handler != null) {
            handler.post(new m());
        }
    }

    public final void D() {
        x();
    }

    public void E() {
        this.u = true;
        this.L = true;
    }

    public void F() {
        this.A.append("showARUI\n");
        b(this.A.toString());
        Handler handler = this.e;
        if (handler != null) {
            handler.post(new k());
        }
    }

    public final void G() {
        SensorManager sensorManager = this.c;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.c = null;
        }
    }

    public void H() {
        Button button = this.E;
        if (button != null) {
            button.setBackground(button.getResources().getDrawable(R.drawable.bdar_round_button_greed));
            this.E.setText(TokenNames.L);
            this.E.setTextColor(-16777216);
        }
    }

    public final String a(long j2) {
        return new SimpleDateFormat("HH:mm:ss").format(new Date(j2));
    }

    public void a() {
        this.N = false;
    }

    public void a(float f2) {
        UiThreadUtil.runOnUiThread(new s(f2));
    }

    public void a(int i2) {
        if (i2 > 1) {
            this.N = true;
        }
        this.A.append("********定位成功 定位结果：" + i2 + "个 \n");
        b(this.A.toString());
        G();
        if (this.e != null) {
            y();
            this.e.post(new j());
        }
    }

    public void a(int i2, int i3, float f2) {
        Handler handler;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.B <= 100 || (handler = this.e) == null) {
            return;
        }
        this.B = currentTimeMillis;
        handler.post(new r(i3, f2));
    }

    public void a(int i2, int i3, int i4, int i5) {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((RelativeLayout) viewGroup.findViewById(R.id.bdar_npc_view_group)).getLayoutParams();
            layoutParams.rightMargin = i2 - i4;
            layoutParams.topMargin = i5;
            int i6 = (int) ((i4 - 13) * 0.17699115f);
            layoutParams.height = i6;
            layoutParams.width = i4;
            ImageView imageView = this.T;
            if (imageView == null || this.S == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams2.height = i6;
            layoutParams2.width = i6;
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.S.getLayoutParams();
            layoutParams3.height = i6;
            layoutParams3.width = i6;
        }
    }

    @Override // com.baidu.ar.x4
    public void a(Message message) {
        if (this.e == null || this.v) {
            return;
        }
        switch (message.what) {
            case 1001:
                Object obj = message.obj;
                if (obj != null) {
                    ((View) obj).setVisibility(8);
                }
                G();
                c(1);
                break;
            case 1002:
                Object obj2 = message.obj;
                if (obj2 != null) {
                    ((View) obj2).setVisibility(8);
                }
                g();
                Message message2 = new Message();
                message2.what = 1003;
                this.e.sendMessageDelayed(message2, RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
                break;
            case 1003:
                z();
                if (!this.u) {
                    a(false, true);
                    break;
                } else {
                    long j2 = this.j + 1;
                    this.j = j2;
                    if (j2 < 3) {
                        a(true);
                        break;
                    } else {
                        a(false, false);
                        break;
                    }
                }
        }
    }

    public void a(View.OnClickListener onClickListener) {
        this.i = onClickListener;
    }

    public void a(l1 l1Var) {
    }

    public void a(TranslationPrior translationPrior) {
        b(translationPrior);
    }

    public void a(String str) {
        this.A.append(str + "\n");
        b(this.A.toString());
    }

    public final void a(boolean z2) {
        if (this.r >= this.s || this.d) {
            RelativeLayout relativeLayout = this.f;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            RelativeLayout relativeLayout2 = this.l;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
            RelativeLayout relativeLayout3 = this.n;
            if (relativeLayout3 != null) {
                relativeLayout3.setVisibility(8);
            }
            RelativeLayout relativeLayout4 = this.o;
            if (relativeLayout4 != null) {
                relativeLayout4.setVisibility(8);
            }
            if (this.k == null) {
                this.k = (RelativeLayout) this.b.findViewById(R.id.bdar_scanaroud_group);
            }
            this.k.setVisibility(0);
            if (this.g == null) {
                this.g = (RelativeLayout) this.b.findViewById(R.id.bdar_top_bar);
            }
            this.g.setVisibility(0);
            ImageView imageView = (ImageView) this.b.findViewById(R.id.bdar_image_scanaroud);
            ((TextView) this.b.findViewById(R.id.bdar_text_scanroud)).setText(z2 ? R.string.bdar_hint_vpas_reset : R.string.bdar_hint_scan);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f7007a, R.anim.bdar_wsdk_scan_round_anim_set);
            loadAnimation.setAnimationListener(new e());
            imageView.setAnimation(loadAnimation);
            imageView.startAnimation(loadAnimation);
        }
    }

    public void a(boolean z2, NavigationNpc navigationNpc) {
        l();
        UiThreadUtil.runOnUiThread(new t(z2, navigationNpc));
    }

    public final void a(boolean z2, boolean z3) {
        if (z2 || this.N || this.O == 0) {
            return;
        }
        this.A.append("创建定位错误弹窗 \n");
        b(this.A.toString());
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        RelativeLayout relativeLayout = this.f;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.k;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
        }
        RelativeLayout relativeLayout3 = this.n;
        if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(8);
        }
        RelativeLayout relativeLayout4 = this.o;
        if (relativeLayout4 != null) {
            relativeLayout4.setVisibility(8);
        }
        RelativeLayout relativeLayout5 = this.m;
        if (relativeLayout5 != null) {
            relativeLayout5.setVisibility(8);
        }
        if (this.l == null) {
            this.l = (RelativeLayout) this.b.findViewById(R.id.bdar_fail_group);
        }
        ((TextView) this.b.findViewById(R.id.bdar_text_fail)).setText(z3 ? R.string.bdar_tracking_fail : R.string.bdar_location_fail);
        this.l.setVisibility(0);
        this.l.setBackgroundColor(Color.parseColor("#B2000000"));
        ((Button) this.b.findViewById(R.id.bdar_button_reset)).setOnClickListener(new h());
    }

    public final double[] a(double d2, double d3, double d4) {
        double atan2;
        double d5;
        double d6;
        double radians = Math.toRadians(d2);
        double radians2 = 0.0d - Math.toRadians(d3);
        double radians3 = Math.toRadians(d4);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double cos2 = Math.cos(radians2);
        double sin2 = Math.sin(radians2);
        double cos3 = Math.cos(radians3);
        double sin3 = Math.sin(radians3);
        double d7 = cos * sin2;
        double[] dArr = {(sin * sin3) - (d7 * cos3), (-cos) * cos2, (d7 * sin3) + (sin * cos3), cos2 * cos3, -sin2, (-cos2) * sin3, (sin * sin2 * cos3) + (cos * sin3), cos2 * sin, ((-sin) * sin2 * sin3) + (cos * cos3)};
        double d8 = dArr[3];
        if (d8 > 0.9999d) {
            atan2 = Math.atan2(dArr[2], dArr[8]);
            d6 = 1.5707963267948966d;
        } else {
            if (d8 >= -0.9999d) {
                atan2 = Math.atan2(-dArr[6], dArr[0]);
                double atan22 = Math.atan2(-dArr[5], dArr[4]);
                double asin = Math.asin(dArr[3]);
                if (Double.isNaN(asin)) {
                    d5 = atan22;
                    d6 = 0.0d;
                } else {
                    d5 = atan22;
                    d6 = asin;
                }
                return new double[]{(atan2 * 180.0d) / 3.141592653589793d, (d6 * 180.0d) / 3.141592653589793d, (d5 * 180.0d) / 3.141592653589793d};
            }
            atan2 = Math.atan2(dArr[2], dArr[8]);
            d6 = -1.5707963267948966d;
        }
        d5 = 0.0d;
        return new double[]{(atan2 * 180.0d) / 3.141592653589793d, (d6 * 180.0d) / 3.141592653589793d, (d5 * 180.0d) / 3.141592653589793d};
    }

    public void b() {
        this.A.append("清除路线 \n");
        b(this.A.toString());
    }

    public void b(int i2) {
        Handler handler = this.e;
        if (handler != null) {
            handler.post(new p(i2));
        }
    }

    public void b(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public final void b(TranslationPrior translationPrior) {
        if (translationPrior != null) {
            this.A.append("lng:" + translationPrior.getCoordinate()[0] + "\n lat:" + translationPrior.getCoordinate()[1] + "\ntime:" + a(System.currentTimeMillis()) + "\n floorID:" + translationPrior.getFloorID() + "\n");
        }
        b(this.A.toString());
    }

    public final void b(String str) {
        Handler handler = this.e;
        if (handler == null || this.x == null) {
            return;
        }
        handler.post(new d(str));
    }

    public void b(boolean z2) {
        this.A.append("hideARUI \n");
        b(this.A.toString());
        Handler handler = this.e;
        if (handler != null) {
            handler.post(new l(z2));
        }
    }

    public final void c() {
        this.A.append("算法库加载失败 \n");
        b(this.A.toString());
    }

    public void c(int i2) {
        Handler handler;
        if (this.b == null || (handler = this.e) == null) {
            return;
        }
        handler.post(new c(i2));
    }

    public void c(boolean z2) {
        this.A.append(z2 ? "runAbilityResult success \n" : "runAbilityResult fail \n");
        b(this.A.toString());
        UiThreadUtil.runOnUiThread(new q(z2));
    }

    public final void d() {
    }

    public void d(boolean z2) {
        if (z2) {
            UiThreadUtil.runOnUiThread(new v());
            Handler handler = this.e;
            if (handler != null) {
                handler.post(new w());
            }
        }
    }

    public final void e() {
        if (this.f == null) {
            RelativeLayout relativeLayout = (RelativeLayout) this.b.findViewById(R.id.bdar_lift_up_group);
            this.f = relativeLayout;
            relativeLayout.setBackgroundColor(Color.parseColor("#B2000000"));
        }
        if (this.g == null) {
            this.g = (RelativeLayout) this.b.findViewById(R.id.bdar_top_bar);
        }
        this.g.setVisibility(0);
        this.f.setVisibility(0);
    }

    public void e(boolean z2) {
    }

    public final void f() {
        this.A.append("创建定位成功UI \n");
        b(this.A.toString());
        RelativeLayout relativeLayout = this.l;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.f;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
        }
        RelativeLayout relativeLayout3 = this.k;
        if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(8);
        }
        RelativeLayout relativeLayout4 = this.n;
        if (relativeLayout4 != null) {
            relativeLayout4.setVisibility(8);
        }
        RelativeLayout relativeLayout5 = this.m;
        if (relativeLayout5 != null) {
            relativeLayout5.setVisibility(8);
        }
        RelativeLayout relativeLayout6 = this.g;
        if (relativeLayout6 != null) {
            relativeLayout6.setVisibility(8);
        }
        if (this.o == null) {
            this.o = (RelativeLayout) this.b.findViewById(R.id.bdar_locfinish_group);
        }
        this.o.setVisibility(0);
        TextView textView = (TextView) this.b.findViewById(R.id.bdar_text_loc_finish);
        String string = this.f7007a.getResources().getString(R.string.bdar_hint_Loc_finish);
        ValueAnimator duration = ValueAnimator.ofInt(0, 3).setDuration(1000L);
        duration.setRepeatCount(-1);
        duration.addUpdateListener(new g(textView, string));
        duration.start();
    }

    public void f(boolean z2) {
        Handler handler;
        Runnable bVar;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.B > 100) {
            this.B = currentTimeMillis;
            if (z2) {
                UiThreadUtil.runOnUiThread(new y());
                handler = this.e;
                if (handler != null) {
                    bVar = new z();
                    handler.post(bVar);
                }
            } else {
                B();
                handler = this.e;
                if (handler != null) {
                    bVar = new b();
                    handler.post(bVar);
                }
            }
        }
        this.u = z2;
    }

    public final void g() {
        this.A.append("创建定位中UI \n");
        b(this.A.toString());
        RelativeLayout relativeLayout = this.l;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.f;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
        }
        RelativeLayout relativeLayout3 = this.o;
        if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(8);
        }
        RelativeLayout relativeLayout4 = this.m;
        if (relativeLayout4 != null) {
            relativeLayout4.setVisibility(8);
        }
        if (this.n == null) {
            this.n = (RelativeLayout) this.b.findViewById(R.id.bdar_locgoing_group);
        }
        this.n.setVisibility(0);
        ImageView imageView = (ImageView) this.b.findViewById(R.id.bdar_image_scan);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) ob.a(this.f7007a, 340.0f), -1);
        layoutParams.setMargins(-((int) ob.a(this.f7007a, 340.0f)), 0, 0, 0);
        imageView.setLayoutParams(layoutParams);
        imageView.startAnimation(AnimationUtils.loadAnimation(this.f7007a, R.anim.bdar_wsdk_anim_rg_scan));
    }

    public final void h() {
        this.A.append("session 创建失败\n");
        b(this.A.toString());
        RelativeLayout relativeLayout = this.l;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.f;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
        }
        RelativeLayout relativeLayout3 = this.o;
        if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(8);
        }
        RelativeLayout relativeLayout4 = this.n;
        if (relativeLayout4 != null) {
            relativeLayout4.setVisibility(8);
        }
        RelativeLayout relativeLayout5 = this.k;
        if (relativeLayout5 != null) {
            relativeLayout5.setVisibility(8);
        }
        if (this.m == null) {
            this.m = (RelativeLayout) this.b.findViewById(R.id.bdar_net_fail_group);
        }
        G();
        this.e.removeCallbacksAndMessages(null);
        this.m.findViewById(R.id.bdar_button_netfail_reset).setOnClickListener(new f());
        this.m.setBackgroundColor(Color.parseColor("#B2000000"));
        this.m.setVisibility(0);
    }

    public final void i() {
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.J.removeAllUpdateListeners();
            this.I = null;
        }
        if (this.P != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.I = ofFloat;
            ofFloat.setDuration(1000L);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat2;
            ofFloat2.setDuration(1000L);
            this.J.addListener(new u());
        }
    }

    public boolean j() {
        return this.M;
    }

    public final void k() {
        RelativeLayout relativeLayout = this.f;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.k;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
        }
        RelativeLayout relativeLayout3 = this.n;
        if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(8);
        }
        RelativeLayout relativeLayout4 = this.l;
        if (relativeLayout4 != null) {
            relativeLayout4.setVisibility(8);
        }
        RelativeLayout relativeLayout5 = this.m;
        if (relativeLayout5 != null) {
            relativeLayout5.setVisibility(8);
        }
        RelativeLayout relativeLayout6 = this.o;
        if (relativeLayout6 != null) {
            relativeLayout6.setVisibility(8);
        }
    }

    public final void l() {
        if (this.P == null) {
            this.P = new a();
        }
    }

    public void m() {
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.e = null;
        }
        if (this.b != null) {
            this.b = null;
        }
        Y = null;
    }

    public boolean n() {
        return this.O == 0;
    }

    public void o() {
        this.A.append("case 销毁完成 \n");
        b(this.A.toString());
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        j9 j9Var;
        float f2 = sensorEvent.sensor.getType() == 3 ? sensorEvent.values[1] : 361.0f;
        if (sensorEvent.sensor.getType() == 11) {
            try {
                SensorManager.getRotationMatrixFromVector(this.V, sensorEvent.values);
                SensorManager.getOrientation(this.V, this.U);
            } catch (Exception unused) {
            }
            float[] fArr = this.U;
            j9Var = this;
            f2 = (float) (j9Var.a((((int) Math.toDegrees(fArr[0] - fArr[2])) + 360) % 360, Math.toDegrees(this.U[1]), Math.toDegrees(this.U[2]))[1] - 90.0d);
        } else {
            j9Var = this;
        }
        if (f2 > 360.0f) {
            return;
        }
        j9Var.r = Math.abs(f2);
        long abs = Math.abs(j9Var.f7008q - System.currentTimeMillis()) / 1000;
        if (j9Var.p || abs < 1) {
            return;
        }
        j9Var.f7008q = System.currentTimeMillis();
        if (Math.abs(f2) < j9Var.s) {
            j9Var.t = 1;
            c(0);
            return;
        }
        j9Var.d = true;
        j9Var.p = true;
        if (j9Var.e != null) {
            if (j9Var.t != 1) {
                Message message = new Message();
                message.what = 1001;
                j9Var.e.sendMessage(message);
            } else {
                Message message2 = new Message();
                message2.what = 1001;
                message2.obj = j9Var.f;
                j9Var.e.sendMessageDelayed(message2, 1000L);
            }
        }
    }

    public void p() {
        Handler handler = this.e;
        if (handler != null) {
            handler.post(new n());
        }
    }

    public void q() {
        Handler handler = this.e;
        if (handler != null) {
            handler.post(new o());
        }
    }

    public void r() {
        this.w = true;
        this.v = false;
        this.A.append("onPause\n");
        b(this.A.toString());
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        k();
        if (!this.L) {
            this.u = false;
        }
        Handler handler2 = this.P;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.P = null;
            a(false, (NavigationNpc) null);
        }
        B();
    }

    public void s() {
        if (this.O == 0) {
            this.A.append("resume 拦截~~~~ \n");
            b(this.A.toString());
            return;
        }
        this.A.append("onResume \n");
        b(this.A.toString());
        k();
        this.p = false;
        this.j = 0L;
        D();
    }

    public void t() {
        this.A.append("case 加载完成 \n");
        b(this.A.toString());
        Button button = this.D;
        if (button != null) {
            button.setBackground(button.getResources().getDrawable(R.drawable.bdar_round_button_greed));
            this.D.setTextColor(-16777216);
            this.D.setText(TokenNames.C);
        }
    }

    public final void u() {
        Handler handler = this.e;
        if (handler != null) {
            handler.post(new x());
        }
    }

    public void v() {
        this.C++;
        this.A.append("********定位成功 第：" + this.C + "次定位成功 \n");
        b(this.A.toString());
    }

    public void w() {
        this.A.append("发帧啦~~~~~~~~\n");
        b(this.A.toString());
    }

    public final void x() {
        if (this.c == null) {
            this.c = (SensorManager) this.f7007a.getSystemService(ak.ac);
        }
        Sensor defaultSensor = this.c.getDefaultSensor(3);
        if (defaultSensor == null && (defaultSensor = this.c.getDefaultSensor(11)) == null) {
            return;
        }
        this.c.registerListener(this, defaultSensor, 0);
    }

    public final void y() {
        Handler handler = this.e;
        if (handler != null) {
            handler.removeMessages(1001);
            this.e.removeMessages(1002);
            this.e.removeMessages(1003);
        }
    }

    public final void z() {
        RelativeLayout relativeLayout;
        if (this.b == null || (relativeLayout = this.n) == null) {
            return;
        }
        relativeLayout.setVisibility(8);
    }
}
