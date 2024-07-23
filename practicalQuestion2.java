import java.util.Scanner;

public class practicalQuestion2 {
    public static void main(String[] args) {

        Scanner keyinput = new Scanner(System.in);

        int menu;
        int count;
        int rowCount = -1;
        int[][] table;

        System.out.println("\nEnter No of Students in the class");
        count = keyinput.nextInt();

        table = new int[count][4];

        do {
            System.out.println("\nMenu : \n1. Enter Marks of a Student");
            System.out.println("2. Update Marks of a Student");
            System.out.println("3. View Average Marks of a Subject");
            System.out.println("4. View Average Marks of a Student");
            System.out.println("5. Get Total Marks of a Student");
            System.out.println("6. Print Table");
            System.out.println("7. Display Grades Table");
            System.out.println("8. Exit Program");

            System.out.println("\nEnter Your Choice:");
            menu = keyinput.nextInt();

            int condition = 0;
            int stdRow = -1;
            int subChoice;
            int stID;
            int subID;
            int maths;
            int chem;
            int phys;

            switch (menu) {
                case 1:
                    if (rowCount >= (count - 1)) {
                        System.out.println("\nMarks of all Students are Entered !!!");
                        break;
                    }
                    rowCount++;

                    condition = 0;
                    stID = 0;
                    maths = 0;
                    chem = 0;
                    phys = 0;

                    do {
                        System.out.println("Enter Student ID:");
                        stID = keyinput.nextInt();

                        stdRow = -1;

                        for (int i = 0; i <= rowCount; i++) {
                            if (table[i][0] == stID) {
                                stdRow = i;
                                break;
                            }
                        }

                        if (stID < 1 || stdRow != -1) {
                            System.out.println("\nInvalid Student ID !!!\n");
                            condition = 0;
                            continue;
                        }

                        System.out.println("Enter Marks for Mathematics:");
                        maths = keyinput.nextInt();

                        if (maths < 1 || maths > 100) {
                            System.out.println("\nInvalid Mark !!!\n");
                            condition = 0;
                            continue;
                        }

                        System.out.println("Enter Marks for Chemistry :");
                        chem = keyinput.nextInt();

                        if (chem < 1 || chem > 100) {
                            System.out.println("\nInvalid Mark !!!\n");
                            condition = 0;
                            continue;
                        }

                        System.out.println("Enter Marks for Physics :");
                        phys = keyinput.nextInt();

                        if (phys < 1 || phys > 100) {
                            System.out.println("\nInvalid Mark !!!\n");
                            condition = 0;
                            continue;
                        }

                        table[rowCount][0] = stID;
                        table[rowCount][1] = maths;
                        table[rowCount][2] = chem;
                        table[rowCount][3] = phys;

                        condition = 1;

                    } while (condition == 0);

                    System.out.printf("\nMarks of the Student %d are entered successfully.\n", stID);
                    System.out.printf("\nMarks for Mathematics is %d", maths);
                    System.out.printf("\nMarks for Chemistry is %d", chem);
                    System.out.printf("\nMarks for Physics is %d\n", phys);
                    System.out.printf("\nTotal Marks of the Student is %d", (maths + chem + phys));
                    System.out.printf("\nAverage Marks of the Student is %d\n", (maths + chem + phys) / 3);

                    break;

                case 2:
                    condition = 0;
                    stdRow = -1;
                    subChoice = 0;
                    stID = 0;
                    maths = 0;
                    chem = 0;
                    phys = 0;

                    do {
                        System.out.println("Enter the Student ID:");
                        stID = keyinput.nextInt();

                        for (int i = 0; i <= rowCount; i++) {
                            if (table[i][0] == stID) {
                                stdRow = i;
                                break;
                            }
                        }

                        if (stID < 1 || stdRow == -1) {
                            System.out.println("\nInvalid Student ID !!!\n");
                            condition = 0;
                            continue;
                        }

                        do {
                            System.out.println("\nSubject Choice: ");
                            System.out.printf("1. Maths - %d\n", table[stdRow][1]);
                            System.out.printf("2. Chemistry - %d\n", table[stdRow][2]);
                            System.out.printf("3. Physics - %d\n", table[stdRow][3]);
                            System.out.println("4. Enter this choice to complete update.");

                            System.out.println("\nEnter the Subject ID");
                            subID = keyinput.nextInt();

                            switch (subID) {
                                case 1:
                                    System.out.println("Enter Marks for Mathematics:");
                                    maths = keyinput.nextInt();

                                    if (maths < 1 || maths > 100) {
                                        System.out.println("\nInvalid Mark !!!\n");
                                    } else {
                                        table[stdRow][1] = maths;
                                        System.out.printf("\nUpdated Marks for Mathematics is %d\n", table[stdRow][1]);
                                    }
                                    break;

                                case 2:
                                    System.out.println("Enter Marks for Chemistry :");
                                    chem = keyinput.nextInt();

                                    if (chem < 1 || chem > 100) {
                                        System.out.println("\nInvalid Mark !!!\n");
                                    } else {
                                        table[stdRow][2] = chem;
                                        System.out.printf("\nUpdated Marks for Chemistry is %d\n", table[stdRow][2]);
                                    }
                                    break;

                                case 3:
                                    System.out.println("Enter Marks for Physics :");
                                    phys = keyinput.nextInt();

                                    if (phys < 1 || phys > 100) {
                                        System.out.println("\nInvalid Mark !!!\n");
                                    } else {
                                        table[stdRow][3] = phys;
                                        System.out.printf("\nUpdated Marks for Physics is %d\n", table[stdRow][3]);
                                    }
                                    break;

                                case 4:
                                    subChoice = 1;
                                    break;

                                default:
                                    System.out.println("\nInvalid Choice !!!\n");
                                    break;
                            }
                        } while (subChoice == 0);

                        condition = 1;

                    } while (condition == 0);

                    System.out.printf("\nMarks of the Student %d are updated successfully.\n", stID);
                    System.out.printf("\nMarks for Mathematics is %d", table[stdRow][1]);
                    System.out.printf("\nMarks for Chemistry is %d", table[stdRow][2]);
                    System.out.printf("\nMarks for Physics is %d\n", table[stdRow][3]);
                    System.out.printf("\n\nTotal Marks of the Student is %d",
                            (table[stdRow][1] + table[stdRow][2] + table[stdRow][3]));
                    System.out.printf("\n\nAverage Marks of the Student is %d\n",
                            (table[stdRow][1] + table[stdRow][2] + table[stdRow][3]) / 3);

                    break;

                case 3:
                    subChoice = 0;
                    subID = 0;

                    do {
                        System.out.println("Choice: ");
                        System.out.println("1. Maths");
                        System.out.println("2. Chemistry");
                        System.out.println("3. Physics");

                        System.out.println("\nEnter the Subject");
                        subID = keyinput.nextInt();

                        if (subID < 1 || subID > 3) {
                            System.out.println("\nInvalid Subject ID !!!\n");
                            continue;
                        }

                        int subTotal = 0;
                        int stdCount = rowCount + 1;

                        for (int i = 0; i < rowCount; i++) {
                            subTotal = subTotal + table[i][subID];
                        }

                        switch (subID) {
                            case 1:
                                System.out.printf("\nAverage Marks of Mathematics is %d\n", (subTotal / stdCount));
                                break;

                            case 2:
                                System.out.printf("\nAverage Marks of Chemistry is %d\n", (subTotal / stdCount));
                                break;

                            case 3:
                                System.out.printf("\nAverage Marks of Physics is %d\n", (subTotal / stdCount));
                                break;

                            default:
                                System.out.println("\nInvalid Subject ID !!!\n");
                                break;
                        }

                        subChoice = 1;

                    } while (subChoice == 0);

                    break;

                case 4:
                    condition = 0;
                    stdRow = -1;
                    stID = 0;

                    do {
                        System.out.println("Enter the Student ID:");
                        stID = keyinput.nextInt();

                        for (int i = 0; i <= rowCount; i++) {
                            if (table[i][0] == stID) {
                                stdRow = i;
                                break;
                            }
                        }

                        if (stID < 1 || stdRow == -1) {
                            System.out.println("\nInvalid Student ID !!!\n");
                            condition = 0;
                            continue;
                        }
                        condition = 1;

                    } while (condition == 0);

                    System.out.printf("\n\nAverage Marks of the Student %d is %d\n", stID,
                            (table[stdRow][1] + table[stdRow][2] + table[stdRow][3]) / 3);

                    break;

                case 5:
                    condition = 0;
                    stdRow = -1;
                    stID = 0;

                    do {
                        System.out.println("Enter the Student ID:");
                        stID = keyinput.nextInt();

                        for (int i = 0; i <= rowCount; i++) {
                            if (table[i][0] == stID) {
                                stdRow = i;
                                break;
                            }
                        }

                        if (stID < 1 || stdRow == -1) {
                            System.out.println("\nInvalid Student ID !!!\n");
                            condition = 0;
                            continue;
                        }
                        condition = 1;

                    } while (condition == 0);

                    System.out.printf("\n\nTotal Marks of the Student %d is %d\n", stID,
                            (table[stdRow][1] + table[stdRow][2] + table[stdRow][3]));

                    break;

                case 6:
                    System.out.println("\n|----StdID----|---Mathematics---|---Chemistry---|---Physics---|");

                    for (int i = 0; i <= rowCount; i++) {
                        System.out.printf("      %d               %d               %d             %d      \n",
                                table[i][0],
                                table[i][1],
                                table[i][2], table[i][3]);
                    }
                    System.out.println("\n");
                    break;

                case 7:
                    String sub1 = "";
                    String sub2 = "";
                    String sub3 = "";

                    System.out.println("\n|----StdID----|---Mathematics---|---Chemistry---|---Physics---|");

                    for (int i = 0; i <= rowCount; i++) {

                        if (table[i][1] >= 90) {
                            sub1 = "A";
                        } else if (table[i][1] >= 80 && table[i][1] <= 89) {
                            sub1 = "B";
                        } else if (table[i][1] >= 70 && table[i][1] <= 79) {
                            sub1 = "C";
                        } else if (table[i][1] >= 60 && table[i][1] <= 69) {
                            sub1 = "D";
                        } else if (table[i][1] < 60) {
                            sub1 = "Fail";
                        }

                        if (table[i][2] >= 90) {
                            sub2 = "A";
                        } else if (table[i][2] >= 80 && table[i][2] <= 89) {
                            sub2 = "B";
                        } else if (table[i][2] >= 70 && table[i][2] <= 79) {
                            sub2 = "C";
                        } else if (table[i][2] >= 60 && table[i][2] <= 69) {
                            sub2 = "D";
                        } else if (table[i][2] < 60) {
                            sub2 = "Fail";
                        }

                        if (table[i][3] >= 90) {
                            sub3 = "A";
                        } else if (table[i][3] >= 80 && table[i][3] <= 89) {
                            sub2 = "B";
                        } else if (table[i][3] >= 70 && table[i][3] <= 79) {
                            sub3 = "C";
                        } else if (table[i][3] >= 60 && table[i][3] <= 69) {
                            sub3 = "D";
                        } else if (table[i][3] < 60) {
                            sub3 = "Fail";
                        }

                        System.out.printf("      %d               %s               %s             %s      \n",
                                table[i][0],
                                sub1,
                                sub2, sub3);
                    }

                    System.out.println("\n");
                    break;

                case 8:
                    System.out.println("\nExit...\n");
                    break;

                default:
                    System.out.println("\nInvalid Menu Choice !!!\n");
                    break;
            }

        } while (menu != 8);

        keyinput.close();

    }

}
