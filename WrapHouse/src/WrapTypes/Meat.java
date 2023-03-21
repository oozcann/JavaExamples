package WrapTypes;

public class Meat extends Wrap{

	public Meat () {
		description = "Meat Wrap";
	}
	
	@Override
	public double cost() {
		return 2.99;
	}

}