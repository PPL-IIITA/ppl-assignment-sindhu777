
package pplssignment;

public class random {
    public int getRandomNumberInRange(int min, int max) {
		return (int)(Math.random() * ((max - min) + 1)) + min;
	}
    public float getRandomFNumberInRange(float min, float max) {
		return (float)(Math.random() * ((max - min) + 1)) + min;
	}
}
