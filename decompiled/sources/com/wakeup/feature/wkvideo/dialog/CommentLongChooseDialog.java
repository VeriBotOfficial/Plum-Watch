package com.wakeup.feature.wkvideo.dialog;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.Observer;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.feature.wkvideo.databinding.DialogCommentChooseBinding;
import com.wakeup.module.record.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommentLongChooseDialog.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/wakeup/feature/wkvideo/dialog/CommentLongChooseDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/feature/wkvideo/databinding/DialogCommentChooseBinding;", "context", "Landroid/content/Context;", "callback", "Landroidx/lifecycle/Observer;", "", "isDeleteDialog", "", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/Observer;Z)V", "onClickListener", "Landroid/view/View$OnClickListener;", "initViews", "", Constants.ON_START_KEY, "Companion", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CommentLongChooseDialog extends BaseDialog<DialogCommentChooseBinding> {
    public static final int COMMENT = 1;
    public static final int DELETE = 3;
    public static final int REPORT = 2;
    private final Observer<Integer> callback;
    private final boolean isDeleteDialog;
    private final View.OnClickListener onClickListener;

    public /* synthetic */ CommentLongChooseDialog(Context context, Observer observer, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, observer, (i & 4) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentLongChooseDialog(Context context, Observer<Integer> callback, boolean z) {
        super(context, R.style.fullDialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
        this.isDeleteDialog = z;
        this.onClickListener = new View.OnClickListener() { // from class: com.wakeup.feature.wkvideo.dialog.CommentLongChooseDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommentLongChooseDialog.onClickListener$lambda$0(CommentLongChooseDialog.this, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClickListener$lambda$0(CommentLongChooseDialog commentLongChooseDialog, View view) {
        if (Intrinsics.areEqual(commentLongChooseDialog.getMBinding().tvComment, view)) {
            commentLongChooseDialog.callback.onChanged(1);
        } else if (Intrinsics.areEqual(commentLongChooseDialog.getMBinding().tvReport, view)) {
            commentLongChooseDialog.callback.onChanged(2);
        } else if (Intrinsics.areEqual(commentLongChooseDialog.getMBinding().tvDelete, view)) {
            commentLongChooseDialog.callback.onChanged(3);
        }
        commentLongChooseDialog.dismiss();
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        if (this.isDeleteDialog) {
            getMBinding().tvReport.setVisibility(8);
            getMBinding().tvDelete.setVisibility(0);
        }
        getMBinding().tvComment.setOnClickListener(this.onClickListener);
        getMBinding().tvReport.setOnClickListener(this.onClickListener);
        getMBinding().tvDelete.setOnClickListener(this.onClickListener);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
    }
}
