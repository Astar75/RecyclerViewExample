package ru.astar.recyclerviewexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

    private final List<Contact> contacts = new ArrayList<>();

    public void setContacts(List<Contact> newContacts) {
        this.contacts.clear();
        this.contacts.addAll(newContacts);

        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_contact, parent, false);
        return new ContactViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        Contact contact = contacts.get(position);
        holder.textName.setText(contact.name);
        holder.textPhone.setText(contact.phone);

        int resource;
        if (contact.sex == Sex.MAN) {
            resource = R.drawable.ic_person;
        } else {
            resource = R.drawable.ic_person_female;
        }

        holder.imageSex.setImageResource(resource);
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    class ContactViewHolder extends RecyclerView.ViewHolder {

        TextView textName;
        TextView textPhone;
        ImageView imageSex;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);

            textName = itemView.findViewById(R.id.text_name);
            textPhone = itemView.findViewById(R.id.text_phone);
            imageSex = itemView.findViewById(R.id.image_person);
        }
    }

}

