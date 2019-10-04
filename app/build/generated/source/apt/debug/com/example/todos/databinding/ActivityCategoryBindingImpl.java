package com.example.todos.databinding;
import com.example.todos.R;
import com.example.todos.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCategoryBindingImpl extends ActivityCategoryBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btnAdd, 3);
        sViewsWithIds.put(R.id.btnSave, 4);
        sViewsWithIds.put(R.id.btnDelete, 5);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.EditText mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of category.description.get()
            //         is category.description.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // category.description != null
            boolean categoryDescriptionJavaLangObjectNull = false;
            // category
            com.example.todos.model.Category category = mCategory;
            // category.description.get()
            java.lang.String categoryDescriptionGet = null;
            // category != null
            boolean categoryJavaLangObjectNull = false;
            // category.description
            android.databinding.ObservableField<java.lang.String> categoryDescription = null;



            categoryJavaLangObjectNull = (category) != (null);
            if (categoryJavaLangObjectNull) {


                categoryDescription = category.description;

                categoryDescriptionJavaLangObjectNull = (categoryDescription) != (null);
                if (categoryDescriptionJavaLangObjectNull) {




                    categoryDescription.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityCategoryBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityCategoryBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[4]
            , (android.widget.ListView) bindings[2]
            );
        this.lvCategories.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.category == variableId) {
            setCategory((com.example.todos.model.Category) variable);
        }
        else if (BR.categories == variableId) {
            setCategories((com.example.todos.model.CategoryList) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCategory(@Nullable com.example.todos.model.Category Category) {
        this.mCategory = Category;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.category);
        super.requestRebind();
    }
    public void setCategories(@Nullable com.example.todos.model.CategoryList Categories) {
        this.mCategories = Categories;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.categories);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCategoriesItemList((android.databinding.ObservableArrayList<com.example.todos.model.Category>) object, fieldId);
            case 1 :
                return onChangeCategoryDescription((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCategoriesItemList(android.databinding.ObservableArrayList<com.example.todos.model.Category> CategoriesItemList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCategoryDescription(android.databinding.ObservableField<java.lang.String> CategoryDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.databinding.ObservableArrayList<com.example.todos.model.Category> categoriesItemList = null;
        com.example.todos.model.Category category = mCategory;
        java.lang.String categoryDescriptionGet = null;
        com.example.todos.model.CategoryList categories = mCategories;
        android.databinding.ObservableField<java.lang.String> categoryDescription = null;

        if ((dirtyFlags & 0x16L) != 0) {



                if (category != null) {
                    // read category.description
                    categoryDescription = category.description;
                }
                updateRegistration(1, categoryDescription);


                if (categoryDescription != null) {
                    // read category.description.get()
                    categoryDescriptionGet = categoryDescription.get();
                }
        }
        if ((dirtyFlags & 0x19L) != 0) {



                if (categories != null) {
                    // read categories.ItemList
                    categoriesItemList = categories.ItemList;
                }
                updateRegistration(0, categoriesItemList);
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.example.todos.CategoryListBinder.bindList(this.lvCategories, categoriesItemList);
        }
        if ((dirtyFlags & 0x16L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, categoryDescriptionGet);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): categories.ItemList
        flag 1 (0x2L): category.description
        flag 2 (0x3L): category
        flag 3 (0x4L): categories
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}