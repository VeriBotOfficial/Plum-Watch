package com.iflytek.cloud.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.sdk.m.y.k;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.RecognizerListener;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechRecognizer;
import com.iflytek.cloud.msc.util.g;
import com.iflytek.cloud.msc.util.log.DebugLog;
import com.iflytek.cloud.resource.Resource;
import com.iflytek.cloud.ui.b.d;
import com.iflytek.cloud.ui.b.e;

/* loaded from: classes17.dex */
public final class a extends d implements View.OnClickListener {
    private LinearLayout d;
    private e e;
    private RotateAnimation f;
    private SpeechRecognizer g;
    private RecognizerDialogListener h;
    private long i;
    private RecognizerListener j;
    private volatile int k;

    /* renamed from: com.iflytek.cloud.ui.a$a, reason: collision with other inner class name */
    class ViewOnClickListenerC0657a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f11213a;

        ViewOnClickListenerC0657a(Context context) {
            this.f11213a = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Uri parse = Uri.parse("http://www.xunfei.cn/?appid=" + com.iflytek.cloud.msc.util.e.b(com.iflytek.cloud.b.c.a()));
                DebugLog.LogD(parse.toString());
                Intent intent = new Intent("android.intent.action.VIEW", parse);
                intent.addFlags(268435456);
                a.this.k = 1;
                a.this.k();
                a.this.g.stopListening();
                a.this.f();
                this.f11213a.getApplicationContext().startActivity(intent);
            } catch (Exception unused) {
                DebugLog.LogW(k.j);
            }
        }
    }

    class b implements RecognizerListener {
        b() {
        }

        @Override // com.iflytek.cloud.RecognizerListener
        public void onBeginOfSpeech() {
        }

        @Override // com.iflytek.cloud.RecognizerListener
        public void onEndOfSpeech() {
            a.this.g();
        }

        @Override // com.iflytek.cloud.RecognizerListener
        public void onError(SpeechError speechError) {
            if (speechError == null || !((d) a.this).b) {
                a.this.c();
            } else {
                a.this.a(speechError);
            }
            if (a.this.h != null) {
                a.this.h.onError(speechError);
            }
        }

        @Override // com.iflytek.cloud.RecognizerListener
        public void onEvent(int i, int i2, int i3, Bundle bundle) {
        }

        @Override // com.iflytek.cloud.RecognizerListener
        public void onResult(RecognizerResult recognizerResult, boolean z) {
            if (z) {
                a.this.c();
            }
            if (a.this.h != null) {
                a.this.h.onResult(recognizerResult, z);
            }
        }

        @Override // com.iflytek.cloud.RecognizerListener
        public void onVolumeChanged(int i, byte[] bArr) {
            if (a.this.k != 1 || a.this.e == null) {
                return;
            }
            a.this.e.setVolume((i + 2) / 5);
            a.this.e.invalidate();
        }
    }

    public class c extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        private String f11215a;

        public c(String str) {
            this.f11215a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            try {
                Context context = view.getContext();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f11215a));
                intent.addFlags(268435456);
                intent.putExtra("com.android.browser.application_id", context.getPackageName());
                context.startActivity(intent);
            } catch (Exception e) {
                DebugLog.LogE(e);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
        }
    }

    public a(Context context, InitListener initListener) {
        super(context.getApplicationContext());
        this.e = null;
        this.f = null;
        this.i = 0L;
        this.j = new b();
        this.g = SpeechRecognizer.createRecognizer(context.getApplicationContext(), initListener);
        h();
    }

    private void i() {
        DebugLog.LogD("startRecognizing");
        long j = this.i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.i = elapsedRealtime;
        if (elapsedRealtime - j < 300) {
            return;
        }
        this.g.setParameter("msc.skin", "default");
        int startListening = this.g.startListening(this.j);
        if (startListening != 0) {
            a(new SpeechError(startListening));
        } else {
            f();
        }
    }

    private void j() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.destroyDrawingCache();
            this.d = null;
        }
        this.e = null;
        System.gc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        FrameLayout frameLayout = (FrameLayout) this.d.findViewWithTag("waiting");
        TextView textView = (TextView) this.d.findViewWithTag("title");
        LinearLayout linearLayout = (LinearLayout) this.d.findViewWithTag("error");
        TextView textView2 = (TextView) frameLayout.findViewWithTag("tips");
        if (this.k == 1) {
            linearLayout.setVisibility(8);
            textView.setVisibility(0);
            frameLayout.setVisibility(8);
            textView.setText(Resource.getTitle(2));
            this.e.setVolume(0);
            this.e.invalidate();
            this.e.setVisibility(0);
            return;
        }
        if (this.k == 2) {
            textView.setVisibility(8);
            this.e.setVisibility(8);
            frameLayout.setVisibility(0);
            textView2.setVisibility(0);
            textView2.setText(Resource.getTitle(3));
            return;
        }
        if (this.k == 3) {
            textView.setVisibility(8);
            this.e.setVisibility(8);
            frameLayout.setVisibility(8);
            linearLayout.setVisibility(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = this.k;
        if (i == 1) {
            this.g.stopListening();
            g();
        } else {
            if (i != 3) {
                return;
            }
            if (view.getTag() == null || ((SpeechError) view.getTag()).getErrorCode() != 20001) {
                i();
            } else {
                d();
            }
        }
    }

    public void setResultListener(RecognizerDialogListener recognizerDialogListener) {
        this.h = recognizerDialogListener;
        setOnClickListener(this);
    }

    public void setTitle(CharSequence charSequence) {
        ((TextView) this.d.findViewWithTag("title")).setText(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.e == null) {
            this.e = new e(getContext().getApplicationContext());
        }
        this.k = 1;
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            ((FrameLayout) this.d.findViewWithTag("waiting")).findViewWithTag("control").startAnimation(this.f);
            this.k = 2;
            k();
        } catch (Exception e) {
            DebugLog.LogE(e);
        }
    }

    @Override // com.iflytek.cloud.ui.b.d
    protected boolean b() {
        if (!super.b()) {
            return false;
        }
        j();
        return this.g.destroy();
    }

    @Override // com.iflytek.cloud.ui.b.d
    public void e() {
        super.e();
        i();
    }

    public void h() {
        try {
            Context applicationContext = getContext().getApplicationContext();
            View a2 = com.iflytek.cloud.ui.b.a.a(applicationContext, "recognize", this);
            a2.setBackground(com.iflytek.cloud.ui.b.a.b(applicationContext.getApplicationContext(), "voice_bg.9"));
            TextView textView = (TextView) a2.findViewWithTag("textlink");
            textView.getPaint().setFlags(8);
            textView.setText("语音识别能力由讯飞输入法提供");
            textView.setLinksClickable(true);
            textView.setOnClickListener(new ViewOnClickListenerC0657a(applicationContext));
            this.d = (LinearLayout) a2.findViewWithTag("container");
            g.a(this);
            this.e = new e(applicationContext.getApplicationContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
            layoutParams.bottomMargin = 20;
            this.d.addView(this.e, 1, layoutParams);
            ((FrameLayout) this.d.findViewWithTag("waiting")).findViewWithTag("control").setBackgroundDrawable(com.iflytek.cloud.ui.b.a.b(getContext(), "waiting"));
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            this.f = rotateAnimation;
            rotateAnimation.setRepeatCount(-1);
            this.f.setInterpolator(new LinearInterpolator());
            this.f.setDuration(700L);
        } catch (Exception e) {
            DebugLog.LogE(e);
        }
    }

    public void a(String str, String str2) {
        this.g.setParameter(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SpeechError speechError) {
        try {
            LinearLayout linearLayout = (LinearLayout) this.d.findViewWithTag("error");
            a((TextView) linearLayout.findViewWithTag("errtxt"), speechError);
            linearLayout.findViewWithTag("errview").setBackgroundDrawable(com.iflytek.cloud.ui.b.a.b(getContext(), "warning"));
            setTag(speechError);
            this.k = 3;
            k();
        } catch (Exception e) {
            DebugLog.LogE(e);
        }
    }

    public void a(TextView textView, SpeechError speechError) {
        String parameter = this.g.getParameter("view_tips_plain");
        boolean z = parameter == null || !(parameter.equalsIgnoreCase("false") || parameter.equalsIgnoreCase("0"));
        textView.setText(Html.fromHtml(speechError.getHtmlDescription(z)));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.bringToFront();
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            int length = text.length();
            Spannable spannable = (Spannable) textView.getText();
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, length, URLSpan.class);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            spannableStringBuilder.clearSpans();
            for (URLSpan uRLSpan : uRLSpanArr) {
                spannableStringBuilder.setSpan(new c(uRLSpan.getURL()), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 34);
            }
            int length2 = speechError.getHtmlDescription(false).length();
            int length3 = speechError.getHtmlDescription(true).length();
            spannableStringBuilder.setSpan(new ForegroundColorSpan(com.iflytek.cloud.ui.b.a.a()[0]), 0, length2, 34);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(com.iflytek.cloud.ui.b.a.b()[0], true), 0, length2, 33);
            if (z) {
                int i = length2 + 1;
                spannableStringBuilder.setSpan(new ForegroundColorSpan(com.iflytek.cloud.ui.b.a.a()[1]), i, length3 - 3, 34);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(com.iflytek.cloud.ui.b.a.b()[1], true), i, length, 34);
            }
            textView.setText(spannableStringBuilder);
        }
    }

    @Override // com.iflytek.cloud.ui.b.d
    public void a() {
        if (this.g.isListening()) {
            this.g.cancel();
        }
        super.a();
    }
}
