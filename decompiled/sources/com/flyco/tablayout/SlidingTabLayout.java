package com.flyco.tablayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.flyco.tablayout.utils.UnreadMsgUtils;
import com.flyco.tablayout.widget.MsgView;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes14.dex */
public class SlidingTabLayout extends HorizontalScrollView implements ViewPager.OnPageChangeListener {
    private static final int STYLE_BLOCK = 2;
    private static final int STYLE_NORMAL = 0;
    private static final int STYLE_TRIANGLE = 1;
    private static final int TEXT_BOLD_BOTH = 2;
    private static final int TEXT_BOLD_NONE = 0;
    private static final int TEXT_BOLD_WHEN_SELECT = 1;
    private Context mContext;
    private float mCurrentPositionOffset;
    private int mCurrentTab;
    private int mDividerColor;
    private float mDividerPadding;
    private Paint mDividerPaint;
    private float mDividerWidth;
    private int mHeight;
    private int mIndicatorColor;
    private float mIndicatorCornerRadius;
    private GradientDrawable mIndicatorDrawable;
    private int mIndicatorGravity;
    private float mIndicatorHeight;
    private float mIndicatorMarginBottom;
    private float mIndicatorMarginLeft;
    private float mIndicatorMarginRight;
    private float mIndicatorMarginTop;
    private Rect mIndicatorRect;
    private int mIndicatorStyle;
    private float mIndicatorWidth;
    private boolean mIndicatorWidthEqualTitle;
    private SparseArray<Boolean> mInitSetMap;
    private int mLastScrollX;
    private OnTabSelectListener mListener;
    private Paint mRectPaint;
    private boolean mSnapOnTabClick;
    private int mTabCount;
    private float mTabPadding;
    private Rect mTabRect;
    private boolean mTabSpaceEqual;
    private float mTabWidth;
    private LinearLayout mTabsContainer;
    private boolean mTextAllCaps;
    private int mTextBold;
    private Paint mTextPaint;
    private int mTextSelectColor;
    private int mTextUnselectColor;
    private float mTextsize;
    private ArrayList<String> mTitles;
    private Paint mTrianglePaint;
    private Path mTrianglePath;
    private int mUnderlineColor;
    private int mUnderlineGravity;
    private float mUnderlineHeight;
    private ViewPager mViewPager;
    private float margin;

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int state) {
    }

    public SlidingTabLayout(Context context) {
        this(context, null, 0);
    }

    public SlidingTabLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SlidingTabLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mIndicatorRect = new Rect();
        this.mTabRect = new Rect();
        this.mIndicatorDrawable = new GradientDrawable();
        this.mRectPaint = new Paint(1);
        this.mDividerPaint = new Paint(1);
        this.mTrianglePaint = new Paint(1);
        this.mTrianglePath = new Path();
        this.mIndicatorStyle = 0;
        this.mTextPaint = new Paint(1);
        this.mInitSetMap = new SparseArray<>();
        setFillViewport(true);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.mContext = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.mTabsContainer = linearLayout;
        addView(linearLayout);
        obtainAttributes(context, attrs);
        String attributeValue = attrs.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        if (attributeValue.equals("-1") || attributeValue.equals("-2")) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, new int[]{android.R.attr.layout_height});
        this.mHeight = obtainStyledAttributes.getDimensionPixelSize(0, -2);
        obtainStyledAttributes.recycle();
    }

    private void obtainAttributes(Context context, AttributeSet attrs) {
        float f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.SlidingTabLayout);
        this.mIndicatorStyle = obtainStyledAttributes.getInt(R.styleable.SlidingTabLayout_tl_indicator_style, 0);
        this.mIndicatorColor = obtainStyledAttributes.getColor(R.styleable.SlidingTabLayout_tl_indicator_color, Color.parseColor(this.mIndicatorStyle == 2 ? "#4B6A87" : "#ffffff"));
        int i = R.styleable.SlidingTabLayout_tl_indicator_height;
        int i2 = this.mIndicatorStyle;
        if (i2 == 1) {
            f = 4.0f;
        } else {
            f = i2 == 2 ? -1 : 2;
        }
        this.mIndicatorHeight = obtainStyledAttributes.getDimension(i, dp2px(f));
        this.mIndicatorWidth = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_indicator_width, dp2px(this.mIndicatorStyle == 1 ? 10.0f : -1.0f));
        this.mIndicatorCornerRadius = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_indicator_corner_radius, dp2px(this.mIndicatorStyle == 2 ? -1.0f : 0.0f));
        this.mIndicatorMarginLeft = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_indicator_margin_left, dp2px(0.0f));
        this.mIndicatorMarginTop = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_indicator_margin_top, dp2px(this.mIndicatorStyle == 2 ? 7.0f : 0.0f));
        this.mIndicatorMarginRight = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_indicator_margin_right, dp2px(0.0f));
        this.mIndicatorMarginBottom = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_indicator_margin_bottom, dp2px(this.mIndicatorStyle != 2 ? 0.0f : 7.0f));
        this.mIndicatorGravity = obtainStyledAttributes.getInt(R.styleable.SlidingTabLayout_tl_indicator_gravity, 80);
        this.mIndicatorWidthEqualTitle = obtainStyledAttributes.getBoolean(R.styleable.SlidingTabLayout_tl_indicator_width_equal_title, false);
        this.mUnderlineColor = obtainStyledAttributes.getColor(R.styleable.SlidingTabLayout_tl_underline_color, Color.parseColor("#ffffff"));
        this.mUnderlineHeight = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_underline_height, dp2px(0.0f));
        this.mUnderlineGravity = obtainStyledAttributes.getInt(R.styleable.SlidingTabLayout_tl_underline_gravity, 80);
        this.mDividerColor = obtainStyledAttributes.getColor(R.styleable.SlidingTabLayout_tl_divider_color, Color.parseColor("#ffffff"));
        this.mDividerWidth = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_divider_width, dp2px(0.0f));
        this.mDividerPadding = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_divider_padding, dp2px(12.0f));
        this.mTextsize = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_textsize, sp2px(14.0f));
        this.mTextSelectColor = obtainStyledAttributes.getColor(R.styleable.SlidingTabLayout_tl_textSelectColor, Color.parseColor("#ffffff"));
        this.mTextUnselectColor = obtainStyledAttributes.getColor(R.styleable.SlidingTabLayout_tl_textUnselectColor, Color.parseColor("#AAffffff"));
        this.mTextBold = obtainStyledAttributes.getInt(R.styleable.SlidingTabLayout_tl_textBold, 0);
        this.mTextAllCaps = obtainStyledAttributes.getBoolean(R.styleable.SlidingTabLayout_tl_textAllCaps, false);
        this.mTabSpaceEqual = obtainStyledAttributes.getBoolean(R.styleable.SlidingTabLayout_tl_tab_space_equal, false);
        this.mTabWidth = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_tab_width, dp2px(-1.0f));
        this.mTabPadding = obtainStyledAttributes.getDimension(R.styleable.SlidingTabLayout_tl_tab_padding, (this.mTabSpaceEqual || this.mTabWidth > 0.0f) ? dp2px(0.0f) : dp2px(20.0f));
        obtainStyledAttributes.recycle();
    }

    public void setViewPager(ViewPager vp) {
        if (vp == null || vp.getAdapter() == null) {
            throw new IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
        }
        this.mViewPager = vp;
        vp.removeOnPageChangeListener(this);
        this.mViewPager.addOnPageChangeListener(this);
        notifyDataSetChanged();
    }

    public void setViewPager(ViewPager vp, String[] titles) {
        if (vp == null || vp.getAdapter() == null) {
            throw new IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
        }
        if (titles == null || titles.length == 0) {
            throw new IllegalStateException("Titles can not be EMPTY !");
        }
        if (titles.length != vp.getAdapter().getCount()) {
            throw new IllegalStateException("Titles length must be the same as the page count !");
        }
        this.mViewPager = vp;
        ArrayList<String> arrayList = new ArrayList<>();
        this.mTitles = arrayList;
        Collections.addAll(arrayList, titles);
        this.mViewPager.removeOnPageChangeListener(this);
        this.mViewPager.addOnPageChangeListener(this);
        notifyDataSetChanged();
    }

    public void setViewPager(ViewPager vp, String[] titles, FragmentActivity fa, ArrayList<Fragment> fragments) {
        if (vp == null) {
            throw new IllegalStateException("ViewPager can not be NULL !");
        }
        if (titles == null || titles.length == 0) {
            throw new IllegalStateException("Titles can not be EMPTY !");
        }
        this.mViewPager = vp;
        vp.setAdapter(new InnerPagerAdapter(fa.getSupportFragmentManager(), fragments, titles));
        this.mViewPager.removeOnPageChangeListener(this);
        this.mViewPager.addOnPageChangeListener(this);
        notifyDataSetChanged();
    }

    public void notifyDataSetChanged() {
        this.mTabsContainer.removeAllViews();
        ArrayList<String> arrayList = this.mTitles;
        this.mTabCount = arrayList == null ? this.mViewPager.getAdapter().getCount() : arrayList.size();
        for (int i = 0; i < this.mTabCount; i++) {
            View inflate = View.inflate(this.mContext, R.layout.layout_tab, null);
            ArrayList<String> arrayList2 = this.mTitles;
            addTab(i, (arrayList2 == null ? this.mViewPager.getAdapter().getPageTitle(i) : arrayList2.get(i)).toString(), inflate);
        }
        updateTabStyles();
    }

    public void addNewTab(String title) {
        View inflate = View.inflate(this.mContext, R.layout.layout_tab, null);
        ArrayList<String> arrayList = this.mTitles;
        if (arrayList != null) {
            arrayList.add(title);
        }
        ArrayList<String> arrayList2 = this.mTitles;
        addTab(this.mTabCount, (arrayList2 == null ? this.mViewPager.getAdapter().getPageTitle(this.mTabCount) : arrayList2.get(this.mTabCount)).toString(), inflate);
        ArrayList<String> arrayList3 = this.mTitles;
        this.mTabCount = arrayList3 == null ? this.mViewPager.getAdapter().getCount() : arrayList3.size();
        updateTabStyles();
    }

    private void addTab(final int position, String title, View tabView) {
        TextView textView = (TextView) tabView.findViewById(R.id.tv_tab_title);
        if (textView != null && title != null) {
            textView.setText(title);
        }
        tabView.setOnClickListener(new View.OnClickListener() { // from class: com.flyco.tablayout.SlidingTabLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                int indexOfChild = SlidingTabLayout.this.mTabsContainer.indexOfChild(v);
                if (indexOfChild != -1) {
                    if (SlidingTabLayout.this.mViewPager.getCurrentItem() != indexOfChild) {
                        if (SlidingTabLayout.this.mSnapOnTabClick) {
                            SlidingTabLayout.this.mViewPager.setCurrentItem(indexOfChild, false);
                        } else {
                            SlidingTabLayout.this.mViewPager.setCurrentItem(indexOfChild);
                        }
                        if (SlidingTabLayout.this.mListener != null) {
                            SlidingTabLayout.this.mListener.onTabSelect(indexOfChild);
                            return;
                        }
                        return;
                    }
                    if (SlidingTabLayout.this.mListener != null) {
                        SlidingTabLayout.this.mListener.onTabReselect(indexOfChild);
                    }
                }
            }
        });
        LinearLayout.LayoutParams layoutParams = this.mTabSpaceEqual ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
        if (this.mTabWidth > 0.0f) {
            layoutParams = new LinearLayout.LayoutParams((int) this.mTabWidth, -1);
        }
        this.mTabsContainer.addView(tabView, position, layoutParams);
    }

    private void updateTabStyles() {
        int i = 0;
        while (i < this.mTabCount) {
            TextView textView = (TextView) this.mTabsContainer.getChildAt(i).findViewById(R.id.tv_tab_title);
            if (textView != null) {
                textView.setTextColor(i == this.mCurrentTab ? this.mTextSelectColor : this.mTextUnselectColor);
                textView.setTextSize(0, this.mTextsize);
                float f = this.mTabPadding;
                textView.setPadding((int) f, 0, (int) f, 0);
                if (this.mTextAllCaps) {
                    textView.setText(textView.getText().toString().toUpperCase());
                }
                int i2 = this.mTextBold;
                if (i2 == 2) {
                    textView.getPaint().setFakeBoldText(true);
                } else if (i2 == 0) {
                    textView.getPaint().setFakeBoldText(false);
                }
            }
            i++;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        this.mCurrentTab = position;
        this.mCurrentPositionOffset = positionOffset;
        scrollToCurrentTab();
        invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int position) {
        updateTabSelection(position);
    }

    private void scrollToCurrentTab() {
        if (this.mTabCount <= 0) {
            return;
        }
        int width = (int) (this.mCurrentPositionOffset * this.mTabsContainer.getChildAt(this.mCurrentTab).getWidth());
        int left = this.mTabsContainer.getChildAt(this.mCurrentTab).getLeft() + width;
        if (this.mCurrentTab > 0 || width > 0) {
            int width2 = left - ((getWidth() / 2) - getPaddingLeft());
            calcIndicatorRect();
            left = width2 + ((this.mTabRect.right - this.mTabRect.left) / 2);
        }
        if (left != this.mLastScrollX) {
            this.mLastScrollX = left;
            scrollTo(left, 0);
        }
    }

    private void updateTabSelection(int position) {
        int i = 0;
        while (i < this.mTabCount) {
            View childAt = this.mTabsContainer.getChildAt(i);
            boolean z = i == position;
            TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
            if (textView != null) {
                textView.setTextColor(z ? this.mTextSelectColor : this.mTextUnselectColor);
                if (this.mTextBold == 1) {
                    textView.getPaint().setFakeBoldText(z);
                }
            }
            i++;
        }
    }

    private void calcIndicatorRect() {
        View childAt = this.mTabsContainer.getChildAt(this.mCurrentTab);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.mIndicatorStyle == 0 && this.mIndicatorWidthEqualTitle) {
            TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
            this.mTextPaint.setTextSize(this.mTextsize);
            this.margin = ((right - left) - this.mTextPaint.measureText(textView.getText().toString())) / 2.0f;
        }
        int i = this.mCurrentTab;
        if (i < this.mTabCount - 1) {
            View childAt2 = this.mTabsContainer.getChildAt(i + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f = this.mCurrentPositionOffset;
            left += (left2 - left) * f;
            right += f * (right2 - right);
            if (this.mIndicatorStyle == 0 && this.mIndicatorWidthEqualTitle) {
                TextView textView2 = (TextView) childAt2.findViewById(R.id.tv_tab_title);
                this.mTextPaint.setTextSize(this.mTextsize);
                float measureText = ((right2 - left2) - this.mTextPaint.measureText(textView2.getText().toString())) / 2.0f;
                float f2 = this.margin;
                this.margin = f2 + (this.mCurrentPositionOffset * (measureText - f2));
            }
        }
        int i2 = (int) left;
        this.mIndicatorRect.left = i2;
        int i3 = (int) right;
        this.mIndicatorRect.right = i3;
        if (this.mIndicatorStyle == 0 && this.mIndicatorWidthEqualTitle) {
            this.mIndicatorRect.left = (int) ((left + this.margin) - 1.0f);
            this.mIndicatorRect.right = (int) ((right - this.margin) - 1.0f);
        }
        this.mTabRect.left = i2;
        this.mTabRect.right = i3;
        if (this.mIndicatorWidth < 0.0f) {
            return;
        }
        float left3 = childAt.getLeft() + ((childAt.getWidth() - this.mIndicatorWidth) / 2.0f);
        if (this.mCurrentTab < this.mTabCount - 1) {
            left3 += this.mCurrentPositionOffset * ((childAt.getWidth() / 2) + (this.mTabsContainer.getChildAt(r2 + 1).getWidth() / 2));
        }
        this.mIndicatorRect.left = (int) left3;
        this.mIndicatorRect.right = (int) (r0.left + this.mIndicatorWidth);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.mTabCount <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        float f = this.mDividerWidth;
        if (f > 0.0f) {
            this.mDividerPaint.setStrokeWidth(f);
            this.mDividerPaint.setColor(this.mDividerColor);
            for (int i = 0; i < this.mTabCount - 1; i++) {
                View childAt = this.mTabsContainer.getChildAt(i);
                canvas.drawLine(childAt.getRight() + paddingLeft, this.mDividerPadding, childAt.getRight() + paddingLeft, height - this.mDividerPadding, this.mDividerPaint);
            }
        }
        if (this.mUnderlineHeight > 0.0f) {
            this.mRectPaint.setColor(this.mUnderlineColor);
            if (this.mUnderlineGravity == 80) {
                float f2 = height;
                canvas.drawRect(paddingLeft, f2 - this.mUnderlineHeight, this.mTabsContainer.getWidth() + paddingLeft, f2, this.mRectPaint);
            } else {
                canvas.drawRect(paddingLeft, 0.0f, this.mTabsContainer.getWidth() + paddingLeft, this.mUnderlineHeight, this.mRectPaint);
            }
        }
        calcIndicatorRect();
        int i2 = this.mIndicatorStyle;
        if (i2 == 1) {
            if (this.mIndicatorHeight > 0.0f) {
                this.mTrianglePaint.setColor(this.mIndicatorColor);
                this.mTrianglePath.reset();
                float f3 = height;
                this.mTrianglePath.moveTo(this.mIndicatorRect.left + paddingLeft, f3);
                this.mTrianglePath.lineTo((this.mIndicatorRect.left / 2) + paddingLeft + (this.mIndicatorRect.right / 2), f3 - this.mIndicatorHeight);
                this.mTrianglePath.lineTo(paddingLeft + this.mIndicatorRect.right, f3);
                this.mTrianglePath.close();
                canvas.drawPath(this.mTrianglePath, this.mTrianglePaint);
                return;
            }
            return;
        }
        if (i2 != 2) {
            if (this.mIndicatorHeight > 0.0f) {
                this.mIndicatorDrawable.setColor(this.mIndicatorColor);
                if (this.mIndicatorGravity == 80) {
                    this.mIndicatorDrawable.setBounds(((int) this.mIndicatorMarginLeft) + paddingLeft + this.mIndicatorRect.left, (height - ((int) this.mIndicatorHeight)) - ((int) this.mIndicatorMarginBottom), (paddingLeft + this.mIndicatorRect.right) - ((int) this.mIndicatorMarginRight), height - ((int) this.mIndicatorMarginBottom));
                } else {
                    this.mIndicatorDrawable.setBounds(((int) this.mIndicatorMarginLeft) + paddingLeft + this.mIndicatorRect.left, (int) this.mIndicatorMarginTop, (paddingLeft + this.mIndicatorRect.right) - ((int) this.mIndicatorMarginRight), ((int) this.mIndicatorHeight) + ((int) this.mIndicatorMarginTop));
                }
                this.mIndicatorDrawable.setCornerRadius(this.mIndicatorCornerRadius);
                this.mIndicatorDrawable.draw(canvas);
                return;
            }
            return;
        }
        if (this.mIndicatorHeight < 0.0f) {
            this.mIndicatorHeight = (height - this.mIndicatorMarginTop) - this.mIndicatorMarginBottom;
        }
        float f4 = this.mIndicatorHeight;
        if (f4 > 0.0f) {
            float f5 = this.mIndicatorCornerRadius;
            if (f5 < 0.0f || f5 > f4 / 2.0f) {
                this.mIndicatorCornerRadius = f4 / 2.0f;
            }
            this.mIndicatorDrawable.setColor(this.mIndicatorColor);
            this.mIndicatorDrawable.setBounds(((int) this.mIndicatorMarginLeft) + paddingLeft + this.mIndicatorRect.left, (int) this.mIndicatorMarginTop, (int) ((paddingLeft + this.mIndicatorRect.right) - this.mIndicatorMarginRight), (int) (this.mIndicatorMarginTop + this.mIndicatorHeight));
            this.mIndicatorDrawable.setCornerRadius(this.mIndicatorCornerRadius);
            this.mIndicatorDrawable.draw(canvas);
        }
    }

    public void setCurrentTab(int currentTab) {
        this.mCurrentTab = currentTab;
        this.mViewPager.setCurrentItem(currentTab);
    }

    public void setCurrentTab(int currentTab, boolean smoothScroll) {
        this.mCurrentTab = currentTab;
        this.mViewPager.setCurrentItem(currentTab, smoothScroll);
    }

    public void setIndicatorStyle(int indicatorStyle) {
        this.mIndicatorStyle = indicatorStyle;
        invalidate();
    }

    public void setTabPadding(float tabPadding) {
        this.mTabPadding = dp2px(tabPadding);
        updateTabStyles();
    }

    public void setTabSpaceEqual(boolean tabSpaceEqual) {
        this.mTabSpaceEqual = tabSpaceEqual;
        updateTabStyles();
    }

    public void setTabWidth(float tabWidth) {
        this.mTabWidth = dp2px(tabWidth);
        updateTabStyles();
    }

    public void setIndicatorColor(int indicatorColor) {
        this.mIndicatorColor = indicatorColor;
        invalidate();
    }

    public void setIndicatorHeight(float indicatorHeight) {
        this.mIndicatorHeight = dp2px(indicatorHeight);
        invalidate();
    }

    public void setIndicatorWidth(float indicatorWidth) {
        this.mIndicatorWidth = dp2px(indicatorWidth);
        invalidate();
    }

    public void setIndicatorCornerRadius(float indicatorCornerRadius) {
        this.mIndicatorCornerRadius = dp2px(indicatorCornerRadius);
        invalidate();
    }

    public void setIndicatorGravity(int indicatorGravity) {
        this.mIndicatorGravity = indicatorGravity;
        invalidate();
    }

    public void setIndicatorMargin(float indicatorMarginLeft, float indicatorMarginTop, float indicatorMarginRight, float indicatorMarginBottom) {
        this.mIndicatorMarginLeft = dp2px(indicatorMarginLeft);
        this.mIndicatorMarginTop = dp2px(indicatorMarginTop);
        this.mIndicatorMarginRight = dp2px(indicatorMarginRight);
        this.mIndicatorMarginBottom = dp2px(indicatorMarginBottom);
        invalidate();
    }

    public void setIndicatorWidthEqualTitle(boolean indicatorWidthEqualTitle) {
        this.mIndicatorWidthEqualTitle = indicatorWidthEqualTitle;
        invalidate();
    }

    public void setUnderlineColor(int underlineColor) {
        this.mUnderlineColor = underlineColor;
        invalidate();
    }

    public void setUnderlineHeight(float underlineHeight) {
        this.mUnderlineHeight = dp2px(underlineHeight);
        invalidate();
    }

    public void setUnderlineGravity(int underlineGravity) {
        this.mUnderlineGravity = underlineGravity;
        invalidate();
    }

    public void setDividerColor(int dividerColor) {
        this.mDividerColor = dividerColor;
        invalidate();
    }

    public void setDividerWidth(float dividerWidth) {
        this.mDividerWidth = dp2px(dividerWidth);
        invalidate();
    }

    public void setDividerPadding(float dividerPadding) {
        this.mDividerPadding = dp2px(dividerPadding);
        invalidate();
    }

    public void setTextsize(float textsize) {
        this.mTextsize = sp2px(textsize);
        updateTabStyles();
    }

    public void setTextSelectColor(int textSelectColor) {
        this.mTextSelectColor = textSelectColor;
        updateTabStyles();
    }

    public void setTextUnselectColor(int textUnselectColor) {
        this.mTextUnselectColor = textUnselectColor;
        updateTabStyles();
    }

    public void setTextBold(int textBold) {
        this.mTextBold = textBold;
        updateTabStyles();
    }

    public void setTextAllCaps(boolean textAllCaps) {
        this.mTextAllCaps = textAllCaps;
        updateTabStyles();
    }

    public void setSnapOnTabClick(boolean snapOnTabClick) {
        this.mSnapOnTabClick = snapOnTabClick;
    }

    public int getTabCount() {
        return this.mTabCount;
    }

    public int getCurrentTab() {
        return this.mCurrentTab;
    }

    public int getIndicatorStyle() {
        return this.mIndicatorStyle;
    }

    public float getTabPadding() {
        return this.mTabPadding;
    }

    public boolean isTabSpaceEqual() {
        return this.mTabSpaceEqual;
    }

    public float getTabWidth() {
        return this.mTabWidth;
    }

    public int getIndicatorColor() {
        return this.mIndicatorColor;
    }

    public float getIndicatorHeight() {
        return this.mIndicatorHeight;
    }

    public float getIndicatorWidth() {
        return this.mIndicatorWidth;
    }

    public float getIndicatorCornerRadius() {
        return this.mIndicatorCornerRadius;
    }

    public float getIndicatorMarginLeft() {
        return this.mIndicatorMarginLeft;
    }

    public float getIndicatorMarginTop() {
        return this.mIndicatorMarginTop;
    }

    public float getIndicatorMarginRight() {
        return this.mIndicatorMarginRight;
    }

    public float getIndicatorMarginBottom() {
        return this.mIndicatorMarginBottom;
    }

    public int getUnderlineColor() {
        return this.mUnderlineColor;
    }

    public float getUnderlineHeight() {
        return this.mUnderlineHeight;
    }

    public int getDividerColor() {
        return this.mDividerColor;
    }

    public float getDividerWidth() {
        return this.mDividerWidth;
    }

    public float getDividerPadding() {
        return this.mDividerPadding;
    }

    public float getTextsize() {
        return this.mTextsize;
    }

    public int getTextSelectColor() {
        return this.mTextSelectColor;
    }

    public int getTextUnselectColor() {
        return this.mTextUnselectColor;
    }

    public int getTextBold() {
        return this.mTextBold;
    }

    public boolean isTextAllCaps() {
        return this.mTextAllCaps;
    }

    public TextView getTitleView(int tab) {
        return (TextView) this.mTabsContainer.getChildAt(tab).findViewById(R.id.tv_tab_title);
    }

    public void showMsg(int position, int num) {
        int i = this.mTabCount;
        if (position >= i) {
            position = i - 1;
        }
        MsgView msgView = (MsgView) this.mTabsContainer.getChildAt(position).findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            UnreadMsgUtils.show(msgView, num);
            if (this.mInitSetMap.get(position) == null || !this.mInitSetMap.get(position).booleanValue()) {
                setMsgMargin(position, 4.0f, 2.0f);
                this.mInitSetMap.put(position, true);
            }
        }
    }

    public void showDot(int position) {
        int i = this.mTabCount;
        if (position >= i) {
            position = i - 1;
        }
        showMsg(position, 0);
    }

    public void hideMsg(int position) {
        int i = this.mTabCount;
        if (position >= i) {
            position = i - 1;
        }
        MsgView msgView = (MsgView) this.mTabsContainer.getChildAt(position).findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            msgView.setVisibility(8);
        }
    }

    public void setMsgMargin(int position, float leftPadding, float bottomPadding) {
        float f;
        int i = this.mTabCount;
        if (position >= i) {
            position = i - 1;
        }
        View childAt = this.mTabsContainer.getChildAt(position);
        MsgView msgView = (MsgView) childAt.findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
            this.mTextPaint.setTextSize(this.mTextsize);
            float measureText = this.mTextPaint.measureText(textView.getText().toString());
            float descent = this.mTextPaint.descent() - this.mTextPaint.ascent();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) msgView.getLayoutParams();
            float f2 = this.mTabWidth;
            if (f2 >= 0.0f) {
                f = f2 / 2.0f;
                measureText /= 2.0f;
            } else {
                f = this.mTabPadding;
            }
            marginLayoutParams.leftMargin = (int) (f + measureText + dp2px(leftPadding));
            int i2 = this.mHeight;
            marginLayoutParams.topMargin = i2 > 0 ? (((int) (i2 - descent)) / 2) - dp2px(bottomPadding) : 0;
            msgView.setLayoutParams(marginLayoutParams);
        }
    }

    public MsgView getMsgView(int position) {
        int i = this.mTabCount;
        if (position >= i) {
            position = i - 1;
        }
        return (MsgView) this.mTabsContainer.getChildAt(position).findViewById(R.id.rtv_msg_tip);
    }

    public void setOnTabSelectListener(OnTabSelectListener listener) {
        this.mListener = listener;
    }

    class InnerPagerAdapter extends FragmentPagerAdapter {
        private ArrayList<Fragment> fragments;
        private String[] titles;

        @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup container, int position, Object object) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object object) {
            return -2;
        }

        public InnerPagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments, String[] titles) {
            super(fm);
            new ArrayList();
            this.fragments = fragments;
            this.titles = titles;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.fragments.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int position) {
            return this.titles[position];
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int position) {
            return this.fragments.get(position);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.mCurrentTab);
        return bundle;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            this.mCurrentTab = bundle.getInt("mCurrentTab");
            state = bundle.getParcelable("instanceState");
            if (this.mCurrentTab != 0 && this.mTabsContainer.getChildCount() > 0) {
                updateTabSelection(this.mCurrentTab);
                scrollToCurrentTab();
            }
        }
        super.onRestoreInstanceState(state);
    }

    protected int dp2px(float dp) {
        return (int) ((dp * this.mContext.getResources().getDisplayMetrics().density) + 0.5f);
    }

    protected int sp2px(float sp) {
        return (int) ((sp * this.mContext.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
