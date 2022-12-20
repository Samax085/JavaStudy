package Homework_2;

public class Main_PensionFund {
    public static void main(String[] args) {
        Pension_Fund myFundGov = new Pension_Fund();

        final String date = myFundGov.date;
        myFundGov.nameFund = "Государственный пенсионный фонд";
        myFundGov.departmentStatus = false;
        myFundGov.maxSallary = 25000;
        myFundGov.minSallary = 15000;
        myFundGov.stageYear = 50;
        myFundGov.avaragePensInCountry = 1500;
        if (myFundGov.departmentStatus == true) {
            System.out.println(myFundGov.nameFund + "," + " Дата основания " + myFundGov.date);
            System.out.println("Ваша пенсия " + myFundGov.myPension());
        } else {
            System.out.println("Частный пенсионный фонд" + "," + " Дата основания " + myFundGov.date);
            System.out.println("Ваша пенсия " + myFundGov.myPension());
        }
    }
}
