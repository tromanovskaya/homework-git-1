package lesson6Strings;

import utils.StringUtils;

import static utils.ArrayUtils.printArray;
import static utils.ArrayUtils.sortBubbleArray;

public class Demo {
    public static void main(String[] args) {
        String s = "Более 30 тысяч пользователей «Авто барахолки» ждали 11 октября. " +
                "Ведь именно сегодня состоится розыгрыш автомобиля *Hyundai Accent*? " +
                "В конкурсе приняли участие 32096 объявлений, которые соответствовали правилам. " +
                "Сегодня, примерно в 12:30, мы узнаем победителя? " +
                "«Трансляция» розыгрыша будет вестись прямо в данной заметке, поэтому не *спешите* ее закрывать узнаем.";
        runTask1(s);
        runTask2(s);
        runTask3(s);
        runTask4(s);
        runTask5(s);
        runTask6(s);
        runTask7(s);
        runTask8(s);
    }

    private static void runTask1(String stringIn) {
        System.out.println("1. Преобразовать текст так, чтобы каждое слово начиналось с заглавной буквы.");
        System.out.println("String in = " + stringIn);
        String stringOut = "";
        String[] letters = stringIn.split("");
        //printArray(sArray);
        for (int i = 0; i < letters.length; i++) {
            if (i == 0) {
                letters[0] = letters[0].toUpperCase();
            } else if (letters[i - 1].equals("\u00a0") || letters[i - 1].equals(" ")) {
                letters[i] = letters[i].toUpperCase();
            }
            stringOut += letters[i];
        }
        System.out.println("String out = " + stringOut);
    }

    private static void runTask2(String stringIn) {
        System.out.println("\n2. Подсчитать количество содержащихся в данном тексте знаков препинания");
        String stringWithoutPunct;
        stringWithoutPunct = stringIn.replaceAll("\\p{Punct}", "");
        System.out.println("stringWithoutPunct = " + stringWithoutPunct);
        System.out.println("Namber of punct = " + (stringIn.length() - stringWithoutPunct.length()));
    }

    private static void runTask3(String stringIn) {
        System.out.println("\n3.  Определить сумму всех целых чисел, встречающихся в заданном тексте");
        String[] words = stringIn.split(" ");
        int sumValues = 0;
        String valuesInt = "";
        //printArray(sArray);
        for (int i = 0; i < words.length; i++) {
            if (words[i] == words[i].replaceAll("[^0-9]", "")) {
                sumValues = +Integer.parseInt(words[i]);
                valuesInt += Integer.parseInt(words[i]) + " ";
            }
        }
        System.out.println("valuesInt = " + valuesInt);
        System.out.println("sumValues = " + sumValues);
    }

    private static void runTask4(String stringIn) {
        System.out.println("\n4. В каждом слове текста k-ю букву заменить заданным символом. Если  k больше длины слова, корректировку не выполнять.");
        String[] words = stringIn.split(" ");
        int k = 5;
        String symbol = "#";
        String stringOut = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= k) {
                stringOut += words[i].substring(0, k - 1) + symbol;
                if (words[i].length() > k) {
                    stringOut += words[i].substring(k, words[i].length());
                }
                stringOut += " ";

            } else {
                stringOut += words[i] + " ";
            }
        }
        stringOut = stringOut.trim();
        System.out.println(stringOut);
    }

    private static void runTask5(String stringIn) {
        System.out.println("\n5. Удалить из текста его часть, заключенную между двумя символами, которые вводятся (например, между скобками ‘(’ и ‘)’ или между звездочками ‘*’ и т.п.).");
        String symbolStart = "«";
        String symbolEnd = "»";
        String symbol = "*";
        System.out.println("deleteIncludeSymbols '" + symbolStart + "' and '" + symbolEnd + "'");
        System.out.println(StringUtils.deleteIncludeSymbols(stringIn, symbolStart, symbolEnd));
        System.out.println("deleteIncludeSymbols '" + symbol + "'");
        System.out.println(StringUtils.deleteIncludeSymbols(stringIn, symbol));
        System.out.println(StringUtils.deleteIncludeSymbols(stringIn, symbol, symbol));
    }

    private static void runTask6(String stringIn) {
        System.out.println("\n6.  Найти и напечатать, сколько раз повторяется в тексте каждое слово, которое встречается в нем.");
        String[] wordsSorted = sortBubbleArray(stringIn.toLowerCase().replaceAll("\\p{Punct}", "").split(" "));
        printArray(wordsSorted);
        int count = 0;
        String distinctResult = "";
        for (int i = 0; i < wordsSorted.length; i++) {
            if (i < wordsSorted.length - 1) {
                if (wordsSorted[i].equals(wordsSorted[i + 1])) {
                    count++;
                } else {
                    count++;
                    System.out.println(count + " : " + wordsSorted[i]);
                    count = 0;
                }
            }
        }
    }

    private static void runTask7(String stringIn) {
        System.out.println("\n7. Найти, каких букв, гласных или согласных, больше в каждом предложении текста");
        String[] sentences = stringIn.split("[\\.\\!\\?]");
        for (int i = 0; i < sentences.length; i++) {
            int countVolwels = StringUtils.countVolwelsRU(sentences[i]);
            int countConsonants = StringUtils.countConsonantRU(sentences[i]);
            String moreLetters;
            if (countVolwels > countConsonants) {
                moreLetters = "more vowels in the sentence";
            } else if (countVolwels < countConsonants) {
                moreLetters = "more consonants in the sentence";
            } else {
                moreLetters = "in the sentence of equally vowels and consonants";
            }
            System.out.println("sentence " + i + ": " + moreLetters + " (countVolwels = " + countVolwels + " countConsonant = " + countConsonants + ")");
        }
    }

    private static void runTask8(String stringIn) {
        System.out.println("\n8. Во всех вопросительных предложениях текста найти и напечатать без повторений слова заданной длины");

        String[] interrogativeSentences = StringUtils.getInterrogativeSentences(stringIn);
        for (int i = 0; i < interrogativeSentences.length; i++) {
            System.out.println(interrogativeSentences[i]);
        }


    }

}
