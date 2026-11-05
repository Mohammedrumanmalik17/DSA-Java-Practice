package acc;


public class FileLatest {
    public static void main(String[] args) {
        String[] files = {"file1", "file3", "file4", "file2"};
        System.out.println("Latest file: " + findLatestFile(files));
    }

    public static String findLatestFile(String[] files) {
        String latestFile = files[0];
        int maxNumber = getFileNumber(latestFile);

        for (String file : files) {
            int fileNumber = getFileNumber(file);
            if (fileNumber > maxNumber) {
                maxNumber = fileNumber;
                latestFile = file;
            }
        }
        return latestFile;
    }

    private static int getFileNumber(String fileName) {
        return Integer.parseInt(fileName.replaceAll("\\D", ""));
    }
}
