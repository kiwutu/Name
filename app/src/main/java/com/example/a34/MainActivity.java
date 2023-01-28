package com.example.a34;

import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText Name;
    EditText Surname;
    EditText Patronymic;
    EditText Phone;

    TextView Output;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inView();
        outView();
    }

    private void inView() {
        Name = findViewById(R.id.name);
        Surname = findViewById(R.id.surname);
        Patronymic = findViewById(R.id.patronymic);
        Phone = findViewById(R.id.phone);

        button = findViewById(R.id.button);
        Output = findViewById(R.id.text);

    }

    public void outView() {
        button.setOnClickListener(view -> {
            save();
            Output.setText(out);
        });
    }

    String out;

    private void save() {
        String surname = Surname.getText().toString();
        String name = Name.getText().toString();
        String patronymic = Patronymic.getText().toString();
        String phone = Phone.getText().toString();

        if (Surname.getText().toString().isEmpty()) surname =DataGenerateRandom.genSurname();
        if (Name.getText().toString().isEmpty()) name = DataGenerateRandom.genName();
        if (Patronymic.getText().toString().isEmpty()) patronymic = DataGenerateRandom.genPatronymic();
        if (Phone.getText().toString().isEmpty()) phone = DataGenerateRandom.genPhoneNumber();

        out = "Surname:" + surname + '\n' +
                "Name: " + name + '\n' +
                "Patronymic: " + patronymic + '\n' +
                "Phone: " + phone;
    }
}