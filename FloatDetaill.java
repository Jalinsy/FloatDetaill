public class FloatDetaill {
	public static void main(String[] args) {
		
		//java的浮点型常量（具体值）默认为double型，声明float型常量必须加‘f’或‘F’
		float n1 = 1.1F;
		double n2 = 1.1;
		double n3 = 1.1F;
		
	    //十进制数形式如: 3.24     324.0F     .324 (必须有小数点)
		double n5 = .324;
		System.out.println(n5);
		
		//科学计数法形式如: 3.24e2（3.24 * 10的2次方） 3.24E	-2（3.24 / 10的2次方）
		System.out.println(3.24e2);
		System.out.println(3.24E-2);
		
		
		//通常情况下，应该使用double型，应为它比float更精准
		//（举例说明）:
		double n9 = 1.12345678324;
		float n10 = 1.12345678324F;
		System.out.println(n9);
		System.out.println(n10);
	}
}