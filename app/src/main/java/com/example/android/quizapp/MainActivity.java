package com.example.android.quizapp;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int result;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getResult(View view) {
        EditText username = findViewById(R.id.name);
        String name = username.getText().toString();
        TextView Message = findViewById(R.id.resultMessage);
        Button result_button = findViewById(R.id.result_button);

        if (name.matches("")) {
            Context context = getApplicationContext();
            CharSequence text = getString(R.string.enter_your_name);
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else if (result > 4) {
            Message.setText(getString(R.string.more_than_four, result));
            Message.setVisibility(View.VISIBLE);
            result_button.setVisibility(View.GONE);

            Context context = getApplicationContext();
            CharSequence text = getString(R.string.more_than_four, result);
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else {
            Message.setText(getString(R.string.Less_than_four, result));
            Message.setVisibility(View.VISIBLE);
            result_button.setVisibility(View.GONE);

            Context context = getApplicationContext();
            CharSequence text = getString(R.string.more_than_four, result);
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();


        }


    }

    //submit procedure that takes the id of right radio group and the right radio button as input to check the right answer
    private void submit(int right_radiobutton, int Radiogroup, int submission, int right_text) {

        // The selected Radio Group
        RadioGroup radioGroup = findViewById(Radiogroup);

        //Get the user's name
        EditText username = findViewById(R.id.name);
        String name = username.getText().toString();

        //Text that displays right or wrong
        TextView right = findViewById(right_text);

        //The right answer of the question
        RadioButton right_answer = findViewById(right_radiobutton);
        Boolean isRight = right_answer.isChecked();

        //submit button
        Button submit1 = findViewById(submission);
        // if statement which know whether the answer is right or wrong

        if (isRight) {
            right.setVisibility(View.VISIBLE);
            radioGroup.setVisibility(View.GONE);
            Context context = getApplicationContext();
            CharSequence text = getString(R.string.Right_Answer) + name;
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            result++;

            //question submit button

            submit1.setVisibility(View.GONE);
        } else {
            if (radioGroup.getCheckedRadioButtonId() == -1) {
                Context context = getApplicationContext();
                CharSequence text = getString(R.string.question_answer);
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            } else {
                right.setText(getString(R.string.wrong));
                right.setVisibility(View.VISIBLE);

                //question submit button
                submit1.setVisibility(View.GONE);

                radioGroup.setVisibility(View.GONE);

                Context context = getApplicationContext();
                CharSequence text = getString(R.string.wrong_answer);
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        }
    }

    /**
     * Submit 1 is used in  question 1 submission button
     *
     * @param view
     */
    public void submit1(View view) {
        submit(R.id.right_answer, R.id.firstRadioGroup, R.id.submit1, R.id.right_text1);
    }

    /**
     * submit2 is used in  question two submission button
     *
     * @param view
     */

    public void submit2(View view) {
        submit(R.id.right_answer2, R.id.seconedRadioGroup, R.id.submit2, R.id.right2);
    }

    /**
     * submit3 is used in question three submission button
     *
     * @param view
     */
    public void submit3(View view) {
        submit(R.id.right_answer3, R.id.thirdRadioGroup, R.id.submit3, R.id.right3);
    }

    /**
     * submit4 is used in question four submission button
     *
     * @param view
     */
    public void submit4(View view) {
        submit(R.id.right_answer4, R.id.fourthRadioGroup, R.id.submit4, R.id.right4);
    }

    /**
     * submit5 is used in question five submission button
     *
     * @param view
     */
    public void submit5(View view) {
        submit(R.id.right_answer5, R.id.fifthRadioGroup, R.id.submit5, R.id.right5);
    }

    /**
     * submit6 is used in  question six submission button
     *
     * @param view
     */
    public void submit6(View view) {
        submit(R.id.right_answer6, R.id.sixthRadioGroup, R.id.submit6, R.id.right6);
    }

    /**
     * submit7 is used in question seven submission button
     *
     * @param view
     */
    public void submit7(View view) {
        submit(R.id.right_answer7, R.id.seventhRadioGroup, R.id.submit7, R.id.right7);
    }

    /**
     * submit_check_box is used in question eight submission button
     *
     * @param view
     */
    public void submit_check_box(View view) {
        CheckBox one = findViewById(R.id.checkbox1);
        CheckBox two = findViewById(R.id.checkbox2);
        CheckBox three = findViewById(R.id.checkbox3);
        CheckBox four = findViewById(R.id.checkbox4);

        TextView right = findViewById(R.id.right8);

        EditText username = findViewById(R.id.name);
        String name = username.getText().toString();

        Button submit8 = findViewById(R.id.submit8);


        if (!one.isChecked() & !two.isChecked() & !three.isChecked() & !four.isChecked()) {
            Context context = getApplicationContext();
            CharSequence text = getString(R.string.question_answer);
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else if (one.isChecked() & two.isChecked() & three.isChecked() & !four.isChecked()) {
            right.setVisibility(View.VISIBLE);
            submit8.setVisibility(View.GONE);
            one.setVisibility(View.GONE);
            two.setVisibility(View.GONE);
            three.setVisibility(View.GONE);
            four.setVisibility(View.GONE);

            Context context = getApplicationContext();
            CharSequence text = getString(R.string.Right_Answer) + name;
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            result++;
        } else {
            right.setText(getString(R.string.wrong));
            right.setVisibility(View.VISIBLE);
            submit8.setVisibility(View.GONE);
            one.setVisibility(View.GONE);
            two.setVisibility(View.GONE);
            three.setVisibility(View.GONE);
            four.setVisibility(View.GONE);

            Context context = getApplicationContext();
            CharSequence text = getString(R.string.wrong_answer);
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

    public void submit_text_question(View view) {
        EditText nine = findViewById(R.id.ninth_answer);

        EditText username = findViewById(R.id.name);
        String name = username.getText().toString();

        String nine_user_answer = nine.getText().toString();
        String ninth_answer = getString(R.string.Egypt);

        TextView right9 = findViewById(R.id.right9);

        Button submit9 = findViewById(R.id.submit9);

        if (nine_user_answer.matches(ninth_answer)) {
            result++;

            right9.setText(R.string.right);
            right9.setVisibility(View.VISIBLE);
            nine.setVisibility(View.GONE);
            submit9.setVisibility(View.GONE);


            Context context = getApplicationContext();
            CharSequence text = getString(R.string.Right_Answer) + name;
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        } else if (nine_user_answer.matches("")) {
            Context context = getApplicationContext();
            CharSequence text = getString(R.string.question_answer);
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }else{
            Context context = getApplicationContext();
            CharSequence text = getString(R.string.wrong_answer);
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

            right9.setText(R.string.wrong);
            right9.setVisibility(View.VISIBLE);
            submit9.setVisibility(View.GONE);
            nine.setVisibility(View.GONE);
        }
    }
}
