public class MyClass {
    public static void main(String args[]) {
        int c1=0;
        int sum1=0;
        int c2=0;
        int sum2=0;
        int c3=0;
        int sum3=0;
        int [] ventas ={550,1100,220,1200,900};
        int sumtotal=0;
        for (int i=0; i<ventas.length; i++){
            if(ventas[i]>=1000){
                 c1=c1+1;
                 sum1=sum1+ventas[i];
            }else if(ventas[i]>=500 && ventas[i]<1000){
                 c2=c2+1;
                 sum2=sum2+ventas[i];
            }else if(ventas[i]<500){
                c3=c3+1;
                sum3=sum3+ventas[i];
            }else{
                 System.out.println(ventas[i] + "No corresponde a ninguna categoría ");
            }
        }
        sumtotal=sum1+sum2+sum3;
        System.out.println("Ventas de categoría 1 (mayores a 1000):" + c1 + " Valor:" + sum1);
        System.out.println("Ventas de categoría 2 (entre 500 y 1000):" + c2 + " Valor:" + sum2);
        System.out.println("Ventas de categoría 3 (menores a 500):" + c3 + " Valor:" + sum3);
        System.out.println("Valor total de ventas:" + sumtotal);
        
    }
}
