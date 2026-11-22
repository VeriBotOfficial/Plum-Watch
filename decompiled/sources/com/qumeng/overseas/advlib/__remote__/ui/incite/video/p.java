package com.qumeng.overseas.advlib.__remote__.ui.incite.video;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.qumeng.overseas.advlib.__remote__.ui.front._imp_inciteadactivity;
import com.qumeng.overseas.advlib.core.ICliBundle;
import com.qumeng.overseas.advlib.ui.front.InciteADActivity;
import com.qumeng.overseas.advlib.ui.front.InciteVideoListener;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes17.dex */
public class p implements d, Observer {
    public static final String u = "countdown";
    public static final String v = "reward_time";
    private i t;

    public p(i iVar) {
        this.t = iVar;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.incite.video.d
    public void a(Context context) {
        if (context == null || this.t == null) {
            return;
        }
        com.qumeng.overseas.advlib.__remote__.ui.incite.c.a().a(this);
        Intent intent = new Intent(context, (Class<?>) InciteADActivity.class);
        intent.putExtra("request_id", this.t.d);
        intent.putExtra("award_type", _imp_inciteadactivity.AWARD_TYPE_INCITE_VIDEO_PAGE);
        intent.putExtra("ad_json", this.t.f13191a.tbundle.getString("ad_json", ""));
        intent.putExtra("incite_video_scene", "coin");
        if (this.t.b.getInt(v) > 0) {
            intent.putExtra("countdown", this.t.b.getInt(v));
        }
        com.qumeng.overseas.advlib.ui.front.a.a(this.t.b, intent);
        if (com.qumeng.overseas.advlib.__remote__.ui.incite.feedexpree.b.a(this.t.b)) {
            intent.putExtra(_imp_inciteadactivity.ACTIVITY_TYPE, 112);
        }
        com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a(context, intent);
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        a(null, observable, obj);
    }

    private boolean a() {
        Bundle bundle;
        ICliBundle iCliBundle = this.t.f13191a;
        return iCliBundle == null || (bundle = iCliBundle.tbundle) == null || TextUtils.isEmpty(bundle.getString("ad_json", ""));
    }

    public void a(Context context, Observable observable, Object obj) {
        i iVar;
        InciteVideoListener inciteVideoListener;
        try {
            com.qumeng.overseas.advlib.__remote__.ui.incite.d dVar = (com.qumeng.overseas.advlib.__remote__.ui.incite.d) obj;
            Object obj2 = dVar.b;
            if (obj2 != null && (obj2 instanceof Integer) && (iVar = this.t) != null && iVar.d == ((Integer) obj2).intValue()) {
                int i = dVar.f13153a;
                if (i == 29) {
                    com.qumeng.overseas.advlib.__remote__.ui.incite.c.a().b(this);
                    InciteVideoListener inciteVideoListener2 = this.t.c;
                    if (inciteVideoListener2 != null) {
                        com.qumeng.overseas.advlib.__remote__.utils.reflect.a.a(inciteVideoListener2).a("onADClose", new Bundle());
                        return;
                    }
                    return;
                }
                if (i == 33) {
                    if (this.t.c != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("error_msg", "video_play_fail");
                        com.qumeng.overseas.advlib.__remote__.utils.reflect.a.a(this.t.c).a("onVideoFail", bundle);
                        return;
                    }
                    return;
                }
                if (i == 41) {
                    if (this.t.c != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("error_msg", "video_give_up");
                        com.qumeng.overseas.advlib.__remote__.utils.reflect.a.a(this.t.c).a("onVideoFail", bundle2);
                        return;
                    }
                    return;
                }
                if (i == 32) {
                    InciteVideoListener inciteVideoListener3 = this.t.c;
                    if (inciteVideoListener3 != null) {
                        com.qumeng.overseas.advlib.__remote__.utils.reflect.a.a(inciteVideoListener3).a("onVideoComplete", new Bundle());
                        return;
                    }
                    return;
                }
                if (i == 31) {
                    InciteVideoListener inciteVideoListener4 = this.t.c;
                    if (inciteVideoListener4 != null) {
                        com.qumeng.overseas.advlib.__remote__.utils.reflect.a.a(inciteVideoListener4).a("onADClick", new Bundle());
                        return;
                    }
                    return;
                }
                if (i == 30) {
                    InciteVideoListener inciteVideoListener5 = this.t.c;
                    if (inciteVideoListener5 != null) {
                        com.qumeng.overseas.advlib.__remote__.utils.reflect.a.a(inciteVideoListener5).a("onADShow", new Bundle());
                        return;
                    }
                    return;
                }
                if (i == 35) {
                    InciteVideoListener inciteVideoListener6 = this.t.c;
                    if (inciteVideoListener6 != null) {
                        com.qumeng.overseas.advlib.__remote__.utils.reflect.a.a(inciteVideoListener6).a("onReward", new Bundle());
                        return;
                    }
                    return;
                }
                if (i != 36 || (inciteVideoListener = this.t.c) == null) {
                    return;
                }
                com.qumeng.overseas.advlib.__remote__.utils.reflect.a.a(inciteVideoListener).a("onVideoStart", new Bundle());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
