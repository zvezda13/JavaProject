package com.example.todos.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import com.example.todos.model.Category;
import com.example.todos.model.CategoryList;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityCategoryBinding extends ViewDataBinding {
  @NonNull
  public final Button btnAdd;

  @NonNull
  public final Button btnDelete;

  @NonNull
  public final Button btnSave;

  @NonNull
  public final ListView lvCategories;

  @Bindable
  protected CategoryList mCategories;

  @Bindable
  protected Category mCategory;

  protected ActivityCategoryBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnAdd, Button btnDelete, Button btnSave, ListView lvCategories) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnAdd = btnAdd;
    this.btnDelete = btnDelete;
    this.btnSave = btnSave;
    this.lvCategories = lvCategories;
  }

  public abstract void setCategories(@Nullable CategoryList categories);

  @Nullable
  public CategoryList getCategories() {
    return mCategories;
  }

  public abstract void setCategory(@Nullable Category category);

  @Nullable
  public Category getCategory() {
    return mCategory;
  }

  @NonNull
  public static ActivityCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_category, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityCategoryBinding>inflateInternal(inflater, com.example.todos.R.layout.activity_category, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_category, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityCategoryBinding>inflateInternal(inflater, com.example.todos.R.layout.activity_category, null, false, component);
  }

  public static ActivityCategoryBinding bind(@NonNull View view) {
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
  public static ActivityCategoryBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityCategoryBinding)bind(component, view, com.example.todos.R.layout.activity_category);
  }
}
