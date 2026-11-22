package com.wakeup.common.base;

import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.viewbinding.ViewBinding;
import com.wakeup.common.base.BaseViewModel;
import com.wakeup.common.log.LogUtils;
import com.wakeup.module.record.Constants;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseDialogFragment.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005:\u0001EB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0016J\u0012\u0010\u001f\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010!\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\"\u001a\u00020\u001bH\u0016J\b\u0010#\u001a\u00020\u001bH\u0016J\b\u0010$\u001a\u00020\u001bH\u0016J\b\u0010%\u001a\u00020\u001bH\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020'H\u0014J\b\u0010)\u001a\u00020*H\u0014J\b\u0010+\u001a\u00020*H\u0014J\b\u0010,\u001a\u00020*H\u0014J&\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020.2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u00105\u001a\u00020*H\u0016J\u001a\u00106\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0002J\u001a\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\tH\u0016J\r\u0010;\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0010J\b\u0010<\u001a\u00020'H\u0016J\u0010\u0010C\u001a\u00020\u001b2\u0006\u0010D\u001a\u00020>H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u00028\u0000X\u0084.¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u00028\u0001X\u0084.¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010=\u001a\u0004\u0018\u00010>X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006F"}, d2 = {"Lcom/wakeup/common/base/BaseDialogFragment;", "VM", "Lcom/wakeup/common/base/BaseViewModel;", "DB", "Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "mViewModel", "getMViewModel", "()Lcom/wakeup/common/base/BaseViewModel;", "setMViewModel", "(Lcom/wakeup/common/base/BaseViewModel;)V", "Lcom/wakeup/common/base/BaseViewModel;", "mBinding", "getMBinding", "()Landroidx/viewbinding/ViewBinding;", "setMBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "init", "bundle", "initViews", "addObserve", "initData", Constants.ON_START_KEY, "setWindow", "isCancelable", "", "isCanceledOnTouchOutside", "gravity", "", "getDialogWidth", "getDialogHeight", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "layoutId", "initBinding", "show", "manager", "Landroidx/fragment/app/FragmentManager;", "tag", "createViewModel", "isShareVM", "mDialogListener", "Lcom/wakeup/common/base/BaseDialogFragment$OnDialogListener;", "getMDialogListener", "()Lcom/wakeup/common/base/BaseDialogFragment$OnDialogListener;", "setMDialogListener", "(Lcom/wakeup/common/base/BaseDialogFragment$OnDialogListener;)V", "setListener", "dialogListener", "OnDialogListener", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseDialogFragment<VM extends BaseViewModel, DB extends ViewBinding> extends DialogFragment {
    protected String TAG;
    protected DB mBinding;
    private OnDialogListener mDialogListener;
    protected VM mViewModel;

    /* compiled from: BaseDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0016¨\u0006\n"}, d2 = {"Lcom/wakeup/common/base/BaseDialogFragment$OnDialogListener;", "", "<init>", "()V", "onRightClickListener", "", "data", "onLeftClickListener", "onCloseClickListener", "onConfirmClickListener", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class OnDialogListener {
        public void onCloseClickListener() {
        }

        public void onConfirmClickListener(Object data) {
        }

        public void onLeftClickListener(Object data) {
        }

        public void onRightClickListener(Object data) {
        }
    }

    public void addObserve() {
    }

    protected int getDialogHeight() {
        return -2;
    }

    protected int getDialogWidth() {
        return -1;
    }

    protected int gravity() {
        return 17;
    }

    public void init(Bundle bundle) {
    }

    public void initData() {
    }

    public void initViews(Bundle savedInstanceState) {
    }

    @Override // androidx.fragment.app.DialogFragment
    public boolean isCancelable() {
        return false;
    }

    protected boolean isCanceledOnTouchOutside() {
        return false;
    }

    public boolean isShareVM() {
        return false;
    }

    public int layoutId() {
        return 0;
    }

    protected final String getTAG() {
        String str = this.TAG;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("TAG");
        return null;
    }

    protected final void setTAG(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.TAG = str;
    }

    protected final VM getMViewModel() {
        VM vm = this.mViewModel;
        if (vm != null) {
            return vm;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        return null;
    }

    protected final void setMViewModel(VM vm) {
        Intrinsics.checkNotNullParameter(vm, "<set-?>");
        this.mViewModel = vm;
    }

    protected final DB getMBinding() {
        DB db = this.mBinding;
        if (db != null) {
            return db;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    protected final void setMBinding(DB db) {
        Intrinsics.checkNotNullParameter(db, "<set-?>");
        this.mBinding = db;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTAG(getClass().getSimpleName());
        LogUtils.i(getTAG(), "页面激活-DialogFragment：" + getTAG());
        init(getArguments());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        LogUtils.i(getTAG(), "页面销毁-DialogFragment：" + getTAG());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(isCancelable());
            dialog.setCanceledOnTouchOutside(isCanceledOnTouchOutside());
        }
        setWindow();
    }

    private final void setWindow() {
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = getDialogWidth();
            attributes.height = getDialogHeight();
            attributes.gravity = gravity();
            window.getDecorView().setPadding(60, 0, 60, 0);
            window.setAttributes(attributes);
            window.setBackgroundDrawableResource(R.color.transparent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return initBinding(inflater, container);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setMViewModel(createViewModel());
        getLifecycle().addObserver(getMViewModel());
        initViews(savedInstanceState);
        addObserve();
        initData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View initBinding(LayoutInflater inflater, ViewGroup container) {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[1];
            Intrinsics.checkNotNull(type, "null cannot be cast to non-null type java.lang.Class<*>");
            Class cls = (Class) type;
            if (ViewBinding.class.isAssignableFrom(cls) && !Intrinsics.areEqual(cls, ViewBinding.class)) {
                Object invoke = cls.getDeclaredMethod("inflate", LayoutInflater.class).invoke(null, inflater);
                Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type DB of com.wakeup.common.base.BaseDialogFragment");
                setMBinding((ViewBinding) invoke);
                View root = getMBinding().getRoot();
                Intrinsics.checkNotNull(root);
                return root;
            }
            if (layoutId() == 0) {
                throw new IllegalArgumentException("If you don't use ViewBinding, you need to override method layoutId");
            }
            View inflate = inflater.inflate(layoutId(), container, false);
            Intrinsics.checkNotNull(inflate);
            return inflate;
        }
        throw new IllegalArgumentException("Generic error");
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager manager, String tag) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        if (!isAdded()) {
            FragmentTransaction beginTransaction = manager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(beginTransaction, "beginTransaction(...)");
            beginTransaction.add(this, tag);
            beginTransaction.commitAllowingStateLoss();
            return;
        }
        LogUtils.d(getTAG(), " has add to FragmentManager");
    }

    private final VM createViewModel() {
        Type genericSuperclass;
        if (getClass().getGenericSuperclass() instanceof ParameterizedType) {
            genericSuperclass = getClass().getGenericSuperclass();
        } else {
            genericSuperclass = getClass().getSuperclass().getGenericSuperclass();
        }
        Intrinsics.checkNotNull(genericSuperclass, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        Class<BaseViewModel> cls = type instanceof Class ? (Class) type : null;
        if (cls == null) {
            cls = BaseViewModel.class;
        }
        ViewModelStore viewModelStore = isShareVM() ? requireActivity().getViewModelStore() : getViewModelStore();
        Intrinsics.checkNotNull(viewModelStore);
        ViewModelProvider.Factory defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "<get-defaultViewModelProviderFactory>(...)");
        ViewModel viewModel = new ViewModelProvider(viewModelStore, defaultViewModelProviderFactory, null, 4, null).get(cls);
        Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type VM of com.wakeup.common.base.BaseDialogFragment");
        return (VM) viewModel;
    }

    protected final OnDialogListener getMDialogListener() {
        return this.mDialogListener;
    }

    protected final void setMDialogListener(OnDialogListener onDialogListener) {
        this.mDialogListener = onDialogListener;
    }

    public void setListener(OnDialogListener dialogListener) {
        Intrinsics.checkNotNullParameter(dialogListener, "dialogListener");
        this.mDialogListener = dialogListener;
    }
}
