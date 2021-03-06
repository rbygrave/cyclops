package com.aol.cyclops.lambda.tuple;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.Date;
import java.util.Arrays;

import org.junit.Test;
public class TuplesTest {
	
	Date date = new Date();
	
	@Test
	public void testTuple1(){
		assertThat(PTuple1.of("hello")._1(),equalTo("hello"));
	}
	@Test
	public void testTuplev1(){
		assertThat(PTuple1.of("hello").v1(),equalTo("hello"));
	}
	@Test
	public void testTupleget1(){
		assertThat(PTuple1.of("hello").getT1(),equalTo("hello"));
	}
	@Test
	public void testTupleget1s(){
		assertThat(PowerTuples.tuple("hello").getT1(),equalTo("hello"));
	}
	@Test
	public void testTuple1List(){
		assertThat(PTuple1.ofTuple(Arrays.asList("hello")).getT1(),equalTo("hello"));
	}
	@Test
	public void testTuple2(){
		assertThat(PTuple2.of("hello",10)._2(),equalTo(10));
	}
	@Test
	public void testTuplev2(){
		assertThat(PTuple2.of("hello",10).v2(),equalTo(10));
	}
	@Test
	public void testTupleget2(){
		assertThat(PTuple2.of("hello",10).getT2(),equalTo(10));
	}
	@Test
	public void testTupleget2s(){
		assertThat(PowerTuples.tuple("hello",10).getT2(),equalTo(10));
	}
	@Test
	public void testTuple2List(){
		assertThat(PTuple2.ofTuple(Arrays.asList("hello",10)).getT2(),equalTo(10));
	}
	
	@Test
	public void testTuple3(){
		assertThat(PTuple3.of("hello",10,date)._3(),equalTo(date));
	}
	@Test
	public void testTuplev3(){
		assertThat(PTuple3.of("hello",10,date).v3(),equalTo(date));
	}
	@Test
	public void testTupleget3(){
		assertThat(PTuple3.of("hello",10,date).getT3(),equalTo(date));
	}
	@Test
	public void testTupleget3s(){
		assertThat(PowerTuples.tuple("hello",10,date).getT3(),equalTo(date));
	}
	@Test
	public void testTuple3List(){
		assertThat(PTuple3.ofTuple(Arrays.asList("hello",10,date)).getT3(),equalTo(date));
	}
	
	@Test
	public void testTuple4(){
		assertThat(PTuple4.of("hello",10,date,"world")._4(),equalTo("world"));
	}
	@Test
	public void testTuplev4(){
		assertThat(PTuple4.of("hello",10,date,"world").v4(),equalTo("world"));
	}
	@Test
	public void testTupleget4(){
		assertThat(PTuple4.of("hello",10,date,"world").getT4(),equalTo("world"));
	}
	@Test
	public void testTupleget4s(){
		assertThat(PowerTuples.tuple("hello",10,date,"world").getT4(),equalTo("world"));
	}
	@Test
	public void testTuple4List(){
		assertThat(PTuple4.ofTuple(Arrays.asList("hello",10,date,"world")).getT4(),equalTo("world"));
	}
	@Test
	public void testTuple5(){
		assertThat(PTuple5.of("hello",10,date,"world",20)._5(),equalTo(20));
	}
	@Test
	public void testTuplev5(){
		assertThat(PTuple5.of("hello",10,date,"world",20).v5(),equalTo(20));
	}
	@Test
	public void testTupleget5(){
		assertThat(PTuple5.of("hello",10,date,"world",20).getT5(),equalTo(20));
	}
	@Test
	public void testTupleget5s(){
		assertThat(PowerTuples.tuple("hello",10,date,"world",20).getT5(),equalTo(20));
	}
	@Test
	public void testTuple5List(){
		assertThat(PTuple5.ofTuple(Arrays.asList("hello",10,date,"world",20)).getT5(),equalTo(20));
	}
	
	@Test
	public void testTuple6(){
		assertThat(PTuple6.of("hello",10,date,"world",20,100l)._6(),equalTo(100l));
	}
	@Test
	public void testTuplev6(){
		assertThat(PTuple6.of("hello",10,date,"world",20,100l).v6(),equalTo(100l));
	}
	@Test
	public void testTupleget6(){
		assertThat(PTuple6.of("hello",10,date,"world",20,100l).getT6(),equalTo(100l));
	}
	@Test
	public void testTupleget6s(){
		assertThat(PowerTuples.tuple("hello",10,date,"world",20,100l).getT6(),equalTo(100l));
	}
	@Test
	public void testTuple6List(){
		assertThat(PTuple6.ofTuple(Arrays.asList("hello",10,date,"world",20,100l)).getT6(),equalTo(100l));
	}
	
	//t7
	@Test
	public void testTuple7(){
		PTuple7.of("hello",10,date,"world",20,100l,"woo");
		assertThat(PTuple7.of("hello",10,date,"world",20,100l,"woo")._7(),equalTo("woo"));
	}
	@Test
	public void testTuplev7(){
		assertThat(PTuple7.of("hello",10,date,"world",20,100l,"woo").v7(),equalTo("woo"));
	}
	@Test
	public void testTupleget7(){
		assertThat(PTuple7.of("hello",10,date,"world",20,100l,"woo").getT7(),equalTo("woo"));
	}
	@Test
	public void testTupleget7s(){
		assertThat(PowerTuples.tuple("hello",10,date,"world",20,100l,"woo").getT7(),equalTo("woo"));
	}
	@Test
	public void testTuple7List(){
		assertThat(PTuple7.ofTuple(Arrays.asList("hello",10,date,"world",20,100l,"woo")).getT7(),equalTo("woo"));
	}
	//t8
		@Test
		public void testTuple8(){
			assertThat(PTuple8.of("hello",10,date,"world",20,100l,"woo",8)._8(),equalTo(8));
		}
		@Test
		public void testTuplev8(){
			assertThat(PTuple8.of("hello",10,date,"world",20,100l,"woo",8).v8(),equalTo(8));
		}
		@Test
		public void testTupleget8(){
			assertThat(PTuple8.of("hello",10,date,"world",20,100l,"woo",8).getT8(),equalTo(8));
		}
		@Test
		public void testTupleget8s(){
			assertThat(PowerTuples.tuple("hello",10,date,"world",20,100l,"woo",8).getT8(),equalTo(8));
		}
		@Test
		public void testTuple8List(){
			assertThat(PTuple8.ofTuple(Arrays.asList("hello",10,date,"world",20,100l,"woo",8)).getT8(),equalTo(8));
		}
	
}
