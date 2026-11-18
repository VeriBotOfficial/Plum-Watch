package com.facebook.react.devsupport;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes11.dex */
class ViewHierarchyUtil {
    ViewHierarchyUtil() {
    }

    public static Pair<View, Integer> getDeepestLeaf(View view) {
        LinkedList linkedList = new LinkedList();
        Pair<View, Integer> pair = new Pair<>(view, 1);
        linkedList.add(pair);
        while (!linkedList.isEmpty()) {
            Pair<View, Integer> pair2 = (Pair) linkedList.poll();
            if (((Integer) pair2.second).intValue() > ((Integer) pair.second).intValue()) {
                pair = pair2;
            }
            if (pair2.first instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) pair2.first;
                Integer numValueOf = Integer.valueOf(((Integer) pair2.second).intValue() + 1);
                for (int r4 = 0; r4 < viewGroup.getChildCount(); r4++) {
                    linkedList.add(new Pair(viewGroup.getChildAt(r4), numValueOf));
                }
            }
        }
        return pair;
    }
}
