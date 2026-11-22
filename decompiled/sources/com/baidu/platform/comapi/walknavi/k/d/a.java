package com.baidu.platform.comapi.walknavi.k.d;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.alibaba.fastjson.asm.Opcodes;
import com.baidu.bikenavi.R;
import com.baidu.mapapi.map.MapBaseIndoorMapInfo;
import com.baidu.platform.comapi.walknavi.c.b;
import com.baidu.platform.comapi.walknavi.k.c;
import com.baidu.platform.comapi.wnplatform.WorkModeConfig;
import com.baidu.platform.comapi.wnplatform.p.h;
import java.util.ArrayList;
import java.util.List;

/* compiled from: IndoorBarWrapper.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f8784a;
    private LinearLayout b;
    private View c;
    private ListView d;
    private View e;
    private View f;
    private Activity g;
    private final c h;

    public a(ViewGroup viewGroup, Activity activity, c cVar) {
        this.f8784a = viewGroup;
        this.g = activity;
        this.h = cVar;
    }

    public void a() {
        this.b.setVisibility(8);
    }

    public void b() {
        this.b = (LinearLayout) this.f8784a.findViewById(R.id.indoor_bar_container);
        if (this.c == null) {
            this.c = com.baidu.platform.comapi.wnplatform.p.p.a.a(this.g, R.layout.wsdk_layout_indoor_bar, null);
        }
        this.e = this.c.findViewById(R.id.up_scroll);
        this.f = this.c.findViewById(R.id.down_scroll);
        this.b.addView(this.c);
        this.d = (ListView) this.c.findViewById(R.id.bar_a_list);
    }

    public void c() {
        if (this.b == null || !WorkModeConfig.b().d()) {
            return;
        }
        this.b.setVisibility(8);
    }

    public void a(MapBaseIndoorMapInfo mapBaseIndoorMapInfo) {
        if (mapBaseIndoorMapInfo == null) {
            return;
        }
        String id2 = mapBaseIndoorMapInfo.getID();
        String curFloor = mapBaseIndoorMapInfo.getCurFloor();
        int i = 0;
        this.b.setVisibility(0);
        ArrayList<String> floors = mapBaseIndoorMapInfo.getFloors();
        if (floors == null || floors.size() == 0) {
            return;
        }
        this.d.setLayoutParams(a(floors, this.d, this.d.getLayoutParams()));
        b bVar = new b(floors);
        if (floors.size() > 3) {
            bVar.b(true);
            View view = this.e;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else {
            bVar.b(false);
            View view3 = this.e;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            View view4 = this.f;
            if (view4 != null) {
                view4.setVisibility(8);
            }
        }
        bVar.a(true);
        bVar.a(id2);
        bVar.b(curFloor);
        this.d.setAdapter((ListAdapter) bVar);
        int a2 = bVar.a();
        if (a2 >= this.d.getLastVisiblePosition()) {
            i = a2 + 2;
            if (i >= bVar.getCount() - 1) {
                i = bVar.getCount() - 1;
            }
        } else if (a2 > this.d.getFirstVisiblePosition() || a2 - 2 > 0) {
            i = a2;
        }
        bVar.notifyDataSetChanged();
        this.d.setSelection(i);
    }

    public void a(String str) {
        int i = 0;
        this.b.setVisibility(0);
        b bVar = (b) this.d.getAdapter();
        if (bVar == null) {
            return;
        }
        bVar.b(str);
        int a2 = bVar.a();
        if (a2 >= this.d.getLastVisiblePosition()) {
            i = a2 + 2;
            if (i >= bVar.getCount() - 1) {
                i = bVar.getCount() - 1;
            }
        } else if (a2 > this.d.getFirstVisiblePosition() || a2 - 2 > 0) {
            i = a2;
        }
        bVar.notifyDataSetChanged();
        this.d.setSelection(i);
    }

    private ViewGroup.LayoutParams a(List<String> list, View view, ViewGroup.LayoutParams layoutParams) {
        if (list != null) {
            if (list.size() > 5) {
                layoutParams.height = h.a(this.g, Opcodes.INVOKEINTERFACE);
                return layoutParams;
            }
            layoutParams.height = h.a(this.g, (list.size() * 37) - 2);
        }
        return layoutParams;
    }
}
