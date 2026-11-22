package com.qumeng.overseas.advlib.__remote__.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.s;
import com.qumeng.overseas.advlib.__remote__.ui.dialog.b;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes17.dex */
public class a extends Dialog {
    private List<b> t;

    /* renamed from: com.qumeng.overseas.advlib.__remote__.ui.dialog.a$a, reason: collision with other inner class name */
    class ViewOnClickListenerC0829a implements View.OnClickListener {
        final /* synthetic */ b.a t;

        ViewOnClickListenerC0829a(b.a aVar) {
            this.t = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.a aVar = this.t;
            if (aVar != null) {
                aVar.onClick();
            }
            a.this.dismiss();
        }
    }

    public a(Context context) {
        super(context);
        this.t = new LinkedList();
    }

    private void a(View view) {
        if (this.t != null) {
            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-1, -2);
            int a2 = s.a(getContext(), 15.0f);
            int i = 0;
            while (i < this.t.size()) {
                TextView textView = new TextView(getContext());
                textView.setText(this.t.get(i).b());
                textView.setTextSize(18.0f);
                textView.setTextColor(-16777216);
                textView.setGravity(17);
                textView.setBackgroundColor(-1);
                textView.setPadding(0, i == 0 ? a2 * 2 : a2, 0, i == this.t.size() - 1 ? a2 * 2 : a2);
                textView.setOnClickListener(new ViewOnClickListenerC0829a(this.t.get(i).a()));
                ViewGroup viewGroup = (ViewGroup) view;
                viewGroup.addView(textView, layoutParams);
                if (i != this.t.size() - 1) {
                    View view2 = new View(getContext());
                    view2.setBackgroundColor(Color.parseColor("#dfe2e8"));
                    viewGroup.addView(view2, new LinearLayoutCompat.LayoutParams(-1, 1));
                }
                i++;
            }
        }
    }

    private void b() {
        Window window = getWindow();
        requestWindowFeature(1);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 17;
        attributes.width = (int) (getContext().getResources().getDisplayMetrics().widthPixels * 0.8d);
        window.setAttributes(attributes);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b();
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        View a2 = a();
        a(a2);
        setContentView(a2);
    }

    public a(Context context, int i) {
        super(context, i);
        this.t = new LinkedList();
    }

    public a(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.t = new LinkedList();
    }

    private View a() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setBackgroundColor(-1);
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    public a a(b bVar) {
        this.t.add(bVar);
        return this;
    }

    public a a(List<b> list) {
        this.t.addAll(list);
        return this;
    }
}
