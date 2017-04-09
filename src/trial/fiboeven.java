package trial;

public class fiboeven {
	int b = 1;
	int c = 2, d;
	int total = 0;
	while(c < 4000000) {
	    total += c;
	    d = b+(c<<0x01);
	    c = d+b+c;
	    b = d;
	}
	System.out.println(sum);
}
}