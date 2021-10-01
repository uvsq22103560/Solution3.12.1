public class chainecryptee {
     private String ch;
     private int dec;

     public chainecryptee(String chain, int decal){
         this.ch=chain;
         this.dec=decal;
     }
     String decrypte(){
         return this.ch;
     }
     private char decaleCharacter(char c, int decalage){
     return ( c < 'A'|| c > 'Z')? c : (char )((( c - 'A' + decalage) % 26 + 'A'));
     }
     public String crypte(String s, int d){
         String resultat="";
         for (int i=0; i<s.length();i++){
             resultat+=decaleCharacter(s.charAt(i),d);
         }
         return resultat;
     }
     public String decrypte(String c ,int d) {
         String resultat = "";
         for (int i = 0; i < c.length(); i++) {
             resultat += decaleCharacter(c.charAt(i), -d);
         }
         return resultat;
     }
     public static void main(String[] args){
         System.out.println("HELLO");
         String a="HELLO";
         chainecryptee b = new chainecryptee(a,2);
         System.out.println(b.crypte(a,7));
         String c=b.crypte(a,7);
         System.out.println(b.decrypte(c,7));

     }

}
