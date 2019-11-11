// Generated code from Butter Knife. Do not modify!
package com.zxy.friendcircle.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zxy.friendcircle.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FriendCircleMainAdapter$ItemHolder_ViewBinding implements Unbinder {
  private FriendCircleMainAdapter.ItemHolder target;

  @UiThread
  public FriendCircleMainAdapter$ItemHolder_ViewBinding(FriendCircleMainAdapter.ItemHolder target,
      View source) {
    this.target = target;

    target.tvNameMainCircle = Utils.findRequiredViewAsType(source, R.id.tvNameMainCircle, "field 'tvNameMainCircle'", TextView.class);
    target.tvContentMainCircle = Utils.findRequiredViewAsType(source, R.id.tvContentMainCircle, "field 'tvContentMainCircle'", TextView.class);
    target.rvPictureAdapterMainCircle = Utils.findRequiredViewAsType(source, R.id.rvPictureAdapterMainCircle, "field 'rvPictureAdapterMainCircle'", RecyclerView.class);
    target.tvTimeAdapterMainCircle = Utils.findRequiredViewAsType(source, R.id.tvTimeAdapterMainCircle, "field 'tvTimeAdapterMainCircle'", TextView.class);
    target.ivCommentAdapterMainCircle = Utils.findRequiredViewAsType(source, R.id.ivCommentAdapterMainCircle, "field 'ivCommentAdapterMainCircle'", ImageView.class);
    target.rvCommentAdapterMainCircle = Utils.findRequiredViewAsType(source, R.id.rvCommentAdapterMainCircle, "field 'rvCommentAdapterMainCircle'", RecyclerView.class);
    target.tvPraiseAdapterMainCircle = Utils.findRequiredViewAsType(source, R.id.tvPraiseAdapterMainCircle, "field 'tvPraiseAdapterMainCircle'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FriendCircleMainAdapter.ItemHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvNameMainCircle = null;
    target.tvContentMainCircle = null;
    target.rvPictureAdapterMainCircle = null;
    target.tvTimeAdapterMainCircle = null;
    target.ivCommentAdapterMainCircle = null;
    target.rvCommentAdapterMainCircle = null;
    target.tvPraiseAdapterMainCircle = null;
  }
}
