
package javaapplication12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class JavaApplication12 {


    public static void main(String[] args) {
//       List text = new ArrayList<String>();
//       
//       text.add("code");
//       text.add("doce");
//       text.add("ecod");
//       text.add("framer");
//       text.add("frame");
//     
//        System.out.println( funwithanagrams(text));

//-----------------------//---------------------------
//    int nums [] = {-1,0};
//    int target = -1;
//   
//    
//     int resul [] = twoSum(nums, target);
//        for (int i = 0; i < resul.length; i++) {
//            System.out.println("resultado: " + resul[i]);
//        }
//    

//        var res = isPalindrome(121);
//        System.out.println(res);
        System.out.println(contarCaracter("Holaaa mundo", 'h'));
    }
    
    public static List<String> funwithanagrams(List<String> text) {
  
        List respuestas = new ArrayList<>();
        HashSet palabraRepetida = new HashSet<>();
                
        String[] array = new String[text.size()];
        array = text.toArray(array);
      
        for (String palabra : array) {
            char [] strings = palabra.toCharArray();
            Arrays.sort(strings);
            String key = new String(strings);
            if (!palabraRepetida.contains(key)) {
                respuestas.add(palabra);
                palabraRepetida.add(key);
            }
        }
     return respuestas;
    }
    
    public static int[] twoSum(int[] nums, int target) {
    
        int res [] = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) { 
                if ((nums[i]+nums[j])==target || (nums[i]-nums[j])==target ) {
                    res[0] = i;
                    res[1] = j;
                }
                
            }
        }
        return res;
    }
    
     public static int reverse(int x) {
         if (x == 0 ) return 0;
         String r = String.valueOf(x);
         String resa = "";
         char[] res = r.toCharArray();
         
         for (int i = res.length-1; i >= 0 ; i--) {
             if (res[i] == '-') {
                 resa = res[i] + resa;
                 break;
             }
             if (res[i] != '0') {
                 resa = resa +res[i]; 
             }
         }
        int p = Integer.parseInt(resa.toString());
         return p;
    }
     
      public static boolean isPalindrome(int x) {
         if (x == 0 ) return true;
         String r = String.valueOf(x);
         char[] res = r.toCharArray();
         int j = res.length-1;
         for (int i = 0 ; i < res.length ; i++, j--) {
             if (res[i] == res[j]) {
                 return true;
             } else {
                 return false;
             }
         }
         return false;
    }
      
       public static boolean isValid(String s) {
           String res = s.replace(")", "(").replace("]","[");
           char[] arr = res.toCharArray();
           int j = arr.length -1;
           for (int i = 0; i < arr.length; i++, j--) {
               System.out.println("i:"+arr[i]);
               System.out.println("j:"+arr[j]);
               if (arr[i] == arr[j]){
                   continue;
               } else {
                   return false;
               }
           } 
        return true;
    }
       
       public static int contarCaracter(String frase, char caracter){
           String tolo = frase.toLowerCase();
           char [] arr = tolo.toCharArray();
           //HashSet palabraRepetida = new HashSet();
                   int contador = 0;
            for (int i = 0; i < arr.length; i++) {
                if (caracter == arr[i]) {
                    contador++;
                }
           }
           
           return contador;
       }
    
    
}
