package ExerciciosPropostos.Entitites;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade(){
        return grade1  + grade2  + grade3 ;
    }

    public void pass(){
        if (finalGrade() > 60){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", (60 - finalGrade()));
        }

    }


}
