package com.ilegra.objectboxsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import io.objectbox.Box;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //box da entidade User
    private Box<User> userBox;
    //entidade que será adicionada no box
    private User user;
    //lista usada para exibir os nomes
    List<User> users;

    private EditText editTextName;
    private TextView textViewNames;
    private Button buttonAdd;
    private Button buttonClear;

    private String names = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = (EditText)findViewById(R.id.edit_text_name);
        buttonAdd = (Button)findViewById(R.id.button_add);
        //define o onClickListener
        buttonAdd.setOnClickListener(this);
        buttonClear = (Button)findViewById(R.id.button_clear);
        //define o onClickListener
        buttonClear.setOnClickListener(this);
        textViewNames = (TextView)findViewById(R.id.text_view_names);

        setUserBox();
        //chama o método no onCreate para caso já tenha algum nome salvo
        showNames();
    }

    private void setUserBox(){
        userBox = ((ObjectBoxSampleApplication)getApplication()).getBoxStore().boxFor(User.class);
        Log.i("Bicca", MainActivity.class.getSimpleName() + " - setUser()");
    }

    private void addUser(){
        //Instanciar um objeto User
        user = new User();
        //pegar o nome digitado no EditText
        user.setName(editTextName.getText().toString());
        //limpa o texto do EditText
        editTextName.setText("");
        //adicionar o objeto User no box
        userBox.put(user);
        showNames();
    }

    private void clearUsers(){
        //remove todos os itens do box da entidade User
        userBox.removeAll();
        showNames();
    }

    private void showNames(){
        users = userBox.getAll();
        if(users != null && users.size() > 0){
            //limpa a String names e o TextView
            names = "";
            textViewNames.setText("");
            //percorre a lista de usuários no box
            for(User item : users){
                //concatena a String anterior com o nome
                names += item.getName() + "\n";
                textViewNames.setText(names);
            }
        }
        else
            textViewNames.setText("Vazio!");
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button_add:
                addUser();
                break;

            case R.id.button_clear:
                clearUsers();
                break;
        }
    }
}
