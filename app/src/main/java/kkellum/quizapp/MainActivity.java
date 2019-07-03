package kkellum.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTextView;


    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;
    private Button mPrevious;

    private Question[] mQuestions;
    private int mIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTrueButton = (Button) findViewById(R.id.true_button);
        mFalseButton = (Button) findViewById(R.id.False_button);
        mNextButton = (Button) findViewById(R.id.next_button);
        mPrevious = (Button) findViewById(R.id.previous_button);


        mTrueButton.setOnClickListener(this);
        mFalseButton.setOnClickListener(this);
        mNextButton.setOnClickListener(this);
        mPrevious.setOnClickListener(this);

        mTextView = (TextView) findViewById(R.id.text_view);

        // Initialize an array of questions.
        mQuestions = new Question[4];
        mIndex = 0;

        // Initialize each slot in the array.
        mQuestions[0] = new Question(R.string.question_1,true);
        mQuestions[1] = new Question(R.string.question_2, false);
        mQuestions[2] = new Question(R.string.question_3, true);
        mQuestions[3] = new Question(R.string.question_4, false);
        mQuestions[4] = new Question(R.string.question_5, false);

        mTextView.setText(mQuestions[mIndex].getTextResId());

    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.true_button) {
            checkAnswer(true);

            Toast myToast = Toast.makeText(this, "You are correct", Toast.LENGTH_SHORT);
            myToast.show();

        } else if (view.getId() == R.id.False_button) {
            checkAnswer(false);
        }
        else if (view.getId() == R.id.next_button)
        {

            // change to the next question...

            //Increment the index by one.
            mIndex++;

            //do if statement here:
            // if the mIdex is greater than or equal to mQuestions.length
            //  -set mIndex to 0
            // - end the quiz

            //change text in view.
            mTextView.setText(mQuestions[mIndex].getTextResId());



        } else {
            Toast myToast = Toast.makeText(this, "You are incorrect!", Toast.LENGTH_SHORT);
            myToast.show();
        }
    }

    public boolean checkAnswer(boolean userInput)
    {
        if(mQuestions[mIndex].getAnswer() == userInput)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}





