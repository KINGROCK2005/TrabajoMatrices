
import java.util.Scanner;

public class CasiTerminado {
        public static byte filasAd, columAd, filasBc, columBc, escalar, intentos, det = 0, matriz ;
            public static boolean comparar, again = true;
            public static char Calagain;
            public static Scanner scan = new Scanner(System.in);

            public static void miCodigo(){
            

    
            int opc;
        System.out.println("¿Que tipo de operación desea hacer?\n" +
                            "1) Igualdad de matrices\n" +//si
                            "2) Suma de matrices\n" +//si
                            "3) Generar matriz de 0\n" +//si
                            "4) Inverso aditivo de una matriz\n"+//si
                            "5) Resta de matrices\n" +//si
                            "6) Multiplicacion por un escalar\n" +//si
                            "7) Multiplicacion de matrices. \n"+//si
                            "8)Matriz identidad\n"+//si
                            "9)Matriz inversa\n"+
                            "10)Determinante de una matriz\n");

        

        do {
           opc = scan.nextByte(); 
        } while (opc < 1 || opc >= 10);

        switch(opc){
        case 1:

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("IGUALDAD DE UNA MATRIZ: ");

        System.out.println("Ingrese las filas que tendra la matriz A: ");
        do {
            filasAd = scan.nextByte(); 
        } while (filasAd <= 0);
        System.out.println("Ingrese las columnas que tendra la matriz A: ");
        do {
            columAd = scan.nextByte(); 
        } while (columAd <= 0);
        System.out.println("Ingrese las filas que tendra la matriz B: ");
        do {
            filasBc = scan.nextByte(); 
        } while (filasBc <= 0);
        System.out.println("Ingrese las columnas que tendra la matriz B: ");
        do {
            columBc = scan.nextByte(); 
        } while (columBc <= 0);

        byte [][] matrizA = new byte[filasAd][columAd];
        byte [][] matrizB = new byte[filasBc][columBc];
         

            System.out.println(":::::::::::::::::::::::::::::::::");
                 System.out.println("Ingrese los elementos de la matriz A: ");
            for (int i = 0; i < filasAd; i++) {
                        for (int j = 0; j < columAd; j++) {
                            System.out.print("Matriz A [" + i + "," + j + "] = ");
                            matrizA[i][j] = scan.nextByte();
                        }
                    }
                
                System.out.println("Ingrese los elementos de la matriz B: ");
                for (int i = 0; i < filasBc; i++) {
                    for (int j = 0; j < columBc; j++) {
                        System.out.print("Matriz A [" + i + "," + j + "] = ");
                        matrizB[i][j] = scan.nextByte();
                    }
                }
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        if (matrizA[i][j] != matrizB[i][j]) {
                            comparar = false;      
                        }else{
                            comparar = true;
                        }
                    }
                }
                if (comparar) {
                    System.out.println("Las matrices son iguales");
                }else{
                    System.out.println("Las matrices no son iguales");
                }
            

        break;

        case 2:

        System.out.println(":::::::::::::::::::::::::::::::::");
            System.out.println("SUMA DE MATRICES: ");

            System.out.println("Ingrese las filas que tendra la matriz A: ");
        do {
            filasAd = scan.nextByte(); 
        } while (filasAd <= 0);
        System.out.println("Ingrese las columnas que tendra la matriz A: ");
        do {
            columAd = scan.nextByte(); 
        } while (columAd <= 0);
        System.out.println("Ingrese las filas que tendra la matriz B: ");
        do {
            filasBc = scan.nextByte(); 
        } while (filasBc <= 0);
        System.out.println("Ingrese las columnas que tendra la matriz B: ");
        do {
            columBc = scan.nextByte(); 
        } while (columBc <= 0);

         matrizA = new byte[filasAd][columAd];
         matrizB = new byte[filasBc][columBc];
        int [][] resultado = new int[filasAd][columAd];
                
                if (filasAd == filasBc && columAd == columBc) {
                System.out.println("Ingrese los elementos de la matriz A: ");
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        System.out.print("Matriz A [" + i + "," + j + "] = ");
                        matrizA[i][j] = scan.nextByte();
                    }
                }
                System.out.println("Ingrese los elementos de la matriz B: ");
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        System.out.print("Matriz B [" + i + "," + j + "] = ");
                        matrizB[i][j] = scan.nextByte();
                    }
                }//  + "\t"
                System.out.println(":::::::::::::::::::::::::::::::::");
                System.out.println("La suma de A y B es: ");
                for (byte i = 0; i < filasAd; i++) {
                    for (byte j = 0; j < columAd; j++) {
                         resultado[i][j] = matrizA[i][j] + matrizB[i][j];
                        System.out.print("["+ resultado[i][j] +"]");
                    }
                    System.out.println(" ");
                }
                } else {
                    System.out.println("Para poder sumar las matrices deben tener las mismas dimensiones");
                }

        break;

        case 3:

        System.out.println(":::::::::::::::::::::::::::");
        System.out.println("MATRIZ N DE 0: ");

        System.out.println("Ingrese las filas que tendra la matriz: ");
        do {
            filasAd = scan.nextByte(); 
        } while (filasAd <= 0);
        System.out.println("Ingrese las columnas que tendra la matriz: ");
        do {
            columAd = scan.nextByte(); 
        }while(columAd <= 0);

        matrizA = new byte[filasAd][columAd];
        resultado = new int[filasAd][columAd];
        
                System.out.println(":::::::::::::::::::::::::::::");
                System.out.println("La matriz nula es: ");
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        resultado[i][j] = matrizA[i][j] * 0;
                        System.out.print("["+ resultado[i][j] +"]");
                    }
                    System.out.println();
                }
            

        break;

        case 4:

        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("INVERSO ADITIVO DE UNA MATRIZ: ");

        System.out.println("Ingrese las filas que tendra la matriz: ");
        do {
            filasAd = scan.nextByte(); 
        } while (filasAd <= 0);
        System.out.println("Ingrese las columnas que tendra la matriz: ");
        do {
            columAd = scan.nextByte(); 
        }while(columAd <= 0);

        matrizA = new byte[filasAd][columAd];
        resultado = new int[filasAd][columAd];

        System.out.println("Ingrese los elementos de la matriz: ");
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        System.out.print("Matriz  [" + i + "," + j + "] = ");
                        matrizA[i][j] = scan.nextByte();
                    }
                }

                System.out.println(":::::::::::::::::::::::::::::");
                System.out.println("La matriz nula es: ");
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        resultado[i][j] = matrizA[i][j] * -1;
                        System.out.print("["+ resultado[i][j] +"]");
                    }
                    System.out.println();
                    }

        break;

        case 5:

        System.out.println(":::::::::::::::::::::::::::::::::");
            System.out.println("RESTA DE MATRICES: ");

            System.out.println("Ingrese las filas que tendra la matriz A: ");
        do {
            filasAd = scan.nextByte(); 
        } while (filasAd <= 0);
        System.out.println("Ingrese las columnas que tendra la matriz A: ");
        do {
            columAd = scan.nextByte(); 
        } while (columAd <= 0);
        System.out.println("Ingrese las filas que tendra la matriz B: ");
        do {
            filasBc = scan.nextByte(); 
        } while (filasBc <= 0);
        System.out.println("Ingrese las columnas que tendra la matriz B: ");
        do {
            columBc = scan.nextByte(); 
        } while (columBc <= 0);

         matrizA = new byte[filasAd][columAd];
         matrizB = new byte[filasBc][columBc];
         resultado = new int[filasAd][columAd];
              
                if (filasAd == filasBc && columAd == columBc) {
                System.out.println("Ingrese los elementos de la matriz A: ");
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        System.out.print("Matriz A [" + i + "," + j + "] = ");
                        matrizA[i][j] = scan.nextByte();
                    }
                }
                
                System.out.println("Ingrese los elementos de la matriz B: ");
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        System.out.print("Matriz B [" + i + "," + j + "] = ");
                        matrizB[i][j] = scan.nextByte();
                    }
                }
                System.out.println(":::::::::::::::::::::::::::::::::");
                System.out.println("La resta de A y B es: ");
                for (int i = 0; i < filasAd; i++) {
                    for (int j = 0; j < columAd; j++) {
                        resultado[i][j] = matrizA[i][j] - matrizB[i][j];
                        System.out.print("["+ resultado[i][j] +"]");
                    }
                    System.out.println();
                }
                } else {
                    System.out.println("Para poder restar las matrices deben tener las mismas dimensiones");
                }

                

        break;

        case 6:

        System.out.println("::::::::::::::::::::::::::::::::");
            System.out.println("MULTIPLICACION DE MATRIZ POR UN ESCALAR: ");

            System.out.println("Ingrese las filas que tendra la matriz: ");
        do {
            filasAd = scan.nextByte(); 
        } while (filasAd <= 0);
        System.out.println("Ingrese las columnas que tendra la matriz: ");
        do {
            columAd = scan.nextByte(); 
        }while(columAd <= 0);
            matrizA = new byte[filasAd][columAd];
            resultado = new int[filasAd][columAd];

                
                    System.out.println("Ingrese el escalar por el cual multiplicar la matriz:");
                        escalar = scan.nextByte();

                        System.out.println("Ingrese los elementos de la matriz: ");

                        if (matrizA.length < 20) {
                                for (int i = 0; i < matrizA.length; i++) { 
                                    for (int j = 0; j < matrizA[0].length; j++) {                                
                                        System.out.print("Matriz [" + i + "-" + j + "] = ");
                                        matrizA[i][j] = scan.nextByte();
                                    }
                                }

                        System.out.println(":::::::::::::::::::::::::::::::::");
                        System.out.println("La multiplicación es: ");

                        for (int i = 0; i < filasAd; i++) {
                            for (int j = 0; j < columAd; j++) {
                                matrizA[i][j] *= escalar;
                                System.out.print("["+ matrizA[i][j] +"]");
                            }
                            System.out.println();
                        }
                    }

        break;

        case 7:

        System.out.println(":::::::::::::::::::::::::::::::::");
        System.out.println("MULTIPLICACION DE MATRICES: ");

            System.out.println("Ingrese las filas que tendra la matriz A: ");
        do {
            filasAd = scan.nextByte(); 
        } while (filasAd <= 0);
        System.out.println("Ingrese las columnas que tendra la matriz A: ");
        do {
            columAd = scan.nextByte(); 
        } while (columAd <= 0);
        System.out.println("Ingrese las filas que tendra la matriz B: ");
        do {
            filasBc = scan.nextByte(); 
        } while (filasBc <= 0);
        System.out.println("Ingrese las columnas que tendra la matriz B: ");
        do {
            columBc = scan.nextByte(); 
        } while (columBc <= 0);

         matrizA = new byte[filasAd][columAd];
         matrizB = new byte[filasBc][columBc];
         resultado = new int[filasAd][columAd];

                System.out.println("Ingrese los elementos de la matriz A: ");

                if(columAd != filasBc){
                    System.out.println("No se puede realizar la multiplciacion:");
                }else if(columAd == filasBc){
                    for (int i = 0; i < matrizA.length; i++) {
                        for (int j = 0; j < matrizA[0].length; j++) {
                            System.out.print("Matriz [" + i + "-" + j + "] = ");
                            matrizA[i][j] = scan.nextByte();
                        }
                    }
                    System.out.println("Ingrese los elementos de la matriz B: ");

                    for (int i = 0; i < matrizB.length; i++) { 
                        for (int j = 0; j < matrizB[0].length; j++) {
                            System.out.print("Matriz [" + i + "-" + j + "] = ");
                            matrizB[i][j] = scan.nextByte();
                            }
                        }
                    }

                    for(int i = 0; i < matrizA.length ; i++){
                        for(int j = 0; j < matrizB.length;j++ ){
                            resultado[i][j]= matrizA[filasAd][columAd] * matrizB[filasBc][columBc];
                            System.out.println("["+ resultado[i][j] +"]");
                         }
                         System.out.println();
                    }

        break;

        case 8:

        System.out.println(":::::::::::::::::::::::::::::::::");
        System.out.println("MATRIZ IDENTIDAD DE NXN: ");

        System.out.println("Ingrese las filas que tendra la matriz: ");
                do {
                    filasAd = scan.nextByte(); 
                } while (filasAd <= 0);
                System.out.println("Ingrese las columnas que tendra la matriz: ");
                do {
                    columAd = scan.nextByte(); 
                }while(columAd <= 0);

                matrizA = new byte[filasAd][columAd];
                resultado = new int[filasAd][columAd];
              
             int[][] Matriz=new int[filasAd][columAd];

              for(int i=0;i<filasAd;i++){
                Matriz[i][i] = 1;
              }
             for(int i=0;i<filasAd;i++){
               for(int j=0;j<columAd;j++){
                  System.out.print("["+ Matriz[i][j] +"]");
               }
               System.out.println(" ");
             }

        break;

        case 9:

        break;

        case 10:

        //     System.out.println(":::::::::::::::::::::::::::::::::");
    //     System.out.println("DETERMINANTE DE UNA MATRIZ: ");


    //     System.out.print("Ingrese el tamaño de la matriz (n): ");
    //     int n = scan.nextInt();

    //     double[][] matriz = new double[n][n];

    //     System.out.println("Ingrese los elementos de la matriz por fila:");
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
    //             matriz[i][j] = scan.nextDouble();
    //         }
    //     }

    //     double determinante = calcularDeterminante(matriz);
    //     System.out.println("La determinante de la matriz es: " + determinante);


    // public static double calcularDeterminante(double[][] matriz) {
    //     int n = matriz.length;
    //     double det = 0;

    //     if (n == 1) {
    //         return matriz[0][0];
    //     } else if (n == 2) {
    //         return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
    //     } else {
    //         for (int columna = 0; columna < n; columna++) {
    //             det += matriz[0][columna] * cofactor(matriz, 0, columna);
    //         }
    //     }

    //     return det;
    // }
            
    // public static double cofactor(double[][] matriz, int fila, int columna) {
    //     int n = matriz.length;
    //     double[][] submatriz = new double[n - 1][n - 1];
    //     int subfila = 0;
    //     int subcolumna = 0;

    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (i != fila && j != columna) {
    //                 submatriz[subfila][subcolumna] = matriz[i][j];
    //                 subcolumna++;
    //                 if (subcolumna == n - 1) {
    //                     subcolumna = 0;
    //                     subfila++;
    //                 }
    //             }
    //         }
    //     }
    
    //     return Math.pow(-1, fila + columna) * calcularDeterminante(submatriz);
    
    
             break;
    
            }
    }
        
        
    public static void main(String []args){

        while(again){
            miCodigo();
    
         System.out.println("Dese volver a ejecutar el codigo?  (Si/No)");
         Calagain = scan.next().charAt(0);

         if(Calagain == 's'){
            again = true;
            }
            else{
                again = false;
            }
         }
    
    }
    
}
