package com.example.todos.databinding;
import com.example.todos.R;
import com.example.todos.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CategoryListItemBindingImpl extends CategoryListItemBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageCatIcon, 2);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CategoryListItemBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private CategoryListItemBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvNote.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCategoryCatId((android.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeCategoryDescription((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCategoryCatId(android.databinding.ObservableField<java.lang.Integer> CategoryCatId, int fieldId) {
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
        android.databinding.ObservableField<java.lang.Integer> categoryCatId = null;
        com.example.todos.model.Category category = mCategory;
        java.lang.String categoryDescriptionGet = null;
        java.lang.Integer categoryCatIdGet = null;
        android.databinding.ObservableField<java.lang.String> categoryDescription = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (category != null) {
                        // read category.catId
                        categoryCatId = category.catId;
                    }
                    updateRegistration(0, categoryCatId);


                    if (categoryCatId != null) {
                        // read category.catId.get()
                        categoryCatIdGet = categoryCatId.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

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
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvNote, categoryDescriptionGet);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.tvNote.setTag(categoryCatIdGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): category.catId
        flag 1 (0x2L): category.description
        flag 2 (0x3L): category
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}