package com.bytedance.sdk.component.bh.fxn.fxn.fxn;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes13.dex */
public class rb implements com.bytedance.sdk.component.bh.fxn.fxn.rb {
    public static final rb fxn = new rb();
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
                    this.kg = new hm(context).getWritableDatabase();
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
