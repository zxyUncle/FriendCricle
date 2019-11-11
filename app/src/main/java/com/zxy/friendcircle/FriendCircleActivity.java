package com.zxy.friendcircle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.widget.Toast;

import com.zxy.friendcircle.adapter.FriendCircleMainAdapter;
import com.zxy.friendcircle.utils.PhotoLoader;
import com.zxy.friendcircle.utils.comminput.InputTextMsgDialog;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import indi.liyi.viewer.ImageViewer;

/**
 * Created by zxy on 2019/11/10 15:13
 * ******************************************
 * * 朋友圈
 * ******************************************
 */
public class FriendCircleActivity extends AppCompatActivity {
    @BindView(R.id.ivMainimageViewer)
    ImageViewer ivMainimageViewer;
    @BindView(R.id.rvMainFriendCircle)
    RecyclerView rvMainFriendCircle;

    //回复弹出框
    private InputTextMsgDialog inputTextMsgDialog;

    private FriendCircleMainAdapter friendCircleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_circle);
        ButterKnife.bind(this);
        initRecyclerView();//设置主RecyclerView的布局管理器
        initAdapter();//设置适配器的内容
    }

    /**
     * 设置适配器的内容
     */
    private void initAdapter() {
        if (friendCircleAdapter == null) {
            friendCircleAdapter = new FriendCircleMainAdapter(this);
            rvMainFriendCircle.setAdapter(friendCircleAdapter);
            onClickPictureRecyclerView();//图片浏览点击事件
            onClickCommentRecyclerView();//评论回复点击事件
        } else {
            friendCircleAdapter.notifyDataSetChanged();
        }
    }

    /**
     * 图片浏览点击事件
     */
    public void onClickPictureRecyclerView() {
        List<String> list = new ArrayList<>();
        String img = "https://timgsa.baidu.com/timg?image&amp;quality=80&amp;size=b9999_10000&amp;sec=1573388550722&amp;di=a545f3338eec6b45e79a9b62d25869fa&amp;imgtype=0&amp;src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F1%2F58ad3abfe15c0.jpg";
        list.add(img);
        list.add(img);
        list.add(img);
        list.add(img);
        list.add(img);
        list.add(img);
        list.add(img);
        list.add(img);
        list.add(img);
        list.add(img);
        //图片点击事件
        friendCircleAdapter.setOnItemPicationClickListener((firstPosition, secondPosition, gridview) -> {
            ivMainimageViewer.overlayStatusBar(true) // ImageViewer 是否会占据 StatusBar 的空间
                    .imageData(list) // 图片数据
                    .bindViewGroup(gridview) // 目标 viewGroup，例如类似朋友圈中的九宫格控件
                    .imageLoader(new PhotoLoader()) // 设置图片加载方式
                    .playEnterAnim(true) // 是否开启进场动画，默认为true
                    .playExitAnim(true) // 是否开启退场动画，默认为true
                    .duration(300) // 设置进退场动画时间，默认300
                    .showIndex(true) // 是否显示图片索引，默认为true
//                            .loadIndexUI(indexUI) // 自定义索引样式，内置默认样式
//                            .loadProgressUI(progressUI) // 自定义图片加载进度样式，内置默认样式
                    .watch(secondPosition);// 开启浏览
        });
    }

    /**
     * 评论回复点击事件
     */
    private void onClickCommentRecyclerView() {
        //回复弹出框的显示
        inputTextMsgDialog = new InputTextMsgDialog(this, R.style.dialog_center);
        inputTextMsgDialog.setmOnTextSendListener(new InputTextMsgDialog.OnTextSendListener() {
            @Override
            public void onTextSend(String msg) {
                //点击发送按钮后，回调此方法，msg为输入的值

            }
        });
        //评论回复点击事件
        friendCircleAdapter.setOnItemCommentClickListener((firstPosition, secondPosition) -> {
            Toast.makeText(this, "回复评论点击事件", Toast.LENGTH_SHORT).show();
            inputTextMsgDialog.show();
        });
    }

    /**
     * 设置主RecyclerView的布局管理器
     */
    private void initRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvMainFriendCircle.setLayoutManager(linearLayoutManager);
    }


    /**
     * 系统返回键,当图片是放大状态的时候，优先关闭图片
     *
     * @param event KeyEvent
     * @return Boolean
     */
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_BACK) {
            if (ivMainimageViewer.isShown()) {
                ivMainimageViewer.cancel();
            } else {
                onBackPressed();
            }
        }
        return false;
    }
}
