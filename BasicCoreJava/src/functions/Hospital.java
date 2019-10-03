package functions;

public class Hospital 
{
		public String patienttype;
		public String doctorsname;
		public String speciality;
		public int numOfbed;
		public int numOfdoctors;
		public String hospitalname;
		
		
		
		public void treatment()
		{
			System.out.println("Patient with the "+patienttype+" will be sent to the "+speciality+" doctor "+doctorsname+"");
		}
		
		public void capacity()
		{
			System.out.println(hospitalname+" hospital has "+numOfbed+" beds and "+numOfdoctors+" doctors");
		}
		
		//Default constructor
		public Hospital()
		{
			
		}
		//Parametric Constructor
		public Hospital(String patienttype,String doctorsname,String speciality,int numOfbed,int numOfdoctors,String hospitalname)
		{
			this.patienttype=patienttype;
			this.doctorsname=doctorsname;
			this.speciality=speciality;
			this.numOfbed=numOfbed;
			this.numOfdoctors=numOfdoctors;
			this.hospitalname=hospitalname;
			
		}
}
