// Generated code from Butter Knife. Do not modify!
package com.zxy.friendcircle.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zxy.friendcircle.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PictureCircleAdapter$ItemHolder_ViewBinding implements Unbinder {
  private PictureCircleAdapter.ItemHolder target;

  @UiThread
  public PictureCircleAdapter$ItemHolder_ViewBinding(PictureCircleAdapter.ItemHolder target,
      View source) {
    this.target = target;

    target.ivPictureAdapterCircle = Utils.findRequiredViewAsType(source, R.id.ivPictureAdapterCircle, "field 'ivPictureAdapterCircle'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PictureCircleAdapter.ItemHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivPictureAdapterCircle = null;
  }
}
