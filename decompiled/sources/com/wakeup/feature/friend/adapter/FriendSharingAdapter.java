package com.wakeup.feature.friend.adapter;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.wakeup.common.utils.StringUtils;
import com.wakeup.commonui.viewHolder.BaseAdapter;
import com.wakeup.commonui.viewHolder.BaseViewHolder;
import com.wakeup.feature.friend.R;
import com.wakeup.feature.friend.databinding.ItemFriendShareBinding;
import com.wakeup.feature.friend.model.ShareItemModel;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public class FriendSharingAdapter extends BaseAdapter<ShareItemModel, ItemFriendShareBinding> {
    public FriendSharingAdapter(List<ShareItemModel> list) {
        super(new Function3() { // from class: com.wakeup.feature.friend.adapter.FriendSharingAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ItemFriendShareBinding.inflate((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
            }
        }, list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder<ItemFriendShareBinding> baseViewHolder, ShareItemModel shareItemModel) {
        int type = shareItemModel.getType();
        ItemFriendShareBinding binding = baseViewHolder.getBinding();
        switch (type) {
            case 1:
                binding.ivIcon.setImageResource(R.drawable.icon_share_step);
                binding.tvTitle.setText(StringUtils.getString(com.wakeup.commonui.R.string.step));
                binding.tvConnect.setText(Html.fromHtml("<big> <font color=\"#000000\">" + shareItemModel.getData1() + "</font> </big>" + StringUtils.getString(com.wakeup.commonui.R.string.set_bu)));
                break;
            case 2:
                binding.ivIcon.setImageResource(R.drawable.icon_share_mileage);
                binding.tvTitle.setText(StringUtils.getString(com.wakeup.commonui.R.string.home_reliang));
                binding.tvConnect.setText(Html.fromHtml("<big> <font size=\"18sp\" color=\"#000000\">" + shareItemModel.getData1() + "</font> </big>" + StringUtils.getString(com.wakeup.commonui.R.string.unit_gongli)));
                break;
            case 3:
                binding.ivIcon.setImageResource(R.drawable.icon_share_heat);
                binding.tvTitle.setText(StringUtils.getString(com.wakeup.commonui.R.string.home_reliang));
                binding.tvConnect.setText(Html.fromHtml("<big> <font color=\"#000000\">" + shareItemModel.getData1() + "</font> </big>" + StringUtils.getString(com.wakeup.commonui.R.string.home_qianka)));
                break;
            case 4:
                binding.ivIcon.setImageResource(R.drawable.icon_share_heart);
                binding.tvTitle.setText(StringUtils.getString(com.wakeup.commonui.R.string.home_xinlv));
                binding.tvConnect.setText(Html.fromHtml("<big> <font size=\"18sp\" color=\"#000000\">" + shareItemModel.getData1() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + shareItemModel.getData2() + "</font> </big>" + StringUtils.getString(com.wakeup.commonui.R.string.qinyou_cifenzhong)));
                break;
            case 5:
                binding.ivIcon.setImageResource(R.drawable.icon_share_bloodoxygen);
                binding.tvTitle.setText(StringUtils.getString(com.wakeup.commonui.R.string.home_xueyang));
                binding.tvConnect.setText(Html.fromHtml("<big> <font color=\"#000000\">" + shareItemModel.getData1() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + shareItemModel.getData2() + "</font> </big>%"));
                break;
            case 6:
                binding.ivIcon.setImageResource(R.drawable.icon_share_bloodpressure);
                binding.tvTitle.setText(StringUtils.getString(com.wakeup.commonui.R.string.home_xueya));
                binding.tvConnect.setText(Html.fromHtml("<big> <font size=\"18sp\" color=\"#000000\">" + shareItemModel.getData1() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + shareItemModel.getData2() + "</font> </big>" + StringUtils.getString(com.wakeup.commonui.R.string.qinyou_haomigongzhu)));
                break;
            case 7:
                binding.ivIcon.setImageResource(R.drawable.icon_share_sleep);
                binding.tvTitle.setText(StringUtils.getString(com.wakeup.commonui.R.string.home_shuimian));
                int data1 = ((int) shareItemModel.getData1()) / 60;
                binding.tvConnect.setText(Html.fromHtml("<big> <font color=\"#000000\">" + data1 + "</font> </big>" + StringUtils.getString(com.wakeup.commonui.R.string.home_xiaoshi) + "<big> <font size=\"18sp\" color=\"#000000\">" + (((int) shareItemModel.getData1()) - (data1 * 60)) + "</font> </big>" + StringUtils.getString(com.wakeup.commonui.R.string.shuimian_fenzhong)));
                break;
            case 8:
                binding.ivIcon.setImageResource(R.drawable.icon_share_glucose);
                binding.tvTitle.setText(StringUtils.getString(com.wakeup.commonui.R.string.tip_21_0819_02));
                binding.tvConnect.setText(Html.fromHtml("<big> <font size=\"18sp\" color=\"#000000\">" + shareItemModel.getData1() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + shareItemModel.getData2() + "</font> </big>mmol/L"));
                break;
            case 9:
                binding.ivIcon.setImageResource(R.drawable.icon_share_fatigue);
                binding.tvTitle.setText(StringUtils.getString(com.wakeup.commonui.R.string.home_pilaodu));
                binding.tvConnect.setText(Html.fromHtml("<big> <font size=\"18sp\" color=\"#000000\">" + shareItemModel.getData1() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + shareItemModel.getData2() + "</font> </big>"));
                break;
            case 10:
                binding.ivIcon.setImageResource(R.drawable.icon_share_breath);
                binding.tvTitle.setText(StringUtils.getString(com.wakeup.commonui.R.string.tip_21_0819_03));
                binding.tvConnect.setText(Html.fromHtml("<big> <font size=\"18sp\" color=\"#000000\">" + shareItemModel.getData1() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + shareItemModel.getData2() + "</font> </big>" + StringUtils.getString(com.wakeup.commonui.R.string.youxiaohuodong_ci)));
                break;
        }
    }
}
