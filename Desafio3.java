/* TERCEIRO DESAFIO

Dado um array de inteiros e um valor alvo, determine o número de pares entre os elementos
do array em que a sua diferença seja igual ao valor alvo.

Exemplo
K = 1
arr = [1,2,3,4]
Existem 3 valores cuja diferença é igual ao valor alvo K: 2-1 = 1, 3-2 = 1, 4-3 = 1.

Descrição do problema:
Os pares têm os seguintes parâmetros:
int k: Um Inteiro, valor alvo.
int arr[n]: Um array de Inteiros.

Retorno
int: O número de pares que satisfazem o critério.

Formatos de Entrada
Seu código deve conter duas entradas n e k, que representam o tamanho do array e o valor
alvo.
Seu código deve conter um array de inteiros, de tamanho n.

Exemplos de entrada

STDIN Function
----- --------
5 2 arr[] tamanho n = 5, k =2
1 5 3 4 2 arr = [1, 5, 3, 4, 2]

Exemplo de saida
3 */

package Desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) throws Exception {
    Scanner ler = new Scanner(System.in);   
    String entrada;
    
    int n, k;
    int pares = 0;
    ArrayList<Integer> arr = new ArrayList<Integer>();

    System.out.print("insira tamanho e chave: ");
    entrada = ler.nextLine();
    String[] a = entrada.split(" ");
    
    n = Integer.parseInt(a[0]);
    k = Integer.parseInt(a[1]);


    System.out.print("insira lista: ");
    ler = new Scanner(System.in);
    entrada = ler.nextLine();
    a = entrada.split(" ");

    for (int i = 0; i < n; i++) {
        arr.add(Integer.parseInt(a[i]));
    }     

    for(int i = 0; i<n; i++){
        for(int j = 0; j<n; j++){
            if(arr.get(i) - arr.get(j) == k){
                pares++;
            }
        }
    }

    System.out.println("quantidade de pares: "+ pares);
    ler.close();
    }
}