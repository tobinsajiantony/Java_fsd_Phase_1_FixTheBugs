package com.FixtTheBugs.fixTheBugs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk Maven \n");
        System.out.println("**************************************");
        ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);
        optionsSelection(expenses);

    }
    private static void optionsSelection(ArrayList<Integer> expenses) {
    	String[] arr = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
        };
    	int  options = 0;
    	do {
    		for(int i=0; i<arr.length;i++){
                System.out.println(arr[i]);
                // display the all the Strings mentioned in the String array
            }
    		System.out.println("\nEnter your choice:\t");
            Scanner sc = new Scanner(System.in);
            options =  sc.nextInt();
    		
                switch (options){
                    case 1:
                        System.out.println("Your saved expenses are listed below: \n");
                        System.out.println(expenses+"\n");
                        break;
                    case 2:
                        System.out.println("Enter the value to add your Expense: \n");
                        int value = sc.nextInt();
                        expenses.add(value);
                        System.out.println("Your value is updated\n");
                        System.out.println(expenses+"\n");
                        break;
                    case 3:
                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                        int con_choice = sc.nextInt();
                        if(con_choice==options){
                               expenses.clear();
                            System.out.println(expenses+"\n");
                            System.out.println("All your expenses are erased!\n");
                        } else {
                            System.out.println("Oops... try again!");
                        }
                        break;
                    case 4:
                        //Sort
                    	QuickSort quickSort = new QuickSort();
                    	quickSort.sort(expenses, 0, expenses.size()-1);
					for(Integer i : expenses) {
                			System.out.print(i + " ");
                		}
					    System.out.print("\n");
                        break;
                    case 5:
                        Search search = new Search();
                        QuickSort quickSort1 = new QuickSort();
                    	quickSort1.sort(expenses, 0, expenses.size()-1);
                        System.out.println("Enter element to be searched");
                        int elementToBeSearched = sc.nextInt();
                        search.SearchArray(expenses, 0, expenses.size()-1, elementToBeSearched);
                        break;
                    case 6:
                    	sc.close();
                        closeApp();
                        break;
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
    	}while(options!=6);
    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }
}
