public class Report {
    Student[] siswa;
    Subject[] nilai;
    int[] total;
    public Report(Student[] siswa,Subject[] nilai){
        this.siswa=siswa;
        this.nilai=nilai;
    }
    public void ranking(){
        // Total dari dua mata pelajaran
        total = new int[siswa.length];
        for(int i=0;i<siswa.length;i++){
            for(int j=0;j<nilai.length;j++){
                total[i]+=nilai[j].nilai[i];
            }
        }
        // Sorting nilai total dan siswa menggunakan nilai total sebagai acuan
        for(int i =0;i<siswa.length-1;i++){
            for(int j =0;j<siswa.length-1;j++){
                if(total[j]<total[j+1]){
                    int tmp = total[j];
                    total[j]=total[j+1];
                    total[j+1]=tmp;
                    Student tmp2 = siswa[j];
                    siswa[j]=siswa[j+1];
                    siswa[j+1]=tmp2;
                }
            }
        }
    }
    public void getReport(String nama){
        for(int i=0;i<siswa.length;i++){
            if(nama.equals(siswa[i].nama)){
                System.out.println("Num         : " + siswa[i].num);
                System.out.println("Ranking     : "+ (i+1));
                System.out.println("Total Nilai : "+total[i]);
            }
        }
    }
}
