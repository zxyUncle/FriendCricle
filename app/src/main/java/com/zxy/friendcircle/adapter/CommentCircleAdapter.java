package com.zxy.friendcircle.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.zxy.friendcircle.R;
import com.zxy.friendcircle.bean.FriendListBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by zxy on 2019/11/10 16:12
 * ******************************************
 * * 朋友圈：评论   圈子适配器，主适配器中的子适配器
 * ******************************************
 */
public class CommentCircleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private Context mContext;
    private OnItemClickListener onItemClickListener;
    private List<FriendListBean.BodyBean.DataBean.CommentBean> list;

    public CommentCircleAdapter(Context mContext, List<FriendListBean.BodyBean.DataBean.CommentBean> list) {
        this.mContext = mContext;
        this.list = list;
    }

    //点击事件
    public interface OnItemClickListener {
        void onItemClick(int commentPosition);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ItemHolder(LayoutInflater.from(mContext).inflate(R.layout.adapter_main_comment_circle, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ItemHolder itemHolder = (ItemHolder) viewHolder;
        itemHolder.initData(i);
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    class ItemHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tvCommentAdapterCircle)
        TextView tvCommentAdapterCircle;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        private void initData(int position) {
            FriendListBean.BodyBean.DataBean.CommentBean commentBean = list.get(position);
            //评论点击事件的回调，回复评论
            if (onItemClickListener != null) {
                itemView.setOnClickListener(v -> onItemClickListener.onItemClick(position));
            }
            if (commentBean.getReply_id().equals("0")) {//正常评论
                tvCommentAdapterCircle.setText(commentBean.getNick_name() + ":" + commentBean.getContent());
            } else {//回复评论
                tvCommentAdapterCircle.setText(commentBean.getNick_name() + " 回复" + commentBean.getReply_user_name() + ":" + commentBean.getContent());
            }

        }

    }
}