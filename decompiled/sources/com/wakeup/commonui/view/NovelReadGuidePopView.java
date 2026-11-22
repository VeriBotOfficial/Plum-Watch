package com.wakeup.commonui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wakeup.common.network.entity.novel.NovelRecommendBean;
import com.wakeup.commonui.R;
import com.wakeup.commonui.utils.ImageUtil;

/* loaded from: classes2.dex */
public class NovelReadGuidePopView extends LinearLayout {
    private FrameLayout fl_novel_cover;
    private ImageView iv_novel_cover;
    private ImageView iv_recommend_novel;
    private TextView tv_btn;
    private TextView tv_introduction;
    private TextView tv_title;

    public NovelReadGuidePopView(Context context) {
        this(context, null);
    }

    public NovelReadGuidePopView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NovelReadGuidePopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.novel_read_guide_pop_view, this);
        this.fl_novel_cover = (FrameLayout) findViewById(R.id.fl_novel_cover);
        this.iv_novel_cover = (ImageView) findViewById(R.id.iv_novel_cover);
        this.iv_recommend_novel = (ImageView) findViewById(R.id.iv_recommend_novel);
        this.tv_title = (TextView) findViewById(R.id.tv_title);
        this.tv_introduction = (TextView) findViewById(R.id.tv_introduction);
        this.tv_btn = (TextView) findViewById(R.id.tv_btn);
    }

    public void initData(NovelRecommendBean novelRecommendBean, View.OnClickListener onClickListener) {
        if (novelRecommendBean == null) {
            dismiss();
            return;
        }
        if (!TextUtils.isEmpty(novelRecommendBean.coverUrl)) {
            this.fl_novel_cover.setVisibility(0);
            this.iv_novel_cover.setBackgroundResource(R.drawable.icon_novel_cover);
            ImageUtil.loadImageWithRoundedCorners(this.iv_novel_cover, novelRecommendBean.coverUrl, 4);
        } else {
            this.fl_novel_cover.setVisibility(8);
        }
        if (!TextUtils.isEmpty(novelRecommendBean.name)) {
            this.tv_title.setText(novelRecommendBean.name);
            this.tv_title.setVisibility(0);
        } else {
            this.tv_title.setVisibility(8);
        }
        if (!TextUtils.isEmpty(novelRecommendBean.introduction)) {
            this.tv_introduction.setText(novelRecommendBean.introduction);
            this.tv_introduction.setVisibility(0);
            this.tv_title.setMaxLines(1);
        } else {
            this.tv_introduction.setVisibility(8);
            this.tv_title.setMaxLines(2);
        }
        if (novelRecommendBean.currentType == 1) {
            this.tv_btn.setText(R.string.string_read_novel2);
            this.iv_recommend_novel.setVisibility(0);
        } else {
            this.tv_btn.setText(R.string.string_read_novel1);
            this.iv_recommend_novel.setVisibility(8);
        }
        TextView textView = this.tv_btn;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
        setOnClickListener(null);
    }

    public void dismiss() {
        setVisibility(8);
    }
}
