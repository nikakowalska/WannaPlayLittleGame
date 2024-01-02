package Utils;

import Builders.TeamLeaderBuilder;
import Deck.Elements;
import Deck.TeamLeader;

import java.io.*;
import java.util.List;

public class FileReader {
    //dla aplikacji otwieranych w konsoli:
    public void readFile(String name, List<TeamLeader> teamLeaderList) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(".").getFile() + name); //znajduje katalog dlatego +name aby wpisac nazwe pliku ktory chce otworzyc
        try {
            readFile2(file, teamLeaderList);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //ogolny kod wykorzystywany w aplikacjach ktore otrzymuja lub wysylaja plik przez siec
    private void readFile2(File file, List<TeamLeader> teamLeaderList) throws FileNotFoundException {
        InputStream inputStream = new FileInputStream(file);//zamienia plik na 01
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitLine = line.split(";");
                teamLeaderList.add(new TeamLeader(splitLine[0], splitLine[1], Elements.valueOf(splitLine[2]), Boolean.parseBoolean(splitLine[3])));
                Strings.println(splitLine[1], Strings.Color.BLUE);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
