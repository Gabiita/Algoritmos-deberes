/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
   int c1=0;
   int sum1=0;
   int c2=0;
   int sum2=0;
   int c3=0;
   int sum3=0;
   int ventas[5]={550,1100,220,1200,900};
   
   for (int i=0; i<5; i++){
       if (ventas[i]>=1000){
           c1=c1+1; 
           sum1=sum1+ventas[i]; 
       }else if (ventas[i]>=500 and ventas[i]<1000){
           c2=c2+1;
           sum2=sum2+ventas[i];
       }else if (ventas[i]<500){
           c3=c3+1;
           sum3=sum3+ventas[i];
       }else{
           std::cout <<ventas[i]<<"No corresponde a ninguna categoría" << std::endl;
       }
   }
   std::cout <<"Ventas de categoría 1 (mayores a 1000):" <<c1<<" Valor:"<<sum1<<std::endl;
   std::cout <<"Ventas de categoría 2 (Entre 500 y 1000):" <<c2<<" Valor:"<<sum2<<std::endl;
   std::cout <<"Ventas de categoría 3 (Menores a 500):" <<c3<<" Valor:"<<sum3<<std::endl;
   std::cout << "Valor total de ventas:"<<sum1+sum2+sum3<<std::endl;
    return 0;
}

