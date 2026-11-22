package com.baidu.platform.comapi.walknavi.c;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.baidu.bikenavi.R;
import java.util.ArrayList;

/* compiled from: WnBaseBarAdapter.java */
/* loaded from: classes13.dex */
public class c extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<String> f8698a;
    public LayoutInflater b;
    public boolean c;
    public String d;
    private boolean e;
    protected Activity f;

    /* compiled from: WnBaseBarAdapter.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public View f8699a;
        public ImageView b;
        public TextView c;
        public String d;
        public String e;
    }

    public c(ArrayList<String> arrayList) {
        Activity activity = (Activity) com.baidu.platform.comapi.walknavi.b.n().f();
        this.f = activity;
        if (activity != null) {
            this.b = (LayoutInflater) activity.getSystemService("layout_inflater");
        }
        this.f8698a = arrayList;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String getItem(int i) {
        ArrayList<String> arrayList = this.f8698a;
        if (arrayList == null || arrayList.size() <= i || i < 0) {
            return null;
        }
        return this.f8698a.get(i);
    }

    public void b(boolean z) {
        this.e = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<String> arrayList = this.f8698a;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public void a(boolean z) {
        this.c = z;
    }

    public void a(int i, View view, a aVar) {
        if (getCount() == 1) {
            aVar.f8699a.setBackground(com.baidu.platform.comapi.wnplatform.p.p.a.a(this.f, R.drawable.wsdk_bar_item_all_bac));
            return;
        }
        if (i == 0) {
            if (this.c && this.e) {
                aVar.f8699a.setBackground(com.baidu.platform.comapi.wnplatform.p.p.a.a(this.f, R.drawable.wsdk_bar_item_middle_bac));
                return;
            } else {
                aVar.f8699a.setBackground(com.baidu.platform.comapi.wnplatform.p.p.a.a(this.f, R.drawable.wsdk_bar_item_up_bac));
                return;
            }
        }
        if (i == getCount() - 1) {
            if (this.c && this.e) {
                aVar.f8699a.setBackground(com.baidu.platform.comapi.wnplatform.p.p.a.a(this.f, R.drawable.wsdk_bar_item_middle_bac));
                return;
            } else {
                aVar.f8699a.setBackground(com.baidu.platform.comapi.wnplatform.p.p.a.a(this.f, R.drawable.wsdk_bar_item_down_bac));
                return;
            }
        }
        aVar.f8699a.setBackground(com.baidu.platform.comapi.wnplatform.p.p.a.a(this.f, R.drawable.wsdk_bar_item_middle_bac));
    }

    public void a(String str) {
        this.d = str;
    }
}
