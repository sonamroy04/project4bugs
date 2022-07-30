package project4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

		public class Bugs{

		    public static void main(String[] args) {
		     
		        /*System.out.println("Hello World!");*/
		        System.out.println("\n****\n");
		        System.out.println("\tWelcome to The Desktop \n");
		        System.out.println("******");
		        ArrayList<Integer> wishes = new ArrayList<Integer>();
		        wishes.add(1000);
		        wishes.add(2300);
		        wishes.add(45000);
		        wishes.add(32000);
		        wishes.add(110);
		        optionsSelection(wishes);

		    }
		    private static void optionsSelection(ArrayList<Integer> wishes) {
		        String[] arr = {"1. I wish i were butterflies",
		                "2. bcoz butterflies are nature's angels!!!",
		                "3. they remind us what a gift it is to be alive",
		                "4. I wish  i were butterflies",
		                "5. so i can fly",
		                "6. Close the application"
		        };
		        int[] arr1 = {1,2,3,4,5,6};
		        int slen = arr1.length;
		        for(int i=0; i<slen;i++){
		            System.out.println(arr[i]);
		            // display the all the Strings mentioned in the String array
		        }
		 
		        System.out.println("\nEnter your choice:\t");
		        Scanner sc = new Scanner(System.in);
		        int options = sc.nextInt();
		                
		         switch (options){
		                    case 1:
		                        System.out.println("Your saved wish are listed below: \n");
		                        System.out.println(wishes+"\n");
		                        optionsSelection(wishes);
		                        break;
		                    case 2:
		                        System.out.println("Enter your wish: \n");
		                        int value = sc.nextInt();
		                        wishes.add(value);
		                        System.out.println("Your wish is updated\n");
		                        System.out.println(wishes+"\n");
		                        optionsSelection(wishes);
		                        break;
		                    case 3:
		                        System.out.println("You are about the delete all your wishes! \nConfirm again by selecting the same option...\n");
		                        int con_choice = sc.nextInt();
		                        if(con_choice==options){
		                               wishes.clear();
		                            System.out.println(wishes+"\n");
		                            System.out.println("All yourwishes are erased!\n");
		                        } else {
		                            System.out.println("Oops... try again!");
		                        }
		                        optionsSelection(wishes);
		                        break;
		                    case 4:
		                        sortExpenses(wishes);
		                        optionsSelection(wishes);
		                        break;
		                    case 5:
		                        searchExpenses(wishes);
		                        optionsSelection(wishes);
		                        break;
		                    case 6:
		                        closeApp();
		                        break;
		                    default:
		                        System.out.println("You have made an invalid choice!");
		                        break;
		                }
		            }
		        

		    
		    private static void closeApp() {
		        System.out.println("Closing your application... \nThank you!");
		            }
		    private static void searchExpenses(ArrayList<Integer> arrayList) {
		     Scanner in=new Scanner(System.in);
		        int leng = arrayList.size();
		        System.out.println("Enter the expense you need to search:\t");
		        //Complete the method
		        int key=in.nextInt();
		        int found=0;
		        int index=0;
		        for(int i=0; i<leng; i++) {
		            
		            if(arrayList.get(i)==key) {
		                found=1;
		                index=i;
		            }
		        }
		        if(found==1) {
		         System.out.println(key+ " is found at index " +index);
		        }

		   }
		        

		    private static void sortExpenses(ArrayList<Integer> arrayList) {
		        int arrlength = arrayList.size();
		       //Complete the method. The wishes should be sorted in ascending order.

		        for (int i = 0; i < arrlength ; i++) {

		            for (int j = arrlength - 1; j > i; j--) {
		                if (arrayList.get(i) > arrayList.get(j)) {

		                    int temp = arrayList.get(i);
		                    arrayList.set(i,arrayList.get(j)) ;
		                    arrayList.set(j,temp);

		                }

		            }

		        }
		        for (int i: arrayList) {
		            System.out.print(i+ " ");
		        }
		        System.out.println();
		        
		        
		    }
		
        }

	
