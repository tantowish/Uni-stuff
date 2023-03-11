public class schoolReport {
    public static void main(String[] args) {
        Student[] siswa = {
            new Student("Tanto", "S01"),
            new Student("Hanif", "S02"),
            new Student("Verlino", "S03"),
            new Student("Shyra", "S04")
        };
        Subject[] nilai={
            new Subject("Matematika", new int[] {80,100,60,80}),
            new Subject("Biologi", new int[] {60,90,50,80}),
        };
        // Subject nilai = new Subject("Matematika", new int[]{80,100,60});
    
        Report rank = new Report(siswa,nilai);
        rank.ranking();
        rank.getReport("Tanto");
        rank.getReport("Hanif");
        rank.getReport("Verlino");
        rank.getReport("Shyra");
    }
}
