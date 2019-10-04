package com.example.todos;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.example.todos.databinding.ActivityCategoryBindingImpl;
import com.example.todos.databinding.ActivityTodoBindingImpl;
import com.example.todos.databinding.CategoryListItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYCATEGORY = 1;

  private static final int LAYOUT_ACTIVITYTODO = 2;

  private static final int LAYOUT_CATEGORYLISTITEM = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.todos.R.layout.activity_category, LAYOUT_ACTIVITYCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.todos.R.layout.activity_todo, LAYOUT_ACTIVITYTODO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.todos.R.layout.category_list_item, LAYOUT_CATEGORYLISTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYCATEGORY: {
          if ("layout/activity_category_0".equals(tag)) {
            return new ActivityCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_category is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTODO: {
          if ("layout/activity_todo_0".equals(tag)) {
            return new ActivityTodoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_todo is invalid. Received: " + tag);
        }
        case  LAYOUT_CATEGORYLISTITEM: {
          if ("layout/category_list_item_0".equals(tag)) {
            return new CategoryListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for category_list_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "todo");
      sKeys.put(2, "categories");
      sKeys.put(3, "category");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_category_0", com.example.todos.R.layout.activity_category);
      sKeys.put("layout/activity_todo_0", com.example.todos.R.layout.activity_todo);
      sKeys.put("layout/category_list_item_0", com.example.todos.R.layout.category_list_item);
    }
  }
}
