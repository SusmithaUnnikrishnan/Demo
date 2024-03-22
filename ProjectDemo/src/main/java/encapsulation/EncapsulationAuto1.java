package encapsulation;

public class EncapsulationAuto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationAuto obj=new EncapsulationAuto();
		obj.setRollNo(10);
		obj.setCollegeName("gec");
		obj.setCourse("BTech");
		System.out.println(obj.getRollNo());//since the values are returned, the getter should be given inside print statement
		System.out.println(obj.getCollegeName());
		System.out.println(obj.getCourse());
	}

}
