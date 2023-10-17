package ru.astar.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        ContactAdapter adapter = new ContactAdapter();
        recyclerView.setAdapter(adapter);

        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Федя", "88005553535", Sex.MAN));
        contacts.add(new Contact("Вася", "89309049292", Sex.MAN));
        contacts.add(new Contact("Петя", "82686837878", Sex.MAN));
        contacts.add(new Contact("Оля", "80287837837", Sex.WOMAN));

        adapter.setContacts(contacts);
    }
}