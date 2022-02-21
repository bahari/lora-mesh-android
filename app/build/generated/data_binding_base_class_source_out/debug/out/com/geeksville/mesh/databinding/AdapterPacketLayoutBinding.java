// Generated by view binder compiler. Do not edit!
package com.geeksville.mesh.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.geeksville.mesh.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AdapterPacketLayoutBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final MaterialCardView adapterPacketLayout;

  @NonNull
  public final ImageView cloudDownloadIcon;

  @NonNull
  public final TextView dateReceived;

  @NonNull
  public final TextView rawMessage;

  @NonNull
  public final TextView type;

  private AdapterPacketLayoutBinding(@NonNull MaterialCardView rootView,
      @NonNull MaterialCardView adapterPacketLayout, @NonNull ImageView cloudDownloadIcon,
      @NonNull TextView dateReceived, @NonNull TextView rawMessage, @NonNull TextView type) {
    this.rootView = rootView;
    this.adapterPacketLayout = adapterPacketLayout;
    this.cloudDownloadIcon = cloudDownloadIcon;
    this.dateReceived = dateReceived;
    this.rawMessage = rawMessage;
    this.type = type;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static AdapterPacketLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AdapterPacketLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.adapter_packet_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AdapterPacketLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      MaterialCardView adapterPacketLayout = (MaterialCardView) rootView;

      id = R.id.cloudDownloadIcon;
      ImageView cloudDownloadIcon = rootView.findViewById(id);
      if (cloudDownloadIcon == null) {
        break missingId;
      }

      id = R.id.dateReceived;
      TextView dateReceived = rootView.findViewById(id);
      if (dateReceived == null) {
        break missingId;
      }

      id = R.id.rawMessage;
      TextView rawMessage = rootView.findViewById(id);
      if (rawMessage == null) {
        break missingId;
      }

      id = R.id.type;
      TextView type = rootView.findViewById(id);
      if (type == null) {
        break missingId;
      }

      return new AdapterPacketLayoutBinding((MaterialCardView) rootView, adapterPacketLayout,
          cloudDownloadIcon, dateReceived, rawMessage, type);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}