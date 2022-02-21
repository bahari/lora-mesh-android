// Generated by view binder compiler. Do not edit!
package com.geeksville.mesh.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.geeksville.mesh.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final ImageView appIconImageVIew;

  @NonNull
  public final FrameLayout mainActivityLayout;

  @NonNull
  public final ViewPager2 pager;

  @NonNull
  public final TabLayout tabLayout;

  @NonNull
  public final TextView title;

  @NonNull
  public final MaterialToolbar toolbar;

  private ActivityMainBinding(@NonNull FrameLayout rootView, @NonNull AppBarLayout appBarLayout,
      @NonNull ImageView appIconImageVIew, @NonNull FrameLayout mainActivityLayout,
      @NonNull ViewPager2 pager, @NonNull TabLayout tabLayout, @NonNull TextView title,
      @NonNull MaterialToolbar toolbar) {
    this.rootView = rootView;
    this.appBarLayout = appBarLayout;
    this.appIconImageVIew = appIconImageVIew;
    this.mainActivityLayout = mainActivityLayout;
    this.pager = pager;
    this.tabLayout = tabLayout;
    this.title = title;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appBarLayout;
      AppBarLayout appBarLayout = rootView.findViewById(id);
      if (appBarLayout == null) {
        break missingId;
      }

      id = R.id.appIconImageVIew;
      ImageView appIconImageVIew = rootView.findViewById(id);
      if (appIconImageVIew == null) {
        break missingId;
      }

      FrameLayout mainActivityLayout = (FrameLayout) rootView;

      id = R.id.pager;
      ViewPager2 pager = rootView.findViewById(id);
      if (pager == null) {
        break missingId;
      }

      id = R.id.tab_layout;
      TabLayout tabLayout = rootView.findViewById(id);
      if (tabLayout == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = rootView.findViewById(id);
      if (title == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityMainBinding((FrameLayout) rootView, appBarLayout, appIconImageVIew,
          mainActivityLayout, pager, tabLayout, title, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}