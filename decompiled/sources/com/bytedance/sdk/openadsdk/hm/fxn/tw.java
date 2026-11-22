package com.bytedance.sdk.openadsdk.hm.fxn;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes14.dex */
public class tw implements com.bytedance.sdk.component.bh.fxn.fxn.rb {
    public static final tw fxn = new tw();
    private volatile SQLiteDatabase kg;

    @Override // com.bytedance.sdk.component.bh.fxn.fxn.rb
    public String bh() {
        return null;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.fxn.rb
    public String gff() {
        return null;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.fxn.rb
    public SQLiteDatabase fxn(Context context) {
        if (this.kg == null) {
            synchronized (this) {
                if (this.kg == null) {
                    this.kg = com.bytedance.sdk.openadsdk.core.rb.fxn(context).fxn().fxn();
                }
            }
        }
        return this.kg;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.fxn.rb
    public String fxn() {
        return "loghighpriority";
    }

    @Override // com.bytedance.sdk.component.bh.fxn.fxn.rb
    public String kg() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.bh.fxn.fxn.rb
    public String hm() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.bh.fxn.fxn.rb
    public String rb() {
        return "logstatsbatch";
    }
}
