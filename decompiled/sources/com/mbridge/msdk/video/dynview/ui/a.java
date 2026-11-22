package com.mbridge.msdk.video.dynview.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.video.dynview.listener.e;
import com.mbridge.msdk.video.dynview.listener.h;
import com.mbridge.msdk.video.dynview.wrapper.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: MBridgeUI.java */
/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f12411a = false;

    public a(Context context, List<CampaignEx> list, h hVar, Map<String, Object> map) {
        a(new c().a(context, list), hVar, map);
    }

    private void a(com.mbridge.msdk.video.dynview.c cVar, h hVar, Map<String, Object> map) {
        View inflate;
        if (hVar == null) {
            return;
        }
        if (cVar == null) {
            hVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_VIEWOPTION);
            return;
        }
        if (cVar.c() == null) {
            hVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_CONTEXT);
            return;
        }
        if (TextUtils.isEmpty(cVar.f())) {
            hVar.a(com.mbridge.msdk.video.dynview.error.a.NOT_FOUND_LAYOUTNAME);
            return;
        }
        try {
            if (cVar.d() != null) {
                inflate = DynamicViewCreator.getInstance().createDynamicView(new DyOption.Builder().campaignEx((cVar.b() == null || cVar.b().size() <= 0) ? null : cVar.b().get(0)).fileDirs(cVar.d()).dyAdType(DyAdType.REWARD).orientation(cVar.h()).templateType(cVar.g()).build());
                if (inflate != null) {
                    f12411a = true;
                } else {
                    f12411a = false;
                    inflate = LayoutInflater.from(cVar.c()).inflate(g0.a(cVar.c(), cVar.f(), "layout"), (ViewGroup) null);
                }
            } else {
                f12411a = false;
                inflate = LayoutInflater.from(cVar.c()).inflate(g0.a(cVar.c(), cVar.f(), "layout"), (ViewGroup) null);
            }
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("is_dy_success", Boolean.valueOf(f12411a));
            com.mbridge.msdk.video.dynview.energize.b.a().a(inflate, cVar, map);
            com.mbridge.msdk.video.dynview.energize.a.a().a(inflate, cVar, map, new C0754a(hVar));
        } catch (Exception e) {
            o0.b("MBridgeUI", e.getMessage());
            hVar.a(com.mbridge.msdk.video.dynview.error.a.VIEW_CREATE_ERROR);
        }
    }

    public a(com.mbridge.msdk.video.dynview.c cVar, h hVar, Map<String, Object> map) {
        a(cVar, hVar, map);
    }

    /* compiled from: MBridgeUI.java */
    /* renamed from: com.mbridge.msdk.video.dynview.ui.a$a, reason: collision with other inner class name */
    class C0754a implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f12412a;

        C0754a(h hVar) {
            this.f12412a = hVar;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.e
        public void a(View view, List<View> list) {
            com.mbridge.msdk.video.dynview.a aVar = new com.mbridge.msdk.video.dynview.a();
            aVar.a(view);
            aVar.a(list);
            aVar.a(a.f12411a);
            this.f12412a.a(aVar);
        }

        @Override // com.mbridge.msdk.video.dynview.listener.e
        public void a(com.mbridge.msdk.video.dynview.error.a aVar) {
            this.f12412a.a(aVar);
        }
    }
}
