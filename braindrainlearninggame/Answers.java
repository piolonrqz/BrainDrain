/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braindrainlearninggame;

import javax.swing.JOptionPane;


/**
 *
 * @author luisp
 */
public class Answers {
     public String[] answers;

    public Answers() {
        answers = new String[100];
        generateAnswers();
    }

    private void generateAnswers() {
        // Array of sample easy questions
        String[] sampleAnswers = {
           "Paris",
            "7",
            "William Shakespeare",
            "H2O",
            "Canberra",
            "Pacific",
            "Au",
            "Saturn",
            "Mount Everest",
            "Blue Whale",
            "Yen",
            "0°C",
            "Jupiter",
            "Leonardo da Vinci",
            "Giant Panda",
            "299,792,458 m/s",
            "O",
            "Alexander Graham Bell",
            "Sahara",
            "100°C",
            "Pound Sterling",
            "Vatican City",
            "Ag",
            "Alexander Fleming",
            "Amazon",
            "Cherry Blossom",
            "Mitochondria",
            "Ostrich",
            "Harper Lee",
            "C",
            "Cheetah",
            "Brasília",
            "Titan",
            "Ludwig van Beethoven",
            "Fe",
            "Volga",
            "Ice Hockey",
            "Asia",
            "Mercury",
            "Christopher Columbus",
            "Moscow",
            "Lotus",
            "Na",
            "George Orwell",
            "Renminbi",
            "Greenland",
            "Venus",
            "Neil Armstrong",
            "Madrid",
            "He",
            "Sequoia",
            "Vincent van Gogh",
            "Beaver",
            "Whale Shark",
            "Australian Dollar",
            "N",
            "Jane Austen",
            "343 m/s",
            "Himalayas",
            "Bald Eagle",
            "Ca",
            "Albert Einstein",
            "Victoria",
            "Iris",
            "Real",
            "K",
            "F. Scott Fitzgerald",
            "Olympus Mons",
            "Kangaroo",
            "Canadian Dollar",
            "Sn",
            "Leonardo da Vinci",
            "Peregrine Falcon",
            "Rome",
            "Cu",
            "Isaac Newton",
            "Jupiter",
            "Rose",
            "U",
            "William Shakespeare",
            "Angel Falls",
            "Bengal Tiger",
            "Rupee",
            "Pb",
            "Benjamin Franklin",
            "Superior",
            "Sumo Wrestling",
            "Euro",
            "Hg",
            "Leonardo da Vinci",
            "Blue Whale",
            "Beijing",
            "Si",
            "Charles Darwin",
            "Denali",
            "Plum Blossom",
            "Euro",
            "Mg",
            "J.D. Salinger"
            
        };

        for (int i = 0; i < sampleAnswers.length && i < answers.length; i++) {
            answers[i] = sampleAnswers[i];
        }
    }
        
        public boolean checkAnswer(int index, String userAnswer) {
        if (index < 0 || index >= answers.length) {
            return false; // Invalid index
        }
        // Get the correct answer for the given question index
        String correctAnswer = answers[index];
        // Check if the user's answer matches the correct answer (case-insensitive)
        return correctAnswer != null && correctAnswer.equalsIgnoreCase(userAnswer);
    }
}
