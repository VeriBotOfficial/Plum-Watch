package com.yandex.mobile.ads.impl;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.ProgressBar;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivCustom;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class b20 implements DivCustomContainerViewAdapter {
    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void bindView(View view, DivCustom div, Div2View divView, ExpressionResolver expressionResolver, DivStatePath path) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        Intrinsics.checkNotNullParameter(path, "path");
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final View createView(DivCustom div, Div2View divView, ExpressionResolver expressionResolver, DivStatePath path) {
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        Intrinsics.checkNotNullParameter(path, "path");
        ProgressBar progressBar = new ProgressBar(divView.getContext(), null, R.attr.progressBarStyleHorizontal);
        Integer a2 = a(div, "progress_color");
        if (a2 != null) {
            progressBar.setProgressTintList(ColorStateList.valueOf(a2.intValue()));
        }
        Integer a3 = a(div, "background_color");
        if (a3 != null) {
            progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(a3.intValue()));
        }
        return progressBar;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void release(View view, DivCustom div) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
    }

    private static Integer a(DivCustom divCustom, String str) {
        Object m14057constructorimpl;
        JSONObject jSONObject = divCustom.customProps;
        String optString = jSONObject != null ? jSONObject.optString(str) : null;
        try {
            Result.Companion companion = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(Integer.valueOf(Color.parseColor(optString)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        return (Integer) (Result.m14063isFailureimpl(m14057constructorimpl) ? null : m14057constructorimpl);
    }
}
