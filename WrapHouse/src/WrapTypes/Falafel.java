package WrapTypes;

public class Falafel extends Wrap{

	public Falafel () {
		description = "Falafel Wrap";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}