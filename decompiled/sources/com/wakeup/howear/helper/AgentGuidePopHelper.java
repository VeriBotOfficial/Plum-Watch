package com.wakeup.howear.helper;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.blankj.utilcode.util.ImageUtils;
import com.wakeup.common.network.entity.travelAgent.TravelAgentPopImgBean;
import com.wakeup.commonui.utils.ImageUtil;
import com.wakeup.commonui.utils.UIHelper;
import com.wakeup.howear.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public class AgentGuidePopHelper {
    private static String TAG = "AgentGuidePopHelper";
    private static volatile AgentGuidePopHelper instance;
    private AnimatorSet animatorSet;
    private boolean isPauseShow = false;

    public interface GuidePopInterface {
        void onGuidePopFinish();

        void onGuidePopStep(int i);
    }

    public interface LBSPopInterface {
        void onLBSPopFinish();
    }

    private AgentGuidePopHelper() {
    }

    public static AgentGuidePopHelper getInstance() {
        if (instance == null) {
            synchronized (AgentGuidePopHelper.class) {
                if (instance == null) {
                    instance = new AgentGuidePopHelper();
                }
            }
        }
        return instance;
    }

    public void showGuidePop(final ArrayList<TravelAgentPopImgBean> arrayList, final ImageView imageView, final Context context, final int i, final GuidePopInterface guidePopInterface) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        }
        if (i >= arrayList.size()) {
            if (guidePopInterface != null) {
                guidePopInterface.onGuidePopFinish();
            }
        } else {
            if (this.isPauseShow) {
                return;
            }
            TravelAgentPopImgBean travelAgentPopImgBean = arrayList.get(i);
            if (travelAgentPopImgBean.getHeight() == 0 || travelAgentPopImgBean.getWidth() == 0 || travelAgentPopImgBean.getUrl().isEmpty()) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.width = UIHelper.dp2px((travelAgentPopImgBean.getWidth() * 2) / 3);
            layoutParams.height = UIHelper.dp2px((travelAgentPopImgBean.getHeight() * 2) / 3);
            imageView.setLayoutParams(layoutParams);
            ImageUtil.loadBitmap(travelAgentPopImgBean.getUrl(), travelAgentPopImgBean.getWidth(), travelAgentPopImgBean.getHeight(), new Function1<Bitmap, Unit>() { // from class: com.wakeup.howear.helper.AgentGuidePopHelper.1
                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Bitmap bitmap) {
                    if (bitmap != null) {
                        imageView.setImageDrawable(ImageUtils.bitmap2Drawable(bitmap));
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, R.animator.animator_bubble_fade_in);
                        loadAnimator.setTarget(imageView);
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(3000L);
                        Animator loadAnimator2 = AnimatorInflater.loadAnimator(context, R.animator.animator_bubble_fade_out);
                        loadAnimator2.setTarget(imageView);
                        AgentGuidePopHelper.this.animatorSet = new AnimatorSet();
                        AgentGuidePopHelper.this.animatorSet.playSequentially(loadAnimator, duration, loadAnimator2);
                        Context context2 = context;
                        if ((context2 instanceof Activity) && (((Activity) context2).isFinishing() || ((Activity) context).isDestroyed())) {
                            return null;
                        }
                        AgentGuidePopHelper.this.animatorSet.start();
                        int i2 = i;
                        final int i3 = i2 + 1;
                        GuidePopInterface guidePopInterface2 = guidePopInterface;
                        if (guidePopInterface2 != null) {
                            guidePopInterface2.onGuidePopStep(i2 + 1);
                        }
                        loadAnimator2.addListener(new AnimatorListenerAdapter() { // from class: com.wakeup.howear.helper.AgentGuidePopHelper.1.1
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                AgentGuidePopHelper.this.showGuidePop(arrayList, imageView, context, i3, guidePopInterface);
                            }
                        });
                    }
                    return null;
                }
            });
        }
    }

    public void releaseAnimator() {
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.animatorSet.removeAllListeners();
            this.animatorSet = null;
        }
    }

    public void setAnimatorPause(boolean z) {
        this.isPauseShow = z;
    }

    public boolean getAnimatorPause() {
        return this.isPauseShow;
    }
}
