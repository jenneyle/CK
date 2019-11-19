package com.example.ck;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.QuestionHolder> {
 //   private List<Question> questions = new ArrayList<>();

    private List<Question> questionList;

    public QuestionAdapter(List<Question> questionList) {
        this.questionList = questionList;
    }


    @NonNull
    @Override
    public QuestionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.question_item, parent, false);
        return new QuestionHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionHolder holder, int position) {
        Question currentQuestion = questionList.get(position);
        holder.questionText.setText(currentQuestion.getQuestion());
        holder.aBtn.setText(currentQuestion.getAnswerA());
        holder.bBtn.setText(currentQuestion.getAnswerB());
        holder.cBtn.setText(currentQuestion.getAnswerC());
        holder.dBtn.setText(currentQuestion.getAnswerD());

    }

    @Override
    public int getItemCount() {
        return questionList.size();
    }

    public void setQuesitons(List<Question> quesitons){
        this.questionList = quesitons;
        notifyDataSetChanged();
    }

    class QuestionHolder extends RecyclerView.ViewHolder{
        TextView questionText;
        ImageView questionImage;
        TextView aBtn;
        TextView bBtn;
        TextView cBtn;
        TextView dBtn;

        public QuestionHolder(@NonNull View itemView) {
            super(itemView);
            questionImage = itemView.findViewById(R.id.question_image);
            questionText = itemView.findViewById(R.id.question);
            aBtn = itemView.findViewById(R.id.answer_a);
            bBtn = itemView.findViewById(R.id.answer_b);
            cBtn = itemView.findViewById(R.id.answer_c);
            dBtn = itemView.findViewById(R.id.answer_d);


        }
    }
}
