package com.example.quizone

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {

    private lateinit var questionTextView: TextView
    private lateinit var nextButton: Button

    private var currentQuestionIndex = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        // Инициализация элементов интерфейса
        questionTextView = findViewById(R.id.question_text)
        nextButton = findViewById(R.id.next_button)

        // Считывание вопросов из ресурсов
        val questions = resources.getStringArray(R.array.questions)

        // Отображение первого вопроса
        questionTextView.text = questions[currentQuestionIndex]

        // Обработчик для кнопки "Далее"
        nextButton.setOnClickListener {
            // Переход к следующему вопросу
            if (currentQuestionIndex < questions.size - 1) {
                currentQuestionIndex++
                questionTextView.text = questions[currentQuestionIndex]
            } else {
                // Когда все вопросы пройдены
                // Можно завершить квиз или показать результат
            }
        }
    }
}
