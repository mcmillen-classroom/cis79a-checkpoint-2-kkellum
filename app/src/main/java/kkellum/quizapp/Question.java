package kkellum.quizapp;

public class Question {

    private int mTextResId;
    private int mHintTextResId;
    private boolean mAnswer;

    public Question(int question_1, boolean b) {
    }


    public int getHintTextResId() {
        return mHintTextResId;
    }

    public void setHintTextResId(int hintTextResId) {
        mHintTextResId = hintTextResId;
    }

    public Question(int textResId, int hintTextResId, boolean Answer) {
       mTextResId = textResId;
       mHintTextResId = hintTextResId;
       mAnswer = Answer;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void SetTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean getAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}

