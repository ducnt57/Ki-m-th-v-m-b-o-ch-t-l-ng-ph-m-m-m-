package baitaptuan1;

public class giaiphuongtrinhbac2{
	public String phuongtringB2(float a, float b, float c){		
		float x1, x2, x, delta=0;
		String thongbao= new String();
		delta= b*b-4*a*c;
		if(delta<0){
			thongbao= "Phương trình vô nghiệm !";
		}else if(delta==0){
			x= -b/(2*a);
			thongbao= "Phương trình có nghiệm kép x1 = x2= "+x;
		}else{
			x1= (float)(-b-Math.sqrt(delta))/(2*a);
			x2= (float)(-b+Math.sqrt(delta))/(2*a);
			thongbao= "Phương trình có 2 nghiệm phân biệt: x1= "+x1+" và x2= "+x2;
		}
		return thongbao;
	}
	public static void main(String [] args){
		giaiphuongtrinhbac2 pt2= new giaiphuongtrinhbac2();
		System.out.println(pt2.phuongtringB2(2, 3, -5));
		
	}
}
