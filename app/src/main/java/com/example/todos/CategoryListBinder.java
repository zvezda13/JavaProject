package com.example.todos;
import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.widget.ListView;
import com.example.todos.model.Category;

public class CategoryListBinder {
    @BindingAdapter("bind:items")
    public static void bindList(ListView view, ObservableArrayList<Category> list) {
        CategoryListAdapter adapter;
        if (list == null) {            //if the list that is passed is, empty list is created
            adapter = new CategoryListAdapter();
        }
        else {
            adapter = new CategoryListAdapter(list);  //passed the list to the adapter
        }
        view.setAdapter(adapter);
    }
/*
    @InverseBindingMethods({
            @InverseBindingMethod(
                    type = Spinner.class,
                    attribute = "android:selectedItemPosition",
                    method = "getText")
    })
    public class MyTextViewBindingAdapters { }
*/

}

