package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //define layout
        //Opcao 01
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        //Opcao 02
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL);
        //layoutManager.setOrientation(LinearLayout.VERTICAL);

        //Opcao 03 - grid
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);

        recyclerPostagem.setLayoutManager( layoutManager );

        //preparar postagens
        this.prepararPostagens();

        //definir adapter
        PostagemAdapter adapter = new PostagemAdapter( postagens );
        recyclerPostagem.setAdapter( adapter );

    }

    public void prepararPostagens(){

        Postagem p;

        p = new Postagem("Lucas Rocini","#tbt viagem legal",R.drawable.imagem1);
        this.postagens.add( p );

        p = new Postagem("Joao Elias","#tbt isso ai",R.drawable.imagem2);
        this.postagens.add( p );

        p = new Postagem("Noelle Brandino ","#tbt curso de coach",R.drawable.imagem3);
        this.postagens.add( p );

        p = new Postagem("Cunha Souza","#tbt partiu casa agira",R.drawable.imagem4);
        this.postagens.add( p );

    }
}