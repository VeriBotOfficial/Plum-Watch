package com.zhy.view.flowlayout;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class TagAdapter<T> {
    private HashSet<Integer> mCheckedPosList = new HashSet<>();
    private OnDataChangedListener mOnDataChangedListener;
    private List<T> mTagDatas;

    interface OnDataChangedListener {
        void onChanged();
    }

    public abstract View getView(FlowLayout flowLayout, int i, T t);

    public boolean setSelected(int i, T t) {
        return false;
    }

    public TagAdapter(List<T> list) {
        this.mTagDatas = list;
    }

    public TagAdapter(T[] tArr) {
        this.mTagDatas = new ArrayList(Arrays.asList(tArr));
    }

    void setOnDataChangedListener(OnDataChangedListener onDataChangedListener) {
        this.mOnDataChangedListener = onDataChangedListener;
    }

    public void setSelectedList(int... iArr) {
        for (int i : iArr) {
            this.mCheckedPosList.add(Integer.valueOf(i));
        }
        notifyDataChanged();
    }

    public void setSelectedList(Set<Integer> set) {
        this.mCheckedPosList.clear();
        if (set != null) {
            this.mCheckedPosList.addAll(set);
        }
        notifyDataChanged();
    }

    HashSet<Integer> getPreCheckedList() {
        return this.mCheckedPosList;
    }

    public int getCount() {
        List<T> list = this.mTagDatas;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void notifyDataChanged() {
        this.mOnDataChangedListener.onChanged();
    }

    public T getItem(int i) {
        return this.mTagDatas.get(i);
    }
}
