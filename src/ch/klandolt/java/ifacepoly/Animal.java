package ch.klandolt.java.ifacepoly;

public abstract class Animal implements IAnimal {
	
	/* (non-Javadoc)
	 * @see ch.klandolt.java.ifacepoly.IAnimal#speak()
	 */
	@Override
	public abstract void speak();
	
	
	/* (non-Javadoc)
	 * @see ch.klandolt.java.ifacepoly.IAnimal#toString()
	 */
	@Override
	public abstract String toString();

}
