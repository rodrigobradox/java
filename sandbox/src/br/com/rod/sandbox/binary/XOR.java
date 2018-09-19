package br.com.rod.sandbox.binary;

/**
 * @author Rodrigo Feitosa Soares
 * XOR (Ou Exclusivo)
 */

public class XOR {
    
    private static String BINARY_PAD = "0000000000000000";
    
    private static String intToBinary(int inteiro, String lpad) {
        String binary = Integer.toBinaryString(inteiro);
        return lpad.substring(binary.length()) + binary;
    }

    public static void main (String[] args) {
        int f = 74; //em bin�rio 1 = 01
        int g = 65; //em bin�rio 2 = 10
        
        System.out.println("XOR");
        System.out.println("------------------------------------------");
        System.out.println("f = "+ f +", g = "+ g);
        System.out.println("------------------------------------------");
        
        int x = f ^ g; //l�-se 01 XOR 10, resultando em 11, que em decimal � 3
        System.out.println("x = f ^ g => "+ f +" ^ "+ g +" => "+ intToBinary(f,BINARY_PAD) +" XOR "+ intToBinary(g,BINARY_PAD) +" => "+ intToBinary(x,BINARY_PAD) +" => "+ x);
        System.out.println("------------------------------------------");
        
        int y = g ^ x; //l�-se 10 XOR 11, resultando em 01, que em decimal � 1
        System.out.println("y = g ^ x => "+ g +" ^ "+ x +" => "+ intToBinary(g,BINARY_PAD) +" XOR "+ intToBinary(x,BINARY_PAD) +" => "+ intToBinary(y,BINARY_PAD) +" => "+ y);
        System.out.println("------------------------------------------");
    }
}