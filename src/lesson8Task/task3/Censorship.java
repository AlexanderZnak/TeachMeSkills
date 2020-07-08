package lesson8Task.task3;

import java.io.*;

public class Censorship {
    private static int count = 0;
    public static void main(String[] args) {
        String text = "But censorship is not only concerned with violence. It is sex concerned with ideas – social ideas, artistic ideas, political ideas. It concerns people’s right to freedom of speech, freedom of expression. And because people disagree about the meaning of freedom, there is disagreement about the meaning and necessity of censorship.";
        String text2 = "sex, violence";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src\\lesson8Task\\task3\\FirstFile.txt")); BufferedWriter writer2 = new BufferedWriter(new FileWriter("src\\lesson8Task\\task3\\SecondFile.txt"))) {
            writer.write(text);
            writer2.write(text2);
        }
        catch (IOException e) {
            e.getMessage();
        }
        try(BufferedReader reader = new BufferedReader(new FileReader("src\\lesson8Task\\task3\\FirstFile.txt")); BufferedReader reader2 = new BufferedReader(new FileReader("src\\lesson8Task\\task3\\SecondFile.txt"))) {
            String sentences = reader.readLine();
            String blacklist = reader2.readLine();
            String[] strSent = sentences.split("\\.");
            String[] strBlack = blacklist.split(",");
            getCens(strSent, strBlack);
            if (count > 0) {
                System.out.println(count);
            }
        }
        catch (IOException e) {
            e.getMessage();
        }

    }

    public static void getCens(String[] a, String [] b) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j].contains(b[i])) {
                    count++;
                    System.out.println(a[j].trim());
                }
            }
        }
        if (count > 0) {
            System.out.println("Text wasn't gone on the censorship");
        }
        else
            System.out.println("Text was gone on the censorship");
    }

}
