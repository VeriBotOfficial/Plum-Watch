package com.wakeup.feature.sport.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.sport.R;

/* loaded from: classes3.dex */
public final class ItemAlbumListBinding implements ViewBinding {
    public final ImageFilterView ivFeaturedPlaylist;
    public final ImageView ivMusicPlay;
    private final ConstraintLayout rootView;
    public final TextView tvFeaturedPlayContent;
    public final TextView tvSate;
    public final TextView tvSongNum;

    private ItemAlbumListBinding(ConstraintLayout constraintLayout, ImageFilterView imageFilterView, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.ivFeaturedPlaylist = imageFilterView;
        this.ivMusicPlay = imageView;
        this.tvFeaturedPlayContent = textView;
        this.tvSate = textView2;
        this.tvSongNum = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemAlbumListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemAlbumListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_album_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemAlbumListBinding bind(View view) {
        int i = R.id.iv_featured_playlist;
        ImageFilterView imageFilterView = (ImageFilterView) ViewBindings.findChildViewById(view, i);
        if (imageFilterView != null) {
            i = R.id.iv_music_play;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tv_featured_play_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_sate;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.tv_song_num;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new ItemAlbumListBinding((ConstraintLayout) view, imageFilterView, imageView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
