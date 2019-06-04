package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int pontos = 0;


    public void enviarRespostas(View view) {

        /**
         * Os if's seguintes verificam as respostas.
         */

        if (checarQuestao1()) {
            pontos++;
        }

        if (checarQuestao2()) {
            pontos++;
        }

        if (checarQuestao3()) {
            pontos++;
        }

        if (checarQuestao4()) {
            pontos++;
        }

        if (checarQuestao5()) {
            pontos++;
        }

        Toast.makeText(this, "Você Acertou " + pontos + "/5", Toast.LENGTH_LONG).show();
        pontos = 0;

    }

    /**
     * Esse método valida se a Questão 1 foi digitada corretamente, se correta irá retornar true.
     */
    private boolean checarQuestao1() {
        EditText questaoUm = findViewById(R.id.pergunta_um);
        String respostaBox = questaoUm.getText().toString();

        if (respostaBox.equalsIgnoreCase("James Bond")) {
            return true;
        }
        return false;
    }

    /**
     * Esse método verifica se somente o TextBox america_do_sul foi selecionado, e retorna true se verdadeiro. Questão 2.
     */
    private boolean checarQuestao2() {

        CheckBox americaCentralCheckBox = findViewById(R.id.america_central);
        CheckBox europaCheckBox = findViewById(R.id.europa);
        CheckBox asiaCheckBox = findViewById(R.id.asia);
        CheckBox americaDoSulCheckBox = findViewById(R.id.america_do_sul);

        if (americaDoSulCheckBox.isChecked() && !asiaCheckBox.isChecked() && !europaCheckBox.isChecked() &&
                !americaCentralCheckBox.isChecked()) {
            return true;
        }
        return false;
    }

    /**
     * Esse método verifica se o RadioButton 'sim' foi selecionado, se correto irá retornar true. Questão 3.
     */
    private boolean checarQuestao3() {

        RadioButton simRadioButton = findViewById(R.id.sim);
        RadioButton naoRadioButton = findViewById(R.id.nao);

        if (simRadioButton.isChecked() && !naoRadioButton.isChecked()) {
            return true;
        }
        return false;
    }

    /**
     * Esse método verifica se somente o TextBox usain_bolt foi selecionado, e retorna true se verdadeiro. Questão 4.
     */
    private boolean checarQuestao4() {

        CheckBox michaelPhelsCheckBox = findViewById(R.id.michael_phelps);
        CheckBox cristianoRonaldoCheckBox = findViewById(R.id.cristiano_ronaldo);
        CheckBox michaelJohnsonCheckBox = findViewById(R.id.michael_johnson);
        CheckBox usainBoltCheckBox = findViewById(R.id.usain_bolt);

        if (usainBoltCheckBox.isChecked() && !michaelJohnsonCheckBox.isChecked() && !cristianoRonaldoCheckBox.isChecked() &&
                !michaelPhelsCheckBox.isChecked()) {
            return true;
        }
        return false;
    }

    /**
     * Esse método verifica se os TextBox roda, volante e espelho foram selecionados, e retorna true se verdadeiro. Questão 5.
     */
    private boolean checarQuestao5() {

        CheckBox rodaCheckBox = findViewById(R.id.roda);
        CheckBox volanteCheckBox = findViewById(R.id.volante);
        CheckBox espelhoCheckBox = findViewById(R.id.espelho);
        CheckBox guardaChuvaCheckBox = findViewById(R.id.guarda_chuva);

        if (rodaCheckBox.isChecked() && volanteCheckBox.isChecked() && espelhoCheckBox.isChecked() &&
                !guardaChuvaCheckBox.isChecked()) {
            return true;
        }
        return false;
    }


}
