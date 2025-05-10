public class Pregunta3 
{
    public static void arra(int []arr){
        int suma_pares= 0;
        int suma_impares= 0;
        int resultado= 0;
        int longi= arr.length;  
     
        for (int i = 0; i <longi; i++) {
            if (arr[i]%2==0) {
                suma_pares=arr[i]+suma_pares;
            }else{
                suma_impares+=arr[i];
            }
            resultado= suma_pares-suma_impares;
        }
        System.out.println("la suma de los pares es: "+suma_pares);
        System.out.println("la suma de impares es: "+ suma_impares);
        System.out.println("el Resultado es: "+resultado);
    }
    
    public static void main(String[] args) {
        int array[]= {5, 2, 7, 4, 9, 6};
        arra(array);
    
        
        
    }
}
