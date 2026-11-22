package com.baidu.ar;

import android.text.TextUtils;
import com.baidu.ar.arrender.IARRenderer;
import com.baidu.ar.filter.FilterNode;
import com.baidu.ar.filter.FilterParam;
import com.baidu.ar.filter.FilterStateListener;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes12.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public IARRenderer f6933a;
    public DefaultParams b;
    public FilterStateListener c;
    public String g;
    public HashMap<FilterNode, Boolean> d = new HashMap<>();
    public HashMap<FilterNode, Boolean> e = new HashMap<>();
    public HashMap<FilterNode, Boolean> f = new HashMap<>();
    public y7 h = new y7();

    public g(DefaultParams defaultParams) {
        this.b = defaultParams;
        HashMap<FilterNode, Boolean> hashMap = this.d;
        if (hashMap != null) {
            FilterNode filterNode = FilterNode.lutFilter;
            Boolean bool = Boolean.FALSE;
            hashMap.put(filterNode, bool);
            this.d.put(FilterNode.skinFilter, bool);
            this.d.put(FilterNode.faceFilter, bool);
            this.d.put(FilterNode.makeupFilter, bool);
        }
        HashMap<FilterNode, Boolean> hashMap2 = this.e;
        if (hashMap2 != null) {
            hashMap2.put(FilterNode.lutFilter, Boolean.TRUE);
            this.e.put(FilterNode.skinFilter, Boolean.valueOf(this.b.isUseBeautyFilter()));
            this.e.put(FilterNode.faceFilter, Boolean.valueOf(this.b.isUseFaceFilter()));
            this.e.put(FilterNode.makeupFilter, Boolean.valueOf(this.b.isUseMakeupFilter()));
        }
    }

    public final String a(Object obj) {
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return "/opacity";
        }
        if (obj instanceof String) {
            return "/texture_path";
        }
        if (obj instanceof Integer) {
            return "/is_enable";
        }
        return null;
    }

    public final String a(String str) {
        return FilterNode.faceFilter.getNodeName().equals(str) ? "ability_face_filter" : FilterNode.makeupFilter.getNodeName().equals(str) ? "ability_makeup_filter" : "ability_common_filter";
    }

    public void a() {
        HashMap<FilterNode, Boolean> hashMap;
        HashMap<FilterNode, Boolean> hashMap2 = this.f;
        if (hashMap2 != null && (hashMap = this.d) != null && this.e != null) {
            FilterNode filterNode = FilterNode.lutFilter;
            hashMap2.put(filterNode, Boolean.valueOf(hashMap.get(filterNode).booleanValue() && this.e.get(filterNode).booleanValue()));
            HashMap<FilterNode, Boolean> hashMap3 = this.f;
            FilterNode filterNode2 = FilterNode.skinFilter;
            hashMap3.put(filterNode2, Boolean.valueOf(this.d.get(filterNode2).booleanValue() && this.e.get(filterNode2).booleanValue()));
            HashMap<FilterNode, Boolean> hashMap4 = this.f;
            FilterNode filterNode3 = FilterNode.faceFilter;
            hashMap4.put(filterNode3, Boolean.valueOf(this.d.get(filterNode3).booleanValue() && this.e.get(filterNode3).booleanValue()));
            HashMap<FilterNode, Boolean> hashMap5 = this.f;
            FilterNode filterNode4 = FilterNode.makeupFilter;
            hashMap5.put(filterNode4, Boolean.valueOf(this.d.get(filterNode4).booleanValue() && this.e.get(filterNode4).booleanValue()));
            h.a("ARFilterManager", "callbackFilterStates mFilterStates = " + this.f.toString() + " && mCasePath = " + this.g);
        }
        FilterStateListener filterStateListener = this.c;
        if (filterStateListener != null) {
            filterStateListener.onFilterStateChanged(this.f, this.g);
        }
    }

    public final void a(int i) {
        if (this.f6933a != null) {
            com.baidu.ar.arrender.c cVar = new com.baidu.ar.arrender.c();
            cVar.a("ability_common_filter");
            cVar.c(FilterNode.faceFilter.getNodeName());
            cVar.b("clearAllKnead");
            cVar.a(Integer.valueOf(i));
            this.f6933a.updateFilterData(cVar);
        }
    }

    public void a(IARRenderer iARRenderer) {
        this.f6933a = iARRenderer;
    }

    public synchronized void a(FilterNode filterNode, boolean z) {
        HashMap<FilterNode, Boolean> hashMap;
        h.a("ARFilterManager", "updateAbilityState filerName = " + filterNode + " && state = " + z);
        if (filterNode != null && (hashMap = this.e) != null && hashMap.containsKey(filterNode)) {
            this.e.put(filterNode, Boolean.valueOf(z));
        }
    }

    public void a(FilterParam filterParam, Object obj) {
        String str;
        if (filterParam == null) {
            return;
        }
        FilterNode filterNode = filterParam.getFilterNode();
        boolean z = false;
        if (FilterNode.makeupFilter.equals(filterNode)) {
            str = a(obj);
            if (obj instanceof String) {
                b(filterParam.getParamName());
            } else if (obj instanceof Integer) {
                z = true;
            }
        } else {
            str = (FilterNode.advanceBeautyFilter.equals(filterNode) && (obj instanceof Float)) ? "/intensity" : null;
        }
        a(filterNode.getNodeName(), filterParam.getParamName(), obj, str, z);
    }

    public void a(FilterStateListener filterStateListener) {
        this.c = filterStateListener;
    }

    public void a(String str, String str2, Object obj) {
        String str3 = null;
        boolean z = false;
        if (FilterNode.makeupFilter.getNodeName().equals(str)) {
            if (obj instanceof String) {
                b(str2);
            } else if (obj instanceof Integer) {
                z = true;
            }
        } else if (FilterNode.advanceBeautyFilter.getNodeName().equals(str) && (obj instanceof Float)) {
            str3 = "/intensity";
        }
        a(str, str2, obj, str3, z);
    }

    public void a(String str, String str2, Object obj, String str3, boolean z) {
        com.baidu.ar.arrender.c cVar = new com.baidu.ar.arrender.c();
        cVar.a(a(str));
        cVar.c(str);
        cVar.a(obj);
        cVar.a(z);
        if (TextUtils.isEmpty(str3)) {
            cVar.b(str2);
        } else {
            cVar.b(str2 + str3);
        }
        IARRenderer iARRenderer = this.f6933a;
        if (iARRenderer != null) {
            iARRenderer.updateFilterData(cVar);
        }
    }

    public void a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.baidu.ar.arrender.c cVar = new com.baidu.ar.arrender.c();
        cVar.a(true);
        cVar.a(a(str));
        cVar.c(str);
        cVar.b("is_enable");
        cVar.a(z ? 1 : 0);
        IARRenderer iARRenderer = this.f6933a;
        if (iARRenderer != null) {
            iARRenderer.updateFilterData(cVar);
        }
    }

    public synchronized void a(List<String> list) {
        if (list == null) {
            return;
        }
        HashMap<FilterNode, Boolean> hashMap = this.d;
        if (hashMap != null) {
            FilterNode filterNode = FilterNode.lutFilter;
            hashMap.put(filterNode, Boolean.valueOf(list.contains(filterNode.getNodeName())));
            HashMap<FilterNode, Boolean> hashMap2 = this.d;
            FilterNode filterNode2 = FilterNode.skinFilter;
            hashMap2.put(filterNode2, Boolean.valueOf(list.contains(filterNode2.getNodeName())));
            HashMap<FilterNode, Boolean> hashMap3 = this.d;
            FilterNode filterNode3 = FilterNode.faceFilter;
            hashMap3.put(filterNode3, Boolean.valueOf(list.contains(filterNode3.getNodeName())));
            HashMap<FilterNode, Boolean> hashMap4 = this.d;
            FilterNode filterNode4 = FilterNode.makeupFilter;
            hashMap4.put(filterNode4, Boolean.valueOf(list.contains(filterNode4.getNodeName())));
            h.a("ARFilterManager", "onPipelineChanged mPipelineStates = " + this.d.toString());
        }
        a();
    }

    public void b() {
        a(1);
    }

    public final void b(String str) {
        String str2;
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "cheeks":
                str2 = StatisticConstants.EVENT_MAKEUP_BLUSHER_ENTER;
                break;
            case "highlight":
                str2 = StatisticConstants.EVENT_MAKEUP_HIGHLIGHT_ENTER;
                break;
            case "lips":
            case "lips_mask":
                str2 = StatisticConstants.EVENT_MAKEUP_LIPSTICK_ENTER;
                break;
            default:
                str2 = null;
                break;
        }
        if (str2 != null) {
            StatisticApi.onEvent(str2);
        }
    }

    public void c() {
        IARRenderer iARRenderer = this.f6933a;
        if (iARRenderer != null) {
            iARRenderer.clearCaseLutFilter();
        }
    }

    public void c(String str) {
        this.g = str;
    }

    public String d(String str) {
        if (this.f6933a == null) {
            return null;
        }
        String renderPipeline = this.b.getRenderPipeline();
        if (!TextUtils.isEmpty(renderPipeline) && renderPipeline.contains(FilterNode.highlightFilter.getNodeName())) {
            h.a("ARFilterManager", "updateFilterCase: getRenderPipeline " + renderPipeline);
            this.h.a(str);
        }
        return this.f6933a.updateFilterCase(str);
    }

    public synchronized void d() {
        HashMap<FilterNode, Boolean> hashMap = this.d;
        if (hashMap != null) {
            FilterNode filterNode = FilterNode.lutFilter;
            Boolean bool = Boolean.TRUE;
            hashMap.put(filterNode, bool);
            this.d.put(FilterNode.skinFilter, bool);
            this.d.put(FilterNode.faceFilter, bool);
            this.d.put(FilterNode.makeupFilter, bool);
            h.a("ARFilterManager", "onPipelineCreate mPipelineStates = " + this.d.toString());
        }
        a();
    }

    public synchronized void e() {
        this.b = null;
        this.f6933a = null;
        this.h = null;
        this.c = null;
        HashMap<FilterNode, Boolean> hashMap = this.d;
        if (hashMap != null) {
            hashMap.clear();
            this.d = null;
        }
        HashMap<FilterNode, Boolean> hashMap2 = this.e;
        if (hashMap2 != null) {
            hashMap2.clear();
            this.e = null;
        }
        HashMap<FilterNode, Boolean> hashMap3 = this.f;
        if (hashMap3 != null) {
            hashMap3.clear();
            this.f = null;
        }
    }

    public void f() {
        a(0);
    }

    public void g() {
        if (this.h.b()) {
            a(this.h.a(), true);
        }
    }
}
