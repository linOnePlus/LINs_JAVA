package random;

import java.util.Random;

public class random {
public static void main(String[] args) {
	Random r = new Random();
	System.out.println(r.nextInt());
	Random z = new Random(21);
	System.out.println(z.nextInt(100));//[0-100)������������� ������н����ͬ
}

}

