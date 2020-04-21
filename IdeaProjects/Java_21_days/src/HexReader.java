package com.java21days;

class HexReader {
   String[] input = { "000A110D1D260219 ",
        "78700F1318141E0C ",
        "6A197D45B0FFFFFF " };

   public static void main(String[] arguments) {
        HexReader hex = new HexReader();
       for (int i = 0; i < hex.input.length; i++)
            hex.readLine(hex.input[i]);
   }

   void readLine(String code) {
       try {
            for (int j = 0; j + 1 < code.length(); j += 2) { //+= 2 since iI want to parse the input by pairs
                String sub = code.substring(j, j + 2);  //read pairs of characters
                int num = Integer.parseInt(sub, 16);
                if (num == 255) {  //
                    return;        // NORMALLY IT WOULD CAUSE THE METHOD TO EXIT
                }                  //BUT IT IS INSIDE A try-finally block ==> the finally block is executed
                System.out.print(num + " "); //no matter how the try block is exited
            }
       } finally {
            System.out.println("**");
       }
   }
}