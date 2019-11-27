// Generated code from Butter Knife. Do not modify!
package com.zxy.friendcircle.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zxy.friendcircle.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CommentCircleAdapter$ItemHolder_ViewBinding implements Unbinder {
  private CommentCircleAdapter.ItemHolder target;

  @UiThread
  public CommentCircleAdapter$ItemHolder_ViewBinding(CommentCircleAdapter.ItemHolder target,
      View source) {
    this.target = target;

    target.tvCommentAdapterCircle = Utils.findRequiredViewAsType(source, R.id.tvCommentAdapterCircle, "field 'tvCommentAdapterCircle'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CommentCircleAdapter.ItemHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvCommentAdapterCircle = null;
  }
}
