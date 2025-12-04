//Simple quiz with four difficulty levels. 
//Antonio Thomas
//october 5, 2025
//Note: invaid inputs are not properly handled and are treated as wrong answers. 
//Note: 
import java.util.*;
// import java.util.stream.Collector;
public class AThomas_SimpleQuizGame {

    public static void main(String[] args) {

        System.out.println("Pick the difficulty level of questions from level 0 to 3. Level 3 will include questions from all difficulties and get harder as you answer questions.");
        Scanner scanner = new Scanner(System.in); 

        int difficulty = scanner.nextInt(); 
        scanner.nextLine(); 

        //  questions
        ArrayList<String> easyQuestions = new ArrayList<>();
        easyQuestions.add("This Italian is a fictional being created by a Japanese company and is an American from the West Coast in shows and movies.\n A) Magica De Spell B) Mario Mario C) Francesco Bernoulli D) Peppino Spaghetti");
        easyQuestions.add("This bird is known for its depictions in movies set in Brazil and has been classified as extinct in the wild since 2019 by the IUCN Red List.\n A)Imperial woodpecker B)Yellow-breasted bunting C) Spix's macaw D) Undulated tinamou");
        easyQuestions.add("This Sudoscience focuses on the back of a human's body, and the creator of this practice claimed a spirit of a dead doctor from 50 years earlier told him about it.\n A) Apitherapy B) Chiropractic C) Acupuncture D) Apitherapy");
        easyQuestions.add("This holiday is often mistaken for a national holiday in Mexico; it is instead a celebration of the victory of the Battle of Puebla.\n A) Grito de Dolores B) Día de la Bandera, C) Día de la Marina, D) Cinco de Mayo");
        easyQuestions.add("The Great War was a military conflict sparked by the assassination of this person.\n A) Archduke Franz Ferdinand  B) Kaiser Wilhelm II C) Tsar Nicholas II D) Gavrilo Princip");

        ArrayList<String> midQuestions = new ArrayList<>();
        midQuestions.add("Sometimes said to have once failed math, Albert Einstein never failed a math class; this misconception likely stems from the difference in these grading systems. A) German and Austrian B) Swiss and American C) German and Swiss D) Austrian and Swiss");
        midQuestions.add("The first Europeans made landfall on mainland North America during this century.\n A) 9th B) 10th C) 13th D) 14th");
        midQuestions.add("This Latin phrase means 'the situation as it existed before the war'. This is also known as a white peace.\n A) Ex post facto B) Status quo ante bellum C) Pax Romana D) Sine qua non");
        midQuestions.add("This is when a victory is achieved, but the cost of victory leads to defeat.\n A) Pyrrhic victory B) Coup de grâce C) Hollow triumph D) Faustian bargain");
        midQuestions.add("A contestant is on a game show where they must pick one of 3 doors, one of which contains a prize. They chose door 3. The host then opens door 2 to reveal a goat and offers a chance for the contestant to switch. They should do what?\n A) Stay with door 3 B) Switch to door 1 C) It doesn't matter");

        ArrayList<String> hardQuestions = new ArrayList<>();
        hardQuestions.add("This war, sometimes called World War 0, is named after a region which saw significant fighting.\n A)The Crimean War B) The Franco-Prussian War C) The Russo-Turkish War D) The Balkan War");
        hardQuestions.add("This person is a Czech national hero and was further popularized by a video game set in the early 15th century is known for his battles against the catholic crusaders.\n A) Jan Hus B) Charles IV C) Wenceslaus IV D) Jan Žižka");
        hardQuestions.add("Wikipedia is an online encyclopedia that can be downloaded in its entirety for this many gigabytes.\n A)210 GB B)52 GB C)102 GB D)500 GB");
        hardQuestions.add("This conflict is considered to be the longest military conflict in history.\n A)The Hundred Years' War B)The Punic Wars C)The Reconquista D)The Crusades");
        hardQuestions.add("Logician Carl Gustav Hempel provided what he called a paradox, where if one wanted to prove, for example, that all trees grow wood, an object like a car would be evidence of the statement 'all trees grow wood'. This is the name of this paradox.\n A) Raven Paradox B) Verification Paradox C) Epistemic Paradox D) Black Swan Paradox");

        // answers
        ArrayList<String> easyAnswers = new ArrayList<>();
        easyAnswers.add("B");
        easyAnswers.add("C");
        easyAnswers.add("C");
        easyAnswers.add("D");
        easyAnswers.add("A");

        ArrayList<String> midAnswers = new ArrayList<>();
        midAnswers.add("C");
        midAnswers.add("B");
        midAnswers.add("B");
        midAnswers.add("A");
        midAnswers.add("B");

        ArrayList<String> hardAnswers = new ArrayList<>();
        hardAnswers.add("D");
        hardAnswers.add("D");
        hardAnswers.add("C");
        hardAnswers.add("C");
        hardAnswers.add("A");

        // shuffle
        // https://www.geeksforgeeks.org/java/collections-shuffle-method-in-java-with-examples/
        List<Integer> easyIndices = new ArrayList<>(); 
        for (int i = 0; i < easyQuestions.size(); i++) easyIndices.add(i);
        Collections.shuffle(easyIndices);

        List<Integer> midIndices = new ArrayList<>();
        for (int i = 0; i < midQuestions.size(); i++) midIndices.add(i);
        Collections.shuffle(midIndices);

        List<Integer> hardIndices = new ArrayList<>();
        for (int i = 0; i < hardQuestions.size(); i++) hardIndices.add(i);
        Collections.shuffle(hardIndices);

        int score = 0;
        System.out.println("Welcome to the Quiz! Type your answer (A–D)\n");

        
        if (difficulty == 0) { // easy
            for (int i : easyIndices) {
                System.out.println("Question: " + easyQuestions.get(i));
                String input = scanner.nextLine().trim().toUpperCase();// makes sure lower case and upercase works


                if (input.equals(easyAnswers.get(i).toUpperCase())) {
                    score++;
                }
            }
            System.out.println("You scored " + score + " out of 5.");
        }

        if (difficulty == 1) { // mid
            for (int i : midIndices) {
                System.out.println("Question: " + midQuestions.get(i));
                String input = scanner.nextLine().trim().toUpperCase();

                if (input.equals(midAnswers.get(i).toUpperCase())) {
                    score++;
                }
            }
            System.out.println("You scored " + score + " out of 5.");
        }

        if (difficulty == 2) {   // hard 
            for (int i : hardIndices) {
                System.out.println("Question: " + hardQuestions.get(i));
                String input = scanner.nextLine().trim().toUpperCase();

                if (input.equals(hardAnswers.get(i).toUpperCase())) {
                    score++;
                }
            }
            System.out.println("You scored " + score + " out of 5.");
        }
        if (difficulty == 3) { // full set of questions
            for (int i : easyIndices) { // easy first 
                System.out.println("Question: " + easyQuestions.get(i));
                String input = scanner.nextLine().trim().toUpperCase();

                if (input.equals(easyAnswers.get(i).toUpperCase())) {
                    score++;
                }
            }
            
            for (int i : midIndices) { // mid
                System.out.println("Question: " + midQuestions.get(i));
                String input = scanner.nextLine().trim().toUpperCase();

                if (input.equals(midAnswers.get(i).toUpperCase())) {
                    score++;
                }
            }
            for (int i : hardIndices) { // hard
                System.out.println("Question: " + hardQuestions.get(i));
                String input = scanner.nextLine().trim().toUpperCase();

                if (input.equals(hardAnswers.get(i).toUpperCase())) {
                    score++;
                }
            }
            
            System.out.println("You scored " + score + " out of " + "15.");
        }

        scanner.close(); 
    }
}
