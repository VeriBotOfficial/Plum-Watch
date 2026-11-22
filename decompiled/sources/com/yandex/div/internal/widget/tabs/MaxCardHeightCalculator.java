package com.yandex.div.internal.widget.tabs;

import android.view.ViewGroup;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;

/* loaded from: classes5.dex */
public class MaxCardHeightCalculator extends BaseCardHeightCalculator {
    public MaxCardHeightCalculator(ViewGroup viewGroup, HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
        super(viewGroup, measureTabHeightFn, getTabCountFn);
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.HeightCalculator
    public boolean shouldRequestLayoutOnScroll(int i, float f) {
        return isTabsHeightsIsUnknown() || ((i == 0 || (i == 1 && f <= 0.0f)) && firstTabDiffers());
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseCardHeightCalculator
    protected int getOptimalHeight(TabMeasurement tabMeasurement, int i, float f) {
        if (i > 0) {
            return tabMeasurement.getMaxTabHeight();
        }
        if (f < 0.01f) {
            return tabMeasurement.getFirstTabHeight();
        }
        return Math.round(tabMeasurement.getFirstTabHeight() + ((tabMeasurement.getMaxTabHeight() - r3) * f));
    }

    private boolean firstTabDiffers() {
        Assert.assertTrue(this.mTabsHeightCache.size() > 0);
        TabMeasurement valueAt = this.mTabsHeightCache.valueAt(this.mTabsHeightCache.size() - 1);
        return valueAt.getFirstTabHeight() != valueAt.getMaxTabHeight();
    }
}
