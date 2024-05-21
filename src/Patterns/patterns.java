package Patterns;     // this is just for created folder, this idiot IDE is considering
// it as package, so thats why I need to include this here🥲

/*

 Student Challenge : Patterns (using nested loops)
 1. display this patterns
                            1 2 3 4 5
                            1 2 3 4 5
                            1 2 3 4 5
                            1 2 3 4 5
                            1 2 3 4 5
 2.
                            1 1 1 1 1
                            2 2 2 2 2
                            3 3 3 3 3
                            4 4 4 4 4
                            5 5 5 5 5

 3.
                            2 3 4 5 6
                            3 4 5 6 7
                            4 5 6 7 8
                            5 6 7 8 9
                            6 7 8 9 10

 4.
                            1  2  3  4  5
                            6  7  8  9  10
                            11 12 13 14 15
                            16 17 18 19 20
                            21 22 23 24 25

 5.
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5
 6.
                            1
                            2  3
                            4  5  6
                            7  8  9  10
                            11 12 13 14 15

 7.
                            *
                            * *
                            * * *
                            * * * *
                            * * * * *
 8.
                            1 2 3 4 5
                            1 2 3 4
                            1 2 3
                            1 2
                            1
 9.
                            * * * * *
                              * * * *
                                * * *
                                  * *
                                    *
 10.

 */


public class patterns {
    public static void main(String args[]){

        // pattern 1
//        for (int i = 1; i <= 5; i++){
//
//            for (int j = 1; j <= 5; j++){
//                System.out.print(j+"  ");
//            }
//
//            System.out.println();
//        }

        // pattern 2
//        for (int i = 1; i <= 5; i++){
//            for (int j = 1; j <= 5; j++){
//                System.out.print(i+"  ");
//            }
//            System.out.println();
//        }

        // pattern 3
//        for (int i = 1; i <= 5; i++){
//            for (int j = 1; j <= 5; j++){
//                System.out.print( (i + j) + "  ");
//            }
//            System.out.println();
//        }

        // pattern 4
//        int n = 1;
//        for (int i = 1; i <= 5; i++){
//            for (int j = 1; j <= 5; j++){
//
//                System.out.print( n + "  ");
//                n = n + 1;
//            }
//            System.out.println();
//        }

        // pattern 5

//        int n = 1;
//        for (int i = 1; i <= 5; i++){
//            for (int j = 1; j <= i; j++){
//
//                System.out.print( j + "  ");
//            }
//            System.out.println();
//        }

        // pattern 6

//        int n = 1;
//        for (int i = 1; i <= 5; i++){
//            for (int j = 1; j <= i; j++){
//
//                System.out.print( n + "  ");
//                n = n + 1;
//            }
//            System.out.println();
//        }

        // pattern 7

//        for (int i = 1; i <= 5; i++){
//            for (int j = 1; j <= i; j++){
//
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // pattern 8

//
//        for (int i = 1; i <= 5; i++){
//            for (int j = 1; j <= (5-(i-1)); j++){
//
//                System.out.print( j + "  ");
//            }
//            System.out.println();
//        }

        // pattern 9

//        for (int i = 1; i <= 5; i++){
//            for (int j = 1; j <= 5; j++){
//                if(i<=j)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println("");
//        }

        // pattern 10
        /*
                        *
                      * *
                    * * *
                  * * * *
                * * * * *
         */
//        for (int i = 1; i <= 5; i++){
//            for (int j = 1; j <= 5; j++){
//                if((i+j)<6)
//                    System.out.print("  ");
//                else
//                    System.out.print("* ");
//            }
//            System.out.println("");
//        }

        /*
         pattern 11
                            *
                          * * *
                        * * * * *
                      * * * * * * *
                    * * * * * * * * *
         */

//        for (int i = 1; i <= 5; i++){
//            for (int j = 1; j <= 9; j++){
//                if((i+j)<=5)
//                    System.out.print("  ");
//                else if((i+5) > j)
//                    System.out.print("* ");
//            }
//
////            for (int j = (i+5); j < (i+5))
//
//            System.out.println("");
//        }

        // another way to do same.

//        for (int i = 1; i <= 5; i++){
//            for (int j = 1; j <= 5; j++){
//                if((i+j)<=5)
//                    System.out.print("  ");
//                else
//                    System.out.print("* ");
//            }
//
//            for (int j = 6; j <= 9; j++){
//
//                if((i + 5) > j)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//
//            }
//
//            System.out.println("");
//        }

        /*
         pattern 11
                            *
                          * * *
                        * * * * *
                      * * * * * * *
                    * * * * * * * * *
                      * * * * * * *
                        * * * * *
                          * * *
                            *
         */
        
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                if((i+j)<=5)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            for (int j = 6; j <= 9; j++){

                if((i + 5) > j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }

        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 5; j++){
                if((i+1) > j)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            for (int j = 6; j <= 9; j++){

                if((i + j) >= 10)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println("");
        }


    }
}