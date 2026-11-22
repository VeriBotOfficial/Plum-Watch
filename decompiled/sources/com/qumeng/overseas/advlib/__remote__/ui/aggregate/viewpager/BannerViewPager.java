package com.qumeng.overseas.advlib.__remote__.ui.aggregate.viewpager;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes17.dex */
public class BannerViewPager extends FrameLayout implements ViewPager.OnPageChangeListener {
    private static final int E = 4097;
    private static final int F = 4098;
    private int A;
    private int B;
    private boolean C;
    private Runnable D;
    private ViewPager t;
    private com.qumeng.overseas.advlib.__remote__.ui.aggregate.viewpager.a u;
    private ViewPagerAdapter v;
    private Context w;
    private int x;
    private int y;
    private boolean z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int currentTimeMillis = (int) System.currentTimeMillis();
            int i = BannerViewPager.this.A;
            if (BannerViewPager.this.B != 0) {
                i = currentTimeMillis - BannerViewPager.this.B;
            }
            if (BannerViewPager.this.y != 0) {
                if (BannerViewPager.this.y == 1) {
                    BannerViewPager bannerViewPager = BannerViewPager.this;
                    bannerViewPager.postDelayed(bannerViewPager.D, BannerViewPager.this.A);
                    return;
                }
                return;
            }
            if (i < BannerViewPager.this.A * 0.8d) {
                BannerViewPager bannerViewPager2 = BannerViewPager.this;
                bannerViewPager2.postDelayed(bannerViewPager2.D, BannerViewPager.this.A);
                return;
            }
            if (BannerViewPager.this.x == BannerViewPager.this.v.getCount() - 1) {
                BannerViewPager.this.t.setCurrentItem(0, true);
            } else {
                BannerViewPager.this.t.setCurrentItem(BannerViewPager.this.x + 1, true);
            }
            BannerViewPager bannerViewPager3 = BannerViewPager.this;
            bannerViewPager3.postDelayed(bannerViewPager3.D, BannerViewPager.this.A);
        }
    }

    public BannerViewPager(Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        if (i == 1) {
            this.y = 1;
        } else if (i == 0) {
            this.B = (int) System.currentTimeMillis();
            this.y = 0;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        a(i, f);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        this.x = i;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.t.setCurrentItem(bVar.f13034a);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f13034a = this.x;
        return bVar;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.z) {
            if (i != 0) {
                removeCallbacks(this.D);
            } else if (this.C) {
                this.C = false;
            } else {
                postDelayed(this.D, this.A);
            }
        }
    }

    public void setAdapter(ViewPagerAdapter viewPagerAdapter) {
        this.t.setAdapter(viewPagerAdapter);
        this.t.addOnPageChangeListener(this);
        this.v = viewPagerAdapter;
        this.u.setItemCount(viewPagerAdapter.getCount());
        addView(this.t);
        addView(this.u);
        if (this.z) {
            postDelayed(this.D, this.A);
        }
    }

    public void setAutoRolling(boolean z) {
        this.z = z;
    }

    public void setAutoRollingTime(int i) {
        this.A = i;
    }

    static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f13034a;

        class a implements Parcelable.Creator<b> {
            a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcel parcel) {
            super(parcel);
            this.f13034a = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13034a);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public BannerViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        this.t = new ViewPager(this.w);
        ViewPager.LayoutParams layoutParams = new ViewPager.LayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.t.setLayoutParams(layoutParams);
        this.u = new com.qumeng.overseas.advlib.__remote__.ui.aggregate.viewpager.a(this.w);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        this.u.setLayoutParams(layoutParams2);
        this.C = true;
    }

    public BannerViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.z = true;
        this.A = 3000;
        this.B = 0;
        this.D = new a();
        this.w = context;
        a();
    }

    private void a(int i, float f) {
        this.u.a(i, f);
    }
}
