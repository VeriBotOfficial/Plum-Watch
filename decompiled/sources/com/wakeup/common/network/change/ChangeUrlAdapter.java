package com.wakeup.common.network.change;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.wakeup.common.R;
import java.util.List;

/* loaded from: classes2.dex */
public class ChangeUrlAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private Context context;
    private OnitemCLick onitemCLick;
    private List<UrlBean> times;

    public interface OnitemCLick {
        void onclick(String time);
    }

    public ChangeUrlAdapter(Context context, List<UrlBean> times, OnitemCLick onitemCLick) {
        this.context = context;
        this.times = times;
        this.onitemCLick = onitemCLick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item_change_url, parent, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.tvUrl.setText(this.times.get(position).url);
        if (this.times.get(position).ischeckd) {
            holder.ivSelect.setVisibility(0);
        } else {
            holder.ivSelect.setVisibility(8);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.common.network.change.ChangeUrlAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                ChangeUrlAdapter.this.onitemCLick.onclick(((UrlBean) ChangeUrlAdapter.this.times.get(position)).url);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<UrlBean> list = this.times;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView ivSelect;
        TextView tvUrl;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.tvUrl = (TextView) itemView.findViewById(R.id.tv_url);
            this.ivSelect = (ImageView) itemView.findViewById(R.id.iv_select);
        }
    }
}
