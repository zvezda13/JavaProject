package com.example.todos.model;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

import java.io.Serializable;

public class Record_model implements Serializable

    {
        public final ObservableInt Id = new ObservableInt();
        public final ObservableField<String> name = new ObservableField<String>();
        public final ObservableField<String> amount = new ObservableField<String>();
        //public final ObservableBoolean done = new ObservableBoolean();
        public final ObservableField<String> comment = new ObservableField<String>();
        public final ObservableField<String> input_date = new ObservableField<String>();

    public Record_model(int id, String name1,String amount1, String comment1,String input_date1) {
        this.Id.set(id);
        this.name.set(name1);
        this.name.set(amount1);
        this.comment.set(comment1);
        this.input_date.set(input_date1);
    }

    }
