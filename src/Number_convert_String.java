import java.util.Scanner;

public class Number_convert_String {
    public static void main(String[] args) {
        System.out.println("Nhập số  cần đọc");
        Scanner sc= new Scanner(System.in);
        int  number = sc.nextInt();
            String read = "";

            if(number>=0 && number <10) {
                switch (number) {
                    case 0:
                        read = "zero";
                    case 1:
                        read = "one";
                        break;
                    case 2:
                        read = "two";
                        break;
                    case 3:
                        read = "three";
                        break;
                    case 4:
                        read = "four";
                        break;
                    case 5:
                        read = "five";
                        break;
                    case 6:
                        read = "six";
                        break;
                    case 7:
                        read = "seven";
                        break;
                    case 8:
                        read = "eight";
                        break;
                    case 9:
                        read = "nine";
                        break;
                    default:
                        System.out.println("Out of ability");

                        System.out.println("Số cần đọc là " + read);

                }
            }

            if(number>=10 &&number<20){
               int  unit = number % 10 ;
                switch (unit){
                    case 0 :
                        read =" teen";
                        break;
                    case 1 :
                        read =" eleven";
                        break;
                    case 2 :
                        read =" twelve";
                        break;
                    case 3 :
                        read =" thirteen";
                        break;
                    case 4 :
                        read =" fourteen";
                        break;
                    case 5 :
                        read =" fiveteen";
                        break;
                    case 6 :
                        read =" sixteen";
                        break;
                    case 7 :
                        read =" seventeen";
                        break;
                    case 8 :
                        read =" eightteen";
                        break;
                    case 9 :
                        read =" nineteen";
                        break;
                    default:
                        System.out.println("out of abily");
                }
                System.out.println(read);


            }
            if(number>=20 &&number <100){
                 String read1 ="";
                if(number % 10 == 0){
                    int unit = number /10 ;
                    switch(unit){
                        case 2:
                            read1 ="twenty";
                            break;
                        case 3:
                            read1 ="thirty";
                            break;
                        case 4:
                            read1 ="forty";
                            break;
                        case 5:
                            read1 ="fivety";
                            break;
                        case 6:
                            read1 ="sixty";
                            break;
                        case 7:
                            read1 ="seventy";
                            break;
                        case 8:
                            read1 ="eighty";
                            break;
                        case 9:
                            read1 ="ninety";
                            break;

                    }
                }else {
                    int unit = number %10;
                    String read2 = "";
                    switch(unit){
                        case 1:



                    }

                }



            }
    }
}
