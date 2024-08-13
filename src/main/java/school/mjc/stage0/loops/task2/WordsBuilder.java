package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {

        if (chars.length == 0) {
            return;
        }

        StringBuilder phrase = new StringBuilder();

        for (char c : chars) {
            phrase.append(c);
        }

        System.out.println(phrase);
    }
}
