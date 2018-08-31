public class Krypter {
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
     char krypt(char bogst){
         if (bogst == alphabet[0]){ return alphabet[4];}
         if (bogst == alphabet[1]){ return alphabet[5];}
         if (bogst == alphabet[2]){ return alphabet[6];}
         if (bogst == alphabet[3]){ return alphabet[7];}
         if (bogst == alphabet[4]){ return alphabet[8];}
         if (bogst == alphabet[5]){ return alphabet[9];}
         if (bogst == alphabet[6]){ return alphabet[10];}
         if (bogst == alphabet[7]){ return alphabet[11];}
         if (bogst == alphabet[8]){ return alphabet[12];}
         if (bogst == alphabet[9]){ return alphabet[13];}
         if (bogst == alphabet[10]){ return alphabet[14];}
         if (bogst == alphabet[11]){ return alphabet[15];}
         if (bogst == alphabet[12]){ return alphabet[16];}
         if (bogst == alphabet[13]){ return alphabet[17];}
         if (bogst == alphabet[14]){ return alphabet[18];}
         if (bogst == alphabet[15]){ return alphabet[19];}
         if (bogst == alphabet[16]){ return alphabet[20];}
         if (bogst == alphabet[17]){ return alphabet[21];}
         if (bogst == alphabet[18]){ return alphabet[22];}
         if (bogst == alphabet[19]){ return alphabet[23];}
         if (bogst == alphabet[20]){ return alphabet[24];}
         if (bogst == alphabet[21]){ return alphabet[25];}
         if (bogst == alphabet[22]){ return alphabet[26];}
         if (bogst == alphabet[23]){ return alphabet[27];}
         if (bogst == alphabet[24]){ return alphabet[28];}
         if (bogst == alphabet[25]){ return alphabet[0];}
         if (bogst == alphabet[26]){ return alphabet[1];}
         if (bogst == alphabet[27]){ return alphabet[2];}
         if (bogst == alphabet[28]){ return alphabet[3];}
         else{
             return 'a';
         }
     }

}
