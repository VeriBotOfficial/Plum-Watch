package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.gff.hie;
import java.util.List;

/* loaded from: classes14.dex */
public abstract class TTDislikeDialogAbstract extends Dialog implements hie.kg {
    protected String fxn;
    protected final hie gff;
    private View hm;
    protected List<FilterWord> kg;

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    public TTDislikeDialogAbstract(Context context) {
        super(context);
        hie hieVar = new hie();
        this.gff = hieVar;
        hieVar.fxn(this);
    }

    public TTDislikeDialogAbstract(Context context, int i) {
        super(context, i);
        hie hieVar = new hie();
        this.gff = hieVar;
        hieVar.fxn(this);
    }

    public hie getDislikeManager() {
        return this.gff;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.hm = getLayoutView();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.hm;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.fxn = str;
        this.kg = list;
        this.gff.fxn(str);
        this.gff.fxn(this.kg);
    }

    public void onSuggestionSubmit(String str) {
        hie hieVar = this.gff;
        if (hieVar != null) {
            hieVar.gff(str);
        }
    }

    public void destroy() {
        hie hieVar = this.gff;
        if (hieVar != null) {
            hieVar.fxn();
        }
    }
}
