/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sumandosymochilaenlista;

import java.util.LinkedList;

/**
 *
 * @author jose luis
 */
public class Main {
        
    public static void main(String[] args) {

            LinkedList<Integer> L1 = new LinkedList();
            LinkedList<LinkedList<Integer>> L2 = new LinkedList();
            int n = 6;
            int i = 1;
            int a = 2;
            int b = 5;
            
            
            LinkedList<Integer> LM1 = new LinkedList();
            LinkedList<Integer> LM2 = new LinkedList();
            LinkedList<LinkedList<Integer>> LM3 = new LinkedList();
            int max = 12;
            int j = 0;
            LM1.add(2);
            LM1.add(3);
            LM1.add(5);
            LM1.add(6);
            
            // ----- SUMANDOS -----
            
            //Mostrar todos los sumandos posibles.
            listaSumandos(L2, L1, n, i);  
            System.out.println(" ----- SUMANDOS -----");
            System.out.println(L2);
            
            //Mostrar listas de sumandos diferentes.
            System.out.println("Sumandos diferentes.");
            System.out.println(listasSumandosDiferentes(L2));

            //Mostrar listas de sumandos iguales.
            System.out.println("Sumandos iguales.");
            System.out.println(listasSumandosIguales(L2));
            
            //Mostrar listas de sumandos primos.
            System.out.println("Sumandos Primos");
            System.out.println(listasSumandosPrimos(L2));
            
            //Mostrar listas de sumandos entre A y B.
            System.out.println("Sumandos ente " + a +" y "+ b +".");
            System.out.println(listasSumandosEntreAB(L2,a,b));
            
            // ----- SUMANDOS ADICIONALES -----
            
            //Mostrar listas de sumandos pares.
            System.out.println("Sumandos pares");
            System.out.println(listasSumandosPares(L2));
            
            //Mostrar listas de sumandos impares.
            System.out.println("Sumandos impares");
            System.out.println(listasSumandosImpares(L2));
            
            //Mostrar listas de sumandos divisores.
            System.out.println("Sumandos divisores");
            System.out.println(listasSumandosDivisores(L2));
            
            //Mostrar listas de sumandos sin primos.
            System.out.println("Sumandos sin primos");
            System.out.println(listasSumandosSinPrimos(L2));
            
            // ----- FACTORES -----
            
            //Mostrar todos los factores posibles.
            L2.clear();
            listaFactores(L2, L1, n, i);  
            System.out.println(" ----- FACTORES -----");
            System.out.println(L2);
            
            //Mostrar listas de factores diferentes.
            System.out.println("Factores diferentes.");
            System.out.println(listasFactoresDiferentes(L2));

            //Mostrar listas de factores iguales.
            System.out.println("Factores iguales.");
            System.out.println(listasFactoresIguales(L2));
            
            //Mostrar listas de factores primos.
            System.out.println("Factores Primos");
            System.out.println(listasFactoresPrimos(L2));
            
            //Mostrar listas de factores entre A y B.
            System.out.println("Factores ente " + a +" y "+ b +".");
            System.out.println(listasFactoresEntreAB(L2,a,b));
            
            // ----- FACTORES ADICIONALES -----
            
            //Mostrar listas de factores pares.
            System.out.println("Factores pares");
            System.out.println(listasFactoresPares(L2));
            
            //Mostrar listas de factores impares.
            System.out.println("Factores impares");
            System.out.println(listasFactoresImpares(L2));
            
            //Mostrar listas de factores sin primos.
            System.out.println("Factores sin primos");
            System.out.println(listasFactoresSinPrimos(L2));

            // ----- MOCHILA -----
            listaMochila(LM1, LM2, LM3, max, j);
            System.out.println(" ----- MOCHILA ----- ");
            System.out.println(LM3);
            
            //Mostrar listas diferentes en la mochila.
            System.out.println("Mochila - pesos diferente.");
            System.out.println(listasMochilaDiferentes(LM3));
            
            //Mostrar listas entre a y b en la mochila.
            System.out.println("Mochila - pesos entre " + a + " y " + b + ".");
            System.out.println(listasMochilaEntreAB(LM3,a,b));
            
            //Mostrar listas con mayor cantidad de objetos.
            System.out.println("Mochila - Mayor cantidad de objetos.");
            System.out.println(listasMochilaMayorCantidadObjetos(LM3));
            
            //Mostrar listas con mejores conmbinaciones.
            System.out.println("Mochila - Mejores combinaciones.");
            System.out.println(listasMochilaMejoresCombinaciones(LM3));
            
            // ----- MOCHILA ADICIONALES -----
            
            //Mostrar listas con pesos iguales.
            System.out.println("Mochila - pesos iguales.");
            System.out.println(listasMochilaIguales(LM3));
            
            //Mostrar listas con pesos pares.
            System.out.println("Mochila - pesos pares.");
            System.out.println(listasMochilaPares(LM3));
            
            //Mostrar listas con pesos impares.
            System.out.println("Mochila - pesos impares.");
            System.out.println(listasMochilaImpares(LM3));
            
            //Mostrar listas con pesos no primos.
            System.out.println("Mochila - pesos no primos.");
            System.out.println(listasMochilaSinPrimos(LM3));
        }
    /* SUMANDOS */
    private static int suma(LinkedList<Integer> L1){
        Integer r = 0;
        for(Integer recorrido: L1) {
            r = r + recorrido;
        }
        return r;
    }
    public static void listaSumandos(LinkedList<LinkedList<Integer>> L2, 
                                 LinkedList<Integer> L1, int n, int i) {
        int sum = suma(L1);
        if(sum > n) return;
        if(sum == n) {
            //System.out.println(L1);
            LinkedList<Integer> temp = (LinkedList<Integer>)L1.clone();
            L2.add(temp);
            return;
        }
        int k = i;
        while(k <= n){
            L1.add(k);
            listaSumandos(L2,L1, n ,k);
            L1.removeLast();
            k = k + 1;
        }    
    }
    
    /* SUMANDOS DIFERENTES */
    public static LinkedList<LinkedList<Integer>> listasSumandosDiferentes(LinkedList<LinkedList<Integer>> L2){
        LinkedList<LinkedList<Integer>> LResultado = new LinkedList();
        for(LinkedList<Integer> lista : L2){
            if(diferentes(lista)) LResultado.add(lista);
        }
        return LResultado;
    }
    public static boolean diferentes(LinkedList<Integer> L){
        int aux = 0;
        for(int num: L){
            if(num == aux) return false;
            aux = num;
        }
        return true;
    }
    
    /* SUMANDO IGUALES*/
    public static LinkedList<LinkedList<Integer>> listasSumandosIguales(LinkedList<LinkedList<Integer>> L2){
        LinkedList<LinkedList<Integer>> LResultado = new LinkedList();
        for(LinkedList<Integer> lista : L2){
            if(iguales(lista)) LResultado.add(lista);
        }
        return LResultado;
    }
    public static boolean iguales(LinkedList<Integer> L){
        int aux = L.getFirst();
        for(int num: L){
            if(num != aux) return false;
        }
        return true;
    }

    /* SUMANDOS PRIMOS*/
    private static LinkedList<LinkedList<Integer>> listasSumandosPrimos(LinkedList<LinkedList<Integer>> L2){ 
        LinkedList<LinkedList<Integer>> LResultado = new LinkedList();
        for(LinkedList<Integer> lista : L2) {
            if(esListaPrimo(lista)) LResultado.add(lista);
        }
        return LResultado;
    }
    private static boolean esListaPrimo(LinkedList<Integer> lista){
        for(Integer n : lista) {
            for(int i = 2; i < n ; i++) {
                if((n % i) == 0 ) {
                    return false;
                }
            }
        }
        return true;
    }

    /* SUMANDOS ENTRE a y b */
    private static LinkedList<LinkedList<Integer>> listasSumandosEntreAB(LinkedList<LinkedList<Integer>> L2,int a, int b){ 
        LinkedList<LinkedList<Integer>> LResultado = new LinkedList();
        for(LinkedList<Integer> lista : L2) {
            if(entreAB(lista,a,b)) LResultado.add(lista);
        }
        return LResultado;
    }
    private static boolean entreAB(LinkedList<Integer> L1, int a, int b){
        if((L1.getFirst() >= a) && (L1.getLast() <= b)){
            return true;
        }
        return false;
    }
    
    /* SUMANDOS ADICIONALES */
    private static LinkedList<LinkedList<Integer>> listasSumandosPares(LinkedList<LinkedList<Integer>> L2){ 
        LinkedList<LinkedList<Integer>> LRespuesta = new LinkedList();
        for(LinkedList<Integer> lista : L2) {
            if(pares(lista)) LRespuesta.add(lista);
        }
        return LRespuesta;
    }
    private static boolean pares(LinkedList<Integer> lista){
        for(Integer n : lista) {
            if(n%2 != 0) return false;
        }
        return true;
    }
    
    private static LinkedList<LinkedList<Integer>> listasSumandosImpares(LinkedList<LinkedList<Integer>> L2){ 
        LinkedList<LinkedList<Integer>> LRespuesta = new LinkedList();
        for(LinkedList<Integer> lista : L2) {
            if(impares(lista)) LRespuesta.add(lista);
        }
        return LRespuesta;
    }
    private static boolean impares(LinkedList<Integer> lista){
        for(Integer n : lista) {
            if(n%2 == 0) return false;
        }
        return true;
    }
    
    private static LinkedList<LinkedList<Integer>> listasSumandosDivisores(LinkedList<LinkedList<Integer>> L2){ 
        LinkedList<LinkedList<Integer>> LRespuesta = new LinkedList();
        for(LinkedList<Integer> lista : L2) {
            if(divisores(lista)) LRespuesta.add(lista);
        }
        return LRespuesta;
    }
    private static boolean divisores(LinkedList<Integer> lista){
        int sum = suma(lista);
        for(Integer n : lista) {
            if(sum%n != 0) return false;
        }
        return true;
    }

    private static LinkedList<LinkedList<Integer>> listasSumandosSinPrimos(LinkedList<LinkedList<Integer>> L2){ 
        LinkedList<LinkedList<Integer>> LRespuesta = new LinkedList();
        for(LinkedList<Integer> lista : L2) {
            if(sinPrimos(lista)) LRespuesta.add(lista);
        }
        return LRespuesta;
    }
    private static boolean sinPrimos(LinkedList<Integer> lista){
        for(Integer n : lista) {
            boolean c = false;
            for(int i = 2; i < n ; i++) {
                if((n % i) == 0 ) {
                    c = true;
                }
            }
            if(c == false) return false; 
        }
        return true;
    }
    
    /* FACTORES */
    
    private static int multiplicacion(LinkedList<Integer> L1){
        Integer r = 1;
        for(Integer recorrido: L1) {
            r = r * recorrido;
        }
        return r;
    }
    public static void listaFactores(LinkedList<LinkedList<Integer>> L2, 
                                 LinkedList<Integer> L1, int n, int i) {
        int sum = multiplicacion(L1);
        if(sum > n) return;
        if(sum == n && L1.getFirst() != n) {
            LinkedList<Integer> temp = (LinkedList<Integer>)L1.clone();
            L2.add(temp);
            return;
        }
        int k = i;
        while(k <= n){
            L1.add(k);
            if (L1.getFirst()== 1) {
                L1.add(n);
                listaFactores(L2, L1, n, n);
                L1.removeLast();
                L1.removeLast();
                k = k + 1;
            } else {
                listaFactores(L2, L1, n, k);
                L1.removeLast();
                k = k + 1;
            }
        }    
    }
    
    /* FACTORES DIFERENTES*/
    public static LinkedList<LinkedList<Integer>> listasFactoresDiferentes(LinkedList<LinkedList<Integer>> L2){
        LinkedList<LinkedList<Integer>> LResultado = new LinkedList();
        for(LinkedList<Integer> lista : L2){
            if(diferentes(lista)) LResultado.add(lista);
        }
        return LResultado;
    }
    
    /* FACTORES IGUALES*/
    public static LinkedList<LinkedList<Integer>> listasFactoresIguales(LinkedList<LinkedList<Integer>> L2){
        LinkedList<LinkedList<Integer>> LResultado = new LinkedList();
        for(LinkedList<Integer> lista : L2){
            if(iguales(lista)) LResultado.add(lista);
        }
        return LResultado;
    }
    
    /* FACTORES PRIMOS*/
    private static LinkedList<LinkedList<Integer>> listasFactoresPrimos(LinkedList<LinkedList<Integer>> L2){ 
        LinkedList<LinkedList<Integer>> LResultado = new LinkedList();
        for(LinkedList<Integer> lista : L2) {
            if(esListaPrimo(lista)) LResultado.add(lista);
        }
        return LResultado;
    }
    
    /* FACTORES ENTRE a y b*/
    private static LinkedList<LinkedList<Integer>> listasFactoresEntreAB(LinkedList<LinkedList<Integer>> L2,int a, int b){ 
        LinkedList<LinkedList<Integer>> LResultado = new LinkedList();
        for(LinkedList<Integer> lista : L2) {
            if(entreAB(lista,a,b)) LResultado.add(lista);
        }
        return LResultado;
    }
    
    /*  FACTORES ADICIONALES */
    private static LinkedList<LinkedList<Integer>> listasFactoresPares(LinkedList<LinkedList<Integer>> L2){ 
        LinkedList<LinkedList<Integer>> LRespuesta = new LinkedList();
        for(LinkedList<Integer> lista : L2) {
            if(pares(lista)) LRespuesta.add(lista);
        }
        return LRespuesta;
    }
    
    private static LinkedList<LinkedList<Integer>> listasFactoresImpares(LinkedList<LinkedList<Integer>> L2){ 
        LinkedList<LinkedList<Integer>> LRespuesta = new LinkedList();
        for(LinkedList<Integer> lista : L2) {
            if(impares(lista)) LRespuesta.add(lista);
        }
        return LRespuesta;
    }

    private static LinkedList<LinkedList<Integer>> listasFactoresSinPrimos(LinkedList<LinkedList<Integer>> L2){ 
        LinkedList<LinkedList<Integer>> LRespuesta = new LinkedList();
        for(LinkedList<Integer> lista : L2) {
            if(sinPrimos(lista)) LRespuesta.add(lista);
        }
        return LRespuesta;
    }
    
    /* MOCHILA */
    
    public static void listaMochila (LinkedList<Integer> LM1,LinkedList<Integer> LM2,
                                     LinkedList<LinkedList<Integer>> LM3, int max, int j) {
        int sum = suma(LM2);
        if(sum > max) return;
        LinkedList<Integer> temp = (LinkedList<Integer>)LM2.clone();
        LM3.add(temp);
        
        int k = j;
        while(k < LM1.size()) {
            LM2.add(LM1.get(k));
            listaMochila(LM1, LM2, LM3, max, k + 1);
            LM2.removeLast();
            k = k + 1;
        }
    }
    
    /* MOCHILA - PESOS DIFERENTES */
    public static LinkedList<LinkedList<Integer>> listasMochilaDiferentes(LinkedList<LinkedList<Integer>> LM3){
        LinkedList<LinkedList<Integer>> LResultado = new LinkedList();
        for(LinkedList<Integer> lista : LM3){
            if(diferentes(lista)) LResultado.add(lista);
        }
        return LResultado;
    }
    
    /* MOCHILA - PESOS ENTRE a y b*/
    private static LinkedList<LinkedList<Integer>> listasMochilaEntreAB(LinkedList<LinkedList<Integer>> LM3,int a, int b){ 
        LinkedList<LinkedList<Integer>> LResultado = new LinkedList();
        for(LinkedList<Integer> lista : LM3) {
            if(!lista.isEmpty()) {
                if(entreAB(lista,a,b)) LResultado.add(lista);
            }
        }
        return LResultado;
    }
    
    /* MOCHILA - MAYOR CANTIDAD DE OBJETOS */
    private static LinkedList<LinkedList<Integer>> listasMochilaMayorCantidadObjetos(LinkedList<LinkedList<Integer>> LM3){ 
        LinkedList<LinkedList<Integer>> LResultado = new LinkedList();
        int c = 1;
        for(LinkedList<Integer> lista : LM3) {
            if(!lista.isEmpty()) {
                if(lista.size() > c) c = lista.size();
            }
        }
        for(LinkedList<Integer> lista : LM3) {
            if(!lista.isEmpty()) {
                if(lista.size() == c) LResultado.add(lista);
            }
        }
        return LResultado;
    }
    
    /* MOCHILA - MEJORES COMBINACIONES */
    private static LinkedList<LinkedList<Integer>> listasMochilaMejoresCombinaciones(LinkedList<LinkedList<Integer>> LM3){ 
        LinkedList<LinkedList<Integer>> LResultado = new LinkedList();
        int c = 1;
        for(LinkedList<Integer> lista : LM3) {
            if(!lista.isEmpty()) {
                if(suma(lista) > c) c = suma(lista);
            }
        }
        for(LinkedList<Integer> lista : LM3) {
            if(!lista.isEmpty()) {
                if(suma(lista) == c) LResultado.add(lista);
            }
        }
        return LResultado;
    }
    
    /* MOCHILA - ADICIONALES */
    public static LinkedList<LinkedList<Integer>> listasMochilaIguales(LinkedList<LinkedList<Integer>> LM3){
        LinkedList<LinkedList<Integer>> LResultado = new LinkedList();
        for(LinkedList<Integer> lista : LM3){
            if(!lista.isEmpty()) {
                if(iguales(lista)) LResultado.add(lista);
            }
        }
        return LResultado;
    }
    
    public static LinkedList<LinkedList<Integer>> listasMochilaPares(LinkedList<LinkedList<Integer>> LM3){
        LinkedList<LinkedList<Integer>> LResultado = new LinkedList();
        for(LinkedList<Integer> lista : LM3){
            if(!lista.isEmpty()) {
                if(pares(lista)) LResultado.add(lista);
            }
        }
        return LResultado;
    }
    
    public static LinkedList<LinkedList<Integer>> listasMochilaImpares(LinkedList<LinkedList<Integer>> LM3){
        LinkedList<LinkedList<Integer>> LResultado = new LinkedList();
        for(LinkedList<Integer> lista : LM3){
            if(!lista.isEmpty()) {
                if(impares(lista)) LResultado.add(lista);
            }
        }
        return LResultado;
    }
    
    public static LinkedList<LinkedList<Integer>> listasMochilaSinPrimos(LinkedList<LinkedList<Integer>> LM3){
        LinkedList<LinkedList<Integer>> LResultado = new LinkedList();
        for(LinkedList<Integer> lista : LM3){
            if(!lista.isEmpty()) {
                if(sinPrimos(lista)) LResultado.add(lista);
            }
        }
        return LResultado;
    }
}



