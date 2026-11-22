package com.amap.api.col.p0003sl;

import android.gov.nist.javax.sdp.fields.SDPFieldNames;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AutoCompleteTextView;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.amap.api.maps.offlinemap.DownLoadExpandListView;
import com.amap.api.maps.offlinemap.OfflineMapActivity;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapManager;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.wakeup.howear.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: OfflineMapPage.java */
/* loaded from: classes11.dex */
public class w5 implements OfflineMapManager.OfflineMapDownloadListener, OfflineMapManager.OfflineLoadedListener, View.OnTouchListener, TextWatcher, AbsListView.OnScrollListener {
    private t5 A;
    private ImageView b;
    private RelativeLayout c;
    private TextView d;
    private DownLoadExpandListView e;
    private ListView f;
    private ExpandableListView g;
    private TextView h;
    private ImageView i;
    private ImageView j;
    private AutoCompleteTextView k;
    private RelativeLayout l;
    private RelativeLayout m;
    private ImageView n;
    private ImageView o;
    private RelativeLayout p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f1950q;
    private r5 s;
    private q5 u;
    private s5 v;

    /* renamed from: a, reason: collision with root package name */
    protected OfflineMapActivity f1949a = null;
    private List<OfflineMapProvince> r = new ArrayList();
    private OfflineMapManager t = null;
    private boolean w = true;
    private boolean x = true;
    private int y = -1;
    private long z = 0;
    private boolean B = true;

    /* compiled from: OfflineMapPage.java */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                w5.this.k.setText("");
                w5.this.n.setVisibility(8);
                w5.this.a(false);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) w5.this.o.getLayoutParams();
                layoutParams.leftMargin = w5.this.a(95.0f);
                w5.this.o.setLayoutParams(layoutParams);
                w5.this.k.setPadding(w5.this.a(105.0f), 0, 0, 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: OfflineMapPage.java */
    class b implements Comparator<OfflineMapCity> {
        b(w5 w5Var) {
        }

        @Override // java.util.Comparator
        public int compare(OfflineMapCity offlineMapCity, OfflineMapCity offlineMapCity2) {
            char[] charArray = offlineMapCity.getJianpin().toCharArray();
            char[] charArray2 = offlineMapCity2.getJianpin().toCharArray();
            return (charArray[0] >= charArray2[0] && charArray[1] >= charArray2[1]) ? 0 : 1;
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void d() {
        this.t.destroy();
    }

    public void e() {
        View a2 = y5.a(this.f1949a, R.array.WheelArrayDefault, null);
        DownLoadExpandListView downLoadExpandListView = (DownLoadExpandListView) a2.findViewById(com.amap.api.map3d.R.id.amap_map3d_download_listview);
        this.e = downLoadExpandListView;
        downLoadExpandListView.setOnTouchListener(this);
        this.l = (RelativeLayout) a2.findViewById(com.amap.api.map3d.R.id.amap_map3d_download_header);
        this.i = (ImageView) a2.findViewById(com.amap.api.map3d.R.id.amap_map3d_download_header_image);
        this.l.setOnClickListener(this.f1949a);
        this.m = (RelativeLayout) a2.findViewById(com.amap.api.map3d.R.id.amap_map3d_city_header);
        TextView textView = (TextView) a2.findViewById(com.amap.api.map3d.R.id.amap_map3d_city_header_text);
        this.h = textView;
        textView.setText(n1.a(com.amap.api.map3d.R.string.O105492_16));
        this.j = (ImageView) a2.findViewById(com.amap.api.map3d.R.id.amap_map3d_city_header_image);
        this.m.setOnClickListener(this.f1949a);
        this.p = (RelativeLayout) a2.findViewById(com.amap.api.map3d.R.id.amap_map3d_divider1);
        TextView textView2 = (TextView) a2.findViewById(com.amap.api.map3d.R.id.amap_map3d_download_header_text);
        this.f1950q = textView2;
        textView2.setText(n1.a(com.amap.api.map3d.R.string.O105492_15));
        ((TextView) a2.findViewById(com.amap.api.map3d.R.id.amap_map3d_download_header_text)).setText(n1.a(com.amap.api.map3d.R.string.O105492_224));
        ImageView imageView = (ImageView) this.c.findViewById(com.amap.api.map3d.R.id.amap_map3d_download_title_back);
        this.b = imageView;
        imageView.setOnClickListener(this.f1949a);
        TextView textView3 = (TextView) this.c.findViewById(com.amap.api.map3d.R.id.amap_map3d_download_title_text);
        this.d = textView3;
        textView3.setText(n1.a(com.amap.api.map3d.R.string.O105492_20));
        this.o = (ImageView) this.c.findViewById(com.amap.api.map3d.R.id.amap_map3d_search_input_searchimg);
        ImageView imageView2 = (ImageView) this.c.findViewById(com.amap.api.map3d.R.id.amap_map3d_search_input_clean);
        this.n = imageView2;
        imageView2.setOnClickListener(new a());
        this.c.findViewById(com.amap.api.map3d.R.id.amap_map3d_footer).setOnTouchListener(this);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) this.c.findViewById(com.amap.api.map3d.R.id.amap_map3d_search_input);
        this.k = autoCompleteTextView;
        autoCompleteTextView.addTextChangedListener(this);
        this.k.setOnTouchListener(this);
        this.f = (ListView) this.c.findViewById(com.amap.api.map3d.R.id.amap_map3d_search_listview);
        ExpandableListView expandableListView = (ExpandableListView) this.c.findViewById(com.amap.api.map3d.R.id.amap_map3d_city_listview);
        this.g = expandableListView;
        expandableListView.addHeaderView(a2);
        this.g.setOnTouchListener(this);
        this.g.setOnScrollListener(this);
        try {
            OfflineMapManager offlineMapManager = new OfflineMapManager(this.f1949a, this);
            this.t = offlineMapManager;
            offlineMapManager.setOnOfflineLoadedListener(this);
        } catch (Exception e) {
            Log.e("OfflineMapPage", SDPFieldNames.EMAIL_FIELD + e);
        }
        c();
        r5 r5Var = new r5(this.r, this.t, this.f1949a);
        this.s = r5Var;
        this.g.setAdapter(r5Var);
        this.g.setOnGroupCollapseListener(this.s);
        this.g.setOnGroupExpandListener(this.s);
        this.g.setGroupIndicator(null);
        if (this.w) {
            this.j.setBackgroundResource(R.animator.animator_bubble_fade_in);
            this.g.setVisibility(0);
        } else {
            this.j.setBackgroundResource(R.animator.animator_scan_bg_big);
            this.g.setVisibility(8);
        }
        if (this.x) {
            this.i.setBackgroundResource(R.animator.animator_bubble_fade_in);
            this.e.setVisibility(0);
        } else {
            this.i.setBackgroundResource(R.animator.animator_scan_bg_big);
            this.e.setVisibility(8);
        }
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public void onCheckUpdate(boolean z, String str) {
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public void onDownload(int i, int i2, String str) {
        if (i == 101) {
            try {
                Toast.makeText(this.f1949a, n1.a(com.amap.api.map3d.R.string.O105492_288), 0).show();
                this.t.pause();
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (i == 2) {
            this.u.b();
        }
        if (this.y == i) {
            if (System.currentTimeMillis() - this.z > 1200) {
                if (this.B) {
                    this.u.notifyDataSetChanged();
                }
                this.z = System.currentTimeMillis();
                return;
            }
            return;
        }
        r5 r5Var = this.s;
        if (r5Var != null) {
            r5Var.notifyDataSetChanged();
        }
        q5 q5Var = this.u;
        if (q5Var != null) {
            q5Var.notifyDataSetChanged();
        }
        s5 s5Var = this.v;
        if (s5Var != null) {
            s5Var.notifyDataSetChanged();
        }
        this.y = i;
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineMapDownloadListener
    public void onRemove(boolean z, String str, String str2) {
        q5 q5Var = this.u;
        if (q5Var != null) {
            q5Var.a();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 2) {
            this.B = false;
        } else {
            this.B = true;
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (TextUtils.isEmpty(charSequence)) {
            a(false);
            this.n.setVisibility(8);
            return;
        }
        this.n.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        List<OfflineMapProvince> list = this.r;
        if (list != null && list.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<OfflineMapProvince> it = this.r.iterator();
            while (it.hasNext()) {
                arrayList2.addAll(it.next().getCityList());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                OfflineMapCity offlineMapCity = (OfflineMapCity) it2.next();
                String city = offlineMapCity.getCity();
                String pinyin = offlineMapCity.getPinyin();
                String jianpin = offlineMapCity.getJianpin();
                if (charSequence.length() == 1) {
                    if (jianpin.startsWith(String.valueOf(charSequence))) {
                        arrayList.add(offlineMapCity);
                    }
                } else if (jianpin.startsWith(String.valueOf(charSequence)) || pinyin.startsWith(String.valueOf(charSequence)) || city.startsWith(String.valueOf(charSequence))) {
                    arrayList.add(offlineMapCity);
                }
            }
        }
        if (arrayList.size() <= 0) {
            Toast.makeText(this.f1949a, n1.a(com.amap.api.map3d.R.string.O105492_287), 0).show();
            return;
        }
        a(true);
        Collections.sort(arrayList, new b(this));
        s5 s5Var = this.v;
        if (s5Var != null) {
            s5Var.a(arrayList);
            this.v.notifyDataSetChanged();
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        AutoCompleteTextView autoCompleteTextView = this.k;
        if (autoCompleteTextView != null && autoCompleteTextView.isFocused()) {
            this.k.clearFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) this.f1949a.getSystemService("input_method");
            if (inputMethodManager != null ? inputMethodManager.isActive() : false) {
                inputMethodManager.hideSoftInputFromWindow(this.k.getWindowToken(), 2);
            }
        }
        if (view.getId() == 2147479579) {
            try {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.o.getLayoutParams();
                layoutParams.leftMargin = a(18.0f);
                this.o.setLayoutParams(layoutParams);
                this.k.setPadding(a(30.0f), 0, 0, 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapManager.OfflineLoadedListener
    public void onVerifyComplete() {
        c();
        s5 s5Var = new s5(this.t, this.f1949a);
        this.v = s5Var;
        this.f.setAdapter((ListAdapter) s5Var);
        q5 q5Var = new q5(this.f1949a, this, this.t, this.r);
        this.u = q5Var;
        this.e.setAdapter(q5Var);
        this.u.notifyDataSetChanged();
    }

    private void c() {
        ArrayList<OfflineMapProvince> offlineMapProvinceList = this.t.getOfflineMapProvinceList();
        this.r.clear();
        this.r.add(null);
        ArrayList<OfflineMapCity> arrayList = new ArrayList<>();
        ArrayList<OfflineMapCity> arrayList2 = new ArrayList<>();
        for (int i = 0; i < offlineMapProvinceList.size(); i++) {
            OfflineMapProvince offlineMapProvince = offlineMapProvinceList.get(i);
            String provinceName = offlineMapProvince.getProvinceName();
            int size = offlineMapProvince.getCityList().size();
            if (provinceName.contains(n1.a(com.amap.api.map3d.R.string.O105492_72)) || provinceName.contains(n1.a(com.amap.api.map3d.R.string.O105492_73)) || provinceName.contains(n1.a(com.amap.api.map3d.R.string.O105492_19))) {
                if (size > 0) {
                    arrayList2.addAll(offlineMapProvince.getCityList());
                } else {
                    OfflineMapCity offlineMapCity = new OfflineMapCity();
                    offlineMapCity.setCity(provinceName);
                    offlineMapCity.setSize(offlineMapProvince.getSize());
                    offlineMapCity.setAdcode(offlineMapProvince.getProvinceCode());
                    offlineMapCity.setUrl(offlineMapProvince.getUrl());
                    arrayList2.add(offlineMapCity);
                }
            } else if (provinceName.contains("全国概要图")) {
                arrayList.addAll(0, offlineMapProvince.getCityList());
            } else if (size <= 1) {
                arrayList.addAll(offlineMapProvince.getCityList());
            } else {
                this.r.add(offlineMapProvince);
            }
        }
        OfflineMapProvince offlineMapProvince2 = new OfflineMapProvince();
        offlineMapProvince2.setProvinceName(n1.a(com.amap.api.map3d.R.string.O105492_17));
        offlineMapProvince2.setCityList(arrayList);
        this.r.set(0, offlineMapProvince2);
        OfflineMapProvince offlineMapProvince3 = new OfflineMapProvince();
        offlineMapProvince3.setProvinceName(n1.a(com.amap.api.map3d.R.string.O105492_74));
        offlineMapProvince3.setCityList(arrayList2);
        this.r.add(offlineMapProvince3);
    }

    public void a(OfflineMapActivity offlineMapActivity) {
        this.f1949a = offlineMapActivity;
    }

    public RelativeLayout b() {
        if (this.c == null) {
            this.c = (RelativeLayout) y5.a(this.f1949a, R.array.branch_string_array, null);
        }
        return this.c;
    }

    public void a(View view) {
        try {
            int id2 = view.getId();
            if (id2 == 2147479576) {
                this.f1949a.closeScr();
                return;
            }
            if (id2 == 2147479554) {
                if (this.x) {
                    this.e.setVisibility(8);
                    this.i.setBackgroundResource(R.animator.animator_scan_bg_big);
                    this.x = false;
                    return;
                } else {
                    this.e.setVisibility(0);
                    this.i.setBackgroundResource(R.animator.animator_bubble_fade_in);
                    this.x = true;
                    return;
                }
            }
            if (id2 == 2147479559) {
                if (this.w) {
                    this.s.a();
                    this.j.setBackgroundResource(R.animator.animator_scan_bg_big);
                    this.w = false;
                } else {
                    this.s.b();
                    this.j.setBackgroundResource(R.animator.animator_bubble_fade_in);
                    this.w = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(OfflineMapCity offlineMapCity) {
        try {
            if (this.A == null) {
                this.A = new t5(this.f1949a, this.t);
            }
            this.A.a(offlineMapCity.getState(), offlineMapCity.getCity());
            this.A.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean a() {
        try {
            if (this.f.getVisibility() != 0) {
                return true;
            }
            this.k.setText("");
            this.n.setVisibility(8);
            a(false);
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public void a(boolean z) {
        if (z) {
            this.l.setVisibility(8);
            this.m.setVisibility(8);
            this.e.setVisibility(8);
            this.g.setVisibility(8);
            this.p.setVisibility(8);
            this.f.setVisibility(0);
            return;
        }
        this.l.setVisibility(0);
        this.m.setVisibility(0);
        this.p.setVisibility(0);
        this.e.setVisibility(this.x ? 0 : 8);
        this.g.setVisibility(this.w ? 0 : 8);
        this.f.setVisibility(8);
    }

    public int a(float f) {
        return this.f1949a != null ? (int) ((f * (r0.getResources().getDisplayMetrics().densityDpi / 160.0f)) + 0.5f) : (int) f;
    }
}
