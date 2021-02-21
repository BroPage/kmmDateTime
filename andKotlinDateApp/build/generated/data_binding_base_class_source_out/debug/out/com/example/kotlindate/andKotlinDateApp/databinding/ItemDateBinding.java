// Generated by view binder compiler. Do not edit!
package com.example.kotlindate.andKotlinDateApp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.example.kotlindate.andKotlinDateApp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemDateBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView dateName;

  @NonNull
  public final TextView dateValue;

  private ItemDateBinding(@NonNull CardView rootView, @NonNull TextView dateName,
      @NonNull TextView dateValue) {
    this.rootView = rootView;
    this.dateName = dateName;
    this.dateValue = dateValue;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemDateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemDateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_date, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemDateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dateName;
      TextView dateName = rootView.findViewById(id);
      if (dateName == null) {
        break missingId;
      }

      id = R.id.dateValue;
      TextView dateValue = rootView.findViewById(id);
      if (dateValue == null) {
        break missingId;
      }

      return new ItemDateBinding((CardView) rootView, dateName, dateValue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
