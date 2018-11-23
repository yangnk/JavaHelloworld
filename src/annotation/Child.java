package annotation;

/**
 * Created by yangnk23900 on 2018/11/23.
 */
@Description(desc = "this is a desc", author = "yangyang", age = 22)
public class Child implements  People{
	@Override
	@Description(desc="i am Color",author="boy",age=18)
	public String name() {
		return null;
	}

	@Override
	public int age() {
		return 0;
	}

	@Override
	public void work() {

	}
}
