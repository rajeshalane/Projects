package com.rajesh.helloworld;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ContactsAdapter extends ArrayAdapter<Contact> {
    private Context context;
    private List<Contact> contacts;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(R.layout.row_layout,parent,false);

        TextView tvChar=convertView.findViewById(R.id.tvChar);
        TextView tvName=convertView.findViewById(R.id.tvName);
        TextView tvNumber=convertView.findViewById(R.id.tvNumber);

        tvChar.setText(contacts.get(position).getName().toUpperCase().charAt(0)+"");
        tvName.setText(contacts.get(position).getName());
        tvNumber.setText(contacts.get(position).getNumber());

        return  convertView;
    }

    public ContactsAdapter(Context context, List<Contact>list)
    {
        super(context,R.layout.row_layout,list);
        this.context=context;
        this.contacts=list;



    }
}
