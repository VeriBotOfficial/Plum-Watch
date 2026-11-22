package sg.bigo.ads.ad.e;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import sg.bigo.ads.R;

/* loaded from: classes7.dex */
final class c extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private a f19004a;

    interface a {
        void a();

        void b();

        void c();

        void d();
    }

    public c(Context context) {
        super(context, R.style.BigoAd_Dialog_Fullscreen);
        setCanceledOnTouchOutside(true);
    }

    public final void a(a aVar) {
        this.f19004a = aVar;
        getWindow().setFlags(8, 8);
        super.show();
        getWindow().getDecorView().setSystemUiVisibility(5894);
        getWindow().clearFlags(8);
    }

    @Override // android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View a2 = sg.bigo.ads.common.utils.a.a(getContext(), R.layout.bigo_ad_dialog_reward_retain, null, false);
        setContentView(a2);
        a2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.e.c.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.this.dismiss();
            }
        });
        a2.findViewById(R.id.bigo_ad_btn_resume).setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.e.c.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (c.this.f19004a != null) {
                    c.this.f19004a.d();
                }
                c.this.dismiss();
            }
        });
        a2.findViewById(R.id.bigo_ad_btn_skip).setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.e.c.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (c.this.f19004a != null) {
                    c.this.f19004a.c();
                }
                c.this.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    protected final void onStart() {
        super.onStart();
        a aVar = this.f19004a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.app.Dialog
    protected final void onStop() {
        super.onStop();
        a aVar = this.f19004a;
        if (aVar != null) {
            aVar.b();
            this.f19004a = null;
        }
    }
}
