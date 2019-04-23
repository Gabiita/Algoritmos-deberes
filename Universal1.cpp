#include <iostream>

using namespace std;

int main()
{
   char nombreCompleto;
   char diaS; 
   double sueldo=280;
   bool asistencia=true;
   int numeroH=0;
   double sueldoFinal=0;
   double valorH=0;
   int suma=0;
   int arreglo[5]={};
   
   std::cout<<"Ingresa el nombre del pasante"<<std::endl;
   cin>> nombreCompleto;
   
   for (int i=0; i<5; i++){ 
     std::cout<<"Ingresa el dia actual"<<std::endl;
     std::cin>> diaS; 
     std::cout<<"Asistio a trabajar el dia "+ diaS<<std::endl;
     std::cin>> asistencia;
       if (asistencia ==true){
           std::cout<<"Ingresa el numero de horas"<<std::endl;
           cin>> numeroH;
		  arreglo [i] = numeroH;
		  suma+=arreglo[i];
  		 
       
       }else{
           std::cout <<"Numero de horas trabajadas = 0" << std::endl;
       }
   } 
    
    valorH = sueldo/25; 
    sueldoFinal= valorH*suma;
   std::cout <<"Numero de horas trabajadas totales:" <<suma<<std::endl;
   std::cout <<"Sueldo final a las " <<suma<<" horas es igual a: "<<sueldoFinal<<std::endl;
    return 0;
}
