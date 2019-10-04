package com.example.todos.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import com.example.todos.model.Todo;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityTodoBinding extends ViewDataBinding {
  @NonNull
  public final EditText editExpiryDate;

  @NonNull
  public final EditText editTodo;

  @NonNull
  public final Spinner spCategories;

  @Bindable
  protected Todo mTodo;

  protected ActivityTodoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText editExpiryDate, EditText editTodo, Spinner spCategories) {
    super(_bindingComponent, _root, _localFieldCount);
    this.editExpiryDate = editExpiryDate;
    this.editTodo = editTodo;
    this.spCategories = spCategories;
  }

  public abstract void setTodo(@Nullable Todo todo);

  @Nullable
  public Todo getTodo() {
    return mTodo;
  }

  @NonNull
  public static ActivityTodoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_todo, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTodoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityTodoBinding>inflateInternal(inflater, com.example.todos.R.layout.activity_todo, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityTodoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_todo, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTodoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityTodoBinding>inflateInternal(inflater, com.example.todos.R.layout.activity_todo, null, false, component);
  }

  public static ActivityTodoBinding bind(@NonNull View view) {
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
  public static ActivityTodoBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityTodoBinding)bind(component, view, com.example.todos.R.layout.activity_todo);
  }
}
