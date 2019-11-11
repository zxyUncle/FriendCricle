package com.zxy.friendcircle.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.zxy.friendcircle.R;
import com.zxy.friendcircle.bean.FriendListBean;
import com.zxy.friendcircle.utils.TimeUitls;
import com.zxy.friendcircle.utils.comminput.InputTextMsgDialog;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by zxy on 2019/11/10 15:13
 * ******************************************
 * * 朋友圈一级主适配器
 * ******************************************
 */
public class FriendCircleMainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private OnItemPicationClickListener onItemPicationClickListener; //图片点击放大
    private OnItemCommentClickListener onItemCommentClickListener; //评论回复点击
    //设置图片适配器
    private PictureCircleAdapter pictureCircleAdapter;
    //设置评论适配器
    CommentCircleAdapter commentCircleAdapter;
    private List<FriendListBean.BodyBean.DataBean> list;//数据源

    public FriendCircleMainAdapter(Context mContext, List<FriendListBean.BodyBean.DataBean> list) {
        this.mContext = mContext;
        this.list = list;
    }

    //图片点击放大
    public interface OnItemPicationClickListener {
        void onItemClick(int firstPosition, int secondPosition, ViewGroup gridview);
    }

    public void setOnItemPicationClickListener(OnItemPicationClickListener onItemPicationClickListener) {
        this.onItemPicationClickListener = onItemPicationClickListener;
    }

    //评论回复点击
    public interface OnItemCommentClickListener {
        void onItemClick(int firstPosition, int secondPosition);
    }

    public void setOnItemCommentClickListener(OnItemCommentClickListener onItemCommentClickListener) {
        this.onItemCommentClickListener = onItemCommentClickListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ItemHolder(LayoutInflater.from(mContext).inflate(R.layout.adapter_main_circle, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ItemHolder itemHolder = (ItemHolder) viewHolder;
        initData(itemHolder, i);
    }

    private void initData(ItemHolder itemHolder, int position) {
//        FriendListBean.BodyBean.DataBean dataBean = list.get(position);
//        //设置姓名
//        itemHolder.tvNameMainCircle.setText(dataBean.getNickName());
//        //设置内容
//        itemHolder.tvContentMainCircle.setText(dataBean.getDesc().getContentDesc());
//        //设置时间
//        String time = TimeUitls.timeStamp2Date(Long.parseLong(dataBean.getDesc().getCreateTime()), null);
//        itemHolder.tvTimeAdapterMainCircle.setText(time);

        //设置图片GridLayoutManager布局管理器
        GridLayoutManager gridLayoutManager = new GridLayoutManager(mContext, 3);
        itemHolder.rvPictureAdapterMainCircle.setLayoutManager(gridLayoutManager);
        //设置图片适配器
        pictureCircleAdapter = new PictureCircleAdapter(mContext, null);
        itemHolder.rvPictureAdapterMainCircle.setAdapter(pictureCircleAdapter);
        pictureCircleAdapter.setOnItemClickListener(secondPosition -> {
            onItemPicationClickListener.onItemClick(position, secondPosition, itemHolder.rvPictureAdapterMainCircle);
        });

        //设置评论GridLayoutManager布局管理器
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext);
        itemHolder.rvCommentAdapterMainCircle.setLayoutManager(linearLayoutManager);
        //设置评论适配器
        commentCircleAdapter = new CommentCircleAdapter(mContext,null);
        itemHolder.rvCommentAdapterMainCircle.setAdapter(commentCircleAdapter);
        commentCircleAdapter.setOnItemClickListener(commentPosition -> { //回复评论点击事件
            onItemCommentClickListener.onItemClick(position, commentPosition);
        });

        //设置点赞，评论点击事件
        itemHolder.ivCommentAdapterMainCircle.setOnClickListener(v -> {

        });
        //点赞人
        itemHolder.tvPraiseAdapterMainCircle.setText("张三,李四");

    }

    @Override
    public int getItemCount() {
        return 9;
    }

    class ItemHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tvNameMainCircle)
        TextView tvNameMainCircle; //名字
        @BindView(R.id.tvContentMainCircle)
        TextView tvContentMainCircle;//内容
        @BindView(R.id.rvPictureAdapterMainCircle)
        RecyclerView rvPictureAdapterMainCircle;//图片列表
        @BindView(R.id.tvTimeAdapterMainCircle)
        TextView tvTimeAdapterMainCircle;//时间
        @BindView(R.id.ivCommentAdapterMainCircle)
        ImageView ivCommentAdapterMainCircle;//评论，点赞图标
        @BindView(R.id.rvCommentAdapterMainCircle)
        RecyclerView rvCommentAdapterMainCircle;//评论列表
        @BindView(R.id.tvPraiseAdapterMainCircle)
        TextView tvPraiseAdapterMainCircle; //点赞人员

        private ItemHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
