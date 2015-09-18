package baitaptuan1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testgiaiphuongtrinhbac2{
	@Test
	public void testGiaiphuongtrinh() {
		giaiphuongtrinhbac2 junit= new giaiphuongtrinhbac2();
		String result= junit.phuongtringB2(2, 3, -5);
		assertEquals("Phương trình vô nghiệm !", result);
	}

	

}
