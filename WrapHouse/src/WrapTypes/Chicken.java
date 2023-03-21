package WrapTypes;

public class Chicken extends Wrap{

	public Chicken () {
		description = "Chicken Wrap";
	}
	
	@Override
	public double cost() {
		return 2.49;
	}

}