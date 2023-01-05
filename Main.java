public class Main {
    public static void main(String[] args) {
        public String concatPath(String folder,string file) {
            if (!folder.endsWith("\\")) {
                folder = folder + "\\";
            }
            return folder + file;
        }
    }
    
}