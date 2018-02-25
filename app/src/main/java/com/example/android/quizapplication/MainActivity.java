package com.example.android.quizapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String SCORE_KEY = "score";
    private static final String QUESTION_KEY = "question";
    int newScore = 0;
    int newQuestion = 0;
    //declaring the score and question variables which will be shown at the top for the entire quiz
    private int score, question;
    //declaring the buttons for the 1 question
    private Button buttonJuly;
    private Button buttonAugust;
    private Button buttonSeptember;
    private Button buttonMary;
    //declaring the buttons for the 2 question
    private Button button20;
    private Button button24;
    private Button button25;
    private Button button26;
    private Button button28;
    //declaring the check boxes for the 3 question
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private CheckBox checkBox5;
    private CheckBox checkBox6;
    private CheckBox checkBox7;
    private CheckBox checkBox8;
    //declaring the submit button for the checkoxes
    private Button subbmitButton;
    //declaring the radio buttons for the 4 question
    private RadioButton radioAnimal;
    private RadioButton radioCountry;
    private RadioButton radioState;
    private RadioButton radioCity;
    private RadioButton radioOcean;
    //declaring the radio buttons for the 5 question
    private RadioButton radio10;
    private RadioButton radio16;
    private RadioButton radio22;
    private RadioButton radio25;
    private RadioButton radio28;
    //declaring the radio buttons for the 6 question
    private RadioButton radioTrue;
    private RadioButton radioFalse;
    //declaring the radio buttons for the 7 question
    private RadioButton radioGoogle;
    private RadioButton radioInternetExplorer;
    private RadioButton radioFirefox;
    private RadioButton radioSafari;
    //declaring the radio buttons for the 8 question
    private RadioButton radioPoem;
    private RadioButton radioNovel;
    private RadioButton radioPainting;
    private RadioButton radioStatue;
    private RadioButton radioFlower;
    //declaring the radio buttons for the 9 question
    private RadioButton radio1;
    private RadioButton radio2;
    private RadioButton radio3;
    private RadioButton radio4;
    private RadioButton radio5;
    //declaring the button and the edit text for the 10 question
    private EditText editText;
    private Button buttonSubmitAnsware;
    //declaring the layouts so we can hide and shown only the prize
    private RelativeLayout introPage;
    private LinearLayout firstQuestion;
    private LinearLayout secondQuestion;
    private LinearLayout thirdQuestion;
    private LinearLayout fourthQuestion;
    private LinearLayout fifthQuestion;
    private LinearLayout sixthQuestion;
    private LinearLayout seventhQuestion;
    private LinearLayout eightQuestion;
    private LinearLayout ninethQuestion;
    private LinearLayout tenthQuestion;
    //declaring the image and text views for the score
    private ImageView einstenImageView;
    private ImageView almostImageView;
    private ImageView averageImageView;
    private ImageView thinkTwiceImageView;
    private ImageView error404ImageView;
    private TextView maxScore;
    private TextView almostGeniusScore;
    private TextView averageScore;
    private TextView thinkTwiceScore;
    private TextView error404;

    //declaring the score and the question text view
    private TextView quantityTextView;
    private TextView displayQuestion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // linking all the answare buttons for the 1 question
        buttonJuly = findViewById(R.id.buttonJuly);
        buttonAugust = findViewById(R.id.buttonAugust);
        buttonSeptember = findViewById(R.id.buttonSeptember);
        buttonMary = findViewById(R.id.buttonMary);

// linking all the answare buttons for the 2 question
        button20 = findViewById(R.id.button20);
        button24 = findViewById(R.id.button24);
        button25 = findViewById(R.id.button25);
        button26 = findViewById(R.id.button26);
        button28 = findViewById(R.id.button28);

        // linking all the checkboxes for the 3 question
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6 = findViewById(R.id.checkBox6);
        checkBox7 = findViewById(R.id.checkBox7);
        checkBox8 = findViewById(R.id.checkBox8);

        //linking sublmit button for the checkboxes
        subbmitButton = findViewById(R.id.buttonCheckBoxAnswers);

        //linking all the radio buttons for the 4 question
        radioAnimal = findViewById(R.id.radioAnimal);
        radioCountry = findViewById(R.id.radioCountry);
        radioState = findViewById(R.id.radioState);
        radioCity = findViewById(R.id.radioCity);
        radioOcean = findViewById(R.id.radioOcean);

//linking the radio buttons for the 5 question
        radio10 = findViewById(R.id.radio10);
        radio16 = findViewById(R.id.radio16);
        radio22 = findViewById(R.id.radio22);
        radio25 = findViewById(R.id.radio25);
        radio28 = findViewById(R.id.radio28);

        //linking the radio buttons for the 6 question
        radioTrue = findViewById(R.id.radioTrue);
        radioFalse = findViewById(R.id.radioFalse);

        //linking the radio buttons for the 7 question
        radioGoogle = findViewById(R.id.radioGoogle);
        radioFirefox = findViewById(R.id.radioFirefox);
        radioInternetExplorer = findViewById(R.id.radioInternetExplorer);
        radioSafari = findViewById(R.id.radioSafari);

//linking the radio buttons for the 8 question
        radioPoem = findViewById(R.id.radioPoem);
        radioNovel = findViewById(R.id.radioNovel);
        radioPainting = findViewById(R.id.radioPainting);
        radioStatue = findViewById(R.id.radioStatue);
        radioFlower = findViewById(R.id.radioFlower);

        //linking the radio buttons for the 9 question
        radio1 = findViewById(R.id.radio1);
        radio2 = findViewById(R.id.radio2);
        radio3 = findViewById(R.id.radio3);
        radio4 = findViewById(R.id.radio4);
        radio5 = findViewById(R.id.radio5);

        //linking the button and the edit text for the 10 question
        editText = findViewById(R.id.editText);
        buttonSubmitAnsware = findViewById(R.id.buttonSubmitAnsware);

        //linking the layouts so we can hide and shown only the prize
        introPage = findViewById(R.id.introRL);
        firstQuestion = findViewById(R.id.firstLL);
        secondQuestion = findViewById(R.id.secondLL);
        thirdQuestion = findViewById(R.id.thirdLL);
        fourthQuestion = findViewById(R.id.fourthLL);
        fifthQuestion = findViewById(R.id.fifthLL);
        sixthQuestion = findViewById(R.id.sixthLL);
        seventhQuestion = findViewById(R.id.seventhLL);
        eightQuestion = findViewById(R.id.eightLL);
        ninethQuestion = findViewById(R.id.ninethLL);
        tenthQuestion = findViewById(R.id.tenthLL);

        //linking the score thext and images
        einstenImageView = findViewById(R.id.einstenImageView);
        almostImageView = findViewById(R.id.almostImageView);
        averageImageView = findViewById(R.id.averageImageView);
        thinkTwiceImageView = findViewById(R.id.thinkTwiceImageView);
        error404ImageView = findViewById(R.id.error404ImageView);

        maxScore = findViewById(R.id.maximumTextView);
        almostGeniusScore = findViewById(R.id.almostTextView);
        averageScore = findViewById(R.id.averageTextView);
        thinkTwiceScore = findViewById(R.id.thinkTwiceTextView);
        error404 = findViewById(R.id.error404TextView);

        //linking the score and the nuber of questions
        quantityTextView = findViewById(R.id.scoreTextView);
        displayQuestion = findViewById(R.id.numberOfQuestionTextView);


        if (savedInstanceState != null) {
            score = savedInstanceState.getInt(SCORE_KEY, 0);
            question = savedInstanceState.getInt(QUESTION_KEY, 0);
        }

        displayScore(score);
        displayQuestion(question);


    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // Save away the original text, so we still have it if the activity
        // needs to be killed while paused.
        super.onSaveInstanceState(outState);
        //  key - value pair
        outState.putInt(SCORE_KEY, score);
        outState.putInt(QUESTION_KEY, question);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // restore saved values
        newScore = savedInstanceState.getInt("score1", 0);
        newQuestion = savedInstanceState.getInt("question1", 0);


    }

    private void showToast(int msgId, int length) {

        Toast.makeText(this, msgId, length).show();


    }


    //first question with Mary and her sisters
    public void firtstQuestion(View view) {

        // declaring a boolean so we can see if it's clicked
        boolean isAnswerCorrect = (view).isClickable();

        //using switch to the avalabile 4 answares
        switch (view.getId()) {

            //first answare which is connected to the first button using it's id
            case R.id.buttonJuly:

                // if user press this button
                if (isAnswerCorrect)
                    //Displaying the right answare in a toast message
                    Toast.makeText(this, R.string.right_asware_Mary, Toast.LENGTH_SHORT).show();

                // Disabling all buttons, after July has been clicked
                buttonJuly.setEnabled(false);
                buttonAugust.setEnabled(false);
                buttonSeptember.setEnabled(false);
                buttonMary.setEnabled(false);

                //ending this phase
                break;

            //second button which is connected with the id
            case R.id.buttonAugust:
                //if the button is pressed
                if (isAnswerCorrect)
                    //Displaying the right answare in a toast message
                    Toast.makeText(this, R.string.right_asware_Mary, Toast.LENGTH_SHORT).show();

                // Disabling all buttons, after July has been clicked
                buttonJuly.setEnabled(false);
                buttonAugust.setEnabled(false);
                buttonSeptember.setEnabled(false);
                buttonMary.setEnabled(false);
                break;

            case R.id.buttonSeptember:
                if (isAnswerCorrect)
                    //Displaying the right answare in a toast message
                    Toast.makeText(this, R.string.right_asware_Mary, Toast.LENGTH_SHORT).show();

                // Disabling all buttons, after July has been clicked
                buttonJuly.setEnabled(false);
                buttonAugust.setEnabled(false);
                buttonSeptember.setEnabled(false);
                buttonMary.setEnabled(false);
                break;

            case R.id.buttonMary:
                if (isAnswerCorrect)
                    //Displaying commendation for the right answare in a toast message
                    showToast(R.string.good_job, Toast.LENGTH_SHORT);

                // Disabling all buttons, after July has been clicked
                buttonJuly.setEnabled(false);
                buttonAugust.setEnabled(false);
                buttonSeptember.setEnabled(false);
                buttonMary.setEnabled(false);

                //Adding 100 beacse this is the right answare and displaying the current score
                score = score + 100;
                displayScore(score);
                break;


        }
        //Adding 1 to question after it was answared and displaying the current question
        question++;
        displayQuestion(question);
    }


    // Second question Angelica and her brother
    public void secondQuestion(View view) {

        boolean isAnswerCorrect = (view).isClickable();

        switch (view.getId()) {

            case R.id.button20:
                if (isAnswerCorrect)
                    Toast.makeText(this, R.string.right_answare_24, Toast.LENGTH_SHORT).show();
                button20.setEnabled(false);
                button24.setEnabled(false);
                button25.setEnabled(false);
                button26.setEnabled(false);
                button28.setEnabled(false);

                break;

            case R.id.button24:
                if (isAnswerCorrect)
                    showToast(R.string.good_job, Toast.LENGTH_SHORT);
                button20.setEnabled(false);
                button24.setEnabled(false);
                button25.setEnabled(false);
                button26.setEnabled(false);
                button28.setEnabled(false);
                score = score + 100;
                displayScore(score);
                break;

            case R.id.button25:
                if (isAnswerCorrect)
                    Toast.makeText(this, R.string.right_answare_24, Toast.LENGTH_SHORT).show();
                button20.setEnabled(false);
                button24.setEnabled(false);
                button25.setEnabled(false);
                button26.setEnabled(false);
                button28.setEnabled(false);
                break;

            case R.id.button26:
                if (isAnswerCorrect)
                    Toast.makeText(this, R.string.right_answare_24, Toast.LENGTH_SHORT).show();
                button20.setEnabled(false);
                button24.setEnabled(false);
                button25.setEnabled(false);
                button26.setEnabled(false);
                button28.setEnabled(false);
                break;

            case R.id.button28:
                if (isAnswerCorrect)
                    Toast.makeText(this, R.string.right_answare_24, Toast.LENGTH_SHORT).show();
                button20.setEnabled(false);
                button24.setEnabled(false);
                button25.setEnabled(false);
                button26.setEnabled(false);
                button28.setEnabled(false);
                break;


        }
        question = question + 1;
        displayQuestion(question);


    }

    // Third question Trustworthy CheckBox
    public void thirdQuestion(View view) {

        //looking what will happend when the button is pressed
        subbmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if the first checkbox is checked -50 to the total score when the Submit button will be pressed
                if (checkBox1.isChecked()) {
                    score -= 50;

                }
                //if the second checkbox is checked -50 to the total score when the Submit button will be pressed
                if (checkBox2.isChecked()) {
                    score -= 50;
                }
                //if the third checkbox is checked +50 to the total score when the "Submit your answares!" button will be pressed
                if (checkBox3.isChecked()) {
                    score += 50;
                }
                //if the fourth checkbox is checked -50 to the total score when the "Submit your answares!" button will be pressed
                if (checkBox4.isChecked()) {
                    score -= 50;
                }
                //if the fifth checkbox is checked +50 to the total score when the "Submit your answares!" button will be pressed
                if (checkBox5.isChecked()) {
                    score += 50;
                }
                //if the sixth checkbox is checked -50 to the total score when the "Submit your answares!" button will be pressed
                if (checkBox6.isChecked()) {
                    score -= 50;
                }
                //if the seventh checkbox is checked +50 to the total score when the "Submit your answares!" button will be pressed
                if (checkBox7.isChecked()) {
                    score += 50;
                }
                //if the eight checkbox is checked +50 to the total score when the "Submit your answares!" button will be pressed
                if (checkBox8.isChecked()) {
                    score += 50;  //
                }


                //adding +1 to the question
                question++;

                //displaying the question
                displayQuestion(question);
                //displaying the score which is calculated on how many right or wrong checkbox has been checked when the button is pressed
                displayScore(score);

                //showing with green the right and with red the wrong answares
                checkBox1.setTextColor(Color.RED);
                checkBox2.setTextColor(Color.RED);
                checkBox3.setTextColor(Color.GREEN);
                checkBox4.setTextColor(Color.RED);
                checkBox5.setTextColor(Color.GREEN);
                checkBox6.setTextColor(Color.RED);
                checkBox7.setTextColor(Color.GREEN);
                checkBox8.setTextColor(Color.GREEN);

                //disableing the checkbox so after the user submits the answare they can't play around
                checkBox1.setEnabled(false);
                checkBox2.setEnabled(false);
                checkBox3.setEnabled(false);
                checkBox4.setEnabled(false);
                checkBox5.setEnabled(false);
                checkBox6.setEnabled(false);
                checkBox7.setEnabled(false);
                checkBox8.setEnabled(false);

                //disableing the submit Button
                subbmitButton.setEnabled(false);
            }
        });


    }

    // Fourth question England
    public void fourthQuestion(View view) {

        // using a boolean to see if it's clicked or not the radio button
        boolean checked = ((RadioButton) view).isChecked();

        //using a switch
        switch (view.getId()) {
            case R.id.radioAnimal:
                if (checked)
                    //showing the right answare in a toast message
                    Toast.makeText(this, R.string.right_answare_contry, Toast.LENGTH_LONG).show();
                //after answared disableing all options
                radioAnimal.setEnabled(false);
                radioCountry.setEnabled(false);
                radioState.setEnabled(false);
                radioCity.setEnabled(false);
                radioOcean.setEnabled(false);

                radioAnimal.setTextColor(Color.RED);

                break;

            case R.id.radioCountry:
                if (checked)
                    showToast(R.string.good_job, Toast.LENGTH_SHORT);
                radioAnimal.setEnabled(false);
                radioCountry.setEnabled(false);
                radioState.setEnabled(false);
                radioCity.setEnabled(false);
                radioOcean.setEnabled(false);
                score = score + 200;
                displayScore(score);

                radioCountry.setTextColor(Color.GREEN);

                break;

            case R.id.radioState:
                if (checked)
                    Toast.makeText(this, R.string.right_answare_contry, Toast.LENGTH_LONG).show();
                radioAnimal.setEnabled(false);
                radioCountry.setEnabled(false);
                radioState.setEnabled(false);
                radioCity.setEnabled(false);
                radioOcean.setEnabled(false);

                radioState.setTextColor(Color.RED);

                break;

            case R.id.radioCity:
                if (checked)
                    Toast.makeText(this, R.string.right_answare_contry, Toast.LENGTH_LONG).show();
                radioAnimal.setEnabled(false);
                radioCountry.setEnabled(false);
                radioState.setEnabled(false);
                radioCity.setEnabled(false);
                radioOcean.setEnabled(false);

                radioCity.setTextColor(Color.RED);
                break;

            case R.id.radioOcean:
                if (checked)
                    Toast.makeText(this, R.string.right_answare_contry, Toast.LENGTH_LONG).show();
                radioAnimal.setEnabled(false);
                radioCountry.setEnabled(false);
                radioState.setEnabled(false);
                radioCity.setEnabled(false);
                radioOcean.setEnabled(false);

                radioOcean.setTextColor(Color.RED);

                break;
        }
        question = question + 1;
        displayQuestion(question);
    }

    public void fifthQuestion(View view) {


        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio10:
                if (checked)
                    Toast.makeText(this, R.string.right_answare_25, Toast.LENGTH_SHORT).show();
                radio10.setEnabled(false);
                radio16.setEnabled(false);
                radio22.setEnabled(false);
                radio25.setEnabled(false);
                radio28.setEnabled(false);

                radio10.setTextColor(Color.RED);

                break;

            case R.id.radio16:
                if (checked)
                    Toast.makeText(this, R.string.right_answare_25, Toast.LENGTH_SHORT).show();
                radio10.setEnabled(false);
                radio16.setEnabled(false);
                radio22.setEnabled(false);
                radio25.setEnabled(false);
                radio28.setEnabled(false);

                radio16.setTextColor(Color.RED);

                break;

            case R.id.radio22:
                if (checked)
                    Toast.makeText(this, R.string.right_answare_25, Toast.LENGTH_SHORT).show();
                radio10.setEnabled(false);
                radio16.setEnabled(false);
                radio22.setEnabled(false);
                radio25.setEnabled(false);
                radio28.setEnabled(false);

                radio22.setTextColor(Color.RED);

                break;

            case R.id.radio25:
                if (checked)
                    showToast(R.string.good_job, Toast.LENGTH_SHORT);
                radio10.setEnabled(false);
                radio16.setEnabled(false);
                radio22.setEnabled(false);
                radio25.setEnabled(false);
                radio28.setEnabled(false);
                score = score + 150;
                displayScore(score);

                radio25.setTextColor(Color.GREEN);

                break;

            case R.id.radio28:
                if (checked)
                    Toast.makeText(this, R.string.right_answare_25, Toast.LENGTH_SHORT).show();
                radio10.setEnabled(false);
                radio16.setEnabled(false);
                radio22.setEnabled(false);
                radio25.setEnabled(false);
                radio28.setEnabled(false);

                radio28.setTextColor(Color.RED);

                break;
        }
        question = question + 1;
        displayQuestion(question);
    }


    public void sixthQuestion(View view) {


        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioTrue:
                if (checked)
                    showToast(R.string.good_job, Toast.LENGTH_SHORT);
                radioTrue.setEnabled(false);
                radioFalse.setEnabled(false);
                score = score + 150;
                displayScore(score);

                radioTrue.setTextColor(Color.GREEN);

                break;

            case R.id.radioFalse:
                if (checked)
                    Toast.makeText(this, R.string.right_answare_true, Toast.LENGTH_SHORT).show();
                radioTrue.setEnabled(false);
                radioFalse.setEnabled(false);

                radioFalse.setTextColor(Color.RED);
                break;

        }
        question = question + 1;
        displayQuestion(question);
    }

    public void seventhQuestion(View view) {


        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioPoem:
                if (checked)
                    Toast.makeText(this, R.string.right_answare_flower, Toast.LENGTH_SHORT).show();
                radioPoem.setEnabled(false);
                radioNovel.setEnabled(false);
                radioPainting.setEnabled(false);
                radioStatue.setEnabled(false);
                radioFlower.setEnabled(false);

                radioPoem.setTextColor(Color.RED);

                break;

            case R.id.radioNovel:
                if (checked)
                    Toast.makeText(this, R.string.right_answare_flower, Toast.LENGTH_SHORT).show();
                radioPoem.setEnabled(false);
                radioNovel.setEnabled(false);
                radioPainting.setEnabled(false);
                radioStatue.setEnabled(false);
                radioFlower.setEnabled(false);

                radioNovel.setTextColor(Color.RED);

                break;
            case R.id.radioPainting:
                if (checked)
                    Toast.makeText(this, R.string.right_answare_flower, Toast.LENGTH_SHORT).show();
                radioPoem.setEnabled(false);
                radioNovel.setEnabled(false);
                radioPainting.setEnabled(false);
                radioStatue.setEnabled(false);
                radioFlower.setEnabled(false);

                radioPainting.setTextColor(Color.RED);

                break;
            case R.id.radioStatue:
                if (checked)
                    Toast.makeText(this, R.string.right_answare_flower, Toast.LENGTH_SHORT).show();
                radioPoem.setEnabled(false);
                radioNovel.setEnabled(false);
                radioPainting.setEnabled(false);
                radioStatue.setEnabled(false);
                radioFlower.setEnabled(false);

                radioStatue.setTextColor(Color.RED);

                break;
            case R.id.radioFlower:
                if (checked)
                    showToast(R.string.good_job, Toast.LENGTH_SHORT);
                radioPoem.setEnabled(false);
                radioNovel.setEnabled(false);
                radioPainting.setEnabled(false);
                radioStatue.setEnabled(false);
                radioFlower.setEnabled(false);

                score = score + 100;
                displayScore(score);

                radioFlower.setTextColor(Color.GREEN);
                break;

        }

        question = question + 1;
        displayQuestion(question);

    }

    public void eighthQuestion(View view) {


        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioGoogle:
                if (checked)
                    showToast(R.string.good_job, Toast.LENGTH_SHORT);
                radioGoogle.setEnabled(false);
                radioFirefox.setEnabled(false);
                radioInternetExplorer.setEnabled(false);
                radioSafari.setEnabled(false);
                score = score + 100;
                displayScore(score);
                radioGoogle.setTextColor(Color.GREEN);
                break;

            case R.id.radioFirefox:
                if (checked)
                    Toast.makeText(this, R.string.right_answare_google, Toast.LENGTH_LONG).show();
                radioGoogle.setEnabled(false);
                radioFirefox.setEnabled(false);
                radioInternetExplorer.setEnabled(false);
                radioSafari.setEnabled(false);
                radioFirefox.setTextColor(Color.RED);
                break;

            case R.id.radioInternetExplorer:
                if (checked)
                    Toast.makeText(this, R.string.right_answare_google, Toast.LENGTH_LONG).show();
                radioGoogle.setEnabled(false);
                radioFirefox.setEnabled(false);
                radioInternetExplorer.setEnabled(false);
                radioSafari.setEnabled(false);
                radioInternetExplorer.setTextColor(Color.RED);
                break;

            case R.id.radioSafari:
                if (checked)
                    Toast.makeText(this, R.string.right_answare_google, Toast.LENGTH_LONG).show();
                radioGoogle.setEnabled(false);
                radioFirefox.setEnabled(false);
                radioInternetExplorer.setEnabled(false);
                radioSafari.setEnabled(false);
                radioSafari.setTextColor(Color.RED);
                break;

        }
        question = question + 1;
        displayQuestion(question);

    }

    public void ninthQuestion(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio1:
                if (checked)
                    showToast(R.string.good_job, Toast.LENGTH_SHORT);
                radio1.setEnabled(false);
                radio2.setEnabled(false);
                radio3.setEnabled(false);
                radio4.setEnabled(false);
                radio5.setEnabled(false);
                score = score + 700;
                displayScore(score);
                break;

            case R.id.radio2:
                if (checked)
                    Toast.makeText(this, R.string.right_answare_first, Toast.LENGTH_LONG).show();
                radio1.setEnabled(false);
                radio2.setEnabled(false);
                radio3.setEnabled(false);
                radio4.setEnabled(false);
                radio5.setEnabled(false);
                break;

            case R.id.radio3:
                if (checked)
                    Toast.makeText(this, R.string.right_answare_first, Toast.LENGTH_LONG).show();
                radio1.setEnabled(false);
                radio2.setEnabled(false);
                radio3.setEnabled(false);
                radio4.setEnabled(false);
                radio5.setEnabled(false);
                break;

            case R.id.radio4:
                if (checked)
                    Toast.makeText(this, R.string.right_answare_first, Toast.LENGTH_LONG).show();
                radio1.setEnabled(false);
                radio2.setEnabled(false);
                radio3.setEnabled(false);
                radio4.setEnabled(false);
                radio5.setEnabled(false);
                break;

            case R.id.radio5:
                if (checked)
                    Toast.makeText(this, R.string.right_answare_first, Toast.LENGTH_LONG).show();
                radio1.setEnabled(false);
                radio2.setEnabled(false);
                radio3.setEnabled(false);
                radio4.setEnabled(false);
                radio5.setEnabled(false);
                break;

        }
        question = question + 1;
        displayQuestion(question);
    }

    public void tenthQuestion(View view) {

        String finalAnsware = editText.getText().toString();

        if (finalAnsware.contains("2") || finalAnsware.equals("two") || finalAnsware.equals("Two") || finalAnsware.equals("Second") || finalAnsware.equals("second")) {
            showToast(R.string.good_job, Toast.LENGTH_SHORT);
            buttonSubmitAnsware.setEnabled(false);
            score = score + 200;
            displayScore(score);

            //calling the final method, where all questions and answare are hidden and noly shows score text and picture
            finalScore();

        } else if (finalAnsware.isEmpty()) {
            Toast.makeText(this, R.string.enter_something, Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this, R.string.right_answare_second, Toast.LENGTH_LONG).show();
            buttonSubmitAnsware.setEnabled(false);
            finalScore();
        }

        question = question + 1;
        displayQuestion(question);

    }

    private void finalScore() {

        introPage.setVisibility(View.GONE);
        firstQuestion.setVisibility(View.GONE);
        secondQuestion.setVisibility(View.GONE);
        thirdQuestion.setVisibility(View.GONE);
        fourthQuestion.setVisibility(View.GONE);
        fifthQuestion.setVisibility(View.GONE);
        sixthQuestion.setVisibility(View.GONE);
        seventhQuestion.setVisibility(View.GONE);
        eightQuestion.setVisibility(View.GONE);
        ninethQuestion.setVisibility(View.GONE);
        tenthQuestion.setVisibility(View.GONE);


        if (score == 2000) {
            einstenImageView.setVisibility(View.VISIBLE);
            maxScore.setVisibility(View.VISIBLE);

        } else if (score >= 1400) {
            almostImageView.setVisibility(View.VISIBLE);
            almostGeniusScore.setVisibility(View.VISIBLE);

        } else if (score >= 700) {
            averageImageView.setVisibility(View.VISIBLE);
            averageScore.setVisibility(View.VISIBLE);

        } else if (score < 700 && score >= 0) {
            thinkTwiceImageView.setVisibility(View.VISIBLE);
            thinkTwiceScore.setVisibility(View.VISIBLE);

        } else if (score < 0) {
            error404ImageView.setVisibility(View.VISIBLE);
            error404.setVisibility(View.VISIBLE);

        }

    }


    private void displayScore(int numberOfPoints) {


        quantityTextView.setText("Score: " + numberOfPoints);

    }

    private void displayQuestion(int numberOfQuestions) {


        displayQuestion.setText("Question " + numberOfQuestions + " of 10");

    }
}


