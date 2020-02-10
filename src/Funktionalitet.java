package lektion22;

public class Funktionalitet implements IFunktionalitet {

    Data data = new Data();


    @Override
    public double getBMI(String cpr) {
       double bmi;
       bmi = data.getVaegt(cpr) / (data.getHoejde(cpr) * (data.getHoejde(cpr)));
       return bmi;
    }

    @Override
    public String getTextualBMI(String cpr) {
        double bmi;
        bmi = data.getVaegt(cpr) / (data.getHoejde(cpr) * (data.getHoejde(cpr)));
        if (bmi < 18.5){
            return "You are skinny";
        }
        if (18.5 <= bmi && bmi < 25){
            return "your weight is ok";
        }
        if (25 <= bmi && bmi <= 30){
            return "you are fat";
        }else{
            return "you are very fat";
        }

    }

    @Override
    public String getNavn(String cpr) {
        return data.getNavn(cpr);
    }
}
