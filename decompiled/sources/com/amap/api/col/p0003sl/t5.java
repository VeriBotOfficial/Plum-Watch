package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.amap.api.map3d.R;
import com.amap.api.maps.offlinemap.OfflineMapManager;

/* compiled from: BottomDialog.java */
/* loaded from: classes11.dex */
public class t5 extends u5 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private OfflineMapManager f1886a;
    private View b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private int g;
    private String h;

    /* compiled from: BottomDialog.java */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t5.this.dismiss();
        }
    }

    public t5(Context context, OfflineMapManager offlineMapManager) {
        super(context);
        this.f1886a = offlineMapManager;
    }

    public void a(int i, String str) {
        this.c.setText(str);
        if (i == 0) {
            this.d.setText(n1.a(R.string.O105492_25));
            this.d.setVisibility(0);
            this.e.setText(n1.a(R.string.O105492_24));
        }
        if (i == 2) {
            this.d.setVisibility(8);
            this.e.setText(n1.a(R.string.O105492_24));
        } else if (i == -1 || i == 101 || i == 102 || i == 103) {
            this.d.setText(n1.a(R.string.O105492_27));
            this.d.setVisibility(0);
        } else if (i == 3) {
            this.d.setVisibility(0);
            this.d.setText(n1.a(R.string.O105492_27));
            this.e.setText(n1.a(R.string.O105492_24));
        } else if (i == 4) {
            this.e.setText(n1.a(R.string.O105492_23));
            this.d.setVisibility(8);
        }
        this.g = i;
        this.h = str;
    }

    @Override // com.amap.api.col.p0003sl.u5
    protected void b() {
        View a2 = y5.a(getContext(), com.wakeup.howear.R.array.WheelArrayWeek, null);
        this.b = a2;
        setContentView(a2);
        this.b.setOnClickListener(new a());
        TextView textView = (TextView) this.b.findViewById(R.id.amap_map3d_dialog_title);
        this.c = textView;
        textView.setText(n1.a(R.string.O105492_83));
        TextView textView2 = (TextView) this.b.findViewById(R.id.amap_map3d_dialog_status);
        this.d = textView2;
        textView2.setText(n1.a(R.string.O105492_30));
        TextView textView3 = (TextView) this.b.findViewById(R.id.amap_map3d_dialog_delete);
        this.e = textView3;
        textView3.setText(n1.a(R.string.O105492_24));
        TextView textView4 = (TextView) this.b.findViewById(R.id.amap_map3d_dialog_cancle);
        this.f = textView4;
        textView4.setText(n1.a(R.string.O105492_22));
        this.d.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.f.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 != 2147479563) {
                if (id2 != 2147479564) {
                    if (id2 == 2147479565) {
                        dismiss();
                        return;
                    }
                    return;
                } else {
                    if (TextUtils.isEmpty(this.h)) {
                        return;
                    }
                    this.f1886a.remove(this.h);
                    dismiss();
                    return;
                }
            }
            int i = this.g;
            if (i == 0) {
                this.d.setText(n1.a(R.string.O105492_27));
                this.f1886a.pauseByName(this.h);
            } else if (i == 3 || i == -1 || i == 101 || i == 102 || i == 103) {
                this.d.setText(n1.a(R.string.O105492_25));
                this.f1886a.downloadByCityName(this.h);
            }
            dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
