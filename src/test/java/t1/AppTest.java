package t1;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import p1.Add;
public class AppTest {
    @Test
    public void method() {
    	Add add=new Add();
    	int res=add.add(13, 12);
        assertEquals(res,25);
    }
    @Test
    public void method1() {
    	Add add=new Add();
    	int res=add.add(14, 12);
        assertEquals(res,26);
    }
    @Test
    public void method2() {
    	Add add=new Add();
    	int res=add.add(10, 12);
        assertEquals(res,22);
    }
    @Test
    public void method3() {
    	Add add=new Add();
    	int res=add.add(9, 12);
        assertEquals(res,21);
    }
}
