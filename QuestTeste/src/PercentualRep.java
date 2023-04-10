public class PercentualRep {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double others = 19849.53;

        double total = sp+rj+mg+es+others;

        double psp = ((sp/total)*100);
        double prj = ((rj/total)*100);
        double pmg = ((mg/total)*100);
        double pes = ((es/total)*100);
        double pothers = ((others/total)*100);

        System.out.printf("Percentual de representação de SP: %.2f \n", psp );
        System.out.printf("Percentual de representação do RJ: %.2f \n", prj );
        System.out.printf("Percentual de representação de MG: %.2f \n", pmg );
        System.out.printf("Percentual de representação do ES: %.2f \n", pes );
        System.out.printf("Percentual de representação dos outos estados: %.2f \n", pothers );


    }
}
