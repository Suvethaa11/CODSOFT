import java.util.Scanner;
public class CODSOFT_task2
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Student Grade Calculator");
System.out.println("Enter no of Subjects");
int nS=sc.nextInt();
int total=0;
for(int i=0;i<nS;i++){
System.out.println("Enter marks obtained in "+(i+1)+": ");
int marks=sc.nextInt();
total+=marks;
}
double averP=(double) total/nS;
String Grade;
if(averP>=90){
Grade ="A+";
}
else if(averP>=80){
Grade="A";
}
else if(averP>=70) { 
    Grade="B+";
}
else if(averP>=60) { 
    Grade="B";
}
else if(averP>=50){ 
    Grade="C";
}
else if(averP>=40) {
     Grade= "D";
}
else{

Grade="F";}
System.out.println("Total Marks Scored is "+total);
System.out.println("Average Percentage Gained is "+averP+"%");
System.out.println("Grade: "+Grade);
}
}