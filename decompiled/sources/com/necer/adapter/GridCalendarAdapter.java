package com.necer.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import com.necer.view.CalendarView2;
import java.util.List;

/* loaded from: classes17.dex */
public class GridCalendarAdapter extends BaseAdapter {
    private List<View> viewList;

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    public GridCalendarAdapter(List<View> list) {
        this.viewList = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.viewList.size();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = this.viewList.get(i);
        view2.setLayoutParams(new AbsListView.LayoutParams(-1, ((viewGroup.getMeasuredHeight() - viewGroup.getPaddingBottom()) - viewGroup.getPaddingTop()) / (this.viewList.size() / 7)));
        ((CalendarView2) viewGroup).bindView(i, view2);
        return view2;
    }
}
