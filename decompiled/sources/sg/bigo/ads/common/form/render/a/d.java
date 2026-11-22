package sg.bigo.ads.common.form.render.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.form.render.a.a;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;

/* loaded from: classes9.dex */
public final class d extends a {
    public d(e.c cVar, Map<String, Object> map, Context context, a.InterfaceC1074a interfaceC1074a) {
        super(cVar, map, context, interfaceC1074a);
    }

    @Override // sg.bigo.ads.common.form.render.a.a
    public final void a(int i) {
        int a2 = sg.bigo.ads.common.form.render.a.a();
        int b = sg.bigo.ads.common.form.render.a.b();
        boolean z = false;
        if (i != 2 && i == 3) {
            a2 = -45718;
            z = true;
            b = -45718;
        }
        a(a2, b, z);
    }

    @Override // sg.bigo.ads.common.form.render.a.a
    public final View b() {
        this.i = sg.bigo.ads.common.utils.a.a(this.h, sg.bigo.ads.common.form.render.a.a(6), null, false);
        if (this.i == null) {
            return null;
        }
        a((TextView) this.i.findViewById(R.id.inter_form_edit_title), this.d);
        a(1);
        final RadioGroup radioGroup = (RadioGroup) this.i.findViewById(R.id.inter_form_edit_content);
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: sg.bigo.ads.common.form.render.a.d.1
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup2, int i) {
                    radioGroup.requestFocus();
                    RadioButton radioButton = (RadioButton) radioGroup2.findViewById(i);
                    d.this.a(2);
                    if (radioButton != null) {
                        radioButton.setTextColor(-16736769);
                        d.this.c = radioButton.getText().toString();
                        if (d.this.j != null) {
                            d.this.j.a(d.this.e, d.this.c);
                        }
                    }
                }
            });
            if (radioGroup != null && this.g.length != 0) {
                String a2 = sg.bigo.ads.common.form.a.a(this.e, this.b);
                sg.bigo.ads.common.view.b bVar = null;
                int i = 0;
                while (i < this.g.length) {
                    String str = this.g[i];
                    boolean z = i == 0;
                    sg.bigo.ads.common.view.b bVar2 = new sg.bigo.ads.common.view.b(this.h);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                    if (!z) {
                        marginLayoutParams.topMargin = sg.bigo.ads.common.utils.e.a(this.h, 8);
                    }
                    bVar2.setLayoutParams(marginLayoutParams);
                    bVar2.setPadding(sg.bigo.ads.common.utils.e.a(this.h, 12), sg.bigo.ads.common.utils.e.a(this.h, 10), sg.bigo.ads.common.utils.e.a(this.h, 12), sg.bigo.ads.common.utils.e.a(this.h, 11));
                    bVar2.setTextSize(13.0f);
                    a(bVar2, str);
                    bVar2.setButtonDrawable((Drawable) null);
                    Context context = this.h;
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    int i2 = sg.bigo.ads.common.form.render.a.f19592a ? -15524570 : -657158;
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setColor(i2);
                    gradientDrawable.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 4));
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setColor(i2);
                    gradientDrawable2.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 4));
                    gradientDrawable2.setStroke(1, -16736769);
                    stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
                    stateListDrawable.addState(new int[]{android.R.attr.state_checked}, gradientDrawable2);
                    bVar2.setBackground(stateListDrawable);
                    bVar2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: sg.bigo.ads.common.form.render.a.d.2
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                            compoundButton.setTextColor(z2 ? -16736769 : sg.bigo.ads.common.form.render.a.b());
                        }
                    });
                    bVar2.setTextColor(sg.bigo.ads.common.form.render.a.b());
                    if (!q.a((CharSequence) a2) && a2.equalsIgnoreCase(this.g[i])) {
                        if (this.j != null) {
                            this.j.a(this.f19593a.d, a2);
                        }
                        this.c = a2;
                        bVar = bVar2;
                    }
                    u.a(bVar2, radioGroup, null, -1);
                    i++;
                }
                if (bVar != null) {
                    bVar.setChecked(true);
                }
            }
        }
        return this.i;
    }
}
