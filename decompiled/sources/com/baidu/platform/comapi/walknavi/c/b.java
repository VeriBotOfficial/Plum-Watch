package com.baidu.platform.comapi.walknavi.c;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.baidu.bikenavi.R;
import com.baidu.platform.comapi.walknavi.c.c;
import com.baidu.platform.comapi.wnplatform.p.e;
import java.util.ArrayList;

/* compiled from: WnBarIndoorAdapter.java */
/* loaded from: classes13.dex */
public class b extends c {
    public int g;
    public String h;
    private String i;

    /* compiled from: WnBarIndoorAdapter.java */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private int f8697a;

        public a(int i) {
            this.f8697a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Object tag;
            if (view == null || (tag = view.getTag()) == null || !(tag instanceof c.a)) {
                return;
            }
            String item = b.this.getItem(this.f8697a) != null ? b.this.getItem(this.f8697a) : "";
            b bVar = b.this;
            bVar.h = item;
            bVar.i = "";
            b bVar2 = b.this;
            bVar2.g = this.f8697a;
            e.a(item, bVar2.d, true);
            b.this.notifyDataSetChanged();
        }
    }

    public b(ArrayList<String> arrayList) {
        super(arrayList);
        this.g = -1;
    }

    public void b(String str) {
        this.i = str;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        c.a aVar;
        String item = getItem(i);
        if (item == null) {
            return null;
        }
        if (view == null) {
            view = com.baidu.platform.comapi.wnplatform.p.p.a.a(this.f, R.layout.wsdk_bm_bar_item_indoor_a, null);
            view.setClickable(false);
            aVar = new c.a();
            aVar.c = (TextView) view.findViewById(R.id.name);
            aVar.f8699a = view.findViewById(R.id.bar_item);
            aVar.b = (ImageView) view.findViewById(R.id.indoor_loc_sanjiao);
            view.setTag(aVar);
        } else {
            aVar = (c.a) view.getTag();
        }
        a(i, view, aVar);
        aVar.d = null;
        aVar.e = null;
        aVar.f8699a.setTag(aVar);
        aVar.f8699a.setOnClickListener(new a(i));
        aVar.c.setText(item);
        a(item, aVar, i);
        return view;
    }

    private void a(String str, c.a aVar, int i) {
        a(aVar);
        b(str, aVar, i);
    }

    private void b(String str, c.a aVar, int i) {
        if (this.g != i) {
            aVar.c.setTextColor(-13488081);
            return;
        }
        if (getCount() == 1) {
            aVar.f8699a.setBackground(com.baidu.platform.comapi.wnplatform.p.p.a.a(this.f, R.drawable.wsdk_bmbar_all_bac_press));
        } else if (i == 0) {
            if (this.c) {
                aVar.f8699a.setBackground(com.baidu.platform.comapi.wnplatform.p.p.a.a(this.f, R.drawable.wsdk_bmbar_middle_bac_press));
            } else {
                aVar.f8699a.setBackground(com.baidu.platform.comapi.wnplatform.p.p.a.a(this.f, R.drawable.wsdk_bmbar_up_bac_press));
            }
        } else if (i != getCount() - 1) {
            aVar.f8699a.setBackground(com.baidu.platform.comapi.wnplatform.p.p.a.a(this.f, R.drawable.wsdk_bmbar_middle_bac_press));
        } else if (this.c) {
            aVar.f8699a.setBackground(com.baidu.platform.comapi.wnplatform.p.p.a.a(this.f, R.drawable.wsdk_bmbar_middle_bac_press));
        } else {
            aVar.f8699a.setBackground(com.baidu.platform.comapi.wnplatform.p.p.a.a(this.f, R.drawable.wsdk_bmbar_down_bac_press));
        }
        aVar.c.setTextColor(-1);
        this.h = getItem(this.g);
    }

    public void a(c.a aVar) {
        if (this.c) {
            return;
        }
        aVar.c.setTextSize(1, 9.0f);
    }

    public int a() {
        String str = this.i;
        for (int i = 0; i < getCount(); i++) {
            if (TextUtils.equals(str, getItem(i))) {
                this.g = i;
            }
        }
        return this.g;
    }
}
