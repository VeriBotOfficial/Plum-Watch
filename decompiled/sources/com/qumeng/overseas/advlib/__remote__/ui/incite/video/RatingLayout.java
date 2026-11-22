package com.qumeng.overseas.advlib.__remote__.ui.incite.video;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* loaded from: classes17.dex */
public class RatingLayout extends LinearLayout {
    private Context t;
    private String u;
    private String v;
    private String w;
    private int x;
    private int y;

    public RatingLayout(Context context) {
        super(context);
        this.u = "https://cdn.adseye.com/nsdk/res/imgstatic/incite_video_start_gray1.png";
        this.v = "https://cdn.adseye.com/nsdk/res/imgstatic/incite_video_half_start1.png";
        this.w = "https://cdn.adseye.com/nsdk/res/imgstatic/incite_video_start.png";
        this.t = context;
        this.x = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 12.0f);
        this.y = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 2.0f);
    }

    public void a(Context context, double d) {
        int floor = (int) Math.floor(d);
        int ceil = (int) Math.ceil(d);
        int i = this.x;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.rightMargin = this.y;
        for (int i2 = 1; i2 < 6; i2++) {
            ImageView imageView = new ImageView(context);
            addView(imageView, layoutParams);
            if (i2 <= floor) {
                com.qumeng.overseas.advlib.__remote__.framework.imageloader.l.c().url(this.w).into(imageView);
            } else if (i2 == ceil) {
                com.qumeng.overseas.advlib.__remote__.framework.imageloader.l.c().url(this.v).into(imageView);
            } else {
                com.qumeng.overseas.advlib.__remote__.framework.imageloader.l.c().url(this.u).into(imageView);
            }
        }
    }

    public void b(Context context, double d) {
        removeAllViews();
        int floor = (int) Math.floor(d);
        int ceil = (int) Math.ceil(d);
        int i = this.x;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.rightMargin = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 4.0f);
        for (int i2 = 1; i2 < 6; i2++) {
            ImageView imageView = new ImageView(context);
            addView(imageView, layoutParams);
            if (i2 <= floor) {
                com.qumeng.overseas.advlib.__remote__.framework.imageloader.l.c().url(this.w).into(imageView);
            } else if (i2 == ceil) {
                com.qumeng.overseas.advlib.__remote__.framework.imageloader.l.c().url(this.v).into(imageView);
            } else {
                com.qumeng.overseas.advlib.__remote__.framework.imageloader.l.c().url(this.u).into(imageView);
            }
        }
    }

    public void setGrayStarUrl(String str) {
        this.u = str;
    }

    public void setHalfStarUrl(String str) {
        this.v = str;
    }

    public void setLightStarUrl(String str) {
        this.w = str;
    }

    public void setStarMarginRight(int i) {
        this.y = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(this.t, i);
    }

    public void setStarWidth(int i) {
        this.x = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(this.t, i);
    }
}
