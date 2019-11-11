// Generated code from Butter Knife. Do not modify!
package com.zxy.friendcircle;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import indi.liyi.viewer.ImageViewer;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FriendCircleActivity_ViewBinding implements Unbinder {
  private FriendCircleActivity target;

  @UiThread
  public FriendCircleActivity_ViewBinding(FriendCircleActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FriendCircleActivity_ViewBinding(FriendCircleActivity target, View source) {
    this.target = target;

    target.ivMainimageViewer = Utils.findRequiredViewAsType(source, R.id.ivMainimageViewer, "field 'ivMainimageViewer'", ImageViewer.class);
    target.rvMainFriendCircle = Utils.findRequiredViewAsType(source, R.id.rvMainFriendCircle, "field 'rvMainFriendCircle'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FriendCircleActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivMainimageViewer = null;
    target.rvMainFriendCircle = null;
  }
}
