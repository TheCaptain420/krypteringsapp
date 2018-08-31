public class Stringkrypt {

    public void krypterny(String indsætbesked){
        Krypter krypter = new Krypter();
        char[] charArray = indsætbesked.toCharArray();

        for (int i = 0; i < charArray.length ; i++) {
            System.out.print (krypter.krypt(charArray[i]));

        }
    }
    public void dekrypterny(String indsætbesked){
        Dekrypt dekrypt = new Dekrypt();
        char[] charArray = indsætbesked.toCharArray();

        for (int i = 0; i < charArray.length ; i++) {
            System.out.print (dekrypt.dekrypt(charArray[i]));

        }
    }



}
