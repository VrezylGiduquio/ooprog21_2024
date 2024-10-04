public class TestBloodData{
   public static void main(String[] args)

{
   BloodData patient = new BloodData();
      patient.displayBloodInfo();
      
      patient.setBloodType("AB");
      patient.setRhFactor("-");
      patient.displayBloodInfo();
      
      patient.defaultPatient();
      patient.displayBloodInfo();
      
      }   
}