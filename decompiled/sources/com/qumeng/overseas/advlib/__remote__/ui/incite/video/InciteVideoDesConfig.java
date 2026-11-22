package com.qumeng.overseas.advlib.__remote__.ui.incite.video;

import android.text.SpannableString;
import com.qumeng.overseas.advlib.R;

/* loaded from: classes17.dex */
public class InciteVideoDesConfig {
    public static final String WITHDRAW_FINISH = "-999";
    private boolean isShowComplainBtn;
    private SpannableString spannableString;
    private String countdown_award_des = com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getResources().getString(R.string.qm_oversea_local_claimable_reward_new);
    private String close_dialog_title = com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getString(R.string.qm_oversea_local_task_prompt);
    private String close_dialog_des = com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getString(R.string.qm_oversea_local_watch_full_ad_for_rewards);
    private String close_dialog_exit_des = com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getString(R.string.qm_oversea_give_up_reward);
    private String close_dialog_continue_btn_des = com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getString(R.string.qm_oversea_local_keep_watching);
    private String countdown_wait_des = com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getString(R.string.qm_oversea_local_the_reward_will_arrive_soon);
    private String countdown_success_des = com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getString(R.string.qm_oversea_local_the_reward_has_arrived);
    private String countdown_repeat_des = com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getString(R.string.qm_oversea_local_the_reward_cannot_repeated);
    private String countdown_fail_des = com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getString(R.string.qm_oversea_local_the_reward_failure);
    private String countdown_icon_light_url = "https://cdn.adseye.com/nsdk/res/imgstatic/incite_video_coin_light.png";
    private String countdown_icon_gray_url = "https://cdn.adseye.com/nsdk/res/imgstatic/incite_video_coin_gray.png";
    private String amount = "";

    public String getAmount() {
        return this.amount;
    }

    public String getClose_dialog_continue_btn_des() {
        return this.close_dialog_continue_btn_des;
    }

    public String getClose_dialog_des() {
        return this.close_dialog_des;
    }

    public String getClose_dialog_exit_des() {
        return this.close_dialog_exit_des;
    }

    public String getClose_dialog_title() {
        return this.close_dialog_title;
    }

    public String getCountdown_award_des() {
        return this.countdown_award_des;
    }

    public String getCountdown_fail_des() {
        return this.countdown_fail_des;
    }

    public String getCountdown_icon_gray_url() {
        return this.countdown_icon_gray_url;
    }

    public String getCountdown_icon_light_url() {
        return this.countdown_icon_light_url;
    }

    public String getCountdown_repeat_des() {
        return this.countdown_repeat_des;
    }

    public String getCountdown_success_des() {
        return this.countdown_success_des;
    }

    public String getCountdown_wait_des() {
        return this.countdown_wait_des;
    }

    public SpannableString getSpannableString() {
        return this.spannableString;
    }

    public boolean isShowComplainBtn() {
        return this.isShowComplainBtn;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setClose_dialog_continue_btn_des(String str) {
        this.close_dialog_continue_btn_des = str;
    }

    public void setClose_dialog_des(String str) {
        this.close_dialog_des = str;
    }

    public void setClose_dialog_exit_des(String str) {
        this.close_dialog_exit_des = str;
    }

    public void setClose_dialog_title(String str) {
        this.close_dialog_title = str;
    }

    public void setCountdown_award_des(String str) {
        this.countdown_award_des = str;
    }

    public void setCountdown_fail_des(String str) {
        this.countdown_fail_des = str;
    }

    public void setCountdown_icon_gray_url(String str) {
        this.countdown_icon_gray_url = str;
    }

    public void setCountdown_icon_light_url(String str) {
        this.countdown_icon_light_url = str;
    }

    public void setCountdown_repeat_des(String str) {
        this.countdown_repeat_des = str;
    }

    public void setCountdown_success_des(String str) {
        this.countdown_success_des = str;
    }

    public void setCountdown_wait_des(String str) {
        this.countdown_wait_des = str;
    }

    public void setShowComplainBtn(boolean z) {
        this.isShowComplainBtn = z;
    }

    public void setSpannableString(SpannableString spannableString) {
        this.spannableString = spannableString;
    }
}
