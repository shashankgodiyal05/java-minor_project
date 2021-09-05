import java.util.Scanner;

public class distance_converter{

    public static void main (String args[]){

        while (true) {
            System.out.println("\n\n\n\t+---------------------------------------------------------------------------------+");
            System.out.println("\t|\tThis is a java application to convert Distance into different units.      |");
            System.out.println("\t+---------------------------------------------------------------------------------+");
            System.out.println("\t|\t\t1.  Convert 'mili meter' into 'centi meter'                       |");
            System.out.println("\t|\t\t2.  Convert 'centi meter' into 'mini meter'                       |");
            System.out.println("\t|\t\t3.  Convert 'centi meter' into 'inch'                             |");
            System.out.println("\t|\t\t4.  Convert 'inch' into 'centi meter'                             |");
            System.out.println("\t|\t\t5.  Convert 'centi meter' into 'deci meter'                       |");
            System.out.println("\t|\t\t6.  Convert 'deci meter' into 'centi meter'                       |");
            System.out.println("\t|\t\t7.  Convert 'deci meter' into 'meter'                             |");
            System.out.println("\t|\t\t8.  Convert 'meter' into 'decimeter'                              |");
            System.out.println("\t|\t\t9.  Convert 'meter' into 'kilo meter'                             |");
            System.out.println("\t|\t\t10. Convert 'Kilo meter' into 'meter'                             |");
            System.out.println("\t|\t\t11. Convert 'kilo meter' into 'mile'                              |");
            System.out.println("\t|\t\t12. Convert 'mile' into 'kilo meter'                              |");
            System.out.println("\t|\t\t13. Convert 'meter' into 'foot'                                   |");
            System.out.println("\t|\t\t14. Convert 'foot' into 'meter'                                   |");
            System.out.println("\t|\t\t15. Exit                                                          |");
            System.out.println("\t+---------------------------------------------------------------------------------+");
            System.out.println("\t|\tChoose the no of the opperation you want to do:-                          |");
            System.out.println("\t+---------------------------------------------------------------------------------+\n\n");
            Scanner sc = new Scanner (System.in);
            int choice = sc.nextInt();

            if(choice >15){
                System.out.println("\t\t!Invalid Choice of opperation");
            }
            else if(choice == 15){
                System.out.println("\nThanks for usig our application");
                break;
            }

            System.out.println("\t\tEnter the value you want to convert: ");
                float value = sc.nextFloat();

            float res = 0f;

            switch (choice) {
                case 1:
                
                    res = value / 10;
                    System.out.println("\t\t" + value + " mm is equals to " + res +" cm.");
                    break;

                case 2:

                    res = value * 10;
                    System.out.println("\t\t" + value + " cm is equals to " + res +" mm.");
                    break;

                case 3:
                
                    res = value / 2.5f;
                    System.out.println("\t\t" + value + " cm is equals to " + res + " inch.");
                    break;

                case 4:

                    res = value * 2.5f;
                    System.out.println("\t\t" + value + " inch is equals to " + res +" cm.");
                    break;

                case 5:
                
                    res = value / 10;
                    System.out.println("\t\t" + value + " cm is equals to " + res + " dm");
                    break;
            
                case 6:

                    res = value * 10;
                    System.out.println("\t\t" + value + " dm is equals to " + res +" cm.");
                    break;

                case 7:
                
                    res = value / 10;
                    System.out.println("\t\t" + value + " dm is equals to " + res + " mtr");
                    break;
            
                case 8:

                    res = value * 10;
                    System.out.println("\t\t" + value + " mtr is equals to " + res +" dm.");
                    break;

                case 9:
                
                    res = value / 1000;
                    System.out.println("\t\t" + value + " mtr is equals to " + res + " km");
                    break;    
            
                case 10:
                    
                    res = value * 1000;
                    System.out.println("\t\t" + value + " km is equals to " + res +" mtr.");
                    break;

                case 11:
                
                    res = value /1.60934f;
                    System.out.println("\t\t" + value + " km is equals to " + res + " mile");
                    break;
           
                case 12:
                
                    res = value * 1.60934f;
                    System.out.println("\t\t" + value + " mile is equals to " + res +" km.");
                    break;
                    
                case 13:
                
                    res = value /0.3048f;
                    System.out.println("\t\t" + value + " mtr is equals to " + res + " foot");
                    break;
                
                case 14:
                    
                    res = value * 0.3048f;
                    System.out.println("\t\t" + value + " foot is equals to " + res + " mtr");
                    break;
                
                case 15:
					
					break;

                default:

                
                    break;
            }
        }
    }
}
