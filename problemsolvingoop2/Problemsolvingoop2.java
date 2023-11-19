/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolvingoop2;
import java.util.Scanner; 

/**
 *
 * @author HP Gaming
 */
public class Problemsolvingoop2 {
  


  public static void doctortask(){
            // we want 2 input from the user , also we need a choice, if the choice is ==1 print the 2 input sum, the coice==2 we need subtracr if the choicd ==3 we need * if choice equal 4 /
        Scanner in=new Scanner(System.in); 
        System.out.println("please enter your 1st number you want :");
        int input1=in.nextInt();
        System.out.println("please enter your 2nd number you want :");
        int input2=in.nextInt();
        boolean flag=true;
        while(flag==true)
        { System.out.println("now enter what do you want these number, choose 1 to print the sum\n choose 2 to subtract\n choose 3 to multi the number \n and choose 4 to /");
        int choice=in.nextInt();
            System.out.println("the answer is : ");
        if(choice==1){
            System.out.println(input1+input2);
            flag=false;
        }
        if (choice==2){
            System.out.println(input1-input2); 
            flag=false;
            
        }
        if(choice==3){
            System.out.println(input1*input2);
            flag=false;
        }
        if (choice==4){
            System.out.println(input1/input2);
            flag=false;
        }
        else if (choice>4)
            System.out.println("wrong choice, please try again.");
        }
  }

  public static void matrix(int num, int num2){
      num=num+1;
      num2=num2+1;
      int [][] matrix=new int[num][num2];
      for (int i=0; i<num; i++){
          for(int j=0; j<num2; j++){
              if(i==0 || j==0){
                  matrix[i][j]=i+j;
              }
              else 
                matrix[i][j] = i * j; 
          }
      }
       for (int i = 0; i < num; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
      
  }
    
    public static void main(String[] args) {
        //you can test these 2 methods by calling it. 
        
    }
}

