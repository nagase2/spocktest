package abc;
/*
 * This Java source file was auto generated by running 'gradle buildInit --type java-library'
 * by 'yoshi' at '2/1/17 12:11 AM' with Gradle 2.14.1
 *
 * @author yoshi, @date 2/1/17 12:11 AM
 */
public class Library {
	private int value;
	
	public Library(int a){
		this.value = a;
	}
    public boolean someLibraryMethod() {
        return true;
    }
    public int someMethod1(){
    	return value;
    }
}
