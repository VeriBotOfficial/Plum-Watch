package com.wakeup.feature.device.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.blankj.utilcode.util.SPUtils;
import com.contrarywind.listener.OnItemSelectedListener;
import com.contrarywind.view.WheelView;
import com.wakeup.common.Constants;
import com.wakeup.commonui.adapter.ArrayWheelAdapter;
import com.wakeup.feature.device.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class SetShortVideoLikeDialog extends Dialog {
    private OnSetShortVideoLikeCallBack callBack;
    private final List<String> mList;
    WheelView mWheelView;
    private int mlikeNum;
    TextView tvConfirm;

    public interface OnSetShortVideoLikeCallBack {
        void onSelectVideoLikeNum(int i);
    }

    public SetShortVideoLikeDialog(Context context, int i) {
        super(context);
        this.mlikeNum = i;
        setCanceledOnTouchOutside(true);
        setContentView(R.layout.dialog_setheight);
        this.mWheelView = (WheelView) findViewById(R.id.wheel_view);
        this.tvConfirm = (TextView) findViewById(com.wakeup.commonui.R.id.tv_confirm);
        this.mList = new ArrayList();
        for (int i2 = 1; i2 <= 100; i2++) {
            this.mList.add(String.valueOf(i2));
        }
        this.mWheelView.setTextColorCenter(context.getResources().getColor(com.wakeup.commonui.R.color.color_ec7445));
        this.mWheelView.setTextColorOut(context.getResources().getColor(com.wakeup.commonui.R.color.textGray));
        this.mWheelView.setTextSize(30.0f);
        this.mWheelView.setDividerColor(context.getResources().getColor(com.wakeup.commonui.R.color.transp));
        this.mWheelView.setAdapter(new ArrayWheelAdapter(this.mList));
        this.mWheelView.setCurrentItem(this.mlikeNum - 1);
        this.mWheelView.setOnItemSelectedListener(new OnItemSelectedListener() { // from class: com.wakeup.feature.device.dialog.SetShortVideoLikeDialog.1
            @Override // com.contrarywind.listener.OnItemSelectedListener
            public void onItemSelected(int i3) {
                SetShortVideoLikeDialog.this.mlikeNum = i3 + 1;
            }
        });
        this.tvConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.device.dialog.SetShortVideoLikeDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SPUtils.getInstance().put(Constants.SPKey.SHORT_VIDEO_LIKE_NUM_KEY, SetShortVideoLikeDialog.this.mlikeNum);
                SetShortVideoLikeDialog.this.callBack.onSelectVideoLikeNum(SetShortVideoLikeDialog.this.mlikeNum);
                SetShortVideoLikeDialog.this.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(0);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        window.setLayout(displayMetrics.widthPixels, window.getAttributes().height);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }

    public void setCallBack(OnSetShortVideoLikeCallBack onSetShortVideoLikeCallBack) {
        this.callBack = onSetShortVideoLikeCallBack;
    }
}
