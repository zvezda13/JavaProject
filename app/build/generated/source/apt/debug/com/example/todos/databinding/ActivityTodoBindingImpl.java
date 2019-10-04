package com.example.todos.databinding;
import com.example.todos.R;
import com.example.todos.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTodoBindingImpl extends ActivityTodoBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.spCategories, 4);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.CheckBox mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener editExpiryDateandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of todo.expired.get()
            //         is todo.expired.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editExpiryDate);
            // localize variables for thread safety
            // todo
            com.example.todos.model.Todo todo = mTodo;
            // todo.expired != null
            boolean todoExpiredJavaLangObjectNull = false;
            // todo.expired
            android.databinding.ObservableField<java.lang.String> todoExpired = null;
            // todo != null
            boolean todoJavaLangObjectNull = false;
            // todo.expired.get()
            java.lang.String todoExpiredGet = null;



            todoJavaLangObjectNull = (todo) != (null);
            if (todoJavaLangObjectNull) {


                todoExpired = todo.expired;

                todoExpiredJavaLangObjectNull = (todoExpired) != (null);
                if (todoExpiredJavaLangObjectNull) {




                    todoExpired.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener editTodoandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of todo.text.get()
            //         is todo.text.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(editTodo);
            // localize variables for thread safety
            // todo
            com.example.todos.model.Todo todo = mTodo;
            // todo != null
            boolean todoJavaLangObjectNull = false;
            // todo.text
            android.databinding.ObservableField<java.lang.String> todoText = null;
            // todo.text.get()
            java.lang.String todoTextGet = null;
            // todo.text != null
            boolean todoTextJavaLangObjectNull = false;



            todoJavaLangObjectNull = (todo) != (null);
            if (todoJavaLangObjectNull) {


                todoText = todo.text;

                todoTextJavaLangObjectNull = (todoText) != (null);
                if (todoTextJavaLangObjectNull) {




                    todoText.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView3androidCheckedAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of todo.done.get()
            //         is todo.done.set((boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView3.isChecked();
            // localize variables for thread safety
            // todo
            com.example.todos.model.Todo todo = mTodo;
            // todo != null
            boolean todoJavaLangObjectNull = false;
            // todo.done != null
            boolean todoDoneJavaLangObjectNull = false;
            // todo.done
            android.databinding.ObservableBoolean todoDone = null;
            // todo.done.get()
            boolean todoDoneGet = false;



            todoJavaLangObjectNull = (todo) != (null);
            if (todoJavaLangObjectNull) {


                todoDone = todo.done;

                todoDoneJavaLangObjectNull = (todoDone) != (null);
                if (todoDoneJavaLangObjectNull) {




                    todoDone.set(((boolean) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityTodoBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityTodoBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.widget.Spinner) bindings[4]
            );
        this.editExpiryDate.setTag(null);
        this.editTodo.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.CheckBox) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.todo == variableId) {
            setTodo((com.example.todos.model.Todo) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTodo(@Nullable com.example.todos.model.Todo Todo) {
        this.mTodo = Todo;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.todo);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTodoText((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeTodoDone((android.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeTodoId((android.databinding.ObservableInt) object, fieldId);
            case 3 :
                return onChangeTodoExpired((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTodoText(android.databinding.ObservableField<java.lang.String> TodoText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeTodoDone(android.databinding.ObservableBoolean TodoDone, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeTodoId(android.databinding.ObservableInt TodoId, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeTodoExpired(android.databinding.ObservableField<java.lang.String> TodoExpired, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        android.databinding.ObservableField<java.lang.String> todoText = null;
        android.databinding.ObservableBoolean todoDone = null;
        android.databinding.ObservableInt todoId = null;
        java.lang.String todoExpiredGet = null;
        com.example.todos.model.Todo todo = mTodo;
        android.databinding.ObservableField<java.lang.String> todoExpired = null;
        java.lang.String todoTextGet = null;
        int todoIdGet = 0;
        boolean todoDoneGet = false;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (todo != null) {
                        // read todo.text
                        todoText = todo.text;
                    }
                    updateRegistration(0, todoText);


                    if (todoText != null) {
                        // read todo.text.get()
                        todoTextGet = todoText.get();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (todo != null) {
                        // read todo.done
                        todoDone = todo.done;
                    }
                    updateRegistration(1, todoDone);


                    if (todoDone != null) {
                        // read todo.done.get()
                        todoDoneGet = todoDone.get();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (todo != null) {
                        // read todo.Id
                        todoId = todo.Id;
                    }
                    updateRegistration(2, todoId);


                    if (todoId != null) {
                        // read todo.Id.get()
                        todoIdGet = todoId.get();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (todo != null) {
                        // read todo.expired
                        todoExpired = todo.expired;
                    }
                    updateRegistration(3, todoExpired);


                    if (todoExpired != null) {
                        // read todo.expired.get()
                        todoExpiredGet = todoExpired.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editExpiryDate, todoExpiredGet);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editExpiryDate, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editExpiryDateandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTodo, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTodoandroidTextAttrChanged);
            android.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView3, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView3androidCheckedAttrChanged);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.editTodo, todoTextGet);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            this.editTodo.setTag(todoIdGet);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            android.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView3, todoDoneGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): todo.text
        flag 1 (0x2L): todo.done
        flag 2 (0x3L): todo.Id
        flag 3 (0x4L): todo.expired
        flag 4 (0x5L): todo
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}