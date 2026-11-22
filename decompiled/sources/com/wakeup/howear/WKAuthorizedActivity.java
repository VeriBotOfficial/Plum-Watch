package com.wakeup.howear;

import android.view.View;
import com.wakeup.WKAuthorizedViewModel;
import com.wakeup.common.base.BaseActivity;
import com.wakeup.common.utils.ToastUtils;
import com.wakeup.commonui.dialog.LoadingDialog;
import com.wakeup.howear.databinding.ActivityWkAuthorizedBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: WKAuthorizedActivity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/wakeup/howear/WKAuthorizedActivity;", "Lcom/wakeup/common/base/BaseActivity;", "Lcom/wakeup/WKAuthorizedViewModel;", "Lcom/wakeup/howear/databinding/ActivityWkAuthorizedBinding;", "<init>", "()V", "mac", "", "bleName", "code", "sn", "version", "qrcodeId", "initData", "", "initViews", "addObserve", "showLoading", "dismissLoading", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WKAuthorizedActivity extends BaseActivity<WKAuthorizedViewModel, ActivityWkAuthorizedBinding> {
    private String mac = "";
    private String bleName = "";
    private String code = "";
    private String sn = "";
    private String version = "";
    private String qrcodeId = "";

    @Override // com.wakeup.common.base.BaseActivity
    protected void initData() {
        super.initData();
        String stringExtra = getIntent().getStringExtra("mac");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.mac = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("bleName");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.bleName = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("code");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.code = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("sn");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.sn = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("version");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.version = stringExtra5;
        String stringExtra6 = getIntent().getStringExtra("qrcodeId");
        this.qrcodeId = stringExtra6 != null ? stringExtra6 : "";
    }

    @Override // com.wakeup.common.base.BaseActivity
    protected void initViews() {
        super.initViews();
        getMBinding().tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.howear.WKAuthorizedActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WKAuthorizedActivity.this.finish();
            }
        });
        getMBinding().tvConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.howear.WKAuthorizedActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WKAuthorizedActivity.initViews$lambda$1(WKAuthorizedActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(WKAuthorizedActivity wKAuthorizedActivity, View view) {
        wKAuthorizedActivity.getMViewModel().confirmLogin(wKAuthorizedActivity.qrcodeId, wKAuthorizedActivity.mac, wKAuthorizedActivity.bleName, wKAuthorizedActivity.code, wKAuthorizedActivity.version, wKAuthorizedActivity.sn);
    }

    @Override // com.wakeup.common.base.BaseActivity
    public void addObserve() {
        super.addObserve();
        getMViewModel().getLoginState().observe(this, new WKAuthorizedActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: com.wakeup.howear.WKAuthorizedActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit addObserve$lambda$2;
                addObserve$lambda$2 = WKAuthorizedActivity.addObserve$lambda$2(WKAuthorizedActivity.this, (Boolean) obj);
                return addObserve$lambda$2;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addObserve$lambda$2(WKAuthorizedActivity wKAuthorizedActivity, Boolean bool) {
        if (!bool.booleanValue()) {
            ToastUtils.showToast(wKAuthorizedActivity.getString(com.wakeup.commonui.R.string.jacket_m_net_err_a));
            return Unit.INSTANCE;
        }
        wKAuthorizedActivity.finish();
        return Unit.INSTANCE;
    }

    @Override // com.wakeup.common.base.BaseActivity
    public void showLoading() {
        LoadingDialog.showLoading(getContext());
    }

    @Override // com.wakeup.common.base.BaseActivity
    public void dismissLoading() {
        LoadingDialog.dismissLoading();
    }
}
