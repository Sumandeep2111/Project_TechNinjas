package com.example.notes_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toolbar;

public class AddNote extends AppCompatActivity {

    Toolbar toolbar;
    EditText notetitle,notedetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
        toolbar = findViewById(R.id.toolbar);
        setActionBar(toolbar);

        notetitle = findViewById(R.id.notetitle);
        notedetail = findViewById(R.id.notedetail);
    }
}
