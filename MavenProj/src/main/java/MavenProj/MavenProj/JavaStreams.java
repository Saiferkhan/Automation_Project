package MavenProj.MavenProj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import com.sun.tools.javac.code.Attribute.Array;

public class JavaStreams {

	public static void main(String[] args) {
		
	    
		//ArrayList<String> al =new ArrayList();
				//al.add("apple");
				//al.add("banana");
				//al.add("orange");
				//al.add("mango");
		//@Test
		//List<String> st = Stream.of("saifer","khan","tester","mawana");
		
		List<String> names =Arrays.asList("saifer","khan","tester","mawana","bawana");
		names.stream().filter(s->s.startsWith("b")).filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		Stream.of("apple","banana","orange","mango").sorted().forEach(s->System.out.println(s));
		
		List<Integer> value =Arrays.asList(2,5,8,4,1,0,5,3,1);
		value.stream().sorted(Comparator.reverseOrder()).distinct().
		forEach(s->System.out.println(s));
		
		
		System.out.println("less than 4 to print value");
		value.stream().filter(s->s<4).sorted().distinct().collect(Collectors.toList()).forEach(s->System.out.println(s));
		
		List<String> str = Arrays.asList("this","is","my","day");
		str.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));

	}

}
