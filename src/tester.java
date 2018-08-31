public class tester {
    public static void main(String[] args) {
        int count=0;
        while (count<30){

            int yeet = count+4;
            if(yeet>29){
                yeet = yeet-30;
            }
            String message = "if (bogst == alphabet["+count+"]){"+" return "+"alphabet["+yeet+"];}";
            System.out.println(message);

            count++;
        }
    }
}
