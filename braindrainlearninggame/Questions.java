/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braindrainlearninggame;

/**
 *
 * @author luisp
 */
public class Questions {
     public String[] questions;

    public Questions() {
        questions = new String[100];
        generateQuestions();    
    }

    private void generateQuestions() {
        // Array of sample easy questions
        String[] sampleQuestions = {
            "What is the capital of France?",
            "How many continents are there?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the chemical symbol for water?",
            "What is the capital of Australia?",
            "What is the largest ocean on Earth?",
            "What is the chemical symbol for gold?",
            "What is the 6th planet in our solar system?",
            "What is the tallest mountain in the world?",
            "What is the largest mammal?",
            "What is the currency of Japan?",
            "What is the freezing point of water in Celsius?",
            "What is the largest planet in our solar system?",
            "Who painted the Mona Lisa?",
            "What is the national animal of China?",
            "What is the speed of light in a vacuum?",
            "What is the chemical symbol for oxygen?",
            "Who invented the telephone?",
            "What is the largest desert in the world?",
            "What is the boiling point of water in Celsius?",
            "What is the currency of the United Kingdom?",
            "What is the smallest country in the world?",
            "What is the chemical symbol for silver?",
            "Who discovered penicillin?",
            "What is the largest river in the world?",
            "What is the national flower of Japan?",
            "What is the powerhouse of the cell?",
            "What is the largest bird in the world?",
            "Who wrote 'To Kill a Mockingbird'?",
            "What is the chemical symbol for carbon?",
            "What is the fastest land animal?",
            "What is the capital of Brazil?",
            "What is the largest moon of Saturn?",
            "Who composed 'Moonlight Sonata'?",
            "What is the chemical symbol for iron?",
            "What is the longest river in Europe?",
            "What is the national sport of Canada?",
            "What is the largest continent?",
            "What is the smallest planet in our solar system?",
            "Who discovered America?",
            "What is the capital of Russia?",
            "What is the national flower of India?",
            "What is the chemical symbol for sodium?",
            "Who wrote '1984'?",
            "What is the currency of China?",
            "What is the largest island in the world?",
            "What is the hottest planet in our solar system?",
            "Who was the first man to step on the moon?",
            "What is the capital of Spain?",
            "What is the chemical symbol for helium?",
            "What is the largest tree species in the world?",
            "Who painted 'Starry Night'?",
            "What is the national animal of Canada?",
            "What is the largest fish in the world?",
            "What is the currency of Australia?",
            "What is the chemical symbol for nitrogen?",
            "Who wrote 'Pride and Prejudice'?",
            "What is the speed of sound in air?",
            "What is the highest mountain range in the world?",
            "What is the national bird of the United States?",
            "What is the chemical symbol for calcium?",
            "Who discovered the theory of relativity?",
            "What is the largest lake in Africa?",
            "What is the national flower of France?",
            "What is the currency of Brazil?",
            "What is the chemical symbol for potassium?",
            "Who wrote 'The Great Gatsby'?",
            "What is the largest volcano in the solar system?",
            "What is the national animal of Australia?",
            "What is the currency of Canada?",
            "What is the chemical symbol for tin?",
            "Who painted the ceiling of the Sistine Chapel?",
            "What is the fastest bird in the world?",
            "What is the capital of Italy?",
            "What is the chemical symbol for copper?",
            "Who discovered gravity?",
            "What is the largest planet in our solar system?",
            "What is the national flower of the United States?",
            "What is the chemical symbol for uranium?",
            "Who wrote 'Hamlet'?",
            "What is the highest waterfall in the world?",
            "What is the national animal of India?",
            "What is the currency of India?",
            "What is the chemical symbol for lead?",
            "Who discovered electricity?",
            "What is the largest lake in the world by surface area?",
            "What is the national sport of Japan?",
            "What is the currency of Germany?",
            "What is the chemical symbol for mercury?",
            "Who painted the 'Last Supper'?",
            "What is the largest mammal in the ocean?",
            "What is the capital of China?",
            "What is the chemical symbol for silicon?",
            "Who discovered the theory of evolution?",
            "What is the highest mountain in North America?",
            "What is the national flower of China?",
            "What is the currency of France?",
            "What is the chemical symbol for magnesium?",
            "Who wrote 'The Catcher in the Rye'?"
            
        };
        
        for (int i = 0; i < sampleQuestions.length && i < questions.length; i++) {
            questions[i] = sampleQuestions[i];
        }
    }

    // Method to get question by index
    public String getQuestionByIndex(int index) {
        if (index < 0 || index >= questions.length) {
            return "Invalid index";
        }
        return questions[index];
    }
}
