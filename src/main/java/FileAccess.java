import java.io.*;

public class FileAccess {

    // method to check if file exists
    public static boolean doesFileExist(String path) {
        File file = new File(path);
        try {
            if (file.exists()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // method to read the dictionary file and print the words and meanings
    public static void readDictionary(String path) {
        File file = new File(path);
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));
            String line;
            String word = "";
            String meaning = "";

            while ((line = br.readLine()) != null) {
                String[] parts = line.split("-");
                word = parts[0].trim();
                meaning = parts[1].trim();
                System.out.println(word);
                System.out.println(meaning.replaceAll(",", "\n"));
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            System.out.println("The specified file does not exist.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String path = "dictionary.txt";
        if (doesFileExist(path)) {
            readDictionary(path);
        }
    }

}




