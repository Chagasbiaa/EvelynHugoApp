package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {

    EditText username, password, repassword;
    Button signup, signin ;
    DBhelper DB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        username =(EditText) findViewById (R.id.txt_nome);
        password = (EditText) findViewById(R.id.txt_email);
        repassword = (EditText) findViewById(R.id.txt_senha);
        signup = (Button) findViewById( R.id.btnsignup);
        signin = (Button) findViewById(R.id.btn_cadastrar);
        DB = new DBhelper(this);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = repassword.getText().toString();

                if(user.equals("") ||pass.equals("") || repass.equals(""))
                    Toast.makeText(Cadastro.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                else{
                    if(pass.equals(repass)){
                        Boolean checkuser = DB.checkusername(user);
                        if(checkuser==false){
                            Boolean insert = DB.insertData(user, pass);
                            if(insert==true){
                                Toast.makeText(Cadastro.this, "Logado com sucesso", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),Menu.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(Cadastro.this, "Erro ao logar", Toast.LENGTH_SHORT).show();

                            }
                        }
                        else{
                            Toast.makeText(Cadastro.this, "Usuário já existente", Toast.LENGTH_SHORT).show();

                        }
                    }else{
                        Toast.makeText(Cadastro.this, "Senhas não correspondem", Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),login.class);
                startActivity(intent);
            }
        });
    }
}






