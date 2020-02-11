/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 */

package fruit1;
/***
 * An Abstract class upon which we will build fruits
 * @author nicomp
 *
 */
public abstract class Fruit1 {
	private int weight;
	private float cost;
	public Fruit1(int weight, float cost) {
		setWeight(weight);
		setCost(cost);
	}
	public String toString() {
		return ("Weight = " + getWeight() + " Cost = " + getCost());
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
}
