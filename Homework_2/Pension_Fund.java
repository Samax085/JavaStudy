package Homework_2;

public class Pension_Fund {
    private final double coefficient = 0.02;
    String nameFund;
    boolean departmentStatus;

     final String date = "1992.08.24";
    int stageYear;
    int maxSallary;
    int minSallary;
    double avaragePensInCountry;

    public Pension_Fund(){

    }
public double myPension(){
    return goverment_Util();
}
    private double goverment_Util() {
        if (departmentStatus == false) {
            double notGovAvaragePens = maxSallary + minSallary + avaragePensInCountry;
            double pension = notGovAvaragePens / 3;
            return pension * coefficient * stageYear;
        }
        else {
            int govAvaragePens = maxSallary + minSallary;
            double govPension = govAvaragePens / 2;
            return govPension * coefficient * stageYear;
        }
    }

}




