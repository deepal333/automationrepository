package functions;

public class patients
{

	public static void main(String[] args) 
	{
		Hospital hospital1=new Hospital();
		
		hospital1.hospitalname="Nobel";
		hospital1.patienttype="bone injury";
		hospital1.speciality="Orthopedic";
		hospital1.doctorsname="Dr.Sharma";
		hospital1.numOfbed=300;
		hospital1.numOfdoctors=10;
		hospital1.treatment();
		hospital1.capacity();
		
		
		Hospital hospital2=new Hospital();
		
		hospital2.hospitalname="Columbia Asia";
		hospital2.patienttype="Cancer";
		hospital2.speciality="Oncologist";
		hospital2.doctorsname="Dr.Batra";
		hospital2.numOfbed=50;
		hospital2.numOfdoctors=5;
		hospital2.treatment();
		hospital2.capacity();
		
		Hospital hospital3=new Hospital("Tooth Ache","Manohar","Dentist",1000,100,"City Hospital");
		hospital3.treatment();
		hospital3.capacity();
		
	
	
	}
		
	}


