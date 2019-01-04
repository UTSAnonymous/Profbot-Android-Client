package com.utsanonymous.profbotandroidclient.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.utsanonymous.profbotandroidclient.view.PercentFrameLayout;
import org.webrtc.SurfaceViewRenderer;

public abstract class ActivityCallBinding extends ViewDataBinding {
  @NonNull
  public final ImageButton buttonCallDisconnect;

  @NonNull
  public final ImageButton buttonCallSwitchCamera;

  @NonNull
  public final ImageButton buttonCallToggleMic;

  @NonNull
  public final LinearLayout buttonsCallContainer;

  @NonNull
  public final FrameLayout callFragmentContainer;

  @NonNull
  public final TextView contactNameCall;

  @NonNull
  public final Button downButton;

  @NonNull
  public final Button emergencyStop;

  @NonNull
  public final Button leftButton;

  @NonNull
  public final PercentFrameLayout localVideoLayout;

  @NonNull
  public final SurfaceViewRenderer localVideoView;

  @NonNull
  public final PercentFrameLayout remoteVideoLayout;

  @NonNull
  public final SurfaceViewRenderer remoteVideoView;

  @NonNull
  public final Button rightButton;

  @NonNull
  public final Button topButton;

  protected ActivityCallBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageButton buttonCallDisconnect, ImageButton buttonCallSwitchCamera,
      ImageButton buttonCallToggleMic, LinearLayout buttonsCallContainer,
      FrameLayout callFragmentContainer, TextView contactNameCall, Button downButton,
      Button emergencyStop, Button leftButton, PercentFrameLayout localVideoLayout,
      SurfaceViewRenderer localVideoView, PercentFrameLayout remoteVideoLayout,
      SurfaceViewRenderer remoteVideoView, Button rightButton, Button topButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonCallDisconnect = buttonCallDisconnect;
    this.buttonCallSwitchCamera = buttonCallSwitchCamera;
    this.buttonCallToggleMic = buttonCallToggleMic;
    this.buttonsCallContainer = buttonsCallContainer;
    this.callFragmentContainer = callFragmentContainer;
    this.contactNameCall = contactNameCall;
    this.downButton = downButton;
    this.emergencyStop = emergencyStop;
    this.leftButton = leftButton;
    this.localVideoLayout = localVideoLayout;
    this.localVideoView = localVideoView;
    this.remoteVideoLayout = remoteVideoLayout;
    this.remoteVideoView = remoteVideoView;
    this.rightButton = rightButton;
    this.topButton = topButton;
  }

  @NonNull
  public static ActivityCallBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCallBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCallBinding>inflate(inflater, com.utsanonymous.profbotandroidclient.R.layout.activity_call, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCallBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCallBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCallBinding>inflate(inflater, com.utsanonymous.profbotandroidclient.R.layout.activity_call, null, false, component);
  }

  public static ActivityCallBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityCallBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityCallBinding)bind(component, view, com.utsanonymous.profbotandroidclient.R.layout.activity_call);
  }
}
