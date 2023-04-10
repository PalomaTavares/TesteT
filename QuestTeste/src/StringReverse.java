

public class StringReverse{
    public static void main(String[] args) {
        String str = "StrTeste";
        char[] strChar = str.toCharArray();
        int ini = 0;
        int tam = strChar.length-1;
        char temp;

        while(ini <= tam){
            temp = strChar[ini];
            strChar[ini] = strChar[tam];
            strChar[tam] = temp;
            tam--;
            ini++;
        }

        str = new String(strChar);
        System.out.println(str);

    }
}