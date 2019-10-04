package com.example.todos.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.todos.model.Category;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class CategoryListItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageCatIcon;

  @NonNull
  public final TextView tvNote;

  @Bindable
  protected Category mCategory;

  protected CategoryListItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageCatIcon, TextView tvNote) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageCatIcon = imageCatIcon;
    this.tvNote = tvNote;
  }

  public abstract void setCategory(@Nullable Category category);

  @Nullable
  public Category getCategory() {
    return mCategory;
  }

  @NonNull
  public static CategoryListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.category_list_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CategoryListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CategoryListItemBinding>inflateInternal(inflater, com.example.todos.R.layout.category_list_item, root, attachToRoot, component);
  }

  @NonNull
  public static CategoryListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.category_list_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CategoryListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CategoryListItemBinding>inflateInternal(inflater, com.example.todos.R.layout.category_list_item, null, false, component);
  }

  public static CategoryListItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static CategoryListItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (CategoryListItemBinding)bind(component, view, com.example.todos.R.layout.category_list_item);
  }
}
