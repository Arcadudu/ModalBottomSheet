package ru.arcadudu.modalbottomsheet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    private RecyclerView recycler;
    private MyAdapter adapter;
    private List<Model> modelList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        packList();
        recycler = findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyAdapter(modelList, this);
        recycler.setAdapter(adapter);

    }

    private void packList() {
        String content = getString(R.string.progLang);
        modelList.add(new Model(getString(R.string.java), getString(R.string.java_description), getString(R.string.java) + content, R.drawable.icon_java));
        modelList.add(new Model(getString(R.string.javascript), getString(R.string.java_script_description), getString(R.string.javascript) + content, R.drawable.icon_javascript));
        modelList.add(new Model(getString(R.string.haskell), getString(R.string.haskell_description), getString(R.string.haskell) + content, R.drawable.icon_haskel));
        modelList.add(new Model(getString(R.string.python), getString(R.string.python_description), getString(R.string.python) + content, R.drawable.icon_python));
        modelList.add(new Model(getString(R.string.csharp), getString(R.string.csharp_description), getString(R.string.csharp) + content, R.drawable.icon_c_sharp));
        modelList.add(new Model(getString(R.string.ruby), getString(R.string.ruby_description), getString(R.string.ruby) + content, R.drawable.icon_ruby));
    }



}