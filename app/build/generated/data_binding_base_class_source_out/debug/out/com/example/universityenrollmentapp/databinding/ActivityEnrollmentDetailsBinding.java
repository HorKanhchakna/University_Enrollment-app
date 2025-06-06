// Generated by view binder compiler. Do not edit!
package com.example.universityenrollmentapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.universityenrollmentapp.R;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEnrollmentDetailsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialToolbar appBar;

  @NonNull
  public final TextView enrollmentDateTextView;

  @NonNull
  public final TextView paymentIdTextView;

  @NonNull
  public final TextView phoneNumberTextView;

  @NonNull
  public final TextView studentNameTextView;

  private ActivityEnrollmentDetailsBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialToolbar appBar, @NonNull TextView enrollmentDateTextView,
      @NonNull TextView paymentIdTextView, @NonNull TextView phoneNumberTextView,
      @NonNull TextView studentNameTextView) {
    this.rootView = rootView;
    this.appBar = appBar;
    this.enrollmentDateTextView = enrollmentDateTextView;
    this.paymentIdTextView = paymentIdTextView;
    this.phoneNumberTextView = phoneNumberTextView;
    this.studentNameTextView = studentNameTextView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEnrollmentDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEnrollmentDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_enrollment_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEnrollmentDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appBar;
      MaterialToolbar appBar = ViewBindings.findChildViewById(rootView, id);
      if (appBar == null) {
        break missingId;
      }

      id = R.id.enrollmentDateTextView;
      TextView enrollmentDateTextView = ViewBindings.findChildViewById(rootView, id);
      if (enrollmentDateTextView == null) {
        break missingId;
      }

      id = R.id.paymentIdTextView;
      TextView paymentIdTextView = ViewBindings.findChildViewById(rootView, id);
      if (paymentIdTextView == null) {
        break missingId;
      }

      id = R.id.phoneNumberTextView;
      TextView phoneNumberTextView = ViewBindings.findChildViewById(rootView, id);
      if (phoneNumberTextView == null) {
        break missingId;
      }

      id = R.id.studentNameTextView;
      TextView studentNameTextView = ViewBindings.findChildViewById(rootView, id);
      if (studentNameTextView == null) {
        break missingId;
      }

      return new ActivityEnrollmentDetailsBinding((LinearLayout) rootView, appBar,
          enrollmentDateTextView, paymentIdTextView, phoneNumberTextView, studentNameTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
