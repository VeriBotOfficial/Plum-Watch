package com.jwenfeng.library.pulltorefresh.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.jwenfeng.library.R;

/* loaded from: classes17.dex */
public class LoadMoreView extends FrameLayout implements FooterView {
    private ImageView arrow;
    private ProgressBar progressBar;

    /* renamed from: tv, reason: collision with root package name */
    private TextView f11237tv;

    @Override // com.jwenfeng.library.pulltorefresh.view.FooterView
    public void begin() {
    }

    @Override // com.jwenfeng.library.pulltorefresh.view.FooterView
    public void finishing(float f, float f2) {
    }

    @Override // com.jwenfeng.library.pulltorefresh.view.FooterView
    public View getView() {
        return this;
    }

    public LoadMoreView(Context context) {
        this(context, null);
    }

    public LoadMoreView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadMoreView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_header, (ViewGroup) null);
        addView(inflate);
        this.f11237tv = (TextView) inflate.findViewById(R.id.header_tv);
        this.arrow = (ImageView) inflate.findViewById(R.id.header_arrow);
        this.progressBar = (ProgressBar) inflate.findViewById(R.id.header_progress);
    }

    @Override // com.jwenfeng.library.pulltorefresh.view.FooterView
    public void progress(float f, float f2) {
        if (f / f2 >= 0.9f) {
            this.arrow.setRotation(0.0f);
        } else {
            this.arrow.setRotation(180.0f);
        }
        if (f >= f2 - 10.0f) {
            this.f11237tv.setText("松开加载更多");
        } else {
            this.f11237tv.setText("上拉加载");
        }
    }

    @Override // com.jwenfeng.library.pulltorefresh.view.FooterView
    public void loading() {
        this.arrow.setVisibility(8);
        this.progressBar.setVisibility(0);
        this.f11237tv.setText("加载中...");
    }

    @Override // com.jwenfeng.library.pulltorefresh.view.FooterView
    public void normal() {
        this.arrow.setVisibility(0);
        this.progressBar.setVisibility(8);
        this.f11237tv.setText("上拉加载");
    }
}
