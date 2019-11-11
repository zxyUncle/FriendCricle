package com.zxy.friendcircle.adapter;

import android.content.Context;
import android.content.pm.LauncherApps;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.zxy.friendcircle.R;
import com.zxy.friendcircle.bean.FriendListBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by zxy on 2019/11/10 16:12
 * ******************************************
 * * 朋友圈：图片圈子适配器，主适配器中的子适配器
 * ******************************************
 */
public class PictureCircleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private OnItemClickListener onItemClickListener;
    private List<FriendListBean.BodyBean.DataBean.DescBean.ContentObjectBean.MediaListBean.Media> mediaList;

    public PictureCircleAdapter(Context mContext, List<FriendListBean.BodyBean.DataBean.DescBean.ContentObjectBean.MediaListBean.Media> mediaList) {
        this.mContext = mContext;
        this.mediaList = mediaList;
    }

    //点击事件
    public interface OnItemClickListener {
        void onItemClick(int secondPosition);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ItemHolder(LayoutInflater.from(mContext).inflate(R.layout.adapter_main_picture_circle, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ItemHolder itemHolder = (ItemHolder) viewHolder;
        itemHolder.initData(i);
    }

    @Override
    public int getItemCount() {
       return  9;
    }

    class ItemHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.ivPictureAdapterCircle)
        ImageView ivPictureAdapterCircle;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        private void initData(int position) {
            //图片点击事件的回调
            if (onItemClickListener != null) {
                itemView.setOnClickListener(v -> onItemClickListener.onItemClick(position));
            }
            Glide.with(mContext).load("https://timgsa.baidu.com/timg?image&amp;quality=80&amp;size=b9999_10000&amp;sec=1573388550722&amp;di=a545f3338eec6b45e79a9b62d25869fa&amp;imgtype=0&amp;src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F1%2F58ad3abfe15c0.jpg").into(ivPictureAdapterCircle);
//            Glide.with(mContext).load(mediaList.get(position).getThumb()).into(ivPictureAdapterCircle);
        }

    }
}