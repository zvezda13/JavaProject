package com.example.todos;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.List;

public class RecordsAdapter extends BaseAdapter {

        private Context recordContext;
        private List<Record> recordList;

        public RecordsAdapter(Context context, List<Record> records) {
            recordList = records;
            recordContext = context;
        }

        @Override
        public int getCount() {
            return recordList.size();
        }
        @Override
        public Object getItem(int i) {
            return recordList.get(i);
        }
        @Override
        public long getItemId(int i) {
            return i;
        }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }


    private static class RecordViewHolder {

            public TextView nameView;
            public TextView amountView;
            public TextView commentView;
            public TextView inputDateView;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            RecordViewHolder holder;

            if (view ==null){
                LayoutInflater recordInflater = (LayoutInflater)
                        recordContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
                view = recordInflater.inflate(R.layout.activity_record_activity, null);

                holder = new RecordViewHolder();
                holder.nameView = (TextView) view.findViewById(R.id.name);
                holder.amountView = (TextView) view.findViewById(R.id.amount);
                holder.commentView = (TextView) view.findViewById(R.id.input_date);
                holder.inputDateView = (TextView) view.findViewById(R.id.input_date);
                view.setTag(holder);

            }else {
                holder = (RecordViewHolder) view.getTag();
            }

            Record record = (Record) getItem(i);
            holder.nameView.setText(record.name);
            holder.amountView.setD (record.amount);
            holder.commentView.setText(record.comment);
            holder.inputDateView.setText(record.input_date);
            return view;
        }

        public void add(Record record) {
            recordList.add(record);
            notifyDataSetChanged();
        }
}
