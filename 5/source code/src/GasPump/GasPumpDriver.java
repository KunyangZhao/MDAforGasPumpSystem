package GasPump;

import AbstractFactory.*;
import java.util.Scanner;

//The main method of the whole application.
public class GasPumpDriver {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Select type of GasPump: ");
        System.out.println("1. GasPump-1");
        System.out.println("2. GasPump-2");
        int pump_type = 0;
        String input = " Beginning ";
			pump_type = Integer.parseInt(sc.nextLine());
            if(pump_type==1) {
                    GasPump1_Factory cf1 = new GasPump1_Factory();
                    GasPump1 gp1 = new GasPump1(cf1);
                    System.out.println("***Welcome to gasPump-1 application*** ");
                    System.out.println(
                            "======================================" +
                            "\nMENU of Operations: : \n(0)Activate (1)Start (2)PayCredit (3)Approve (4)Reject" +
                            " (5)RegularGas (6)SuperGas (7)Cancel (8)StartPump (9)PumpGallon (10)StopPump (11)Quit the program " +
                            "\n======================================"
                    		);
                    System.out.println("Input 0 to activate the system! ");
                    while (!input.equals("11")) {
						input = sc.nextLine();						
                        switch (input) {
                            case "0": {
                                System.out.println("***Activate***");
                                float a = 0, b = 0;
                                System.out.println("set the unit price of regular gas: ");
                                try {
									a = Float.parseFloat(sc.nextLine());									
                                    System.out.println("set the unit price of super gas: ");
									b = Float.parseFloat(sc.nextLine());
                                    gp1.Activate(a, b);
                                } catch (NumberFormatException e) {
                                    System.out.println("Price must be a float number!");
                                }
                                break;
                            }
                            case "1": {
                                System.out.println("***Start***");
                                gp1.Start();
                                break;
                            }
                            case "2": {
                                System.out.println("***PayCredit***");
                                gp1.PayCredit();
                                break;
                            }
                            case "3": {
                                System.out.println("***Approve***");
                                gp1.Approve();
                                break;
                            }
                            case "4": {
                                System.out.println("***Reject***");
                                gp1.Reject();
                                break;
                            }
                            case "5": {
                                System.out.println("***SelectRegularGas***");
                                gp1.Regular();
                                break;
                            }
                            case "6": {
                                System.out.println("***SelectSuperGas***");
                                gp1.Super();
                                break;
                            }
                            case "7": {
                                System.out.println("***Cancel***");
                                gp1.Cancel();
                                break;
                            }
                            case "8": {
                                System.out.println("***StartPump***");
                                gp1.StartPump();
                                break;
                            }
                            case "9": {
                                System.out.println("***PumpGallon***");
                                gp1.PumpGallon();
                                break;
                            }
                            case "10": {
                                System.out.println("***StopPump***");
                                gp1.StopPump();
                                break;
                            }
                            case "11": {
                                break;
                            }
                            default: {
                                System.out.println("Operation error! Please select a valid operation");
                                break;
                            }
                        }
                    } 
                    System.out.println("Transaction finished!");
                } 
            	else if(pump_type==2){
                    GasPump2_Factory cf2 = new GasPump2_Factory();
                    GasPump2 gp2 = new GasPump2(cf2);
                    System.out.println("***Welcome to gasPump-2 application*** ");
                    System.out.println(
                            "======================================\nMENU of Operations: : " +
                            "\n(0)Activate (1)Start (2)PayCash (3)RegularGas (4)SuperGas (5)PremiumGas " +
                            "(6)Cancel (7)StartPump (8)PumpLiter (9)Stop (10)PrintReceipt (11)NoReceipt (12)Quit the program " +
                            "\n======================================"
                    );
                    System.out.println("Input 0 to activate the system! ");
                    while (!input.equals("12")) {
						input = sc.nextLine();
                        switch (input) {
                            case "0": {
                                System.out.println("***Activate***");
                                int a = 0, b = 0, c = 0;
                                System.out.println("set the unit price of regular gas: ");
                                try {
									a = Integer.parseInt(sc.nextLine());
                                    System.out.println("set the unit price of super gas: ");
									b = Integer.parseInt(sc.nextLine());
                                    System.out.println("set the unit price of premium gas: ");
									c = Integer.parseInt(sc.nextLine());
                                    gp2.Activate(a, b, c);
                                } catch (NumberFormatException e) {
                                    System.out.println("Price must be a integar number!");
                                }
                                break;
                            }
                            case "1": {
                                System.out.println("***Start***");
                                gp2.Start();
                                break;
                            }
                            case "2": {
                                System.out.println("***Pay Cash***");
                                System.out.println("Insert your cash amount : ");
                                try {
                                    float cash = 0;
										cash = Float.parseFloat(sc.nextLine());									
                                    gp2.PayCash(cash);
                                } catch (NumberFormatException e) {
                                    System.out.println("Cash must be a float number");
                                }
                                break;
                            }
                            case "3": {
                                System.out.println("***Select Regular Gas***");
                                gp2.Regular();
                                break;
                            }
                            case "4": {
                                System.out.println("***Select Super Gas***");
                                gp2.Super();
                                break;
                            }
                            case "5": {
                                System.out.println("***Select Premium Gas***");
                                gp2.Premium();
                                break;
                            }
                            case "6": {
                                System.out.println("***Cancel***");
                                gp2.Cancel();
                                break;
                            }
                            case "7": {
                                System.out.println("***Start Pump***");
                                gp2.StartPump();
                                break;
                            }
                            case "8": {
                                System.out.println("***Pump Liter***");
                                gp2.PumpLiter();
                                break;
                            }
                            case "9": {
                                System.out.println("***Stop***");
                                gp2.Stop();
                                break;
                            }
                            case "10": {
                                System.out.println("***Print Receipt***");
                                gp2.Receipt();
                                break;
                            }
                            case "11": {
                                System.out.println("***No Receipt***");
                                gp2.NoReceipt();
                                break;
                            }
                            case "12": {
                                break;
                            }
                            default: {
                                System.out.println("Operation error! Please enter a valid operation");
                                break;
                            }
                        }
                    } 
                    System.out.println("Transaction finished!");
                }
            	else{
                    System.out.println("The gaspump you selected does not exist.");
                    System.exit(1);
            	} 
        
    }
}