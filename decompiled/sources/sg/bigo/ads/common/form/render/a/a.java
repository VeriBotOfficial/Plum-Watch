package sg.bigo.ads.common.form.render.a;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.utils.q;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected e.c f19593a;
    protected Map<String, Object> b;
    protected String c;
    protected String d;
    protected String e;
    protected int f;
    protected String[] g;
    protected Context h;
    protected View i;
    protected InterfaceC1074a j;

    /* renamed from: sg.bigo.ads.common.form.render.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC1074a {
        void a(String str, String str2);
    }

    protected a(e.c cVar, Map<String, Object> map, Context context, InterfaceC1074a interfaceC1074a) {
        this.h = context;
        this.f19593a = cVar;
        this.b = map;
        this.d = cVar.f19523a;
        this.e = this.f19593a.d;
        this.f = this.f19593a.b;
        this.g = this.f19593a.c;
        this.j = interfaceC1074a;
    }

    protected static void a(TextView textView, String str) {
        if (TextUtils.isEmpty(str) || textView == null) {
            return;
        }
        textView.setText(str);
    }

    public void a(int i) {
        int a2 = sg.bigo.ads.common.form.render.a.a();
        int b = sg.bigo.ads.common.form.render.a.b();
        boolean z = false;
        if (i != 2) {
            if (i == 3) {
                a2 = -45718;
                z = true;
            }
            a(a2, b, z);
        }
        a2 = -16736769;
        b = a2;
        a(a2, b, z);
    }

    protected final void a(int i, int i2, boolean z) {
        View view = this.i;
        if (view == null) {
            return;
        }
        View findViewById = view.findViewById(R.id.inter_form_edit_content);
        if (findViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(sg.bigo.ads.common.utils.e.a(this.h, 1), i);
            gradientDrawable.setCornerRadius(sg.bigo.ads.common.utils.e.a(this.h, 8));
            findViewById.setBackground(gradientDrawable);
        }
        TextView textView = (TextView) this.i.findViewById(R.id.inter_form_edit_warning);
        if (textView != null) {
            textView.setText(sg.bigo.ads.common.form.a.a(this.h, R.string.bigo_ad_form_warning));
            textView.setVisibility(z ? 0 : 8);
        }
        TextView textView2 = (TextView) this.i.findViewById(R.id.inter_form_edit_title);
        if (textView2 != null) {
            textView2.setTextColor(i2);
        }
    }

    public final boolean a() {
        boolean a2 = q.a((CharSequence) this.c);
        if (this.f19593a.b == 3) {
            a2 = !q.g(this.c);
        }
        a(a2 ? 3 : 1);
        return a2;
    }

    public abstract View b();

    public final View c() {
        return this.i;
    }
}
