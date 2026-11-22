package com.amap.api.col.p0003sl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.amap.api.map3d.R;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.OfflineMapActivity;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SearchListAdapter.java */
/* loaded from: classes11.dex */
public class s5 extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private List<OfflineMapCity> f1870a = new ArrayList();
    private OfflineMapManager b;
    private Activity c;

    /* compiled from: SearchListAdapter.java */
    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f1871a;
        final /* synthetic */ OfflineMapCity b;

        a(b bVar, OfflineMapCity offlineMapCity) {
            this.f1871a = bVar;
            this.b = offlineMapCity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1871a.d.setVisibility(8);
            this.f1871a.c.setVisibility(0);
            this.f1871a.c.setText(n1.a(R.string.O105492_29));
            try {
                s5.this.b.downloadByCityName(this.b.getCity());
            } catch (AMapException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: SearchListAdapter.java */
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        public TextView f1872a;
        public TextView b;
        public TextView c;
        public ImageView d;

        public b(s5 s5Var) {
        }
    }

    public s5(OfflineMapManager offlineMapManager, OfflineMapActivity offlineMapActivity) {
        this.b = offlineMapManager;
        this.c = offlineMapActivity;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f1870a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f1870a.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        b bVar;
        try {
            OfflineMapCity offlineMapCity = this.f1870a.get(i);
            if (view == null) {
                bVar = new b(this);
                view = y5.a(this.c, com.wakeup.howear.R.array.anythink_random_answers, null);
                TextView textView = (TextView) view.findViewById(R.id.amap_map3d_name);
                bVar.f1872a = textView;
                textView.setText(n1.a(R.string.O105492_76));
                TextView textView2 = (TextView) view.findViewById(R.id.amap_map3d_name_size);
                bVar.b = textView2;
                textView2.setText(n1.a(R.string.O105492_77));
                bVar.c = (TextView) view.findViewById(R.id.amap_map3d_download_progress_status);
                bVar.d = (ImageView) view.findViewById(R.id.amap_map3d_download_status_image);
                view.setTag(bVar);
            } else {
                bVar = (b) view.getTag();
            }
            bVar.d.setOnClickListener(new a(bVar, offlineMapCity));
            bVar.c.setVisibility(0);
            bVar.f1872a.setText(offlineMapCity.getCity());
            bVar.b.setText(String.valueOf(((int) (((offlineMapCity.getSize() / 1024.0d) / 1024.0d) * 100.0d)) / 100.0d) + " M");
            int state = offlineMapCity.getState();
            if (state == 6) {
                bVar.d.setVisibility(0);
                bVar.c.setVisibility(8);
                return view;
            }
            if (state != -1) {
                if (state == 0 || state == 1) {
                    bVar.d.setVisibility(8);
                    bVar.c.setText(n1.a(R.string.O105492_29));
                    return view;
                }
                if (state == 2) {
                    bVar.d.setVisibility(8);
                    bVar.c.setText("等待下载");
                    return view;
                }
                if (state == 3) {
                    bVar.d.setVisibility(8);
                    bVar.c.setText(n1.a(R.string.O105492_78));
                    return view;
                }
                if (state != 4) {
                    switch (state) {
                    }
                    return view;
                }
                bVar.d.setVisibility(8);
                bVar.c.setText(n1.a(R.string.O105492_31));
                return view;
            }
            bVar.d.setVisibility(8);
            bVar.c.setText(n1.a(R.string.O105492_79));
            return view;
        } catch (Exception e) {
            e.printStackTrace();
            return view;
        }
    }

    public void a(List<OfflineMapCity> list) {
        this.f1870a = list;
    }
}
