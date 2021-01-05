// Generated code from Butter Knife. Do not modify!
package com.example.fakewechat.ui.communicat.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.fakewechat.R;
import com.example.fakewechat.ui.communicat.widget.StateButton;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChatActivity_ViewBinding implements Unbinder {
  private ChatActivity target;

  private View view7f080066;

  @UiThread
  public ChatActivity_ViewBinding(ChatActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ChatActivity_ViewBinding(final ChatActivity target, View source) {
    this.target = target;

    View view;
    target.mLlContent = Utils.findRequiredViewAsType(source, R.id.llContent, "field 'mLlContent'", LinearLayout.class);
    target.mRvChat = Utils.findRequiredViewAsType(source, R.id.rv_chat_list, "field 'mRvChat'", RecyclerView.class);
    target.mEtContent = Utils.findRequiredViewAsType(source, R.id.et_content, "field 'mEtContent'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_send, "field 'mBtnSend' and method 'onViewClicked'");
    target.mBtnSend = Utils.castView(view, R.id.btn_send, "field 'mBtnSend'", StateButton.class);
    view7f080066 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.mSwipeRefresh = Utils.findRequiredViewAsType(source, R.id.swipe_chat, "field 'mSwipeRefresh'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChatActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mLlContent = null;
    target.mRvChat = null;
    target.mEtContent = null;
    target.mBtnSend = null;
    target.mSwipeRefresh = null;

    view7f080066.setOnClickListener(null);
    view7f080066 = null;
  }
}
